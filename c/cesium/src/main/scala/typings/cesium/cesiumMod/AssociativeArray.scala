package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "AssociativeArray")
@js.native
class AssociativeArray () extends js.Object {
  var length: Double = js.native
  var values: js.Array[_] = js.native
  def contains(key: String): Boolean = js.native
  def contains(key: Double): Boolean = js.native
  def get(key: String): js.Any = js.native
  def get(key: Double): js.Any = js.native
  def remove(key: String): Boolean = js.native
  def remove(key: Double): Boolean = js.native
  def removeAll(): Unit = js.native
  def set(key: String, value: js.Any): Unit = js.native
  def set(key: Double, value: js.Any): Unit = js.native
}

