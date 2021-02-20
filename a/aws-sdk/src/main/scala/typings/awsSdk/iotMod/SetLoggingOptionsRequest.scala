package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetLoggingOptionsRequest extends StObject {
  
  /**
    * The logging options payload.
    */
  var loggingOptionsPayload: LoggingOptionsPayload = js.native
}
object SetLoggingOptionsRequest {
  
  @scala.inline
  def apply(loggingOptionsPayload: LoggingOptionsPayload): SetLoggingOptionsRequest = {
    val __obj = js.Dynamic.literal(loggingOptionsPayload = loggingOptionsPayload.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetLoggingOptionsRequest]
  }
  
  @scala.inline
  implicit class SetLoggingOptionsRequestMutableBuilder[Self <: SetLoggingOptionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoggingOptionsPayload(value: LoggingOptionsPayload): Self = StObject.set(x, "loggingOptionsPayload", value.asInstanceOf[js.Any])
  }
}
