package typings.deezerSdk.DeezerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/player#options | Player options}
  */
@js.native
trait PlayerState extends js.Object {
  val muted: Boolean = js.native
  val repeat: Double = js.native
  val shuffle: Boolean = js.native
  val volume: Double = js.native
}

object PlayerState {
  @scala.inline
  def apply(muted: Boolean, repeat: Double, shuffle: Boolean, volume: Double): PlayerState = {
    val __obj = js.Dynamic.literal(muted = muted.asInstanceOf[js.Any], repeat = repeat.asInstanceOf[js.Any], shuffle = shuffle.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerState]
  }
  @scala.inline
  implicit class PlayerStateOps[Self <: PlayerState] (val x: Self) extends AnyVal {
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
    def setMuted(value: Boolean): Self = this.set("muted", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepeat(value: Double): Self = this.set("repeat", value.asInstanceOf[js.Any])
    @scala.inline
    def setShuffle(value: Boolean): Self = this.set("shuffle", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
  }
  
}

