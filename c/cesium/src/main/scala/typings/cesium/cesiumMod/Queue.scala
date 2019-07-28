package typings.cesium.cesiumMod

import typings.cesium.cesiumMod.QueueNs.Comparator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Queue")
@js.native
class Queue () extends js.Object {
  val length: Double = js.native
  def clear(): Unit = js.native
  def contains(item: js.Any): Boolean = js.native
  def dequeue(): js.Any = js.native
  def enqueue(item: js.Any): Unit = js.native
  def peek(): js.Any = js.native
  def sort(compareFunction: Comparator): Unit = js.native
}

