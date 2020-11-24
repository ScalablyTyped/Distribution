package typings.cesium.mod

import typings.cesium.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "EllipseGeometry")
@js.native
class EllipseGeometry protected () extends Packable {
  def this(options: Height) = this()
}
/* static members */
@JSImport("cesium", "EllipseGeometry")
@js.native
object EllipseGeometry extends js.Object {
  
  def createGeometry(ellipseGeometry: EllipseGeometry): Geometry = js.native
  
  def unpack(array: js.Array[Double]): EllipseGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: EllipseGeometry): EllipseGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): EllipseGeometry = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: EllipseGeometry): EllipseGeometry = js.native
}
