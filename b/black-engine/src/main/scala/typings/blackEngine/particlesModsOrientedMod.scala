package typings.blackEngine

import typings.blackEngine.particlesModifierMod.Modifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object particlesModsOrientedMod {
  
  @JSImport("black-engine/particles/mods/Oriented", "Oriented")
  @js.native
  open class Oriented () extends Modifier {
    def this(angleShift: Double) = this()
    
    var angleShift: Double = js.native
    
    def update(emitter: Any, particle: Any, dt: Any): Unit = js.native
  }
}
