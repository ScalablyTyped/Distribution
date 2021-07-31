package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLaunchTemplateRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see Ensuring Idempotency. Constraint: Maximum 128 ASCII characters.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The information for the launch template.
    */
  var LaunchTemplateData: RequestLaunchTemplateData
  
  /**
    * A name for the launch template.
    */
  var LaunchTemplateName: typings.awsSdk.ec2Mod.LaunchTemplateName
  
  /**
    * The tags to apply to the launch template during creation.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
  
  /**
    * A description for the first version of the launch template.
    */
  var VersionDescription: js.UndefOr[typings.awsSdk.ec2Mod.VersionDescription] = js.undefined
}
object CreateLaunchTemplateRequest {
  
  @scala.inline
  def apply(LaunchTemplateData: RequestLaunchTemplateData, LaunchTemplateName: LaunchTemplateName): CreateLaunchTemplateRequest = {
    val __obj = js.Dynamic.literal(LaunchTemplateData = LaunchTemplateData.asInstanceOf[js.Any], LaunchTemplateName = LaunchTemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLaunchTemplateRequest]
  }
  
  @scala.inline
  implicit class CreateLaunchTemplateRequestMutableBuilder[Self <: CreateLaunchTemplateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setLaunchTemplateData(value: RequestLaunchTemplateData): Self = StObject.set(x, "LaunchTemplateData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplateName(value: LaunchTemplateName): Self = StObject.set(x, "LaunchTemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setVersionDescription(value: VersionDescription): Self = StObject.set(x, "VersionDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionDescriptionUndefined: Self = StObject.set(x, "VersionDescription", js.undefined)
  }
}
