package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScanningRepositoryFilter extends StObject {
  
  /**
    * The filter to use when scanning.
    */
  var filter: ScanningRepositoryFilterValue
  
  /**
    * The type associated with the filter.
    */
  var filterType: ScanningRepositoryFilterType
}
object ScanningRepositoryFilter {
  
  inline def apply(filter: ScanningRepositoryFilterValue, filterType: ScanningRepositoryFilterType): ScanningRepositoryFilter = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], filterType = filterType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScanningRepositoryFilter]
  }
  
  extension [Self <: ScanningRepositoryFilter](x: Self) {
    
    inline def setFilter(value: ScanningRepositoryFilterValue): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterType(value: ScanningRepositoryFilterType): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
  }
}
