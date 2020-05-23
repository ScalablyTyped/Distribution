package typings.coinbaseCommerceNode.mod

import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.asc
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pagination request.
  *
  * @link https://commerce.coinbase.com/docs/api/#pagination
  */
trait PaginationRequest extends js.Object {
  /**
    * A cursor for use in pagination.
    * This is a resource ID that defines your place in the list.
    */
  var ending_before: js.UndefOr[String | Null] = js.undefined
  /**
    * Number of results per call.
    *
    * Accepted values: 0 - 100
    * Default: 25
    */
  var limit: js.UndefOr[Double] = js.undefined
  /**
    * Order of resources in the response.
    *
    * default: desc
    */
  var order: js.UndefOr[asc | desc] = js.undefined
  /**
    * A cursor for use in pagination.
    * This is a resource ID that defines your place in the list.
    */
  var starting_after: js.UndefOr[String | Null] = js.undefined
}

object PaginationRequest {
  @scala.inline
  def apply(
    ending_before: js.UndefOr[Null | String] = js.undefined,
    limit: js.UndefOr[Double] = js.undefined,
    order: asc | desc = null,
    starting_after: js.UndefOr[Null | String] = js.undefined
  ): PaginationRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ending_before)) __obj.updateDynamic("ending_before")(ending_before.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (!js.isUndefined(starting_after)) __obj.updateDynamic("starting_after")(starting_after.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationRequest]
  }
}

