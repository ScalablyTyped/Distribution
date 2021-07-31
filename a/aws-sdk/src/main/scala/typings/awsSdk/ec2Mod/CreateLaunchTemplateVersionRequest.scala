package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLaunchTemplateVersionRequest extends StObject {
  
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
    * The ID of the launch template. You must specify either the launch template ID or launch template name in the request.
    */
  var LaunchTemplateId: js.UndefOr[typings.awsSdk.ec2Mod.LaunchTemplateId] = js.undefined
  
  /**
    * The name of the launch template. You must specify either the launch template ID or launch template name in the request.
    */
  var LaunchTemplateName: js.UndefOr[typings.awsSdk.ec2Mod.LaunchTemplateName] = js.undefined
  
  /**
    * The version number of the launch template version on which to base the new version. The new version inherits the same launch parameters as the source version, except for parameters that you specify in LaunchTemplateData. Snapshots applied to the block device mapping are ignored when creating a new version unless they are explicitly included.
    */
  var SourceVersion: js.UndefOr[String] = js.undefined
  
  /**
    * A description for the version of the launch template.
    */
  var VersionDescription: js.UndefOr[typings.awsSdk.ec2Mod.VersionDescription] = js.undefined
}
object CreateLaunchTemplateVersionRequest {
  
  @scala.inline
  def apply(LaunchTemplateData: RequestLaunchTemplateData): CreateLaunchTemplateVersionRequest = {
    val __obj = js.Dynamic.literal(LaunchTemplateData = LaunchTemplateData.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLaunchTemplateVersionRequest]
  }
  
  @scala.inline
  implicit class CreateLaunchTemplateVersionRequestMutableBuilder[Self <: CreateLaunchTemplateVersionRequest] (val x: Self) extends AnyVal {
    
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
    def setLaunchTemplateId(value: LaunchTemplateId): Self = StObject.set(x, "LaunchTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplateIdUndefined: Self = StObject.set(x, "LaunchTemplateId", js.undefined)
    
    @scala.inline
    def setLaunchTemplateName(value: LaunchTemplateName): Self = StObject.set(x, "LaunchTemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplateNameUndefined: Self = StObject.set(x, "LaunchTemplateName", js.undefined)
    
    @scala.inline
    def setSourceVersion(value: String): Self = StObject.set(x, "SourceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceVersionUndefined: Self = StObject.set(x, "SourceVersion", js.undefined)
    
    @scala.inline
    def setVersionDescription(value: VersionDescription): Self = StObject.set(x, "VersionDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionDescriptionUndefined: Self = StObject.set(x, "VersionDescription", js.undefined)
  }
}
