package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

