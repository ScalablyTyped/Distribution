package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceIdentifierSummary extends StObject {
  
  /**
    * The logical IDs of the target resources of the specified ResourceType, as defined in the import template.
    */
  var LogicalResourceIds: js.UndefOr[typings.awsSdk.cloudformationMod.LogicalResourceIds] = js.undefined
  
  /**
    * The resource properties you can provide during the import to identify your target resources. For example, BucketName is a possible identifier property for AWS::S3::Bucket resources.
    */
  var ResourceIdentifiers: js.UndefOr[typings.awsSdk.cloudformationMod.ResourceIdentifiers] = js.undefined
  
  /**
    * The template resource type of the target resources, such as AWS::S3::Bucket.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.cloudformationMod.ResourceType] = js.undefined
}
object ResourceIdentifierSummary {
  
  @scala.inline
  def apply(): ResourceIdentifierSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceIdentifierSummary]
  }
  
  @scala.inline
  implicit class ResourceIdentifierSummaryMutableBuilder[Self <: ResourceIdentifierSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogicalResourceIds(value: LogicalResourceIds): Self = StObject.set(x, "LogicalResourceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicalResourceIdsUndefined: Self = StObject.set(x, "LogicalResourceIds", js.undefined)
    
    @scala.inline
    def setLogicalResourceIdsVarargs(value: LogicalResourceId*): Self = StObject.set(x, "LogicalResourceIds", js.Array(value :_*))
    
    @scala.inline
    def setResourceIdentifiers(value: ResourceIdentifiers): Self = StObject.set(x, "ResourceIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdentifiersUndefined: Self = StObject.set(x, "ResourceIdentifiers", js.undefined)
    
    @scala.inline
    def setResourceIdentifiersVarargs(value: ResourceIdentifierPropertyKey*): Self = StObject.set(x, "ResourceIdentifiers", js.Array(value :_*))
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
