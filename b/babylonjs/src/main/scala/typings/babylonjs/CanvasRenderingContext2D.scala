package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasRenderingContext2D extends StObject {
  
  var msImageSmoothingEnabled: Boolean
}
object CanvasRenderingContext2D {
  
  inline def apply(msImageSmoothingEnabled: Boolean): CanvasRenderingContext2D = {
    val __obj = js.Dynamic.literal(msImageSmoothingEnabled = msImageSmoothingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasRenderingContext2D]
  }
  
  extension [Self <: CanvasRenderingContext2D](x: Self) {
    
    inline def setMsImageSmoothingEnabled(value: Boolean): Self = StObject.set(x, "msImageSmoothingEnabled", value.asInstanceOf[js.Any])
  }
}
