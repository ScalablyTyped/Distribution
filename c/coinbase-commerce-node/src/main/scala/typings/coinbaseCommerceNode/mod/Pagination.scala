package typings.coinbaseCommerceNode.mod

import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.asc
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Pagination response.
  *
  * @link https://commerce.coinbase.com/docs/api/#pagination
  */
/* Inlined parent std.Pick<coinbase-commerce-node.coinbase-commerce-node.PaginationRequest, 'order' | 'starting_after' | 'ending_before' | 'limit'> */
trait Pagination extends StObject {
  
  var cursor_range: js.Tuple2[String, String]
  
  var ending_before: js.UndefOr[String | Null] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var next_uri: Null | String
  
  var order: js.UndefOr[asc | desc] = js.undefined
  
  var previous_uri: Null | String
  
  var starting_after: js.UndefOr[String | Null] = js.undefined
  
  var total: Double
  
  var yielded: Double
}
object Pagination {
  
  inline def apply(cursor_range: js.Tuple2[String, String], total: Double, yielded: Double): Pagination = {
    val __obj = js.Dynamic.literal(cursor_range = cursor_range.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], yielded = yielded.asInstanceOf[js.Any], next_uri = null, previous_uri = null)
    __obj.asInstanceOf[Pagination]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pagination] (val x: Self) extends AnyVal {
    
    inline def setCursor_range(value: js.Tuple2[String, String]): Self = StObject.set(x, "cursor_range", value.asInstanceOf[js.Any])
    
    inline def setEnding_before(value: String): Self = StObject.set(x, "ending_before", value.asInstanceOf[js.Any])
    
    inline def setEnding_beforeNull: Self = StObject.set(x, "ending_before", null)
    
    inline def setEnding_beforeUndefined: Self = StObject.set(x, "ending_before", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setNext_uri(value: String): Self = StObject.set(x, "next_uri", value.asInstanceOf[js.Any])
    
    inline def setNext_uriNull: Self = StObject.set(x, "next_uri", null)
    
    inline def setOrder(value: asc | desc): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setPrevious_uri(value: String): Self = StObject.set(x, "previous_uri", value.asInstanceOf[js.Any])
    
    inline def setPrevious_uriNull: Self = StObject.set(x, "previous_uri", null)
    
    inline def setStarting_after(value: String): Self = StObject.set(x, "starting_after", value.asInstanceOf[js.Any])
    
    inline def setStarting_afterNull: Self = StObject.set(x, "starting_after", null)
    
    inline def setStarting_afterUndefined: Self = StObject.set(x, "starting_after", js.undefined)
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setYielded(value: Double): Self = StObject.set(x, "yielded", value.asInstanceOf[js.Any])
  }
}
