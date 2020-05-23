package typings.cannon.global.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.GridBroadphase")
@js.native
class GridBroadphase ()
  extends typings.cannon.CANNON.GridBroadphase {
  def this(aabbMin: typings.cannon.CANNON.Vec3) = this()
  def this(aabbMin: typings.cannon.CANNON.Vec3, aabbMax: typings.cannon.CANNON.Vec3) = this()
  def this(aabbMin: typings.cannon.CANNON.Vec3, aabbMax: typings.cannon.CANNON.Vec3, nx: Double) = this()
  def this(aabbMin: typings.cannon.CANNON.Vec3, aabbMax: typings.cannon.CANNON.Vec3, nx: Double, ny: Double) = this()
  def this(
    aabbMin: typings.cannon.CANNON.Vec3,
    aabbMax: typings.cannon.CANNON.Vec3,
    nx: Double,
    ny: Double,
    nz: Double
  ) = this()
  /* CompleteClass */
  override var aabbMax: typings.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var aabbMin: typings.cannon.CANNON.Vec3 = js.native
  /* CompleteClass */
  override var bins: js.Array[_] = js.native
  /* CompleteClass */
  override var dirty: Boolean = js.native
  /* CompleteClass */
  override var nx: Double = js.native
  /* CompleteClass */
  override var ny: Double = js.native
  /* CompleteClass */
  override var nz: Double = js.native
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

