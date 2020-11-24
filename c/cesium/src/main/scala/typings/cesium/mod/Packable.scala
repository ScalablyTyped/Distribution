package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line no-unnecessary-class
@JSImport("cesium", "Packable")
@js.native
abstract class Packable () extends js.Object
/* static members */
@JSImport("cesium", "Packable")
@js.native
object Packable extends js.Object {
  
  def pack(value: js.Any, array: js.Array[Double]): js.Array[Double] = js.native
  def pack(value: js.Any, array: js.Array[Double], startingIndex: Double): js.Array[Double] = js.native
  
  var packedLength: Double = js.native
  
  def unpack(array: js.Array[Double]): Packable = js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: js.Any): Packable = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): Packable = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: js.Any): Packable = js.native
}
