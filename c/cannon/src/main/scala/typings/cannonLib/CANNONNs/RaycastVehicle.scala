package typings
package cannonLib.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.RaycastVehicle")
@js.native
class RaycastVehicle () extends js.Object {
  def this(options: IRaycastVehicleOptions) = this()
  var chassisBody: Body = js.native
  var iindexRightAxis: scala.Double = js.native
  var indexForwardAxis: scala.Double = js.native
  var indexUpAxis: scala.Double = js.native
  var sliding: scala.Boolean = js.native
  var wheelInfos: js.Array[IWheelInfoOptions] = js.native
  var world: World = js.native
  def addToWorld(world: World): scala.Unit = js.native
  def addWheel(): scala.Unit = js.native
  def addWheel(options: IWheelInfoOptions): scala.Unit = js.native
  def applyEngineForce(value: scala.Double, wheelIndex: scala.Double): scala.Unit = js.native
  def getVehicleAxisWorld(axisIndex: scala.Double, result: Vec3): Vec3 = js.native
  def getWheelTransformWorld(wheelIndex: scala.Double): Transform = js.native
  def removeFromWorld(world: World): scala.Unit = js.native
  def setBrake(brake: scala.Double, wheelIndex: scala.Double): scala.Unit = js.native
  def setSteeringValue(value: scala.Double, wheelIndex: scala.Double): scala.Unit = js.native
  def updateSuspension(deltaTime: scala.Double): scala.Unit = js.native
  def updateVehicle(timeStep: scala.Double): scala.Unit = js.native
}

