package typings.babylonjs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.BABYLON.MotionControllerComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchPointNodeName extends StObject {
  
  /**
    * The indices of this component in the gamepad object
    */
  var gamepadIndices: Button = js.native
  
  /**
    * The mesh's root node name
    */
  var rootNodeName: String = js.native
  
  /**
    * If touch enabled, what is the name of node to display user feedback
    */
  var touchPointNodeName: js.UndefOr[String] = js.native
  
  /**
    * The type of input the component outputs
    */
  var `type`: MotionControllerComponentType = js.native
  
  /**
    * Animation definitions for this model
    */
  var visualResponses: StringDictionary[MinNodeName] = js.native
}
object TouchPointNodeName {
  
  @scala.inline
  def apply(
    gamepadIndices: Button,
    rootNodeName: String,
    `type`: MotionControllerComponentType,
    visualResponses: StringDictionary[MinNodeName]
  ): TouchPointNodeName = {
    val __obj = js.Dynamic.literal(gamepadIndices = gamepadIndices.asInstanceOf[js.Any], rootNodeName = rootNodeName.asInstanceOf[js.Any], visualResponses = visualResponses.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchPointNodeName]
  }
  
  @scala.inline
  implicit class TouchPointNodeNameMutableBuilder[Self <: TouchPointNodeName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGamepadIndices(value: Button): Self = StObject.set(x, "gamepadIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNodeName(value: String): Self = StObject.set(x, "rootNodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchPointNodeName(value: String): Self = StObject.set(x, "touchPointNodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchPointNodeNameUndefined: Self = StObject.set(x, "touchPointNodeName", js.undefined)
    
    @scala.inline
    def setType(value: MotionControllerComponentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisualResponses(value: StringDictionary[MinNodeName]): Self = StObject.set(x, "visualResponses", value.asInstanceOf[js.Any])
  }
}
