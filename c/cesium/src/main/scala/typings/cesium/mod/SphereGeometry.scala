package typings.cesium.mod

import typings.cesium.anon.Radius
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "SphereGeometry")
@js.native
class SphereGeometry () extends Packable {
  def this(options: Radius) = this()
}
object SphereGeometry {
  
  /* static member */
  @JSImport("cesium", "SphereGeometry.createGeometry")
  @js.native
  def createGeometry(sphereGeometry: SphereGeometry): Geometry = js.native
  
  /* static member */
  @JSImport("cesium", "SphereGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double]): SphereGeometry = js.native
  @JSImport("cesium", "SphereGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: SphereGeometry): SphereGeometry = js.native
  @JSImport("cesium", "SphereGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double): SphereGeometry = js.native
  @JSImport("cesium", "SphereGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: SphereGeometry): SphereGeometry = js.native
}
