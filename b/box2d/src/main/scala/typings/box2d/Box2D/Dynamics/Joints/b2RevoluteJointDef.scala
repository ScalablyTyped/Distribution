package typings.box2d.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Common.Math.b2Vec2
import typings.box2d.Box2D.Dynamics.b2Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2RevoluteJointDef
  extends StObject
     with b2JointDef {
  
  /**
    * Initialize the bodies, achors, and reference angle using the world anchor.
    * @param bA Body A.
    * @param bB Body B.
    * @param anchor Anchor.
    **/
  def Initialize(bA: b2Body, bB: b2Body, anchor: b2Vec2): Unit
  
  /**
    * A flag to enable joint limits.
    **/
  var enableLimit: Boolean
  
  /**
    * A flag to enable the joint motor.
    **/
  var enableMotor: Boolean
  
  /**
    * The local anchor point relative to body1's origin.
    **/
  var localAnchorA: b2Vec2
  
  /**
    * The local anchor point relative to body2's origin.
    **/
  var localAnchorB: b2Vec2
  
  /**
    * The lower angle for the joint limit (radians).
    **/
  var lowerAngle: Double
  
  /**
    * The maximum motor torque used to achieve the desired motor speed. Usually in N-m.
    **/
  var maxMotorTorque: Double
  
  /**
    * The desired motor speed. Usually in radians per second.
    **/
  var motorSpeed: Double
  
  /**
    * The bodyB angle minus bodyA angle in the reference state (radians).
    **/
  var referenceAngle: Double
  
  /**
    * The upper angle for the joint limit (radians).
    **/
  var upperAngle: Double
}
object b2RevoluteJointDef {
  
  inline def apply(
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
    userData: Any
  ): b2RevoluteJointDef = {
    val __obj = js.Dynamic.literal(Initialize = js.Any.fromFunction3(Initialize), bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collideConnected = collideConnected.asInstanceOf[js.Any], enableLimit = enableLimit.asInstanceOf[js.Any], enableMotor = enableMotor.asInstanceOf[js.Any], localAnchorA = localAnchorA.asInstanceOf[js.Any], localAnchorB = localAnchorB.asInstanceOf[js.Any], lowerAngle = lowerAngle.asInstanceOf[js.Any], maxMotorTorque = maxMotorTorque.asInstanceOf[js.Any], motorSpeed = motorSpeed.asInstanceOf[js.Any], referenceAngle = referenceAngle.asInstanceOf[js.Any], upperAngle = upperAngle.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2RevoluteJointDef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: b2RevoluteJointDef] (val x: Self) extends AnyVal {
    
    inline def setEnableLimit(value: Boolean): Self = StObject.set(x, "enableLimit", value.asInstanceOf[js.Any])
    
    inline def setEnableMotor(value: Boolean): Self = StObject.set(x, "enableMotor", value.asInstanceOf[js.Any])
    
    inline def setInitialize(value: (b2Body, b2Body, b2Vec2) => Unit): Self = StObject.set(x, "Initialize", js.Any.fromFunction3(value))
    
    inline def setLocalAnchorA(value: b2Vec2): Self = StObject.set(x, "localAnchorA", value.asInstanceOf[js.Any])
    
    inline def setLocalAnchorB(value: b2Vec2): Self = StObject.set(x, "localAnchorB", value.asInstanceOf[js.Any])
    
    inline def setLowerAngle(value: Double): Self = StObject.set(x, "lowerAngle", value.asInstanceOf[js.Any])
    
    inline def setMaxMotorTorque(value: Double): Self = StObject.set(x, "maxMotorTorque", value.asInstanceOf[js.Any])
    
    inline def setMotorSpeed(value: Double): Self = StObject.set(x, "motorSpeed", value.asInstanceOf[js.Any])
    
    inline def setReferenceAngle(value: Double): Self = StObject.set(x, "referenceAngle", value.asInstanceOf[js.Any])
    
    inline def setUpperAngle(value: Double): Self = StObject.set(x, "upperAngle", value.asInstanceOf[js.Any])
  }
}
