package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLaunchTemplatesRequest extends js.Object {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * One or more filters.    create-time - The time the launch template was created.    launch-template-name - The name of the launch template.    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * One or more launch template IDs.
    */
  var LaunchTemplateIds: js.UndefOr[LaunchTemplateIdStringList] = js.native
  
  /**
    * One or more launch template names.
    */
  var LaunchTemplateNames: js.UndefOr[LaunchTemplateNameStringList] = js.native
  
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned NextToken value. This value can be between 1 and 200.
    */
  var MaxResults: js.UndefOr[DescribeLaunchTemplatesMaxResults] = js.native
  
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeLaunchTemplatesRequest {
  
  @scala.inline
  def apply(): DescribeLaunchTemplatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLaunchTemplatesRequest]
  }
  
  @scala.inline
  implicit class DescribeLaunchTemplatesRequestOps[Self <: DescribeLaunchTemplatesRequest] (val x: Self) extends AnyVal {
    
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
    def setLaunchTemplateIdsVarargs(value: LaunchTemplateId*): Self = this.set("LaunchTemplateIds", js.Array(value :_*))
    
    @scala.inline
    def setLaunchTemplateIds(value: LaunchTemplateIdStringList): Self = this.set("LaunchTemplateIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchTemplateIds: Self = this.set("LaunchTemplateIds", js.undefined)
    
    @scala.inline
    def setLaunchTemplateNamesVarargs(value: LaunchTemplateName*): Self = this.set("LaunchTemplateNames", js.Array(value :_*))
    
    @scala.inline
    def setLaunchTemplateNames(value: LaunchTemplateNameStringList): Self = this.set("LaunchTemplateNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchTemplateNames: Self = this.set("LaunchTemplateNames", js.undefined)
    
    @scala.inline
    def setMaxResults(value: DescribeLaunchTemplatesMaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
