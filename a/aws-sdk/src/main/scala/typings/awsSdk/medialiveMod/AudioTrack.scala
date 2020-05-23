package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioTrack extends js.Object {
  /**
    * 1-based integer value that maps to a specific audio track
    */
  var Track: integerMin1 = js.native
}

object AudioTrack {
  @scala.inline
  def apply(Track: integerMin1): AudioTrack = {
    val __obj = js.Dynamic.literal(Track = Track.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioTrack]
  }
}

