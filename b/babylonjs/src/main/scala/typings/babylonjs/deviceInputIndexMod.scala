package typings.babylonjs

import typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DeviceType
import typings.babylonjs.deviceInputInputInterfacesMod.IDeviceInputSystem
import typings.babylonjs.enginesEngineMod.Engine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deviceInputIndexMod {
  
  @JSImport("babylonjs/DeviceInput/index", "DeviceSource")
  @js.native
  open class DeviceSource[T /* <: DeviceType */] protected ()
    extends typings.babylonjs.deviceInputInputDevicesDeviceSourceMod.DeviceSource[T] {
    /**
      * Default Constructor
      * @param deviceInputSystem - Reference to DeviceInputSystem
      * @param deviceType - Type of device
      * @param deviceSlot - "Slot" or index that device is referenced in
      */
    def this(deviceInputSystem: IDeviceInputSystem, /** Type of device */
    deviceType: T) = this()
    def this(
      deviceInputSystem: IDeviceInputSystem,
      /** Type of device */
    deviceType: T,
      /** "Slot" or index that device is referenced in */
    deviceSlot: Double
    ) = this()
  }
  
  @JSImport("babylonjs/DeviceInput/index", "DeviceSourceManager")
  @js.native
  open class DeviceSourceManager protected ()
    extends typings.babylonjs.deviceInputInputDevicesDeviceSourceManagerMod.DeviceSourceManager {
    /**
      * Default constructor
      * @param engine - Used to get canvas (if applicable)
      */
    def this(engine: Engine) = this()
  }
  
  @JSImport("babylonjs/DeviceInput/index", "DeviceType")
  @js.native
  object DeviceType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DeviceType & Double] = js.native
    
    /* 7 */ val DualSense: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DeviceType.DualSense & Double = js.native
    
    /* 4 */ val DualShock: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DeviceType.DualShock & Double = js.native
    
    /* 0 */ val Generic: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DeviceType.Generic & Double = js.native
    
    /* 1 */ val Keyboard: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DeviceType.Keyboard & Double = js.native
    
    /* 2 */ val Mouse: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DeviceType.Mouse & Double = js.native
    
    /* 6 */ val Switch: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DeviceType.Switch & Double = js.native
    
    /* 3 */ val Touch: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DeviceType.Touch & Double = js.native
    
    /* 5 */ val Xbox: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DeviceType.Xbox & Double = js.native
  }
  
  @JSImport("babylonjs/DeviceInput/index", "DualSenseInput")
  @js.native
  object DualSenseInput extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput & Double] = js.native
    
    /* 1 */ val Circle: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.Circle & Double = js.native
    
    /* 8 */ val Create: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.Create & Double = js.native
    
    /* 0 */ val Cross: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.Cross & Double = js.native
    
    /* 13 */ val DPadDown: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.DPadDown & Double = js.native
    
    /* 14 */ val DPadLeft: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.DPadLeft & Double = js.native
    
    /* 15 */ val DPadRight: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.DPadRight & Double = js.native
    
    /* 12 */ val DPadUp: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.DPadUp & Double = js.native
    
    /* 16 */ val Home: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.Home & Double = js.native
    
    /* 4 */ val L1: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.L1 & Double = js.native
    
    /* 6 */ val L2: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.L2 & Double = js.native
    
    /* 10 */ val L3: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.L3 & Double = js.native
    
    /* 18 */ val LStickXAxis: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.LStickXAxis & Double = js.native
    
    /* 19 */ val LStickYAxis: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.LStickYAxis & Double = js.native
    
    /* 9 */ val Options: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.Options & Double = js.native
    
    /* 5 */ val R1: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.R1 & Double = js.native
    
    /* 7 */ val R2: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.R2 & Double = js.native
    
    /* 11 */ val R3: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.R3 & Double = js.native
    
    /* 20 */ val RStickXAxis: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.RStickXAxis & Double = js.native
    
    /* 21 */ val RStickYAxis: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.RStickYAxis & Double = js.native
    
    /* 2 */ val Square: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.Square & Double = js.native
    
    /* 17 */ val TouchPad: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.TouchPad & Double = js.native
    
    /* 3 */ val Triangle: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualSenseInput.Triangle & Double = js.native
  }
  
  @JSImport("babylonjs/DeviceInput/index", "DualShockInput")
  @js.native
  object DualShockInput extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput & Double] = js.native
    
    /* 1 */ val Circle: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.Circle & Double = js.native
    
    /* 0 */ val Cross: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.Cross & Double = js.native
    
    /* 13 */ val DPadDown: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.DPadDown & Double = js.native
    
    /* 14 */ val DPadLeft: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.DPadLeft & Double = js.native
    
    /* 15 */ val DPadRight: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.DPadRight & Double = js.native
    
    /* 12 */ val DPadUp: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.DPadUp & Double = js.native
    
    /* 16 */ val Home: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.Home & Double = js.native
    
    /* 4 */ val L1: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.L1 & Double = js.native
    
    /* 6 */ val L2: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.L2 & Double = js.native
    
    /* 10 */ val L3: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.L3 & Double = js.native
    
    /* 18 */ val LStickXAxis: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.LStickXAxis & Double = js.native
    
    /* 19 */ val LStickYAxis: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.LStickYAxis & Double = js.native
    
    /* 9 */ val Options: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.Options & Double = js.native
    
    /* 5 */ val R1: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.R1 & Double = js.native
    
    /* 7 */ val R2: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.R2 & Double = js.native
    
    /* 11 */ val R3: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.R3 & Double = js.native
    
    /* 20 */ val RStickXAxis: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.RStickXAxis & Double = js.native
    
    /* 21 */ val RStickYAxis: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.RStickYAxis & Double = js.native
    
    /* 8 */ val Share: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.Share & Double = js.native
    
    /* 2 */ val Square: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.Square & Double = js.native
    
    /* 17 */ val TouchPad: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.TouchPad & Double = js.native
    
    /* 3 */ val Triangle: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.DualShockInput.Triangle & Double = js.native
  }
  
  @JSImport("babylonjs/DeviceInput/index", "NativePointerInput")
  @js.native
  object NativePointerInput extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.NativePointerInput & Double
      ] = js.native
    
    /* 5 */ val BrowserBack: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.NativePointerInput.BrowserBack & Double = js.native
    
    /* 6 */ val BrowserForward: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.NativePointerInput.BrowserForward & Double = js.native
    
    /* 10 */ val DeltaHorizontal: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.NativePointerInput.DeltaHorizontal & Double = js.native
    
    /* 11 */ val DeltaVertical: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.NativePointerInput.DeltaVertical & Double = js.native
    
    /* 0 */ val Horizontal: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.NativePointerInput.Horizontal & Double = js.native
    
    /* 2 */ val LeftClick: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.NativePointerInput.LeftClick & Double = js.native
    
    /* 3 */ val MiddleClick: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.NativePointerInput.MiddleClick & Double = js.native
    
    /* 7 */ val MouseWheelX: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.NativePointerInput.MouseWheelX & Double = js.native
    
    /* 8 */ val MouseWheelY: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.NativePointerInput.MouseWheelY & Double = js.native
    
    /* 9 */ val MouseWheelZ: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.NativePointerInput.MouseWheelZ & Double = js.native
    
    /* 4 */ val RightClick: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.NativePointerInput.RightClick & Double = js.native
    
    /* 1 */ val Vertical: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.NativePointerInput.Vertical & Double = js.native
  }
  
  @JSImport("babylonjs/DeviceInput/index", "PointerInput")
  @js.native
  object PointerInput extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.PointerInput & Double] = js.native
    
    /* 5 */ val BrowserBack: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.PointerInput.BrowserBack & Double = js.native
    
    /* 6 */ val BrowserForward: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.PointerInput.BrowserForward & Double = js.native
    
    /* 0 */ val Horizontal: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.PointerInput.Horizontal & Double = js.native
    
    /* 2 */ val LeftClick: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.PointerInput.LeftClick & Double = js.native
    
    /* 3 */ val MiddleClick: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.PointerInput.MiddleClick & Double = js.native
    
    /* 7 */ val MouseWheelX: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.PointerInput.MouseWheelX & Double = js.native
    
    /* 8 */ val MouseWheelY: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.PointerInput.MouseWheelY & Double = js.native
    
    /* 9 */ val MouseWheelZ: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.PointerInput.MouseWheelZ & Double = js.native
    
    /* 12 */ val Move: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.PointerInput.Move & Double = js.native
    
    /* 4 */ val RightClick: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.PointerInput.RightClick & Double = js.native
    
    /* 1 */ val Vertical: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.PointerInput.Vertical & Double = js.native
  }
  
  @JSImport("babylonjs/DeviceInput/index", "SwitchInput")
  @js.native
  object SwitchInput extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput & Double] = js.native
    
    /* 1 */ val A: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.A & Double = js.native
    
    /* 0 */ val B: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.B & Double = js.native
    
    /* 17 */ val Capture: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.Capture & Double = js.native
    
    /* 13 */ val DPadDown: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.DPadDown & Double = js.native
    
    /* 14 */ val DPadLeft: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.DPadLeft & Double = js.native
    
    /* 15 */ val DPadRight: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.DPadRight & Double = js.native
    
    /* 12 */ val DPadUp: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.DPadUp & Double = js.native
    
    /* 16 */ val Home: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.Home & Double = js.native
    
    /* 4 */ val L: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.L & Double = js.native
    
    /* 10 */ val LS: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.LS & Double = js.native
    
    /* 18 */ val LStickXAxis: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.LStickXAxis & Double = js.native
    
    /* 19 */ val LStickYAxis: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.LStickYAxis & Double = js.native
    
    /* 8 */ val Minus: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.Minus & Double = js.native
    
    /* 9 */ val Plus: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.Plus & Double = js.native
    
    /* 5 */ val R: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.R & Double = js.native
    
    /* 11 */ val RS: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.RS & Double = js.native
    
    /* 20 */ val RStickXAxis: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.RStickXAxis & Double = js.native
    
    /* 21 */ val RStickYAxis: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.RStickYAxis & Double = js.native
    
    /* 3 */ val X: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.X & Double = js.native
    
    /* 2 */ val Y: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.Y & Double = js.native
    
    /* 6 */ val ZL: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.ZL & Double = js.native
    
    /* 7 */ val ZR: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.SwitchInput.ZR & Double = js.native
  }
  
  @JSImport("babylonjs/DeviceInput/index", "XboxInput")
  @js.native
  object XboxInput extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput & Double] = js.native
    
    /* 0 */ val A: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.A & Double = js.native
    
    /* 1 */ val B: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.B & Double = js.native
    
    /* 8 */ val Back: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.Back & Double = js.native
    
    /* 13 */ val DPadDown: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.DPadDown & Double = js.native
    
    /* 14 */ val DPadLeft: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.DPadLeft & Double = js.native
    
    /* 15 */ val DPadRight: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.DPadRight & Double = js.native
    
    /* 12 */ val DPadUp: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.DPadUp & Double = js.native
    
    /* 16 */ val Home: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.Home & Double = js.native
    
    /* 4 */ val LB: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.LB & Double = js.native
    
    /* 10 */ val LS: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.LS & Double = js.native
    
    /* 17 */ val LStickXAxis: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.LStickXAxis & Double = js.native
    
    /* 18 */ val LStickYAxis: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.LStickYAxis & Double = js.native
    
    /* 6 */ val LT: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.LT & Double = js.native
    
    /* 5 */ val RB: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.RB & Double = js.native
    
    /* 11 */ val RS: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.RS & Double = js.native
    
    /* 19 */ val RStickXAxis: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.RStickXAxis & Double = js.native
    
    /* 20 */ val RStickYAxis: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.RStickYAxis & Double = js.native
    
    /* 7 */ val RT: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.RT & Double = js.native
    
    /* 9 */ val Start: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.Start & Double = js.native
    
    /* 2 */ val X: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.X & Double = js.native
    
    /* 3 */ val Y: typings.babylonjs.deviceInputInputDevicesDeviceEnumsMod.XboxInput.Y & Double = js.native
  }
}
