package typings.cesium.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BlendFunction extends js.Object
@JSImport("cesium", "BlendFunction")
@js.native
object BlendFunction extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BlendFunction with Double] = js.native
  
  @js.native
  sealed trait CONSTANT_ALPHA extends BlendFunction
  /* 12 */ @js.native
  object CONSTANT_ALPHA extends TopLevel[CONSTANT_ALPHA with Double]
  
  @js.native
  sealed trait CONSTANT_COLOR extends BlendFunction
  /* 10 */ @js.native
  object CONSTANT_COLOR extends TopLevel[CONSTANT_COLOR with Double]
  
  @js.native
  sealed trait DESTINATION_ALPHA extends BlendFunction
  /* 8 */ @js.native
  object DESTINATION_ALPHA extends TopLevel[DESTINATION_ALPHA with Double]
  
  @js.native
  sealed trait DESTINATION_COLOR extends BlendFunction
  /* 4 */ @js.native
  object DESTINATION_COLOR extends TopLevel[DESTINATION_COLOR with Double]
  
  @js.native
  sealed trait ONE extends BlendFunction
  /* 1 */ @js.native
  object ONE extends TopLevel[ONE with Double]
  
  @js.native
  sealed trait ONE_MINUS_CONSTANT_ALPHA extends BlendFunction
  /* 13 */ @js.native
  object ONE_MINUS_CONSTANT_ALPHA extends TopLevel[ONE_MINUS_CONSTANT_ALPHA with Double]
  
  @js.native
  sealed trait ONE_MINUS_CONSTANT_COLOR extends BlendFunction
  /* 11 */ @js.native
  object ONE_MINUS_CONSTANT_COLOR extends TopLevel[ONE_MINUS_CONSTANT_COLOR with Double]
  
  @js.native
  sealed trait ONE_MINUS_DESTINATION_ALPHA extends BlendFunction
  /* 9 */ @js.native
  object ONE_MINUS_DESTINATION_ALPHA extends TopLevel[ONE_MINUS_DESTINATION_ALPHA with Double]
  
  @js.native
  sealed trait ONE_MINUS_DESTINATION_COLOR extends BlendFunction
  /* 5 */ @js.native
  object ONE_MINUS_DESTINATION_COLOR extends TopLevel[ONE_MINUS_DESTINATION_COLOR with Double]
  
  @js.native
  sealed trait ONE_MINUS_SOURCE_ALPHA extends BlendFunction
  /* 7 */ @js.native
  object ONE_MINUS_SOURCE_ALPHA extends TopLevel[ONE_MINUS_SOURCE_ALPHA with Double]
  
  @js.native
  sealed trait ONE_MINUS_SOURCE_COLOR extends BlendFunction
  /* 3 */ @js.native
  object ONE_MINUS_SOURCE_COLOR extends TopLevel[ONE_MINUS_SOURCE_COLOR with Double]
  
  @js.native
  sealed trait SOURCE_ALPHA extends BlendFunction
  /* 6 */ @js.native
  object SOURCE_ALPHA extends TopLevel[SOURCE_ALPHA with Double]
  
  @js.native
  sealed trait SOURCE_ALPHA_SATURATE extends BlendFunction
  /* 14 */ @js.native
  object SOURCE_ALPHA_SATURATE extends TopLevel[SOURCE_ALPHA_SATURATE with Double]
  
  @js.native
  sealed trait SOURCE_COLOR extends BlendFunction
  /* 2 */ @js.native
  object SOURCE_COLOR extends TopLevel[SOURCE_COLOR with Double]
  
  @js.native
  sealed trait ZERO extends BlendFunction
  /* 0 */ @js.native
  object ZERO extends TopLevel[ZERO with Double]
}
