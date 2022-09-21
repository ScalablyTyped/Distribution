package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityDescription extends StObject {
  
  /**
    * The entity ARN.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The time at which the entity was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The definition document of the entity.
    */
  var definition: js.UndefOr[DefinitionDocument] = js.undefined
  
  /**
    * The entity ID.
    */
  var id: js.UndefOr[Urn] = js.undefined
  
  /**
    * The entity type.
    */
  var `type`: js.UndefOr[EntityType] = js.undefined
}
object EntityDescription {
  
  inline def apply(): EntityDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityDescription]
  }
  
  extension [Self <: EntityDescription](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setDefinition(value: DefinitionDocument): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setId(value: Urn): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setType(value: EntityType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
