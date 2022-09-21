package typings.blackEngine

import typings.blackEngine.floatScatterBaseMod.FloatScatterBase
import typings.blackEngine.modifierMod.Modifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initialRotationMod {
  
  @JSImport("black-engine/particles/mods/InitialRotation", "InitialRotation")
  @js.native
  open class InitialRotation protected () extends Modifier {
    def this(values: (Double | FloatScatterBase)*) = this()
    
    def update(emitter: Any, particle: Any, dt: Any): Unit = js.native
  }
}
