package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindingCriteria extends js.Object {
  /**
    * Represents a map of finding properties that match specified conditions and values when querying findings.
    */
  var Criterion: js.UndefOr[typings.awsSdk.guarddutyMod.Criterion] = js.native
}

object FindingCriteria {
  @scala.inline
  def apply(Criterion: Criterion = null): FindingCriteria = {
    val __obj = js.Dynamic.literal()
    if (Criterion != null) __obj.updateDynamic("Criterion")(Criterion.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindingCriteria]
  }
}

