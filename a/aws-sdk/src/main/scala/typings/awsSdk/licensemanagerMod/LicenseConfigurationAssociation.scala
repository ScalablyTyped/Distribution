package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LicenseConfigurationAssociation extends js.Object {
  
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
  implicit class LicenseConfigurationAssociationOps[Self <: LicenseConfigurationAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAssociationTime(value: DateTime): Self = this.set("AssociationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociationTime: Self = this.set("AssociationTime", js.undefined)
    
    @scala.inline
    def setResourceArn(value: String): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceArn: Self = this.set("ResourceArn", js.undefined)
    
    @scala.inline
    def setResourceOwnerId(value: String): Self = this.set("ResourceOwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceOwnerId: Self = this.set("ResourceOwnerId", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
  }
}
