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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("editTracksInfo")(editTracksInfo)
    __obj.updateDynamic("getStatus")(getStatus)
    __obj.updateDynamic("load")(load)
    __obj.updateDynamic("pause")(pause)
    __obj.updateDynamic("play")(play)
    __obj.updateDynamic("queueInsert")(queueInsert)
    __obj.updateDynamic("queueLoad")(queueLoad)
    __obj.updateDynamic("queueRemove")(queueRemove)
    __obj.updateDynamic("queueReorder")(queueReorder)
    __obj.updateDynamic("queueUpdate")(queueUpdate)
    __obj.updateDynamic("seek")(seek)
    __obj.updateDynamic("setVolume")(setVolume)
    __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[Anon_EditTracksInfo]
  }
}

