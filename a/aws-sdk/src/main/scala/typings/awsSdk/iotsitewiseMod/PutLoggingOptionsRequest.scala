package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutLoggingOptionsRequest extends StObject {
  
  /**
    * The logging options to set.
    */
  var loggingOptions: LoggingOptions = js.native
}
object PutLoggingOptionsRequest {
  
  @scala.inline
  def apply(loggingOptions: LoggingOptions): PutLoggingOptionsRequest = {
    val __obj = js.Dynamic.literal(loggingOptions = loggingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutLoggingOptionsRequest]
  }
  
  @scala.inline
  implicit class PutLoggingOptionsRequestMutableBuilder[Self <: PutLoggingOptionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoggingOptions(value: LoggingOptions): Self = StObject.set(x, "loggingOptions", value.asInstanceOf[js.Any])
  }
}
