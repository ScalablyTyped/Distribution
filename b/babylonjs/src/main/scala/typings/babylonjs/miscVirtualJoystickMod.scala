package typings.babylonjs

import typings.babylonjs.anon.PartialVirtualJoystickCus
import typings.babylonjs.anon.X
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscVirtualJoystickMod {
  
  @js.native
  sealed trait JoystickAxis extends StObject
  @JSImport("babylonjs/Misc/virtualJoystick", "JoystickAxis")
  @js.native
  object JoystickAxis extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[JoystickAxis & Double] = js.native
    
    /** X axis */
    @js.native
    sealed trait X
      extends StObject
         with JoystickAxis
    /* 0 */ val X: typings.babylonjs.miscVirtualJoystickMod.JoystickAxis.X & Double = js.native
    
    /** Y axis */
    @js.native
    sealed trait Y
      extends StObject
         with JoystickAxis
    /* 1 */ val Y: typings.babylonjs.miscVirtualJoystickMod.JoystickAxis.Y & Double = js.native
    
    /** Z axis */
    @js.native
    sealed trait Z
      extends StObject
         with JoystickAxis
    /* 2 */ val Z: typings.babylonjs.miscVirtualJoystickMod.JoystickAxis.Z & Double = js.native
  }
  
  @JSImport("babylonjs/Misc/virtualJoystick", "VirtualJoystick")
  @js.native
  /**
    * Creates a new virtual joystick
    * @param leftJoystick defines that the joystick is for left hand (false by default)
    * @param customizations Defines the options we want to customize the VirtualJoystick
    */
  open class VirtualJoystick () extends StObject {
    def this(leftJoystick: Boolean) = this()
    def this(leftJoystick: Boolean, customizations: PartialVirtualJoystickCus) = this()
    def this(leftJoystick: Unit, customizations: PartialVirtualJoystickCus) = this()
    
    /* private */ var _action: Any = js.native
    
    /* private */ var _alwaysVisible: Any = js.native
    
    /* private */ var _axisTargetedByLeftAndRight: Any = js.native
    
    /* private */ var _axisTargetedByUpAndDown: Any = js.native
    
    /* private */ var _clearContainerSize: Any = js.native
    
    /* private */ var _clearContainerSizeOffset: Any = js.native
    
    /**
      * Clears the canvas from the previous puck / container draw
      */
    /* private */ var _clearPreviousDraw: Any = js.native
    
    /* private */ var _clearPuckSize: Any = js.native
    
    /* private */ var _clearPuckSizeOffset: Any = js.native
    
    /* private */ var _containerImage: Any = js.native
    
    /* private */ var _deltaJoystickVector: Any = js.native
    
    /**
      * Draws the Virtual Joystick's container
      */
    /* private */ var _drawContainer: Any = js.native
    
    /**
      * Draws the Virtual Joystick's puck
      */
    /* private */ var _drawPuck: Any = js.native
    
    /* private */ var _drawVirtualJoystick: Any = js.native
    
    /* private */ var _inversedSensibility: Any = js.native
    
    /* private */ var _joystickColor: Any = js.native
    
    /* private */ var _joystickContainerSize: Any = js.native
    
    /* private */ var _joystickPointerId: Any = js.native
    
    /* private */ var _joystickPointerPos: Any = js.native
    
    /* private */ var _joystickPointerStartPos: Any = js.native
    
    /* private */ var _joystickPosition: Any = js.native
    
    /* private */ var _joystickPreviousPointerPos: Any = js.native
    
    /* private */ var _joystickPuckSize: Any = js.native
    
    /* private */ var _joystickSensibility: Any = js.native
    
    /* private */ var _leftJoystick: Any = js.native
    
    /* private */ var _onPointerDown: Any = js.native
    
    /* private */ var _onPointerDownHandlerRef: Any = js.native
    
    /* private */ var _onPointerMove: Any = js.native
    
    /* private */ var _onPointerMoveHandlerRef: Any = js.native
    
    /* private */ var _onPointerUp: Any = js.native
    
    /* private */ var _onPointerUpHandlerRef: Any = js.native
    
    /* private */ var _onResize: Any = js.native
    
    /* private */ var _puckImage: Any = js.native
    
    /* private */ var _released: Any = js.native
    
    /* private */ var _touches: Any = js.native
    
    def alwaysVisible: Boolean = js.native
    /**
      * Defines whether or not the joystick container is always visible
      */
    def alwaysVisible_=(value: Boolean): Unit = js.native
    
    /**
      * Clears the set position of the joystick
      */
    def clearPosition(): Unit = js.native
    
    def containerSize: Double = js.native
    /**
      * Size of the joystick's container
      */
    def containerSize_=(newSize: Double): Unit = js.native
    
    /**
      * Gets the offset value for the position (ie. the change of the position value)
      */
    var deltaPosition: Vector3 = js.native
    
    /**
      * boolean indicating whether or not the joystick's puck's movement should be limited to the joystick's container area
      */
    var limitToContainer: Boolean = js.native
    
    /**
      * Gets a boolean indicating if the virtual joystick was pressed
      */
    var pressed: Boolean = js.native
    
    def puckSize: Double = js.native
    /**
      * Size of the joystick's puck
      */
    def puckSize_=(newSize: Double): Unit = js.native
    
    /**
      * Release internal HTML canvas
      */
    def releaseCanvas(): Unit = js.native
    
    /**
      * Gets or sets a boolean indicating that left and right values must be inverted
      */
    var reverseLeftRight: Boolean = js.native
    
    /**
      * Gets or sets a boolean indicating that up and down values must be inverted
      */
    var reverseUpDown: Boolean = js.native
    
    /**
      * Defines a callback to call when the joystick is touched
      * @param action defines the callback
      */
    def setActionOnTouch(action: js.Function0[Any]): Unit = js.native
    
    /**
      * Defines which axis you'd like to control for left & right
      * @param axis defines the axis to use
      */
    def setAxisForLeftRight(axis: JoystickAxis): Unit = js.native
    
    /**
      * Defines which axis you'd like to control for up & down
      * @param axis defines the axis to use
      */
    def setAxisForUpDown(axis: JoystickAxis): Unit = js.native
    
    /**
      * Loads `urlPath` to be used for the container's image
      * @param urlPath defines the urlPath of an image to use
      */
    def setContainerImage(urlPath: String): Unit = js.native
    
    /**
      * Change the color of the virtual joystick
      * @param newColor a string that must be a CSS color value (like "red") or the hexa value (like "#FF0000")
      */
    def setJoystickColor(newColor: String): Unit = js.native
    
    /**
      * Defines joystick sensibility (ie. the ratio between a physical move and virtual joystick position change)
      * @param newJoystickSensibility defines the new sensibility
      */
    def setJoystickSensibility(newJoystickSensibility: Double): Unit = js.native
    
    /**
      * Sets the constant position of the Joystick container
      * @param x X axis coordinate
      * @param y Y axis coordinate
      */
    def setPosition(x: Double, y: Double): Unit = js.native
    
    /**
      * Loads `urlPath` to be used for the puck's image
      * @param urlPath defines the urlPath of an image to use
      */
    def setPuckImage(urlPath: String): Unit = js.native
  }
  /* static members */
  object VirtualJoystick {
    
    @JSImport("babylonjs/Misc/virtualJoystick", "VirtualJoystick")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Canvas the virtual joystick will render onto, default z-index of this is 5
      */
    @JSImport("babylonjs/Misc/virtualJoystick", "VirtualJoystick.Canvas")
    @js.native
    def Canvas: Nullable[HTMLCanvasElement] = js.native
    inline def Canvas_=(x: Nullable[HTMLCanvasElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Canvas")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/virtualJoystick", "VirtualJoystick._AlwaysVisibleSticks")
    @js.native
    def _AlwaysVisibleSticks: Any = js.native
    inline def _AlwaysVisibleSticks_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_AlwaysVisibleSticks")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/virtualJoystick", "VirtualJoystick._GetDefaultOptions")
    @js.native
    def _GetDefaultOptions: Any = js.native
    inline def _GetDefaultOptions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetDefaultOptions")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/virtualJoystick", "VirtualJoystick._GlobalJoystickIndex")
    @js.native
    def _GlobalJoystickIndex: Any = js.native
    inline def _GlobalJoystickIndex_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GlobalJoystickIndex")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/virtualJoystick", "VirtualJoystick._HalfWidth")
    @js.native
    def _HalfWidth: Any = js.native
    inline def _HalfWidth_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_HalfWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/virtualJoystick", "VirtualJoystick._VJCanvasContext")
    @js.native
    def _VJCanvasContext: Any = js.native
    inline def _VJCanvasContext_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_VJCanvasContext")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/virtualJoystick", "VirtualJoystick._VJCanvasHeight")
    @js.native
    def _VJCanvasHeight: Any = js.native
    inline def _VJCanvasHeight_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_VJCanvasHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/virtualJoystick", "VirtualJoystick._VJCanvasWidth")
    @js.native
    def _VJCanvasWidth: Any = js.native
    inline def _VJCanvasWidth_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_VJCanvasWidth")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Represents the different customization options available
    * for VirtualJoystick
    */
  trait VirtualJoystickCustomizations extends StObject {
    
    /**
      * Defines whether or not the joystick container is always visible
      */
    var alwaysVisible: Boolean
    
    /**
      * Color of the joystick && puck
      */
    var color: String
    
    /**
      * Image URL for the joystick's container
      */
    var containerImage: js.UndefOr[String] = js.undefined
    
    /**
      * Size of the joystick's container
      */
    var containerSize: Double
    
    /**
      * Defines whether or not to limit the movement of the puck to the joystick's container
      */
    var limitToContainer: Boolean
    
    /**
      * Defines the unmoving position of the joystick container
      */
    var position: js.UndefOr[X] = js.undefined
    
    /**
      * Image URL for the joystick's puck
      */
    var puckImage: js.UndefOr[String] = js.undefined
    
    /**
      * Size of the joystick's puck
      */
    var puckSize: Double
  }
  object VirtualJoystickCustomizations {
    
    inline def apply(
      alwaysVisible: Boolean,
      color: String,
      containerSize: Double,
      limitToContainer: Boolean,
      puckSize: Double
    ): VirtualJoystickCustomizations = {
      val __obj = js.Dynamic.literal(alwaysVisible = alwaysVisible.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], containerSize = containerSize.asInstanceOf[js.Any], limitToContainer = limitToContainer.asInstanceOf[js.Any], puckSize = puckSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[VirtualJoystickCustomizations]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VirtualJoystickCustomizations] (val x: Self) extends AnyVal {
      
      inline def setAlwaysVisible(value: Boolean): Self = StObject.set(x, "alwaysVisible", value.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setContainerImage(value: String): Self = StObject.set(x, "containerImage", value.asInstanceOf[js.Any])
      
      inline def setContainerImageUndefined: Self = StObject.set(x, "containerImage", js.undefined)
      
      inline def setContainerSize(value: Double): Self = StObject.set(x, "containerSize", value.asInstanceOf[js.Any])
      
      inline def setLimitToContainer(value: Boolean): Self = StObject.set(x, "limitToContainer", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: X): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setPuckImage(value: String): Self = StObject.set(x, "puckImage", value.asInstanceOf[js.Any])
      
      inline def setPuckImageUndefined: Self = StObject.set(x, "puckImage", js.undefined)
      
      inline def setPuckSize(value: Double): Self = StObject.set(x, "puckSize", value.asInstanceOf[js.Any])
    }
  }
}
