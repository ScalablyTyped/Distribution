package typings.babylonjs

import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.xRWebXRExperienceHelperMod.WebXRExperienceHelper
import typings.babylonjs.xRWebXRTypesMod.WebXRRenderTarget
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xRWebXREnterExitUIMod {
  
  @JSImport("babylonjs/XR/webXREnterExitUI", "WebXREnterExitUI")
  @js.native
  open class WebXREnterExitUI protected ()
    extends StObject
       with IDisposable {
    /**
      * Construct a new EnterExit UI class
      *
      * @param _scene babylon scene object to use
      * @param options (read-only) version of the options passed to this UI
      */
    def this(_scene: Scene, /** version of the options passed to this UI */
    options: WebXREnterExitUIOptions) = this()
    
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
    
    /**
      * Releases all held resources
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
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
  /* static members */
  object WebXREnterExitUI {
    
    @JSImport("babylonjs/XR/webXREnterExitUI", "WebXREnterExitUI")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates UI to allow the user to enter/exit XR mode
      * @param scene the scene to add the ui to
      * @param helper the xr experience helper to enter/exit xr with
      * @param options options to configure the UI
      * @returns the created ui
      */
    inline def CreateAsync(scene: Scene, helper: WebXRExperienceHelper, options: WebXREnterExitUIOptions): js.Promise[WebXREnterExitUI] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAsync")(scene.asInstanceOf[js.Any], helper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebXREnterExitUI]]
  }
  
  @JSImport("babylonjs/XR/webXREnterExitUI", "WebXREnterExitUIButton")
  @js.native
  open class WebXREnterExitUIButton protected () extends StObject {
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
  
  @JSImport("babylonjs/XR/webXREnterExitUI", "WebXREnterExitUIOptions")
  @js.native
  open class WebXREnterExitUIOptions () extends StObject {
    
    /**
      * User provided buttons to enable/disable WebXR. The system will provide default if not set
      */
    var customButtons: js.UndefOr[js.Array[WebXREnterExitUIButton]] = js.native
    
    /**
      * If set, the `sessiongranted` event will not be registered. `sessiongranted` is used to move seamlessly between WebXR experiences.
      * If set to true the user will be forced to press the "enter XR" button even if sessiongranted event was triggered.
      * If not set and a sessiongranted event was triggered, the XR session will start automatically.
      */
    var ignoreSessionGrantedEvent: js.UndefOr[Boolean] = js.native
    
    /**
      * If defined, this function will be executed if the UI encounters an error when entering XR
      */
    var onError: js.UndefOr[js.Function1[/* error */ Any, Unit]] = js.native
    
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
