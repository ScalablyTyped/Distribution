package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BroadPhase extends js.Object {
  var dirty: Boolean
  var useBoundingBoxes: Boolean
  var world: World
  def aabbQuery(world: World, aabb: AABB, result: js.Array[Body]): js.Array[Body]
  def boundingSphereCheck(bodyA: Body, bodyB: Body): Boolean
  def collisionPairs(world: World, p1: js.Array[Body], p2: js.Array[Body]): Unit
  def doBoundingBoxBroadphase(bodyA: Body, bodyB: Body, pairs1: js.Array[Body], pairs2: js.Array[Body]): Unit
  def doBoundingSphereBroadphase(bodyA: Body, bodyB: Body, pairs1: js.Array[Body], pairs2: js.Array[Body]): Unit
  def intersectionTest(bodyA: Body, bodyB: Body, pairs1: js.Array[Body], pairs2: js.Array[Body]): Unit
  def makePairsUnique(pairs1: js.Array[Body], pairs2: js.Array[Body]): Unit
  def needBroadphaseCollision(bodyA: Body, bodyB: Body): Boolean
  def setWorld(world: World): Unit
}

object BroadPhase {
  @scala.inline
  def apply(
    aabbQuery: (World, AABB, js.Array[Body]) => js.Array[Body],
    boundingSphereCheck: (Body, Body) => Boolean,
    collisionPairs: (World, js.Array[Body], js.Array[Body]) => Unit,
    dirty: Boolean,
    doBoundingBoxBroadphase: (Body, Body, js.Array[Body], js.Array[Body]) => Unit,
    doBoundingSphereBroadphase: (Body, Body, js.Array[Body], js.Array[Body]) => Unit,
    intersectionTest: (Body, Body, js.Array[Body], js.Array[Body]) => Unit,
    makePairsUnique: (js.Array[Body], js.Array[Body]) => Unit,
    needBroadphaseCollision: (Body, Body) => Boolean,
    setWorld: World => Unit,
    useBoundingBoxes: Boolean,
    world: World
  ): BroadPhase = {
    val __obj = js.Dynamic.literal(aabbQuery = js.Any.fromFunction3(aabbQuery), boundingSphereCheck = js.Any.fromFunction2(boundingSphereCheck), collisionPairs = js.Any.fromFunction3(collisionPairs), dirty = dirty.asInstanceOf[js.Any], doBoundingBoxBroadphase = js.Any.fromFunction4(doBoundingBoxBroadphase), doBoundingSphereBroadphase = js.Any.fromFunction4(doBoundingSphereBroadphase), intersectionTest = js.Any.fromFunction4(intersectionTest), makePairsUnique = js.Any.fromFunction2(makePairsUnique), needBroadphaseCollision = js.Any.fromFunction2(needBroadphaseCollision), setWorld = js.Any.fromFunction1(setWorld), useBoundingBoxes = useBoundingBoxes.asInstanceOf[js.Any], world = world.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadPhase]
  }
}

