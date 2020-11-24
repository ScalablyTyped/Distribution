package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "ClippingPlane")
@js.native
class ClippingPlane protected () extends js.Object {
  def this(normal: Cartesian3, distance: Double) = this()
  
  var distance: Double = js.native
  
  var normal: Cartesian3 = js.native
}
/* static members */
@JSImport("cesium", "ClippingPlane")
@js.native
object ClippingPlane extends js.Object {
  
  def clone(clippingPlane: ClippingPlane): ClippingPlane = js.native
  def clone(clippingPlane: ClippingPlane, result: ClippingPlane): ClippingPlane = js.native
  
  def fromPlane(plane: Plane): ClippingPlane = js.native
  def fromPlane(plane: Plane, result: ClippingPlane): ClippingPlane = js.native
}
