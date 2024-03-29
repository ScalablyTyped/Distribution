package typings.cannon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "RotationalMotorEquation")
@js.native
open class RotationalMotorEquation protected ()
  extends StObject
     with typings.cannon.CANNON.RotationalMotorEquation {
  def this(bodyA: typings.cannon.CANNON.Body, bodyB: typings.cannon.CANNON.Body) = this()
  def this(bodyA: typings.cannon.CANNON.Body, bodyB: typings.cannon.CANNON.Body, maxForce: Double) = this()
  
  /* CompleteClass */
  var a: Double = js.native
  
  /* CompleteClass */
  override def addToWlamda(deltalambda: Double): Double = js.native
  
  /* CompleteClass */
  var axisA: typings.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  var axisB: typings.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  var b: Double = js.native
  
  /* CompleteClass */
  var bi: typings.cannon.CANNON.Body = js.native
  
  /* CompleteClass */
  var bj: typings.cannon.CANNON.Body = js.native
  
  /* CompleteClass */
  override def computeB(a: Double, b: Double, h: Double): Double = js.native
  
  /* CompleteClass */
  override def computeC(): Double = js.native
  
  /* CompleteClass */
  override def computeGW(): Double = js.native
  
  /* CompleteClass */
  override def computeGWlamda(): Double = js.native
  
  /* CompleteClass */
  override def computeGiMGt(): Double = js.native
  
  /* CompleteClass */
  override def computeGiMf(): Double = js.native
  
  /* CompleteClass */
  override def computeGq(): Double = js.native
  
  /* CompleteClass */
  var enabled: Boolean = js.native
  
  /* CompleteClass */
  var eps: Double = js.native
  
  /* CompleteClass */
  var id: Double = js.native
  
  /* CompleteClass */
  var invIj: typings.cannon.CANNON.Mat3 = js.native
  
  /* CompleteClass */
  var invLi: typings.cannon.CANNON.Mat3 = js.native
  
  /* CompleteClass */
  var jacobianElementA: typings.cannon.CANNON.JacobianElement = js.native
  
  /* CompleteClass */
  var jacobianElementB: typings.cannon.CANNON.JacobianElement = js.native
  
  /* CompleteClass */
  var maxForce: Double = js.native
  
  /* CompleteClass */
  var minForce: Double = js.native
  
  /* CompleteClass */
  override def setSpookParams(stiffness: Double, relaxation: Double, timeStep: Double): Unit = js.native
  
  /* CompleteClass */
  var targetVelocity: Double = js.native
}
