package typings.babylonjs.deviceEnumsMod

import org.scalablytyped.runtime.TopLevel
import typings.babylonjs.deviceTypesMod._DeviceInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PointerInput
  extends _DeviceInput[js.Any]
@JSImport("babylonjs/DeviceInput/InputDevices/deviceEnums", "PointerInput")
@js.native
object PointerInput extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PointerInput with Double] = js.native
  
  /** Browser Back */
  @js.native
  sealed trait BrowserBack extends PointerInput
  /* 5 */ @js.native
  object BrowserBack extends TopLevel[BrowserBack with Double]
  
  /** Browser Forward */
  @js.native
  sealed trait BrowserForward extends PointerInput
  /* 6 */ @js.native
  object BrowserForward extends TopLevel[BrowserForward with Double]
  
  /** Horizontal Axis */
  @js.native
  sealed trait Horizontal extends PointerInput
  /* 0 */ @js.native
  object Horizontal extends TopLevel[Horizontal with Double]
  
  /** Left Click or Touch */
  @js.native
  sealed trait LeftClick extends PointerInput
  /* 2 */ @js.native
  object LeftClick extends TopLevel[LeftClick with Double]
  
  /** Middle Click */
  @js.native
  sealed trait MiddleClick extends PointerInput
  /* 3 */ @js.native
  object MiddleClick extends TopLevel[MiddleClick with Double]
  
  /** Right Click */
  @js.native
  sealed trait RightClick extends PointerInput
  /* 4 */ @js.native
  object RightClick extends TopLevel[RightClick with Double]
  
  /** Vertical Axis */
  @js.native
  sealed trait Vertical extends PointerInput
  /* 1 */ @js.native
  object Vertical extends TopLevel[Vertical with Double]
}
