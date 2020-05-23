package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagScopeTerm extends js.Object {
  /**
    * The operator to use in the condition.
    */
  var comparator: js.UndefOr[JobComparator] = js.native
  /**
    * The tag key to use in the condition.
    */
  var key: js.UndefOr[string] = js.native
  /**
    * The tag key and value pairs to use in the condition.
    */
  var tagValues: js.UndefOr[listOfTagValuePair] = js.native
  /**
    * The type of object to apply the condition to.
    */
  var target: js.UndefOr[TagTarget] = js.native
}

object TagScopeTerm {
  @scala.inline
  def apply(
    comparator: JobComparator = null,
    key: string = null,
    tagValues: listOfTagValuePair = null,
    target: TagTarget = null
  ): TagScopeTerm = {
    val __obj = js.Dynamic.literal()
    if (comparator != null) __obj.updateDynamic("comparator")(comparator.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (tagValues != null) __obj.updateDynamic("tagValues")(tagValues.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagScopeTerm]
  }
}

