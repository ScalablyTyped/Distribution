package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetLoggingOptionsRequest extends StObject {
  
  /**
    * The logging options payload.
    */
  var loggingOptionsPayload: LoggingOptionsPayload
}
object SetLoggingOptionsRequest {
  
  inline def apply(loggingOptionsPayload: LoggingOptionsPayload): SetLoggingOptionsRequest = {
    val __obj = js.Dynamic.literal(loggingOptionsPayload = loggingOptionsPayload.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetLoggingOptionsRequest]
  }
  
  extension [Self <: SetLoggingOptionsRequest](x: Self) {
    
    inline def setLoggingOptionsPayload(value: LoggingOptionsPayload): Self = StObject.set(x, "loggingOptionsPayload", value.asInstanceOf[js.Any])
  }
}
