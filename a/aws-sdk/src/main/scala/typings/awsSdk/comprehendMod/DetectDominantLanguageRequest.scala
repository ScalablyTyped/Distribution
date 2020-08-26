package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectDominantLanguageRequest extends js.Object {
  /**
    * A UTF-8 text string. Each string should contain at least 20 characters and must contain fewer that 5,000 bytes of UTF-8 encoded characters.
    */
  var Text: CustomerInputString = js.native
}

object DetectDominantLanguageRequest {
  @scala.inline
  def apply(Text: CustomerInputString): DetectDominantLanguageRequest = {
    val __obj = js.Dynamic.literal(Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectDominantLanguageRequest]
  }
  @scala.inline
  implicit class DetectDominantLanguageRequestOps[Self <: DetectDominantLanguageRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setText(value: CustomerInputString): Self = this.set("Text", value.asInstanceOf[js.Any])
  }
  
}

