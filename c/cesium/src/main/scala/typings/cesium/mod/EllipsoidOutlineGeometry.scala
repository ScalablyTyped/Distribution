package typings.cesium.mod

import typings.cesium.anon.MaximumClock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "EllipsoidOutlineGeometry")
@js.native
class EllipsoidOutlineGeometry () extends Packable {
  def this(options: MaximumClock) = this()
}
object EllipsoidOutlineGeometry {
  
  /* static member */
  @JSImport("cesium", "EllipsoidOutlineGeometry.createGeometry")
  @js.native
  def createGeometry(ellipsoidGeometry: EllipsoidOutlineGeometry): Geometry = js.native
  
  /* static member */
  @JSImport("cesium", "EllipsoidOutlineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double]): EllipsoidOutlineGeometry = js.native
  @JSImport("cesium", "EllipsoidOutlineGeometry.unpack")
  @js.native
  def unpack(
    array: js.Array[Double],
    startingIndex: js.UndefOr[scala.Nothing],
    result: EllipsoidOutlineGeometry
  ): EllipsoidOutlineGeometry = js.native
  @JSImport("cesium", "EllipsoidOutlineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double): EllipsoidOutlineGeometry = js.native
  @JSImport("cesium", "EllipsoidOutlineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: EllipsoidOutlineGeometry): EllipsoidOutlineGeometry = js.native
}
