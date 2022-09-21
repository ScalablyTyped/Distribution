package typings.babylonjs.BABYLON

import typings.babylonjs.anon.PartialXRSessionInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRDomOverlay
  extends StObject
     with WebXRAbstractFeature {
  
  /**
    * Event Listener to supress "beforexrselect" events.
    */
  /* private */ var _beforeXRSelectListener: Any = js.native
  
  /**
    * Type of overlay - non-null when available
    */
  /* private */ var _domOverlayType: Any = js.native
  
  /**
    * Element used for overlay
    */
  /* private */ var _element: Any = js.native
  
  /**
    * The type of DOM overlay (null when not supported).  Provided by UA and remains unchanged for duration of session.
    */
  def domOverlayType: Nullable[WebXRDomOverlayType] = js.native
  
  /**
    * Extends the session init object if needed
    * @returns augmentation object for the xr session init object.
    */
  @JSName("getXRSessionInitExtension")
  def getXRSessionInitExtension_MWebXRDomOverlay(): js.Promise[PartialXRSessionInit] = js.native
  
  /**
    * options to use when constructing this feature
    */
  val options: IWebXRDomOverlayOptions = js.native
}
