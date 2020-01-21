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
  def apply(Lexicons: LexiconDescriptionList = null, NextToken: NextToken = null): ListLexiconsOutput = {
    val __obj = js.Dynamic.literal()
    if (Lexicons != null) __obj.updateDynamic("Lexicons")(Lexicons.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLexiconsOutput]
  }
}

