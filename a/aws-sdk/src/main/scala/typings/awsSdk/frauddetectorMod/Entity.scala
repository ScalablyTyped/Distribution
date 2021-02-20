package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Entity extends StObject {
  
  /**
    * The entity ID. If you do not know the entityId, you can pass unknown, which is areserved string literal.
    */
  var entityId: identifier = js.native
  
  /**
    * The entity type.
    */
  var entityType: String = js.native
}
object Entity {
  
  @scala.inline
  def apply(entityId: identifier, entityType: String): Entity = {
    val __obj = js.Dynamic.literal(entityId = entityId.asInstanceOf[js.Any], entityType = entityType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entity]
  }
  
  @scala.inline
  implicit class EntityMutableBuilder[Self <: Entity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityId(value: identifier): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityType(value: String): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
  }
}
