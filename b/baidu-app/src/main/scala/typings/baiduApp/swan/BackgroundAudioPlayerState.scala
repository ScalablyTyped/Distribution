package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 媒体-----音乐播放控制
@js.native
trait BackgroundAudioPlayerState extends StObject {
  
  /** 选定音频的播放位置（单位：s），只有在当前有音乐播放时返回 */
  var currentPosition: Double = js.native
  
  /** 歌曲数据链接，只有在当前有音乐播放时返回 */
  var dataUrl: String = js.native
  
  /** 音频的下载进度（整数，80 代表 80%），只有在当前有音乐播放时返回 */
  var downloadPercent: Double = js.native
  
  /** 选定音频的长度（单位：s），只有在当前有音乐播放时返回 */
  var duration: Double = js.native
  
  /** 播放状态（2：没有音乐在播放，1：播放中，0：暂停中） */
  var status: Double = js.native
}
object BackgroundAudioPlayerState {
  
  @scala.inline
  def apply(
    currentPosition: Double,
    dataUrl: String,
    downloadPercent: Double,
    duration: Double,
    status: Double
  ): BackgroundAudioPlayerState = {
    val __obj = js.Dynamic.literal(currentPosition = currentPosition.asInstanceOf[js.Any], dataUrl = dataUrl.asInstanceOf[js.Any], downloadPercent = downloadPercent.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundAudioPlayerState]
  }
  
  @scala.inline
  implicit class BackgroundAudioPlayerStateMutableBuilder[Self <: BackgroundAudioPlayerState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentPosition(value: Double): Self = StObject.set(x, "currentPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUrl(value: String): Self = StObject.set(x, "dataUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadPercent(value: Double): Self = StObject.set(x, "downloadPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
