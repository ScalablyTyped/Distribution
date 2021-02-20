package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait KeyboardEventModifier extends StObject
@JSImport("cesium", "KeyboardEventModifier")
@js.native
object KeyboardEventModifier extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KeyboardEventModifier with Double] = js.native
  
  @js.native
  sealed trait ALT extends KeyboardEventModifier
  /* 2 */ val ALT: typings.cesium.mod.KeyboardEventModifier.ALT with Double = js.native
  
  @js.native
  sealed trait CTRL extends KeyboardEventModifier
  /* 1 */ val CTRL: typings.cesium.mod.KeyboardEventModifier.CTRL with Double = js.native
  
  @js.native
  sealed trait SHIFT extends KeyboardEventModifier
  /* 0 */ val SHIFT: typings.cesium.mod.KeyboardEventModifier.SHIFT with Double = js.native
}
