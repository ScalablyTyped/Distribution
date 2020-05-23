package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spring extends js.Object {
  var bodyA: Body
  var bodyB: Body
  var damping: Double
  var localAnchorA: Vec3
  var localAnchorB: Vec3
  var restLength: Double
  var stffness: Double
  def applyForce(): Unit
  def getWorldAnchorA(result: Vec3): Unit
  def getWorldAnchorB(result: Vec3): Unit
  def setWorldAnchorA(worldAnchorA: Vec3): Unit
  def setWorldAnchorB(worldAnchorB: Vec3): Unit
}

object Spring {
  @scala.inline
  def apply(
    applyForce: () => Unit,
    bodyA: Body,
    bodyB: Body,
    damping: Double,
    getWorldAnchorA: Vec3 => Unit,
    getWorldAnchorB: Vec3 => Unit,
    localAnchorA: Vec3,
    localAnchorB: Vec3,
    restLength: Double,
    setWorldAnchorA: Vec3 => Unit,
    setWorldAnchorB: Vec3 => Unit,
    stffness: Double
  ): Spring = {
    val __obj = js.Dynamic.literal(applyForce = js.Any.fromFunction0(applyForce), bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], damping = damping.asInstanceOf[js.Any], getWorldAnchorA = js.Any.fromFunction1(getWorldAnchorA), getWorldAnchorB = js.Any.fromFunction1(getWorldAnchorB), localAnchorA = localAnchorA.asInstanceOf[js.Any], localAnchorB = localAnchorB.asInstanceOf[js.Any], restLength = restLength.asInstanceOf[js.Any], setWorldAnchorA = js.Any.fromFunction1(setWorldAnchorA), setWorldAnchorB = js.Any.fromFunction1(setWorldAnchorB), stffness = stffness.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spring]
  }
}

