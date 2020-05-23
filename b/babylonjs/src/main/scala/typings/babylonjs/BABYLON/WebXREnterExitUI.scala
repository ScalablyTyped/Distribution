package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebXREnterExitUI extends IDisposable {
  var _activeButton: js.Any
  var _buttons: js.Any
  var _overlay: js.Any
  var _updateButtons: js.Any
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
  var scene: js.Any
}

object WebXREnterExitUI {
  @scala.inline
  def apply(
    _activeButton: js.Any,
    _buttons: js.Any,
    _overlay: js.Any,
    _updateButtons: js.Any,
    activeButtonChangedObservable: Observable[Nullable[WebXREnterExitUIButton]],
    dispose: () => Unit,
    options: WebXREnterExitUIOptions,
    scene: js.Any
  ): WebXREnterExitUI = {
    val __obj = js.Dynamic.literal(_activeButton = _activeButton.asInstanceOf[js.Any], _buttons = _buttons.asInstanceOf[js.Any], _overlay = _overlay.asInstanceOf[js.Any], _updateButtons = _updateButtons.asInstanceOf[js.Any], activeButtonChangedObservable = activeButtonChangedObservable.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), options = options.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebXREnterExitUI]
  }
}

