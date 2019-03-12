package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Queue extends js.Object {
  val length: scala.Double
  def clear(): scala.Unit
  def contains(item: js.Any): scala.Boolean
  def dequeue(): js.Any
  def enqueue(item: js.Any): scala.Unit
  def peek(): js.Any
  def sort(compareFunction: cesiumLib.cesiumMod.CesiumNs.QueueNs.Comparator): scala.Unit
}

object Queue {
  @scala.inline
  def apply(
    clear: () => scala.Unit,
    contains: js.Any => scala.Boolean,
    dequeue: () => js.Any,
    enqueue: js.Any => scala.Unit,
    length: scala.Double,
    peek: () => js.Any,
    sort: cesiumLib.cesiumMod.CesiumNs.QueueNs.Comparator => scala.Unit
  ): Queue = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), contains = js.Any.fromFunction1(contains), dequeue = js.Any.fromFunction0(dequeue), enqueue = js.Any.fromFunction1(enqueue), length = length, peek = js.Any.fromFunction0(peek), sort = js.Any.fromFunction1(sort))
  
    __obj.asInstanceOf[Queue]
  }
}

