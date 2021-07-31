package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HingeConstraint
  extends StObject
     with Constraint {
  
  def disableMotor(): Unit
  
  def enableMotor(): Unit
  
  var motorEnabled: Boolean
  
  var motorEquation: RotationalMotorEquation
  
  var motorMaxForce: Double
  
  var motorMinForce: Double
  
  var motorTargetVelocity: Double
}
object HingeConstraint {
  
  @scala.inline
  def apply(
    bodyA: Body,
    bodyB: Body,
    collideConnected: Boolean,
    disable: () => Unit,
    disableMotor: () => Unit,
    enable: () => Unit,
    enableMotor: () => Unit,
    equations: js.Array[js.Any],
    id: Double,
    motorEnabled: Boolean,
    motorEquation: RotationalMotorEquation,
    motorMaxForce: Double,
    motorMinForce: Double,
    motorTargetVelocity: Double,
    update: () => Unit
  ): HingeConstraint = {
    val __obj = js.Dynamic.literal(bodyA = bodyA.asInstanceOf[js.Any], bodyB = bodyB.asInstanceOf[js.Any], collideConnected = collideConnected.asInstanceOf[js.Any], disable = js.Any.fromFunction0(disable), disableMotor = js.Any.fromFunction0(disableMotor), enable = js.Any.fromFunction0(enable), enableMotor = js.Any.fromFunction0(enableMotor), equations = equations.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], motorEnabled = motorEnabled.asInstanceOf[js.Any], motorEquation = motorEquation.asInstanceOf[js.Any], motorMaxForce = motorMaxForce.asInstanceOf[js.Any], motorMinForce = motorMinForce.asInstanceOf[js.Any], motorTargetVelocity = motorTargetVelocity.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[HingeConstraint]
  }
  
  @scala.inline
  implicit class HingeConstraintMutableBuilder[Self <: HingeConstraint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableMotor(value: () => Unit): Self = StObject.set(x, "disableMotor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnableMotor(value: () => Unit): Self = StObject.set(x, "enableMotor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMotorEnabled(value: Boolean): Self = StObject.set(x, "motorEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMotorEquation(value: RotationalMotorEquation): Self = StObject.set(x, "motorEquation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMotorMaxForce(value: Double): Self = StObject.set(x, "motorMaxForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMotorMinForce(value: Double): Self = StObject.set(x, "motorMinForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMotorTargetVelocity(value: Double): Self = StObject.set(x, "motorTargetVelocity", value.asInstanceOf[js.Any])
  }
}
