package typings.babylonjs

import typings.babylonjs.anon.Y
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.webXRAbstractMotionControllerMod.IMinimalMotionControllerObject
import typings.babylonjs.webXRAbstractMotionControllerMod.MotionControllerComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webXRControllerComponentMod {
  
  @JSImport("babylonjs/XR/motionController/webXRControllerComponent", "WebXRControllerComponent")
  @js.native
  class WebXRControllerComponent protected () extends IDisposable {
    /**
      * Creates a new component for a motion controller.
      * It is created by the motion controller itself
      *
      * @param id the id of this component
      * @param type the type of the component
      * @param _buttonIndex index in the buttons array of the gamepad
      * @param _axesIndices indices of the values in the axes array of the gamepad
      */
    def this(
      /**
      * the id of this component
      */
    id: String,
      /**
      * the type of the component
      */
    `type`: MotionControllerComponentType
    ) = this()
    def this(
      /**
      * the id of this component
      */
    id: String,
      /**
      * the type of the component
      */
    `type`: MotionControllerComponentType,
      _buttonIndex: Double
    ) = this()
    def this(
      /**
      * the id of this component
      */
    id: String,
      /**
      * the type of the component
      */
    `type`: MotionControllerComponentType,
      _buttonIndex: js.UndefOr[scala.Nothing],
      _axesIndices: js.Array[Double]
    ) = this()
    def this(
      /**
      * the id of this component
      */
    id: String,
      /**
      * the type of the component
      */
    `type`: MotionControllerComponentType,
      _buttonIndex: Double,
      _axesIndices: js.Array[Double]
    ) = this()
    
    var _axes: js.Any = js.native
    
    var _axesIndices: js.Any = js.native
    
    var _buttonIndex: js.Any = js.native
    
    var _changes: js.Any = js.native
    
    var _currentValue: js.Any = js.native
    
    var _hasChanges: js.Any = js.native
    
    var _pressed: js.Any = js.native
    
    var _touched: js.Any = js.native
    
    /**
      * The current axes data. If this component has no axes it will still return an object { x: 0, y: 0 }
      */
    def axes: IWebXRMotionControllerAxesValue = js.native
    
    /**
      * Get the changes. Elements will be populated only if they changed with their previous and current value
      */
    def changes: IWebXRMotionControllerComponentChanges = js.native
    
    /**
      * Return whether or not the component changed the last frame
      */
    def hasChanges: Boolean = js.native
    
    /**
      * the id of this component
      */
    var id: String = js.native
    
    /**
      * Are there axes correlating to this component
      * @return true is axes data is available
      */
    def isAxes(): Boolean = js.native
    
    /**
      * Is this component a button (hence - pressable)
      * @returns true if can be pressed
      */
    def isButton(): Boolean = js.native
    
    /**
      * If axes are available for this component (like a touchpad or thumbstick) the observers will be notified when
      * the axes data changes
      */
    var onAxisValueChangedObservable: Observable[Y] = js.native
    
    /**
      * Observers registered here will be triggered when the state of a button changes
      * State change is either pressed / touched / value
      */
    var onButtonStateChangedObservable: Observable[WebXRControllerComponent] = js.native
    
    /**
      * is the button currently pressed
      */
    def pressed: Boolean = js.native
    
    /**
      * is the button currently touched
      */
    def touched: Boolean = js.native
    
    /**
      * the type of the component
      */
    var `type`: MotionControllerComponentType = js.native
    
    /**
      * update this component using the gamepad object it is in. Called on every frame
      * @param nativeController the native gamepad controller object
      */
    def update(nativeController: IMinimalMotionControllerObject): Unit = js.native
    
    /**
      * Get the current value of this component
      */
    def value: Double = js.native
  }
  /* static members */
  object WebXRControllerComponent {
    
    @JSImport("babylonjs/XR/motionController/webXRControllerComponent", "WebXRControllerComponent")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * button component type
      */
    @JSImport("babylonjs/XR/motionController/webXRControllerComponent", "WebXRControllerComponent.BUTTON_TYPE")
    @js.native
    def BUTTON_TYPE: MotionControllerComponentType = js.native
    @scala.inline
    def BUTTON_TYPE_=(x: MotionControllerComponentType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUTTON_TYPE")(x.asInstanceOf[js.Any])
    
    /**
      * squeeze component type
      */
    @JSImport("babylonjs/XR/motionController/webXRControllerComponent", "WebXRControllerComponent.SQUEEZE_TYPE")
    @js.native
    def SQUEEZE_TYPE: MotionControllerComponentType = js.native
    @scala.inline
    def SQUEEZE_TYPE_=(x: MotionControllerComponentType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SQUEEZE_TYPE")(x.asInstanceOf[js.Any])
    
    /**
      * Thumbstick component type
      */
    @JSImport("babylonjs/XR/motionController/webXRControllerComponent", "WebXRControllerComponent.THUMBSTICK_TYPE")
    @js.native
    def THUMBSTICK_TYPE: MotionControllerComponentType = js.native
    @scala.inline
    def THUMBSTICK_TYPE_=(x: MotionControllerComponentType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THUMBSTICK_TYPE")(x.asInstanceOf[js.Any])
    
    /**
      * Touchpad component type
      */
    @JSImport("babylonjs/XR/motionController/webXRControllerComponent", "WebXRControllerComponent.TOUCHPAD_TYPE")
    @js.native
    def TOUCHPAD_TYPE: MotionControllerComponentType = js.native
    @scala.inline
    def TOUCHPAD_TYPE_=(x: MotionControllerComponentType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOUCHPAD_TYPE")(x.asInstanceOf[js.Any])
    
    /**
      * trigger component type
      */
    @JSImport("babylonjs/XR/motionController/webXRControllerComponent", "WebXRControllerComponent.TRIGGER_TYPE")
    @js.native
    def TRIGGER_TYPE: MotionControllerComponentType = js.native
    @scala.inline
    def TRIGGER_TYPE_=(x: MotionControllerComponentType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRIGGER_TYPE")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IWebXRMotionControllerAxesValue extends StObject {
    
    /**
      * The value of the x axis
      */
    var x: Double = js.native
    
    /**
      * The value of the y-axis
      */
    var y: Double = js.native
  }
  object IWebXRMotionControllerAxesValue {
    
    @scala.inline
    def apply(x: Double, y: Double): IWebXRMotionControllerAxesValue = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWebXRMotionControllerAxesValue]
    }
    
    @scala.inline
    implicit class IWebXRMotionControllerAxesValueMutableBuilder[Self <: IWebXRMotionControllerAxesValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IWebXRMotionControllerComponentChanges extends StObject {
    
    /**
      * will be populated with previous and current values if axes changed
      */
    var axes: js.UndefOr[IWebXRMotionControllerComponentChangesValues[IWebXRMotionControllerAxesValue]] = js.native
    
    /**
      * will be populated with previous and current values if pressed changed
      */
    var pressed: js.UndefOr[IWebXRMotionControllerComponentChangesValues[Boolean]] = js.native
    
    /**
      * will be populated with previous and current values if touched changed
      */
    var touched: js.UndefOr[IWebXRMotionControllerComponentChangesValues[Boolean]] = js.native
    
    /**
      * will be populated with previous and current values if value changed
      */
    var value: js.UndefOr[IWebXRMotionControllerComponentChangesValues[Double]] = js.native
  }
  object IWebXRMotionControllerComponentChanges {
    
    @scala.inline
    def apply(): IWebXRMotionControllerComponentChanges = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWebXRMotionControllerComponentChanges]
    }
    
    @scala.inline
    implicit class IWebXRMotionControllerComponentChangesMutableBuilder[Self <: IWebXRMotionControllerComponentChanges] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxes(value: IWebXRMotionControllerComponentChangesValues[IWebXRMotionControllerAxesValue]): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
      
      @scala.inline
      def setPressed(value: IWebXRMotionControllerComponentChangesValues[Boolean]): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPressedUndefined: Self = StObject.set(x, "pressed", js.undefined)
      
      @scala.inline
      def setTouched(value: IWebXRMotionControllerComponentChangesValues[Boolean]): Self = StObject.set(x, "touched", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchedUndefined: Self = StObject.set(x, "touched", js.undefined)
      
      @scala.inline
      def setValue(value: IWebXRMotionControllerComponentChangesValues[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait IWebXRMotionControllerComponentChangesValues[T] extends StObject {
    
    /**
      * current (this frame) value
      */
    var current: T = js.native
    
    /**
      * previous (last change) value
      */
    var previous: T = js.native
  }
  object IWebXRMotionControllerComponentChangesValues {
    
    @scala.inline
    def apply[T](current: T, previous: T): IWebXRMotionControllerComponentChangesValues[T] = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWebXRMotionControllerComponentChangesValues[T]]
    }
    
    @scala.inline
    implicit class IWebXRMotionControllerComponentChangesValuesMutableBuilder[Self <: IWebXRMotionControllerComponentChangesValues[_], T] (val x: Self with IWebXRMotionControllerComponentChangesValues[T]) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: T): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevious(value: T): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    }
  }
}
