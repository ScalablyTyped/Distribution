package typings.cordovaPluginDeviceOrientation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A CompassError object is returned to the onError callback function when an error occurs. */
trait CompassError extends StObject {
  
  /**
    * One of the predefined error codes
    *     CompassError.COMPASS_INTERNAL_ERR
    *     CompassError.COMPASS_NOT_SUPPORTED
    */
  var code: Double
}
object CompassError {
  
  inline def apply(code: Double): CompassError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompassError]
  }
  
  extension [Self <: CompassError](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}
