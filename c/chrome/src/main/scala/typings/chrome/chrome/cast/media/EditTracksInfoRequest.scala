package typings.chrome.chrome.cast.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditTracksInfoRequest extends StObject {
  
  var activeTrackIds: js.Array[Double]
  
  var textTrackStyle: TextTrackStyle
}
object EditTracksInfoRequest {
  
  inline def apply(activeTrackIds: js.Array[Double], textTrackStyle: TextTrackStyle): EditTracksInfoRequest = {
    val __obj = js.Dynamic.literal(activeTrackIds = activeTrackIds.asInstanceOf[js.Any], textTrackStyle = textTrackStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditTracksInfoRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditTracksInfoRequest] (val x: Self) extends AnyVal {
    
    inline def setActiveTrackIds(value: js.Array[Double]): Self = StObject.set(x, "activeTrackIds", value.asInstanceOf[js.Any])
    
    inline def setActiveTrackIdsVarargs(value: Double*): Self = StObject.set(x, "activeTrackIds", js.Array(value*))
    
    inline def setTextTrackStyle(value: TextTrackStyle): Self = StObject.set(x, "textTrackStyle", value.asInstanceOf[js.Any])
  }
}
