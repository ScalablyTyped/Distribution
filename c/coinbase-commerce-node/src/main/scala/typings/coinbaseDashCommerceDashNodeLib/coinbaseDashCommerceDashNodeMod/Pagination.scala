package typings
package coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod

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
  var cursor_range: js.Tuple2[java.lang.String, java.lang.String]
  var next_uri: scala.Null | java.lang.String
  var previous_uri: scala.Null | java.lang.String
  var total: scala.Double
  var yielded: scala.Double
}

object Pagination {
  @scala.inline
  def apply(
    cursor_range: js.Tuple2[java.lang.String, java.lang.String],
    total: scala.Double,
    yielded: scala.Double,
    next_uri: java.lang.String = null,
    previous_uri: java.lang.String = null
  ): Pagination = {
    val __obj = js.Dynamic.literal(cursor_range = cursor_range, total = total, yielded = yielded)
    if (next_uri != null) __obj.updateDynamic("next_uri")(next_uri)
    if (previous_uri != null) __obj.updateDynamic("previous_uri")(previous_uri)
    __obj.asInstanceOf[Pagination]
  }
}

