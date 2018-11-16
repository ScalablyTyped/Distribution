package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents a gamepad control stick position
     */
@JSGlobal("BABYLON.StickValues")
@js.native
class StickValues protected () extends js.Object {
  /**
           * Initializes the gamepad x and y control stick values
           * @param x The x component of the gamepad control stick value
           * @param y The y component of the gamepad control stick value
           */
  def this(/**
           * The x component of the control stick
           */
  x: scala.Double, /**
           * The y component of the control stick
           */
  y: scala.Double) = this()
  /**
           * The x component of the control stick
           */
  var x: scala.Double = js.native
  /**
           * The y component of the control stick
           */
  var y: scala.Double = js.native
}

