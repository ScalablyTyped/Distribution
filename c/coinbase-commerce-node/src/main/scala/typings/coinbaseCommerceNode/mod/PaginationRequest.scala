package typings.coinbaseCommerceNode.mod

import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.asc
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Pagination request.
  *
  * @link https://commerce.coinbase.com/docs/api/#pagination
  */
@js.native
trait PaginationRequest extends js.Object {
  
  /**
    * A cursor for use in pagination.
    * This is a resource ID that defines your place in the list.
    */
  var ending_before: js.UndefOr[String | Null] = js.native
  
  /**
    * Number of results per call.
    *
    * Accepted values: 0 - 100
    * Default: 25
    */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * Order of resources in the response.
    *
    * default: desc
    */
  var order: js.UndefOr[asc | desc] = js.native
  
  /**
    * A cursor for use in pagination.
    * This is a resource ID that defines your place in the list.
    */
  var starting_after: js.UndefOr[String | Null] = js.native
}
object PaginationRequest {
  
  @scala.inline
  def apply(): PaginationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginationRequest]
  }
  
  @scala.inline
  implicit class PaginationRequestOps[Self <: PaginationRequest] (val x: Self) extends AnyVal {
    
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
    def setOrder(value: asc | desc): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setStarting_after(value: String): Self = this.set("starting_after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStarting_after: Self = this.set("starting_after", js.undefined)
    
    @scala.inline
    def setStarting_afterNull: Self = this.set("starting_after", null)
  }
}
