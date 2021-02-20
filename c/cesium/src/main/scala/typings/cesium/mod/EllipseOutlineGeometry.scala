package typings.cesium.mod

import typings.cesium.anon.NumberOfVerticalLines
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "EllipseOutlineGeometry")
@js.native
class EllipseOutlineGeometry protected () extends Packable {
  def this(options: NumberOfVerticalLines) = this()
}
object EllipseOutlineGeometry {
  
  /* static member */
  @JSImport("cesium", "EllipseOutlineGeometry.createGeometry")
  @js.native
  def createGeometry(ellipseGeometry: EllipseOutlineGeometry): Geometry = js.native
  
  /* static member */
  @JSImport("cesium", "EllipseOutlineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double]): EllipseOutlineGeometry = js.native
  @JSImport("cesium", "EllipseOutlineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: EllipseOutlineGeometry): EllipseOutlineGeometry = js.native
  @JSImport("cesium", "EllipseOutlineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double): EllipseOutlineGeometry = js.native
  @JSImport("cesium", "EllipseOutlineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: EllipseOutlineGeometry): EllipseOutlineGeometry = js.native
}
