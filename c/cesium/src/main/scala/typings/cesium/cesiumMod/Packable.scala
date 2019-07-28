package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line no-unnecessary-class
@JSImport("cesium", "Packable")
@js.native
abstract class Packable () extends js.Object

/* static members */
@JSImport("cesium", "Packable")
@js.native
object Packable extends js.Object {
  var packedLength: Double = js.native
  def pack(value: js.Any, array: js.Array[Double]): js.Array[Double] = js.native
  def pack(value: js.Any, array: js.Array[Double], startingIndex: Double): js.Array[Double] = js.native
  def unpack(array: js.Array[Double]): Packable = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): Packable = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: js.Any): Packable = js.native
}

