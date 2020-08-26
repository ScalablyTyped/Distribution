package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DominantLanguage extends js.Object {
  /**
    * The RFC 5646 language code for the dominant language. For more information about RFC 5646, see Tags for Identifying Languages on the IETF Tools web site.
    */
  var LanguageCode: js.UndefOr[String] = js.native
  /**
    * The level of confidence that Amazon Comprehend has in the accuracy of the detection.
    */
  var Score: js.UndefOr[Float] = js.native
}

object DominantLanguage {
  @scala.inline
  def apply(): DominantLanguage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DominantLanguage]
  }
  @scala.inline
  implicit class DominantLanguageOps[Self <: DominantLanguage] (val x: Self) extends AnyVal {
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
    def setLanguageCode(value: String): Self = this.set("LanguageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageCode: Self = this.set("LanguageCode", js.undefined)
    @scala.inline
    def setScore(value: Float): Self = this.set("Score", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScore: Self = this.set("Score", js.undefined)
  }
  
}

