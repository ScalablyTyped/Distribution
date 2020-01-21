package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAssociationResult extends js.Object {
  /**
    * The description of the association that was updated.
    */
  var AssociationDescription: js.UndefOr[typings.awsSdk.ssmMod.AssociationDescription] = js.native
}

object UpdateAssociationResult {
  @scala.inline
  def apply(AssociationDescription: AssociationDescription = null): UpdateAssociationResult = {
    val __obj = js.Dynamic.literal()
    if (AssociationDescription != null) __obj.updateDynamic("AssociationDescription")(AssociationDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAssociationResult]
  }
}

