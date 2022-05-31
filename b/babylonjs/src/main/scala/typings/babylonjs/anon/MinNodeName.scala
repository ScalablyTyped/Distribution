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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinNodeName extends StObject {
  
  /**
    * What property will be animated
    */
  var componentProperty: xAxis | yAxis | button | state
  
  /**
    * Max movement node
    */
  var maxNodeName: js.UndefOr[String] = js.undefined
  
  /**
    * Minimum movement node
    */
  var minNodeName: js.UndefOr[String] = js.undefined
  
  /**
    * What states influence this visual response
    */
  var states: js.Array[MotionControllerComponentStateType]
  
  /**
    * Base node name to move. Its position will be calculated according to the min and max nodes
    */
  var valueNodeName: js.UndefOr[String] = js.undefined
  
  /**
    * Type of animation - movement or visibility
    */
  var valueNodeProperty: transform | visibility
}
object MinNodeName {
  
  inline def apply(
    componentProperty: xAxis | yAxis | button | state,
    states: js.Array[MotionControllerComponentStateType],
    valueNodeProperty: transform | visibility
  ): MinNodeName = {
    val __obj = js.Dynamic.literal(componentProperty = componentProperty.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any], valueNodeProperty = valueNodeProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinNodeName]
  }
  
  extension [Self <: MinNodeName](x: Self) {
    
    inline def setComponentProperty(value: xAxis | yAxis | button | state): Self = StObject.set(x, "componentProperty", value.asInstanceOf[js.Any])
    
    inline def setMaxNodeName(value: String): Self = StObject.set(x, "maxNodeName", value.asInstanceOf[js.Any])
    
    inline def setMaxNodeNameUndefined: Self = StObject.set(x, "maxNodeName", js.undefined)
    
    inline def setMinNodeName(value: String): Self = StObject.set(x, "minNodeName", value.asInstanceOf[js.Any])
    
    inline def setMinNodeNameUndefined: Self = StObject.set(x, "minNodeName", js.undefined)
    
    inline def setStates(value: js.Array[MotionControllerComponentStateType]): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    inline def setStatesVarargs(value: MotionControllerComponentStateType*): Self = StObject.set(x, "states", js.Array(value :_*))
    
    inline def setValueNodeName(value: String): Self = StObject.set(x, "valueNodeName", value.asInstanceOf[js.Any])
    
    inline def setValueNodeNameUndefined: Self = StObject.set(x, "valueNodeName", js.undefined)
    
    inline def setValueNodeProperty(value: transform | visibility): Self = StObject.set(x, "valueNodeProperty", value.asInstanceOf[js.Any])
  }
}
