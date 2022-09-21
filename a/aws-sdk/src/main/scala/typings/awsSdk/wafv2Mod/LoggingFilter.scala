package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggingFilter extends StObject {
  
  /**
    * Default handling for logs that don't match any of the specified filtering conditions. 
    */
  var DefaultBehavior: FilterBehavior
  
  /**
    * The filters that you want to apply to the logs. 
    */
  var Filters: typings.awsSdk.wafv2Mod.Filters
}
object LoggingFilter {
  
  inline def apply(DefaultBehavior: FilterBehavior, Filters: Filters): LoggingFilter = {
    val __obj = js.Dynamic.literal(DefaultBehavior = DefaultBehavior.asInstanceOf[js.Any], Filters = Filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingFilter]
  }
  
  extension [Self <: LoggingFilter](x: Self) {
    
    inline def setDefaultBehavior(value: FilterBehavior): Self = StObject.set(x, "DefaultBehavior", value.asInstanceOf[js.Any])
    
    inline def setFilters(value: Filters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
  }
}
