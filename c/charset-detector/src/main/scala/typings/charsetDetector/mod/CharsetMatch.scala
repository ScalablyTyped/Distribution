package typings.charsetDetector.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * charset detect match result
  */
@js.native
trait CharsetMatch extends js.Object {
  /**
    * name of charset
    * @example 'UTF-8'
    */
  var charsetName: String = js.native
  /**
    * confidence between 0 and 100
    */
  var confidence: Double = js.native
  /**
    * language of charset
    * @example 'zh'
    */
  var lang: js.UndefOr[String] = js.native
}

object CharsetMatch {
  @scala.inline
  def apply(charsetName: String, confidence: Double): CharsetMatch = {
    val __obj = js.Dynamic.literal(charsetName = charsetName.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharsetMatch]
  }
  @scala.inline
  implicit class CharsetMatchOps[Self <: CharsetMatch] (val x: Self) extends AnyVal {
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
    def setCharsetName(value: String): Self = this.set("charsetName", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
  }
  
}

