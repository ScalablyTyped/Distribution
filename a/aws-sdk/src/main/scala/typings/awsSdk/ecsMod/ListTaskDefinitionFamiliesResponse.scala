package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTaskDefinitionFamiliesResponse extends js.Object {
  /**
    * The list of task definition family names that match the ListTaskDefinitionFamilies request.
    */
  var families: js.UndefOr[StringList] = js.native
  /**
    * The nextToken value to include in a future ListTaskDefinitionFamilies request. When the results of a ListTaskDefinitionFamilies request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object ListTaskDefinitionFamiliesResponse {
  @scala.inline
  def apply(families: StringList = null, nextToken: String = null): ListTaskDefinitionFamiliesResponse = {
    val __obj = js.Dynamic.literal()
    if (families != null) __obj.updateDynamic("families")(families.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTaskDefinitionFamiliesResponse]
  }
}

