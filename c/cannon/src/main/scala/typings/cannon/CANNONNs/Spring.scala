package typings.cannon.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.Spring")
@js.native
class Spring () extends js.Object {
  def this(options: ISpringOptions) = this()
  var bodyA: Body = js.native
  var bodyB: Body = js.native
  var damping: Double = js.native
  var localAnchorA: Vec3 = js.native
  var localAnchorB: Vec3 = js.native
  var restLength: Double = js.native
  var stffness: Double = js.native
  def applyForce(): Unit = js.native
  def getWorldAnchorA(result: Vec3): Unit = js.native
  def getWorldAnchorB(result: Vec3): Unit = js.native
  def setWorldAnchorA(worldAnchorA: Vec3): Unit = js.native
  def setWorldAnchorB(worldAnchorB: Vec3): Unit = js.native
}

