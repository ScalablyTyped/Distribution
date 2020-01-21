package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventDescriptionsMessage extends js.Object {
  /**
    *  A list of EventDescription. 
    */
  var Events: js.UndefOr[EventDescriptionList] = js.native
  /**
    *  If returned, this indicates that there are more results to obtain. Use this token in the next DescribeEvents call to get the next batch of events. 
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object EventDescriptionsMessage {
  @scala.inline
  def apply(Events: EventDescriptionList = null, NextToken: Token = null): EventDescriptionsMessage = {
    val __obj = js.Dynamic.literal()
    if (Events != null) __obj.updateDynamic("Events")(Events.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventDescriptionsMessage]
  }
}

