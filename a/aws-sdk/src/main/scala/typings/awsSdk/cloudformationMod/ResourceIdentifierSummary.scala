package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceIdentifierSummary extends js.Object {
  
  /**
    * The logical IDs of the target resources of the specified ResourceType, as defined in the import template.
    */
  var LogicalResourceIds: js.UndefOr[typings.awsSdk.cloudformationMod.LogicalResourceIds] = js.native
  
  /**
    * The resource properties you can provide during the import to identify your target resources. For example, BucketName is a possible identifier property for AWS::S3::Bucket resources.
    */
  var ResourceIdentifiers: js.UndefOr[typings.awsSdk.cloudformationMod.ResourceIdentifiers] = js.native
  
  /**
    * The template resource type of the target resources, such as AWS::S3::Bucket.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.cloudformationMod.ResourceType] = js.native
}
object ResourceIdentifierSummary {
  
  @scala.inline
  def apply(): ResourceIdentifierSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceIdentifierSummary]
  }
  
  @scala.inline
  implicit class ResourceIdentifierSummaryOps[Self <: ResourceIdentifierSummary] (val x: Self) extends AnyVal {
    
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
    def setLogicalResourceIdsVarargs(value: LogicalResourceId*): Self = this.set("LogicalResourceIds", js.Array(value :_*))
    
    @scala.inline
    def setLogicalResourceIds(value: LogicalResourceIds): Self = this.set("LogicalResourceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogicalResourceIds: Self = this.set("LogicalResourceIds", js.undefined)
    
    @scala.inline
    def setResourceIdentifiersVarargs(value: ResourceIdentifierPropertyKey*): Self = this.set("ResourceIdentifiers", js.Array(value :_*))
    
    @scala.inline
    def setResourceIdentifiers(value: ResourceIdentifiers): Self = this.set("ResourceIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceIdentifiers: Self = this.set("ResourceIdentifiers", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
  }
}
