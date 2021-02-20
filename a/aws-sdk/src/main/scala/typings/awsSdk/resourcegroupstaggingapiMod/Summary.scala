package typings.awsSdk.resourcegroupstaggingapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Summary extends StObject {
  
  /**
    * The timestamp that shows when this summary was generated in this Region. 
    */
  var LastUpdated: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.LastUpdated] = js.native
  
  /**
    * The count of noncompliant resources.
    */
  var NonCompliantResources: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.NonCompliantResources] = js.native
  
  /**
    * The AWS Region that the summary applies to.
    */
  var Region: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.Region] = js.native
  
  /**
    * The AWS resource type.
    */
  var ResourceType: js.UndefOr[AmazonResourceType] = js.native
  
  /**
    * The account identifier or the root identifier of the organization. If you don't know the root ID, you can call the AWS Organizations ListRoots API.
    */
  var TargetId: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.TargetId] = js.native
  
  /**
    * Whether the target is an account, an OU, or the organization root.
    */
  var TargetIdType: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.TargetIdType] = js.native
}
object Summary {
  
  @scala.inline
  def apply(): Summary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Summary]
  }
  
  @scala.inline
  implicit class SummaryMutableBuilder[Self <: Summary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastUpdated(value: LastUpdated): Self = StObject.set(x, "LastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedUndefined: Self = StObject.set(x, "LastUpdated", js.undefined)
    
    @scala.inline
    def setNonCompliantResources(value: NonCompliantResources): Self = StObject.set(x, "NonCompliantResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonCompliantResourcesUndefined: Self = StObject.set(x, "NonCompliantResources", js.undefined)
    
    @scala.inline
    def setRegion(value: Region): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    @scala.inline
    def setResourceType(value: AmazonResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    @scala.inline
    def setTargetId(value: TargetId): Self = StObject.set(x, "TargetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIdType(value: TargetIdType): Self = StObject.set(x, "TargetIdType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIdTypeUndefined: Self = StObject.set(x, "TargetIdType", js.undefined)
    
    @scala.inline
    def setTargetIdUndefined: Self = StObject.set(x, "TargetId", js.undefined)
  }
}
