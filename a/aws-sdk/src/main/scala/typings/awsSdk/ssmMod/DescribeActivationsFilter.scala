package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeActivationsFilter extends StObject {
  
  /**
    * The name of the filter.
    */
  var FilterKey: js.UndefOr[DescribeActivationsFilterKeys] = js.native
  
  /**
    * The filter values.
    */
  var FilterValues: js.UndefOr[StringList] = js.native
}
object DescribeActivationsFilter {
  
  @scala.inline
  def apply(): DescribeActivationsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeActivationsFilter]
  }
  
  @scala.inline
  implicit class DescribeActivationsFilterMutableBuilder[Self <: DescribeActivationsFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterKey(value: DescribeActivationsFilterKeys): Self = StObject.set(x, "FilterKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterKeyUndefined: Self = StObject.set(x, "FilterKey", js.undefined)
    
    @scala.inline
    def setFilterValues(value: StringList): Self = StObject.set(x, "FilterValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterValuesUndefined: Self = StObject.set(x, "FilterValues", js.undefined)
    
    @scala.inline
    def setFilterValuesVarargs(value: String*): Self = StObject.set(x, "FilterValues", js.Array(value :_*))
  }
}
