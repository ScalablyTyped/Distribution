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
  def apply(Index: js.UndefOr[Integer] = js.undefined, SyntaxTokens: ListOfSyntaxTokens = null): BatchDetectSyntaxItemResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Index)) __obj.updateDynamic("Index")(Index.get.asInstanceOf[js.Any])
    if (SyntaxTokens != null) __obj.updateDynamic("SyntaxTokens")(SyntaxTokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDetectSyntaxItemResult]
  }
}

