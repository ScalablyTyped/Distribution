package typings.cannon.global.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.Box")
@js.native
class Box protected ()
  extends typings.cannon.CANNON.Box {
  def this(halfExtents: typings.cannon.CANNON.Vec3) = this()
}

/* static members */
@JSGlobal("CANNON.Box")
@js.native
object Box extends js.Object {
  def calculateIntertia(halfExtents: typings.cannon.CANNON.Vec3, mass: Double, target: typings.cannon.CANNON.Vec3): Unit = js.native
}

