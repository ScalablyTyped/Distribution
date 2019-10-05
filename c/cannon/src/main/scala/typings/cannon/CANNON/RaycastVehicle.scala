package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.RaycastVehicle")
@js.native
class RaycastVehicle () extends js.Object {
  def this(options: IRaycastVehicleOptions) = this()
  var chassisBody: Body = js.native
  var iindexRightAxis: Double = js.native
  var indexForwardAxis: Double = js.native
  var indexUpAxis: Double = js.native
  var sliding: Boolean = js.native
  var wheelInfos: js.Array[IWheelInfoOptions] = js.native
  var world: World = js.native
  def addToWorld(world: World): Unit = js.native
  def addWheel(): Unit = js.native
  def addWheel(options: IWheelInfoOptions): Unit = js.native
  def applyEngineForce(value: Double, wheelIndex: Double): Unit = js.native
  def getVehicleAxisWorld(axisIndex: Double, result: Vec3): Vec3 = js.native
  def getWheelTransformWorld(wheelIndex: Double): Transform = js.native
  def removeFromWorld(world: World): Unit = js.native
  def setBrake(brake: Double, wheelIndex: Double): Unit = js.native
  def setSteeringValue(value: Double, wheelIndex: Double): Unit = js.native
  def updateSuspension(deltaTime: Double): Unit = js.native
  def updateVehicle(timeStep: Double): Unit = js.native
}

