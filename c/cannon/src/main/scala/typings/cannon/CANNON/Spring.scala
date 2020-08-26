package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spring extends js.Object {
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
  @scala.inline
  implicit class SpringOps[Self <: Spring] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplyForce(value: () => Unit): Self = this.set("applyForce", js.Any.fromFunction0(value))
    @scala.inline
    def setBodyA(value: Body): Self = this.set("bodyA", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyB(value: Body): Self = this.set("bodyB", value.asInstanceOf[js.Any])
    @scala.inline
    def setDamping(value: Double): Self = this.set("damping", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetWorldAnchorA(value: Vec3 => Unit): Self = this.set("getWorldAnchorA", js.Any.fromFunction1(value))
    @scala.inline
    def setGetWorldAnchorB(value: Vec3 => Unit): Self = this.set("getWorldAnchorB", js.Any.fromFunction1(value))
    @scala.inline
    def setLocalAnchorA(value: Vec3): Self = this.set("localAnchorA", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalAnchorB(value: Vec3): Self = this.set("localAnchorB", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestLength(value: Double): Self = this.set("restLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetWorldAnchorA(value: Vec3 => Unit): Self = this.set("setWorldAnchorA", js.Any.fromFunction1(value))
    @scala.inline
    def setSetWorldAnchorB(value: Vec3 => Unit): Self = this.set("setWorldAnchorB", js.Any.fromFunction1(value))
    @scala.inline
    def setStffness(value: Double): Self = this.set("stffness", value.asInstanceOf[js.Any])
  }
  
}

