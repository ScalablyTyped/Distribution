package typings.box2d.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Common.Math.b2Vec2
import typings.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2RevoluteJointDef extends b2JointDef {
  /**
    * A flag to enable joint limits.
    **/
  var enableLimit: Boolean = js.native
  /**
    * A flag to enable the joint motor.
    **/
  var enableMotor: Boolean = js.native
  /**
    * The local anchor point relative to body1's origin.
    **/
  var localAnchorA: b2Vec2 = js.native
  /**
    * The local anchor point relative to body2's origin.
    **/
  var localAnchorB: b2Vec2 = js.native
  /**
    * The lower angle for the joint limit (radians).
    **/
  var lowerAngle: Double = js.native
  /**
    * The maximum motor torque used to achieve the desired motor speed. Usually in N-m.
    **/
  var maxMotorTorque: Double = js.native
  /**
    * The desired motor speed. Usually in radians per second.
    **/
  var motorSpeed: Double = js.native
  /**
    * The bodyB angle minus bodyA angle in the reference state (radians).
    **/
  var referenceAngle: Double = js.native
  /**
    * The upper angle for the joint limit (radians).
    **/
  var upperAngle: Double = js.native
  /**
    * Initialize the bodies, achors, and reference angle using the world anchor.
    * @param bA Body A.
    * @param bB Body B.
    * @param anchor Anchor.
    **/
  def Initialize(bA: b2Body, bB: b2Body, anchor: b2Vec2): Unit = js.native
}

object b2RevoluteJointDef {
  @scala.inline
  def apply(
    Initialize: (b2Body, b2Body, b2Vec2) => Unit,
    bodyA: b2Body,
    bodyB: b2Body,
    collideConnected: Boolean,
    enableLimit: Boolean,
    enableMotor: Boolean,
    localAnchorA: b2Vec2,
    localAnchorB: b2Vec2,
    lowerAngle: Double,
    maxMotorTorque: Double,
    motorSpeed: Double,
    referenceAngle: Double,
    `type`: Double,
    upperAngle: Double,
    userData: js.Any
  ): b2RevoluteJointDef = {
    val __obj = js.Dynamic.literal(Initialize = js.Any.fromFunction3(Initialize), bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collideConnected = collideConnected.asInstanceOf[js.Any], enableLimit = enableLimit.asInstanceOf[js.Any], enableMotor = enableMotor.asInstanceOf[js.Any], localAnchorA = localAnchorA.asInstanceOf[js.Any], localAnchorB = localAnchorB.asInstanceOf[js.Any], lowerAngle = lowerAngle.asInstanceOf[js.Any], maxMotorTorque = maxMotorTorque.asInstanceOf[js.Any], motorSpeed = motorSpeed.asInstanceOf[js.Any], referenceAngle = referenceAngle.asInstanceOf[js.Any], upperAngle = upperAngle.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2RevoluteJointDef]
  }
  @scala.inline
  implicit class b2RevoluteJointDefOps[Self <: b2RevoluteJointDef] (val x: Self) extends AnyVal {
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
    def setEnableLimit(value: Boolean): Self = this.set("enableLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableMotor(value: Boolean): Self = this.set("enableMotor", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalAnchorA(value: b2Vec2): Self = this.set("localAnchorA", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalAnchorB(value: b2Vec2): Self = this.set("localAnchorB", value.asInstanceOf[js.Any])
    @scala.inline
    def setLowerAngle(value: Double): Self = this.set("lowerAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxMotorTorque(value: Double): Self = this.set("maxMotorTorque", value.asInstanceOf[js.Any])
    @scala.inline
    def setMotorSpeed(value: Double): Self = this.set("motorSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferenceAngle(value: Double): Self = this.set("referenceAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpperAngle(value: Double): Self = this.set("upperAngle", value.asInstanceOf[js.Any])
  }
  
}

