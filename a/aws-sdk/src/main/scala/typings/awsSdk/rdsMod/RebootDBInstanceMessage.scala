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
  def apply(DBInstanceIdentifier: String): RebootDBInstanceMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebootDBInstanceMessage]
  }
  @scala.inline
  implicit class RebootDBInstanceMessageOps[Self <: RebootDBInstanceMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDBInstanceIdentifier(value: String): Self = this.set("DBInstanceIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setForceFailover(value: BooleanOptional): Self = this.set("ForceFailover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceFailover: Self = this.set("ForceFailover", js.undefined)
  }
  
}

