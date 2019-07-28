package typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pagination response.
  *
  * @link https://commerce.coinbase.com/docs/api/#pagination
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in 'order' | 'starting_after' | 'ending_before' | 'limit' ]: coinbase-commerce-node.coinbase-commerce-node.PaginationRequest[P]} */ trait Pagination extends js.Object {
  var cursor_range: js.Tuple2[String, String]
  var next_uri: Null | String
  var previous_uri: Null | String
  var total: Double
  var yielded: Double
}

object Pagination {
  @scala.inline
  def apply(
    cursor_range: js.Tuple2[String, String],
    total: Double,
    yielded: Double,
    next_uri: String = null,
    previous_uri: String = null
  ): Pagination = {
    val __obj = js.Dynamic.literal(cursor_range = cursor_range, total = total, yielded = yielded)
    if (next_uri != null) __obj.updateDynamic("next_uri")(next_uri)
    if (previous_uri != null) __obj.updateDynamic("previous_uri")(previous_uri)
    __obj.asInstanceOf[Pagination]
  }
}

