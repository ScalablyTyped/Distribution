package typings.cannon.CANNON

import typings.cannon.anon.Broadphaser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait World
  extends StObject
     with EventTarget {
  
  def addBody(body: Body): Unit = js.native
  
  var addBodyEvent: IBodyEvent = js.native
  
  def addConstraint(c: Constraint): Unit = js.native
  
  def addContactMaterial(cmat: ContactMaterial): Unit = js.native
  
  def addMaterial(m: Material): Unit = js.native
  
  var allowSleep: Boolean = js.native
  
  var bodies: js.Array[Body] = js.native
  
  var broadphase: NaiveBroadphase = js.native
  
  var collisionMatrix: ArrayCollisionMatrix = js.native
  
  var collisionMatrixPrevious: ArrayCollisionMatrix = js.native
  
  def collisionMatrixTick(): Unit = js.native
  
  var constraints: js.Array[Constraint] = js.native
  
  var contactMaterialTable: TupleDictionary = js.native
  
  var contactmaterials: js.Array[ContactMaterial] = js.native
  
  var contacts: js.Array[ContactEquation] = js.native
  
  var defaultContactMaterial: ContactMaterial = js.native
  
  var defaultMaterial: Material = js.native
  
  var default_dt: Double = js.native
  
  var doProfiling: Boolean = js.native
  
  var dt: Double = js.native
  
  var frictionEquations: js.Array[FrictionEquation] = js.native
  
  def getContactMaterial(m1: Material, m2: Material): ContactMaterial = js.native
  
  var gravity: Vec3 = js.native
  
  var iterations: Double = js.native
  
  var materials: js.Array[Material] = js.native
  
  var narrowPhase: NarrowPhase = js.native
  
  var nextId: Double = js.native
  
  def numObjects(): Double = js.native
  
  var profile: Broadphaser = js.native
  
  var quatNormalizeFast: Boolean = js.native
  
  var quatNormalizeSkip: Double = js.native
  
  def rayTest(from: Vec3, to: Vec3, result: RaycastResult): Unit = js.native
  
  def remove(body: Body): Unit = js.native
  
  var removeBodyEvent: IBodyEvent = js.native
  
  def removeConstraint(c: Constraint): Unit = js.native
  
  var solver: Solver = js.native
  
  def step(dy: Double): Unit = js.native
  def step(dy: Double, timeSinceLastCalled: Double): Unit = js.native
  def step(dy: Double, timeSinceLastCalled: Double, maxSubSteps: Double): Unit = js.native
  def step(dy: Double, timeSinceLastCalled: Unit, maxSubSteps: Double): Unit = js.native
  
  var stepnumber: Double = js.native
  
  var subsystems: js.Array[js.Any] = js.native
  
  var time: Double = js.native
}
