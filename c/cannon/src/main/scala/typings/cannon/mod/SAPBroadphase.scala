package typings.cannon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "SAPBroadphase")
@js.native
class SAPBroadphase ()
  extends typings.cannon.CANNON.SAPBroadphase {
  def this(world: typings.cannon.CANNON.World) = this()
  /* CompleteClass */
  override var dirty: Boolean = js.native
  /* CompleteClass */
  override var useBoundingBoxes: Boolean = js.native
  /* CompleteClass */
  override var world: typings.cannon.CANNON.World = js.native
  /* CompleteClass */
  override def aabbQuery(
    world: typings.cannon.CANNON.World,
    aabb: typings.cannon.CANNON.AABB,
    result: js.Array[typings.cannon.CANNON.Body]
  ): js.Array[typings.cannon.CANNON.Body] = js.native
  /* CompleteClass */
  override def boundingSphereCheck(bodyA: typings.cannon.CANNON.Body, bodyB: typings.cannon.CANNON.Body): Boolean = js.native
  /* CompleteClass */
  override def collisionPairs(
    world: typings.cannon.CANNON.World,
    p1: js.Array[typings.cannon.CANNON.Body],
    p2: js.Array[typings.cannon.CANNON.Body]
  ): Unit = js.native
  /* CompleteClass */
  override def doBoundingBoxBroadphase(
    bodyA: typings.cannon.CANNON.Body,
    bodyB: typings.cannon.CANNON.Body,
    pairs1: js.Array[typings.cannon.CANNON.Body],
    pairs2: js.Array[typings.cannon.CANNON.Body]
  ): Unit = js.native
  /* CompleteClass */
  override def doBoundingSphereBroadphase(
    bodyA: typings.cannon.CANNON.Body,
    bodyB: typings.cannon.CANNON.Body,
    pairs1: js.Array[typings.cannon.CANNON.Body],
    pairs2: js.Array[typings.cannon.CANNON.Body]
  ): Unit = js.native
  /* CompleteClass */
  override def intersectionTest(
    bodyA: typings.cannon.CANNON.Body,
    bodyB: typings.cannon.CANNON.Body,
    pairs1: js.Array[typings.cannon.CANNON.Body],
    pairs2: js.Array[typings.cannon.CANNON.Body]
  ): Unit = js.native
  /* CompleteClass */
  override def makePairsUnique(pairs1: js.Array[typings.cannon.CANNON.Body], pairs2: js.Array[typings.cannon.CANNON.Body]): Unit = js.native
  /* CompleteClass */
  override def needBroadphaseCollision(bodyA: typings.cannon.CANNON.Body, bodyB: typings.cannon.CANNON.Body): Boolean = js.native
  /* CompleteClass */
  override def setWorld(world: typings.cannon.CANNON.World): Unit = js.native
}

/* static members */
@JSImport("cannon", "SAPBroadphase")
@js.native
object SAPBroadphase extends js.Object {
  def checkBounds(bi: typings.cannon.CANNON.Body, bj: typings.cannon.CANNON.Body): Boolean = js.native
  def checkBounds(bi: typings.cannon.CANNON.Body, bj: typings.cannon.CANNON.Body, axisIndex: Double): Boolean = js.native
  def insertionSortX(a: js.Array[_]): js.Array[_] = js.native
  def insertionSortY(a: js.Array[_]): js.Array[_] = js.native
  def insertionSortZ(a: js.Array[_]): js.Array[_] = js.native
}

