package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBInstanceStatusInfo extends js.Object {
  /**
    * Details of the error if there is an error for the instance. If the instance is not in an error state, this value is blank.
    */
  var Message: js.UndefOr[String] = js.native
  /**
    * A Boolean value that is true if the instance is operating normally, or false if the instance is in an error state.
    */
  var Normal: js.UndefOr[Boolean] = js.native
  /**
    * Status of the instance. For a StatusType of read replica, the values can be replicating, error, stopped, or terminated.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * This value is currently "read replication."
    */
  var StatusType: js.UndefOr[String] = js.native
}

object DBInstanceStatusInfo {
  @scala.inline
  def apply(
    Message: String = null,
    Normal: js.UndefOr[Boolean] = js.undefined,
    Status: String = null,
    StatusType: String = null
  ): DBInstanceStatusInfo = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (!js.isUndefined(Normal)) __obj.updateDynamic("Normal")(Normal.get.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusType != null) __obj.updateDynamic("StatusType")(StatusType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBInstanceStatusInfo]
  }
}

