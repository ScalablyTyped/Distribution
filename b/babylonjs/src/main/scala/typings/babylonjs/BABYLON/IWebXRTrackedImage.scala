package typings.babylonjs.BABYLON

import typings.babylonjs.XRImageTrackingResult
import typings.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
