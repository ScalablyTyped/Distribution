package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class AudioTrackOps[Self <: AudioTrack] (val x: Self) extends AnyVal {
    
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
    def setTrack(value: integerMin1): Self = this.set("Track", value.asInstanceOf[js.Any])
  }
}
