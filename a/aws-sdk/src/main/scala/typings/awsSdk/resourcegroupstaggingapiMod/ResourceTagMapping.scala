package typings.awsSdk.resourcegroupstaggingapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceTagMapping extends StObject {
  
  /**
    * Information that shows whether a resource is compliant with the effective tag policy, including details on any noncompliant tag keys.
    */
  var ComplianceDetails: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.ComplianceDetails] = js.undefined
  
  /**
    * The ARN of the resource.
    */
  var ResourceARN: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.ResourceARN] = js.undefined
  
  /**
    * The tags that have been applied to one or more AWS resources.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object ResourceTagMapping {
  
  @scala.inline
  def apply(): ResourceTagMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceTagMapping]
  }
  
  @scala.inline
  implicit class ResourceTagMappingMutableBuilder[Self <: ResourceTagMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplianceDetails(value: ComplianceDetails): Self = StObject.set(x, "ComplianceDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceDetailsUndefined: Self = StObject.set(x, "ComplianceDetails", js.undefined)
    
    @scala.inline
    def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceARNUndefined: Self = StObject.set(x, "ResourceARN", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
