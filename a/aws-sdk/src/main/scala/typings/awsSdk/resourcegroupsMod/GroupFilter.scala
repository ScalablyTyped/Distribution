package typings.awsSdk.resourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupFilter extends StObject {
  
  /**
    * The name of the filter. Filter names are case-sensitive.
    */
  var Name: GroupFilterName
  
  /**
    * One or more filter values. Allowed filter values vary by group filter name, and are case-sensitive.
    */
  var Values: GroupFilterValues
}
object GroupFilter {
  
  @scala.inline
  def apply(Name: GroupFilterName, Values: GroupFilterValues): GroupFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupFilter]
  }
  
  @scala.inline
  implicit class GroupFilterMutableBuilder[Self <: GroupFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: GroupFilterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: GroupFilterValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: GroupFilterValue*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
