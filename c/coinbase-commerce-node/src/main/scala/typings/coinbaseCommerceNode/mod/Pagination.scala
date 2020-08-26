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
@js.native
trait Pagination extends js.Object {
  var cursor_range: js.Tuple2[String, String] = js.native
  var ending_before: js.UndefOr[String | Null] = js.native
  var limit: js.UndefOr[Double] = js.native
  var next_uri: Null | String = js.native
  var order: js.UndefOr[asc | desc] = js.native
  var previous_uri: Null | String = js.native
  var starting_after: js.UndefOr[String | Null] = js.native
  var total: Double = js.native
  var yielded: Double = js.native
}

object Pagination {
  @scala.inline
  def apply(cursor_range: js.Tuple2[String, String], total: Double, yielded: Double): Pagination = {
    val __obj = js.Dynamic.literal(cursor_range = cursor_range.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], yielded = yielded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pagination]
  }
  @scala.inline
  implicit class PaginationOps[Self <: Pagination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCursor_range(value: js.Tuple2[String, String]): Self = this.set("cursor_range", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def setYielded(value: Double): Self = this.set("yielded", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnding_before(value: String): Self = this.set("ending_before", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnding_before: Self = this.set("ending_before", js.undefined)
    @scala.inline
    def setEnding_beforeNull: Self = this.set("ending_before", null)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setNext_uri(value: String): Self = this.set("next_uri", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext_uriNull: Self = this.set("next_uri", null)
    @scala.inline
    def setOrder(value: asc | desc): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setPrevious_uri(value: String): Self = this.set("previous_uri", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevious_uriNull: Self = this.set("previous_uri", null)
    @scala.inline
    def setStarting_after(value: String): Self = this.set("starting_after", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStarting_after: Self = this.set("starting_after", js.undefined)
    @scala.inline
    def setStarting_afterNull: Self = this.set("starting_after", null)
  }
  
}

