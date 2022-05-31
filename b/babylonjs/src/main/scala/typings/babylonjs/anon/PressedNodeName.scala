package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PressedNodeName extends StObject {
  
  var pressedNodeName: String
  
  var unpressedNodeName: String
  
  var valueNodeName: String
}
object PressedNodeName {
  
  inline def apply(pressedNodeName: String, unpressedNodeName: String, valueNodeName: String): PressedNodeName = {
    val __obj = js.Dynamic.literal(pressedNodeName = pressedNodeName.asInstanceOf[js.Any], unpressedNodeName = unpressedNodeName.asInstanceOf[js.Any], valueNodeName = valueNodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PressedNodeName]
  }
  
  extension [Self <: PressedNodeName](x: Self) {
    
    inline def setPressedNodeName(value: String): Self = StObject.set(x, "pressedNodeName", value.asInstanceOf[js.Any])
    
    inline def setUnpressedNodeName(value: String): Self = StObject.set(x, "unpressedNodeName", value.asInstanceOf[js.Any])
    
    inline def setValueNodeName(value: String): Self = StObject.set(x, "valueNodeName", value.asInstanceOf[js.Any])
  }
}
