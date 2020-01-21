package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourceSharesRequest extends js.Object {
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The name of the resource share.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * The type of owner.
    */
  var resourceOwner: ResourceOwner = js.native
  /**
    * The Amazon Resource Names (ARN) of the resource shares.
    */
  var resourceShareArns: js.UndefOr[ResourceShareArnList] = js.native
  /**
    * The status of the resource share.
    */
  var resourceShareStatus: js.UndefOr[ResourceShareStatus] = js.native
  /**
    * One or more tag filters.
    */
  var tagFilters: js.UndefOr[TagFilters] = js.native
}

object GetResourceSharesRequest {
  @scala.inline
  def apply(
    resourceOwner: ResourceOwner,
    maxResults: Int | Double = null,
    name: String = null,
    nextToken: String = null,
    resourceShareArns: ResourceShareArnList = null,
    resourceShareStatus: ResourceShareStatus = null,
    tagFilters: TagFilters = null
  ): GetResourceSharesRequest = {
    val __obj = js.Dynamic.literal(resourceOwner = resourceOwner.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (resourceShareArns != null) __obj.updateDynamic("resourceShareArns")(resourceShareArns.asInstanceOf[js.Any])
    if (resourceShareStatus != null) __obj.updateDynamic("resourceShareStatus")(resourceShareStatus.asInstanceOf[js.Any])
    if (tagFilters != null) __obj.updateDynamic("tagFilters")(tagFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceSharesRequest]
  }
}

