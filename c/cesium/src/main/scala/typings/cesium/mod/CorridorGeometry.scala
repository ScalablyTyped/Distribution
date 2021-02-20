package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "CorridorGeometry")
@js.native
class CorridorGeometry protected () extends Packable {
  def this(options: typings.cesium.anon.CornerType) = this()
}
object CorridorGeometry {
  
  /* static member */
  @JSImport("cesium", "CorridorGeometry.createGeometry")
  @js.native
  def createGeometry(corridorGeometry: CorridorGeometry): Geometry = js.native
  
  /* static member */
  @JSImport("cesium", "CorridorGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double]): CorridorGeometry = js.native
  @JSImport("cesium", "CorridorGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: CorridorGeometry): CorridorGeometry = js.native
  @JSImport("cesium", "CorridorGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double): CorridorGeometry = js.native
  @JSImport("cesium", "CorridorGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: CorridorGeometry): CorridorGeometry = js.native
}
