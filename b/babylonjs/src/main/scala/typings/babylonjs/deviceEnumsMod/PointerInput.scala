package typings.babylonjs.deviceEnumsMod

import typings.babylonjs.deviceTypesMod._DeviceInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PointerInput
  extends _DeviceInput[js.Any]
@JSImport("babylonjs/DeviceInput/InputDevices/deviceEnums", "PointerInput")
@js.native
object PointerInput extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PointerInput with Double] = js.native
  
  /** Browser Back */
  @js.native
  sealed trait BrowserBack extends PointerInput
  /* 5 */ val BrowserBack: typings.babylonjs.deviceEnumsMod.PointerInput.BrowserBack with Double = js.native
  
  /** Browser Forward */
  @js.native
  sealed trait BrowserForward extends PointerInput
  /* 6 */ val BrowserForward: typings.babylonjs.deviceEnumsMod.PointerInput.BrowserForward with Double = js.native
  
  /** Horizontal Axis */
  @js.native
  sealed trait Horizontal extends PointerInput
  /* 0 */ val Horizontal: typings.babylonjs.deviceEnumsMod.PointerInput.Horizontal with Double = js.native
  
  /** Left Click or Touch */
  @js.native
  sealed trait LeftClick extends PointerInput
  /* 2 */ val LeftClick: typings.babylonjs.deviceEnumsMod.PointerInput.LeftClick with Double = js.native
  
  /** Middle Click */
  @js.native
  sealed trait MiddleClick extends PointerInput
  /* 3 */ val MiddleClick: typings.babylonjs.deviceEnumsMod.PointerInput.MiddleClick with Double = js.native
  
  /** Right Click */
  @js.native
  sealed trait RightClick extends PointerInput
  /* 4 */ val RightClick: typings.babylonjs.deviceEnumsMod.PointerInput.RightClick with Double = js.native
  
  /** Vertical Axis */
  @js.native
  sealed trait Vertical extends PointerInput
  /* 1 */ val Vertical: typings.babylonjs.deviceEnumsMod.PointerInput.Vertical with Double = js.native
}
