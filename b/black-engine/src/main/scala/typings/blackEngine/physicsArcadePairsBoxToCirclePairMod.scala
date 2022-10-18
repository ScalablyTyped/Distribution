package typings.blackEngine

import typings.blackEngine.collidersBoxColliderMod.BoxCollider
import typings.blackEngine.collidersCircleColliderMod.CircleCollider
import typings.blackEngine.physicsArcadePairsPairMod.Pair
import typings.blackEngine.physicsRigidBodyMod.RigidBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object physicsArcadePairsBoxToCirclePairMod {
  
  @JSImport("black-engine/physics/arcade/pairs/BoxToCirclePair", "BoxToCirclePair")
  @js.native
  open class BoxToCirclePair () extends Pair {
    
    /* private */ var __rotate: Any = js.native
    
    /* private */ var mBoxHalfHeight: Any = js.native
    
    /* private */ var mBoxHalfWidth: Any = js.native
    
    /* private */ var mBoxRotate: Any = js.native
    
    /* private */ var mCircleCenter: Any = js.native
    
    def set(a: BoxCollider, b: CircleCollider, bodyA: RigidBody, bodyB: RigidBody): Pair = js.native
  }
}
