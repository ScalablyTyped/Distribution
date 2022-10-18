package typings.blackEngine

import typings.blackEngine.particlesModifierMod.Modifier
import typings.blackEngine.scattersColorScatterBaseMod.ColorScatterBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object particlesModsColorOverLifeMod {
  
  @JSImport("black-engine/particles/mods/ColorOverLife", "ColorOverLife")
  @js.native
  open class ColorOverLife protected () extends Modifier {
    def this(values: (Double | ColorScatterBase)*) = this()
    
    def update(emitter: Any, particle: Any, dt: Any): Unit = js.native
  }
}
