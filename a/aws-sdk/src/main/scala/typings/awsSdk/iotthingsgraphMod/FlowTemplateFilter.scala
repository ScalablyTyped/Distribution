package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlowTemplateFilter extends js.Object {
  /**
    * The name of the search filter field.
    */
  var name: FlowTemplateFilterName = js.native
  /**
    * An array of string values for the search filter field. Multiple values function as AND criteria in the search.
    */
  var value: FlowTemplateFilterValues = js.native
}

object FlowTemplateFilter {
  @scala.inline
  def apply(name: FlowTemplateFilterName, value: FlowTemplateFilterValues): FlowTemplateFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowTemplateFilter]
  }
}

