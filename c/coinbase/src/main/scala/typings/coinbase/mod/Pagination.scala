package typings.coinbase.mod

import typings.coinbase.coinbaseStrings.asc
import typings.coinbase.coinbaseStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pagination extends StObject {
  
  var ending_before: js.UndefOr[String] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var next_starting_after: js.UndefOr[String] = js.undefined
  
  var next_uri: js.UndefOr[String] = js.undefined
  
  var order: js.UndefOr[asc | desc] = js.undefined
  
  var previous_ending_before: js.UndefOr[String] = js.undefined
  
  var previous_uri: js.UndefOr[String] = js.undefined
  
  var starting_after: js.UndefOr[String] = js.undefined
}
object Pagination {
  
  inline def apply(): Pagination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pagination]
  }
  
  extension [Self <: Pagination](x: Self) {
    
    inline def setEnding_before(value: String): Self = StObject.set(x, "ending_before", value.asInstanceOf[js.Any])
    
    inline def setEnding_beforeUndefined: Self = StObject.set(x, "ending_before", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setNext_starting_after(value: String): Self = StObject.set(x, "next_starting_after", value.asInstanceOf[js.Any])
    
    inline def setNext_starting_afterUndefined: Self = StObject.set(x, "next_starting_after", js.undefined)
    
    inline def setNext_uri(value: String): Self = StObject.set(x, "next_uri", value.asInstanceOf[js.Any])
    
    inline def setNext_uriUndefined: Self = StObject.set(x, "next_uri", js.undefined)
    
    inline def setOrder(value: asc | desc): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setPrevious_ending_before(value: String): Self = StObject.set(x, "previous_ending_before", value.asInstanceOf[js.Any])
    
    inline def setPrevious_ending_beforeUndefined: Self = StObject.set(x, "previous_ending_before", js.undefined)
    
    inline def setPrevious_uri(value: String): Self = StObject.set(x, "previous_uri", value.asInstanceOf[js.Any])
    
    inline def setPrevious_uriUndefined: Self = StObject.set(x, "previous_uri", js.undefined)
    
    inline def setStarting_after(value: String): Self = StObject.set(x, "starting_after", value.asInstanceOf[js.Any])
    
    inline def setStarting_afterUndefined: Self = StObject.set(x, "starting_after", js.undefined)
  }
}
