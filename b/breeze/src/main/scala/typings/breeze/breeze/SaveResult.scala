package typings.breeze.breeze

import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveResult extends js.Object {
  
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
  implicit class SaveResultOps[Self <: SaveResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setXHR(value: XMLHttpRequest): Self = this.set("XHR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesVarargs(value: Entity*): Self = this.set("entities", js.Array(value :_*))
    
    @scala.inline
    def setEntities(value: js.Array[Entity]): Self = this.set("entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyMappingsVarargs(value: KeyMapping*): Self = this.set("keyMappings", js.Array(value :_*))
    
    @scala.inline
    def setKeyMappings(value: js.Array[KeyMapping]): Self = this.set("keyMappings", value.asInstanceOf[js.Any])
  }
}
