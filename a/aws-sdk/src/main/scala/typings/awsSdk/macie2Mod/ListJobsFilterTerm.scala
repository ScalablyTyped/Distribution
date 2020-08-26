package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJobsFilterTerm extends js.Object {
  /**
    * The operator to use to filter the results.
    */
  var comparator: js.UndefOr[JobComparator] = js.native
  /**
    * The property to use to filter the results.
    */
  var key: js.UndefOr[ListJobsFilterKey] = js.native
  /**
    * An array that lists one or more values to use to filter the results.
    */
  var values: js.UndefOr[listOfString] = js.native
}

object ListJobsFilterTerm {
  @scala.inline
  def apply(): ListJobsFilterTerm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobsFilterTerm]
  }
  @scala.inline
  implicit class ListJobsFilterTermOps[Self <: ListJobsFilterTerm] (val x: Self) extends AnyVal {
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
    def setComparator(value: JobComparator): Self = this.set("comparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComparator: Self = this.set("comparator", js.undefined)
    @scala.inline
    def setKey(value: ListJobsFilterKey): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setValuesVarargs(value: string*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: listOfString): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

