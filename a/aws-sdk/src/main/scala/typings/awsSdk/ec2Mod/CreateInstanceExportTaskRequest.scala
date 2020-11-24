package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateInstanceExportTaskRequest extends js.Object {
  
  /**
    * A description for the conversion task or the resource being exported. The maximum length is 255 characters.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The format and location for an instance export task.
    */
  var ExportToS3Task: ExportToS3TaskSpecification = js.native
  
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
  var TargetEnvironment: ExportEnvironment = js.native
}
object CreateInstanceExportTaskRequest {
  
  @scala.inline
  def apply(
    ExportToS3Task: ExportToS3TaskSpecification,
    InstanceId: InstanceId,
    TargetEnvironment: ExportEnvironment
  ): CreateInstanceExportTaskRequest = {
    val __obj = js.Dynamic.literal(ExportToS3Task = ExportToS3Task.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], TargetEnvironment = TargetEnvironment.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInstanceExportTaskRequest]
  }
  
  @scala.inline
  implicit class CreateInstanceExportTaskRequestOps[Self <: CreateInstanceExportTaskRequest] (val x: Self) extends AnyVal {
    
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
    def setExportToS3Task(value: ExportToS3TaskSpecification): Self = this.set("ExportToS3Task", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetEnvironment(value: ExportEnvironment): Self = this.set("TargetEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = this.set("TagSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = this.set("TagSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagSpecifications: Self = this.set("TagSpecifications", js.undefined)
  }
}
