package typings.babylonjs.BABYLON

import typings.babylonjs.anon.PartialXRSessionInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXRImageTracking
  extends StObject
     with WebXRAbstractFeature {
  
  /* private */ var _checkScoresAsync: Any = js.native
  
  /* private */ var _originalTrackingRequest: Any = js.native
  
  /* private */ var _trackableScoreStatus: Any = js.native
  
  /* private */ var _trackedImages: Any = js.native
  
  /**
    * Get a tracked image by its ID.
    *
    * @param id the id of the image to load (position in the init array)
    * @returns a trackable image, if exists in this location
    */
  def getTrackedImageById(id: Double): Nullable[IWebXRTrackedImage] = js.native
  
  /**
    * Extends the session init object if needed
    * @returns augmentation object fo the xr session init object.
    */
  @JSName("getXRSessionInitExtension")
  def getXRSessionInitExtension_MWebXRImageTracking(): js.Promise[PartialXRSessionInit] = js.native
  
  /**
    * An image was deemed trackable, and the system will start tracking it.
    */
  var onTrackableImageFoundObservable: Observable[IWebXRTrackedImage] = js.native
  
  /**
    * The image was found and its state was updated.
    */
  var onTrackedImageUpdatedObservable: Observable[IWebXRTrackedImage] = js.native
  
  /**
    * This will be triggered if the underlying system deems an image untrackable.
    * The index is the index of the image from the array used to initialize the feature.
    */
  var onUntrackableImageFoundObservable: Observable[Double] = js.native
  
  /**
    * read-only options to be used in this module
    */
  val options: IWebXRImageTrackingOptions = js.native
}
