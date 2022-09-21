package typings.babylonjs.anon

import typings.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EstimatedRealWorldWidth extends StObject {
  
  /**
    * The estimated width in the real world (in meters)
    */
  var estimatedRealWorldWidth: Double
  
  /**
    * The source of the image. can be a URL or an image bitmap
    */
  var src: String | ImageBitmap
}
object EstimatedRealWorldWidth {
  
  inline def apply(estimatedRealWorldWidth: Double, src: String | ImageBitmap): EstimatedRealWorldWidth = {
    val __obj = js.Dynamic.literal(estimatedRealWorldWidth = estimatedRealWorldWidth.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[EstimatedRealWorldWidth]
  }
  
  extension [Self <: EstimatedRealWorldWidth](x: Self) {
    
    inline def setEstimatedRealWorldWidth(value: Double): Self = StObject.set(x, "estimatedRealWorldWidth", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: String | ImageBitmap): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
  }
}
