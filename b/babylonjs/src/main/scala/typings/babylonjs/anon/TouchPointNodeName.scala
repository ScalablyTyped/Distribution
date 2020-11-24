package typings.babylonjs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.BABYLON.MotionControllerComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchPointNodeName extends js.Object {
  
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
  implicit class TouchPointNodeNameOps[Self <: TouchPointNodeName] (val x: Self) extends AnyVal {
    
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
    def setGamepadIndices(value: Button): Self = this.set("gamepadIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNodeName(value: String): Self = this.set("rootNodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MotionControllerComponentType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisualResponses(value: StringDictionary[MinNodeName]): Self = this.set("visualResponses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchPointNodeName(value: String): Self = this.set("touchPointNodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTouchPointNodeName: Self = this.set("touchPointNodeName", js.undefined)
  }
}
