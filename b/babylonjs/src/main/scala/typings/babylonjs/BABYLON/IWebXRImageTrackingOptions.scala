package typings.babylonjs.BABYLON

import typings.babylonjs.anon.EstimatedRealWorldWidth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
