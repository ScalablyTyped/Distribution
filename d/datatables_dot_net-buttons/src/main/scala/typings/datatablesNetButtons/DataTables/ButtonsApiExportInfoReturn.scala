package typings.datatablesNetButtons.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonsApiExportInfoReturn extends StObject {
  
  var filename: String = js.native
  
  var messageBottom: String = js.native
  
  var messageTop: String = js.native
  
  var title: String = js.native
}
object ButtonsApiExportInfoReturn {
  
  @scala.inline
  def apply(filename: String, messageBottom: String, messageTop: String, title: String): ButtonsApiExportInfoReturn = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], messageBottom = messageBottom.asInstanceOf[js.Any], messageTop = messageTop.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonsApiExportInfoReturn]
  }
  
  @scala.inline
  implicit class ButtonsApiExportInfoReturnMutableBuilder[Self <: ButtonsApiExportInfoReturn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageBottom(value: String): Self = StObject.set(x, "messageBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTop(value: String): Self = StObject.set(x, "messageTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
