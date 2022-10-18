package typings.blackEngine

import typings.blackEngine.physicsArcadePairsPairMod.Pair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object physicsArcadePhasesBroadPhaseMod {
  
  @JSImport("black-engine/physics/arcade/phases/BroadPhase", "BroadPhase")
  @js.native
  open class BroadPhase () extends StObject {
    
    def test(pairs: js.Array[Pair]): Unit = js.native
  }
}
