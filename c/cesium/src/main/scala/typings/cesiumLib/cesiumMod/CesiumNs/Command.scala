package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
  var afterExecute: Event
  var beforeExecute: Event
  var canExecute: scala.Boolean
}

object Command {
  @scala.inline
  def apply(afterExecute: Event, beforeExecute: Event, canExecute: scala.Boolean): Command = {
    val __obj = js.Dynamic.literal(afterExecute = afterExecute, beforeExecute = beforeExecute, canExecute = canExecute)
  
    __obj.asInstanceOf[Command]
  }
}

