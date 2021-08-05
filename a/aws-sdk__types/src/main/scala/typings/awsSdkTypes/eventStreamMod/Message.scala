package typings.awsSdkTypes.eventStreamMod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  var body: Uint8Array
  
  var headers: MessageHeaders
}
object Message {
  
  inline def apply(body: Uint8Array, headers: MessageHeaders): Message = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  extension [Self <: Message](x: Self) {
    
    inline def setBody(value: Uint8Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: MessageHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
