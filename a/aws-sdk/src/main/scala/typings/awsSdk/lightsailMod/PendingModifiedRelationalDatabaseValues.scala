package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PendingModifiedRelationalDatabaseValues extends js.Object {
  /**
    * A Boolean value indicating whether automated backup retention is enabled.
    */
  var backupRetentionEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The database engine version.
    */
  var engineVersion: js.UndefOr[String] = js.native
  /**
    * The password for the master user of the database.
    */
  var masterUserPassword: js.UndefOr[String] = js.native
}

object PendingModifiedRelationalDatabaseValues {
  @scala.inline
  def apply(
    backupRetentionEnabled: js.UndefOr[Boolean] = js.undefined,
    engineVersion: String = null,
    masterUserPassword: String = null
  ): PendingModifiedRelationalDatabaseValues = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(backupRetentionEnabled)) __obj.updateDynamic("backupRetentionEnabled")(backupRetentionEnabled.get.asInstanceOf[js.Any])
    if (engineVersion != null) __obj.updateDynamic("engineVersion")(engineVersion.asInstanceOf[js.Any])
    if (masterUserPassword != null) __obj.updateDynamic("masterUserPassword")(masterUserPassword.asInstanceOf[js.Any])
    __obj.asInstanceOf[PendingModifiedRelationalDatabaseValues]
  }
}

