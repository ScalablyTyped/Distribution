package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Defines the WebVRController object that represents controllers tracked in 3D space
     */
@JSImport("babylonjs", "WebVRController")
@js.native
abstract class WebVRController protected ()
  extends babylonjsLib.BABYLONNs.WebVRController {
  /**
           * Creates a new WebVRController from a gamepad
           * @param vrGamepad the gamepad that the WebVRController should be created from
           */
  def this(vrGamepad: js.Any) = this()
}

