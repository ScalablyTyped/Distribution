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

