package typings.awsSdk.pollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLexiconsOutput extends js.Object {
  /**
    * A list of lexicon names and attributes.
    */
  var Lexicons: js.UndefOr[LexiconDescriptionList] = js.native
  /**
    * The pagination token to use in the next request to continue the listing of lexicons. NextToken is returned only if the response is truncated.
    */
  var NextToken: js.UndefOr[typings.awsSdk.pollyMod.NextToken] = js.native
}

object ListLexiconsOutput {
  @scala.inline
  def apply(): ListLexiconsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLexiconsOutput]
  }
  @scala.inline
  implicit class ListLexiconsOutputOps[Self <: ListLexiconsOutput] (val x: Self) extends AnyVal {
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
    def setLexiconsVarargs(value: LexiconDescription*): Self = this.set("Lexicons", js.Array(value :_*))
    @scala.inline
    def setLexicons(value: LexiconDescriptionList): Self = this.set("Lexicons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLexicons: Self = this.set("Lexicons", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

