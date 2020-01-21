package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstraintSummary extends js.Object {
  /**
    * The description of the constraint.
    */
  var Description: js.UndefOr[ConstraintDescription] = js.native
  /**
    * The type of constraint.    LAUNCH     NOTIFICATION    STACKSET    TEMPLATE   
    */
  var Type: js.UndefOr[ConstraintType] = js.native
}

object ConstraintSummary {
  @scala.inline
  def apply(Description: ConstraintDescription = null, Type: ConstraintType = null): ConstraintSummary = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstraintSummary]
  }
}

