package typings.box2d.Box2D.Collision

import typings.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBroadPhase extends js.Object {
  /**
  		* Create a proxy with an initial AABB. Pairs are not reported until UpdatePairs is called.
  		* @param aabb Proxy Fat AABB.
  		* @param userData User defined data.
  		* @return Proxy created from aabb and userData.
  		**/
  def CreateProxy(aabb: b2AABB, userData: js.Any): b2DynamicTreeNode
  /**
  		* Destroy a proxy. It is up to the client to remove any pairs.
  		* @param proxy Proxy to destroy.
  		**/
  def DestroyProxy(proxy: b2DynamicTreeNode): Unit
  /**
  		* Get the Fat AABB for a proxy.
  		* @param proxy Proxy to retrieve the Fat AABB.
  		**/
  def GetFatAABB(proxy: b2DynamicTreeNode): b2AABB
  /**
  		* Get the number of proxies.
  		* @return Number of proxies.
  		**/
  def GetProxyCount(): Double
  /**
  		* Get user data from a proxy. Returns null if the proxy is invalid.
  		* @param proxy Proxy to retrieve user data from.
  		* @return Gets the user data from proxy, or null if the proxy is invalid.
  		**/
  def GetUserData(proxy: b2DynamicTreeNode): js.Any
  /**
  		* Call MoveProxy as many times as you like, then when you are done call UpdatePairs to finalized the proxy pairs (for your time step).
  		* @param proxy Proxy to move.
  		* @param aabb Swept AABB.
  		* @param displacement Extra AABB displacement.
  		**/
  def MoveProxy(proxy: b2DynamicTreeNode, aabb: b2AABB, displacement: b2Vec2): Unit
  /**
  		* Query an AABB for overlapping proxies. The callback is called for each proxy that overlaps the supplied AABB. The callback should match function signature fuction callback(proxy:b2DynamicTreeNode):Boolean and should return false to trigger premature termination.
  		* @param callback Called for each proxy that overlaps the supplied AABB.
  		*	param proxy Proxy overlapping the supplied AABB.
  		* @param aabb Proxies are query for overlap on this AABB.
  		**/
  def Query(callback: js.Function1[/* proxy */ b2DynamicTreeNode, Boolean], aabb: b2AABB): Unit
  /**
  		* Ray-cast against the proxies in the tree. This relies on the callback to perform a exact ray-cast in the case were the proxy contains a shape. The callback also performs the any collision filtering. This has performance roughly equal to k log(n), where k is the number of collisions and n is the number of proxies in the tree.
  		* @param callback Called for each proxy that is hit by the ray.
  		*	param input Ray cast input data.
  		*	param proxy The proxy hit by the ray cast.
  		*	param return Return value is the new value for maxFraction.
  		* @param input Ray cast input data.  Query all proxies along this ray cast.
  		**/
  def RayCast(
    callback: js.Function2[/* input */ b2RayCastInput, /* proxy */ b2DynamicTreeNode, Double],
    input: b2RayCastInput
  ): Unit
  /**
  		* Perform some iterations to re-balance the tree.
  		* @param iterations Number of rebalance iterations to perform.
  		**/
  def Rebalance(iterations: Double): Unit
}

object IBroadPhase {
  @scala.inline
  def apply(
    CreateProxy: (b2AABB, js.Any) => b2DynamicTreeNode,
    DestroyProxy: b2DynamicTreeNode => Unit,
    GetFatAABB: b2DynamicTreeNode => b2AABB,
    GetProxyCount: () => Double,
    GetUserData: b2DynamicTreeNode => js.Any,
    MoveProxy: (b2DynamicTreeNode, b2AABB, b2Vec2) => Unit,
    Query: (js.Function1[/* proxy */ b2DynamicTreeNode, Boolean], b2AABB) => Unit,
    RayCast: (js.Function2[/* input */ b2RayCastInput, /* proxy */ b2DynamicTreeNode, Double], b2RayCastInput) => Unit,
    Rebalance: Double => Unit
  ): IBroadPhase = {
    val __obj = js.Dynamic.literal(CreateProxy = js.Any.fromFunction2(CreateProxy), DestroyProxy = js.Any.fromFunction1(DestroyProxy), GetFatAABB = js.Any.fromFunction1(GetFatAABB), GetProxyCount = js.Any.fromFunction0(GetProxyCount), GetUserData = js.Any.fromFunction1(GetUserData), MoveProxy = js.Any.fromFunction3(MoveProxy), Query = js.Any.fromFunction2(Query), RayCast = js.Any.fromFunction2(RayCast), Rebalance = js.Any.fromFunction1(Rebalance))
    __obj.asInstanceOf[IBroadPhase]
  }
}

