package typings.blackEngine

import typings.blackEngine.coreComponentMod.Component
import typings.blackEngine.physicsArcadePairsPairMod.Pair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object physicsRigidBodyMod {
  
  @JSImport("black-engine/physics/RigidBody", "RigidBody")
  @js.native
  open class RigidBody () extends Component {
    
    var bounce: Double = js.native
    
    def clearFlags(): Unit = js.native
    
    def forceX: Double = js.native
    def forceX_=(arg: Double): Unit = js.native
    
    def forceY: Double = js.native
    def forceY_=(arg: Double): Unit = js.native
    
    var friction: Double = js.native
    
    var frictionAir: Double = js.native
    
    def isStatic: Boolean = js.native
    def isStatic_=(arg: Boolean): Unit = js.native
    
    /* private */ var mCachedPosition: Any = js.native
    
    /* private */ var mCollider: Any = js.native
    
    /* private */ var mContacts: Any = js.native
    
    /* private */ var mForce: Any = js.native
    
    /* private */ var mInGroup: Any = js.native
    
    /* private */ var mInvMass: Any = js.native
    
    /* private */ var mIsSleeping: Any = js.native
    
    /* private */ var mIsStatic: Any = js.native
    
    /* private */ var mMass: Any = js.native
    
    var mPairs: js.Array[Pair] = js.native
    
    /* private */ var mPivot: Any = js.native
    
    /* private */ var mPosition: Any = js.native
    
    /* private */ var mSleepTime: Any = js.native
    
    /* private */ var mTransform: Any = js.native
    
    /* private */ var mVelocity: Any = js.native
    
    def mass: Double = js.native
    def mass_=(arg: Double): Unit = js.native
    
    def update(): Unit = js.native
    
    def velocityX: Double = js.native
    def velocityX_=(arg: Double): Unit = js.native
    
    def velocityY: Double = js.native
    def velocityY_=(arg: Double): Unit = js.native
    
    def x: Double = js.native
    def x_=(arg: Double): Unit = js.native
    
    def y: Double = js.native
    def y_=(arg: Double): Unit = js.native
  }
}
