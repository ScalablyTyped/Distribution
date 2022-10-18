package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreenshotDetails extends StObject {
  
  var blackout: js.Array[String]
  
  var dimensions: Dimensions
  
  var duration: Double
  
  var multipart: Boolean
  
  var name: String
  
  var path: String
  
  var pixelRatio: Double
  
  var scaled: Boolean
  
  var size: Double
  
  var specName: String
  
  var takenAt: String
  
  var testFailure: Boolean
}
object ScreenshotDetails {
  
  inline def apply(
    blackout: js.Array[String],
    dimensions: Dimensions,
    duration: Double,
    multipart: Boolean,
    name: String,
    path: String,
    pixelRatio: Double,
    scaled: Boolean,
    size: Double,
    specName: String,
    takenAt: String,
    testFailure: Boolean
  ): ScreenshotDetails = {
    val __obj = js.Dynamic.literal(blackout = blackout.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], multipart = multipart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], scaled = scaled.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], specName = specName.asInstanceOf[js.Any], takenAt = takenAt.asInstanceOf[js.Any], testFailure = testFailure.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenshotDetails]
  }
  
  extension [Self <: ScreenshotDetails](x: Self) {
    
    inline def setBlackout(value: js.Array[String]): Self = StObject.set(x, "blackout", value.asInstanceOf[js.Any])
    
    inline def setBlackoutVarargs(value: String*): Self = StObject.set(x, "blackout", js.Array(value*))
    
    inline def setDimensions(value: Dimensions): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setMultipart(value: Boolean): Self = StObject.set(x, "multipart", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    inline def setScaled(value: Boolean): Self = StObject.set(x, "scaled", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSpecName(value: String): Self = StObject.set(x, "specName", value.asInstanceOf[js.Any])
    
    inline def setTakenAt(value: String): Self = StObject.set(x, "takenAt", value.asInstanceOf[js.Any])
    
    inline def setTestFailure(value: Boolean): Self = StObject.set(x, "testFailure", value.asInstanceOf[js.Any])
  }
}
