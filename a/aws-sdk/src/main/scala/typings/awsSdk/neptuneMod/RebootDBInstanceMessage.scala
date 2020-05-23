package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RebootDBInstanceMessage extends js.Object {
  /**
    * The DB instance identifier. This parameter is stored as a lowercase string. Constraints:   Must match the identifier of an existing DBInstance.  
    */
  var DBInstanceIdentifier: String = js.native
  /**
    *  When true, the reboot is conducted through a MultiAZ failover. Constraint: You can't specify true if the instance is not configured for MultiAZ.
    */
  var ForceFailover: js.UndefOr[BooleanOptional] = js.native
}

object RebootDBInstanceMessage {
  @scala.inline
  def apply(DBInstanceIdentifier: String, ForceFailover: js.UndefOr[BooleanOptional] = js.undefined): RebootDBInstanceMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any])
    if (!js.isUndefined(ForceFailover)) __obj.updateDynamic("ForceFailover")(ForceFailover.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebootDBInstanceMessage]
  }
}

