package typings
package cannonLib.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.BroadPhase")
@js.native
class BroadPhase () extends js.Object {
  var dirty: scala.Boolean = js.native
  var useBoundingBoxes: scala.Boolean = js.native
  var world: World = js.native
  def aabbQuery(world: World, aabb: AABB, result: js.Array[Body]): js.Array[Body] = js.native
  def boundingSphereCheck(bodyA: Body, bodyB: Body): scala.Boolean = js.native
  def collisionPairs(world: World, p1: js.Array[Body], p2: js.Array[Body]): scala.Unit = js.native
  def doBoundingBoxBroadphase(bodyA: Body, bodyB: Body, pairs1: js.Array[Body], pairs2: js.Array[Body]): scala.Unit = js.native
  def doBoundingSphereBroadphase(bodyA: Body, bodyB: Body, pairs1: js.Array[Body], pairs2: js.Array[Body]): scala.Unit = js.native
  def intersectionTest(bodyA: Body, bodyB: Body, pairs1: js.Array[Body], pairs2: js.Array[Body]): scala.Unit = js.native
  def makePairsUnique(pairs1: js.Array[Body], pairs2: js.Array[Body]): scala.Unit = js.native
  def needBroadphaseCollision(bodyA: Body, bodyB: Body): scala.Boolean = js.native
  def setWorld(world: World): scala.Unit = js.native
}

