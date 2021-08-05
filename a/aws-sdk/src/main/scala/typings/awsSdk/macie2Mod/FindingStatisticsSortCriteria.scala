package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindingStatisticsSortCriteria extends StObject {
  
  /**
    * The grouping to sort the results by. Valid values are: count, sort the results by the number of findings in each group of results; and, groupKey, sort the results by the name of each group of results.
    */
  var attributeName: js.UndefOr[FindingStatisticsSortAttributeName] = js.undefined
  
  /**
    * The sort order to apply to the results, based on the value for the property specified by the attributeName property. Valid values are: ASC, sort the results in ascending order; and, DESC, sort the results in descending order.
    */
  var orderBy: js.UndefOr[OrderBy] = js.undefined
}
object FindingStatisticsSortCriteria {
  
  inline def apply(): FindingStatisticsSortCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindingStatisticsSortCriteria]
  }
  
  extension [Self <: FindingStatisticsSortCriteria](x: Self) {
    
    inline def setAttributeName(value: FindingStatisticsSortAttributeName): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
    
    inline def setAttributeNameUndefined: Self = StObject.set(x, "attributeName", js.undefined)
    
    inline def setOrderBy(value: OrderBy): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
  }
}
