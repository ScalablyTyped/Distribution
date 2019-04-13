package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "AssociativeArray")
@js.native
class AssociativeArray () extends js.Object {
  var length: scala.Double = js.native
  var values: js.Array[_] = js.native
  def contains(key: java.lang.String): scala.Boolean = js.native
  def contains(key: scala.Double): scala.Boolean = js.native
  def get(key: java.lang.String): js.Any = js.native
  def get(key: scala.Double): js.Any = js.native
  def remove(key: java.lang.String): scala.Boolean = js.native
  def remove(key: scala.Double): scala.Boolean = js.native
  def removeAll(): scala.Unit = js.native
  def set(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def set(key: scala.Double, value: js.Any): scala.Unit = js.native
}

