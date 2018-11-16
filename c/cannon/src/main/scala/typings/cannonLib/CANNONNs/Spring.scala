package typings
package cannonLib.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.Spring")
@js.native
class Spring () extends js.Object {
  def this(options: ISpringOptions) = this()
  var bodyA: Body = js.native
  var bodyB: Body = js.native
  var damping: scala.Double = js.native
  var localAnchorA: Vec3 = js.native
  var localAnchorB: Vec3 = js.native
  var restLength: scala.Double = js.native
  var stffness: scala.Double = js.native
  def applyForce(): scala.Unit = js.native
  def getWorldAnchorA(result: Vec3): scala.Unit = js.native
  def getWorldAnchorB(result: Vec3): scala.Unit = js.native
  def setWorldAnchorA(worldAnchorA: Vec3): scala.Unit = js.native
  def setWorldAnchorB(worldAnchorB: Vec3): scala.Unit = js.native
}

