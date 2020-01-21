package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetSummary extends js.Object {
  /**
    * The date and time (in Unix time) that the dataset was created.
    */
  var creationDateTime: js.UndefOr[Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the dataset.
    */
  var datasetArn: js.UndefOr[Arn] = js.native
  /**
    * The dataset type. One of the following values:   Interactions   Items   Users   Event-Interactions  
    */
  var datasetType: js.UndefOr[DatasetType] = js.native
  /**
    * The date and time (in Unix time) that the dataset was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[Date] = js.native
  /**
    * The name of the dataset.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The status of the dataset. A dataset can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS  
    */
  var status: js.UndefOr[Status] = js.native
}

object DatasetSummary {
  @scala.inline
  def apply(
    creationDateTime: Date = null,
    datasetArn: Arn = null,
    datasetType: DatasetType = null,
    lastUpdatedDateTime: Date = null,
    name: Name = null,
    status: Status = null
  ): DatasetSummary = {
    val __obj = js.Dynamic.literal()
    if (creationDateTime != null) __obj.updateDynamic("creationDateTime")(creationDateTime.asInstanceOf[js.Any])
    if (datasetArn != null) __obj.updateDynamic("datasetArn")(datasetArn.asInstanceOf[js.Any])
    if (datasetType != null) __obj.updateDynamic("datasetType")(datasetType.asInstanceOf[js.Any])
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetSummary]
  }
}

