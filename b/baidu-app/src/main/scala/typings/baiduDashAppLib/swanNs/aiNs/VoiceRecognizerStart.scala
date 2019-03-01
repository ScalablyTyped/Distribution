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

object VoiceRecognizerStart {
  @scala.inline
  def apply(
    context: java.lang.String = null,
    longSpeech: js.UndefOr[scala.Boolean] = js.undefined,
    mode: java.lang.String = null
  ): VoiceRecognizerStart = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (!js.isUndefined(longSpeech)) __obj.updateDynamic("longSpeech")(longSpeech)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    __obj.asInstanceOf[VoiceRecognizerStart]
  }
}

