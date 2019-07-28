package typings.chromecastDashCafDashSender.castNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("cast.framework.RemotePlayerController")
@js.native
class RemotePlayerController protected () extends js.Object {
  def this(player: RemotePlayer) = this()
  def addEventListener(
    `type`: RemotePlayerEventType,
    handler: js.Function1[/* event */ RemotePlayerChangedEvent[_], Unit]
  ): Unit = js.native
  def getFormattedTime(timeInSec: Double): String = js.native
  def getSeekPosition(currentTime: Double, duration: Double): Double = js.native
  def getSeekTime(currentPosition: Double, duration: Double): Double = js.native
  def muteOrUnmute(): Unit = js.native
  def playOrPause(): Unit = js.native
  def removeEventListener(
    `type`: RemotePlayerEventType,
    handler: js.Function1[/* event */ RemotePlayerChangedEvent[_], Unit]
  ): Unit = js.native
  def seek(): Unit = js.native
  def setVolumeLevel(): Unit = js.native
  def stop(): Unit = js.native
}

