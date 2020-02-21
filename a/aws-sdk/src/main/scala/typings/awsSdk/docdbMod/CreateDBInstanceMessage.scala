package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDBInstanceMessage extends js.Object {
  /**
    * Indicates that minor engine upgrades are applied automatically to the instance during the maintenance window. Default: true 
    */
  var AutoMinorVersionUpgrade: js.UndefOr[BooleanOptional] = js.native
  /**
    *  The Amazon EC2 Availability Zone that the instance is created in. Default: A random, system-chosen Availability Zone in the endpoint's AWS Region.  Example: us-east-1d   Constraint: The AvailabilityZone parameter can't be specified if the MultiAZ parameter is set to true. The specified Availability Zone must be in the same AWS Region as the current endpoint. 
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The identifier of the cluster that the instance will belong to.
    */
  var DBClusterIdentifier: String = js.native
  /**
    * The compute and memory capacity of the instance; for example, db.r5.large. 
    */
  var DBInstanceClass: String = js.native
  /**
    * The instance identifier. This parameter is stored as a lowercase string. Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens.   The first character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Example: mydbinstance 
    */
  var DBInstanceIdentifier: String = js.native
  /**
    * The name of the database engine to be used for this instance. Valid value: docdb 
    */
  var Engine: String = js.native
  /**
    * The time range each week during which system maintenance can occur, in Universal Coordinated Time (UTC).  Format: ddd:hh24:mi-ddd:hh24:mi  The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region, occurring on a random day of the week.  Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun Constraints: Minimum 30-minute window.
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.native
  /**
    * A value that specifies the order in which an Amazon DocumentDB replica is promoted to the primary instance after a failure of the existing primary instance. Default: 1 Valid values: 0-15
    */
  var PromotionTier: js.UndefOr[IntegerOptional] = js.native
  /**
    * The tags to be assigned to the instance. You can assign up to 10 tags to an instance.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateDBInstanceMessage {
  @scala.inline
  def apply(
    DBClusterIdentifier: String,
    DBInstanceClass: String,
    DBInstanceIdentifier: String,
    Engine: String,
    AutoMinorVersionUpgrade: js.UndefOr[scala.Boolean] = js.undefined,
    AvailabilityZone: String = null,
    PreferredMaintenanceWindow: String = null,
    PromotionTier: Int | Double = null,
    Tags: TagList = null
  ): CreateDBInstanceMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any], DBInstanceClass = DBInstanceClass.asInstanceOf[js.Any], DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any], Engine = Engine.asInstanceOf[js.Any])
    if (!js.isUndefined(AutoMinorVersionUpgrade)) __obj.updateDynamic("AutoMinorVersionUpgrade")(AutoMinorVersionUpgrade.asInstanceOf[js.Any])
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (PreferredMaintenanceWindow != null) __obj.updateDynamic("PreferredMaintenanceWindow")(PreferredMaintenanceWindow.asInstanceOf[js.Any])
    if (PromotionTier != null) __obj.updateDynamic("PromotionTier")(PromotionTier.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDBInstanceMessage]
  }
}

