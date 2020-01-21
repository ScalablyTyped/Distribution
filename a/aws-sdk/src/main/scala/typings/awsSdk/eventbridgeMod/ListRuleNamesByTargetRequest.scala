package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRuleNamesByTargetRequest extends js.Object {
  /**
    * Limits the results to show only the rules associated with the specified event bus.
    */
  var EventBusName: js.UndefOr[typings.awsSdk.eventbridgeMod.EventBusName] = js.native
  /**
    * The maximum number of results to return.
    */
  var Limit: js.UndefOr[LimitMax100] = js.native
  /**
    * The token returned by a previous call to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.eventbridgeMod.NextToken] = js.native
  /**
    * The Amazon Resource Name (ARN) of the target resource.
    */
  var TargetArn: typings.awsSdk.eventbridgeMod.TargetArn = js.native
}

object ListRuleNamesByTargetRequest {
  @scala.inline
  def apply(
    TargetArn: TargetArn,
    EventBusName: EventBusName = null,
    Limit: Int | Double = null,
    NextToken: NextToken = null
  ): ListRuleNamesByTargetRequest = {
    val __obj = js.Dynamic.literal(TargetArn = TargetArn.asInstanceOf[js.Any])
    if (EventBusName != null) __obj.updateDynamic("EventBusName")(EventBusName.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRuleNamesByTargetRequest]
  }
}

