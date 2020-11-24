package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLaunchTemplateVersionsRequest extends js.Object {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * One or more filters.    create-time - The time the launch template version was created.    ebs-optimized - A boolean that indicates whether the instance is optimized for Amazon EBS I/O.    iam-instance-profile - The ARN of the IAM instance profile.    image-id - The ID of the AMI.    instance-type - The instance type.    is-default-version - A boolean that indicates whether the launch template version is the default version.    kernel-id - The kernel ID.    ram-disk-id - The RAM disk ID.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * The ID of the launch template. To describe one or more versions of a specified launch template, you must specify either the launch template ID or the launch template name in the request. To describe all the latest or default launch template versions in your account, you must omit this parameter.
    */
  var LaunchTemplateId: js.UndefOr[typings.awsSdk.ec2Mod.LaunchTemplateId] = js.native
  
  /**
    * The name of the launch template. To describe one or more versions of a specified launch template, you must specify either the launch template ID or the launch template name in the request. To describe all the latest or default launch template versions in your account, you must omit this parameter.
    */
  var LaunchTemplateName: js.UndefOr[typings.awsSdk.ec2Mod.LaunchTemplateName] = js.native
  
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned NextToken value. This value can be between 1 and 200.
    */
  var MaxResults: js.UndefOr[Integer] = js.native
  
  /**
    * The version number up to which to describe launch template versions.
    */
  var MaxVersion: js.UndefOr[String] = js.native
  
  /**
    * The version number after which to describe launch template versions.
    */
  var MinVersion: js.UndefOr[String] = js.native
  
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * One or more versions of the launch template. Valid values depend on whether you are describing a specified launch template (by ID or name) or all launch templates in your account. To describe one or more versions of a specified launch template, valid values are $Latest, $Default, and numbers. To describe all launch templates in your account that are defined as the latest version, the valid value is $Latest. To describe all launch templates in your account that are defined as the default version, the valid value is $Default. You can specify $Latest and $Default in the same call. You cannot specify numbers.
    */
  var Versions: js.UndefOr[VersionStringList] = js.native
}
object DescribeLaunchTemplateVersionsRequest {
  
  @scala.inline
  def apply(): DescribeLaunchTemplateVersionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLaunchTemplateVersionsRequest]
  }
  
  @scala.inline
  implicit class DescribeLaunchTemplateVersionsRequestOps[Self <: DescribeLaunchTemplateVersionsRequest] (val x: Self) extends AnyVal {
    
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
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = this.set("Filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: FilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    
    @scala.inline
    def setLaunchTemplateId(value: LaunchTemplateId): Self = this.set("LaunchTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchTemplateId: Self = this.set("LaunchTemplateId", js.undefined)
    
    @scala.inline
    def setLaunchTemplateName(value: LaunchTemplateName): Self = this.set("LaunchTemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchTemplateName: Self = this.set("LaunchTemplateName", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Integer): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setMaxVersion(value: String): Self = this.set("MaxVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxVersion: Self = this.set("MaxVersion", js.undefined)
    
    @scala.inline
    def setMinVersion(value: String): Self = this.set("MinVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinVersion: Self = this.set("MinVersion", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setVersionsVarargs(value: String*): Self = this.set("Versions", js.Array(value :_*))
    
    @scala.inline
    def setVersions(value: VersionStringList): Self = this.set("Versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersions: Self = this.set("Versions", js.undefined)
  }
}
