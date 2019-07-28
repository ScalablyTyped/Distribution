package typings.baiduDashApp.swanNs.aiNs

import typings.baiduDashApp.swanNs.DataResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoiceRecognizerTask extends js.Object {
   // 停止;
  def cancel(): Unit
    // 识别完成;
  def onError(callback: js.Function1[/* res */ VoiceErrorResponse, Unit]): Unit
    // ;有识别结果返回
  def onFinish(callback: js.Function1[/* res */ DataResponse, Unit]): Unit
    // 引擎准备就绪，可以开始说话;
  def onRecognize(callback: js.Function1[/* res */ VoiceRecognizeResponse, Unit]): Unit
   // 取消;
  def onStart(callback: js.Function0[Unit]): Unit
  def start(options: VoiceRecognizerStart): Unit
   // 开始;
  def stop(): Unit
}

object VoiceRecognizerTask {
  @scala.inline
  def apply(
    cancel: () => Unit,
    onError: js.Function1[/* res */ VoiceErrorResponse, Unit] => Unit,
    onFinish: js.Function1[/* res */ DataResponse, Unit] => Unit,
    onRecognize: js.Function1[/* res */ VoiceRecognizeResponse, Unit] => Unit,
    onStart: js.Function0[Unit] => Unit,
    start: VoiceRecognizerStart => Unit,
    stop: () => Unit
  ): VoiceRecognizerTask = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), onError = js.Any.fromFunction1(onError), onFinish = js.Any.fromFunction1(onFinish), onRecognize = js.Any.fromFunction1(onRecognize), onStart = js.Any.fromFunction1(onStart), start = js.Any.fromFunction1(start), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[VoiceRecognizerTask]
  }
}

