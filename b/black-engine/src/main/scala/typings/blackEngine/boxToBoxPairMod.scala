package typings.blackEngine

import typings.blackEngine.boxColliderMod.BoxCollider
import typings.blackEngine.pairMod.Pair
import typings.blackEngine.rigidBodyMod.RigidBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boxToBoxPairMod {
  
  @JSImport("black-engine/physics/arcade/pairs/BoxToBoxPair", "BoxToBoxPair")
  @js.native
  open class BoxToBoxPair () extends Pair {
    
    /* private */ var __refreshProjectionsRanges: Any = js.native
    
    /* private */ var mProjections: Any = js.native
    
    def set(a: BoxCollider, b: BoxCollider, bodyA: RigidBody, bodyB: RigidBody): Pair = js.native
  }
}
