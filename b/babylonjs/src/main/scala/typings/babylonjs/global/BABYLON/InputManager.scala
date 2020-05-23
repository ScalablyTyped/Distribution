package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.InputManager")
@js.native
class InputManager protected ()
  extends typings.babylonjs.BABYLON.InputManager {
  /**
    * Creates a new InputManager
    * @param scene defines the hosting scene
    */
  def this(scene: typings.babylonjs.BABYLON.Scene) = this()
}

/* static members */
@JSGlobal("BABYLON.InputManager")
@js.native
object InputManager extends js.Object {
  /** Time in milliseconds with two consecutive clicks will be considered as a double click */
  var DoubleClickDelay: Double = js.native
  /** The distance in pixel that you have to move to prevent some events */
  var DragMovementThreshold: Double = js.native
  /** If you need to check double click without raising a single click at first click, enable this flag */
  var ExclusiveDoubleClickMode: Boolean = js.native
  /** Time in milliseconds to wait to raise long press events if button is still pressed */
  var LongPressDelay: Double = js.native
}

