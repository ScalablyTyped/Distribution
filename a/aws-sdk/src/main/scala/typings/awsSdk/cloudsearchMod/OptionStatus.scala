package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionStatus extends js.Object {
  /**
    * A timestamp for when this option was created.
    */
  var CreationDate: UpdateTimestamp = js.native
  /**
    * Indicates that the option will be deleted once processing is complete.
    */
  var PendingDeletion: js.UndefOr[Boolean] = js.native
  /**
    * The state of processing a change to an option. Possible values: RequiresIndexDocuments: the option's latest value will not be deployed until IndexDocuments has been called and indexing is complete. Processing: the option's latest value is in the process of being activated.  Active: the option's latest value is completely deployed. FailedToValidate: the option value is not compatible with the domain's data and cannot be used to index the data. You must either modify the option value or update or remove the incompatible documents. 
    */
  var State: OptionState = js.native
  /**
    * A timestamp for when this option was last updated.
    */
  var UpdateDate: UpdateTimestamp = js.native
  /**
    * A unique integer that indicates when this option was last updated.
    */
  var UpdateVersion: js.UndefOr[UIntValue] = js.native
}

object OptionStatus {
  @scala.inline
  def apply(
    CreationDate: UpdateTimestamp,
    State: OptionState,
    UpdateDate: UpdateTimestamp,
    PendingDeletion: js.UndefOr[Boolean] = js.undefined,
    UpdateVersion: js.UndefOr[UIntValue] = js.undefined
  ): OptionStatus = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], UpdateDate = UpdateDate.asInstanceOf[js.Any])
    if (!js.isUndefined(PendingDeletion)) __obj.updateDynamic("PendingDeletion")(PendingDeletion.get.asInstanceOf[js.Any])
    if (!js.isUndefined(UpdateVersion)) __obj.updateDynamic("UpdateVersion")(UpdateVersion.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionStatus]
  }
}

