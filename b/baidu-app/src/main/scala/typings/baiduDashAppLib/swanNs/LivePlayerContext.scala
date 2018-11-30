package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LivePlayerContext extends js.Object {
  /** 退出全屏 */
  def exitFullScreen(options: BaseOptions[_, _]): scala.Unit
  /** 静音 */
  def mute(options: BaseOptions[_, _]): scala.Unit
  /** 暂停 */
  def pause(options: BaseOptions[_, _]): scala.Unit
  /** 播放 */
  def play(options: BaseOptions[_, _]): scala.Unit
  /** 进入全屏 */
  def requestFullScreen(options: RequestFullScreenOptions): scala.Unit
  /** 回复 */
  def resume(options: BaseOptions[_, _]): scala.Unit
  /** 停止 */
  def stop(options: BaseOptions[_, _]): scala.Unit
}

