package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSubscriptionFilterRequest extends js.Object {
  /**
    * The name of the subscription filter.
    */
  var filterName: FilterName = js.native
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName = js.native
}

object DeleteSubscriptionFilterRequest {
  @scala.inline
  def apply(filterName: FilterName, logGroupName: LogGroupName): DeleteSubscriptionFilterRequest = {
    val __obj = js.Dynamic.literal(filterName = filterName.asInstanceOf[js.Any], logGroupName = logGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSubscriptionFilterRequest]
  }
}

