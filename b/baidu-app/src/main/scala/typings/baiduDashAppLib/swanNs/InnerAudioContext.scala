package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InnerAudioContext extends js.Object {
  /** 是否自动开始播放，默认 false */
  var autoplay: js.UndefOr[scala.Boolean] = js.undefined
  /** 当前音频的播放位置（单位：s），只有在当前有合法的 src 时返回，时间不取整，保留小数点后 6  */
  val currentTime: scala.Double
  /** 当前音频的长度（单位：s），只有在当前有合法的 src 时返 */
  val duration: scala.Double
  /** 是否循环播放，默认 false */
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  /** 是否遵循系统静音开关，当此参数为 false 时，即使用户打开了静音开关，也能继续发出声音，默认值 true */
  var obeyMuteSwitch: js.UndefOr[scala.Boolean] = js.undefined
  /** 当前是是否暂停或停止状态，true 表示暂停或停止，false 表示正在播 */
  val paused: scala.Boolean
  /** 音频的数据链接，用于直接播放。 */
  var src: js.UndefOr[java.lang.String] = js.undefined
  /** 开始播放的位置（单位：s），默认 0 */
  var startTime: js.UndefOr[scala.Double] = js.undefined
  /** 音量，范围 0~1。 */
  var volume: js.UndefOr[scala.Double] = js.undefined
  /** 销毁当前实例 */
  def destroy(): scala.Unit
  /** 取消监听 onCanplay 事件 */
  def offCanplay(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 取消监听 onEnded 事件 */
  def offEnded(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 取消监听 onError 事件 */
  def offError(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 取消监听 offPause 事件 */
  def offPause(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 取消监听 onPlay 事件 */
  def offPlay(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 取消监听 onSeeked  事件 */
  def offSeeked(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 取消监听 onSeeking  事件 */
  def offSeeking(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 取消监听 onStop 事件 */
  def offStop(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 取消监听 onTimeUpdate 事件 */
  def offTimeUpdate(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 取消监听 onWaiting 事件 */
  def offWaiting(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 音频进入可以播放状态，但不保证后面可以流畅播放 */
  def onCanplay(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 音频自然播放结束事件 */
  def onEnded(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 音频播放错误事件 */
  def onError(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 音频暂停事件 */
  def onPause(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 音频播放事件 */
  def onPlay(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 音频完成 seek 操作事件 */
  def onSeeked(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 音频进行 seek 操作事件 */
  def onSeeking(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 音频停止事件 */
  def onStop(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 音频播放进度更新事件 */
  def onTimeUpdate(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 音频加载中事件，当音频因为数据不足，需要停下来加载时会触发 */
  def onWaiting(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 暂停 */
  def pause(): scala.Unit
  /** 播放 */
  def play(): scala.Unit
  /** 跳转到指定位置，单位 s */
  def seek(options: baiduDashAppLib.Anon_Position): scala.Unit
  /** 停止 */
  def stop(): scala.Unit
}

object InnerAudioContext {
  @scala.inline
  def apply(
    currentTime: scala.Double,
    destroy: js.Function0[scala.Unit],
    duration: scala.Double,
    offCanplay: js.Function1[js.Function1[/* res */ ErrCodeResponse, scala.Unit], scala.Unit],
    offEnded: js.Function1[js.Function1[/* res */ ErrCodeResponse, scala.Unit], scala.Unit],
    offError: js.Function1[js.Function1[/* res */ ErrCodeResponse, scala.Unit], scala.Unit],
    offPause: js.Function1[js.Function1[/* res */ ErrCodeResponse, scala.Unit], scala.Unit],
    offPlay: js.Function1[js.Function1[/* res */ ErrCodeResponse, scala.Unit], scala.Unit],
    offSeeked: js.Function1[js.Function1[/* res */ ErrCodeResponse, scala.Unit], scala.Unit],
    offSeeking: js.Function1[js.Function1[/* res */ ErrCodeResponse, scala.Unit], scala.Unit],
    offStop: js.Function1[js.Function1[/* res */ ErrCodeResponse, scala.Unit], scala.Unit],
    offTimeUpdate: js.Function1[js.Function1[/* res */ ErrCodeResponse, scala.Unit], scala.Unit],
    offWaiting: js.Function1[js.Function1[/* res */ ErrCodeResponse, scala.Unit], scala.Unit],
    onCanplay: js.Function1[js.Function1[/* res */ ErrCodeResponse, scala.Unit], scala.Unit],
    onEnded: js.Function1[js.Function1[/* res */ ErrCodeResponse, scala.Unit], scala.Unit],
    onError: js.Function1[js.Function1[/* res */ ErrCodeResponse, scala.Unit], scala.Unit],
    onPause: js.Function1[js.Function1[/* res */ ErrCodeResponse, scala.Unit], scala.Unit],
    onPlay: js.Function1[js.Function1[/* res */ ErrCodeResponse, scala.Unit], scala.Unit],
    onSeeked: js.Function1[js.Function1[/* res */ ErrCodeResponse, scala.Unit], scala.Unit],
    onSeeking: js.Function1[js.Function1[/* res */ ErrCodeResponse, scala.Unit], scala.Unit],
    onStop: js.Function1[js.Function1[/* res */ ErrCodeResponse, scala.Unit], scala.Unit],
    onTimeUpdate: js.Function1[js.Function1[/* res */ ErrCodeResponse, scala.Unit], scala.Unit],
    onWaiting: js.Function1[js.Function1[/* res */ ErrCodeResponse, scala.Unit], scala.Unit],
    pause: js.Function0[scala.Unit],
    paused: scala.Boolean,
    play: js.Function0[scala.Unit],
    seek: js.Function1[baiduDashAppLib.Anon_Position, scala.Unit],
    stop: js.Function0[scala.Unit],
    autoplay: js.UndefOr[scala.Boolean] = js.undefined,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    obeyMuteSwitch: js.UndefOr[scala.Boolean] = js.undefined,
    src: java.lang.String = null,
    startTime: scala.Int | scala.Double = null,
    volume: scala.Int | scala.Double = null
  ): InnerAudioContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("currentTime")(currentTime)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("offCanplay")(offCanplay)
    __obj.updateDynamic("offEnded")(offEnded)
    __obj.updateDynamic("offError")(offError)
    __obj.updateDynamic("offPause")(offPause)
    __obj.updateDynamic("offPlay")(offPlay)
    __obj.updateDynamic("offSeeked")(offSeeked)
    __obj.updateDynamic("offSeeking")(offSeeking)
    __obj.updateDynamic("offStop")(offStop)
    __obj.updateDynamic("offTimeUpdate")(offTimeUpdate)
    __obj.updateDynamic("offWaiting")(offWaiting)
    __obj.updateDynamic("onCanplay")(onCanplay)
    __obj.updateDynamic("onEnded")(onEnded)
    __obj.updateDynamic("onError")(onError)
    __obj.updateDynamic("onPause")(onPause)
    __obj.updateDynamic("onPlay")(onPlay)
    __obj.updateDynamic("onSeeked")(onSeeked)
    __obj.updateDynamic("onSeeking")(onSeeking)
    __obj.updateDynamic("onStop")(onStop)
    __obj.updateDynamic("onTimeUpdate")(onTimeUpdate)
    __obj.updateDynamic("onWaiting")(onWaiting)
    __obj.updateDynamic("pause")(pause)
    __obj.updateDynamic("paused")(paused)
    __obj.updateDynamic("play")(play)
    __obj.updateDynamic("seek")(seek)
    __obj.updateDynamic("stop")(stop)
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay)
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (!js.isUndefined(obeyMuteSwitch)) __obj.updateDynamic("obeyMuteSwitch")(obeyMuteSwitch)
    if (src != null) __obj.updateDynamic("src")(src)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[InnerAudioContext]
  }
}

