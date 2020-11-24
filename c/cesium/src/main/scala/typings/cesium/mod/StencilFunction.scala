package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StencilFunction extends js.Object
@JSImport("cesium", "StencilFunction")
@js.native
object StencilFunction extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StencilFunction with Double] = js.native
  
  @js.native
  sealed trait ALWAYS extends StencilFunction
  /* 7 */ @js.native
  object ALWAYS extends TopLevel[ALWAYS with Double]
  
  @js.native
  sealed trait EQUAL extends StencilFunction
  /* 2 */ @js.native
  object EQUAL extends TopLevel[EQUAL with Double]
  
  @js.native
  sealed trait GREATER extends StencilFunction
  /* 4 */ @js.native
  object GREATER extends TopLevel[GREATER with Double]
  
  @js.native
  sealed trait GREATER_OR_EQUAL extends StencilFunction
  /* 6 */ @js.native
  object GREATER_OR_EQUAL extends TopLevel[GREATER_OR_EQUAL with Double]
  
  @js.native
  sealed trait LESS extends StencilFunction
  /* 1 */ @js.native
  object LESS extends TopLevel[LESS with Double]
  
  @js.native
  sealed trait LESS_OR_EQUAL extends StencilFunction
  /* 3 */ @js.native
  object LESS_OR_EQUAL extends TopLevel[LESS_OR_EQUAL with Double]
  
  @js.native
  sealed trait NEVER extends StencilFunction
  /* 0 */ @js.native
  object NEVER extends TopLevel[NEVER with Double]
  
  @js.native
  sealed trait NOT_EQUAL extends StencilFunction
  /* 5 */ @js.native
  object NOT_EQUAL extends TopLevel[NOT_EQUAL with Double]
}
