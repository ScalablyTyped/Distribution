package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggingOptions extends js.Object {
  /**
    * The AWS IoT SiteWise logging verbosity level.
    */
  var level: LoggingLevel = js.native
}

object LoggingOptions {
  @scala.inline
  def apply(level: LoggingLevel): LoggingOptions = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingOptions]
  }
}

