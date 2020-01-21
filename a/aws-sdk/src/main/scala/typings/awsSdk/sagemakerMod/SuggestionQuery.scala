package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggestionQuery extends js.Object {
  /**
    * Defines a property name hint. Only property names that begin with the specified hint are included in the response.
    */
  var PropertyNameQuery: js.UndefOr[typings.awsSdk.sagemakerMod.PropertyNameQuery] = js.native
}

object SuggestionQuery {
  @scala.inline
  def apply(PropertyNameQuery: PropertyNameQuery = null): SuggestionQuery = {
    val __obj = js.Dynamic.literal()
    if (PropertyNameQuery != null) __obj.updateDynamic("PropertyNameQuery")(PropertyNameQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestionQuery]
  }
}

