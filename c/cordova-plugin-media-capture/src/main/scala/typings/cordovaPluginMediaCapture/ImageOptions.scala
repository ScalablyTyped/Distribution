package typings.cordovaPluginMediaCapture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Encapsulates image capture configuration options. */
trait ImageOptions extends StObject {
  
  /**
    * The maximum number of images the user can capture in a single capture operation.
    * The value must be greater than or equal to 1 (defaults to 1).
    */
  var limit: js.UndefOr[Double] = js.undefined
}
object ImageOptions {
  
  inline def apply(): ImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageOptions]
  }
  
  extension [Self <: ImageOptions](x: Self) {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
  }
}
