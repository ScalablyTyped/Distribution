package typings.cannon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "Plane")
@js.native
class Plane ()
  extends typings.cannon.CANNON.Plane {
  /* CompleteClass */
  override var boundingSphereRadius: Double = js.native
  /* CompleteClass */
  override var collisionResponse: Boolean = js.native
  /* CompleteClass */
  override var `type`: Double = js.native
  /* CompleteClass */
  override var worldNormal: typings.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var worldNormalNeedsUpdate: Boolean = js.native
  /* CompleteClass */
  override def calculateLocalInertia(mass: Double, target: typings.cannon.CANNON.Vec3): typings.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override def calculateWorldAABB(pos: typings.cannon.CANNON.Vec3, quat: typings.cannon.CANNON.Quaternion, min: Double, max: Double): Unit = js.native
  /* CompleteClass */
  override def computeWorldNormal(quat: typings.cannon.CANNON.Quaternion): Unit = js.native
  /* CompleteClass */
  override def updateBoundingSphereRadius(): Double = js.native
  /* CompleteClass */
  override def volume(): Double = js.native
}

