package typings.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

