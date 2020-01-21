package typings.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAffectedEntitiesResponse extends js.Object {
  /**
    * The entities that match the filter criteria.
    */
  var entities: js.UndefOr[EntityList] = js.native
  /**
    * If the results of a search are large, only a portion of the results are returned, and a nextToken pagination token is returned in the response. To retrieve the next batch of results, reissue the search request and include the returned token. When all results have been returned, the response does not contain a pagination token value.
    */
  var nextToken: js.UndefOr[typings.awsSdk.healthMod.nextToken] = js.native
}

object DescribeAffectedEntitiesResponse {
  @scala.inline
  def apply(entities: EntityList = null, nextToken: nextToken = null): DescribeAffectedEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    if (entities != null) __obj.updateDynamic("entities")(entities.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAffectedEntitiesResponse]
  }
}

