package typings.cannon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "ConvexPolyhedron")
@js.native
class ConvexPolyhedron ()
  extends typings.cannon.CANNON.ConvexPolyhedron {
  def this(points: js.Array[typings.cannon.CANNON.Vec3]) = this()
  def this(points: js.UndefOr[scala.Nothing], faces: js.Array[Double]) = this()
  def this(points: js.Array[typings.cannon.CANNON.Vec3], faces: js.Array[Double]) = this()
}
/* static members */
object ConvexPolyhedron {
  
  @JSImport("cannon", "ConvexPolyhedron.computeNormal")
  @js.native
  def computeNormal(
    va: typings.cannon.CANNON.Vec3,
    vb: typings.cannon.CANNON.Vec3,
    vc: typings.cannon.CANNON.Vec3,
    target: typings.cannon.CANNON.Vec3
  ): Unit = js.native
  
  @JSImport("cannon", "ConvexPolyhedron.project")
  @js.native
  def project(
    hull: typings.cannon.CANNON.ConvexPolyhedron,
    axis: typings.cannon.CANNON.Vec3,
    pos: typings.cannon.CANNON.Vec3,
    quat: typings.cannon.CANNON.Quaternion,
    result: js.Array[Double]
  ): Unit = js.native
}
