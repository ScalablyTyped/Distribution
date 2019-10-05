package typings.cannon.cannonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "Box")
@js.native
class Box protected ()
  extends typings.cannon.CANNON.Box {
  def this(halfExtents: typings.cannon.CANNON.Vec3) = this()
}

/* static members */
@JSImport("cannon", "Box")
@js.native
object Box extends js.Object {
  def calculateIntertia(halfExtents: typings.cannon.CANNON.Vec3, mass: Double, target: typings.cannon.CANNON.Vec3): Unit = js.native
}

