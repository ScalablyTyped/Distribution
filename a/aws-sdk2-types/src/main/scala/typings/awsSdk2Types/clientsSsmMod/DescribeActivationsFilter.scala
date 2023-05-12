package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeActivationsFilter extends StObject {
  
  /**
    * The name of the filter.
    */
  var FilterKey: js.UndefOr[DescribeActivationsFilterKeys] = js.undefined
  
  /**
    * The filter values.
    */
  var FilterValues: js.UndefOr[StringList] = js.undefined
}
object DescribeActivationsFilter {
  
  inline def apply(): DescribeActivationsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeActivationsFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeActivationsFilter] (val x: Self) extends AnyVal {
    
    inline def setFilterKey(value: DescribeActivationsFilterKeys): Self = StObject.set(x, "FilterKey", value.asInstanceOf[js.Any])
    
    inline def setFilterKeyUndefined: Self = StObject.set(x, "FilterKey", js.undefined)
    
    inline def setFilterValues(value: StringList): Self = StObject.set(x, "FilterValues", value.asInstanceOf[js.Any])
    
    inline def setFilterValuesUndefined: Self = StObject.set(x, "FilterValues", js.undefined)
    
    inline def setFilterValuesVarargs(value: String*): Self = StObject.set(x, "FilterValues", js.Array(value*))
  }
}
