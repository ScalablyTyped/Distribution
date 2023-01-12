package typings.datatablesNetButtons.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonsApiExportInfoReturn extends StObject {
  
  var filename: String
  
  var messageBottom: String
  
  var messageTop: String
  
  var title: String
}
object ButtonsApiExportInfoReturn {
  
  inline def apply(filename: String, messageBottom: String, messageTop: String, title: String): ButtonsApiExportInfoReturn = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], messageBottom = messageBottom.asInstanceOf[js.Any], messageTop = messageTop.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonsApiExportInfoReturn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ButtonsApiExportInfoReturn] (val x: Self) extends AnyVal {
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setMessageBottom(value: String): Self = StObject.set(x, "messageBottom", value.asInstanceOf[js.Any])
    
    inline def setMessageTop(value: String): Self = StObject.set(x, "messageTop", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
