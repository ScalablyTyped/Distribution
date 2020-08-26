package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDetectSyntaxItemResult extends js.Object {
  /**
    * The zero-based index of the document in the input list.
    */
  var Index: js.UndefOr[Integer] = js.native
  /**
    * The syntax tokens for the words in the document, one token for each word.
    */
  var SyntaxTokens: js.UndefOr[ListOfSyntaxTokens] = js.native
}

object BatchDetectSyntaxItemResult {
  @scala.inline
  def apply(): BatchDetectSyntaxItemResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDetectSyntaxItemResult]
  }
  @scala.inline
  implicit class BatchDetectSyntaxItemResultOps[Self <: BatchDetectSyntaxItemResult] (val x: Self) extends AnyVal {
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
    def setSyntaxTokensVarargs(value: SyntaxToken*): Self = this.set("SyntaxTokens", js.Array(value :_*))
    @scala.inline
    def setSyntaxTokens(value: ListOfSyntaxTokens): Self = this.set("SyntaxTokens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyntaxTokens: Self = this.set("SyntaxTokens", js.undefined)
  }
  
}

