package typings.baiduApp.swan

import typings.baiduApp.anon.Color
import typings.baiduApp.baiduAppDoubles.`0.5`
import typings.baiduApp.baiduAppDoubles.`0.8`
import typings.baiduApp.baiduAppDoubles.`1.0`
import typings.baiduApp.baiduAppDoubles.`1.25`
import typings.baiduApp.baiduAppDoubles.`1.5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 媒体-----视频组件控制
trait VideoContext extends StObject {
  
  // 进入全屏;
  /**
    * 退出全屏
    */
  def exitFullScreen(): Unit
  
  // 显示状态栏，仅在iOS全屏下有效;
  /**
    * 隐藏状态栏，仅在iOS全屏下有效
    */
  def hideStatusBar(): Unit
  
  /**
    * 暂停
    */
  def pause(): Unit
  
  /**
    * 播放
    */
  def play(): Unit
  
  /**
    *  设置倍速播放，支持的倍率有 0.5/0.8/1.0/1.25/1.5
    */
  def playbackRate(rate: `0.5` | `0.8` | `1.0` | `1.25` | `1.5`): Unit
  
  /**
    *  进入全屏
    */
  def requestFullScreen(): Unit
  
  /**
    * 跳转到指定位置，单位 s
    */
  def seek(position: Double): Unit
  
  /**
    * 发送弹幕，danmu 包含两个属性 text, color。
    */
  def sendDanmu(danmu: Color): Unit
  
  // 退出全屏;
  /**
    * 显示状态栏，仅在iOS全屏下有效
    */
  def showStatusBar(): Unit
}
object VideoContext {
  
  inline def apply(
    exitFullScreen: () => Unit,
    hideStatusBar: () => Unit,
    pause: () => Unit,
    play: () => Unit,
    playbackRate: `0.5` | `0.8` | `1.0` | `1.25` | `1.5` => Unit,
    requestFullScreen: () => Unit,
    seek: Double => Unit,
    sendDanmu: Color => Unit,
    showStatusBar: () => Unit
  ): VideoContext = {
    val __obj = js.Dynamic.literal(exitFullScreen = js.Any.fromFunction0(exitFullScreen), hideStatusBar = js.Any.fromFunction0(hideStatusBar), pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), playbackRate = js.Any.fromFunction1(playbackRate), requestFullScreen = js.Any.fromFunction0(requestFullScreen), seek = js.Any.fromFunction1(seek), sendDanmu = js.Any.fromFunction1(sendDanmu), showStatusBar = js.Any.fromFunction0(showStatusBar))
    __obj.asInstanceOf[VideoContext]
  }
  
  extension [Self <: VideoContext](x: Self) {
    
    inline def setExitFullScreen(value: () => Unit): Self = StObject.set(x, "exitFullScreen", js.Any.fromFunction0(value))
    
    inline def setHideStatusBar(value: () => Unit): Self = StObject.set(x, "hideStatusBar", js.Any.fromFunction0(value))
    
    inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    inline def setPlay(value: () => Unit): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
    
    inline def setPlaybackRate(value: `0.5` | `0.8` | `1.0` | `1.25` | `1.5` => Unit): Self = StObject.set(x, "playbackRate", js.Any.fromFunction1(value))
    
    inline def setRequestFullScreen(value: () => Unit): Self = StObject.set(x, "requestFullScreen", js.Any.fromFunction0(value))
    
    inline def setSeek(value: Double => Unit): Self = StObject.set(x, "seek", js.Any.fromFunction1(value))
    
    inline def setSendDanmu(value: Color => Unit): Self = StObject.set(x, "sendDanmu", js.Any.fromFunction1(value))
    
    inline def setShowStatusBar(value: () => Unit): Self = StObject.set(x, "showStatusBar", js.Any.fromFunction0(value))
  }
}
