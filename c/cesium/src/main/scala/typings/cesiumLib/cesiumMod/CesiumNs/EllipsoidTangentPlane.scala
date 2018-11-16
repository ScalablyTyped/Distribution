package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EllipsoidTangentPlane extends js.Object {
  var ellipsoid: Ellipsoid = js.native
  var origin: Cartesian3 = js.native
  def projectPointOntoPlane(cartesian: Cartesian3): Cartesian2 = js.native
  def projectPointOntoPlane(cartesian: Cartesian3, result: Cartesian2): Cartesian2 = js.native
  def projectPointsOntoEllipsoid(cartesians: js.Array[Cartesian2]): js.Array[Cartesian3] = js.native
  def projectPointsOntoEllipsoid(cartesians: js.Array[Cartesian2], result: js.Array[Cartesian3]): js.Array[Cartesian3] = js.native
  def projectPointsOntoPlane(cartesians: js.Array[Cartesian3]): js.Array[Cartesian2] = js.native
  def projectPointsOntoPlane(cartesians: js.Array[Cartesian3], result: js.Array[Cartesian2]): js.Array[Cartesian2] = js.native
}

