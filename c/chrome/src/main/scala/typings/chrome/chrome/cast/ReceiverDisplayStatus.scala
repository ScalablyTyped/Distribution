package typings.chrome.chrome.cast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReceiverDisplayStatus extends StObject {
  
  var appImages: js.Array[Image]
  
  var statusText: String
}
object ReceiverDisplayStatus {
  
  @scala.inline
  def apply(appImages: js.Array[Image], statusText: String): ReceiverDisplayStatus = {
    val __obj = js.Dynamic.literal(appImages = appImages.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiverDisplayStatus]
  }
  
  @scala.inline
  implicit class ReceiverDisplayStatusMutableBuilder[Self <: ReceiverDisplayStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppImages(value: js.Array[Image]): Self = StObject.set(x, "appImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppImagesVarargs(value: Image*): Self = StObject.set(x, "appImages", js.Array(value :_*))
    
    @scala.inline
    def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
  }
}
