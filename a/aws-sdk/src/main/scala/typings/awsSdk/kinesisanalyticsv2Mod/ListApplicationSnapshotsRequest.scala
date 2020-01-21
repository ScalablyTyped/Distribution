package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListApplicationSnapshotsRequest extends js.Object {
  /**
    * The name of an existing application.
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationName = js.native
  /**
    * The maximum number of application snapshots to list.
    */
  var Limit: js.UndefOr[ListSnapshotsInputLimit] = js.native
  /**
    * Use this parameter if you receive a NextToken response in a previous request that indicates that there is more output available. Set it to the value of the previous call's NextToken response to indicate where the output should continue from. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.NextToken] = js.native
}

object ListApplicationSnapshotsRequest {
  @scala.inline
  def apply(ApplicationName: ApplicationName, Limit: Int | Double = null, NextToken: NextToken = null): ListApplicationSnapshotsRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListApplicationSnapshotsRequest]
  }
}

