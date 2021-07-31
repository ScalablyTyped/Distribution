package typings.chrome.chrome.cast.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeekRequest extends StObject {
  
  var currentTime: Double
  
  var customData: js.Object
  
  var resumeState: ResumeState
}
object SeekRequest {
  
  @scala.inline
  def apply(currentTime: Double, customData: js.Object, resumeState: ResumeState): SeekRequest = {
    val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any], customData = customData.asInstanceOf[js.Any], resumeState = resumeState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeekRequest]
  }
  
  @scala.inline
  implicit class SeekRequestMutableBuilder[Self <: SeekRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomData(value: js.Object): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResumeState(value: ResumeState): Self = StObject.set(x, "resumeState", value.asInstanceOf[js.Any])
  }
}
