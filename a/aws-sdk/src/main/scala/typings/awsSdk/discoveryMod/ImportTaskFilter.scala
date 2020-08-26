package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportTaskFilter extends js.Object {
  /**
    * The name, status, or import task ID for a specific import task.
    */
  var name: js.UndefOr[ImportTaskFilterName] = js.native
  /**
    * An array of strings that you can provide to match against a specific name, status, or import task ID to filter the results for your import task queries.
    */
  var values: js.UndefOr[ImportTaskFilterValueList] = js.native
}

object ImportTaskFilter {
  @scala.inline
  def apply(): ImportTaskFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportTaskFilter]
  }
  @scala.inline
  implicit class ImportTaskFilterOps[Self <: ImportTaskFilter] (val x: Self) extends AnyVal {
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
    def setName(value: ImportTaskFilterName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setValuesVarargs(value: ImportTaskFilterValue*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: ImportTaskFilterValueList): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

