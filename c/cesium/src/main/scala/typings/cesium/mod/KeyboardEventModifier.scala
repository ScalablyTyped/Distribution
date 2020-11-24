package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait KeyboardEventModifier extends js.Object
@JSImport("cesium", "KeyboardEventModifier")
@js.native
object KeyboardEventModifier extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KeyboardEventModifier with Double] = js.native
  
  @js.native
  sealed trait ALT extends KeyboardEventModifier
  /* 2 */ @js.native
  object ALT extends TopLevel[ALT with Double]
  
  @js.native
  sealed trait CTRL extends KeyboardEventModifier
  /* 1 */ @js.native
  object CTRL extends TopLevel[CTRL with Double]
  
  @js.native
  sealed trait SHIFT extends KeyboardEventModifier
  /* 0 */ @js.native
  object SHIFT extends TopLevel[SHIFT with Double]
}
