package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDetectKeyPhrasesItemResult extends js.Object {
  /**
    * The zero-based index of the document in the input list.
    */
  var Index: js.UndefOr[Integer] = js.native
  /**
    * One or more KeyPhrase objects, one for each key phrase detected in the document.
    */
  var KeyPhrases: js.UndefOr[ListOfKeyPhrases] = js.native
}

object BatchDetectKeyPhrasesItemResult {
  @scala.inline
  def apply(): BatchDetectKeyPhrasesItemResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDetectKeyPhrasesItemResult]
  }
  @scala.inline
  implicit class BatchDetectKeyPhrasesItemResultOps[Self <: BatchDetectKeyPhrasesItemResult] (val x: Self) extends AnyVal {
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
    def setIndex(value: Integer): Self = this.set("Index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("Index", js.undefined)
    @scala.inline
    def setKeyPhrasesVarargs(value: KeyPhrase*): Self = this.set("KeyPhrases", js.Array(value :_*))
    @scala.inline
    def setKeyPhrases(value: ListOfKeyPhrases): Self = this.set("KeyPhrases", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyPhrases: Self = this.set("KeyPhrases", js.undefined)
  }
  
}

