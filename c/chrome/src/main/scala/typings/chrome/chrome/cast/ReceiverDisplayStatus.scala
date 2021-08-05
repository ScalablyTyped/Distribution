package typings.chrome.chrome.cast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReceiverDisplayStatus extends StObject {
  
  var appImages: js.Array[Image]
  
  var statusText: String
}
object ReceiverDisplayStatus {
  
  inline def apply(appImages: js.Array[Image], statusText: String): ReceiverDisplayStatus = {
    val __obj = js.Dynamic.literal(appImages = appImages.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiverDisplayStatus]
  }
  
  extension [Self <: ReceiverDisplayStatus](x: Self) {
    
    inline def setAppImages(value: js.Array[Image]): Self = StObject.set(x, "appImages", value.asInstanceOf[js.Any])
    
    inline def setAppImagesVarargs(value: Image*): Self = StObject.set(x, "appImages", js.Array(value :_*))
    
    inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
  }
}
