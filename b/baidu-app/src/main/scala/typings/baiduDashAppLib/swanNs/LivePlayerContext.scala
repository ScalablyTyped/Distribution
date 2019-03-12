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

object LivePlayerContext {
  @scala.inline
  def apply(
    exitFullScreen: BaseOptions[_, _] => scala.Unit,
    mute: BaseOptions[_, _] => scala.Unit,
    pause: BaseOptions[_, _] => scala.Unit,
    play: BaseOptions[_, _] => scala.Unit,
    requestFullScreen: RequestFullScreenOptions => scala.Unit,
    resume: BaseOptions[_, _] => scala.Unit,
    stop: BaseOptions[_, _] => scala.Unit
  ): LivePlayerContext = {
    val __obj = js.Dynamic.literal(exitFullScreen = js.Any.fromFunction1(exitFullScreen), mute = js.Any.fromFunction1(mute), pause = js.Any.fromFunction1(pause), play = js.Any.fromFunction1(play), requestFullScreen = js.Any.fromFunction1(requestFullScreen), resume = js.Any.fromFunction1(resume), stop = js.Any.fromFunction1(stop))
  
    __obj.asInstanceOf[LivePlayerContext]
  }
}

