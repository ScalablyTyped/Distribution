package typings.chrome

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
    val __obj = js.Dynamic.literal(editTracksInfo = editTracksInfo, getStatus = getStatus, load = load, pause = pause, play = play, queueInsert = queueInsert, queueLoad = queueLoad, queueRemove = queueRemove, queueReorder = queueReorder, queueUpdate = queueUpdate, seek = seek, setVolume = setVolume, stop = stop)
  
    __obj.asInstanceOf[Typeoftimeout]
  }
}

