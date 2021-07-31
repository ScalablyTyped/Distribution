package typings.box2d.Box2D.Collision

import typings.box2d.Box2D.Common.Math.b2Vec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2DynamicTreeBroadPhase
  extends StObject
     with IBroadPhase {
  
  /**
    * Tests if two proxies overlap.
    * @param proxyA First proxy to test.
    * @param proxyB Second proxy to test.
    * @return True if the proxyA and proxyB overlap with Fat AABBs, otherwise false.
    **/
  def TestOverlap(proxyA: b2DynamicTreeNode, proxyB: b2DynamicTreeNode): Boolean
  
  /**
    * Update the pairs. This results in pair callbacks. This can only add pairs.
    * @param callback Called for all new proxy pairs.
    *    param userDataA Proxy A in the pair user data.
    *    param userDataB Proxy B in the pair user data.
    **/
  def UpdatePairs(callback: js.Function2[/* userDataA */ js.Any, /* userDataB */ js.Any, Unit]): Unit
  
  /**
    * Validates the dynamic tree.
    * NOTE: this says "todo" in the current Box2DFlash code.
    **/
  def Validate(): Unit
}
object b2DynamicTreeBroadPhase {
  
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
    Rebalance: Double => Unit,
    TestOverlap: (b2DynamicTreeNode, b2DynamicTreeNode) => Boolean,
    UpdatePairs: js.Function2[/* userDataA */ js.Any, /* userDataB */ js.Any, Unit] => Unit,
    Validate: () => Unit
  ): b2DynamicTreeBroadPhase = {
    val __obj = js.Dynamic.literal(CreateProxy = js.Any.fromFunction2(CreateProxy), DestroyProxy = js.Any.fromFunction1(DestroyProxy), GetFatAABB = js.Any.fromFunction1(GetFatAABB), GetProxyCount = js.Any.fromFunction0(GetProxyCount), GetUserData = js.Any.fromFunction1(GetUserData), MoveProxy = js.Any.fromFunction3(MoveProxy), Query = js.Any.fromFunction2(Query), RayCast = js.Any.fromFunction2(RayCast), Rebalance = js.Any.fromFunction1(Rebalance), TestOverlap = js.Any.fromFunction2(TestOverlap), UpdatePairs = js.Any.fromFunction1(UpdatePairs), Validate = js.Any.fromFunction0(Validate))
    __obj.asInstanceOf[b2DynamicTreeBroadPhase]
  }
  
  @scala.inline
  implicit class b2DynamicTreeBroadPhaseMutableBuilder[Self <: b2DynamicTreeBroadPhase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTestOverlap(value: (b2DynamicTreeNode, b2DynamicTreeNode) => Boolean): Self = StObject.set(x, "TestOverlap", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdatePairs(value: js.Function2[/* userDataA */ js.Any, /* userDataB */ js.Any, Unit] => Unit): Self = StObject.set(x, "UpdatePairs", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidate(value: () => Unit): Self = StObject.set(x, "Validate", js.Any.fromFunction0(value))
  }
}
