package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaStreamTrackEventInit
  extends StObject
     with EventInit {
  
  var track: MediaStreamTrack
}
object MediaStreamTrackEventInit {
  
  inline def apply(track: MediaStreamTrack): MediaStreamTrackEventInit = {
    val __obj = js.Dynamic.literal(track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamTrackEventInit]
  }
  
  extension [Self <: MediaStreamTrackEventInit](x: Self) {
    
    inline def setTrack(value: MediaStreamTrack): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
  }
}
