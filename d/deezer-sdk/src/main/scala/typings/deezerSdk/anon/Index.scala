package typings.deezerSdk.anon

import typings.deezerSdk.DeezerSdk.Track
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Index extends js.Object {
  var index: Double = js.native
  var track: Track = js.native
}

object Index {
  @scala.inline
  def apply(index: Double, track: Track): Index = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
  @scala.inline
  implicit class IndexOps[Self <: Index] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrack(value: Track): Self = this.set("track", value.asInstanceOf[js.Any])
  }
  
}

