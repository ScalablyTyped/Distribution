package typings.awsSdkTypes.distTypesEventStreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  var body: js.typedarray.Uint8Array
  
  var headers: MessageHeaders
}
object Message {
  
  inline def apply(body: js.typedarray.Uint8Array, headers: MessageHeaders): Message = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
    
    inline def setBody(value: js.typedarray.Uint8Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: MessageHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
