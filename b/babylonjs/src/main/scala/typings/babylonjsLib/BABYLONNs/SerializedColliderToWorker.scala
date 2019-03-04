package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
trait SerializedColliderToWorker extends js.Object {
  var position: js.Array[scala.Double]
  var radius: js.Array[scala.Double]
  var velocity: js.Array[scala.Double]
}

object SerializedColliderToWorker {
  @scala.inline
  def apply(position: js.Array[scala.Double], radius: js.Array[scala.Double], velocity: js.Array[scala.Double]): SerializedColliderToWorker = {
    val __obj = js.Dynamic.literal(position = position, radius = radius, velocity = velocity)
  
    __obj.asInstanceOf[SerializedColliderToWorker]
  }
}

