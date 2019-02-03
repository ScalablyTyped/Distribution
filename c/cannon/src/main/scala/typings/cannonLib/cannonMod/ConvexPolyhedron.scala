package typings
package cannonLib.cannonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "ConvexPolyhedron")
@js.native
class ConvexPolyhedron ()
  extends cannonLib.CANNONNs.ConvexPolyhedron {
  def this(points: js.Array[cannonLib.CANNONNs.Vec3]) = this()
  def this(points: js.Array[cannonLib.CANNONNs.Vec3], faces: js.Array[scala.Double]) = this()
}

/* static members */
@JSImport("cannon", "ConvexPolyhedron")
@js.native
object ConvexPolyhedron extends js.Object {
  def computeNormal(
    va: cannonLib.CANNONNs.Vec3,
    vb: cannonLib.CANNONNs.Vec3,
    vc: cannonLib.CANNONNs.Vec3,
    target: cannonLib.CANNONNs.Vec3
  ): scala.Unit = js.native
  def project(
    hull: cannonLib.CANNONNs.ConvexPolyhedron,
    axis: cannonLib.CANNONNs.Vec3,
    pos: cannonLib.CANNONNs.Vec3,
    quat: cannonLib.CANNONNs.Quaternion,
    result: js.Array[scala.Double]
  ): scala.Unit = js.native
}

