package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RootNodeName extends js.Object {
  
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
  implicit class RootNodeNameOps[Self <: RootNodeName] (val x: Self) extends AnyVal {
    
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
    def setComponentProperty(value: String): Self = this.set("componentProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNodeName(value: String): Self = this.set("rootNodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatesVarargs(value: String*): Self = this.set("states", js.Array(value :_*))
    
    @scala.inline
    def setStates(value: js.Array[String]): Self = this.set("states", value.asInstanceOf[js.Any])
  }
}
