package typings.cesium.mod

import typings.cesium.anon.BottomRadius
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CylinderGeometry")
@js.native
class CylinderGeometry protected () extends Packable {
  def this(options: BottomRadius) = this()
}

/* static members */
@JSImport("cesium", "CylinderGeometry")
@js.native
object CylinderGeometry extends js.Object {
  def createGeometry(cylinderGeometry: CylinderGeometry): Geometry = js.native
  def unpack(array: js.Array[Double]): CylinderGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): CylinderGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: CylinderGeometry): CylinderGeometry = js.native
}

