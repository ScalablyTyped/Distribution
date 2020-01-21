package typings.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAffectedEntitiesForOrganizationResponse extends js.Object {
  /**
    * A JSON set of elements including the awsAccountId and its entityArn, entityValue and its entityArn, lastUpdatedTime, statusCode, and tags.
    */
  var entities: js.UndefOr[EntityList] = js.native
  /**
    * A JSON set of elements of the failed response, including the awsAccountId, errorMessage, errorName, and eventArn.
    */
  var failedSet: js.UndefOr[DescribeAffectedEntitiesForOrganizationFailedSet] = js.native
  /**
    * If the results of a search are large, only a portion of the results are returned, and a nextToken pagination token is returned in the response. To retrieve the next batch of results, reissue the search request and include the returned token. When all results have been returned, the response does not contain a pagination token value.
    */
  var nextToken: js.UndefOr[typings.awsSdk.healthMod.nextToken] = js.native
}

object DescribeAffectedEntitiesForOrganizationResponse {
  @scala.inline
  def apply(
    entities: EntityList = null,
    failedSet: DescribeAffectedEntitiesForOrganizationFailedSet = null,
    nextToken: nextToken = null
  ): DescribeAffectedEntitiesForOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    if (entities != null) __obj.updateDynamic("entities")(entities.asInstanceOf[js.Any])
    if (failedSet != null) __obj.updateDynamic("failedSet")(failedSet.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAffectedEntitiesForOrganizationResponse]
  }
}

