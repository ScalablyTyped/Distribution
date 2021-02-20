package typings.breeze.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityByKeyResult extends StObject {
  
  var entity: Entity = js.native
  
  var entityKey: EntityKey = js.native
  
  var fromCache: Boolean = js.native
}
object EntityByKeyResult {
  
  @scala.inline
  def apply(entity: Entity, entityKey: EntityKey, fromCache: Boolean): EntityByKeyResult = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], entityKey = entityKey.asInstanceOf[js.Any], fromCache = fromCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityByKeyResult]
  }
  
  @scala.inline
  implicit class EntityByKeyResultMutableBuilder[Self <: EntityByKeyResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntity(value: Entity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityKey(value: EntityKey): Self = StObject.set(x, "entityKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromCache(value: Boolean): Self = StObject.set(x, "fromCache", value.asInstanceOf[js.Any])
  }
}
