package typings.babylonjs.BABYLON

import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebXREnterExitUI
  extends StObject
     with IDisposable {
  
  /* private */ var _activeButton: js.Any
  
  /* private */ var _buttons: js.Any
  
  /* private */ var _updateButtons: js.Any
  
  /**
    * Fired every time the active button is changed.
    *
    * When xr is entered via a button that launches xr that button will be the callback parameter
    *
    * When exiting xr the callback parameter will be null)
    */
  var activeButtonChangedObservable: Observable[Nullable[WebXREnterExitUIButton]]
  
  /** version of the options passed to this UI */
  var options: WebXREnterExitUIOptions
  
  /**
    * The HTML Div Element to which buttons are added.
    */
  val overlay: HTMLDivElement
  
  /* private */ var scene: js.Any
}
object WebXREnterExitUI {
  
  inline def apply(
    _activeButton: js.Any,
    _buttons: js.Any,
    _updateButtons: js.Any,
    activeButtonChangedObservable: Observable[Nullable[WebXREnterExitUIButton]],
    dispose: () => Unit,
    options: WebXREnterExitUIOptions,
    overlay: HTMLDivElement,
    scene: js.Any
  ): WebXREnterExitUI = {
    val __obj = js.Dynamic.literal(_activeButton = _activeButton.asInstanceOf[js.Any], _buttons = _buttons.asInstanceOf[js.Any], _updateButtons = _updateButtons.asInstanceOf[js.Any], activeButtonChangedObservable = activeButtonChangedObservable.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), options = options.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebXREnterExitUI]
  }
  
  extension [Self <: WebXREnterExitUI](x: Self) {
    
    inline def setActiveButtonChangedObservable(value: Observable[Nullable[WebXREnterExitUIButton]]): Self = StObject.set(x, "activeButtonChangedObservable", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: WebXREnterExitUIOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOverlay(value: HTMLDivElement): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    inline def setScene(value: js.Any): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    inline def set_activeButton(value: js.Any): Self = StObject.set(x, "_activeButton", value.asInstanceOf[js.Any])
    
    inline def set_buttons(value: js.Any): Self = StObject.set(x, "_buttons", value.asInstanceOf[js.Any])
    
    inline def set_updateButtons(value: js.Any): Self = StObject.set(x, "_updateButtons", value.asInstanceOf[js.Any])
  }
}
