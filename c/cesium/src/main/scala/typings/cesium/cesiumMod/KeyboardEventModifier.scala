package typings.cesium.cesiumMod

import org.scalablytyped.runtime.TopLevel
import typings.cesium.cesiumMod.KeyboardEventModifier.ALT
import typings.cesium.cesiumMod.KeyboardEventModifier.CTRL
import typings.cesium.cesiumMod.KeyboardEventModifier.SHIFT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KeyboardEventModifier extends js.Object

@JSImport("cesium", "KeyboardEventModifier")
@js.native
object KeyboardEventModifier extends js.Object {
  @js.native
  sealed trait ALT extends KeyboardEventModifier
  
  @js.native
  sealed trait CTRL extends KeyboardEventModifier
  
  @js.native
  sealed trait SHIFT extends KeyboardEventModifier
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KeyboardEventModifier with Double] = js.native
  /* 2 */ @js.native
  object ALT extends TopLevel[ALT with Double]
  
  /* 1 */ @js.native
  object CTRL extends TopLevel[CTRL with Double]
  
  /* 0 */ @js.native
  object SHIFT extends TopLevel[SHIFT with Double]
  
}

