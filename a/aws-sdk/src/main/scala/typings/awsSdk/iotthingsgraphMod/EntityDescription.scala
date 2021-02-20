package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityDescription extends StObject {
  
  /**
    * The entity ARN.
    */
  var arn: js.UndefOr[Arn] = js.native
  
  /**
    * The time at which the entity was created.
    */
  var createdAt: js.UndefOr[Timestamp] = js.native
  
  /**
    * The definition document of the entity.
    */
  var definition: js.UndefOr[DefinitionDocument] = js.native
  
  /**
    * The entity ID.
    */
  var id: js.UndefOr[Urn] = js.native
  
  /**
    * The entity type.
    */
  var `type`: js.UndefOr[EntityType] = js.native
}
object EntityDescription {
  
  @scala.inline
  def apply(): EntityDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityDescription]
  }
  
  @scala.inline
  implicit class EntityDescriptionMutableBuilder[Self <: EntityDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setDefinition(value: DefinitionDocument): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    @scala.inline
    def setId(value: Urn): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setType(value: EntityType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
