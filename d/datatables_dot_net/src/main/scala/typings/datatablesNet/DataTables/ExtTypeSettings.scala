package typings.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion "ext internal"
@js.native
trait ExtTypeSettings extends js.Object {
  /**
    * Type detection functions for plug-in development.
    *
    * @see https://datatables.net/manual/plug-ins/type-detection
    */
  var detect: js.Array[FunctionExtTypeSettingsDetect] = js.native
  /**
    * Type based ordering functions for plug-in development.
    *
    * @see https://datatables.net/manual/plug-ins/sorting
    * @default {}
    */
  var order: js.Object = js.native
  /**
    * Type based search formatting for plug-in development.
    *
    * @default {}
    * @example
    *   $.fn.dataTable.ext.type.search['title-numeric'] = function ( d ) {
    *     return d.replace(/\n/g," ").replace( /<.*?>/g, "" );
    *   }
    */
  var search: js.Object = js.native
}

object ExtTypeSettings {
  @scala.inline
  def apply(detect: js.Array[FunctionExtTypeSettingsDetect], order: js.Object, search: js.Object): ExtTypeSettings = {
    val __obj = js.Dynamic.literal(detect = detect.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtTypeSettings]
  }
  @scala.inline
  implicit class ExtTypeSettingsOps[Self <: ExtTypeSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDetectVarargs(value: FunctionExtTypeSettingsDetect*): Self = this.set("detect", js.Array(value :_*))
    @scala.inline
    def setDetect(value: js.Array[FunctionExtTypeSettingsDetect]): Self = this.set("detect", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrder(value: js.Object): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearch(value: js.Object): Self = this.set("search", value.asInstanceOf[js.Any])
  }
  
}

