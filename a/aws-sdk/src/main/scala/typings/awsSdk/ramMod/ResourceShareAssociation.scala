package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceShareAssociation extends StObject {
  
  /**
    * The associated entity. For resource associations, this is the ARN of the resource. For principal associations, this is the ID of an AWS account or the ARN of an OU or organization from AWS Organizations.
    */
  var associatedEntity: js.UndefOr[String] = js.undefined
  
  /**
    * The association type.
    */
  var associationType: js.UndefOr[ResourceShareAssociationType] = js.undefined
  
  /**
    * The time when the association was created.
    */
  var creationTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * Indicates whether the principal belongs to the same AWS organization as the AWS account that owns the resource share.
    */
  var external: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The time when the association was last updated.
    */
  var lastUpdatedTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  var resourceShareArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the resource share.
    */
  var resourceShareName: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the association.
    */
  var status: js.UndefOr[ResourceShareAssociationStatus] = js.undefined
  
  /**
    * A message about the status of the association.
    */
  var statusMessage: js.UndefOr[String] = js.undefined
}
object ResourceShareAssociation {
  
  @scala.inline
  def apply(): ResourceShareAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceShareAssociation]
  }
  
  @scala.inline
  implicit class ResourceShareAssociationMutableBuilder[Self <: ResourceShareAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociatedEntity(value: String): Self = StObject.set(x, "associatedEntity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatedEntityUndefined: Self = StObject.set(x, "associatedEntity", js.undefined)
    
    @scala.inline
    def setAssociationType(value: ResourceShareAssociationType): Self = StObject.set(x, "associationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationTypeUndefined: Self = StObject.set(x, "associationType", js.undefined)
    
    @scala.inline
    def setCreationTime(value: DateTime): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setExternal(value: Boolean): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: DateTime): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimeUndefined: Self = StObject.set(x, "lastUpdatedTime", js.undefined)
    
    @scala.inline
    def setResourceShareArn(value: String): Self = StObject.set(x, "resourceShareArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceShareArnUndefined: Self = StObject.set(x, "resourceShareArn", js.undefined)
    
    @scala.inline
    def setResourceShareName(value: String): Self = StObject.set(x, "resourceShareName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceShareNameUndefined: Self = StObject.set(x, "resourceShareName", js.undefined)
    
    @scala.inline
    def setStatus(value: ResourceShareAssociationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
