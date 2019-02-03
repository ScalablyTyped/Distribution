package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a scene to be rendered by the engine.
  * @see http://doc.babylonjs.com/features/scene
  */
@JSImport("babylonjs", "Scene")
@js.native
class Scene protected ()
  extends babylonjsLib.BABYLONNs.Scene {
  /**
    * Creates a new Scene
    * @param engine defines the engine to use to render this scene
    */
  def this(engine: babylonjsLib.BABYLONNs.Engine) = this()
}

/* static members */
@JSImport("babylonjs", "Scene")
@js.native
object Scene extends js.Object {
  /** Time in milliseconds with two consecutive clicks will be considered as a double click */
  var DoubleClickDelay: scala.Double = js.native
  /** The distance in pixel that you have to move to prevent some events */
  var DragMovementThreshold: scala.Double = js.native
  /** If you need to check double click without raising a single click at first click, enable this flag */
  var ExclusiveDoubleClickMode: scala.Boolean = js.native
  /** The fog density is following an exponential function */
  val FOGMODE_EXP: scala.Double = js.native
  /** The fog density is following an exponential function faster than FOGMODE_EXP */
  val FOGMODE_EXP2: scala.Double = js.native
  /** The fog density is following a linear function. */
  val FOGMODE_LINEAR: scala.Double = js.native
  /** The fog is deactivated */
  val FOGMODE_NONE: scala.Double = js.native
  /** Time in milliseconds to wait to raise long press events if button is still pressed */
  var LongPressDelay: scala.Double = js.native
  /**
    * Gets or sets the maximum deltatime when deterministic lock step is enabled
    * @see http://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
    */
  var MaxDeltaTime: scala.Double = js.native
  /**
    * Gets or sets the minimum deltatime when deterministic lock step is enabled
    * @see http://doc.babylonjs.com/babylon101/animations#deterministic-lockstep
    */
  var MinDeltaTime: scala.Double = js.native
  var _uniqueIdCounter: js.Any = js.native
}

