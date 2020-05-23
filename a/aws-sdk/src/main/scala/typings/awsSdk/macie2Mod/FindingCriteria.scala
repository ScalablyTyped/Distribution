package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindingCriteria extends js.Object {
  /**
    * A condition that specifies the property, operator, and value to use to filter the results.
    */
  var criterion: js.UndefOr[Criterion] = js.native
}

object FindingCriteria {
  @scala.inline
  def apply(criterion: Criterion = null): FindingCriteria = {
    val __obj = js.Dynamic.literal()
    if (criterion != null) __obj.updateDynamic("criterion")(criterion.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindingCriteria]
  }
}

