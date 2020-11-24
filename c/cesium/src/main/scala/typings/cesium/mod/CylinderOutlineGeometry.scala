package typings.cesium.mod

import typings.cesium.anon.Length
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "CylinderOutlineGeometry")
@js.native
class CylinderOutlineGeometry protected () extends Packable {
  def this(options: Length) = this()
}
/* static members */
@JSImport("cesium", "CylinderOutlineGeometry")
@js.native
object CylinderOutlineGeometry extends js.Object {
  
  def createGeometry(cylinderGeometry: CylinderOutlineGeometry): Geometry = js.native
  
  def unpack(array: js.Array[Double]): CylinderOutlineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: CylinderOutlineGeometry): CylinderOutlineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): CylinderOutlineGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: CylinderOutlineGeometry): CylinderOutlineGeometry = js.native
}
