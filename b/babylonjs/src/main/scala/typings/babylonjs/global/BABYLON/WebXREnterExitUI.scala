package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebXREnterExitUI")
@js.native
/**
  *
  * @param scene babylon scene object to use
  * @param options (read-only) version of the options passed to this UI
  */
/* private */ class WebXREnterExitUI ()
  extends StObject
     with typings.babylonjs.BABYLON.WebXREnterExitUI {
  
  /* private */ /* CompleteClass */
  var _activeButton: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _buttons: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _updateButtons: js.Any = js.native
  
  /**
    * Fired every time the active button is changed.
    *
    * When xr is entered via a button that launches xr that button will be the callback parameter
    *
    * When exiting xr the callback parameter will be null)
    */
  /* CompleteClass */
  var activeButtonChangedObservable: typings.babylonjs.BABYLON.Observable[Nullable[typings.babylonjs.BABYLON.WebXREnterExitUIButton]] = js.native
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /** version of the options passed to this UI */
  /* CompleteClass */
  var options: typings.babylonjs.BABYLON.WebXREnterExitUIOptions = js.native
  
  /**
    * The HTML Div Element to which buttons are added.
    */
  /* CompleteClass */
  override val overlay: HTMLDivElement = js.native
  
  /* private */ /* CompleteClass */
  var scene: js.Any = js.native
}
/* static members */
object WebXREnterExitUI {
  
  @JSGlobal("BABYLON.WebXREnterExitUI")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates UI to allow the user to enter/exit XR mode
    * @param scene the scene to add the ui to
    * @param helper the xr experience helper to enter/exit xr with
    * @param options options to configure the UI
    * @returns the created ui
    */
  inline def CreateAsync(
    scene: typings.babylonjs.BABYLON.Scene,
    helper: typings.babylonjs.BABYLON.WebXRExperienceHelper,
    options: typings.babylonjs.BABYLON.WebXREnterExitUIOptions
  ): js.Promise[typings.babylonjs.BABYLON.WebXREnterExitUI] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAsync")(scene.asInstanceOf[js.Any], helper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.BABYLON.WebXREnterExitUI]]
}
