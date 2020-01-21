package typings.cannon.CANNON

import typings.cannon.AnonBOX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.Shape")
@js.native
class Shape () extends js.Object {
  var boundingSphereRadius: Double = js.native
  var collisionResponse: Boolean = js.native
  var `type`: Double = js.native
  def calculateLocalInertia(mass: Double, target: Vec3): Vec3 = js.native
  def updateBoundingSphereRadius(): Double = js.native
  def volume(): Double = js.native
}

/* static members */
@JSGlobal("CANNON.Shape")
@js.native
object Shape extends js.Object {
  var types: AnonBOX = js.native
}

