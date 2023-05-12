package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait KeyboardEventModifier extends StObject
@JSImport("@cesium/engine", "KeyboardEventModifier")
@js.native
object KeyboardEventModifier extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KeyboardEventModifier & Double] = js.native
  
  /**
    * Represents the alt key being held down.
    */
  @js.native
  sealed trait ALT
    extends StObject
       with KeyboardEventModifier
  /* 2 */ val ALT: typings.cesiumEngine.mod.KeyboardEventModifier.ALT & Double = js.native
  
  /**
    * Represents the control key being held down.
    */
  @js.native
  sealed trait CTRL
    extends StObject
       with KeyboardEventModifier
  /* 1 */ val CTRL: typings.cesiumEngine.mod.KeyboardEventModifier.CTRL & Double = js.native
  
  /**
    * Represents the shift key being held down.
    */
  @js.native
  sealed trait SHIFT
    extends StObject
       with KeyboardEventModifier
  /* 0 */ val SHIFT: typings.cesiumEngine.mod.KeyboardEventModifier.SHIFT & Double = js.native
}
