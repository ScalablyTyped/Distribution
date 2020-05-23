package typings.awsSdk.cloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggestRequest extends js.Object {
  /**
    * Specifies the string for which you want to get suggestions.
    */
  var query: Query = js.native
  /**
    * Specifies the maximum number of suggestions to return. 
    */
  var size: js.UndefOr[SuggestionsSize] = js.native
  /**
    * Specifies the name of the suggester to use to find suggested matches.
    */
  var suggester: Suggester = js.native
}

object SuggestRequest {
  @scala.inline
  def apply(query: Query, suggester: Suggester, size: js.UndefOr[SuggestionsSize] = js.undefined): SuggestRequest = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], suggester = suggester.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestRequest]
  }
}

