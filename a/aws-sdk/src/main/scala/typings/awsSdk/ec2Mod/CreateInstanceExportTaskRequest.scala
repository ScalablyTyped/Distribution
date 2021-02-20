package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateInstanceExportTaskRequest extends StObject {
  
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
  implicit class CreateInstanceExportTaskRequestMutableBuilder[Self <: CreateInstanceExportTaskRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setExportToS3Task(value: ExportToS3TaskSpecification): Self = StObject.set(x, "ExportToS3Task", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setTargetEnvironment(value: ExportEnvironment): Self = StObject.set(x, "TargetEnvironment", value.asInstanceOf[js.Any])
  }
}
