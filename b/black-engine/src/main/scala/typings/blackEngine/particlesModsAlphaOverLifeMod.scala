package typings.blackEngine

import typings.blackEngine.particlesModifierMod.Modifier
import typings.blackEngine.scattersFloatScatterBaseMod.FloatScatterBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object particlesModsAlphaOverLifeMod {
  
  @JSImport("black-engine/particles/mods/AlphaOverLife", "AlphaOverLife")
  @js.native
  open class AlphaOverLife protected () extends Modifier {
    def this(values: (Double | FloatScatterBase)*) = this()
    
    def update(emitter: Any, particle: Any, dt: Any): Unit = js.native
  }
}
