package typings.blackEngine

import typings.blackEngine.colliderMod.Collider
import typings.blackEngine.rigidBodyMod.RigidBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pairMod {
  
  @JSImport("black-engine/physics/arcade/pairs/Pair", "Pair")
  @js.native
  open class Pair () extends StObject {
    
    var a: Collider | Null = js.native
    
    var b: Collider | Null = js.native
    
    var bodyA: RigidBody | Null = js.native
    
    var bodyB: RigidBody | Null = js.native
    
    /* private */ var mBias: Any = js.native
    
    /* private */ var mChanged: Any = js.native
    
    /* private */ var mFriction: Any = js.native
    
    /* private */ var mInCollision: Any = js.native
    
    /* private */ var mIsStatic: Any = js.native
    
    /* private */ var mMass: Any = js.native
    
    /* private */ var mNormal: Any = js.native
    
    /* private */ var mNormalImpulse: Any = js.native
    
    /* private */ var mOffset: Any = js.native
    
    /* private */ var mOverlap: Any = js.native
    
    /* private */ var mPositionImpulse: Any = js.native
    
    /* private */ var mTangentImpulse: Any = js.native
    
    def preSolve(): Unit = js.native
    
    def solvePosition(): Unit = js.native
    
    def solveVelocity(): Unit = js.native
    
    def test(): Boolean = js.native
  }
  /* static members */
  object Pair {
    
    @JSImport("black-engine/physics/arcade/pairs/Pair", "Pair")
    @js.native
    val ^ : js.Any = js.native
    
    inline def __id(a: Collider, b: Collider): String = (^.asInstanceOf[js.Dynamic].applyDynamic("__id")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
