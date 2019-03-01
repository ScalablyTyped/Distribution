package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion "colunm-settings"
//#region "other-settings"
trait RendererSettings extends js.Object {
  var header: js.UndefOr[java.lang.String] = js.undefined
  var pageButton: js.UndefOr[java.lang.String] = js.undefined
}

object RendererSettings {
  @scala.inline
  def apply(header: java.lang.String = null, pageButton: java.lang.String = null): RendererSettings = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header)
    if (pageButton != null) __obj.updateDynamic("pageButton")(pageButton)
    __obj.asInstanceOf[RendererSettings]
  }
}

