package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchIndexRequest extends js.Object {
  /**
    * The search index name.
    */
  var indexName: js.UndefOr[IndexName] = js.native
  /**
    * The maximum number of results to return at one time.
    */
  var maxResults: js.UndefOr[QueryMaxResults] = js.native
  /**
    * The token used to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The search query string.
    */
  var queryString: QueryString = js.native
  /**
    * The query version.
    */
  var queryVersion: js.UndefOr[QueryVersion] = js.native
}

object SearchIndexRequest {
  @scala.inline
  def apply(
    queryString: QueryString,
    indexName: IndexName = null,
    maxResults: Int | Double = null,
    nextToken: NextToken = null,
    queryVersion: QueryVersion = null
  ): SearchIndexRequest = {
    val __obj = js.Dynamic.literal(queryString = queryString.asInstanceOf[js.Any])
    if (indexName != null) __obj.updateDynamic("indexName")(indexName.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (queryVersion != null) __obj.updateDynamic("queryVersion")(queryVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchIndexRequest]
  }
}

