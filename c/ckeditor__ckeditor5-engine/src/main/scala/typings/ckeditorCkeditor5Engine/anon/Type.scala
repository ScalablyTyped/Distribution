package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.addRootAttribute
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.changeRootAttribute
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.removeRootAttribute
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type[N, O] extends StObject {
  
  var baseVersion: Double | Null
  
  var key: String
  
  var newValue: N
  
  var oldValue: O
  
  var root: ReturnType[FnCall]
  
  var `type`: addRootAttribute | removeRootAttribute | changeRootAttribute
}
object Type {
  
  inline def apply[N, O](
    key: String,
    newValue: N,
    oldValue: O,
    root: ReturnType[FnCall],
    `type`: addRootAttribute | removeRootAttribute | changeRootAttribute
  ): Type[N, O] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], baseVersion = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type[N, O]]
  }
  
  extension [Self <: Type[?, ?], N, O](x: Self & (Type[N, O])) {
    
    inline def setBaseVersion(value: Double): Self = StObject.set(x, "baseVersion", value.asInstanceOf[js.Any])
    
    inline def setBaseVersionNull: Self = StObject.set(x, "baseVersion", null)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setNewValue(value: N): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: O): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: ReturnType[FnCall]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setType(value: addRootAttribute | removeRootAttribute | changeRootAttribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
