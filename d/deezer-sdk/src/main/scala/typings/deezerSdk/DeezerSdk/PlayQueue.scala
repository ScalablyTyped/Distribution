package typings.deezerSdk.DeezerSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/loadtracks | Load tracks to a player}
  */
@js.native
trait PlayQueue extends StObject {
  
  val tracks: js.Array[Track] = js.native
}
object PlayQueue {
  
  @scala.inline
  def apply(tracks: js.Array[Track]): PlayQueue = {
    val __obj = js.Dynamic.literal(tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayQueue]
  }
  
  @scala.inline
  implicit class PlayQueueMutableBuilder[Self <: PlayQueue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTracks(value: js.Array[Track]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracksVarargs(value: Track*): Self = StObject.set(x, "tracks", js.Array(value :_*))
  }
}
