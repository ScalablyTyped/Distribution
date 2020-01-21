package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListThingGroupsForThingResponse extends js.Object {
  /**
    * The token used to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The thing groups.
    */
  var thingGroups: js.UndefOr[ThingGroupNameAndArnList] = js.native
}

object ListThingGroupsForThingResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, thingGroups: ThingGroupNameAndArnList = null): ListThingGroupsForThingResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (thingGroups != null) __obj.updateDynamic("thingGroups")(thingGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListThingGroupsForThingResponse]
  }
}

