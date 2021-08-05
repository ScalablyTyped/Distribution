package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 媒体-----音频组件控制
/**
  * audioContext 通过 audioId 跟一个 <audio/> 组件绑定，通过它可以操作对应的 <audio/> 组件。
  */
trait AudioContext extends StObject {
  
  /**
    * 暂停
    */
  def pause(): Unit
  
  /**
    * 播放
    */
  def play(): Unit
  
  /**
    * 跳转到指定位置，单位 s
    */
  def seek(position: Double): Unit
  
  /**
    * 音频的地址
    */
  def setSrc(src: String): Unit
}
object AudioContext {
  
  inline def apply(pause: () => Unit, play: () => Unit, seek: Double => Unit, setSrc: String => Unit): AudioContext = {
    val __obj = js.Dynamic.literal(pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), seek = js.Any.fromFunction1(seek), setSrc = js.Any.fromFunction1(setSrc))
    __obj.asInstanceOf[AudioContext]
  }
  
  extension [Self <: AudioContext](x: Self) {
    
    inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    inline def setPlay(value: () => Unit): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
    
    inline def setSeek(value: Double => Unit): Self = StObject.set(x, "seek", js.Any.fromFunction1(value))
    
    inline def setSetSrc(value: String => Unit): Self = StObject.set(x, "setSrc", js.Any.fromFunction1(value))
  }
}
