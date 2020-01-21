package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortCriterion extends js.Object {
  /**
    * The finding attribute used to sort findings.
    */
  var Field: js.UndefOr[NonEmptyString] = js.native
  /**
    * The order used to sort findings.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.securityhubMod.SortOrder] = js.native
}

object SortCriterion {
  @scala.inline
  def apply(Field: NonEmptyString = null, SortOrder: SortOrder = null): SortCriterion = {
    val __obj = js.Dynamic.literal()
    if (Field != null) __obj.updateDynamic("Field")(Field.asInstanceOf[js.Any])
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortCriterion]
  }
}

