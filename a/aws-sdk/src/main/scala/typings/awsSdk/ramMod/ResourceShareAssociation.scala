package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceShareAssociation extends js.Object {
  
  /**
    * The associated entity. For resource associations, this is the ARN of the resource. For principal associations, this is the ID of an AWS account or the ARN of an OU or organization from AWS Organizations.
    */
  var associatedEntity: js.UndefOr[String] = js.native
  
  /**
    * The association type.
    */
  var associationType: js.UndefOr[ResourceShareAssociationType] = js.native
  
  /**
    * The time when the association was created.
    */
  var creationTime: js.UndefOr[DateTime] = js.native
  
  /**
    * Indicates whether the principal belongs to the same AWS organization as the AWS account that owns the resource share.
    */
  var external: js.UndefOr[Boolean] = js.native
  
  /**
    * The time when the association was last updated.
    */
  var lastUpdatedTime: js.UndefOr[DateTime] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  var resourceShareArn: js.UndefOr[String] = js.native
  
  /**
    * The name of the resource share.
    */
  var resourceShareName: js.UndefOr[String] = js.native
  
  /**
    * The status of the association.
    */
  var status: js.UndefOr[ResourceShareAssociationStatus] = js.native
  
  /**
    * A message about the status of the association.
    */
  var statusMessage: js.UndefOr[String] = js.native
}
object ResourceShareAssociation {
  
  @scala.inline
  def apply(): ResourceShareAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceShareAssociation]
  }
  
  @scala.inline
  implicit class ResourceShareAssociationOps[Self <: ResourceShareAssociation] (val x: Self) extends AnyVal {
    
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
    def setAssociatedEntity(value: String): Self = this.set("associatedEntity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociatedEntity: Self = this.set("associatedEntity", js.undefined)
    
    @scala.inline
    def setAssociationType(value: ResourceShareAssociationType): Self = this.set("associationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociationType: Self = this.set("associationType", js.undefined)
    
    @scala.inline
    def setCreationTime(value: DateTime): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setExternal(value: Boolean): Self = this.set("external", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternal: Self = this.set("external", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: DateTime): Self = this.set("lastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedTime: Self = this.set("lastUpdatedTime", js.undefined)
    
    @scala.inline
    def setResourceShareArn(value: String): Self = this.set("resourceShareArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceShareArn: Self = this.set("resourceShareArn", js.undefined)
    
    @scala.inline
    def setResourceShareName(value: String): Self = this.set("resourceShareName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceShareName: Self = this.set("resourceShareName", js.undefined)
    
    @scala.inline
    def setStatus(value: ResourceShareAssociationStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusMessage: Self = this.set("statusMessage", js.undefined)
  }
}
