package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FixedResponseActionConfig extends StObject {
  
  /**
    * The content type. Valid Values: text/plain | text/css | text/html | application/javascript | application/json
    */
  var ContentType: js.UndefOr[FixedResponseActionContentType] = js.undefined
  
  /**
    * The message.
    */
  var MessageBody: js.UndefOr[FixedResponseActionMessage] = js.undefined
  
  /**
    * The HTTP response code (2XX, 4XX, or 5XX).
    */
  var StatusCode: FixedResponseActionStatusCode
}
object FixedResponseActionConfig {
  
  inline def apply(StatusCode: FixedResponseActionStatusCode): FixedResponseActionConfig = {
    val __obj = js.Dynamic.literal(StatusCode = StatusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixedResponseActionConfig]
  }
  
  extension [Self <: FixedResponseActionConfig](x: Self) {
    
    inline def setContentType(value: FixedResponseActionContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    inline def setMessageBody(value: FixedResponseActionMessage): Self = StObject.set(x, "MessageBody", value.asInstanceOf[js.Any])
    
    inline def setMessageBodyUndefined: Self = StObject.set(x, "MessageBody", js.undefined)
    
    inline def setStatusCode(value: FixedResponseActionStatusCode): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
  }
}
