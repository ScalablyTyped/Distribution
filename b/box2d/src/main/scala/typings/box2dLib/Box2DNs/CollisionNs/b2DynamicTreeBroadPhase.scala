package typings
package box2dLib.Box2DNs.CollisionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.b2DynamicTreeBroadPhase")
@js.native
class b2DynamicTreeBroadPhase () extends IBroadPhase {
  /**
  		* Create a proxy with an initial AABB. Pairs are not reported until UpdatePairs is called.
  		* @param aabb Proxy Fat AABB.
  		* @param userData User defined data.
  		* @return Proxy created from aabb and userData.
  		**/
  /* CompleteClass */
  override def CreateProxy(aabb: b2AABB, userData: js.Any): b2DynamicTreeNode = js.native
  /**
  		* Destroy a proxy. It is up to the client to remove any pairs.
  		* @param proxy Proxy to destroy.
  		**/
  /* CompleteClass */
  override def DestroyProxy(proxy: b2DynamicTreeNode): scala.Unit = js.native
  /**
  		* Get the Fat AABB for a proxy.
  		* @param proxy Proxy to retrieve the Fat AABB.
  		**/
  /* CompleteClass */
  override def GetFatAABB(proxy: b2DynamicTreeNode): b2AABB = js.native
  /**
  		* Get the number of proxies.
  		* @return Number of proxies.
  		**/
  /* CompleteClass */
  override def GetProxyCount(): scala.Double = js.native
  /**
  		* Get user data from a proxy. Returns null if the proxy is invalid.
  		* @param proxy Proxy to retrieve user data from.
  		* @return Gets the user data from proxy, or null if the proxy is invalid.
  		**/
  /* CompleteClass */
  override def GetUserData(proxy: b2DynamicTreeNode): js.Any = js.native
  /**
  		* Call MoveProxy as many times as you like, then when you are done call UpdatePairs to finalized the proxy pairs (for your time step).
  		* @param proxy Proxy to move.
  		* @param aabb Swept AABB.
  		* @param displacement Extra AABB displacement.
  		**/
  /* CompleteClass */
  override def MoveProxy(proxy: b2DynamicTreeNode, aabb: b2AABB, displacement: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2): scala.Unit = js.native
  /**
  		* Query an AABB for overlapping proxies. The callback is called for each proxy that overlaps the supplied AABB. The callback should match function signature fuction callback(proxy:b2DynamicTreeNode):Boolean and should return false to trigger premature termination.
  		* @param callback Called for each proxy that overlaps the supplied AABB.
  		*	param proxy Proxy overlapping the supplied AABB.
  		* @param aabb Proxies are query for overlap on this AABB.
  		**/
  /* CompleteClass */
  override def Query(callback: js.Function1[/* proxy */ b2DynamicTreeNode, scala.Boolean], aabb: b2AABB): scala.Unit = js.native
  /**
  		* Ray-cast against the proxies in the tree. This relies on the callback to perform a exact ray-cast in the case were the proxy contains a shape. The callback also performs the any collision filtering. This has performance roughly equal to k log(n), where k is the number of collisions and n is the number of proxies in the tree.
  		* @param callback Called for each proxy that is hit by the ray.
  		*	param input Ray cast input data.
  		*	param proxy The proxy hit by the ray cast.
  		*	param return Return value is the new value for maxFraction.
  		* @param input Ray cast input data.  Query all proxies along this ray cast.
  		**/
  /* CompleteClass */
  override def RayCast(
    callback: js.Function2[/* input */ b2RayCastInput, /* proxy */ b2DynamicTreeNode, scala.Double],
    input: b2RayCastInput
  ): scala.Unit = js.native
  /**
  		* Perform some iterations to re-balance the tree.
  		* @param iterations Number of rebalance iterations to perform.
  		**/
  /* CompleteClass */
  override def Rebalance(iterations: scala.Double): scala.Unit = js.native
  /**
  		* Tests if two proxies overlap.
  		* @param proxyA First proxy to test.
  		* @param proxyB Second proxy to test.
  		* @return True if the proxyA and proxyB overlap with Fat AABBs, otherwise false.
  		**/
  def TestOverlap(proxyA: b2DynamicTreeNode, proxyB: b2DynamicTreeNode): scala.Boolean = js.native
  /**
  		* Update the pairs. This results in pair callbacks. This can only add pairs.
  		* @param callback Called for all new proxy pairs.
  		*	param userDataA Proxy A in the pair user data.
  		*	param userDataB Proxy B in the pair user data.
  		**/
  def UpdatePairs(callback: js.Function2[/* userDataA */ js.Any, /* userDataB */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
  		* Validates the dynamic tree.
  		* NOTE: this says "todo" in the current Box2DFlash code.
  		**/
  def Validate(): scala.Unit = js.native
}

