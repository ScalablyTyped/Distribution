package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicenseConfigurationAssociation extends StObject {
  
  /**
    * Time when the license configuration was associated with the resource.
    */
  var AssociationTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArn: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the AWS account that owns the resource consuming licenses.
    */
  var ResourceOwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * Type of server resource.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.licensemanagerMod.ResourceType] = js.undefined
}
object LicenseConfigurationAssociation {
  
  inline def apply(): LicenseConfigurationAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseConfigurationAssociation]
  }
  
  extension [Self <: LicenseConfigurationAssociation](x: Self) {
    
    inline def setAssociationTime(value: DateTime): Self = StObject.set(x, "AssociationTime", value.asInstanceOf[js.Any])
    
    inline def setAssociationTimeUndefined: Self = StObject.set(x, "AssociationTime", js.undefined)
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setResourceOwnerId(value: String): Self = StObject.set(x, "ResourceOwnerId", value.asInstanceOf[js.Any])
    
    inline def setResourceOwnerIdUndefined: Self = StObject.set(x, "ResourceOwnerId", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
