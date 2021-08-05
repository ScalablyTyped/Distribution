package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Entity extends StObject {
  
  /**
    * The entity ID. If you do not know the entityId, you can pass unknown, which is areserved string literal.
    */
  var entityId: identifier
  
  /**
    * The entity type.
    */
  var entityType: String
}
object Entity {
  
  inline def apply(entityId: identifier, entityType: String): Entity = {
    val __obj = js.Dynamic.literal(entityId = entityId.asInstanceOf[js.Any], entityType = entityType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entity]
  }
  
  extension [Self <: Entity](x: Self) {
    
    inline def setEntityId(value: identifier): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    inline def setEntityType(value: String): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
  }
}
