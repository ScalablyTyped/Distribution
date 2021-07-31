package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceCountFilters extends StObject {
  
  /**
    * The 12-digit ID of the account.
    */
  var AccountId: js.UndefOr[typings.awsSdk.configserviceMod.AccountId] = js.undefined
  
  /**
    * The region where the account is located.
    */
  var Region: js.UndefOr[AwsRegion] = js.undefined
  
  /**
    * The type of the AWS resource.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.configserviceMod.ResourceType] = js.undefined
}
object ResourceCountFilters {
  
  @scala.inline
  def apply(): ResourceCountFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceCountFilters]
  }
  
  @scala.inline
  implicit class ResourceCountFiltersMutableBuilder[Self <: ResourceCountFilters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    @scala.inline
    def setRegion(value: AwsRegion): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
