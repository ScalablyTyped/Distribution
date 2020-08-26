package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 媒体-----音频播放控制
@js.native
trait PlayVoiceOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 需要播放的语音文件的文件路径 */
  var filePath: String = js.native
}

object PlayVoiceOptions {
  @scala.inline
  def apply(filePath: String): PlayVoiceOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayVoiceOptions]
  }
  @scala.inline
  implicit class PlayVoiceOptionsOps[Self <: PlayVoiceOptions] (val x: Self) extends AnyVal {
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
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
  }
  
}

