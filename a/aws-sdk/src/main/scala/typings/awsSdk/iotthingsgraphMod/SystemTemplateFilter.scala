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
  @scala.inline
  implicit class SystemTemplateFilterOps[Self <: SystemTemplateFilter] (val x: Self) extends AnyVal {
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
    def setName(value: SystemTemplateFilterName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueVarargs(value: SystemTemplateFilterValue*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: SystemTemplateFilterValues): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

