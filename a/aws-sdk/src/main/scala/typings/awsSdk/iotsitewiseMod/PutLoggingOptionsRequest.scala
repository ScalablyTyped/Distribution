package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutLoggingOptionsRequest extends js.Object {
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
}

