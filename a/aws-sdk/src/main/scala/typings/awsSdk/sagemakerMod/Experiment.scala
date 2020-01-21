package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Experiment extends js.Object {
  var CreatedBy: js.UndefOr[UserContext] = js.native
  /**
    * When the experiment was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The description of the experiment.
    */
  var Description: js.UndefOr[ExperimentDescription] = js.native
  /**
    * The name of the experiment as displayed. If DisplayName isn't specified, ExperimentName is displayed.
    */
  var DisplayName: js.UndefOr[ExperimentEntityName] = js.native
  /**
    * The Amazon Resource Name (ARN) of the experiment.
    */
  var ExperimentArn: js.UndefOr[typings.awsSdk.sagemakerMod.ExperimentArn] = js.native
  /**
    * The name of the experiment.
    */
  var ExperimentName: js.UndefOr[ExperimentEntityName] = js.native
  var LastModifiedBy: js.UndefOr[UserContext] = js.native
  /**
    * When the experiment was last modified.
    */
  var LastModifiedTime: js.UndefOr[Timestamp] = js.native
  var Source: js.UndefOr[ExperimentSource] = js.native
  /**
    * The list of tags that are associated with the experiment. You can use Search API to search on the tags.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object Experiment {
  @scala.inline
  def apply(
    CreatedBy: UserContext = null,
    CreationTime: Timestamp = null,
    Description: ExperimentDescription = null,
    DisplayName: ExperimentEntityName = null,
    ExperimentArn: ExperimentArn = null,
    ExperimentName: ExperimentEntityName = null,
    LastModifiedBy: UserContext = null,
    LastModifiedTime: Timestamp = null,
    Source: ExperimentSource = null,
    Tags: TagList = null
  ): Experiment = {
    val __obj = js.Dynamic.literal()
    if (CreatedBy != null) __obj.updateDynamic("CreatedBy")(CreatedBy.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (ExperimentArn != null) __obj.updateDynamic("ExperimentArn")(ExperimentArn.asInstanceOf[js.Any])
    if (ExperimentName != null) __obj.updateDynamic("ExperimentName")(ExperimentName.asInstanceOf[js.Any])
    if (LastModifiedBy != null) __obj.updateDynamic("LastModifiedBy")(LastModifiedBy.asInstanceOf[js.Any])
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime.asInstanceOf[js.Any])
    if (Source != null) __obj.updateDynamic("Source")(Source.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Experiment]
  }
}

