package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * An interface which manages callbacks for gamepad button changes
     */

trait GamepadButtonChanges extends js.Object {
  /**
           * Called when a gamepad has been changed
           */
  var changed: scala.Boolean
  /**
           * Called when a gamepad press event has been triggered
           */
  var pressChanged: scala.Boolean
  /**
           * Called when a touch event has been triggered
           */
  var touchChanged: scala.Boolean
  /**
           * Called when a value has changed
           */
  var valueChanged: scala.Boolean
}

