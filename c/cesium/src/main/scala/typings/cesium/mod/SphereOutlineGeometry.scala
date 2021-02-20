package typings.cesium.mod

import typings.cesium.anon.SlicePartitions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "SphereOutlineGeometry")
@js.native
class SphereOutlineGeometry () extends Packable {
  def this(options: SlicePartitions) = this()
}
object SphereOutlineGeometry {
  
  /* static member */
  @JSImport("cesium", "SphereOutlineGeometry.createGeometry")
  @js.native
  def createGeometry(sphereGeometry: SphereOutlineGeometry): Geometry = js.native
  
  /* static member */
  @JSImport("cesium", "SphereOutlineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double]): SphereOutlineGeometry = js.native
  @JSImport("cesium", "SphereOutlineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: SphereOutlineGeometry): SphereOutlineGeometry = js.native
  @JSImport("cesium", "SphereOutlineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double): SphereOutlineGeometry = js.native
  @JSImport("cesium", "SphereOutlineGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: SphereOutlineGeometry): SphereOutlineGeometry = js.native
}
