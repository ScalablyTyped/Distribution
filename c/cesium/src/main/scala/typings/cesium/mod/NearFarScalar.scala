package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "NearFarScalar")
@js.native
class NearFarScalar () extends Packable {
  def this(near: Double) = this()
  def this(near: js.UndefOr[scala.Nothing], nearValue: Double) = this()
  def this(near: Double, nearValue: Double) = this()
  def this(near: js.UndefOr[scala.Nothing], nearValue: js.UndefOr[scala.Nothing], far: Double) = this()
  def this(near: js.UndefOr[scala.Nothing], nearValue: Double, far: Double) = this()
  def this(near: Double, nearValue: js.UndefOr[scala.Nothing], far: Double) = this()
  def this(near: Double, nearValue: Double, far: Double) = this()
  def this(
    near: js.UndefOr[scala.Nothing],
    nearValue: js.UndefOr[scala.Nothing],
    far: js.UndefOr[scala.Nothing],
    farValue: Double
  ) = this()
  def this(
    near: js.UndefOr[scala.Nothing],
    nearValue: js.UndefOr[scala.Nothing],
    far: Double,
    farValue: Double
  ) = this()
  def this(
    near: js.UndefOr[scala.Nothing],
    nearValue: Double,
    far: js.UndefOr[scala.Nothing],
    farValue: Double
  ) = this()
  def this(near: js.UndefOr[scala.Nothing], nearValue: Double, far: Double, farValue: Double) = this()
  def this(
    near: Double,
    nearValue: js.UndefOr[scala.Nothing],
    far: js.UndefOr[scala.Nothing],
    farValue: Double
  ) = this()
  def this(near: Double, nearValue: js.UndefOr[scala.Nothing], far: Double, farValue: Double) = this()
  def this(near: Double, nearValue: Double, far: js.UndefOr[scala.Nothing], farValue: Double) = this()
  def this(near: Double, nearValue: Double, far: Double, farValue: Double) = this()
  var far: Double = js.native
  var farValue: Double = js.native
  var near: Double = js.native
  var nearValue: Double = js.native
  def clone(result: NearFarScalar): NearFarScalar = js.native
  def equals(): Boolean = js.native
  def equals(right: NearFarScalar): Boolean = js.native
}

/* static members */
@JSImport("cesium", "NearFarScalar")
@js.native
object NearFarScalar extends js.Object {
  def clone(nearFarScalar: NearFarScalar): NearFarScalar = js.native
  def clone(nearFarScalar: NearFarScalar, result: NearFarScalar): NearFarScalar = js.native
  def equals(): Boolean = js.native
  def equals(left: js.UndefOr[scala.Nothing], right: NearFarScalar): Boolean = js.native
  def equals(left: NearFarScalar): Boolean = js.native
  def equals(left: NearFarScalar, right: NearFarScalar): Boolean = js.native
  def pack(value: NearFarScalar, array: js.Array[Double]): js.Array[Double] = js.native
  def pack(value: NearFarScalar, array: js.Array[Double], startingIndex: Double): js.Array[Double] = js.native
  def unpack(array: js.Array[Double]): NearFarScalar = js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: NearFarScalar): NearFarScalar = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): NearFarScalar = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: NearFarScalar): NearFarScalar = js.native
}

