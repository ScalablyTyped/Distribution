package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLaunchTemplateVersionsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more filters.    create-time - The time the launch template version was created.    ebs-optimized - A boolean that indicates whether the instance is optimized for Amazon EBS I/O.    iam-instance-profile - The ARN of the IAM instance profile.    image-id - The ID of the AMI.    instance-type - The instance type.    is-default-version - A boolean that indicates whether the launch template version is the default version.    kernel-id - The kernel ID.    ram-disk-id - The RAM disk ID.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The ID of the launch template. To describe one or more versions of a specified launch template, you must specify either the launch template ID or the launch template name in the request. To describe all the latest or default launch template versions in your account, you must omit this parameter.
    */
  var LaunchTemplateId: js.UndefOr[typings.awsSdk.ec2Mod.LaunchTemplateId] = js.undefined
  
  /**
    * The name of the launch template. To describe one or more versions of a specified launch template, you must specify either the launch template ID or the launch template name in the request. To describe all the latest or default launch template versions in your account, you must omit this parameter.
    */
  var LaunchTemplateName: js.UndefOr[typings.awsSdk.ec2Mod.LaunchTemplateName] = js.undefined
  
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned NextToken value. This value can be between 1 and 200.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * The version number up to which to describe launch template versions.
    */
  var MaxVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The version number after which to describe launch template versions.
    */
  var MinVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * One or more versions of the launch template. Valid values depend on whether you are describing a specified launch template (by ID or name) or all launch templates in your account. To describe one or more versions of a specified launch template, valid values are $Latest, $Default, and numbers. To describe all launch templates in your account that are defined as the latest version, the valid value is $Latest. To describe all launch templates in your account that are defined as the default version, the valid value is $Default. You can specify $Latest and $Default in the same call. You cannot specify numbers.
    */
  var Versions: js.UndefOr[VersionStringList] = js.undefined
}
object DescribeLaunchTemplateVersionsRequest {
  
  @scala.inline
  def apply(): DescribeLaunchTemplateVersionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLaunchTemplateVersionsRequest]
  }
  
  @scala.inline
  implicit class DescribeLaunchTemplateVersionsRequestMutableBuilder[Self <: DescribeLaunchTemplateVersionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setLaunchTemplateId(value: LaunchTemplateId): Self = StObject.set(x, "LaunchTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplateIdUndefined: Self = StObject.set(x, "LaunchTemplateId", js.undefined)
    
    @scala.inline
    def setLaunchTemplateName(value: LaunchTemplateName): Self = StObject.set(x, "LaunchTemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplateNameUndefined: Self = StObject.set(x, "LaunchTemplateName", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Integer): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setMaxVersion(value: String): Self = StObject.set(x, "MaxVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxVersionUndefined: Self = StObject.set(x, "MaxVersion", js.undefined)
    
    @scala.inline
    def setMinVersion(value: String): Self = StObject.set(x, "MinVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinVersionUndefined: Self = StObject.set(x, "MinVersion", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setVersions(value: VersionStringList): Self = StObject.set(x, "Versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionsUndefined: Self = StObject.set(x, "Versions", js.undefined)
    
    @scala.inline
    def setVersionsVarargs(value: String*): Self = StObject.set(x, "Versions", js.Array(value :_*))
  }
}
