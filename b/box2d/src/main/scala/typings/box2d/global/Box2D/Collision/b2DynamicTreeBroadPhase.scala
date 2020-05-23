package typings.box2d.global.Box2D.Collision

import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.b2DynamicTreeBroadPhase")
@js.native
/**
  * Creates the dynamic tree broad phase.
  **/
class b2DynamicTreeBroadPhase ()
  extends typings.box2d.Box2D.Collision.b2DynamicTreeBroadPhase {
  /**
    * Create a proxy with an initial AABB. Pairs are not reported until UpdatePairs is called.
    * @param aabb Proxy Fat AABB.
    * @param userData User defined data.
    * @return Proxy created from aabb and userData.
    **/
  /* CompleteClass */
  override def CreateProxy(aabb: typings.box2d.Box2D.Collision.b2AABB, userData: js.Any): typings.box2d.Box2D.Collision.b2DynamicTreeNode = js.native
  /**
    * Destroy a proxy. It is up to the client to remove any pairs.
    * @param proxy Proxy to destroy.
    **/
  /* CompleteClass */
  override def DestroyProxy(proxy: typings.box2d.Box2D.Collision.b2DynamicTreeNode): Unit = js.native
  /**
    * Get the Fat AABB for a proxy.
    * @param proxy Proxy to retrieve the Fat AABB.
    **/
  /* CompleteClass */
  override def GetFatAABB(proxy: typings.box2d.Box2D.Collision.b2DynamicTreeNode): typings.box2d.Box2D.Collision.b2AABB = js.native
  /**
    * Get the number of proxies.
    * @return Number of proxies.
    **/
  /* CompleteClass */
  override def GetProxyCount(): Double = js.native
  /**
    * Get user data from a proxy. Returns null if the proxy is invalid.
    * @param proxy Proxy to retrieve user data from.
    * @return Gets the user data from proxy, or null if the proxy is invalid.
    **/
  /* CompleteClass */
  override def GetUserData(proxy: typings.box2d.Box2D.Collision.b2DynamicTreeNode): js.Any = js.native
  /**
    * Call MoveProxy as many times as you like, then when you are done call UpdatePairs to finalized the proxy pairs (for your time step).
    * @param proxy Proxy to move.
    * @param aabb Swept AABB.
    * @param displacement Extra AABB displacement.
    **/
  /* CompleteClass */
  override def MoveProxy(
    proxy: typings.box2d.Box2D.Collision.b2DynamicTreeNode,
    aabb: typings.box2d.Box2D.Collision.b2AABB,
    displacement: b2Vec2
  ): Unit = js.native
  /**
    * Query an AABB for overlapping proxies. The callback is called for each proxy that overlaps the supplied AABB. The callback should match function signature fuction callback(proxy:b2DynamicTreeNode):Boolean and should return false to trigger premature termination.
    * @param callback Called for each proxy that overlaps the supplied AABB.
    *    param proxy Proxy overlapping the supplied AABB.
    * @param aabb Proxies are query for overlap on this AABB.
    **/
  /* CompleteClass */
  override def Query(
    callback: js.Function1[/* proxy */ typings.box2d.Box2D.Collision.b2DynamicTreeNode, Boolean],
    aabb: typings.box2d.Box2D.Collision.b2AABB
  ): Unit = js.native
  /**
    * Ray-cast against the proxies in the tree. This relies on the callback to perform a exact ray-cast in the case were the proxy contains a shape. The callback also performs the any collision filtering. This has performance roughly equal to k log(n), where k is the number of collisions and n is the number of proxies in the tree.
    * @param callback Called for each proxy that is hit by the ray.
    *    param input Ray cast input data.
    *    param proxy The proxy hit by the ray cast.
    *    param return Return value is the new value for maxFraction.
    * @param input Ray cast input data.  Query all proxies along this ray cast.
    **/
  /* CompleteClass */
  override def RayCast(
    callback: js.Function2[
      /* input */ typings.box2d.Box2D.Collision.b2RayCastInput, 
      /* proxy */ typings.box2d.Box2D.Collision.b2DynamicTreeNode, 
      Double
    ],
    input: typings.box2d.Box2D.Collision.b2RayCastInput
  ): Unit = js.native
  /**
    * Perform some iterations to re-balance the tree.
    * @param iterations Number of rebalance iterations to perform.
    **/
  /* CompleteClass */
  override def Rebalance(iterations: Double): Unit = js.native
  /**
    * Tests if two proxies overlap.
    * @param proxyA First proxy to test.
    * @param proxyB Second proxy to test.
    * @return True if the proxyA and proxyB overlap with Fat AABBs, otherwise false.
    **/
  /* CompleteClass */
  override def TestOverlap(
    proxyA: typings.box2d.Box2D.Collision.b2DynamicTreeNode,
    proxyB: typings.box2d.Box2D.Collision.b2DynamicTreeNode
  ): Boolean = js.native
  /**
    * Update the pairs. This results in pair callbacks. This can only add pairs.
    * @param callback Called for all new proxy pairs.
    *    param userDataA Proxy A in the pair user data.
    *    param userDataB Proxy B in the pair user data.
    **/
  /* CompleteClass */
  override def UpdatePairs(callback: js.Function2[/* userDataA */ js.Any, /* userDataB */ js.Any, Unit]): Unit = js.native
  /**
    * Validates the dynamic tree.
    * NOTE: this says "todo" in the current Box2DFlash code.
    **/
  /* CompleteClass */
  override def Validate(): Unit = js.native
}

