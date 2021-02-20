package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RigidVehicle extends StObject {
  
  def addToWorld(world: World): Unit = js.native
  
  def addWheel(): Body = js.native
  def addWheel(options: IWheelInfoOptions): Body = js.native
  
  def applyWheelForce(value: Double, wheelIndex: Double): Unit = js.native
  
  var chassisBody: Body = js.native
  
  var constraints: js.Array[Constraint] = js.native
  
  var coordinateSystem: Vec3 = js.native
  
  def disableMotor(wheelIndex: Double): Unit = js.native
  
  def getWheelSpeed(wheelIndex: Double): Double = js.native
  
  def removeFromWorld(world: World): Unit = js.native
  
  def setMotorSpeed(value: Double, wheelIndex: Double): Unit = js.native
  
  def setSteeringValue(value: Double, wheelIndex: Double): Unit = js.native
  
  def setWheelForce(value: Double, wheelIndex: Double): Unit = js.native
  
  var wheelAxes: js.Array[Vec3] = js.native
  
  var wheelBodies: js.Array[Body] = js.native
  
  var wheelForces: js.Array[Vec3] = js.native
}
