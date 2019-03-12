package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundAudioManager extends js.Object {
  /** 音频缓冲的时间点，仅保证当前播放时间点到此时间点内容已缓冲。 是 */
  var buffered: scala.Double
  /** 封面图url，用于做原生音频播放器背景图。原生音频播放器中的分享功能，分享出去的卡片配图及背景也将使用该图。 */
  var coverImgUrl: js.UndefOr[java.lang.String] = js.undefined
  /** 当前音频的播放位置（单位：s），只有在当前有合法的 src 时返回 */
  val currentTime: scala.Double
  /** 当前音频的长度（单位：s），只有在当前有合法的 src 时返回 */
  val duration: scala.Double
  /** 专辑名，原生音频播放器中的分享功能，分享出去的卡片简介，也将使用该值 */
  var epname: js.UndefOr[java.lang.String] = js.undefined
  /** 当前是是否暂停或停止状态，true 表示暂停或停止，false 表示正在播放 */
  val paused: scala.Boolean
  /** 歌手名，原生音频播放器中的分享功能，分享出去的卡片简介，也将使用该值 */
  var singer: js.UndefOr[java.lang.String] = js.undefined
  /** 音频的数据源，默认为空字符串，当设置了新的 src 时，会自动开始播放 ，目前支持的格式有 m4a, aac, mp3, wav */
  var src: js.UndefOr[java.lang.String] = js.undefined
  /** 音频开始播放的位置（单位：s） */
  var startTime: js.UndefOr[scala.Double] = js.undefined
  /** 音频标题，用于做原生音频播放器音频标题。原生音频播放器中的分享功能，分享出去的卡片标题，也将使用该值。 */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** 背景音频进入可以播放状态，但不保证后面可以流畅播放 */
  def onCanplay(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 背景音频自然播放结束事件 */
  def onEnded(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 背景音频播放错误事件 */
  def onError(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 背景音频暂停事件 */
  def onPause(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 背景音频播放事件 */
  def onPlay(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 背景音频停止事件 */
  def onStop(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 背景音频播放进度更新事件 */
  def onTimeUpdate(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 音频加载中事件，当音频因为数据不足，需要停下来加载时会触发 */
  def onWaiting(callback: js.Function1[/* res */ ErrCodeResponse, scala.Unit]): scala.Unit
  /** 暂停 */
  def pause(): scala.Unit
  /** 播放 */
  def play(): scala.Unit
  /** 跳转到指定位置，单位 s */
  def seek(position: scala.Double): scala.Unit
  /** 停止 */
  def stop(): scala.Unit
}

object BackgroundAudioManager {
  @scala.inline
  def apply(
    buffered: scala.Double,
    currentTime: scala.Double,
    duration: scala.Double,
    onCanplay: js.Function1[/* res */ ErrCodeResponse, scala.Unit] => scala.Unit,
    onEnded: js.Function1[/* res */ ErrCodeResponse, scala.Unit] => scala.Unit,
    onError: js.Function1[/* res */ ErrCodeResponse, scala.Unit] => scala.Unit,
    onPause: js.Function1[/* res */ ErrCodeResponse, scala.Unit] => scala.Unit,
    onPlay: js.Function1[/* res */ ErrCodeResponse, scala.Unit] => scala.Unit,
    onStop: js.Function1[/* res */ ErrCodeResponse, scala.Unit] => scala.Unit,
    onTimeUpdate: js.Function1[/* res */ ErrCodeResponse, scala.Unit] => scala.Unit,
    onWaiting: js.Function1[/* res */ ErrCodeResponse, scala.Unit] => scala.Unit,
    pause: () => scala.Unit,
    paused: scala.Boolean,
    play: () => scala.Unit,
    seek: scala.Double => scala.Unit,
    stop: () => scala.Unit,
    coverImgUrl: java.lang.String = null,
    epname: java.lang.String = null,
    singer: java.lang.String = null,
    src: java.lang.String = null,
    startTime: scala.Int | scala.Double = null,
    title: java.lang.String = null
  ): BackgroundAudioManager = {
    val __obj = js.Dynamic.literal(buffered = buffered, currentTime = currentTime, duration = duration, onCanplay = js.Any.fromFunction1(onCanplay), onEnded = js.Any.fromFunction1(onEnded), onError = js.Any.fromFunction1(onError), onPause = js.Any.fromFunction1(onPause), onPlay = js.Any.fromFunction1(onPlay), onStop = js.Any.fromFunction1(onStop), onTimeUpdate = js.Any.fromFunction1(onTimeUpdate), onWaiting = js.Any.fromFunction1(onWaiting), pause = js.Any.fromFunction0(pause), paused = paused, play = js.Any.fromFunction0(play), seek = js.Any.fromFunction1(seek), stop = js.Any.fromFunction0(stop))
    if (coverImgUrl != null) __obj.updateDynamic("coverImgUrl")(coverImgUrl)
    if (epname != null) __obj.updateDynamic("epname")(epname)
    if (singer != null) __obj.updateDynamic("singer")(singer)
    if (src != null) __obj.updateDynamic("src")(src)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[BackgroundAudioManager]
  }
}

