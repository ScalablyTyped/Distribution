package typings.chromecastCafSender.cast.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemotePlayerController extends js.Object {
  
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
  
  @scala.inline
  implicit class RemotePlayerControllerOps[Self <: RemotePlayerController] (val x: Self) extends AnyVal {
    
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
    def setAddEventListener(
      value: (RemotePlayerEventType, js.Function1[/* event */ RemotePlayerChangedEvent[_], Unit]) => Unit
    ): Self = this.set("addEventListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetFormattedTime(value: Double => String): Self = this.set("getFormattedTime", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSeekPosition(value: (Double, Double) => Double): Self = this.set("getSeekPosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetSeekTime(value: (Double, Double) => Double): Self = this.set("getSeekTime", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMuteOrUnmute(value: () => Unit): Self = this.set("muteOrUnmute", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlayOrPause(value: () => Unit): Self = this.set("playOrPause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveEventListener(
      value: (RemotePlayerEventType, js.Function1[/* event */ RemotePlayerChangedEvent[_], Unit]) => Unit
    ): Self = this.set("removeEventListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSeek(value: () => Unit): Self = this.set("seek", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetVolumeLevel(value: () => Unit): Self = this.set("setVolumeLevel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
  }
}
