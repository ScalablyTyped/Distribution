package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicenseConfigurationUsage extends StObject {
  
  /**
    * Time when the license configuration was initially associated with the resource.
    */
  var AssociationTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * Number of licenses consumed by the resource.
    */
  var ConsumedLicenses: js.UndefOr[BoxLong] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArn: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the account that owns the resource.
    */
  var ResourceOwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * Status of the resource.
    */
  var ResourceStatus: js.UndefOr[String] = js.undefined
  
  /**
    * Type of resource.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.licensemanagerMod.ResourceType] = js.undefined
}
object LicenseConfigurationUsage {
  
  @scala.inline
  def apply(): LicenseConfigurationUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseConfigurationUsage]
  }
  
  @scala.inline
  implicit class LicenseConfigurationUsageMutableBuilder[Self <: LicenseConfigurationUsage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationTime(value: DateTime): Self = StObject.set(x, "AssociationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationTimeUndefined: Self = StObject.set(x, "AssociationTime", js.undefined)
    
    @scala.inline
    def setConsumedLicenses(value: BoxLong): Self = StObject.set(x, "ConsumedLicenses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumedLicensesUndefined: Self = StObject.set(x, "ConsumedLicenses", js.undefined)
    
    @scala.inline
    def setResourceArn(value: String): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    @scala.inline
    def setResourceOwnerId(value: String): Self = StObject.set(x, "ResourceOwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceOwnerIdUndefined: Self = StObject.set(x, "ResourceOwnerId", js.undefined)
    
    @scala.inline
    def setResourceStatus(value: String): Self = StObject.set(x, "ResourceStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceStatusUndefined: Self = StObject.set(x, "ResourceStatus", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
