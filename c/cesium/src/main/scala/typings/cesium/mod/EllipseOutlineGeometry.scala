package typings.cesium.mod

import typings.cesium.anon.NumberOfVerticalLines
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "EllipseOutlineGeometry")
@js.native
class EllipseOutlineGeometry protected () extends Packable {
  def this(options: NumberOfVerticalLines) = this()
}

/* static members */
@JSImport("cesium", "EllipseOutlineGeometry")
@js.native
object EllipseOutlineGeometry extends js.Object {
  def createGeometry(ellipseGeometry: EllipseOutlineGeometry): Geometry = js.native
  def unpack(array: js.Array[Double]): EllipseOutlineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: EllipseOutlineGeometry): EllipseOutlineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): EllipseOutlineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: EllipseOutlineGeometry): EllipseOutlineGeometry = js.native
}

