package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWatchDestination extends js.Object {
  /**
    * An array of objects that define the dimensions to use when you send email events to Amazon CloudWatch.
    */
  var DimensionConfigurations: CloudWatchDimensionConfigurations = js.native
}

object CloudWatchDestination {
  @scala.inline
  def apply(DimensionConfigurations: CloudWatchDimensionConfigurations): CloudWatchDestination = {
    val __obj = js.Dynamic.literal(DimensionConfigurations = DimensionConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchDestination]
  }
}

