package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PressedNodeName extends StObject {
  
  var pressedNodeName: String = js.native
  
  var unpressedNodeName: String = js.native
  
  var valueNodeName: String = js.native
}
object PressedNodeName {
  
  @scala.inline
  def apply(pressedNodeName: String, unpressedNodeName: String, valueNodeName: String): PressedNodeName = {
    val __obj = js.Dynamic.literal(pressedNodeName = pressedNodeName.asInstanceOf[js.Any], unpressedNodeName = unpressedNodeName.asInstanceOf[js.Any], valueNodeName = valueNodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PressedNodeName]
  }
  
  @scala.inline
  implicit class PressedNodeNameMutableBuilder[Self <: PressedNodeName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPressedNodeName(value: String): Self = StObject.set(x, "pressedNodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnpressedNodeName(value: String): Self = StObject.set(x, "unpressedNodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNodeName(value: String): Self = StObject.set(x, "valueNodeName", value.asInstanceOf[js.Any])
  }
}
