package typings.chromecastCafSender.cast.framework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemotePlayerController extends StObject {
  
  def addEventListener(
    `type`: RemotePlayerEventType,
    handler: js.Function1[/* event */ RemotePlayerChangedEvent[Any], Unit]
  ): Unit
  
  def getFormattedTime(timeInSec: Double): String
  
  def getSeekPosition(currentTime: Double, duration: Double): Double
  
  def getSeekTime(currentPosition: Double, duration: Double): Double
  
  def muteOrUnmute(): Unit
  
  def playOrPause(): Unit
  
  def removeEventListener(
    `type`: RemotePlayerEventType,
    handler: js.Function1[/* event */ RemotePlayerChangedEvent[Any], Unit]
  ): Unit
  
  def seek(): Unit
  
  def setVolumeLevel(): Unit
  
  def stop(): Unit
}
object RemotePlayerController {
  
  inline def apply(
    addEventListener: (RemotePlayerEventType, js.Function1[/* event */ RemotePlayerChangedEvent[Any], Unit]) => Unit,
    getFormattedTime: Double => String,
    getSeekPosition: (Double, Double) => Double,
    getSeekTime: (Double, Double) => Double,
    muteOrUnmute: () => Unit,
    playOrPause: () => Unit,
    removeEventListener: (RemotePlayerEventType, js.Function1[/* event */ RemotePlayerChangedEvent[Any], Unit]) => Unit,
    seek: () => Unit,
    setVolumeLevel: () => Unit,
    stop: () => Unit
  ): RemotePlayerController = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), getFormattedTime = js.Any.fromFunction1(getFormattedTime), getSeekPosition = js.Any.fromFunction2(getSeekPosition), getSeekTime = js.Any.fromFunction2(getSeekTime), muteOrUnmute = js.Any.fromFunction0(muteOrUnmute), playOrPause = js.Any.fromFunction0(playOrPause), removeEventListener = js.Any.fromFunction2(removeEventListener), seek = js.Any.fromFunction0(seek), setVolumeLevel = js.Any.fromFunction0(setVolumeLevel), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[RemotePlayerController]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemotePlayerController] (val x: Self) extends AnyVal {
    
    inline def setAddEventListener(
      value: (RemotePlayerEventType, js.Function1[/* event */ RemotePlayerChangedEvent[Any], Unit]) => Unit
    ): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
    
    inline def setGetFormattedTime(value: Double => String): Self = StObject.set(x, "getFormattedTime", js.Any.fromFunction1(value))
    
    inline def setGetSeekPosition(value: (Double, Double) => Double): Self = StObject.set(x, "getSeekPosition", js.Any.fromFunction2(value))
    
    inline def setGetSeekTime(value: (Double, Double) => Double): Self = StObject.set(x, "getSeekTime", js.Any.fromFunction2(value))
    
    inline def setMuteOrUnmute(value: () => Unit): Self = StObject.set(x, "muteOrUnmute", js.Any.fromFunction0(value))
    
    inline def setPlayOrPause(value: () => Unit): Self = StObject.set(x, "playOrPause", js.Any.fromFunction0(value))
    
    inline def setRemoveEventListener(
      value: (RemotePlayerEventType, js.Function1[/* event */ RemotePlayerChangedEvent[Any], Unit]) => Unit
    ): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
    
    inline def setSeek(value: () => Unit): Self = StObject.set(x, "seek", js.Any.fromFunction0(value))
    
    inline def setSetVolumeLevel(value: () => Unit): Self = StObject.set(x, "setVolumeLevel", js.Any.fromFunction0(value))
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
