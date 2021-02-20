package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion "colunm-settings"
//#region "other-settings"
@js.native
trait RendererSettings extends StObject {
  
  var header: js.UndefOr[String] = js.native
  
  var pageButton: js.UndefOr[String] = js.native
}
object RendererSettings {
  
  @scala.inline
  def apply(): RendererSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RendererSettings]
  }
  
  @scala.inline
  implicit class RendererSettingsMutableBuilder[Self <: RendererSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setPageButton(value: String): Self = StObject.set(x, "pageButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageButtonUndefined: Self = StObject.set(x, "pageButton", js.undefined)
  }
}
