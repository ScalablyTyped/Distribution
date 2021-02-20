package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion "ext internal"
@js.native
trait ExtTypeSettings extends StObject {
  
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
  implicit class ExtTypeSettingsMutableBuilder[Self <: ExtTypeSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetect(value: js.Array[FunctionExtTypeSettingsDetect]): Self = StObject.set(x, "detect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectVarargs(value: FunctionExtTypeSettingsDetect*): Self = StObject.set(x, "detect", js.Array(value :_*))
    
    @scala.inline
    def setOrder(value: js.Object): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch(value: js.Object): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
  }
}
