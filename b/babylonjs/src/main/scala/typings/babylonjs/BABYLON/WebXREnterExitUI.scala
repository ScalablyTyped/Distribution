package typings.babylonjs.BABYLON

import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXREnterExitUI extends IDisposable {
  
  var _activeButton: js.Any = js.native
  
  var _buttons: js.Any = js.native
  
  var _updateButtons: js.Any = js.native
  
  /**
    * Fired every time the active button is changed.
    *
    * When xr is entered via a button that launches xr that button will be the callback parameter
    *
    * When exiting xr the callback parameter will be null)
    */
  var activeButtonChangedObservable: Observable[Nullable[WebXREnterExitUIButton]] = js.native
  
  /** version of the options passed to this UI */
  var options: WebXREnterExitUIOptions = js.native
  
  /**
    * The HTML Div Element to which buttons are added.
    */
  val overlay: HTMLDivElement = js.native
  
  var scene: js.Any = js.native
}
object WebXREnterExitUI {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class WebXREnterExitUIMutableBuilder[Self <: WebXREnterExitUI] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveButtonChangedObservable(value: Observable[Nullable[WebXREnterExitUIButton]]): Self = StObject.set(x, "activeButtonChangedObservable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: WebXREnterExitUIOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlay(value: HTMLDivElement): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScene(value: js.Any): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_activeButton(value: js.Any): Self = StObject.set(x, "_activeButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_buttons(value: js.Any): Self = StObject.set(x, "_buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_updateButtons(value: js.Any): Self = StObject.set(x, "_updateButtons", value.asInstanceOf[js.Any])
  }
}
