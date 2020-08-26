package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioTrackSelection extends js.Object {
  /**
    * Selects one or more unique audio tracks from within an mp4 source.
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
  implicit class AudioTrackSelectionOps[Self <: AudioTrackSelection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTracksVarargs(value: AudioTrack*): Self = this.set("Tracks", js.Array(value :_*))
    @scala.inline
    def setTracks(value: listOfAudioTrack): Self = this.set("Tracks", value.asInstanceOf[js.Any])
  }
  
}

