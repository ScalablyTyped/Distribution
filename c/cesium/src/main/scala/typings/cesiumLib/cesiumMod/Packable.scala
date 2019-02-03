package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line no-unnecessary-class
@JSImport("cesium", "Packable")
@js.native
abstract class Packable ()
  extends cesiumLib.cesiumMod.CesiumNs.Packable

/* static members */
@JSImport("cesium", "Packable")
@js.native
object Packable extends js.Object {
  var packedLength: scala.Double = js.native
  def pack(value: js.Any, array: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def pack(value: js.Any, array: js.Array[scala.Double], startingIndex: scala.Double): js.Array[scala.Double] = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.CesiumNs.Packable = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.CesiumNs.Packable = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double, result: js.Any): cesiumLib.cesiumMod.CesiumNs.Packable = js.native
}

