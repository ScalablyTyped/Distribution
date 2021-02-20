package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioTrackSelection extends StObject {
  
  /**
    * Selects one or more unique audio tracks from within a source.
    */
  var Tracks: listOfAudioTrack = js.native
}
object AudioTrackSelection {
  
  @scala.inline
  def apply(Tracks: listOfAudioTrack): AudioTrackSelection = {
    val __obj = js.Dynamic.literal(Tracks = Tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioTrackSelection]
  }
  
  @scala.inline
  implicit class AudioTrackSelectionMutableBuilder[Self <: AudioTrackSelection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTracks(value: listOfAudioTrack): Self = StObject.set(x, "Tracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracksVarargs(value: AudioTrack*): Self = StObject.set(x, "Tracks", js.Array(value :_*))
  }
}
