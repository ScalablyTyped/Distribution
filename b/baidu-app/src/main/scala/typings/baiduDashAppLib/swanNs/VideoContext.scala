package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 媒体-----视频组件控制
@js.native
trait VideoContext extends js.Object {
   // 进入全屏;
  /**
  		 * 退出全屏
  		 */
  def exitFullScreen(): scala.Unit = js.native
   // 显示状态栏，仅在iOS全屏下有效;
  /**
  		 * 隐藏状态栏，仅在iOS全屏下有效
  		 */
  def hideStatusBar(): scala.Unit = js.native
  /**
  		 * 暂停
  		 */
  def pause(): scala.Unit = js.native
  /**
  		 * 播放
  		 */
  def play(): scala.Unit = js.native
  /**
  		 *  设置倍速播放，支持的倍率有 0.5/0.8/1.0/1.25/1.5
  		 */
  @JSName("playbackRate")
  def playbackRate_05(rate: baiduDashAppLib.baiduDashAppLibNumbers.`0DOT5`): scala.Unit = js.native
  @JSName("playbackRate")
  def playbackRate_08(rate: baiduDashAppLib.baiduDashAppLibNumbers.`0DOT8`): scala.Unit = js.native
  @JSName("playbackRate")
  def playbackRate_10(rate: baiduDashAppLib.baiduDashAppLibNumbers.`1DOT0`): scala.Unit = js.native
  @JSName("playbackRate")
  def playbackRate_125(rate: baiduDashAppLib.baiduDashAppLibNumbers.`1DOT25`): scala.Unit = js.native
  @JSName("playbackRate")
  def playbackRate_15(rate: baiduDashAppLib.baiduDashAppLibNumbers.`1DOT5`): scala.Unit = js.native
  /**
  		 *  进入全屏
  		 */
  def requestFullScreen(): scala.Unit = js.native
  /**
  		 * 跳转到指定位置，单位 s
  		 */
  def seek(position: scala.Double): scala.Unit = js.native
  /**
  		 * 发送弹幕，danmu 包含两个属性 text, color。
  		 */
  def sendDanmu(danmu: baiduDashAppLib.Anon_Color): scala.Unit = js.native
   // 退出全屏;
  /**
  		 * 显示状态栏，仅在iOS全屏下有效
  		 */
  def showStatusBar(): scala.Unit = js.native
}

