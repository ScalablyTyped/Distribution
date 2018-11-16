package typings
package cannonLib.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.RigidVehicle")
@js.native
class RigidVehicle () extends js.Object {
  def this(options: IRigidVehicleOptions) = this()
  var chassisBody: Body = js.native
  var constraints: js.Array[Constraint] = js.native
  var coordinateSystem: Vec3 = js.native
  var wheelAxes: js.Array[Vec3] = js.native
  var wheelBodies: js.Array[Body] = js.native
  var wheelForces: js.Array[Vec3] = js.native
  def addToWorld(world: World): scala.Unit = js.native
  def addWheel(): Body = js.native
  def addWheel(options: IWheelInfoOptions): Body = js.native
  def applyWheelForce(value: scala.Double, wheelIndex: scala.Double): scala.Unit = js.native
  def disableMotor(wheelIndex: scala.Double): scala.Unit = js.native
  def getWheelSpeed(wheelIndex: scala.Double): scala.Double = js.native
  def removeFromWorld(world: World): scala.Unit = js.native
  def setMotorSpeed(value: scala.Double, wheelIndex: scala.Double): scala.Unit = js.native
  def setSteeringValue(value: scala.Double, wheelIndex: scala.Double): scala.Unit = js.native
  def setWheelForce(value: scala.Double, wheelIndex: scala.Double): scala.Unit = js.native
}

