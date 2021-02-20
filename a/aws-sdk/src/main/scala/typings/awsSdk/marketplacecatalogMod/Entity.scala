package typings.awsSdk.marketplacecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Entity extends StObject {
  
  /**
    * The identifier for the entity.
    */
  var Identifier: js.UndefOr[typings.awsSdk.marketplacecatalogMod.Identifier] = js.native
  
  /**
    * The type of entity.
    */
  var Type: EntityType = js.native
}
object Entity {
  
  @scala.inline
  def apply(Type: EntityType): Entity = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entity]
  }
  
  @scala.inline
  implicit class EntityMutableBuilder[Self <: Entity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "Identifier", js.undefined)
    
    @scala.inline
    def setType(value: EntityType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
