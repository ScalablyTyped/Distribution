package typings.blackEngine

import typings.blackEngine.particlesModifierMod.Modifier
import typings.blackEngine.scattersFloatScatterBaseMod.FloatScatterBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object particlesModsScaleOverLifeMod {
  
  @JSImport("black-engine/particles/mods/ScaleOverLife", "ScaleOverLife")
  @js.native
  open class ScaleOverLife protected () extends Modifier {
    def this(values: (Double | FloatScatterBase)*) = this()
    
    def update(emitter: Any, particle: Any, dt: Any): Unit = js.native
  }
}
