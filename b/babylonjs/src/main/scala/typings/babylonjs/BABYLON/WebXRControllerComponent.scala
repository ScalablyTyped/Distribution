package typings.babylonjs.BABYLON

import typings.babylonjs.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRControllerComponent
  extends StObject
     with IDisposable {
  
  /* private */ var _axes: Any = js.native
  
  /* private */ var _axesIndices: Any = js.native
  
  /* private */ var _buttonIndex: Any = js.native
  
  /* private */ var _changes: Any = js.native
  
  /* private */ var _currentValue: Any = js.native
  
  /* private */ var _hasChanges: Any = js.native
  
  /* private */ var _pressed: Any = js.native
  
  /* private */ var _touched: Any = js.native
  
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
    * @returns true is axes data is available
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
  var onAxisValueChangedObservable: Observable[X] = js.native
  
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
