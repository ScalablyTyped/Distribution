package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutLoggingOptionsRequest extends js.Object {
  /**
    * The new values of the AWS IoT Events logging options.
    */
  var loggingOptions: LoggingOptions = js.native
}

object PutLoggingOptionsRequest {
  @scala.inline
  def apply(loggingOptions: LoggingOptions): PutLoggingOptionsRequest = {
    val __obj = js.Dynamic.literal(loggingOptions = loggingOptions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutLoggingOptionsRequest]
  }
}

