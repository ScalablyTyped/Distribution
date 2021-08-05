package typings.baiduApp.swan.ai

import typings.baiduApp.swan.DataResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoiceRecognizerTask extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: VoiceRecognizerTask](x: Self) {
    
    inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    inline def setOnError(value: js.Function1[/* res */ VoiceErrorResponse, Unit] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnFinish(value: js.Function1[/* res */ DataResponse, Unit] => Unit): Self = StObject.set(x, "onFinish", js.Any.fromFunction1(value))
    
    inline def setOnRecognize(value: js.Function1[/* res */ VoiceRecognizeResponse, Unit] => Unit): Self = StObject.set(x, "onRecognize", js.Any.fromFunction1(value))
    
    inline def setOnStart(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
    
    inline def setStart(value: VoiceRecognizerStart => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
