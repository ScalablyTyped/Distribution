package typings.cyclonedx.mod

import typings.cyclonedx.cyclonedxStrings.base64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MimeText extends StObject {
  
  var content: String
  
  var contentType: js.UndefOr[String] = js.undefined
  
  var encoding: js.UndefOr[base64] = js.undefined
}
object MimeText {
  
  inline def apply(content: String): MimeText = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[MimeText]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MimeText] (val x: Self) extends AnyVal {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setEncoding(value: base64): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
  }
}
