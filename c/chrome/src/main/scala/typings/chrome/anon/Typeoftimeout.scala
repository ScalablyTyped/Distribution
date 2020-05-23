package typings.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoftimeout extends js.Object {
  var editTracksInfo: Double
  var getStatus: Double
  var load: Double
  var pause: Double
  var play: Double
  var queueInsert: Double
  var queueLoad: Double
  var queueRemove: Double
  var queueReorder: Double
  var queueUpdate: Double
  var seek: Double
  var setVolume: Double
  var stop: Double
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
}

