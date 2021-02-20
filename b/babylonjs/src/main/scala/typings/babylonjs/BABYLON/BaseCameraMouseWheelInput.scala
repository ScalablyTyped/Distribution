package typings.babylonjs.BABYLON

import typings.babylonjs.anon.WheelDeltaX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseCameraMouseWheelInput extends ICameraInput[Camera] {
  
  /**
    * Firefox uses a different scheme to report scroll distances to other
    * browsers. Rather than use complicated methods to calculate the exact
    * multiple we need to apply, let's just cheat and use a constant.
    * https://developer.mozilla.org/en-US/docs/Web/API/WheelEvent/deltaMode
    * https://stackoverflow.com/questions/20110224/what-is-the-height-of-a-line-in-a-wheel-event-deltamode-dom-delta-line
    */
  val _ffMultiplier: js.Any = js.native
  
  /**
    * Different event attributes for wheel data fall into a few set ranges.
    * Some relevant but dated date here:
    * https://stackoverflow.com/questions/5527601/normalizing-mousewheel-speed-across-browsers
    */
  val _normalize: js.Any = js.native
  
  var _observer: js.Any = js.native
  
  var _wheel: js.Any = js.native
  
  /**
    * Incremental value of multiple mouse wheel movements of the X axis.
    * Should be zero-ed when read.
    */
  var _wheelDeltaX: Double = js.native
  
  /**
    * Incremental value of multiple mouse wheel movements of the Y axis.
    * Should be zero-ed when read.
    */
  var _wheelDeltaY: Double = js.native
  
  /**
    * Incremental value of multiple mouse wheel movements of the Z axis.
    * Should be zero-ed when read.
    */
  var _wheelDeltaZ: Double = js.native
  
  /**
    * Defines the camera the input is attached to.
    */
  @JSName("camera")
  var camera_BaseCameraMouseWheelInput: Camera = js.native
  
  /**
    * Called for each rendered frame.
    */
  @JSName("checkInputs")
  def checkInputs_MBaseCameraMouseWheelInput(): Unit = js.native
  
  /**
    * Observable for when a mouse wheel move event occurs.
    */
  var onChangedObservable: Observable[WheelDeltaX] = js.native
  
  /**
    * How fast is the camera moves in relation to X axis mouseWheel events.
    * Use negative value to reverse direction.
    */
  var wheelPrecisionX: Double = js.native
  
  /**
    * How fast is the camera moves in relation to Y axis mouseWheel events.
    * Use negative value to reverse direction.
    */
  var wheelPrecisionY: Double = js.native
  
  /**
    * How fast is the camera moves in relation to Z axis mouseWheel events.
    * Use negative value to reverse direction.
    */
  var wheelPrecisionZ: Double = js.native
}
