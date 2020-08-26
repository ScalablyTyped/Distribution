package typings.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoftimeout extends js.Object {
  var editTracksInfo: Double = js.native
  var getStatus: Double = js.native
  var load: Double = js.native
  var pause: Double = js.native
  var play: Double = js.native
  var queueInsert: Double = js.native
  var queueLoad: Double = js.native
  var queueRemove: Double = js.native
  var queueReorder: Double = js.native
  var queueUpdate: Double = js.native
  var seek: Double = js.native
  var setVolume: Double = js.native
  var stop: Double = js.native
}

object Typeoftimeout {
  @scala.inline
  def apply(
    editTracksInfo: Double,
    getStatus: Double,
    load: Double,
    pause: Double,
    play: Double,
    queueInsert: Double,
    queueLoad: Double,
    queueRemove: Double,
    queueReorder: Double,
    queueUpdate: Double,
    seek: Double,
    setVolume: Double,
    stop: Double
  ): Typeoftimeout = {
    val __obj = js.Dynamic.literal(editTracksInfo = editTracksInfo.asInstanceOf[js.Any], getStatus = getStatus.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], queueInsert = queueInsert.asInstanceOf[js.Any], queueLoad = queueLoad.asInstanceOf[js.Any], queueRemove = queueRemove.asInstanceOf[js.Any], queueReorder = queueReorder.asInstanceOf[js.Any], queueUpdate = queueUpdate.asInstanceOf[js.Any], seek = seek.asInstanceOf[js.Any], setVolume = setVolume.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeoftimeout]
  }
  @scala.inline
  implicit class TypeoftimeoutOps[Self <: Typeoftimeout] (val x: Self) extends AnyVal {
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
    def setEditTracksInfo(value: Double): Self = this.set("editTracksInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetStatus(value: Double): Self = this.set("getStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoad(value: Double): Self = this.set("load", value.asInstanceOf[js.Any])
    @scala.inline
    def setPause(value: Double): Self = this.set("pause", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlay(value: Double): Self = this.set("play", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueueInsert(value: Double): Self = this.set("queueInsert", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueueLoad(value: Double): Self = this.set("queueLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueueRemove(value: Double): Self = this.set("queueRemove", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueueReorder(value: Double): Self = this.set("queueReorder", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueueUpdate(value: Double): Self = this.set("queueUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeek(value: Double): Self = this.set("seek", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetVolume(value: Double): Self = this.set("setVolume", value.asInstanceOf[js.Any])
    @scala.inline
    def setStop(value: Double): Self = this.set("stop", value.asInstanceOf[js.Any])
  }
  
}

