package typings.babylonjs

import typings.babylonjs.anon.EstimatedRealWorldWidth
import typings.babylonjs.anon.PartialXRSessionInit
import typings.babylonjs.mathsMathDotvectorMod.Matrix
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.xRFeaturesWebXRAbstractFeatureMod.WebXRAbstractFeature
import typings.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager
import typings.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xRFeaturesWebXRImageTrackingMod {
  
  @JSImport("babylonjs/XR/features/WebXRImageTracking", "WebXRImageTracking")
  @js.native
  open class WebXRImageTracking protected () extends WebXRAbstractFeature {
    /**
      * constructs the image tracking feature
      * @param _xrSessionManager the session manager for this module
      * @param options read-only options to be used in this module
      */
    def this(
      _xrSessionManager: WebXRSessionManager,
      /**
      * read-only options to be used in this module
      */
    options: IWebXRImageTrackingOptions
    ) = this()
    
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
  /* static members */
  object WebXRImageTracking {
    
    /**
      * The module's name
      */
    @JSImport("babylonjs/XR/features/WebXRImageTracking", "WebXRImageTracking.Name")
    @js.native
    val Name: String = js.native
    
    /**
      * The (Babylon) version of this module.
      * This is an integer representing the implementation version.
      * This number does not correspond to the WebXR specs version
      */
    @JSImport("babylonjs/XR/features/WebXRImageTracking", "WebXRImageTracking.Version")
    @js.native
    val Version: Double = js.native
  }
  
  trait IWebXRImageTrackingOptions extends StObject {
    
    /**
      * A required array with images to track
      */
    var images: js.Array[EstimatedRealWorldWidth]
  }
  object IWebXRImageTrackingOptions {
    
    inline def apply(images: js.Array[EstimatedRealWorldWidth]): IWebXRImageTrackingOptions = {
      val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWebXRImageTrackingOptions]
    }
    
    extension [Self <: IWebXRImageTrackingOptions](x: Self) {
      
      inline def setImages(value: js.Array[EstimatedRealWorldWidth]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesVarargs(value: EstimatedRealWorldWidth*): Self = StObject.set(x, "images", js.Array(value*))
    }
  }
  
  trait IWebXRTrackedImage extends StObject {
    
    /**
      * Is the transformation provided emulated. If it is, the system "guesses" its real position. Otherwise it can be considered as exact position.
      */
    var emulated: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The ID of this image (which is the same as the position in the array that was used to initialize the feature)
      */
    var id: Double
    
    /**
      * Just in case it is needed - the image bitmap that is being tracked
      */
    var originalBitmap: ImageBitmap
    
    /**
      * The width/height ratio of this image. can be used to calculate the size of the detected object/image
      */
    var ratio: js.UndefOr[Double] = js.undefined
    
    /**
      * Width in real world (meters)
      */
    var realWorldWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * A transformation matrix of this current image in the current reference space.
      */
    var transformationMatrix: Matrix
    
    /**
      * The native XR result image tracking result, untouched
      */
    var xrTrackingResult: js.UndefOr[XRImageTrackingResult] = js.undefined
  }
  object IWebXRTrackedImage {
    
    inline def apply(id: Double, originalBitmap: ImageBitmap, transformationMatrix: Matrix): IWebXRTrackedImage = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], originalBitmap = originalBitmap.asInstanceOf[js.Any], transformationMatrix = transformationMatrix.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWebXRTrackedImage]
    }
    
    extension [Self <: IWebXRTrackedImage](x: Self) {
      
      inline def setEmulated(value: Boolean): Self = StObject.set(x, "emulated", value.asInstanceOf[js.Any])
      
      inline def setEmulatedUndefined: Self = StObject.set(x, "emulated", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOriginalBitmap(value: ImageBitmap): Self = StObject.set(x, "originalBitmap", value.asInstanceOf[js.Any])
      
      inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
      
      inline def setRealWorldWidth(value: Double): Self = StObject.set(x, "realWorldWidth", value.asInstanceOf[js.Any])
      
      inline def setRealWorldWidthUndefined: Self = StObject.set(x, "realWorldWidth", js.undefined)
      
      inline def setTransformationMatrix(value: Matrix): Self = StObject.set(x, "transformationMatrix", value.asInstanceOf[js.Any])
      
      inline def setXrTrackingResult(value: XRImageTrackingResult): Self = StObject.set(x, "xrTrackingResult", value.asInstanceOf[js.Any])
      
      inline def setXrTrackingResultUndefined: Self = StObject.set(x, "xrTrackingResult", js.undefined)
    }
  }
}
