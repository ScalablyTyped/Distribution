package typings.chromecastCafSender.cast.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemotePlayerController extends js.Object {
  def addEventListener(
    `type`: RemotePlayerEventType,
    handler: js.Function1[/* event */ RemotePlayerChangedEvent[_], Unit]
  ): Unit
  def getFormattedTime(timeInSec: Double): String
  def getSeekPosition(currentTime: Double, duration: Double): Double
  def getSeekTime(currentPosition: Double, duration: Double): Double
  def muteOrUnmute(): Unit
  def playOrPause(): Unit
  def removeEventListener(
    `type`: RemotePlayerEventType,
    handler: js.Function1[/* event */ RemotePlayerChangedEvent[_], Unit]
  ): Unit
  def seek(): Unit
  def setVolumeLevel(): Unit
  def stop(): Unit
}

object RemotePlayerController {
  @scala.inline
  def apply(
    addEventListener: (RemotePlayerEventType, js.Function1[/* event */ RemotePlayerChangedEvent[_], Unit]) => Unit,
    getFormattedTime: Double => String,
    getSeekPosition: (Double, Double) => Double,
    getSeekTime: (Double, Double) => Double,
    muteOrUnmute: () => Unit,
    playOrPause: () => Unit,
    removeEventListener: (RemotePlayerEventType, js.Function1[/* event */ RemotePlayerChangedEvent[_], Unit]) => Unit,
    seek: () => Unit,
    setVolumeLevel: () => Unit,
    stop: () => Unit
  ): RemotePlayerController = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), getFormattedTime = js.Any.fromFunction1(getFormattedTime), getSeekPosition = js.Any.fromFunction2(getSeekPosition), getSeekTime = js.Any.fromFunction2(getSeekTime), muteOrUnmute = js.Any.fromFunction0(muteOrUnmute), playOrPause = js.Any.fromFunction0(playOrPause), removeEventListener = js.Any.fromFunction2(removeEventListener), seek = js.Any.fromFunction0(seek), setVolumeLevel = js.Any.fromFunction0(setVolumeLevel), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[RemotePlayerController]
  }
}

