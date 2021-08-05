package typings.datatablesNetButtons.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonsApiExportInfoParameter extends StObject {
  
  var `extension`: js.UndefOr[String | js.Function0[String]] = js.undefined
  
  var filename: js.UndefOr[String | js.Function0[String]] = js.undefined
  
  var messageBottom: js.UndefOr[Null | String | js.Function0[String]] = js.undefined
  
  var messageTop: js.UndefOr[Null | String | js.Function0[String]] = js.undefined
  
  var title: js.UndefOr[Null | String | js.Function0[String]] = js.undefined
}
object ButtonsApiExportInfoParameter {
  
  inline def apply(): ButtonsApiExportInfoParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonsApiExportInfoParameter]
  }
  
  extension [Self <: ButtonsApiExportInfoParameter](x: Self) {
    
    inline def setExtension(value: String | js.Function0[String]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionFunction0(value: () => String): Self = StObject.set(x, "extension", js.Any.fromFunction0(value))
    
    inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    inline def setFilename(value: String | js.Function0[String]): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameFunction0(value: () => String): Self = StObject.set(x, "filename", js.Any.fromFunction0(value))
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setMessageBottom(value: String | js.Function0[String]): Self = StObject.set(x, "messageBottom", value.asInstanceOf[js.Any])
    
    inline def setMessageBottomFunction0(value: () => String): Self = StObject.set(x, "messageBottom", js.Any.fromFunction0(value))
    
    inline def setMessageBottomNull: Self = StObject.set(x, "messageBottom", null)
    
    inline def setMessageBottomUndefined: Self = StObject.set(x, "messageBottom", js.undefined)
    
    inline def setMessageTop(value: String | js.Function0[String]): Self = StObject.set(x, "messageTop", value.asInstanceOf[js.Any])
    
    inline def setMessageTopFunction0(value: () => String): Self = StObject.set(x, "messageTop", js.Any.fromFunction0(value))
    
    inline def setMessageTopNull: Self = StObject.set(x, "messageTop", null)
    
    inline def setMessageTopUndefined: Self = StObject.set(x, "messageTop", js.undefined)
    
    inline def setTitle(value: String | js.Function0[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleFunction0(value: () => String): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
