package typings.cesium.mod

import typings.cesium.anon.InnerRadii
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "EllipsoidGeometry")
@js.native
class EllipsoidGeometry () extends Packable {
  def this(options: InnerRadii) = this()
}
object EllipsoidGeometry {
  
  /* static member */
  @JSImport("cesium", "EllipsoidGeometry.createGeometry")
  @js.native
  def createGeometry(ellipsoidGeometry: EllipsoidGeometry): Geometry = js.native
  
  /* static member */
  @JSImport("cesium", "EllipsoidGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double]): EllipsoidGeometry = js.native
  @JSImport("cesium", "EllipsoidGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: EllipsoidGeometry): EllipsoidGeometry = js.native
  @JSImport("cesium", "EllipsoidGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double): EllipsoidGeometry = js.native
  @JSImport("cesium", "EllipsoidGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: EllipsoidGeometry): EllipsoidGeometry = js.native
}
