package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecorderManager extends StObject {
  
  /** 录音错误事件, 会回调错误信息 */
  def onError(): Unit = js.native
  def onError(callback: js.Function1[/* err */ ErrMsgResponse, Unit]): Unit = js.native
  
  /** 已录制完指定帧大小的文件，会回调录音分片结果数据。如果设置了 frameSize ，则会回调此事件 */
  def onFrameRecorded(): Unit = js.native
  def onFrameRecorded(callback: js.Function1[/* options */ OnFrameRecordedOptions, Unit]): Unit = js.native
  
  /** 录音暂停事件 */
  def onPause(): Unit = js.native
  def onPause(callback: js.Function0[Unit]): Unit = js.native
  
  /** 录音恢复事件 */
  def onResume(): Unit = js.native
  def onResume(callback: js.Function0[Unit]): Unit = js.native
  
  /** 录音开始事件 */
  def onStart(): Unit = js.native
  def onStart(callback: js.Function0[Unit]): Unit = js.native
  
  /** 录音停止事件，会回调文件地址 */
  def onStop(): Unit = js.native
  def onStop(callback: js.Function1[/* options */ OnRecorderManagerStopOptions, Unit]): Unit = js.native
  
  /** 暂停录音 */
  def pause(): Unit = js.native
  
  /** 继续录音 */
  def resume(): Unit = js.native
  
  /** 开始录音 */
  def start(): Unit = js.native
  def start(options: RecorderManagerStartOptions): Unit = js.native
  
  /** 停止录音 */
  def stop(): Unit = js.native
}
