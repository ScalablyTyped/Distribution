package typings
package chromecastDashCafDashSenderLib.castNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("cast.framework.RemotePlayerController")
@js.native
class RemotePlayerController protected () extends js.Object {
  def this(player: RemotePlayer) = this()
  def addEventListener(
    `type`: RemotePlayerEventType,
    handler: js.Function1[/* event */ RemotePlayerChangedEvent[_], scala.Unit]
  ): scala.Unit = js.native
  def getFormattedTime(timeInSec: scala.Double): java.lang.String = js.native
  def getSeekPosition(currentTime: scala.Double, duration: scala.Double): scala.Double = js.native
  def getSeekTime(currentPosition: scala.Double, duration: scala.Double): scala.Double = js.native
  def muteOrUnmute(): scala.Unit = js.native
  def playOrPause(): scala.Unit = js.native
  def removeEventListener(
    `type`: RemotePlayerEventType,
    handler: js.Function1[/* event */ RemotePlayerChangedEvent[_], scala.Unit]
  ): scala.Unit = js.native
  def seek(): scala.Unit = js.native
  def setVolumeLevel(): scala.Unit = js.native
  def stop(): scala.Unit = js.native
}

