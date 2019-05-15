package typings
package coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod

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
  var ending_before: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Number of results per call.
    *
    * Accepted values: 0 - 100
    * Default: 25
    */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /**
    * Order of resources in the response.
    *
    * default: desc
    */
  var order: js.UndefOr[
    coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.asc | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.desc
  ] = js.undefined
  /**
    * A cursor for use in pagination.
    * This is a resource ID that defines your place in the list.
    */
  var starting_after: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object PaginationRequest {
  @scala.inline
  def apply(
    ending_before: java.lang.String = null,
    limit: scala.Int | scala.Double = null,
    order: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.asc | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.desc = null,
    starting_after: java.lang.String = null
  ): PaginationRequest = {
    val __obj = js.Dynamic.literal()
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after)
    __obj.asInstanceOf[PaginationRequest]
  }
}

