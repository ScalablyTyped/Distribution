package typings.babylonjs.anon

import typings.babylonjs.BABYLON.MotionControllerComponentStateType
import typings.babylonjs.babylonjsStrings.button
import typings.babylonjs.babylonjsStrings.state
import typings.babylonjs.babylonjsStrings.transform
import typings.babylonjs.babylonjsStrings.visibility
import typings.babylonjs.babylonjsStrings.xAxis
import typings.babylonjs.babylonjsStrings.yAxis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MinNodeName extends StObject {
  
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
object MinNodeName {
  
  @scala.inline
  def apply(
    componentProperty: xAxis | yAxis | button | state,
    states: js.Array[MotionControllerComponentStateType],
    valueNodeProperty: transform | visibility
  ): MinNodeName = {
    val __obj = js.Dynamic.literal(componentProperty = componentProperty.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any], valueNodeProperty = valueNodeProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinNodeName]
  }
  
  @scala.inline
  implicit class MinNodeNameMutableBuilder[Self <: MinNodeName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentProperty(value: xAxis | yAxis | button | state): Self = StObject.set(x, "componentProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxNodeName(value: String): Self = StObject.set(x, "maxNodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxNodeNameUndefined: Self = StObject.set(x, "maxNodeName", js.undefined)
    
    @scala.inline
    def setMinNodeName(value: String): Self = StObject.set(x, "minNodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinNodeNameUndefined: Self = StObject.set(x, "minNodeName", js.undefined)
    
    @scala.inline
    def setStates(value: js.Array[MotionControllerComponentStateType]): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatesVarargs(value: MotionControllerComponentStateType*): Self = StObject.set(x, "states", js.Array(value :_*))
    
    @scala.inline
    def setValueNodeName(value: String): Self = StObject.set(x, "valueNodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNodeNameUndefined: Self = StObject.set(x, "valueNodeName", js.undefined)
    
    @scala.inline
    def setValueNodeProperty(value: transform | visibility): Self = StObject.set(x, "valueNodeProperty", value.asInstanceOf[js.Any])
  }
}
