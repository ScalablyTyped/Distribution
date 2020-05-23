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
}

