package typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PointerInput extends StObject
@JSImport("babylonjs/DeviceInput/InputDevices/deviceEnums", "PointerInput")
@js.native
object PointerInput extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PointerInput & Double] = js.native
  
  /** Browser Back */
  @js.native
  sealed trait BrowserBack
    extends StObject
       with PointerInput
  /* 5 */ val BrowserBack: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.PointerInput.BrowserBack & Double = js.native
  
  /** Browser Forward */
  @js.native
  sealed trait BrowserForward
    extends StObject
       with PointerInput
  /* 6 */ val BrowserForward: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.PointerInput.BrowserForward & Double = js.native
  
  /** Horizontal Axis (Not used in events/observables; only in polling) */
  @js.native
  sealed trait Horizontal
    extends StObject
       with PointerInput
  /* 0 */ val Horizontal: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.PointerInput.Horizontal & Double = js.native
  
  /** Left Click or Touch */
  @js.native
  sealed trait LeftClick
    extends StObject
       with PointerInput
  /* 2 */ val LeftClick: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.PointerInput.LeftClick & Double = js.native
  
  /** Middle Click */
  @js.native
  sealed trait MiddleClick
    extends StObject
       with PointerInput
  /* 3 */ val MiddleClick: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.PointerInput.MiddleClick & Double = js.native
  
  /** Mouse Wheel X */
  @js.native
  sealed trait MouseWheelX
    extends StObject
       with PointerInput
  /* 7 */ val MouseWheelX: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.PointerInput.MouseWheelX & Double = js.native
  
  /** Mouse Wheel Y */
  @js.native
  sealed trait MouseWheelY
    extends StObject
       with PointerInput
  /* 8 */ val MouseWheelY: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.PointerInput.MouseWheelY & Double = js.native
  
  /** Mouse Wheel Z */
  @js.native
  sealed trait MouseWheelZ
    extends StObject
       with PointerInput
  /* 9 */ val MouseWheelZ: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.PointerInput.MouseWheelZ & Double = js.native
  
  /** Used in events/observables to identify if x/y changes occurred */
  @js.native
  sealed trait Move
    extends StObject
       with PointerInput
  /* 12 */ val Move: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.PointerInput.Move & Double = js.native
  
  /** Right Click */
  @js.native
  sealed trait RightClick
    extends StObject
       with PointerInput
  /* 4 */ val RightClick: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.PointerInput.RightClick & Double = js.native
  
  /** Vertical Axis (Not used in events/observables; only in polling) */
  @js.native
  sealed trait Vertical
    extends StObject
       with PointerInput
  /* 1 */ val Vertical: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.PointerInput.Vertical & Double = js.native
}
