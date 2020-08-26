package typings.baiduApp.swan.ai

import typings.baiduApp.swan.DataResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoiceRecognizerTask extends js.Object {
   // 停止;
  def cancel(): Unit = js.native
    // 识别完成;
  def onError(callback: js.Function1[/* res */ VoiceErrorResponse, Unit]): Unit = js.native
    // ;有识别结果返回
  def onFinish(callback: js.Function1[/* res */ DataResponse, Unit]): Unit = js.native
    // 引擎准备就绪，可以开始说话;
  def onRecognize(callback: js.Function1[/* res */ VoiceRecognizeResponse, Unit]): Unit = js.native
   // 取消;
  def onStart(callback: js.Function0[Unit]): Unit = js.native
  def start(options: VoiceRecognizerStart): Unit = js.native
   // 开始;
  def stop(): Unit = js.native
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
  @scala.inline
  implicit class VoiceRecognizerTaskOps[Self <: VoiceRecognizerTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    @scala.inline
    def setOnError(value: js.Function1[/* res */ VoiceErrorResponse, Unit] => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def setOnFinish(value: js.Function1[/* res */ DataResponse, Unit] => Unit): Self = this.set("onFinish", js.Any.fromFunction1(value))
    @scala.inline
    def setOnRecognize(value: js.Function1[/* res */ VoiceRecognizeResponse, Unit] => Unit): Self = this.set("onRecognize", js.Any.fromFunction1(value))
    @scala.inline
    def setOnStart(value: js.Function0[Unit] => Unit): Self = this.set("onStart", js.Any.fromFunction1(value))
    @scala.inline
    def setStart(value: VoiceRecognizerStart => Unit): Self = this.set("start", js.Any.fromFunction1(value))
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
  }
  
}

