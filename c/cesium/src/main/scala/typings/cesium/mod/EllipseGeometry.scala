package typings.cesium.mod

import typings.cesium.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "EllipseGeometry")
@js.native
class EllipseGeometry protected () extends Packable {
  def this(options: Height) = this()
}
object EllipseGeometry {
  
  /* static member */
  @JSImport("cesium", "EllipseGeometry.createGeometry")
  @js.native
  def createGeometry(ellipseGeometry: EllipseGeometry): Geometry = js.native
  
  /* static member */
  @JSImport("cesium", "EllipseGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double]): EllipseGeometry = js.native
  @JSImport("cesium", "EllipseGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: EllipseGeometry): EllipseGeometry = js.native
  @JSImport("cesium", "EllipseGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double): EllipseGeometry = js.native
  @JSImport("cesium", "EllipseGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: EllipseGeometry): EllipseGeometry = js.native
}
