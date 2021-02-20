package typings.babylonjs

import typings.babylonjs.deviceEnumsMod.DeviceType
import typings.babylonjs.engineMod.Engine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deviceInputIndexMod {
  
  @JSImport("babylonjs/DeviceInput/index", "DeviceInputSystem")
  @js.native
  class DeviceInputSystem protected ()
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
    @JSImport("babylonjs/DeviceInput/index", "DeviceInputSystem.Create")
    @js.native
    def Create(engine: Engine): typings.babylonjs.deviceInputSystemMod.DeviceInputSystem = js.native
    
    @JSImport("babylonjs/DeviceInput/index", "DeviceInputSystem._MAX_KEYCODES")
    @js.native
    def _MAX_KEYCODES: js.Any = js.native
    @scala.inline
    def _MAX_KEYCODES_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MAX_KEYCODES")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/DeviceInput/index", "DeviceInputSystem._MAX_POINTER_INPUTS")
    @js.native
    def _MAX_POINTER_INPUTS: js.Any = js.native
    @scala.inline
    def _MAX_POINTER_INPUTS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MAX_POINTER_INPUTS")(x.asInstanceOf[js.Any])
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
    def apply(value: Double): js.UndefOr[typings.babylonjs.deviceEnumsMod.DeviceType with Double] = js.native
    
    /* 4 */ val DualShock: typings.babylonjs.deviceEnumsMod.DeviceType.DualShock with Double = js.native
    
    /* 0 */ val Generic: typings.babylonjs.deviceEnumsMod.DeviceType.Generic with Double = js.native
    
    /* 1 */ val Keyboard: typings.babylonjs.deviceEnumsMod.DeviceType.Keyboard with Double = js.native
    
    /* 2 */ val Mouse: typings.babylonjs.deviceEnumsMod.DeviceType.Mouse with Double = js.native
    
    /* 6 */ val Switch: typings.babylonjs.deviceEnumsMod.DeviceType.Switch with Double = js.native
    
    /* 3 */ val Touch: typings.babylonjs.deviceEnumsMod.DeviceType.Touch with Double = js.native
    
    /* 5 */ val Xbox: typings.babylonjs.deviceEnumsMod.DeviceType.Xbox with Double = js.native
  }
  
  @JSImport("babylonjs/DeviceInput/index", "DualShockInput")
  @js.native
  object DualShockInput extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.babylonjs.deviceEnumsMod.DualShockInput with Double] = js.native
    
    /* 1 */ val Circle: typings.babylonjs.deviceEnumsMod.DualShockInput.Circle with Double = js.native
    
    /* 0 */ val Cross: typings.babylonjs.deviceEnumsMod.DualShockInput.Cross with Double = js.native
    
    /* 13 */ val DPadDown: typings.babylonjs.deviceEnumsMod.DualShockInput.DPadDown with Double = js.native
    
    /* 14 */ val DPadLeft: typings.babylonjs.deviceEnumsMod.DualShockInput.DPadLeft with Double = js.native
    
    /* 15 */ val DPadRight: typings.babylonjs.deviceEnumsMod.DualShockInput.DPadRight with Double = js.native
    
    /* 12 */ val DPadUp: typings.babylonjs.deviceEnumsMod.DualShockInput.DPadUp with Double = js.native
    
    /* 16 */ val Home: typings.babylonjs.deviceEnumsMod.DualShockInput.Home with Double = js.native
    
    /* 4 */ val L1: typings.babylonjs.deviceEnumsMod.DualShockInput.L1 with Double = js.native
    
    /* 6 */ val L2: typings.babylonjs.deviceEnumsMod.DualShockInput.L2 with Double = js.native
    
    /* 10 */ val L3: typings.babylonjs.deviceEnumsMod.DualShockInput.L3 with Double = js.native
    
    /* 18 */ val LStickXAxis: typings.babylonjs.deviceEnumsMod.DualShockInput.LStickXAxis with Double = js.native
    
    /* 19 */ val LStickYAxis: typings.babylonjs.deviceEnumsMod.DualShockInput.LStickYAxis with Double = js.native
    
    /* 9 */ val Options: typings.babylonjs.deviceEnumsMod.DualShockInput.Options with Double = js.native
    
    /* 5 */ val R1: typings.babylonjs.deviceEnumsMod.DualShockInput.R1 with Double = js.native
    
    /* 7 */ val R2: typings.babylonjs.deviceEnumsMod.DualShockInput.R2 with Double = js.native
    
    /* 11 */ val R3: typings.babylonjs.deviceEnumsMod.DualShockInput.R3 with Double = js.native
    
    /* 20 */ val RStickXAxis: typings.babylonjs.deviceEnumsMod.DualShockInput.RStickXAxis with Double = js.native
    
    /* 21 */ val RStickYAxis: typings.babylonjs.deviceEnumsMod.DualShockInput.RStickYAxis with Double = js.native
    
    /* 8 */ val Share: typings.babylonjs.deviceEnumsMod.DualShockInput.Share with Double = js.native
    
    /* 2 */ val Square: typings.babylonjs.deviceEnumsMod.DualShockInput.Square with Double = js.native
    
    /* 17 */ val TouchPad: typings.babylonjs.deviceEnumsMod.DualShockInput.TouchPad with Double = js.native
    
    /* 3 */ val Triangle: typings.babylonjs.deviceEnumsMod.DualShockInput.Triangle with Double = js.native
  }
  
  @JSImport("babylonjs/DeviceInput/index", "PointerInput")
  @js.native
  object PointerInput extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.babylonjs.deviceEnumsMod.PointerInput with Double] = js.native
    
    /* 5 */ val BrowserBack: typings.babylonjs.deviceEnumsMod.PointerInput.BrowserBack with Double = js.native
    
    /* 6 */ val BrowserForward: typings.babylonjs.deviceEnumsMod.PointerInput.BrowserForward with Double = js.native
    
    /* 0 */ val Horizontal: typings.babylonjs.deviceEnumsMod.PointerInput.Horizontal with Double = js.native
    
    /* 2 */ val LeftClick: typings.babylonjs.deviceEnumsMod.PointerInput.LeftClick with Double = js.native
    
    /* 3 */ val MiddleClick: typings.babylonjs.deviceEnumsMod.PointerInput.MiddleClick with Double = js.native
    
    /* 4 */ val RightClick: typings.babylonjs.deviceEnumsMod.PointerInput.RightClick with Double = js.native
    
    /* 1 */ val Vertical: typings.babylonjs.deviceEnumsMod.PointerInput.Vertical with Double = js.native
  }
  
  @JSImport("babylonjs/DeviceInput/index", "SwitchInput")
  @js.native
  object SwitchInput extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.babylonjs.deviceEnumsMod.SwitchInput with Double] = js.native
    
    /* 1 */ val A: typings.babylonjs.deviceEnumsMod.SwitchInput.A with Double = js.native
    
    /* 0 */ val B: typings.babylonjs.deviceEnumsMod.SwitchInput.B with Double = js.native
    
    /* 17 */ val Capture: typings.babylonjs.deviceEnumsMod.SwitchInput.Capture with Double = js.native
    
    /* 13 */ val DPadDown: typings.babylonjs.deviceEnumsMod.SwitchInput.DPadDown with Double = js.native
    
    /* 14 */ val DPadLeft: typings.babylonjs.deviceEnumsMod.SwitchInput.DPadLeft with Double = js.native
    
    /* 15 */ val DPadRight: typings.babylonjs.deviceEnumsMod.SwitchInput.DPadRight with Double = js.native
    
    /* 12 */ val DPadUp: typings.babylonjs.deviceEnumsMod.SwitchInput.DPadUp with Double = js.native
    
    /* 16 */ val Home: typings.babylonjs.deviceEnumsMod.SwitchInput.Home with Double = js.native
    
    /* 4 */ val L: typings.babylonjs.deviceEnumsMod.SwitchInput.L with Double = js.native
    
    /* 10 */ val LS: typings.babylonjs.deviceEnumsMod.SwitchInput.LS with Double = js.native
    
    /* 18 */ val LStickXAxis: typings.babylonjs.deviceEnumsMod.SwitchInput.LStickXAxis with Double = js.native
    
    /* 19 */ val LStickYAxis: typings.babylonjs.deviceEnumsMod.SwitchInput.LStickYAxis with Double = js.native
    
    /* 8 */ val Minus: typings.babylonjs.deviceEnumsMod.SwitchInput.Minus with Double = js.native
    
    /* 9 */ val Plus: typings.babylonjs.deviceEnumsMod.SwitchInput.Plus with Double = js.native
    
    /* 5 */ val R: typings.babylonjs.deviceEnumsMod.SwitchInput.R with Double = js.native
    
    /* 11 */ val RS: typings.babylonjs.deviceEnumsMod.SwitchInput.RS with Double = js.native
    
    /* 20 */ val RStickXAxis: typings.babylonjs.deviceEnumsMod.SwitchInput.RStickXAxis with Double = js.native
    
    /* 21 */ val RStickYAxis: typings.babylonjs.deviceEnumsMod.SwitchInput.RStickYAxis with Double = js.native
    
    /* 3 */ val X: typings.babylonjs.deviceEnumsMod.SwitchInput.X with Double = js.native
    
    /* 2 */ val Y: typings.babylonjs.deviceEnumsMod.SwitchInput.Y with Double = js.native
    
    /* 6 */ val ZL: typings.babylonjs.deviceEnumsMod.SwitchInput.ZL with Double = js.native
    
    /* 7 */ val ZR: typings.babylonjs.deviceEnumsMod.SwitchInput.ZR with Double = js.native
  }
  
  @JSImport("babylonjs/DeviceInput/index", "XboxInput")
  @js.native
  object XboxInput extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.babylonjs.deviceEnumsMod.XboxInput with Double] = js.native
    
    /* 0 */ val A: typings.babylonjs.deviceEnumsMod.XboxInput.A with Double = js.native
    
    /* 1 */ val B: typings.babylonjs.deviceEnumsMod.XboxInput.B with Double = js.native
    
    /* 8 */ val Back: typings.babylonjs.deviceEnumsMod.XboxInput.Back with Double = js.native
    
    /* 13 */ val DPadDown: typings.babylonjs.deviceEnumsMod.XboxInput.DPadDown with Double = js.native
    
    /* 14 */ val DPadLeft: typings.babylonjs.deviceEnumsMod.XboxInput.DPadLeft with Double = js.native
    
    /* 15 */ val DPadRight: typings.babylonjs.deviceEnumsMod.XboxInput.DPadRight with Double = js.native
    
    /* 12 */ val DPadUp: typings.babylonjs.deviceEnumsMod.XboxInput.DPadUp with Double = js.native
    
    /* 16 */ val Home: typings.babylonjs.deviceEnumsMod.XboxInput.Home with Double = js.native
    
    /* 4 */ val LB: typings.babylonjs.deviceEnumsMod.XboxInput.LB with Double = js.native
    
    /* 10 */ val LS: typings.babylonjs.deviceEnumsMod.XboxInput.LS with Double = js.native
    
    /* 17 */ val LStickXAxis: typings.babylonjs.deviceEnumsMod.XboxInput.LStickXAxis with Double = js.native
    
    /* 18 */ val LStickYAxis: typings.babylonjs.deviceEnumsMod.XboxInput.LStickYAxis with Double = js.native
    
    /* 6 */ val LT: typings.babylonjs.deviceEnumsMod.XboxInput.LT with Double = js.native
    
    /* 5 */ val RB: typings.babylonjs.deviceEnumsMod.XboxInput.RB with Double = js.native
    
    /* 11 */ val RS: typings.babylonjs.deviceEnumsMod.XboxInput.RS with Double = js.native
    
    /* 19 */ val RStickXAxis: typings.babylonjs.deviceEnumsMod.XboxInput.RStickXAxis with Double = js.native
    
    /* 20 */ val RStickYAxis: typings.babylonjs.deviceEnumsMod.XboxInput.RStickYAxis with Double = js.native
    
    /* 7 */ val RT: typings.babylonjs.deviceEnumsMod.XboxInput.RT with Double = js.native
    
    /* 9 */ val Start: typings.babylonjs.deviceEnumsMod.XboxInput.Start with Double = js.native
    
    /* 2 */ val X: typings.babylonjs.deviceEnumsMod.XboxInput.X with Double = js.native
    
    /* 3 */ val Y: typings.babylonjs.deviceEnumsMod.XboxInput.Y with Double = js.native
  }
}
