package typings.awsSdk.rdsMod

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
    *  A value that indicates whether the reboot is conducted through a Multi-AZ failover.  Constraint: You can't enable force failover if the instance isn't configured for Multi-AZ.
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

