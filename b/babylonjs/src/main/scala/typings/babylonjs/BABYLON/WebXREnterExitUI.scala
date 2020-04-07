package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.WebXREnterExitUI")
@js.native
/**
  *
  * @param scene babylon scene object to use
  * @param options (read-only) version of the options passed to this UI
  */
class WebXREnterExitUI protected () extends IDisposable {
  var _activeButton: js.Any = js.native
  var _buttons: js.Any = js.native
  var _overlay: js.Any = js.native
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
  var scene: js.Any = js.native
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.WebXREnterExitUI")
@js.native
object WebXREnterExitUI extends js.Object {
  /**
    * Creates UI to allow the user to enter/exit XR mode
    * @param scene the scene to add the ui to
    * @param helper the xr experience helper to enter/exit xr with
    * @param options options to configure the UI
    * @returns the created ui
    */
  def CreateAsync(scene: Scene, helper: WebXRExperienceHelper, options: WebXREnterExitUIOptions): js.Promise[WebXREnterExitUI] = js.native
}

