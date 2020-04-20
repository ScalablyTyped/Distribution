package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemTemplateFilter extends js.Object {
  /**
    * The name of the system search filter field.
    */
  var name: SystemTemplateFilterName = js.native
  /**
    * An array of string values for the search filter field. Multiple values function as AND criteria in the search.
    */
  var value: SystemTemplateFilterValues = js.native
}

object SystemTemplateFilter {
  @scala.inline
  def apply(name: SystemTemplateFilterName, value: SystemTemplateFilterValues): SystemTemplateFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemTemplateFilter]
  }
}

