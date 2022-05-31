package typings.babylonjs.indexMod

import typings.babylonjs.HTMLCanvasElement
import typings.babylonjs.anon.PartialVirtualJoystickCus
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "VirtualJoystick")
@js.native
/**
  * Creates a new virtual joystick
  * @param leftJoystick defines that the joystick is for left hand (false by default)
  * @param customizations Defines the options we want to customize the VirtualJoystick
  */
class VirtualJoystick ()
  extends typings.babylonjs.miscIndexMod.VirtualJoystick {
  def this(leftJoystick: Boolean) = this()
  def this(leftJoystick: Boolean, customizations: PartialVirtualJoystickCus) = this()
  def this(leftJoystick: Unit, customizations: PartialVirtualJoystickCus) = this()
}
/* static members */
object VirtualJoystick {
  
  @JSImport("babylonjs/index", "VirtualJoystick")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Canvas the virtual joystick will render onto, default z-index of this is 5
    */
  @JSImport("babylonjs/index", "VirtualJoystick.Canvas")
  @js.native
  def Canvas: Nullable[HTMLCanvasElement] = js.native
  inline def Canvas_=(x: Nullable[HTMLCanvasElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Canvas")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "VirtualJoystick._GetDefaultOptions")
  @js.native
  def _GetDefaultOptions: js.Any = js.native
  inline def _GetDefaultOptions_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetDefaultOptions")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "VirtualJoystick._alwaysVisibleSticks")
  @js.native
  def _alwaysVisibleSticks: js.Any = js.native
  inline def _alwaysVisibleSticks_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_alwaysVisibleSticks")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "VirtualJoystick._globalJoystickIndex")
  @js.native
  def _globalJoystickIndex: js.Any = js.native
  inline def _globalJoystickIndex_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_globalJoystickIndex")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "VirtualJoystick.halfWidth")
  @js.native
  def halfWidth: js.Any = js.native
  inline def halfWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("halfWidth")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "VirtualJoystick.vjCanvasContext")
  @js.native
  def vjCanvasContext: js.Any = js.native
  inline def vjCanvasContext_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vjCanvasContext")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "VirtualJoystick.vjCanvasHeight")
  @js.native
  def vjCanvasHeight: js.Any = js.native
  inline def vjCanvasHeight_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vjCanvasHeight")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "VirtualJoystick.vjCanvasWidth")
  @js.native
  def vjCanvasWidth: js.Any = js.native
  inline def vjCanvasWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vjCanvasWidth")(x.asInstanceOf[js.Any])
}
