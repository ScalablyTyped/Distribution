package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduledActionFilter extends StObject {
  
  /**
    * The type of element to filter. 
    */
  var Name: ScheduledActionFilterName = js.native
  
  /**
    * List of values. Compare if the value (of type defined by Name) equals an item in the list of scheduled actions. 
    */
  var Values: ValueStringList = js.native
}
object ScheduledActionFilter {
  
  @scala.inline
  def apply(Name: ScheduledActionFilterName, Values: ValueStringList): ScheduledActionFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledActionFilter]
  }
  
  @scala.inline
  implicit class ScheduledActionFilterMutableBuilder[Self <: ScheduledActionFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: ScheduledActionFilterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: ValueStringList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
