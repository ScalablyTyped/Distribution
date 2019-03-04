package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EditTracksInfo extends js.Object {
  var editTracksInfo: scala.Double
  var getStatus: scala.Double
  var load: scala.Double
  var pause: scala.Double
  var play: scala.Double
  var queueInsert: scala.Double
  var queueLoad: scala.Double
  var queueRemove: scala.Double
  var queueReorder: scala.Double
  var queueUpdate: scala.Double
  var seek: scala.Double
  var setVolume: scala.Double
  var stop: scala.Double
}

object Anon_EditTracksInfo {
  @scala.inline
  def apply(
    editTracksInfo: scala.Double,
    getStatus: scala.Double,
    load: scala.Double,
    pause: scala.Double,
    play: scala.Double,
    queueInsert: scala.Double,
    queueLoad: scala.Double,
    queueRemove: scala.Double,
    queueReorder: scala.Double,
    queueUpdate: scala.Double,
    seek: scala.Double,
    setVolume: scala.Double,
    stop: scala.Double
  ): Anon_EditTracksInfo = {
    val __obj = js.Dynamic.literal(editTracksInfo = editTracksInfo, getStatus = getStatus, load = load, pause = pause, play = play, queueInsert = queueInsert, queueLoad = queueLoad, queueRemove = queueRemove, queueReorder = queueReorder, queueUpdate = queueUpdate, seek = seek, setVolume = setVolume, stop = stop)
  
    __obj.asInstanceOf[Anon_EditTracksInfo]
  }
}

