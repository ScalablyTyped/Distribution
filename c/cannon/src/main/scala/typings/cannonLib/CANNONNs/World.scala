package typings
package cannonLib.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.World")
@js.native
class World () extends EventTarget {
  var addBodyEvent: IBodyEvent = js.native
  var allowSleep: scala.Boolean = js.native
  var bodies: js.Array[Body] = js.native
  var broadphase: NaiveBroadphase = js.native
  var collisionMatrix: ArrayCollisionMatrix = js.native
  var collisionMatrixPrevious: ArrayCollisionMatrix = js.native
  var constraints: js.Array[Constraint] = js.native
  var contactMaterialTable: TupleDictionary = js.native
  var contactmaterials: js.Array[ContactMaterial] = js.native
  var contacts: js.Array[ContactEquation] = js.native
  var defaultContactMaterial: ContactMaterial = js.native
  var defaultMaterial: Material = js.native
  var default_dt: scala.Double = js.native
  var doProfiling: scala.Boolean = js.native
  var dt: scala.Double = js.native
  var frictionEquations: js.Array[FrictionEquation] = js.native
  var gravity: Vec3 = js.native
  var iterations: scala.Double = js.native
  var materials: js.Array[Material] = js.native
  var narrowPhase: NarrowPhase = js.native
  var nextId: scala.Double = js.native
  var profile: cannonLib.Anon_Broadphaser = js.native
  var quatNormalizeFast: scala.Boolean = js.native
  var quatNormalizeSkip: scala.Double = js.native
  var removeBodyEvent: IBodyEvent = js.native
  var solver: Solver = js.native
  var stepnumber: scala.Double = js.native
  var subsystems: js.Array[_] = js.native
  var time: scala.Double = js.native
  def addBody(body: Body): scala.Unit = js.native
  def addConstraint(c: Constraint): scala.Unit = js.native
  def addContactMaterial(cmat: ContactMaterial): scala.Unit = js.native
  def addMaterial(m: Material): scala.Unit = js.native
  def collisionMatrixTick(): scala.Unit = js.native
  def getContactMaterial(m1: Material, m2: Material): ContactMaterial = js.native
  def numObjects(): scala.Double = js.native
  def rayTest(from: Vec3, to: Vec3, result: RaycastResult): scala.Unit = js.native
  def remove(body: Body): scala.Unit = js.native
  def removeConstraint(c: Constraint): scala.Unit = js.native
  def step(dy: scala.Double): scala.Unit = js.native
  def step(dy: scala.Double, timeSinceLastCalled: scala.Double): scala.Unit = js.native
  def step(dy: scala.Double, timeSinceLastCalled: scala.Double, maxSubSteps: scala.Double): scala.Unit = js.native
}

