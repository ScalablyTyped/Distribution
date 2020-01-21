package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StencilOperation extends js.Object

@JSImport("cesium", "StencilOperation")
@js.native
object StencilOperation extends js.Object {
  @js.native
  sealed trait DECREMENT extends StencilOperation
  
  @js.native
  sealed trait DECREMENT_WRAP extends StencilOperation
  
  @js.native
  sealed trait INCREMENT extends StencilOperation
  
  @js.native
  sealed trait INCREMENT_WRAP extends StencilOperation
  
  @js.native
  sealed trait INVERT extends StencilOperation
  
  @js.native
  sealed trait KEEP extends StencilOperation
  
  @js.native
  sealed trait REPLACE extends StencilOperation
  
  @js.native
  sealed trait ZERO extends StencilOperation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StencilOperation with Double] = js.native
  /* 4 */ @js.native
  object DECREMENT extends TopLevel[DECREMENT with Double]
  
  /* 7 */ @js.native
  object DECREMENT_WRAP extends TopLevel[DECREMENT_WRAP with Double]
  
  /* 3 */ @js.native
  object INCREMENT extends TopLevel[INCREMENT with Double]
  
  /* 6 */ @js.native
  object INCREMENT_WRAP extends TopLevel[INCREMENT_WRAP with Double]
  
  /* 5 */ @js.native
  object INVERT extends TopLevel[INVERT with Double]
  
  /* 1 */ @js.native
  object KEEP extends TopLevel[KEEP with Double]
  
  /* 2 */ @js.native
  object REPLACE extends TopLevel[REPLACE with Double]
  
  /* 0 */ @js.native
  object ZERO extends TopLevel[ZERO with Double]
  
}

