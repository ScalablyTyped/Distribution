package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Key extends StObject {
  
  var expanded: js.Array[typings.react.mod.Key]
  
  var key: typings.react.mod.Key
}
object Key {
  
  inline def apply(expanded: js.Array[typings.react.mod.Key], key: typings.react.mod.Key): Key = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
    
    inline def setExpanded(value: js.Array[typings.react.mod.Key]): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExpandedVarargs(value: typings.react.mod.Key*): Self = StObject.set(x, "expanded", js.Array(value*))
    
    inline def setKey(value: typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
