package typings.cesium.mod

import typings.cesium.anon.BottomRadius
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "CylinderGeometry")
@js.native
class CylinderGeometry protected () extends Packable {
  def this(options: BottomRadius) = this()
}
object CylinderGeometry {
  
  /* static member */
  @JSImport("cesium", "CylinderGeometry.createGeometry")
  @js.native
  def createGeometry(cylinderGeometry: CylinderGeometry): Geometry = js.native
  
  /* static member */
  @JSImport("cesium", "CylinderGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double]): CylinderGeometry = js.native
  @JSImport("cesium", "CylinderGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: CylinderGeometry): CylinderGeometry = js.native
  @JSImport("cesium", "CylinderGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double): CylinderGeometry = js.native
  @JSImport("cesium", "CylinderGeometry.unpack")
  @js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: CylinderGeometry): CylinderGeometry = js.native
}
