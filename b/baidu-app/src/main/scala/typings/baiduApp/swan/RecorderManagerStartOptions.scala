package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecorderManagerStartOptions extends js.Object {
  /**
  		 * 指定录音的时长，单位 ms
  		 * 如果传入了合法的 duration
  		 * 在到达指定的 duration 后会自动停止录音，最大值 600000（10 分钟）,默认值 60000（1 分钟）
  		 */
  var duration: js.UndefOr[Double] = js.undefined
  /**
  		 * 编码码率
  		 * 采样率和码率有一定要求，具体有效值如下：
  		 * 采样率 编码码率
  		 * + 8000 16000 ~ 48000
  		 * + 11025 16000 ~ 48000
  		 * + 12000 24000 ~ 64000
  		 * + 16000 24000 ~ 96000
  		 * + 22050 32000 ~ 128000
  		 * + 24000 32000 ~ 128000
  		 * + 32000 48000 ~ 192000
  		 * + 44100 64000 ~ 320000
  		 * + 48000 64000 ~ 320000
  		 */
  var encodeBitRate: Double
  /** 音频格式，有效值 aac/mp3 */
  var format: String
  /**
  		 * 否 录音通道数，有效值 1/2
  		 */
  var numberOfChannels: js.UndefOr[Double] = js.undefined
  /**
  		 * 采样率，有效值 8000/16000/44100
  		 */
  var sampleRate: js.UndefOr[Double] = js.undefined
}

object RecorderManagerStartOptions {
  @scala.inline
  def apply(
    encodeBitRate: Double,
    format: String,
    duration: Int | Double = null,
    numberOfChannels: Int | Double = null,
    sampleRate: Int | Double = null
  ): RecorderManagerStartOptions = {
    val __obj = js.Dynamic.literal(encodeBitRate = encodeBitRate.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (numberOfChannels != null) __obj.updateDynamic("numberOfChannels")(numberOfChannels.asInstanceOf[js.Any])
    if (sampleRate != null) __obj.updateDynamic("sampleRate")(sampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecorderManagerStartOptions]
  }
}

