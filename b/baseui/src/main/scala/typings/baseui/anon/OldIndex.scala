package typings.baseui.anon

import typings.std.ClientRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OldIndex extends StObject {
  
  var newIndex: Double
  
  var oldIndex: Double
  
  var targetRect: ClientRect
}
object OldIndex {
  
  inline def apply(newIndex: Double, oldIndex: Double, targetRect: ClientRect): OldIndex = {
    val __obj = js.Dynamic.literal(newIndex = newIndex.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any], targetRect = targetRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldIndex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OldIndex] (val x: Self) extends AnyVal {
    
    inline def setNewIndex(value: Double): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
    
    inline def setOldIndex(value: Double): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
    
    inline def setTargetRect(value: ClientRect): Self = StObject.set(x, "targetRect", value.asInstanceOf[js.Any])
  }
}
