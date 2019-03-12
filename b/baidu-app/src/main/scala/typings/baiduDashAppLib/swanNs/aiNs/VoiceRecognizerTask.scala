package typings
package baiduDashAppLib.swanNs.aiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoiceRecognizerTask extends js.Object {
   // 停止;
  def cancel(): scala.Unit
    // 识别完成;
  def onError(callback: js.Function1[/* res */ VoiceErrorResponse, scala.Unit]): scala.Unit
    // ;有识别结果返回
  def onFinish(callback: js.Function1[/* res */ baiduDashAppLib.swanNs.DataResponse, scala.Unit]): scala.Unit
    // 引擎准备就绪，可以开始说话;
  def onRecognize(callback: js.Function1[/* res */ VoiceRecognizeResponse, scala.Unit]): scala.Unit
   // 取消;
  def onStart(callback: js.Function0[scala.Unit]): scala.Unit
  def start(options: VoiceRecognizerStart): scala.Unit
   // 开始;
  def stop(): scala.Unit
}

object VoiceRecognizerTask {
  @scala.inline
  def apply(
    cancel: () => scala.Unit,
    onError: js.Function1[/* res */ VoiceErrorResponse, scala.Unit] => scala.Unit,
    onFinish: js.Function1[/* res */ baiduDashAppLib.swanNs.DataResponse, scala.Unit] => scala.Unit,
    onRecognize: js.Function1[/* res */ VoiceRecognizeResponse, scala.Unit] => scala.Unit,
    onStart: js.Function0[scala.Unit] => scala.Unit,
    start: VoiceRecognizerStart => scala.Unit,
    stop: () => scala.Unit
  ): VoiceRecognizerTask = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), onError = js.Any.fromFunction1(onError), onFinish = js.Any.fromFunction1(onFinish), onRecognize = js.Any.fromFunction1(onRecognize), onStart = js.Any.fromFunction1(onStart), start = js.Any.fromFunction1(start), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[VoiceRecognizerTask]
  }
}

