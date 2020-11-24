package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NestedFilters extends js.Object {
  
  /**
    * A list of filters. Each filter acts on a property. Filters must contain at least one Filters value. For example, a NestedFilters call might include a filter on the PropertyName parameter of the InputDataConfig property: InputDataConfig.DataSource.S3DataSource.S3Uri.
    */
  var Filters: FilterList = js.native
  
  /**
    * The name of the property to use in the nested filters. The value must match a listed property name, such as InputDataConfig.
    */
  var NestedPropertyName: ResourcePropertyName = js.native
}
object NestedFilters {
  
  @scala.inline
  def apply(Filters: FilterList, NestedPropertyName: ResourcePropertyName): NestedFilters = {
    val __obj = js.Dynamic.literal(Filters = Filters.asInstanceOf[js.Any], NestedPropertyName = NestedPropertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[NestedFilters]
  }
  
  @scala.inline
  implicit class NestedFiltersOps[Self <: NestedFilters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = this.set("Filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: FilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestedPropertyName(value: ResourcePropertyName): Self = this.set("NestedPropertyName", value.asInstanceOf[js.Any])
  }
}
