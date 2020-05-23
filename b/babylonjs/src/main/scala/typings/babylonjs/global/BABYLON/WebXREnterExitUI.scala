package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
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
class WebXREnterExitUI protected ()
  extends typings.babylonjs.BABYLON.WebXREnterExitUI {
  /* CompleteClass */
  override var _activeButton: js.Any = js.native
  /* CompleteClass */
  override var _buttons: js.Any = js.native
  /* CompleteClass */
  override var _overlay: js.Any = js.native
  /* CompleteClass */
  override var _updateButtons: js.Any = js.native
  /**
    * Fired every time the active button is changed.
    *
    * When xr is entered via a button that launches xr that button will be the callback parameter
    *
    * When exiting xr the callback parameter will be null)
    */
  /* CompleteClass */
  override var activeButtonChangedObservable: typings.babylonjs.BABYLON.Observable[Nullable[typings.babylonjs.BABYLON.WebXREnterExitUIButton]] = js.native
  /** version of the options passed to this UI */
  /* CompleteClass */
  override var options: typings.babylonjs.BABYLON.WebXREnterExitUIOptions = js.native
  /* CompleteClass */
  override var scene: js.Any = js.native
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
  def CreateAsync(
    scene: typings.babylonjs.BABYLON.Scene,
    helper: typings.babylonjs.BABYLON.WebXRExperienceHelper,
    options: typings.babylonjs.BABYLON.WebXREnterExitUIOptions
  ): js.Promise[typings.babylonjs.BABYLON.WebXREnterExitUI] = js.native
}

