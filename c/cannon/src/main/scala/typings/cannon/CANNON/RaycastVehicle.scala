package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RaycastVehicle extends StObject {
  
  def addToWorld(world: World): Unit = js.native
  
  def addWheel(): Unit = js.native
  def addWheel(options: IWheelInfoOptions): Unit = js.native
  
  def applyEngineForce(value: Double, wheelIndex: Double): Unit = js.native
  
  var chassisBody: Body = js.native
  
  def getVehicleAxisWorld(axisIndex: Double, result: Vec3): Vec3 = js.native
  
  def getWheelTransformWorld(wheelIndex: Double): Transform = js.native
  
  var iindexRightAxis: Double = js.native
  
  var indexForwardAxis: Double = js.native
  
  var indexUpAxis: Double = js.native
  
  def removeFromWorld(world: World): Unit = js.native
  
  def setBrake(brake: Double, wheelIndex: Double): Unit = js.native
  
  def setSteeringValue(value: Double, wheelIndex: Double): Unit = js.native
  
  var sliding: Boolean = js.native
  
  def updateSuspension(deltaTime: Double): Unit = js.native
  
  def updateVehicle(timeStep: Double): Unit = js.native
  
  def updateWheelTransform(wheelIndex: Double): Unit = js.native
  
  var wheelInfos: js.Array[IWheelInfoOptions] = js.native
  
  var world: World = js.native
}
