package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecorderManager extends js.Object {
  /** 录音错误事件, 会回调错误信息 */
  def onError(): scala.Unit = js.native
  def onError(callback: js.Function1[/* err */ ErrMsgResponse, scala.Unit]): scala.Unit = js.native
  /** 已录制完指定帧大小的文件，会回调录音分片结果数据。如果设置了 frameSize ，则会回调此事件 */
  def onFrameRecorded(): scala.Unit = js.native
  def onFrameRecorded(callback: js.Function1[/* options */ OnFrameRecordedOptions, scala.Unit]): scala.Unit = js.native
  /** 录音暂停事件 */
  def onPause(): scala.Unit = js.native
  def onPause(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /** 录音恢复事件 */
  def onResume(): scala.Unit = js.native
  def onResume(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /** 录音开始事件 */
  def onStart(): scala.Unit = js.native
  def onStart(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /** 录音停止事件，会回调文件地址 */
  def onStop(): scala.Unit = js.native
  def onStop(callback: js.Function1[/* options */ OnRecorderManagerStopOptions, scala.Unit]): scala.Unit = js.native
  /** 暂停录音 */
  def pause(): scala.Unit = js.native
  /** 继续录音 */
  def resume(): scala.Unit = js.native
  /** 开始录音 */
  def start(): scala.Unit = js.native
  def start(options: RecorderManagerStartOptions): scala.Unit = js.native
  /** 停止录音 */
  def stop(): scala.Unit = js.native
}

