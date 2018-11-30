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

