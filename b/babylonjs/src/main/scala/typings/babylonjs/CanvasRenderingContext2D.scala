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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanvasRenderingContext2D] (val x: Self) extends AnyVal {
    
    inline def setMsImageSmoothingEnabled(value: Boolean): Self = StObject.set(x, "msImageSmoothingEnabled", value.asInstanceOf[js.Any])
  }
}
