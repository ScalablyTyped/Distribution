package typings.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchExpression extends StObject {
  
  /**
    * The search expression filters.
    */
  var filters: FilterList
}
object SearchExpression {
  
  inline def apply(filters: FilterList): SearchExpression = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchExpression] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "filters", js.Array(value*))
  }
}
