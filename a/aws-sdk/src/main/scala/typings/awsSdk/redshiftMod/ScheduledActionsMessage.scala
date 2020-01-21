package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduledActionsMessage extends js.Object {
  /**
    * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeScheduledActions request exceed the value specified in MaxRecords, AWS returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * List of retrieved scheduled actions. 
    */
  var ScheduledActions: js.UndefOr[ScheduledActionList] = js.native
}

object ScheduledActionsMessage {
  @scala.inline
  def apply(Marker: String = null, ScheduledActions: ScheduledActionList = null): ScheduledActionsMessage = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (ScheduledActions != null) __obj.updateDynamic("ScheduledActions")(ScheduledActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledActionsMessage]
  }
}

