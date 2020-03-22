package typings.coinbaseCommerceNode.mod

import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.asc
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pagination response.
  *
  * @link https://commerce.coinbase.com/docs/api/#pagination
  */
/* Inlined parent std.Pick<coinbase-commerce-node.coinbase-commerce-node.PaginationRequest, 'order' | 'starting_after' | 'ending_before' | 'limit'> */
trait Pagination extends js.Object {
  var cursor_range: js.Tuple2[String, String]
  var ending_before: js.UndefOr[String] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var next_uri: Null | String
  var order: js.UndefOr[asc | desc] = js.undefined
  var previous_uri: Null | String
  var starting_after: js.UndefOr[String] = js.undefined
  var total: Double
  var yielded: Double
}

object Pagination {
  @scala.inline
  def apply(
    cursor_range: js.Tuple2[String, String],
    total: Double,
    yielded: Double,
    ending_before: String = null,
    limit: Int | Double = null,
    next_uri: String = null,
    order: asc | desc = null,
    previous_uri: String = null,
    starting_after: String = null
  ): Pagination = {
    val __obj = js.Dynamic.literal(cursor_range = cursor_range.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], yielded = yielded.asInstanceOf[js.Any])
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (next_uri != null) __obj.updateDynamic("next_uri")(next_uri.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (previous_uri != null) __obj.updateDynamic("previous_uri")(previous_uri.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pagination]
  }
}

