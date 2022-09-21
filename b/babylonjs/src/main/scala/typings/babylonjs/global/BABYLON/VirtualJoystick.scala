package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.HTMLCanvasElement
import typings.babylonjs.anon.PartialVirtualJoystickCus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.VirtualJoystick")
@js.native
/**
  * Creates a new virtual joystick
  * @param leftJoystick defines that the joystick is for left hand (false by default)
  * @param customizations Defines the options we want to customize the VirtualJoystick
  */
open class VirtualJoystick ()
  extends StObject
     with typings.babylonjs.BABYLON.VirtualJoystick {
  def this(leftJoystick: Boolean) = this()
  def this(leftJoystick: Boolean, customizations: PartialVirtualJoystickCus) = this()
  def this(leftJoystick: Unit, customizations: PartialVirtualJoystickCus) = this()
}
/* static members */
object VirtualJoystick {
  
  @JSGlobal("BABYLON.VirtualJoystick")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Canvas the virtual joystick will render onto, default z-index of this is 5
    */
  @JSGlobal("BABYLON.VirtualJoystick.Canvas")
  @js.native
  def Canvas: Nullable[HTMLCanvasElement] = js.native
  inline def Canvas_=(x: Nullable[HTMLCanvasElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Canvas")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.VirtualJoystick._AlwaysVisibleSticks")
  @js.native
  def _AlwaysVisibleSticks: Any = js.native
  inline def _AlwaysVisibleSticks_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_AlwaysVisibleSticks")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.VirtualJoystick._GetDefaultOptions")
  @js.native
  def _GetDefaultOptions: Any = js.native
  inline def _GetDefaultOptions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetDefaultOptions")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.VirtualJoystick._GlobalJoystickIndex")
  @js.native
  def _GlobalJoystickIndex: Any = js.native
  inline def _GlobalJoystickIndex_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GlobalJoystickIndex")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.VirtualJoystick._HalfWidth")
  @js.native
  def _HalfWidth: Any = js.native
  inline def _HalfWidth_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_HalfWidth")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.VirtualJoystick._VJCanvasContext")
  @js.native
  def _VJCanvasContext: Any = js.native
  inline def _VJCanvasContext_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_VJCanvasContext")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.VirtualJoystick._VJCanvasHeight")
  @js.native
  def _VJCanvasHeight: Any = js.native
  inline def _VJCanvasHeight_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_VJCanvasHeight")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.VirtualJoystick._VJCanvasWidth")
  @js.native
  def _VJCanvasWidth: Any = js.native
  inline def _VJCanvasWidth_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_VJCanvasWidth")(x.asInstanceOf[js.Any])
}
