package typings.coinbaseCommerceNode.mod

import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.asc
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Pagination request.
  *
  * @link https://commerce.coinbase.com/docs/api/#pagination
  */
trait PaginationRequest extends StObject {
  
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
  
  inline def apply(): PaginationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaginationRequest] (val x: Self) extends AnyVal {
    
    inline def setEnding_before(value: String): Self = StObject.set(x, "ending_before", value.asInstanceOf[js.Any])
    
    inline def setEnding_beforeNull: Self = StObject.set(x, "ending_before", null)
    
    inline def setEnding_beforeUndefined: Self = StObject.set(x, "ending_before", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setOrder(value: asc | desc): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setStarting_after(value: String): Self = StObject.set(x, "starting_after", value.asInstanceOf[js.Any])
    
    inline def setStarting_afterNull: Self = StObject.set(x, "starting_after", null)
    
    inline def setStarting_afterUndefined: Self = StObject.set(x, "starting_after", js.undefined)
  }
}
