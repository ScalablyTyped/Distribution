package typings.babylonjs

import typings.babylonjs.observableMod.Observable
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.webXRExperienceHelperMod.WebXRExperienceHelper
import typings.babylonjs.webXRTypesMod.WebXRRenderTarget
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/XR/webXREnterExitUI", JSImport.Namespace)
@js.native
object webXREnterExitUIMod extends js.Object {
  
  @js.native
  /**
    *
    * @param scene babylon scene object to use
    * @param options (read-only) version of the options passed to this UI
    */
  class WebXREnterExitUI protected () extends IDisposable {
    
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
  /* static members */
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
  
  @js.native
  class WebXREnterExitUIButton protected () extends js.Object {
    /**
      * Creates a WebXREnterExitUIButton
      * @param element button element
      * @param sessionMode XR initialization session mode
      * @param referenceSpaceType the type of reference space to be used
      */
    def this(
      /** button element */
    element: HTMLElement,
      /** XR initialization options for the button */
    sessionMode: XRSessionMode,
      /** Reference space type */
    referenceSpaceType: XRReferenceSpaceType
    ) = this()
    
    /** button element */
    var element: HTMLElement = js.native
    
    /** Reference space type */
    var referenceSpaceType: XRReferenceSpaceType = js.native
    
    /** XR initialization options for the button */
    var sessionMode: XRSessionMode = js.native
    
    /**
      * Extendable function which can be used to update the button's visuals when the state changes
      * @param activeButton the current active button in the UI
      */
    def update(activeButton: Nullable[WebXREnterExitUIButton]): Unit = js.native
  }
  
  @js.native
  class WebXREnterExitUIOptions () extends js.Object {
    
    /**
      * User provided buttons to enable/disable WebXR. The system will provide default if not set
      */
    var customButtons: js.UndefOr[js.Array[WebXREnterExitUIButton]] = js.native
    
    /**
      * If defined, this function will be executed if the UI encounters an error when entering XR
      */
    var onError: js.UndefOr[js.Function1[/* error */ js.Any, Unit]] = js.native
    
    /**
      * A list of optional features to init the session with
      */
    var optionalFeatures: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * A reference space type to use when creating the default button.
      * Default is local-floor
      */
    var referenceSpaceType: js.UndefOr[XRReferenceSpaceType] = js.native
    
    /**
      * Context to enter xr with
      */
    var renderTarget: js.UndefOr[Nullable[WebXRRenderTarget]] = js.native
    
    /**
      * A list of optional features to init the session with
      */
    var requiredFeatures: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * A session mode to use when creating the default button.
      * Default is immersive-vr
      */
    var sessionMode: js.UndefOr[XRSessionMode] = js.native
  }
}
