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
  
  @scala.inline
  def apply(): ButtonsApiExportInfoParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonsApiExportInfoParameter]
  }
  
  @scala.inline
  implicit class ButtonsApiExportInfoParameterMutableBuilder[Self <: ButtonsApiExportInfoParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtension(value: String | js.Function0[String]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionFunction0(value: () => String): Self = StObject.set(x, "extension", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    @scala.inline
    def setFilename(value: String | js.Function0[String]): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilenameFunction0(value: () => String): Self = StObject.set(x, "filename", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    @scala.inline
    def setMessageBottom(value: String | js.Function0[String]): Self = StObject.set(x, "messageBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageBottomFunction0(value: () => String): Self = StObject.set(x, "messageBottom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMessageBottomNull: Self = StObject.set(x, "messageBottom", null)
    
    @scala.inline
    def setMessageBottomUndefined: Self = StObject.set(x, "messageBottom", js.undefined)
    
    @scala.inline
    def setMessageTop(value: String | js.Function0[String]): Self = StObject.set(x, "messageTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTopFunction0(value: () => String): Self = StObject.set(x, "messageTop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMessageTopNull: Self = StObject.set(x, "messageTop", null)
    
    @scala.inline
    def setMessageTopUndefined: Self = StObject.set(x, "messageTop", js.undefined)
    
    @scala.inline
    def setTitle(value: String | js.Function0[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleFunction0(value: () => String): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTitleNull: Self = StObject.set(x, "title", null)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
