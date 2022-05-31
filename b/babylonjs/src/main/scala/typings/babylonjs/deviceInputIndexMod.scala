package typings.babylonjs

import typings.babylonjs.deviceEnumsMod.DeviceType
import typings.babylonjs.engineMod.Engine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deviceInputIndexMod {
  
  @JSImport("babylonjs/DeviceInput/index", "DeviceInputSystem")
  @js.native
  /* private */ class DeviceInputSystem ()
    extends typings.babylonjs.deviceInputSystemMod.DeviceInputSystem
  /* static members */
  object DeviceInputSystem {
    
    @JSImport("babylonjs/DeviceInput/index", "DeviceInputSystem")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new DeviceInputSystem instance
      * @param engine Engine to pull input element from
      * @returns The new instance
      */
    inline def Create(engine: Engine): typings.babylonjs.deviceInputSystemMod.DeviceInputSystem = ^.asInstanceOf[js.Dynamic].applyDynamic("Create")(engine.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.deviceInputSystemMod.DeviceInputSystem]
    
    @JSImport("babylonjs/DeviceInput/index", "DeviceInputSystem._MAX_KEYCODES")
    @js.native
    def _MAX_KEYCODES: js.Any = js.native
    inline def _MAX_KEYCODES_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MAX_KEYCODES")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/DeviceInput/index", "DeviceInputSystem._MAX_POINTER_INPUTS")
    @js.native
    def _MAX_POINTER_INPUTS: js.Any = js.native
    inline def _MAX_POINTER_INPUTS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MAX_POINTER_INPUTS")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/DeviceInput/index", "DeviceSource")
  @js.native
  class DeviceSource[T /* <: DeviceType */] protected ()
    extends typings.babylonjs.deviceSourceManagerMod.DeviceSource[T] {
    /**
      * Default Constructor
      * @param deviceInputSystem Reference to DeviceInputSystem
      * @param deviceType Type of device
      * @param deviceSlot "Slot" or index that device is referenced in
      */
    def this(
      deviceInputSystem: typings.babylonjs.deviceInputSystemMod.DeviceInputSystem,
      /** Type of device */
    deviceType: DeviceType
    ) = this()
    def this(
      deviceInputSystem: typings.babylonjs.deviceInputSystemMod.DeviceInputSystem,
      /** Type of device */
    deviceType: DeviceType,
      /** "Slot" or index that device is referenced in */
    deviceSlot: Double
    ) = this()
  }
  
  @JSImport("babylonjs/DeviceInput/index", "DeviceSourceManager")
  @js.native
  class DeviceSourceManager protected ()
    extends typings.babylonjs.deviceSourceManagerMod.DeviceSourceManager {
    /**
      * Default Constructor
      * @param engine engine to pull input element from
      */
    def this(engine: Engine) = this()
  }
  
  @JSImport("babylonjs/DeviceInput/index", "DeviceType")
  @js.native
  object DeviceType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.babylonjs.deviceEnumsMod.DeviceType & Double] = js.native
    
    /* 4 */ val DualShock: typings.babylonjs.deviceEnumsMod.DeviceType.DualShock & Double = js.native
    
    /* 0 */ val Generic: typings.babylonjs.deviceEnumsMod.DeviceType.Generic & Double = js.native
    
    /* 1 */ val Keyboard: typings.babylonjs.deviceEnumsMod.DeviceType.Keyboard & Double = js.native
    
    /* 2 */ val Mouse: typings.babylonjs.deviceEnumsMod.DeviceType.Mouse & Double = js.native
    
    /* 6 */ val Switch: typings.babylonjs.deviceEnumsMod.DeviceType.Switch & Double = js.native
    
    /* 3 */ val Touch: typings.babylonjs.deviceEnumsMod.DeviceType.Touch & Double = js.native
    
    /* 5 */ val Xbox: typings.babylonjs.deviceEnumsMod.DeviceType.Xbox & Double = js.native
  }
  
  @JSImport("babylonjs/DeviceInput/index", "DualShockInput")
  @js.native
  object DualShockInput extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.babylonjs.deviceEnumsMod.DualShockInput & Double] = js.native
    
    /* 1 */ val Circle: typings.babylonjs.deviceEnumsMod.DualShockInput.Circle & Double = js.native
    
    /* 0 */ val Cross: typings.babylonjs.deviceEnumsMod.DualShockInput.Cross & Double = js.native
    
    /* 13 */ val DPadDown: typings.babylonjs.deviceEnumsMod.DualShockInput.DPadDown & Double = js.native
    
    /* 14 */ val DPadLeft: typings.babylonjs.deviceEnumsMod.DualShockInput.DPadLeft & Double = js.native
    
    /* 15 */ val DPadRight: typings.babylonjs.deviceEnumsMod.DualShockInput.DPadRight & Double = js.native
    
    /* 12 */ val DPadUp: typings.babylonjs.deviceEnumsMod.DualShockInput.DPadUp & Double = js.native
    
    /* 16 */ val Home: typings.babylonjs.deviceEnumsMod.DualShockInput.Home & Double = js.native
    
    /* 4 */ val L1: typings.babylonjs.deviceEnumsMod.DualShockInput.L1 & Double = js.native
    
    /* 6 */ val L2: typings.babylonjs.deviceEnumsMod.DualShockInput.L2 & Double = js.native
    
    /* 10 */ val L3: typings.babylonjs.deviceEnumsMod.DualShockInput.L3 & Double = js.native
    
    /* 18 */ val LStickXAxis: typings.babylonjs.deviceEnumsMod.DualShockInput.LStickXAxis & Double = js.native
    
    /* 19 */ val LStickYAxis: typings.babylonjs.deviceEnumsMod.DualShockInput.LStickYAxis & Double = js.native
    
    /* 9 */ val Options: typings.babylonjs.deviceEnumsMod.DualShockInput.Options & Double = js.native
    
    /* 5 */ val R1: typings.babylonjs.deviceEnumsMod.DualShockInput.R1 & Double = js.native
    
    /* 7 */ val R2: typings.babylonjs.deviceEnumsMod.DualShockInput.R2 & Double = js.native
    
    /* 11 */ val R3: typings.babylonjs.deviceEnumsMod.DualShockInput.R3 & Double = js.native
    
    /* 20 */ val RStickXAxis: typings.babylonjs.deviceEnumsMod.DualShockInput.RStickXAxis & Double = js.native
    
    /* 21 */ val RStickYAxis: typings.babylonjs.deviceEnumsMod.DualShockInput.RStickYAxis & Double = js.native
    
    /* 8 */ val Share: typings.babylonjs.deviceEnumsMod.DualShockInput.Share & Double = js.native
    
    /* 2 */ val Square: typings.babylonjs.deviceEnumsMod.DualShockInput.Square & Double = js.native
    
    /* 17 */ val TouchPad: typings.babylonjs.deviceEnumsMod.DualShockInput.TouchPad & Double = js.native
    
    /* 3 */ val Triangle: typings.babylonjs.deviceEnumsMod.DualShockInput.Triangle & Double = js.native
  }
  
  @JSImport("babylonjs/DeviceInput/index", "PointerInput")
  @js.native
  object PointerInput extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.babylonjs.deviceEnumsMod.PointerInput & Double] = js.native
    
    /* 5 */ val BrowserBack: typings.babylonjs.deviceEnumsMod.PointerInput.BrowserBack & Double = js.native
    
    /* 6 */ val BrowserForward: typings.babylonjs.deviceEnumsMod.PointerInput.BrowserForward & Double = js.native
    
    /* 0 */ val Horizontal: typings.babylonjs.deviceEnumsMod.PointerInput.Horizontal & Double = js.native
    
    /* 2 */ val LeftClick: typings.babylonjs.deviceEnumsMod.PointerInput.LeftClick & Double = js.native
    
    /* 3 */ val MiddleClick: typings.babylonjs.deviceEnumsMod.PointerInput.MiddleClick & Double = js.native
    
    /* 4 */ val RightClick: typings.babylonjs.deviceEnumsMod.PointerInput.RightClick & Double = js.native
    
    /* 1 */ val Vertical: typings.babylonjs.deviceEnumsMod.PointerInput.Vertical & Double = js.native
  }
  
  @JSImport("babylonjs/DeviceInput/index", "SwitchInput")
  @js.native
  object SwitchInput extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.babylonjs.deviceEnumsMod.SwitchInput & Double] = js.native
    
    /* 1 */ val A: typings.babylonjs.deviceEnumsMod.SwitchInput.A & Double = js.native
    
    /* 0 */ val B: typings.babylonjs.deviceEnumsMod.SwitchInput.B & Double = js.native
    
    /* 17 */ val Capture: typings.babylonjs.deviceEnumsMod.SwitchInput.Capture & Double = js.native
    
    /* 13 */ val DPadDown: typings.babylonjs.deviceEnumsMod.SwitchInput.DPadDown & Double = js.native
    
    /* 14 */ val DPadLeft: typings.babylonjs.deviceEnumsMod.SwitchInput.DPadLeft & Double = js.native
    
    /* 15 */ val DPadRight: typings.babylonjs.deviceEnumsMod.SwitchInput.DPadRight & Double = js.native
    
    /* 12 */ val DPadUp: typings.babylonjs.deviceEnumsMod.SwitchInput.DPadUp & Double = js.native
    
    /* 16 */ val Home: typings.babylonjs.deviceEnumsMod.SwitchInput.Home & Double = js.native
    
    /* 4 */ val L: typings.babylonjs.deviceEnumsMod.SwitchInput.L & Double = js.native
    
    /* 10 */ val LS: typings.babylonjs.deviceEnumsMod.SwitchInput.LS & Double = js.native
    
    /* 18 */ val LStickXAxis: typings.babylonjs.deviceEnumsMod.SwitchInput.LStickXAxis & Double = js.native
    
    /* 19 */ val LStickYAxis: typings.babylonjs.deviceEnumsMod.SwitchInput.LStickYAxis & Double = js.native
    
    /* 8 */ val Minus: typings.babylonjs.deviceEnumsMod.SwitchInput.Minus & Double = js.native
    
    /* 9 */ val Plus: typings.babylonjs.deviceEnumsMod.SwitchInput.Plus & Double = js.native
    
    /* 5 */ val R: typings.babylonjs.deviceEnumsMod.SwitchInput.R & Double = js.native
    
    /* 11 */ val RS: typings.babylonjs.deviceEnumsMod.SwitchInput.RS & Double = js.native
    
    /* 20 */ val RStickXAxis: typings.babylonjs.deviceEnumsMod.SwitchInput.RStickXAxis & Double = js.native
    
    /* 21 */ val RStickYAxis: typings.babylonjs.deviceEnumsMod.SwitchInput.RStickYAxis & Double = js.native
    
    /* 3 */ val X: typings.babylonjs.deviceEnumsMod.SwitchInput.X & Double = js.native
    
    /* 2 */ val Y: typings.babylonjs.deviceEnumsMod.SwitchInput.Y & Double = js.native
    
    /* 6 */ val ZL: typings.babylonjs.deviceEnumsMod.SwitchInput.ZL & Double = js.native
    
    /* 7 */ val ZR: typings.babylonjs.deviceEnumsMod.SwitchInput.ZR & Double = js.native
  }
  
  @JSImport("babylonjs/DeviceInput/index", "XboxInput")
  @js.native
  object XboxInput extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.babylonjs.deviceEnumsMod.XboxInput & Double] = js.native
    
    /* 0 */ val A: typings.babylonjs.deviceEnumsMod.XboxInput.A & Double = js.native
    
    /* 1 */ val B: typings.babylonjs.deviceEnumsMod.XboxInput.B & Double = js.native
    
    /* 8 */ val Back: typings.babylonjs.deviceEnumsMod.XboxInput.Back & Double = js.native
    
    /* 13 */ val DPadDown: typings.babylonjs.deviceEnumsMod.XboxInput.DPadDown & Double = js.native
    
    /* 14 */ val DPadLeft: typings.babylonjs.deviceEnumsMod.XboxInput.DPadLeft & Double = js.native
    
    /* 15 */ val DPadRight: typings.babylonjs.deviceEnumsMod.XboxInput.DPadRight & Double = js.native
    
    /* 12 */ val DPadUp: typings.babylonjs.deviceEnumsMod.XboxInput.DPadUp & Double = js.native
    
    /* 16 */ val Home: typings.babylonjs.deviceEnumsMod.XboxInput.Home & Double = js.native
    
    /* 4 */ val LB: typings.babylonjs.deviceEnumsMod.XboxInput.LB & Double = js.native
    
    /* 10 */ val LS: typings.babylonjs.deviceEnumsMod.XboxInput.LS & Double = js.native
    
    /* 17 */ val LStickXAxis: typings.babylonjs.deviceEnumsMod.XboxInput.LStickXAxis & Double = js.native
    
    /* 18 */ val LStickYAxis: typings.babylonjs.deviceEnumsMod.XboxInput.LStickYAxis & Double = js.native
    
    /* 6 */ val LT: typings.babylonjs.deviceEnumsMod.XboxInput.LT & Double = js.native
    
    /* 5 */ val RB: typings.babylonjs.deviceEnumsMod.XboxInput.RB & Double = js.native
    
    /* 11 */ val RS: typings.babylonjs.deviceEnumsMod.XboxInput.RS & Double = js.native
    
    /* 19 */ val RStickXAxis: typings.babylonjs.deviceEnumsMod.XboxInput.RStickXAxis & Double = js.native
    
    /* 20 */ val RStickYAxis: typings.babylonjs.deviceEnumsMod.XboxInput.RStickYAxis & Double = js.native
    
    /* 7 */ val RT: typings.babylonjs.deviceEnumsMod.XboxInput.RT & Double = js.native
    
    /* 9 */ val Start: typings.babylonjs.deviceEnumsMod.XboxInput.Start & Double = js.native
    
    /* 2 */ val X: typings.babylonjs.deviceEnumsMod.XboxInput.X & Double = js.native
    
    /* 3 */ val Y: typings.babylonjs.deviceEnumsMod.XboxInput.Y & Double = js.native
  }
}
