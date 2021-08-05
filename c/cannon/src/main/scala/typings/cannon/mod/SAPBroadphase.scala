package typings.cannon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "SAPBroadphase")
@js.native
class SAPBroadphase ()
  extends StObject
     with typings.cannon.CANNON.SAPBroadphase {
  def this(world: typings.cannon.CANNON.World) = this()
  
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
  override def setWorld(world: typings.cannon.CANNON.World): Unit = js.native
  
  /* CompleteClass */
  var useBoundingBoxes: Boolean = js.native
  
  /* CompleteClass */
  var world: typings.cannon.CANNON.World = js.native
}
/* static members */
object SAPBroadphase {
  
  @JSImport("cannon", "SAPBroadphase")
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkBounds(bi: typings.cannon.CANNON.Body, bj: typings.cannon.CANNON.Body): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkBounds")(bi.asInstanceOf[js.Any], bj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def checkBounds(bi: typings.cannon.CANNON.Body, bj: typings.cannon.CANNON.Body, axisIndex: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkBounds")(bi.asInstanceOf[js.Any], bj.asInstanceOf[js.Any], axisIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def insertionSortX(a: js.Array[js.Any]): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("insertionSortX")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  inline def insertionSortY(a: js.Array[js.Any]): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("insertionSortY")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  inline def insertionSortZ(a: js.Array[js.Any]): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("insertionSortZ")(a.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
}
