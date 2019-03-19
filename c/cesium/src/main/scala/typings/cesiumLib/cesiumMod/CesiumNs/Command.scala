package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
  var afterExecute: Event[js.Array[_]]
  var beforeExecute: Event[js.Array[_]]
  var canExecute: scala.Boolean
}

object Command {
  @scala.inline
  def apply(afterExecute: Event[js.Array[_]], beforeExecute: Event[js.Array[_]], canExecute: scala.Boolean): Command = {
    val __obj = js.Dynamic.literal(afterExecute = afterExecute, beforeExecute = beforeExecute, canExecute = canExecute)
  
    __obj.asInstanceOf[Command]
  }
}

