package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Queue")
@js.native
class Queue ()
  extends cesiumLib.cesiumMod.CesiumNs.Queue {
  /* CompleteClass */
  override val length: scala.Double = js.native
  /* CompleteClass */
  override def clear(): scala.Unit = js.native
  /* CompleteClass */
  override def contains(item: js.Any): scala.Boolean = js.native
  /* CompleteClass */
  override def dequeue(): js.Any = js.native
  /* CompleteClass */
  override def enqueue(item: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def peek(): js.Any = js.native
  /* CompleteClass */
  override def sort(compareFunction: cesiumLib.cesiumMod.CesiumNs.QueueNs.Comparator): scala.Unit = js.native
}

