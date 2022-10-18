package typings.blackEngine

import typings.blackEngine.collidersCircleColliderMod.CircleCollider
import typings.blackEngine.physicsArcadePairsPairMod.Pair
import typings.blackEngine.physicsRigidBodyMod.RigidBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object physicsArcadePairsCircleToCirclePairMod {
  
  @JSImport("black-engine/physics/arcade/pairs/CircleToCirclePair", "CircleToCirclePair")
  @js.native
  open class CircleToCirclePair () extends Pair {
    
    def set(a: CircleCollider, b: CircleCollider, bodyA: RigidBody, bodyB: RigidBody): Pair = js.native
  }
}
