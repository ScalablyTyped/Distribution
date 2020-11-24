package typings.awsSdk.resourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceTagMapping extends js.Object {
  
  /**
    * Information that shows whether a resource is compliant with the effective tag policy, including details on any noncompliant tag keys.
    */
  var ComplianceDetails: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.ComplianceDetails] = js.native
  
  /**
    * The ARN of the resource.
    */
  var ResourceARN: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.ResourceARN] = js.native
  
  /**
    * The tags that have been applied to one or more AWS resources.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object ResourceTagMapping {
  
  @scala.inline
  def apply(): ResourceTagMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceTagMapping]
  }
  
  @scala.inline
  implicit class ResourceTagMappingOps[Self <: ResourceTagMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComplianceDetails(value: ComplianceDetails): Self = this.set("ComplianceDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplianceDetails: Self = this.set("ComplianceDetails", js.undefined)
    
    @scala.inline
    def setResourceARN(value: ResourceARN): Self = this.set("ResourceARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceARN: Self = this.set("ResourceARN", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
