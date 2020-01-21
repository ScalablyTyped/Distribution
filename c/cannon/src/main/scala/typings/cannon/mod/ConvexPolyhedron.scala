package typings.cannon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "ConvexPolyhedron")
@js.native
class ConvexPolyhedron ()
  extends typings.cannon.CANNON.ConvexPolyhedron {
  def this(points: js.Array[typings.cannon.CANNON.Vec3]) = this()
  def this(points: js.Array[typings.cannon.CANNON.Vec3], faces: js.Array[Double]) = this()
}

/* static members */
@JSImport("cannon", "ConvexPolyhedron")
@js.native
object ConvexPolyhedron extends js.Object {
  def computeNormal(
    va: typings.cannon.CANNON.Vec3,
    vb: typings.cannon.CANNON.Vec3,
    vc: typings.cannon.CANNON.Vec3,
    target: typings.cannon.CANNON.Vec3
  ): Unit = js.native
  def project(
    hull: typings.cannon.CANNON.ConvexPolyhedron,
    axis: typings.cannon.CANNON.Vec3,
    pos: typings.cannon.CANNON.Vec3,
    quat: typings.cannon.CANNON.Quaternion,
    result: js.Array[Double]
  ): Unit = js.native
}

