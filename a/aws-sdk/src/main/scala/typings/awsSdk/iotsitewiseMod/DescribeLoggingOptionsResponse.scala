package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLoggingOptionsResponse extends js.Object {
  /**
    * The current logging options.
    */
  var loggingOptions: LoggingOptions = js.native
}

object DescribeLoggingOptionsResponse {
  @scala.inline
  def apply(loggingOptions: LoggingOptions): DescribeLoggingOptionsResponse = {
    val __obj = js.Dynamic.literal(loggingOptions = loggingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLoggingOptionsResponse]
  }
}

