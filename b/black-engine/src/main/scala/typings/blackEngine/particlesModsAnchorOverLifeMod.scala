package typings.blackEngine

import typings.blackEngine.particlesModifierMod.Modifier
import typings.blackEngine.scattersVectorScatterBaseMod.VectorScatterBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object particlesModsAnchorOverLifeMod {
  
  @JSImport("black-engine/particles/mods/AnchorOverLife", "AnchorOverLife")
  @js.native
  open class AnchorOverLife protected () extends Modifier {
    def this(values: (Double | VectorScatterBase)*) = this()
    
    def update(emitter: Any, particle: Any, dt: Any): Unit = js.native
  }
}
