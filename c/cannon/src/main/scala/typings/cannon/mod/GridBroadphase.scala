package typings.cannon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "GridBroadphase")
@js.native
open class GridBroadphase ()
  extends StObject
     with typings.cannon.CANNON.GridBroadphase {
  def this(aabbMin: typings.cannon.CANNON.Vec3) = this()
  def this(aabbMin: Unit, aabbMax: typings.cannon.CANNON.Vec3) = this()
  def this(aabbMin: typings.cannon.CANNON.Vec3, aabbMax: typings.cannon.CANNON.Vec3) = this()
  def this(aabbMin: Unit, aabbMax: Unit, nx: Double) = this()
  def this(aabbMin: Unit, aabbMax: typings.cannon.CANNON.Vec3, nx: Double) = this()
  def this(aabbMin: typings.cannon.CANNON.Vec3, aabbMax: Unit, nx: Double) = this()
  def this(aabbMin: typings.cannon.CANNON.Vec3, aabbMax: typings.cannon.CANNON.Vec3, nx: Double) = this()
  def this(aabbMin: Unit, aabbMax: Unit, nx: Double, ny: Double) = this()
  def this(aabbMin: Unit, aabbMax: Unit, nx: Unit, ny: Double) = this()
  def this(aabbMin: Unit, aabbMax: typings.cannon.CANNON.Vec3, nx: Double, ny: Double) = this()
  def this(aabbMin: Unit, aabbMax: typings.cannon.CANNON.Vec3, nx: Unit, ny: Double) = this()
  def this(aabbMin: typings.cannon.CANNON.Vec3, aabbMax: Unit, nx: Double, ny: Double) = this()
  def this(aabbMin: typings.cannon.CANNON.Vec3, aabbMax: Unit, nx: Unit, ny: Double) = this()
  def this(aabbMin: typings.cannon.CANNON.Vec3, aabbMax: typings.cannon.CANNON.Vec3, nx: Double, ny: Double) = this()
  def this(aabbMin: typings.cannon.CANNON.Vec3, aabbMax: typings.cannon.CANNON.Vec3, nx: Unit, ny: Double) = this()
  def this(aabbMin: Unit, aabbMax: Unit, nx: Double, ny: Double, nz: Double) = this()
  def this(aabbMin: Unit, aabbMax: Unit, nx: Double, ny: Unit, nz: Double) = this()
  def this(aabbMin: Unit, aabbMax: Unit, nx: Unit, ny: Double, nz: Double) = this()
  def this(aabbMin: Unit, aabbMax: Unit, nx: Unit, ny: Unit, nz: Double) = this()
  def this(aabbMin: Unit, aabbMax: typings.cannon.CANNON.Vec3, nx: Double, ny: Double, nz: Double) = this()
  def this(aabbMin: Unit, aabbMax: typings.cannon.CANNON.Vec3, nx: Double, ny: Unit, nz: Double) = this()
  def this(aabbMin: Unit, aabbMax: typings.cannon.CANNON.Vec3, nx: Unit, ny: Double, nz: Double) = this()
  def this(aabbMin: Unit, aabbMax: typings.cannon.CANNON.Vec3, nx: Unit, ny: Unit, nz: Double) = this()
  def this(aabbMin: typings.cannon.CANNON.Vec3, aabbMax: Unit, nx: Double, ny: Double, nz: Double) = this()
  def this(aabbMin: typings.cannon.CANNON.Vec3, aabbMax: Unit, nx: Double, ny: Unit, nz: Double) = this()
  def this(aabbMin: typings.cannon.CANNON.Vec3, aabbMax: Unit, nx: Unit, ny: Double, nz: Double) = this()
  def this(aabbMin: typings.cannon.CANNON.Vec3, aabbMax: Unit, nx: Unit, ny: Unit, nz: Double) = this()
  def this(
    aabbMin: typings.cannon.CANNON.Vec3,
    aabbMax: typings.cannon.CANNON.Vec3,
    nx: Double,
    ny: Double,
    nz: Double
  ) = this()
  def this(
    aabbMin: typings.cannon.CANNON.Vec3,
    aabbMax: typings.cannon.CANNON.Vec3,
    nx: Double,
    ny: Unit,
    nz: Double
  ) = this()
  def this(
    aabbMin: typings.cannon.CANNON.Vec3,
    aabbMax: typings.cannon.CANNON.Vec3,
    nx: Unit,
    ny: Double,
    nz: Double
  ) = this()
  def this(
    aabbMin: typings.cannon.CANNON.Vec3,
    aabbMax: typings.cannon.CANNON.Vec3,
    nx: Unit,
    ny: Unit,
    nz: Double
  ) = this()
  
  /* CompleteClass */
  var aabbMax: typings.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  var aabbMin: typings.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  override def aabbQuery(
    world: typings.cannon.CANNON.World,
    aabb: typings.cannon.CANNON.AABB,
    result: js.Array[typings.cannon.CANNON.Body]
  ): js.Array[typings.cannon.CANNON.Body] = js.native
  
  /* CompleteClass */
  var bins: js.Array[Any] = js.native
  
  /* CompleteClass */
  override def boundingSphereCheck(bodyA: typings.cannon.CANNON.Body, bodyB: typings.cannon.CANNON.Body): Boolean = js.native
  
  /* CompleteClass */
  override def collisionPairs(
    world: typings.cannon.CANNON.World,
    p1: js.Array[typings.cannon.CANNON.Body],
    p2: js.Array[typings.cannon.CANNON.Body]
  ): Unit = js.native
  
  /* CompleteClass */
  var dirty: Boolean = js.native
  
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
  var nx: Double = js.native
  
  /* CompleteClass */
  var ny: Double = js.native
  
  /* CompleteClass */
  var nz: Double = js.native
  
  /* CompleteClass */
  override def setWorld(world: typings.cannon.CANNON.World): Unit = js.native
  
  /* CompleteClass */
  var useBoundingBoxes: Boolean = js.native
  
  /* CompleteClass */
  var world: typings.cannon.CANNON.World = js.native
}
