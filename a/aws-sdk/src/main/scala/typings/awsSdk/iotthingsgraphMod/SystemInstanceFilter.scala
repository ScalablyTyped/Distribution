package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemInstanceFilter extends js.Object {
  /**
    * The name of the search filter field.
    */
  var name: js.UndefOr[SystemInstanceFilterName] = js.native
  /**
    * An array of string values for the search filter field. Multiple values function as AND criteria in the search. 
    */
  var value: js.UndefOr[SystemInstanceFilterValues] = js.native
}

object SystemInstanceFilter {
  @scala.inline
  def apply(): SystemInstanceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystemInstanceFilter]
  }
  @scala.inline
  implicit class SystemInstanceFilterOps[Self <: SystemInstanceFilter] (val x: Self) extends AnyVal {
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
    def setName(value: SystemInstanceFilterName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setValueVarargs(value: SystemInstanceFilterValue*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: SystemInstanceFilterValues): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

