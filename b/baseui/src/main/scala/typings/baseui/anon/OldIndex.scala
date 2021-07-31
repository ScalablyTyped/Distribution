package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OldIndex extends StObject {
  
  var newIndex: Double
  
  var oldIndex: Double
}
object OldIndex {
  
  @scala.inline
  def apply(newIndex: Double, oldIndex: Double): OldIndex = {
    val __obj = js.Dynamic.literal(newIndex = newIndex.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldIndex]
  }
  
  @scala.inline
  implicit class OldIndexMutableBuilder[Self <: OldIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewIndex(value: Double): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldIndex(value: Double): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
  }
}
