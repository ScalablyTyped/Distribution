package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Queue")
@js.native
class Queue () extends js.Object {
  val length: scala.Double = js.native
  def clear(): scala.Unit = js.native
  def contains(item: js.Any): scala.Boolean = js.native
  def dequeue(): js.Any = js.native
  def enqueue(item: js.Any): scala.Unit = js.native
  def peek(): js.Any = js.native
  def sort(compareFunction: cesiumLib.cesiumMod.QueueNs.Comparator): scala.Unit = js.native
}

