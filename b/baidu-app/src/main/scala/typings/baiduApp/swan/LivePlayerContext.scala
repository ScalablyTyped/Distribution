package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LivePlayerContext extends StObject {
  
  /** 退出全屏 */
  def exitFullScreen(options: BaseOptions[Any, Any]): Unit
  
  /** 静音 */
  def mute(options: BaseOptions[Any, Any]): Unit
  
  /** 暂停 */
  def pause(options: BaseOptions[Any, Any]): Unit
  
  /** 播放 */
  def play(options: BaseOptions[Any, Any]): Unit
  
  /** 进入全屏 */
  def requestFullScreen(options: RequestFullScreenOptions): Unit
  
  /** 回复 */
  def resume(options: BaseOptions[Any, Any]): Unit
  
  /** 停止 */
  def stop(options: BaseOptions[Any, Any]): Unit
}
object LivePlayerContext {
  
  inline def apply(
    exitFullScreen: BaseOptions[Any, Any] => Unit,
    mute: BaseOptions[Any, Any] => Unit,
    pause: BaseOptions[Any, Any] => Unit,
    play: BaseOptions[Any, Any] => Unit,
    requestFullScreen: RequestFullScreenOptions => Unit,
    resume: BaseOptions[Any, Any] => Unit,
    stop: BaseOptions[Any, Any] => Unit
  ): LivePlayerContext = {
    val __obj = js.Dynamic.literal(exitFullScreen = js.Any.fromFunction1(exitFullScreen), mute = js.Any.fromFunction1(mute), pause = js.Any.fromFunction1(pause), play = js.Any.fromFunction1(play), requestFullScreen = js.Any.fromFunction1(requestFullScreen), resume = js.Any.fromFunction1(resume), stop = js.Any.fromFunction1(stop))
    __obj.asInstanceOf[LivePlayerContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LivePlayerContext] (val x: Self) extends AnyVal {
    
    inline def setExitFullScreen(value: BaseOptions[Any, Any] => Unit): Self = StObject.set(x, "exitFullScreen", js.Any.fromFunction1(value))
    
    inline def setMute(value: BaseOptions[Any, Any] => Unit): Self = StObject.set(x, "mute", js.Any.fromFunction1(value))
    
    inline def setPause(value: BaseOptions[Any, Any] => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction1(value))
    
    inline def setPlay(value: BaseOptions[Any, Any] => Unit): Self = StObject.set(x, "play", js.Any.fromFunction1(value))
    
    inline def setRequestFullScreen(value: RequestFullScreenOptions => Unit): Self = StObject.set(x, "requestFullScreen", js.Any.fromFunction1(value))
    
    inline def setResume(value: BaseOptions[Any, Any] => Unit): Self = StObject.set(x, "resume", js.Any.fromFunction1(value))
    
    inline def setStop(value: BaseOptions[Any, Any] => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
  }
}
