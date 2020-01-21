package typings.cesium.mod

import typings.cesium.AnonBottomRadiusLength
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CylinderOutlineGeometry")
@js.native
class CylinderOutlineGeometry protected () extends Packable {
  def this(options: AnonBottomRadiusLength) = this()
}

/* static members */
@JSImport("cesium", "CylinderOutlineGeometry")
@js.native
object CylinderOutlineGeometry extends js.Object {
  def createGeometry(cylinderGeometry: CylinderOutlineGeometry): Geometry = js.native
  def unpack(array: js.Array[Double]): CylinderOutlineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): CylinderOutlineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: CylinderOutlineGeometry): CylinderOutlineGeometry = js.native
}

