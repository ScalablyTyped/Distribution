package typings.blackEngine

import typings.blackEngine.emitterMod.Emitter
import typings.blackEngine.particleMod.Particle
import typings.blackEngine.scatterMod.Scatter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modifierMod {
  
  @JSImport("black-engine/particles/Modifier", "Modifier")
  @js.native
  open class Modifier () extends StObject {
    def this(isInitializer: Boolean) = this()
    
    var isActive: Boolean = js.native
    
    def isInitializer: Boolean = js.native
    
    /* private */ var mIsInitializer: Any = js.native
    
    /* protected */ def postUpdate(dt: Double): Unit = js.native
    
    /* protected */ def preUpdate(dt: Double): Unit = js.native
    
    var scatter: Scatter = js.native
    
    /* protected */ def update(emitter: Emitter, particle: Particle, dt: Double): Unit = js.native
  }
}
