package typings.cannon.cannonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "ConvexPolyhedron")
@js.native
class ConvexPolyhedron ()
  extends typings.cannon.CANNONNs.ConvexPolyhedron {
  def this(points: js.Array[typings.cannon.CANNONNs.Vec3]) = this()
  def this(points: js.Array[typings.cannon.CANNONNs.Vec3], faces: js.Array[Double]) = this()
}

/* static members */
@JSImport("cannon", "ConvexPolyhedron")
@js.native
object ConvexPolyhedron extends js.Object {
  def computeNormal(
    va: typings.cannon.CANNONNs.Vec3,
    vb: typings.cannon.CANNONNs.Vec3,
    vc: typings.cannon.CANNONNs.Vec3,
    target: typings.cannon.CANNONNs.Vec3
  ): Unit = js.native
  def project(
    hull: typings.cannon.CANNONNs.ConvexPolyhedron,
    axis: typings.cannon.CANNONNs.Vec3,
    pos: typings.cannon.CANNONNs.Vec3,
    quat: typings.cannon.CANNONNs.Quaternion,
    result: js.Array[Double]
  ): Unit = js.native
}

