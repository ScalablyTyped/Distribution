package typings.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAffectedEntitiesForOrganizationRequest extends js.Object {
  /**
    * The locale (language) to return information in. English (en) is the default and the only supported value at this time.
    */
  var locale: js.UndefOr[typings.awsSdk.healthMod.locale] = js.native
  /**
    * The maximum number of items to return in one batch, between 10 and 100, inclusive.
    */
  var maxResults: js.UndefOr[typings.awsSdk.healthMod.maxResults] = js.native
  /**
    * If the results of a search are large, only a portion of the results are returned, and a nextToken pagination token is returned in the response. To retrieve the next batch of results, reissue the search request and include the returned token. When all results have been returned, the response does not contain a pagination token value.
    */
  var nextToken: js.UndefOr[typings.awsSdk.healthMod.nextToken] = js.native
  /**
    * A JSON set of elements including the awsAccountId and the eventArn.
    */
  var organizationEntityFilters: OrganizationEntityFiltersList = js.native
}

object DescribeAffectedEntitiesForOrganizationRequest {
  @scala.inline
  def apply(
    organizationEntityFilters: OrganizationEntityFiltersList,
    locale: locale = null,
    maxResults: Int | Double = null,
    nextToken: nextToken = null
  ): DescribeAffectedEntitiesForOrganizationRequest = {
    val __obj = js.Dynamic.literal(organizationEntityFilters = organizationEntityFilters.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAffectedEntitiesForOrganizationRequest]
  }
}

