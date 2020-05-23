package typings.cannon.global.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.Particle")
@js.native
class Particle ()
  extends typings.cannon.CANNON.Shape {
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

