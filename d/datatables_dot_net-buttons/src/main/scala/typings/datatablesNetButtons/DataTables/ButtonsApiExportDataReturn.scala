package typings.datatablesNetButtons.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonsApiExportDataReturn extends StObject {
  
  var body: js.Array[String]
  
  var footer: js.Array[String]
  
  var header: js.Array[String]
}
object ButtonsApiExportDataReturn {
  
  inline def apply(body: js.Array[String], footer: js.Array[String], header: js.Array[String]): ButtonsApiExportDataReturn = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonsApiExportDataReturn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ButtonsApiExportDataReturn] (val x: Self) extends AnyVal {
    
    inline def setBody(value: js.Array[String]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: String*): Self = StObject.set(x, "body", js.Array(value*))
    
    inline def setFooter(value: js.Array[String]): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterVarargs(value: String*): Self = StObject.set(x, "footer", js.Array(value*))
    
    inline def setHeader(value: js.Array[String]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderVarargs(value: String*): Self = StObject.set(x, "header", js.Array(value*))
  }
}
