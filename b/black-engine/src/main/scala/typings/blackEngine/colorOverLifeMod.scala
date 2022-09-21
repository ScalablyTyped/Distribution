package typings.blackEngine

import typings.blackEngine.colorScatterBaseMod.ColorScatterBase
import typings.blackEngine.modifierMod.Modifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorOverLifeMod {
  
  @JSImport("black-engine/particles/mods/ColorOverLife", "ColorOverLife")
  @js.native
  open class ColorOverLife protected () extends Modifier {
    def this(values: (Double | ColorScatterBase)*) = this()
    
    def update(emitter: Any, particle: Any, dt: Any): Unit = js.native
  }
}
