package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LivePlayerContext extends js.Object {
  /** 退出全屏 */
  def exitFullScreen(options: BaseOptions[_, _]): Unit
  /** 静音 */
  def mute(options: BaseOptions[_, _]): Unit
  /** 暂停 */
  def pause(options: BaseOptions[_, _]): Unit
  /** 播放 */
  def play(options: BaseOptions[_, _]): Unit
  /** 进入全屏 */
  def requestFullScreen(options: RequestFullScreenOptions): Unit
  /** 回复 */
  def resume(options: BaseOptions[_, _]): Unit
  /** 停止 */
  def stop(options: BaseOptions[_, _]): Unit
}

object LivePlayerContext {
  @scala.inline
  def apply(
    exitFullScreen: BaseOptions[_, _] => Unit,
    mute: BaseOptions[_, _] => Unit,
    pause: BaseOptions[_, _] => Unit,
    play: BaseOptions[_, _] => Unit,
    requestFullScreen: RequestFullScreenOptions => Unit,
    resume: BaseOptions[_, _] => Unit,
    stop: BaseOptions[_, _] => Unit
  ): LivePlayerContext = {
    val __obj = js.Dynamic.literal(exitFullScreen = js.Any.fromFunction1(exitFullScreen), mute = js.Any.fromFunction1(mute), pause = js.Any.fromFunction1(pause), play = js.Any.fromFunction1(play), requestFullScreen = js.Any.fromFunction1(requestFullScreen), resume = js.Any.fromFunction1(resume), stop = js.Any.fromFunction1(stop))
    __obj.asInstanceOf[LivePlayerContext]
  }
}

