package typings
package box2dLib.Box2DNs.CollisionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.b2DynamicTree")
@js.native
/**
		* Constructing the tree initializes the node pool.
		**/
class b2DynamicTree () extends js.Object {
  /**
  		* Create a proxy. Provide a tight fitting AABB and a userData.
  		* @param aabb AABB.
  		* @param userDate User defined data for this proxy.
  		* @return Dynamic tree node.
  		**/
  def CreateProxy(aabb: b2AABB, userData: js.Any): b2DynamicTreeNode = js.native
  /**
  		* Destroy a proxy. This asserts if the id is invalid.
  		* @param proxy Proxy to destroy.
  		**/
  def DestroyProxy(proxy: b2DynamicTreeNode): scala.Unit = js.native
  /**
  		* Gets the Fat AABB for the proxy.
  		* @param proxy Proxy to retrieve Fat AABB.
  		* @return Fat AABB for proxy.
  		**/
  def GetFatAABB(proxy: b2DynamicTreeNode): b2AABB = js.native
  /**
  		* Get user data from a proxy. Returns null if the proxy is invalid.
  		* Cast to your type on return.
  		* @param proxy Proxy to retrieve user data from.
  		* @return User data for proxy or null if proxy is invalid.
  		**/
  def GetUserData(proxy: b2DynamicTreeNode): js.Any = js.native
  /**
  		* Move a proxy with a swept AABB. If the proxy has moved outside of its fattened AABB, then the proxy is removed from the tree and re-inserted. Otherwise the function returns immediately.
  		* @param proxy Proxy to move.
  		* @param aabb Swept AABB.
  		* @param displacement Extra AABB displacement.
  		**/
  def MoveProxy(proxy: b2DynamicTreeNode, aabb: b2AABB, displacement: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2): scala.Boolean = js.native
  /**
  		* Query an AABB for overlapping proxies. The callback is called for each proxy that overlaps the supplied AABB. The callback should match function signature fuction callback(proxy:b2DynamicTreeNode):Boolean and should return false to trigger premature termination.
  		* @param callback Called for each proxy that overlaps the supplied AABB.
  		*	param proxy Proxy overlapping the supplied AABB.
  		* @aabb Proxies are query for overlap on this AABB.
  		**/
  def Query(callback: js.Function1[/* proxy */ b2DynamicTreeNode, scala.Boolean], aabb: b2AABB): scala.Unit = js.native
  /**
  		* Ray-cast against the proxies in the tree. This relies on the callback to perform a exact ray-cast in the case were the proxy contains a shape. The callback also performs the any collision filtering. This has performance roughly equal to k log(n), where k is the number of collisions and n is the number of proxies in the tree.
  		* @param callback Called for each proxy that is hit by the ray.
  		*	param input Ray cast input data.
  		*	param proxy The proxy hit by the ray cast.
  		*	return Return value is the new value for maxFraction.
  		* @param input Ray cast input data.  Query all proxies along this ray cast.
  		**/
  def RayCast(
    callback: js.Function2[/* input */ b2RayCastInput, /* proxy */ b2DynamicTreeNode, scala.Double],
    input: b2RayCastInput
  ): scala.Unit = js.native
  /**
  		* Perform some iterations to re-balance the tree.
  		* @param iterations Number of rebalance iterations to perform.
  		**/
  def Rebalance(iterations: scala.Double): scala.Unit = js.native
}

