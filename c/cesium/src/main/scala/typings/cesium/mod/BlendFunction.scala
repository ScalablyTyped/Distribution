package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BlendFunction extends js.Object

@JSImport("cesium", "BlendFunction")
@js.native
object BlendFunction extends js.Object {
  @js.native
  sealed trait CONSTANT_ALPHA extends BlendFunction
  
  @js.native
  sealed trait CONSTANT_COLOR extends BlendFunction
  
  @js.native
  sealed trait DESTINATION_ALPHA extends BlendFunction
  
  @js.native
  sealed trait DESTINATION_COLOR extends BlendFunction
  
  @js.native
  sealed trait ONE extends BlendFunction
  
  @js.native
  sealed trait ONE_MINUS_CONSTANT_ALPHA extends BlendFunction
  
  @js.native
  sealed trait ONE_MINUS_CONSTANT_COLOR extends BlendFunction
  
  @js.native
  sealed trait ONE_MINUS_DESTINATION_ALPHA extends BlendFunction
  
  @js.native
  sealed trait ONE_MINUS_DESTINATION_COLOR extends BlendFunction
  
  @js.native
  sealed trait ONE_MINUS_SOURCE_ALPHA extends BlendFunction
  
  @js.native
  sealed trait ONE_MINUS_SOURCE_COLOR extends BlendFunction
  
  @js.native
  sealed trait SOURCE_ALPHA extends BlendFunction
  
  @js.native
  sealed trait SOURCE_ALPHA_SATURATE extends BlendFunction
  
  @js.native
  sealed trait SOURCE_COLOR extends BlendFunction
  
  @js.native
  sealed trait ZERO extends BlendFunction
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BlendFunction with Double] = js.native
  /* 12 */ @js.native
  object CONSTANT_ALPHA extends TopLevel[CONSTANT_ALPHA with Double]
  
  /* 10 */ @js.native
  object CONSTANT_COLOR extends TopLevel[CONSTANT_COLOR with Double]
  
  /* 8 */ @js.native
  object DESTINATION_ALPHA extends TopLevel[DESTINATION_ALPHA with Double]
  
  /* 4 */ @js.native
  object DESTINATION_COLOR extends TopLevel[DESTINATION_COLOR with Double]
  
  /* 1 */ @js.native
  object ONE extends TopLevel[ONE with Double]
  
  /* 13 */ @js.native
  object ONE_MINUS_CONSTANT_ALPHA extends TopLevel[ONE_MINUS_CONSTANT_ALPHA with Double]
  
  /* 11 */ @js.native
  object ONE_MINUS_CONSTANT_COLOR extends TopLevel[ONE_MINUS_CONSTANT_COLOR with Double]
  
  /* 9 */ @js.native
  object ONE_MINUS_DESTINATION_ALPHA extends TopLevel[ONE_MINUS_DESTINATION_ALPHA with Double]
  
  /* 5 */ @js.native
  object ONE_MINUS_DESTINATION_COLOR extends TopLevel[ONE_MINUS_DESTINATION_COLOR with Double]
  
  /* 7 */ @js.native
  object ONE_MINUS_SOURCE_ALPHA extends TopLevel[ONE_MINUS_SOURCE_ALPHA with Double]
  
  /* 3 */ @js.native
  object ONE_MINUS_SOURCE_COLOR extends TopLevel[ONE_MINUS_SOURCE_COLOR with Double]
  
  /* 6 */ @js.native
  object SOURCE_ALPHA extends TopLevel[SOURCE_ALPHA with Double]
  
  /* 14 */ @js.native
  object SOURCE_ALPHA_SATURATE extends TopLevel[SOURCE_ALPHA_SATURATE with Double]
  
  /* 2 */ @js.native
  object SOURCE_COLOR extends TopLevel[SOURCE_COLOR with Double]
  
  /* 0 */ @js.native
  object ZERO extends TopLevel[ZERO with Double]
  
}

