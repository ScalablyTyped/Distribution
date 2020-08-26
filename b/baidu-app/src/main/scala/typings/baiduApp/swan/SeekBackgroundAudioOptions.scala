package typings.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeekBackgroundAudioOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 音乐位置，单位：秒 */
  var position: Double = js.native
}

object SeekBackgroundAudioOptions {
  @scala.inline
  def apply(position: Double): SeekBackgroundAudioOptions = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeekBackgroundAudioOptions]
  }
  @scala.inline
  implicit class SeekBackgroundAudioOptionsOps[Self <: SeekBackgroundAudioOptions] (val x: Self) extends AnyVal {
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
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
  }
  
}

