package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RootNodeName extends StObject {
  
  var componentProperty: String
  
  var rootNodeName: String
  
  var states: js.Array[String]
}
object RootNodeName {
  
  inline def apply(componentProperty: String, rootNodeName: String, states: js.Array[String]): RootNodeName = {
    val __obj = js.Dynamic.literal(componentProperty = componentProperty.asInstanceOf[js.Any], rootNodeName = rootNodeName.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootNodeName]
  }
  
  extension [Self <: RootNodeName](x: Self) {
    
    inline def setComponentProperty(value: String): Self = StObject.set(x, "componentProperty", value.asInstanceOf[js.Any])
    
    inline def setRootNodeName(value: String): Self = StObject.set(x, "rootNodeName", value.asInstanceOf[js.Any])
    
    inline def setStates(value: js.Array[String]): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    inline def setStatesVarargs(value: String*): Self = StObject.set(x, "states", js.Array(value :_*))
  }
}
