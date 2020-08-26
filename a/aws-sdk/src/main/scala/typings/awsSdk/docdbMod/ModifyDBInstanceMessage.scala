package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyDBInstanceMessage extends js.Object {
  /**
    * Specifies whether the modifications in this request and any pending modifications are asynchronously applied as soon as possible, regardless of the PreferredMaintenanceWindow setting for the instance.   If this parameter is set to false, changes to the instance are applied during the next maintenance window. Some parameter changes can cause an outage and are applied on the next reboot. Default: false 
    */
  var ApplyImmediately: js.UndefOr[Boolean] = js.native
  /**
    * Indicates that minor version upgrades are applied automatically to the instance during the maintenance window. Changing this parameter doesn't result in an outage except in the following case, and the change is asynchronously applied as soon as possible. An outage results if this parameter is set to true during the maintenance window, and a newer minor version is available, and Amazon DocumentDB has enabled automatic patching for that engine version. 
    */
  var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.native
  /**
    * Indicates the certificate that needs to be associated with the instance.
    */
  var CACertificateIdentifier: js.UndefOr[String] = js.native
  /**
    * The new compute and memory capacity of the instance; for example, db.r5.large. Not all instance classes are available in all AWS Regions.  If you modify the instance class, an outage occurs during the change. The change is applied during the next maintenance window, unless ApplyImmediately is specified as true for this request.  Default: Uses existing setting.
    */
  var DBInstanceClass: js.UndefOr[String] = js.native
  /**
    * The instance identifier. This value is stored as a lowercase string. Constraints:   Must match the identifier of an existing DBInstance.  
    */
  var DBInstanceIdentifier: String = js.native
  /**
    *  The new instance identifier for the instance when renaming an instance. When you change the instance identifier, an instance reboot occurs immediately if you set Apply Immediately to true. It occurs during the next maintenance window if you set Apply Immediately to false. This value is stored as a lowercase string.  Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   The first character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Example: mydbinstance 
    */
  var NewDBInstanceIdentifier: js.UndefOr[String] = js.native
  /**
    * The weekly time range (in UTC) during which system maintenance can occur, which might result in an outage. Changing this parameter doesn't result in an outage except in the following situation, and the change is asynchronously applied as soon as possible. If there are pending actions that cause a reboot, and the maintenance window is changed to include the current time, changing this parameter causes a reboot of the instance. If you are moving this window to the current time, there must be at least 30 minutes between the current time and end of the window to ensure that pending changes are applied. Default: Uses existing setting. Format: ddd:hh24:mi-ddd:hh24:mi  Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun Constraints: Must be at least 30 minutes.
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.native
  /**
    * A value that specifies the order in which an Amazon DocumentDB replica is promoted to the primary instance after a failure of the existing primary instance. Default: 1 Valid values: 0-15
    */
  var PromotionTier: js.UndefOr[IntegerOptional] = js.native
}

object ModifyDBInstanceMessage {
  @scala.inline
  def apply(DBInstanceIdentifier: String): ModifyDBInstanceMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBInstanceMessage]
  }
  @scala.inline
  implicit class ModifyDBInstanceMessageOps[Self <: ModifyDBInstanceMessage] (val x: Self) extends AnyVal {
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
    def setApplyImmediately(value: Boolean): Self = this.set("ApplyImmediately", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplyImmediately: Self = this.set("ApplyImmediately", js.undefined)
    @scala.inline
    def setAutoMinorVersionUpgrade(value: BooleanOptional): Self = this.set("AutoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoMinorVersionUpgrade: Self = this.set("AutoMinorVersionUpgrade", js.undefined)
    @scala.inline
    def setCACertificateIdentifier(value: String): Self = this.set("CACertificateIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCACertificateIdentifier: Self = this.set("CACertificateIdentifier", js.undefined)
    @scala.inline
    def setDBInstanceClass(value: String): Self = this.set("DBInstanceClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBInstanceClass: Self = this.set("DBInstanceClass", js.undefined)
    @scala.inline
    def setNewDBInstanceIdentifier(value: String): Self = this.set("NewDBInstanceIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewDBInstanceIdentifier: Self = this.set("NewDBInstanceIdentifier", js.undefined)
    @scala.inline
    def setPreferredMaintenanceWindow(value: String): Self = this.set("PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredMaintenanceWindow: Self = this.set("PreferredMaintenanceWindow", js.undefined)
    @scala.inline
    def setPromotionTier(value: IntegerOptional): Self = this.set("PromotionTier", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromotionTier: Self = this.set("PromotionTier", js.undefined)
  }
  
}

