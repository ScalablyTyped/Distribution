package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromoteReadReplicaMessage extends js.Object {
  /**
    * The number of days for which automated backups are retained. Setting this parameter to a positive number enables backups. Setting this parameter to 0 disables automated backups. Default: 1 Constraints:   Must be a value from 0 to 35.   Can't be set to 0 if the DB instance is a source to read replicas.  
    */
  var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  /**
    * The DB instance identifier. This value is stored as a lowercase string. Constraints:   Must match the identifier of an existing read replica DB instance.   Example: mydbinstance 
    */
  var DBInstanceIdentifier: String = js.native
  /**
    *  The daily time range during which automated backups are created if automated backups are enabled, using the BackupRetentionPeriod parameter.   The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. To see the time blocks available, see  Adjusting the Preferred Maintenance Window in the Amazon RDS User Guide.  Constraints:   Must be in the format hh24:mi-hh24:mi.   Must be in Universal Coordinated Time (UTC).   Must not conflict with the preferred maintenance window.   Must be at least 30 minutes.  
    */
  var PreferredBackupWindow: js.UndefOr[String] = js.native
}

object PromoteReadReplicaMessage {
  @scala.inline
  def apply(DBInstanceIdentifier: String): PromoteReadReplicaMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromoteReadReplicaMessage]
  }
  @scala.inline
  implicit class PromoteReadReplicaMessageOps[Self <: PromoteReadReplicaMessage] (val x: Self) extends AnyVal {
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
    def setBackupRetentionPeriod(value: IntegerOptional): Self = this.set("BackupRetentionPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupRetentionPeriod: Self = this.set("BackupRetentionPeriod", js.undefined)
    @scala.inline
    def setPreferredBackupWindow(value: String): Self = this.set("PreferredBackupWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredBackupWindow: Self = this.set("PreferredBackupWindow", js.undefined)
  }
  
}

