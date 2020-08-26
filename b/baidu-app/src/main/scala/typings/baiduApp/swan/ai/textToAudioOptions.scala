package typings.baiduApp.swan.ai

import typings.baiduApp.swan.BaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 将文本转换为可以播放的mp3文件。
  */
@js.native
trait textToAudioOptions
  extends BaseOptions[js.Any, js.Any] {
   // 合成的文本，使用UTF-8编码，小于512个中文字或者英文数字（文本在百度服务器内转换为GBK后，长度必须小于1024字节）。
  var ctp: js.UndefOr[String | Double] = js.native
   // 客户端类型选择，Web端填写固定值1。
  var lan: js.UndefOr[String] = js.native
   // 音量，取值0-9，默认为5中音量。
  var per: js.UndefOr[String] = js.native
   // 语速，取值0-9，默认为5中语速。
  var pit: js.UndefOr[String] = js.native
   // 固定值zh。语言选择,目前只有中英文混合模式，填写固定值zh。
  var spd: js.UndefOr[String] = js.native
   // 发音人选择, 0为普通女声，1为普通男生，3为情感合成-度逍遥，4为情感合成-度丫丫，默认为普通女声。
  @JSName("success")
  var success_textToAudioOptions: js.UndefOr[js.Function1[/* res */ textToAudioResponse, Unit]] = js.native
  var tex: String = js.native
   // 音调，取值0-9，默认为5中语调。
  var vol: js.UndefOr[String] = js.native
}

object textToAudioOptions {
  @scala.inline
  def apply(tex: String): textToAudioOptions = {
    val __obj = js.Dynamic.literal(tex = tex.asInstanceOf[js.Any])
    __obj.asInstanceOf[textToAudioOptions]
  }
  @scala.inline
  implicit class textToAudioOptionsOps[Self <: textToAudioOptions] (val x: Self) extends AnyVal {
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
    def setTex(value: String): Self = this.set("tex", value.asInstanceOf[js.Any])
    @scala.inline
    def setCtp(value: String | Double): Self = this.set("ctp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCtp: Self = this.set("ctp", js.undefined)
    @scala.inline
    def setLan(value: String): Self = this.set("lan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLan: Self = this.set("lan", js.undefined)
    @scala.inline
    def setPer(value: String): Self = this.set("per", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePer: Self = this.set("per", js.undefined)
    @scala.inline
    def setPit(value: String): Self = this.set("pit", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePit: Self = this.set("pit", js.undefined)
    @scala.inline
    def setSpd(value: String): Self = this.set("spd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpd: Self = this.set("spd", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ textToAudioResponse => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setVol(value: String): Self = this.set("vol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVol: Self = this.set("vol", js.undefined)
  }
  
}

