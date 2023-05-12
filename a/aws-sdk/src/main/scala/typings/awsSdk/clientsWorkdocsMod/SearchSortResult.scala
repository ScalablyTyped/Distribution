package typings.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchSortResult extends StObject {
  
  /**
    * Sort search results based on this field name.
    */
  var Field: js.UndefOr[OrderByFieldType] = js.undefined
  
  /**
    * Sort direction.
    */
  var Order: js.UndefOr[SortOrder] = js.undefined
}
object SearchSortResult {
  
  inline def apply(): SearchSortResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchSortResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchSortResult] (val x: Self) extends AnyVal {
    
    inline def setField(value: OrderByFieldType): Self = StObject.set(x, "Field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "Field", js.undefined)
    
    inline def setOrder(value: SortOrder): Self = StObject.set(x, "Order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "Order", js.undefined)
  }
}
