package typings.cannon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "Ray")
@js.native
class Ray ()
  extends typings.cannon.CANNON.Ray {
  def this(from: typings.cannon.CANNON.Vec3) = this()
  def this(from: typings.cannon.CANNON.Vec3, to: typings.cannon.CANNON.Vec3) = this()
  /* CompleteClass */
  override var checkCollisionResponse: Boolean = js.native
  /* CompleteClass */
  override var from: typings.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var precision: Double = js.native
  /* CompleteClass */
  override var to: typings.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override def getAABB(result: typings.cannon.CANNON.RaycastResult): Unit = js.native
}

