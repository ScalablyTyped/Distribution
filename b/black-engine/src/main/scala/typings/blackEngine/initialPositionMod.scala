package typings.blackEngine

import typings.blackEngine.modifierMod.Modifier
import typings.blackEngine.vectorScatterBaseMod.VectorScatterBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initialPositionMod {
  
  @JSImport("black-engine/particles/mods/InitialPosition", "InitialPosition")
  @js.native
  open class InitialPosition protected () extends Modifier {
    def this(values: (Double | VectorScatterBase)*) = this()
    
    def update(emitter: Any, particle: Any, dt: Any): Unit = js.native
  }
}
