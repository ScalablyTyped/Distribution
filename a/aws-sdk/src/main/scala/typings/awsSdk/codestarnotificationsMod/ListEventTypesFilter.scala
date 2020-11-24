package typings.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListEventTypesFilter extends js.Object {
  
  /**
    * The system-generated name of the filter type you want to filter by.
    */
  var Name: ListEventTypesFilterName = js.native
  
  /**
    * The name of the resource type (for example, pipeline) or service name (for example, CodePipeline) that you want to filter by.
    */
  var Value: ListEventTypesFilterValue = js.native
}
object ListEventTypesFilter {
  
  @scala.inline
  def apply(Name: ListEventTypesFilterName, Value: ListEventTypesFilterValue): ListEventTypesFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEventTypesFilter]
  }
  
  @scala.inline
  implicit class ListEventTypesFilterOps[Self <: ListEventTypesFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: ListEventTypesFilterName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: ListEventTypesFilterValue): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
}
