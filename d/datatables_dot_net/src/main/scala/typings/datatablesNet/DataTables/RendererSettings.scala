package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion "colunm-settings"
//#region "other-settings"
trait RendererSettings extends StObject {
  
  var header: js.UndefOr[String] = js.undefined
  
  var pageButton: js.UndefOr[String] = js.undefined
}
object RendererSettings {
  
  inline def apply(): RendererSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RendererSettings]
  }
  
  extension [Self <: RendererSettings](x: Self) {
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setPageButton(value: String): Self = StObject.set(x, "pageButton", value.asInstanceOf[js.Any])
    
    inline def setPageButtonUndefined: Self = StObject.set(x, "pageButton", js.undefined)
  }
}
