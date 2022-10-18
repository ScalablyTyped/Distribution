package typings.blackEngine

import typings.blackEngine.particlesModifierMod.Modifier
import typings.blackEngine.scattersColorScatterBaseMod.ColorScatterBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object particlesModsInitialColorMod {
  
  @JSImport("black-engine/particles/mods/InitialColor", "InitialColor")
  @js.native
  open class InitialColor protected () extends Modifier {
    def this(values: (Double | ColorScatterBase)*) = this()
    
    def update(emitter: Any, particle: Any, dt: Any): Unit = js.native
  }
}
