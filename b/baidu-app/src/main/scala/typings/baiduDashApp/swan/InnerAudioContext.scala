package typings.baiduDashApp.swan

import typings.baiduDashApp.Anon_Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InnerAudioContext extends js.Object {
  /** 是否自动开始播放，默认 false */
  var autoplay: js.UndefOr[Boolean] = js.undefined
  /** 当前音频的播放位置（单位：s），只有在当前有合法的 src 时返回，时间不取整，保留小数点后 6  */
  val currentTime: Double
  /** 当前音频的长度（单位：s），只有在当前有合法的 src 时返 */
  val duration: Double
  /** 是否循环播放，默认 false */
  var loop: js.UndefOr[Boolean] = js.undefined
  /** 是否遵循系统静音开关，当此参数为 false 时，即使用户打开了静音开关，也能继续发出声音，默认值 true */
  var obeyMuteSwitch: js.UndefOr[Boolean] = js.undefined
  /** 当前是是否暂停或停止状态，true 表示暂停或停止，false 表示正在播 */
  val paused: Boolean
  /** 音频的数据链接，用于直接播放。 */
  var src: js.UndefOr[String] = js.undefined
  /** 开始播放的位置（单位：s），默认 0 */
  var startTime: js.UndefOr[Double] = js.undefined
  /** 音量，范围 0~1。 */
  var volume: js.UndefOr[Double] = js.undefined
  /** 销毁当前实例 */
  def destroy(): Unit
  /** 取消监听 onCanplay 事件 */
  def offCanplay(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 取消监听 onEnded 事件 */
  def offEnded(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 取消监听 onError 事件 */
  def offError(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 取消监听 offPause 事件 */
  def offPause(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 取消监听 onPlay 事件 */
  def offPlay(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 取消监听 onSeeked  事件 */
  def offSeeked(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 取消监听 onSeeking  事件 */
  def offSeeking(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 取消监听 onStop 事件 */
  def offStop(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 取消监听 onTimeUpdate 事件 */
  def offTimeUpdate(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 取消监听 onWaiting 事件 */
  def offWaiting(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 音频进入可以播放状态，但不保证后面可以流畅播放 */
  def onCanplay(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 音频自然播放结束事件 */
  def onEnded(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 音频播放错误事件 */
  def onError(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 音频暂停事件 */
  def onPause(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 音频播放事件 */
  def onPlay(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 音频完成 seek 操作事件 */
  def onSeeked(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 音频进行 seek 操作事件 */
  def onSeeking(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 音频停止事件 */
  def onStop(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 音频播放进度更新事件 */
  def onTimeUpdate(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 音频加载中事件，当音频因为数据不足，需要停下来加载时会触发 */
  def onWaiting(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 暂停 */
  def pause(): Unit
  /** 播放 */
  def play(): Unit
  /** 跳转到指定位置，单位 s */
  def seek(options: Anon_Position): Unit
  /** 停止 */
  def stop(): Unit
}

object InnerAudioContext {
  @scala.inline
  def apply(
    currentTime: Double,
    destroy: () => Unit,
    duration: Double,
    offCanplay: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    offEnded: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    offError: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    offPause: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    offPlay: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    offSeeked: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    offSeeking: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    offStop: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    offTimeUpdate: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    offWaiting: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    onCanplay: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    onEnded: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    onError: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    onPause: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    onPlay: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    onSeeked: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    onSeeking: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    onStop: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    onTimeUpdate: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    onWaiting: js.Function1[/* res */ ErrCodeResponse, Unit] => Unit,
    pause: () => Unit,
    paused: Boolean,
    play: () => Unit,
    seek: Anon_Position => Unit,
    stop: () => Unit,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    obeyMuteSwitch: js.UndefOr[Boolean] = js.undefined,
    src: String = null,
    startTime: Int | Double = null,
    volume: Int | Double = null
  ): InnerAudioContext = {
    val __obj = js.Dynamic.literal(currentTime = currentTime, destroy = js.Any.fromFunction0(destroy), duration = duration, offCanplay = js.Any.fromFunction1(offCanplay), offEnded = js.Any.fromFunction1(offEnded), offError = js.Any.fromFunction1(offError), offPause = js.Any.fromFunction1(offPause), offPlay = js.Any.fromFunction1(offPlay), offSeeked = js.Any.fromFunction1(offSeeked), offSeeking = js.Any.fromFunction1(offSeeking), offStop = js.Any.fromFunction1(offStop), offTimeUpdate = js.Any.fromFunction1(offTimeUpdate), offWaiting = js.Any.fromFunction1(offWaiting), onCanplay = js.Any.fromFunction1(onCanplay), onEnded = js.Any.fromFunction1(onEnded), onError = js.Any.fromFunction1(onError), onPause = js.Any.fromFunction1(onPause), onPlay = js.Any.fromFunction1(onPlay), onSeeked = js.Any.fromFunction1(onSeeked), onSeeking = js.Any.fromFunction1(onSeeking), onStop = js.Any.fromFunction1(onStop), onTimeUpdate = js.Any.fromFunction1(onTimeUpdate), onWaiting = js.Any.fromFunction1(onWaiting), pause = js.Any.fromFunction0(pause), paused = paused, play = js.Any.fromFunction0(play), seek = js.Any.fromFunction1(seek), stop = js.Any.fromFunction0(stop))
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay)
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (!js.isUndefined(obeyMuteSwitch)) __obj.updateDynamic("obeyMuteSwitch")(obeyMuteSwitch)
    if (src != null) __obj.updateDynamic("src")(src)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[InnerAudioContext]
  }
}

