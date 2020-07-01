package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInstanceExportTaskRequest extends js.Object {
  /**
    * A description for the conversion task or the resource being exported. The maximum length is 255 characters.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The format and location for an instance export task.
    */
  var ExportToS3Task: js.UndefOr[ExportToS3TaskSpecification] = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: typings.awsSdk.ec2Mod.InstanceId = js.native
  /**
    * The tags to apply to the instance export task during creation.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
  /**
    * The target virtualization environment.
    */
  var TargetEnvironment: js.UndefOr[ExportEnvironment] = js.native
}

object CreateInstanceExportTaskRequest {
  @scala.inline
  def apply(
    InstanceId: InstanceId,
    Description: String = null,
    ExportToS3Task: ExportToS3TaskSpecification = null,
    TagSpecifications: TagSpecificationList = null,
    TargetEnvironment: ExportEnvironment = null
  ): CreateInstanceExportTaskRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ExportToS3Task != null) __obj.updateDynamic("ExportToS3Task")(ExportToS3Task.asInstanceOf[js.Any])
    if (TagSpecifications != null) __obj.updateDynamic("TagSpecifications")(TagSpecifications.asInstanceOf[js.Any])
    if (TargetEnvironment != null) __obj.updateDynamic("TargetEnvironment")(TargetEnvironment.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInstanceExportTaskRequest]
  }
}

