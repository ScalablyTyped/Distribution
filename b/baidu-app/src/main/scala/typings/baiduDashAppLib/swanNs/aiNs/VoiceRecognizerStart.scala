package typings
package baiduDashAppLib.swanNs.aiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * 获取全局唯一的语音识别器voiceRecognizer。
		 */
trait VoiceRecognizerStart extends js.Object {
   // 是否开启长语音
  var context: js.UndefOr[java.lang.String] = js.undefined
   // 听音模式，有效值dnn/touch
  var longSpeech: js.UndefOr[scala.Boolean] = js.undefined
  var mode: js.UndefOr[java.lang.String] = js.undefined
}

