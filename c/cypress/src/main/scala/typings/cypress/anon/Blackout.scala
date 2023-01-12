package typings.cypress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Blackout extends StObject {
  
  var blackout: js.Array[String]
  
  var dimensions: Height
  
  var duration: Double
  
  var multipart: Boolean
  
  var name: String
  
  var path: String
  
  var pixelRatio: Double
  
  var size: Double
  
  var takenAt: String
  
  var testAttemptIndex: Double
}
object Blackout {
  
  inline def apply(
    blackout: js.Array[String],
    dimensions: Height,
    duration: Double,
    multipart: Boolean,
    name: String,
    path: String,
    pixelRatio: Double,
    size: Double,
    takenAt: String,
    testAttemptIndex: Double
  ): Blackout = {
    val __obj = js.Dynamic.literal(blackout = blackout.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], multipart = multipart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], takenAt = takenAt.asInstanceOf[js.Any], testAttemptIndex = testAttemptIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blackout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Blackout] (val x: Self) extends AnyVal {
    
    inline def setBlackout(value: js.Array[String]): Self = StObject.set(x, "blackout", value.asInstanceOf[js.Any])
    
    inline def setBlackoutVarargs(value: String*): Self = StObject.set(x, "blackout", js.Array(value*))
    
    inline def setDimensions(value: Height): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setMultipart(value: Boolean): Self = StObject.set(x, "multipart", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setTakenAt(value: String): Self = StObject.set(x, "takenAt", value.asInstanceOf[js.Any])
    
    inline def setTestAttemptIndex(value: Double): Self = StObject.set(x, "testAttemptIndex", value.asInstanceOf[js.Any])
  }
}
