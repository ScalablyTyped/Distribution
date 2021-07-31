package typings.cannon.mod

import typings.cannon.CANNON.IHingeConstraintOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "HingeConstraint")
@js.native
class HingeConstraint protected ()
  extends StObject
     with typings.cannon.CANNON.HingeConstraint {
  def this(bodyA: typings.cannon.CANNON.Body, bodyB: typings.cannon.CANNON.Body) = this()
  def this(
    bodyA: typings.cannon.CANNON.Body,
    bodyB: typings.cannon.CANNON.Body,
    options: IHingeConstraintOptions
  ) = this()
  
  /* CompleteClass */
  var bodyA: typings.cannon.CANNON.Body = js.native
  
  /* CompleteClass */
  var bodyB: typings.cannon.CANNON.Body = js.native
  
  /* CompleteClass */
  var collideConnected: Boolean = js.native
  
  /* CompleteClass */
  override def disable(): Unit = js.native
  
  /* CompleteClass */
  override def disableMotor(): Unit = js.native
  
  /* CompleteClass */
  override def enable(): Unit = js.native
  
  /* CompleteClass */
  override def enableMotor(): Unit = js.native
  
  /* CompleteClass */
  var equations: js.Array[js.Any] = js.native
  
  /* CompleteClass */
  var id: Double = js.native
  
  /* CompleteClass */
  var motorEnabled: Boolean = js.native
  
  /* CompleteClass */
  var motorEquation: typings.cannon.CANNON.RotationalMotorEquation = js.native
  
  /* CompleteClass */
  var motorMaxForce: Double = js.native
  
  /* CompleteClass */
  var motorMinForce: Double = js.native
  
  /* CompleteClass */
  var motorTargetVelocity: Double = js.native
  
  /* CompleteClass */
  override def update(): Unit = js.native
}
