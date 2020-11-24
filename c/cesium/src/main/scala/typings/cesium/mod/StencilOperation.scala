package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StencilOperation extends js.Object
@JSImport("cesium", "StencilOperation")
@js.native
object StencilOperation extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StencilOperation with Double] = js.native
  
  @js.native
  sealed trait DECREMENT extends StencilOperation
  /* 4 */ @js.native
  object DECREMENT extends TopLevel[DECREMENT with Double]
  
  @js.native
  sealed trait DECREMENT_WRAP extends StencilOperation
  /* 7 */ @js.native
  object DECREMENT_WRAP extends TopLevel[DECREMENT_WRAP with Double]
  
  @js.native
  sealed trait INCREMENT extends StencilOperation
  /* 3 */ @js.native
  object INCREMENT extends TopLevel[INCREMENT with Double]
  
  @js.native
  sealed trait INCREMENT_WRAP extends StencilOperation
  /* 6 */ @js.native
  object INCREMENT_WRAP extends TopLevel[INCREMENT_WRAP with Double]
  
  @js.native
  sealed trait INVERT extends StencilOperation
  /* 5 */ @js.native
  object INVERT extends TopLevel[INVERT with Double]
  
  @js.native
  sealed trait KEEP extends StencilOperation
  /* 1 */ @js.native
  object KEEP extends TopLevel[KEEP with Double]
  
  @js.native
  sealed trait REPLACE extends StencilOperation
  /* 2 */ @js.native
  object REPLACE extends TopLevel[REPLACE with Double]
  
  @js.native
  sealed trait ZERO extends StencilOperation
  /* 0 */ @js.native
  object ZERO extends TopLevel[ZERO with Double]
}
