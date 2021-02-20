package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object InputManager {
  
  @JSGlobal("BABYLON.InputManager")
  @js.native
  val ^ : js.Any = js.native
  
  /** Time in milliseconds with two consecutive clicks will be considered as a double click */
  @JSGlobal("BABYLON.InputManager.DoubleClickDelay")
  @js.native
  def DoubleClickDelay: Double = js.native
  @scala.inline
  def DoubleClickDelay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DoubleClickDelay")(x.asInstanceOf[js.Any])
  
  /** The distance in pixel that you have to move to prevent some events */
  @JSGlobal("BABYLON.InputManager.DragMovementThreshold")
  @js.native
  def DragMovementThreshold: Double = js.native
  @scala.inline
  def DragMovementThreshold_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DragMovementThreshold")(x.asInstanceOf[js.Any])
  
  /** If you need to check double click without raising a single click at first click, enable this flag */
  @JSGlobal("BABYLON.InputManager.ExclusiveDoubleClickMode")
  @js.native
  def ExclusiveDoubleClickMode: Boolean = js.native
  @scala.inline
  def ExclusiveDoubleClickMode_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExclusiveDoubleClickMode")(x.asInstanceOf[js.Any])
  
  /** Time in milliseconds to wait to raise long press events if button is still pressed */
  @JSGlobal("BABYLON.InputManager.LongPressDelay")
  @js.native
  def LongPressDelay: Double = js.native
  @scala.inline
  def LongPressDelay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LongPressDelay")(x.asInstanceOf[js.Any])
}
