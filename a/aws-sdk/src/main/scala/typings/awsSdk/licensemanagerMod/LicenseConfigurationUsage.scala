package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicenseConfigurationUsage extends StObject {
  
  /**
    * Time when the license configuration was initially associated with the resource.
    */
  var AssociationTime: js.UndefOr[js.Date] = js.undefined
  
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
  
  inline def apply(): LicenseConfigurationUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseConfigurationUsage]
  }
  
  extension [Self <: LicenseConfigurationUsage](x: Self) {
    
    inline def setAssociationTime(value: js.Date): Self = StObject.set(x, "AssociationTime", value.asInstanceOf[js.Any])
    
    inline def setAssociationTimeUndefined: Self = StObject.set(x, "AssociationTime", js.undefined)
    
    inline def setConsumedLicenses(value: BoxLong): Self = StObject.set(x, "ConsumedLicenses", value.asInstanceOf[js.Any])
    
    inline def setConsumedLicensesUndefined: Self = StObject.set(x, "ConsumedLicenses", js.undefined)
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setResourceOwnerId(value: String): Self = StObject.set(x, "ResourceOwnerId", value.asInstanceOf[js.Any])
    
    inline def setResourceOwnerIdUndefined: Self = StObject.set(x, "ResourceOwnerId", js.undefined)
    
    inline def setResourceStatus(value: String): Self = StObject.set(x, "ResourceStatus", value.asInstanceOf[js.Any])
    
    inline def setResourceStatusUndefined: Self = StObject.set(x, "ResourceStatus", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
