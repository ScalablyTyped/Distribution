package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionStatus extends js.Object {
  /**
    * Timestamp which tells the creation date for the entity.
    */
  var CreationDate: UpdateTimestamp = js.native
  /**
    * Indicates whether the Elasticsearch domain is being deleted.
    */
  var PendingDeletion: js.UndefOr[Boolean] = js.native
  /**
    * Provides the OptionState for the Elasticsearch domain.
    */
  var State: OptionState = js.native
  /**
    * Timestamp which tells the last updated time for the entity.
    */
  var UpdateDate: UpdateTimestamp = js.native
  /**
    * Specifies the latest version for the entity.
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

