package typings.babylonjs

import typings.babylonjs.anon.PartialVirtualJoystickCus
import typings.babylonjs.anon.Y
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object virtualJoystickMod {
  
  @js.native
  sealed trait JoystickAxis extends StObject
  @JSImport("babylonjs/Misc/virtualJoystick", "JoystickAxis")
  @js.native
  object JoystickAxis extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[JoystickAxis with Double] = js.native
    
    /** X axis */
    @js.native
    sealed trait X extends JoystickAxis
    /* 0 */ val X: typings.babylonjs.virtualJoystickMod.JoystickAxis.X with Double = js.native
    
    /** Y axis */
    @js.native
    sealed trait Y extends JoystickAxis
    /* 1 */ val Y: typings.babylonjs.virtualJoystickMod.JoystickAxis.Y with Double = js.native
    
    /** Z axis */
    @js.native
    sealed trait Z extends JoystickAxis
    /* 2 */ val Z: typings.babylonjs.virtualJoystickMod.JoystickAxis.Z with Double = js.native
  }
  
  @JSImport("babylonjs/Misc/virtualJoystick", "VirtualJoystick")
  @js.native
  /**
    * Creates a new virtual joystick
    * @param leftJoystick defines that the joystick is for left hand (false by default)
    * @param customizations Defines the options we want to customize the VirtualJoystick
    */
  class VirtualJoystick () extends StObject {
    def this(leftJoystick: Boolean) = this()
    def this(leftJoystick: js.UndefOr[scala.Nothing], customizations: PartialVirtualJoystickCus) = this()
    def this(leftJoystick: Boolean, customizations: PartialVirtualJoystickCus) = this()
    
    var _action: js.Any = js.native
    
    var _alwaysVisible: js.Any = js.native
    
    var _axisTargetedByLeftAndRight: js.Any = js.native
    
    var _axisTargetedByUpAndDown: js.Any = js.native
    
    var _clearContainerSize: js.Any = js.native
    
    var _clearContainerSizeOffset: js.Any = js.native
    
    /**
      * Clears the canvas from the previous puck / container draw
      */
    var _clearPreviousDraw: js.Any = js.native
    
    var _clearPuckSize: js.Any = js.native
    
    var _clearPuckSizeOffset: js.Any = js.native
    
    var _containerImage: js.Any = js.native
    
    var _deltaJoystickVector: js.Any = js.native
    
    /**
      * Draws the Virtual Joystick's container
      */
    var _drawContainer: js.Any = js.native
    
    /**
      * Draws the Virtual Joystick's puck
      */
    var _drawPuck: js.Any = js.native
    
    var _drawVirtualJoystick: js.Any = js.native
    
    var _inversedSensibility: js.Any = js.native
    
    var _joystickColor: js.Any = js.native
    
    var _joystickContainerSize: js.Any = js.native
    
    var _joystickPointerID: js.Any = js.native
    
    var _joystickPointerPos: js.Any = js.native
    
    var _joystickPointerStartPos: js.Any = js.native
    
    var _joystickPosition: js.Any = js.native
    
    var _joystickPreviousPointerPos: js.Any = js.native
    
    var _joystickPuckSize: js.Any = js.native
    
    var _joystickSensibility: js.Any = js.native
    
    var _leftJoystick: js.Any = js.native
    
    var _onPointerDown: js.Any = js.native
    
    var _onPointerDownHandlerRef: js.Any = js.native
    
    var _onPointerMove: js.Any = js.native
    
    var _onPointerMoveHandlerRef: js.Any = js.native
    
    var _onPointerUp: js.Any = js.native
    
    var _onPointerUpHandlerRef: js.Any = js.native
    
    var _onResize: js.Any = js.native
    
    var _puckImage: js.Any = js.native
    
    var _touches: js.Any = js.native
    
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
    def setActionOnTouch(action: js.Function0[_]): Unit = js.native
    
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
      * Defines joystick sensibility (ie. the ratio beteen a physical move and virtual joystick position change)
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
    @scala.inline
    def Canvas_=(x: Nullable[HTMLCanvasElement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Canvas")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/virtualJoystick", "VirtualJoystick._GetDefaultOptions")
    @js.native
    def _GetDefaultOptions: js.Any = js.native
    @scala.inline
    def _GetDefaultOptions_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetDefaultOptions")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/virtualJoystick", "VirtualJoystick._alwaysVisibleSticks")
    @js.native
    def _alwaysVisibleSticks: js.Any = js.native
    @scala.inline
    def _alwaysVisibleSticks_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_alwaysVisibleSticks")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/virtualJoystick", "VirtualJoystick._globalJoystickIndex")
    @js.native
    def _globalJoystickIndex: js.Any = js.native
    @scala.inline
    def _globalJoystickIndex_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_globalJoystickIndex")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/virtualJoystick", "VirtualJoystick.halfWidth")
    @js.native
    def halfWidth: js.Any = js.native
    @scala.inline
    def halfWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("halfWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/virtualJoystick", "VirtualJoystick.vjCanvasContext")
    @js.native
    def vjCanvasContext: js.Any = js.native
    @scala.inline
    def vjCanvasContext_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vjCanvasContext")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/virtualJoystick", "VirtualJoystick.vjCanvasHeight")
    @js.native
    def vjCanvasHeight: js.Any = js.native
    @scala.inline
    def vjCanvasHeight_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vjCanvasHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/virtualJoystick", "VirtualJoystick.vjCanvasWidth")
    @js.native
    def vjCanvasWidth: js.Any = js.native
    @scala.inline
    def vjCanvasWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vjCanvasWidth")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Represents the different customization options available
    * for VirtualJoystick
    */
  @js.native
  trait VirtualJoystickCustomizations extends StObject {
    
    /**
      * Defines whether or not the joystick container is always visible
      */
    var alwaysVisible: Boolean = js.native
    
    /**
      * Color of the joystick && puck
      */
    var color: String = js.native
    
    /**
      * Image URL for the joystick's container
      */
    var containerImage: js.UndefOr[String] = js.native
    
    /**
      * Size of the joystick's container
      */
    var containerSize: Double = js.native
    
    /**
      * Defines whether or not to limit the movement of the puck to the joystick's container
      */
    var limitToContainer: Boolean = js.native
    
    /**
      * Defines the unmoving position of the joystick container
      */
    var position: js.UndefOr[Y] = js.native
    
    /**
      * Image URL for the joystick's puck
      */
    var puckImage: js.UndefOr[String] = js.native
    
    /**
      * Size of the joystick's puck
      */
    var puckSize: Double = js.native
  }
  object VirtualJoystickCustomizations {
    
    @scala.inline
    def apply(
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
    implicit class VirtualJoystickCustomizationsMutableBuilder[Self <: VirtualJoystickCustomizations] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwaysVisible(value: Boolean): Self = StObject.set(x, "alwaysVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerImage(value: String): Self = StObject.set(x, "containerImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerImageUndefined: Self = StObject.set(x, "containerImage", js.undefined)
      
      @scala.inline
      def setContainerSize(value: Double): Self = StObject.set(x, "containerSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitToContainer(value: Boolean): Self = StObject.set(x, "limitToContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: Y): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setPuckImage(value: String): Self = StObject.set(x, "puckImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPuckImageUndefined: Self = StObject.set(x, "puckImage", js.undefined)
      
      @scala.inline
      def setPuckSize(value: Double): Self = StObject.set(x, "puckSize", value.asInstanceOf[js.Any])
    }
  }
}
