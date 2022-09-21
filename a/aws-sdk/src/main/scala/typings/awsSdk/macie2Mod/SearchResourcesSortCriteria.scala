package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchResourcesSortCriteria extends StObject {
  
  /**
    * The property to sort the results by.
    */
  var attributeName: js.UndefOr[SearchResourcesSortAttributeName] = js.undefined
  
  /**
    * The sort order to apply to the results, based on the value for the property specified by the attributeName property. Valid values are: ASC, sort the results in ascending order; and, DESC, sort the results in descending order.
    */
  var orderBy: js.UndefOr[OrderBy] = js.undefined
}
object SearchResourcesSortCriteria {
  
  inline def apply(): SearchResourcesSortCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchResourcesSortCriteria]
  }
  
  extension [Self <: SearchResourcesSortCriteria](x: Self) {
    
    inline def setAttributeName(value: SearchResourcesSortAttributeName): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
    
    inline def setAttributeNameUndefined: Self = StObject.set(x, "attributeName", js.undefined)
    
    inline def setOrderBy(value: OrderBy): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
  }
}
