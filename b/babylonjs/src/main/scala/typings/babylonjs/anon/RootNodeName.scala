package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RootNodeName extends StObject {
  
  var componentProperty: String = js.native
  
  var rootNodeName: String = js.native
  
  var states: js.Array[String] = js.native
}
object RootNodeName {
  
  @scala.inline
  def apply(componentProperty: String, rootNodeName: String, states: js.Array[String]): RootNodeName = {
    val __obj = js.Dynamic.literal(componentProperty = componentProperty.asInstanceOf[js.Any], rootNodeName = rootNodeName.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootNodeName]
  }
  
  @scala.inline
  implicit class RootNodeNameMutableBuilder[Self <: RootNodeName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentProperty(value: String): Self = StObject.set(x, "componentProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNodeName(value: String): Self = StObject.set(x, "rootNodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStates(value: js.Array[String]): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatesVarargs(value: String*): Self = StObject.set(x, "states", js.Array(value :_*))
  }
}
