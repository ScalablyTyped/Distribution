package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LicenseConfigurationAssociation extends StObject {
  
  /**
    * Time when the license configuration was associated with the resource.
    */
  var AssociationTime: js.UndefOr[DateTime] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArn: js.UndefOr[String] = js.native
  
  /**
    * ID of the AWS account that owns the resource consuming licenses.
    */
  var ResourceOwnerId: js.UndefOr[String] = js.native
  
  /**
    * Type of server resource.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.licensemanagerMod.ResourceType] = js.native
}
object LicenseConfigurationAssociation {
  
  @scala.inline
  def apply(): LicenseConfigurationAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseConfigurationAssociation]
  }
  
  @scala.inline
  implicit class LicenseConfigurationAssociationMutableBuilder[Self <: LicenseConfigurationAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationTime(value: DateTime): Self = StObject.set(x, "AssociationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationTimeUndefined: Self = StObject.set(x, "AssociationTime", js.undefined)
    
    @scala.inline
    def setResourceArn(value: String): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    @scala.inline
    def setResourceOwnerId(value: String): Self = StObject.set(x, "ResourceOwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceOwnerIdUndefined: Self = StObject.set(x, "ResourceOwnerId", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
