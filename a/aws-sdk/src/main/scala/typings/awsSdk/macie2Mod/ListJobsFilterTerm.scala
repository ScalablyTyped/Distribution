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
  def apply(comparator: JobComparator = null, key: ListJobsFilterKey = null, values: listOfString = null): ListJobsFilterTerm = {
    val __obj = js.Dynamic.literal()
    if (comparator != null) __obj.updateDynamic("comparator")(comparator.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobsFilterTerm]
  }
}

