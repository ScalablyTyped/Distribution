package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "ClippingPlane")
@js.native
class ClippingPlane protected () extends StObject {
  def this(normal: Cartesian3, distance: Double) = this()
  
  var distance: Double = js.native
  
  var normal: Cartesian3 = js.native
}
object ClippingPlane {
  
  /* static member */
  @JSImport("cesium", "ClippingPlane.clone")
  @js.native
  def clone_(clippingPlane: ClippingPlane): ClippingPlane = js.native
  @JSImport("cesium", "ClippingPlane.clone")
  @js.native
  def clone_(clippingPlane: ClippingPlane, result: ClippingPlane): ClippingPlane = js.native
  
  /* static member */
  @JSImport("cesium", "ClippingPlane.fromPlane")
  @js.native
  def fromPlane(plane: Plane): ClippingPlane = js.native
  @JSImport("cesium", "ClippingPlane.fromPlane")
  @js.native
  def fromPlane(plane: Plane, result: ClippingPlane): ClippingPlane = js.native
}
