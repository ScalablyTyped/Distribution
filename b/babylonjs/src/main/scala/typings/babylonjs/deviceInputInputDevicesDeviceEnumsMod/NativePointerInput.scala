package typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NativePointerInput extends StObject
@JSImport("babylonjs/DeviceInput/InputDevices/deviceEnums", "NativePointerInput")
@js.native
object NativePointerInput extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NativePointerInput & Double] = js.native
  
  /** Browser Back */
  @js.native
  sealed trait BrowserBack
    extends StObject
       with NativePointerInput
  /* 5 */ val BrowserBack: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.NativePointerInput.BrowserBack & Double = js.native
  
  /** Browser Forward */
  @js.native
  sealed trait BrowserForward
    extends StObject
       with NativePointerInput
  /* 6 */ val BrowserForward: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.NativePointerInput.BrowserForward & Double = js.native
  
  /** Delta X */
  @js.native
  sealed trait DeltaHorizontal
    extends StObject
       with NativePointerInput
  /* 10 */ val DeltaHorizontal: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.NativePointerInput.DeltaHorizontal & Double = js.native
  
  /** Delta Y */
  @js.native
  sealed trait DeltaVertical
    extends StObject
       with NativePointerInput
  /* 11 */ val DeltaVertical: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.NativePointerInput.DeltaVertical & Double = js.native
  
  /** Horizontal Axis */
  @js.native
  sealed trait Horizontal
    extends StObject
       with NativePointerInput
  /* 0 */ val Horizontal: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.NativePointerInput.Horizontal & Double = js.native
  
  /** Left Click or Touch */
  @js.native
  sealed trait LeftClick
    extends StObject
       with NativePointerInput
  /* 2 */ val LeftClick: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.NativePointerInput.LeftClick & Double = js.native
  
  /** Middle Click */
  @js.native
  sealed trait MiddleClick
    extends StObject
       with NativePointerInput
  /* 3 */ val MiddleClick: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.NativePointerInput.MiddleClick & Double = js.native
  
  /** Mouse Wheel X */
  @js.native
  sealed trait MouseWheelX
    extends StObject
       with NativePointerInput
  /* 7 */ val MouseWheelX: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.NativePointerInput.MouseWheelX & Double = js.native
  
  /** Mouse Wheel Y */
  @js.native
  sealed trait MouseWheelY
    extends StObject
       with NativePointerInput
  /* 8 */ val MouseWheelY: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.NativePointerInput.MouseWheelY & Double = js.native
  
  /** Mouse Wheel Z */
  @js.native
  sealed trait MouseWheelZ
    extends StObject
       with NativePointerInput
  /* 9 */ val MouseWheelZ: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.NativePointerInput.MouseWheelZ & Double = js.native
  
  /** Right Click */
  @js.native
  sealed trait RightClick
    extends StObject
       with NativePointerInput
  /* 4 */ val RightClick: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.NativePointerInput.RightClick & Double = js.native
  
  /** Vertical Axis */
  @js.native
  sealed trait Vertical
    extends StObject
       with NativePointerInput
  /* 1 */ val Vertical: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.NativePointerInput.Vertical & Double = js.native
}
