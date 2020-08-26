package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDetectDominantLanguageRequest extends js.Object {
  /**
    * A list containing the text of the input documents. The list can contain a maximum of 25 documents. Each document should contain at least 20 characters and must contain fewer than 5,000 bytes of UTF-8 encoded characters.
    */
  var TextList: CustomerInputStringList = js.native
}

object BatchDetectDominantLanguageRequest {
  @scala.inline
  def apply(TextList: CustomerInputStringList): BatchDetectDominantLanguageRequest = {
    val __obj = js.Dynamic.literal(TextList = TextList.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDetectDominantLanguageRequest]
  }
  @scala.inline
  implicit class BatchDetectDominantLanguageRequestOps[Self <: BatchDetectDominantLanguageRequest] (val x: Self) extends AnyVal {
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
    def setTextListVarargs(value: CustomerInputString*): Self = this.set("TextList", js.Array(value :_*))
    @scala.inline
    def setTextList(value: CustomerInputStringList): Self = this.set("TextList", value.asInstanceOf[js.Any])
  }
  
}

