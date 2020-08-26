package typings.box2d.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Common.Math.b2Vec2
import typings.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2FrictionJointDef extends b2JointDef {
  /**
    * The local anchor point relative to body1's origin.
    **/
  var localAnchorA: b2Vec2 = js.native
  /**
    * The local anchor point relative to body2's origin.
    **/
  var localAnchorB: b2Vec2 = js.native
  /**
    * The maximum force in N.
    **/
  var maxForce: Double = js.native
  /**
    * The maximum friction torque in N-m.
    **/
  var maxTorque: Double = js.native
  /**
    * Initialize the bodies, anchors, axis, and reference angle using the world anchor and world axis.
    * @param bA Body A.
    * @param bB Body B.
    * @param anchor World anchor.
    **/
  def Initialize(bA: b2Body, bB: b2Body, anchor: b2Vec2): Unit = js.native
}

object b2FrictionJointDef {
  @scala.inline
  def apply(
    Initialize: (b2Body, b2Body, b2Vec2) => Unit,
    bodyA: b2Body,
    bodyB: b2Body,
    collideConnected: Boolean,
    localAnchorA: b2Vec2,
    localAnchorB: b2Vec2,
    maxForce: Double,
    maxTorque: Double,
    `type`: Double,
    userData: js.Any
  ): b2FrictionJointDef = {
    val __obj = js.Dynamic.literal(Initialize = js.Any.fromFunction3(Initialize), bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collideConnected = collideConnected.asInstanceOf[js.Any], localAnchorA = localAnchorA.asInstanceOf[js.Any], localAnchorB = localAnchorB.asInstanceOf[js.Any], maxForce = maxForce.asInstanceOf[js.Any], maxTorque = maxTorque.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2FrictionJointDef]
  }
  @scala.inline
  implicit class b2FrictionJointDefOps[Self <: b2FrictionJointDef] (val x: Self) extends AnyVal {
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
    def setInitialize(value: (b2Body, b2Body, b2Vec2) => Unit): Self = this.set("Initialize", js.Any.fromFunction3(value))
    @scala.inline
    def setLocalAnchorA(value: b2Vec2): Self = this.set("localAnchorA", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalAnchorB(value: b2Vec2): Self = this.set("localAnchorB", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxForce(value: Double): Self = this.set("maxForce", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxTorque(value: Double): Self = this.set("maxTorque", value.asInstanceOf[js.Any])
  }
  
}

