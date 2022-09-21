package typings.blackEngine

import typings.blackEngine.colliderMod.Collider
import typings.blackEngine.rigidBodyMod.RigidBody
import typings.blackEngine.systemMod.System
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arcadeMod {
  
  @JSImport("black-engine/physics/arcade/Arcade", "Arcade")
  @js.native
  open class Arcade () extends System {
    
    /* private */ var __addBody: Any = js.native
    
    /* private */ var __addCollider: Any = js.native
    
    /* private */ var __addPair: Any = js.native
    
    /* private */ var __addPairs: Any = js.native
    
    /* private */ var __removeBody: Any = js.native
    
    /* private */ var __removeCollider: Any = js.native
    
    /* private */ var __removePairs: Any = js.native
    
    /* private */ var __setBounds: Any = js.native
    
    /* private */ var __solve: Any = js.native
    
    def boundsEnabled_=(arg: Boolean): Unit = js.native
    
    def collisionInfo(
      colliderA: Collider,
      colliderB: Collider,
      cb: js.Function1[/* repeated */ Any, Unit],
      ctx: Any,
      args: Any*
    ): Unit = js.native
    
    var delta: Double = js.native
    
    def gravityX: Double = js.native
    def gravityX_=(arg: Double): Unit = js.native
    
    def gravityY: Double = js.native
    def gravityY_=(arg: Double): Unit = js.native
    
    def isColliding(bodyA: RigidBody, bodyB: Unit, cb: js.Function1[/* repeated */ Any, Unit], ctx: Any, args: Any*): Boolean = js.native
    def isColliding(bodyA: RigidBody, bodyB: Unit, cb: js.Function1[/* repeated */ Any, Unit], ctx: Unit, args: Any*): Boolean = js.native
    def isColliding(bodyA: RigidBody, bodyB: Unit, cb: Unit, ctx: Any, args: Any*): Boolean = js.native
    def isColliding(bodyA: RigidBody, bodyB: Unit, cb: Unit, ctx: Unit, args: Any*): Boolean = js.native
    def isColliding(
      bodyA: RigidBody,
      bodyB: RigidBody,
      cb: js.Function1[/* repeated */ Any, Unit],
      ctx: Any,
      args: Any*
    ): Boolean = js.native
    def isColliding(
      bodyA: RigidBody,
      bodyB: RigidBody,
      cb: js.Function1[/* repeated */ Any, Unit],
      ctx: Unit,
      args: Any*
    ): Boolean = js.native
    def isColliding(bodyA: RigidBody, bodyB: RigidBody, cb: Unit, ctx: Any, args: Any*): Boolean = js.native
    def isColliding(bodyA: RigidBody, bodyB: RigidBody, cb: Unit, ctx: Unit, args: Any*): Boolean = js.native
    
    def iterations: Double = js.native
    def iterations_=(arg: Double): Unit = js.native
    
    /* private */ var mBodies: Any = js.native
    
    /* private */ var mBoundsBody: Any = js.native
    
    /* private */ var mBoundsBottom: Any = js.native
    
    /* private */ var mBoundsLeft: Any = js.native
    
    /* private */ var mBoundsRight: Any = js.native
    
    /* private */ var mBoundsTop: Any = js.native
    
    /* private */ var mBroadPhase: Any = js.native
    
    /* private */ var mContacts: Any = js.native
    
    /* private */ var mGravity: Any = js.native
    
    /* private */ var mIterations: Any = js.native
    
    /* private */ var mPairs: Any = js.native
    
    /* private */ var mPairsHash: Any = js.native
    
    /* private */ var mSleepEnabled: Any = js.native
    
    def onChildrenAdded(gameObject: Any): Unit = js.native
    
    def onChildrenRemoved(gameObject: Any): Unit = js.native
    
    def onComponentAdded(child: Any, component: Any): Unit = js.native
    
    def onComponentRemoved(child: Any, component: Any): Unit = js.native
    
    def sleepEnabled: Boolean = js.native
    def sleepEnabled_=(arg: Boolean): Unit = js.native
  }
}
