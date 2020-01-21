package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetContentSummary extends js.Object {
  /**
    * The time the dataset content status was updated to SUCCEEDED or FAILED.
    */
  var completionTime: js.UndefOr[Timestamp] = js.native
  /**
    * The actual time the creation of the data set contents was started.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The time the creation of the data set contents was scheduled to start.
    */
  var scheduleTime: js.UndefOr[Timestamp] = js.native
  /**
    * The status of the data set contents.
    */
  var status: js.UndefOr[DatasetContentStatus] = js.native
  /**
    * The version of the data set contents.
    */
  var version: js.UndefOr[DatasetContentVersion] = js.native
}

object DatasetContentSummary {
  @scala.inline
  def apply(
    completionTime: Timestamp = null,
    creationTime: Timestamp = null,
    scheduleTime: Timestamp = null,
    status: DatasetContentStatus = null,
    version: DatasetContentVersion = null
  ): DatasetContentSummary = {
    val __obj = js.Dynamic.literal()
    if (completionTime != null) __obj.updateDynamic("completionTime")(completionTime.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (scheduleTime != null) __obj.updateDynamic("scheduleTime")(scheduleTime.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetContentSummary]
  }
}

