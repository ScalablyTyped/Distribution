package typings.cesium.mod

import typings.cesium.anon.PolylinePositions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PolylineVolumeGeometry")
@js.native
class PolylineVolumeGeometry protected () extends Packable {
  def this(options: PolylinePositions) = this()
}
object PolylineVolumeGeometry {
  
  /* static member */
  @JSImport("cesium", "PolylineVolumeGeometry.createGeometry")
  @js.native
  def createGeometry(polylineVolumeGeometry: PolylineVolumeGeometry): Geometry = js.native
  
  /* static member */
  @JSImport("cesium", "PolylineVolumeGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double]): PolylineVolumeGeometry = js.native
  @JSImport("cesium", "PolylineVolumeGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: PolylineVolumeGeometry): PolylineVolumeGeometry = js.native
  @JSImport("cesium", "PolylineVolumeGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double): PolylineVolumeGeometry = js.native
  @JSImport("cesium", "PolylineVolumeGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: PolylineVolumeGeometry): PolylineVolumeGeometry = js.native
}
