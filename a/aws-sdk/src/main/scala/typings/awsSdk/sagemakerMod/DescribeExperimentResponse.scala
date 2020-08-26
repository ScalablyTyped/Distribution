package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeExperimentResponse extends js.Object {
  /**
    * Who created the experiment.
    */
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
  /**
    * Who last modified the experiment.
    */
  var LastModifiedBy: js.UndefOr[UserContext] = js.native
  /**
    * When the experiment was last modified.
    */
  var LastModifiedTime: js.UndefOr[Timestamp] = js.native
  /**
    * The ARN of the source and, optionally, the type.
    */
  var Source: js.UndefOr[ExperimentSource] = js.native
}

object DescribeExperimentResponse {
  @scala.inline
  def apply(): DescribeExperimentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeExperimentResponse]
  }
  @scala.inline
  implicit class DescribeExperimentResponseOps[Self <: DescribeExperimentResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreatedBy(value: UserContext): Self = this.set("CreatedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedBy: Self = this.set("CreatedBy", js.undefined)
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    @scala.inline
    def setDescription(value: ExperimentDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setDisplayName(value: ExperimentEntityName): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("DisplayName", js.undefined)
    @scala.inline
    def setExperimentArn(value: ExperimentArn): Self = this.set("ExperimentArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExperimentArn: Self = this.set("ExperimentArn", js.undefined)
    @scala.inline
    def setExperimentName(value: ExperimentEntityName): Self = this.set("ExperimentName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExperimentName: Self = this.set("ExperimentName", js.undefined)
    @scala.inline
    def setLastModifiedBy(value: UserContext): Self = this.set("LastModifiedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedBy: Self = this.set("LastModifiedBy", js.undefined)
    @scala.inline
    def setLastModifiedTime(value: Timestamp): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("LastModifiedTime", js.undefined)
    @scala.inline
    def setSource(value: ExperimentSource): Self = this.set("Source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("Source", js.undefined)
  }
  
}

