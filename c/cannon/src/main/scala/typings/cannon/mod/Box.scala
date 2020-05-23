package typings.cannon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "Box")
@js.native
class Box protected ()
  extends typings.cannon.CANNON.Box {
  def this(halfExtents: typings.cannon.CANNON.Vec3) = this()
  /* CompleteClass */
  override var boundingSphereRadius: Double = js.native
  /* CompleteClass */
  override var collisionResponse: Boolean = js.native
  /* CompleteClass */
  override var `type`: Double = js.native
  /* CompleteClass */
  override def calculateLocalInertia(mass: Double, target: typings.cannon.CANNON.Vec3): typings.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override def updateBoundingSphereRadius(): Double = js.native
  /* CompleteClass */
  override def volume(): Double = js.native
}

/* static members */
@JSImport("cannon", "Box")
@js.native
object Box extends js.Object {
  def calculateIntertia(halfExtents: typings.cannon.CANNON.Vec3, mass: Double, target: typings.cannon.CANNON.Vec3): Unit = js.native
}

