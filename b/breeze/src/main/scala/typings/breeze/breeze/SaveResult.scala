package typings.breeze.breeze

import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveResult extends StObject {
  
  var XHR: XMLHttpRequest = js.native
  
  var entities: js.Array[Entity] = js.native
  
  var keyMappings: js.Array[KeyMapping] = js.native
}
object SaveResult {
  
  @scala.inline
  def apply(XHR: XMLHttpRequest, entities: js.Array[Entity], keyMappings: js.Array[KeyMapping]): SaveResult = {
    val __obj = js.Dynamic.literal(XHR = XHR.asInstanceOf[js.Any], entities = entities.asInstanceOf[js.Any], keyMappings = keyMappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveResult]
  }
  
  @scala.inline
  implicit class SaveResultMutableBuilder[Self <: SaveResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntities(value: js.Array[Entity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesVarargs(value: Entity*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    @scala.inline
    def setKeyMappings(value: js.Array[KeyMapping]): Self = StObject.set(x, "keyMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyMappingsVarargs(value: KeyMapping*): Self = StObject.set(x, "keyMappings", js.Array(value :_*))
    
    @scala.inline
    def setXHR(value: XMLHttpRequest): Self = StObject.set(x, "XHR", value.asInstanceOf[js.Any])
  }
}
