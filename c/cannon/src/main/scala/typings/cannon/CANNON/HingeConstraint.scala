package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HingeConstraint
  extends StObject
     with Constraint {
  
  var axisA: Vec3
  
  var axisB: Vec3
  
  def disableMotor(): Unit
  
  def enableMotor(): Unit
  
  var motorEnabled: Boolean
  
  var motorEquation: RotationalMotorEquation
  
  var motorMaxForce: Double
  
  var motorMinForce: Double
  
  var motorTargetVelocity: Double
  
  def setMotorSpeed(speed: Double): Unit
}
object HingeConstraint {
  
  inline def apply(
    axisA: Vec3,
    axisB: Vec3,
    bodyA: Body,
    bodyB: Body,
    collideConnected: Boolean,
    disable: () => Unit,
    disableMotor: () => Unit,
    enable: () => Unit,
    enableMotor: () => Unit,
    equations: js.Array[Any],
    id: Double,
    motorEnabled: Boolean,
    motorEquation: RotationalMotorEquation,
    motorMaxForce: Double,
    motorMinForce: Double,
    motorTargetVelocity: Double,
    setMotorSpeed: Double => Unit,
    update: () => Unit
  ): HingeConstraint = {
    val __obj = js.Dynamic.literal(axisA = axisA.asInstanceOf[js.Any], axisB = axisB.asInstanceOf[js.Any], bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collideConnected = collideConnected.asInstanceOf[js.Any], disable = js.Any.fromFunction0(disable), disableMotor = js.Any.fromFunction0(disableMotor), enable = js.Any.fromFunction0(enable), enableMotor = js.Any.fromFunction0(enableMotor), equations = equations.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], motorEnabled = motorEnabled.asInstanceOf[js.Any], motorEquation = motorEquation.asInstanceOf[js.Any], motorMaxForce = motorMaxForce.asInstanceOf[js.Any], motorMinForce = motorMinForce.asInstanceOf[js.Any], motorTargetVelocity = motorTargetVelocity.asInstanceOf[js.Any], setMotorSpeed = js.Any.fromFunction1(setMotorSpeed), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[HingeConstraint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HingeConstraint] (val x: Self) extends AnyVal {
    
    inline def setAxisA(value: Vec3): Self = StObject.set(x, "axisA", value.asInstanceOf[js.Any])
    
    inline def setAxisB(value: Vec3): Self = StObject.set(x, "axisB", value.asInstanceOf[js.Any])
    
    inline def setDisableMotor(value: () => Unit): Self = StObject.set(x, "disableMotor", js.Any.fromFunction0(value))
    
    inline def setEnableMotor(value: () => Unit): Self = StObject.set(x, "enableMotor", js.Any.fromFunction0(value))
    
    inline def setMotorEnabled(value: Boolean): Self = StObject.set(x, "motorEnabled", value.asInstanceOf[js.Any])
    
    inline def setMotorEquation(value: RotationalMotorEquation): Self = StObject.set(x, "motorEquation", value.asInstanceOf[js.Any])
    
    inline def setMotorMaxForce(value: Double): Self = StObject.set(x, "motorMaxForce", value.asInstanceOf[js.Any])
    
    inline def setMotorMinForce(value: Double): Self = StObject.set(x, "motorMinForce", value.asInstanceOf[js.Any])
    
    inline def setMotorTargetVelocity(value: Double): Self = StObject.set(x, "motorTargetVelocity", value.asInstanceOf[js.Any])
    
    inline def setSetMotorSpeed(value: Double => Unit): Self = StObject.set(x, "setMotorSpeed", js.Any.fromFunction1(value))
  }
}
