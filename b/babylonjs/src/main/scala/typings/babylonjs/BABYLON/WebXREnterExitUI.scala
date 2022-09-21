package typings.babylonjs.BABYLON

import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXREnterExitUI
  extends StObject
     with IDisposable {
  
  /* private */ var _activeButton: Any = js.native
  
  /* private */ var _buttons: Any = js.native
  
  /* private */ var _enterXRWithButtonIndex: Any = js.native
  
  /* private */ var _helper: Any = js.native
  
  /* private */ var _onSessionGranted: Any = js.native
  
  /* private */ var _renderTarget: Any = js.native
  
  /* private */ var _scene: Any = js.native
  
  /* private */ var _updateButtons: Any = js.native
  
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
  
  /**
    * Set the helper to be used with this UI component.
    * The UI is bound to an experience helper. If not provided the UI can still be used but the events should be registered by the developer.
    *
    * @param helper the experience helper to attach
    * @param renderTarget an optional render target (in case it is created outside of the helper scope)
    * @returns a promise that resolves when the ui is ready
    */
  def setHelperAsync(helper: WebXRExperienceHelper): js.Promise[Unit] = js.native
  def setHelperAsync(helper: WebXRExperienceHelper, renderTarget: WebXRRenderTarget): js.Promise[Unit] = js.native
}
