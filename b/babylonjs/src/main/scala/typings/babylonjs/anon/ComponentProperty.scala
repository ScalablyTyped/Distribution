package typings.babylonjs.anon

import typings.babylonjs.babylonjsStrings.button
import typings.babylonjs.babylonjsStrings.state
import typings.babylonjs.babylonjsStrings.transform
import typings.babylonjs.babylonjsStrings.visibility
import typings.babylonjs.babylonjsStrings.xAxis
import typings.babylonjs.babylonjsStrings.yAxis
import typings.babylonjs.webXRAbstractMotionControllerMod.MotionControllerComponentStateType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentProperty extends js.Object {
  
  /**
    * What property will be animated
    */
  var componentProperty: xAxis | yAxis | button | state = js.native
  
  /**
    * Max movement node
    */
  var maxNodeName: js.UndefOr[String] = js.native
  
  /**
    * Minimum movement node
    */
  var minNodeName: js.UndefOr[String] = js.native
  
  /**
    * What states influence this visual response
    */
  var states: js.Array[MotionControllerComponentStateType] = js.native
  
  /**
    * Base node name to move. Its position will be calculated according to the min and max nodes
    */
  var valueNodeName: js.UndefOr[String] = js.native
  
  /**
    * Type of animation - movement or visibility
    */
  var valueNodeProperty: transform | visibility = js.native
}
object ComponentProperty {
  
  @scala.inline
  def apply(
    componentProperty: xAxis | yAxis | button | state,
    states: js.Array[MotionControllerComponentStateType],
    valueNodeProperty: transform | visibility
  ): ComponentProperty = {
    val __obj = js.Dynamic.literal(componentProperty = componentProperty.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any], valueNodeProperty = valueNodeProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentProperty]
  }
  
  @scala.inline
  implicit class ComponentPropertyOps[Self <: ComponentProperty] (val x: Self) extends AnyVal {
    
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
    def setComponentProperty(value: xAxis | yAxis | button | state): Self = this.set("componentProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatesVarargs(value: MotionControllerComponentStateType*): Self = this.set("states", js.Array(value :_*))
    
    @scala.inline
    def setStates(value: js.Array[MotionControllerComponentStateType]): Self = this.set("states", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNodeProperty(value: transform | visibility): Self = this.set("valueNodeProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxNodeName(value: String): Self = this.set("maxNodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxNodeName: Self = this.set("maxNodeName", js.undefined)
    
    @scala.inline
    def setMinNodeName(value: String): Self = this.set("minNodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinNodeName: Self = this.set("minNodeName", js.undefined)
    
    @scala.inline
    def setValueNodeName(value: String): Self = this.set("valueNodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueNodeName: Self = this.set("valueNodeName", js.undefined)
  }
}
