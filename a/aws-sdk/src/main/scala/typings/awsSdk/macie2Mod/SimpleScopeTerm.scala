package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleScopeTerm extends js.Object {
  /**
    * The operator to use in the condition.
    */
  var comparator: js.UndefOr[JobComparator] = js.native
  /**
    * The property to use in the condition.
    */
  var key: js.UndefOr[ScopeFilterKey] = js.native
  /**
    * An array that lists one or more values to use in the condition.
    */
  var values: js.UndefOr[listOfString] = js.native
}

object SimpleScopeTerm {
  @scala.inline
  def apply(comparator: JobComparator = null, key: ScopeFilterKey = null, values: listOfString = null): SimpleScopeTerm = {
    val __obj = js.Dynamic.literal()
    if (comparator != null) __obj.updateDynamic("comparator")(comparator.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleScopeTerm]
  }
}

