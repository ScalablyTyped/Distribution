package typings.awsSdk.codestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEventTypesFilter extends StObject {
  
  /**
    * The system-generated name of the filter type you want to filter by.
    */
  var Name: ListEventTypesFilterName
  
  /**
    * The name of the resource type (for example, pipeline) or service name (for example, CodePipeline) that you want to filter by.
    */
  var Value: ListEventTypesFilterValue
}
object ListEventTypesFilter {
  
  @scala.inline
  def apply(Name: ListEventTypesFilterName, Value: ListEventTypesFilterValue): ListEventTypesFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEventTypesFilter]
  }
  
  @scala.inline
  implicit class ListEventTypesFilterMutableBuilder[Self <: ListEventTypesFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: ListEventTypesFilterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: ListEventTypesFilterValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
