package typings.awsSdk.marketplacecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntitySummary extends StObject {
  
  /**
    * The ARN associated with the unique identifier for the entity.
    */
  var EntityArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The unique identifier for the entity.
    */
  var EntityId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The type of the entity.
    */
  var EntityType: js.UndefOr[typings.awsSdk.marketplacecatalogMod.EntityType] = js.undefined
  
  /**
    * The last time the entity was published, using ISO 8601 format (2018-02-27T13:45:22Z).
    */
  var LastModifiedDate: js.UndefOr[StringValue] = js.undefined
  
  /**
    * The name for the entity. This value is not unique. It is defined by the seller.
    */
  var Name: js.UndefOr[StringValue] = js.undefined
  
  /**
    * The visibility status of the entity to buyers. This value can be Public (everyone can view the entity), Limited (the entity is visible to limited accounts only), or Restricted (the entity was published and then unpublished and only existing buyers can view it). 
    */
  var Visibility: js.UndefOr[StringValue] = js.undefined
}
object EntitySummary {
  
  @scala.inline
  def apply(): EntitySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntitySummary]
  }
  
  @scala.inline
  implicit class EntitySummaryMutableBuilder[Self <: EntitySummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityArn(value: ARN): Self = StObject.set(x, "EntityArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityArnUndefined: Self = StObject.set(x, "EntityArn", js.undefined)
    
    @scala.inline
    def setEntityId(value: ResourceId): Self = StObject.set(x, "EntityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityIdUndefined: Self = StObject.set(x, "EntityId", js.undefined)
    
    @scala.inline
    def setEntityType(value: EntityType): Self = StObject.set(x, "EntityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypeUndefined: Self = StObject.set(x, "EntityType", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: StringValue): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    @scala.inline
    def setName(value: StringValue): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setVisibility(value: StringValue): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "Visibility", js.undefined)
  }
}
