package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGlobalTableSettingsOutput extends js.Object {
  /**
    * The name of the global table.
    */
  var GlobalTableName: js.UndefOr[TableName] = js.native
  /**
    * The Region-specific settings for the global table.
    */
  var ReplicaSettings: js.UndefOr[ReplicaSettingsDescriptionList] = js.native
}

object UpdateGlobalTableSettingsOutput {
  @scala.inline
  def apply(GlobalTableName: TableName = null, ReplicaSettings: ReplicaSettingsDescriptionList = null): UpdateGlobalTableSettingsOutput = {
    val __obj = js.Dynamic.literal()
    if (GlobalTableName != null) __obj.updateDynamic("GlobalTableName")(GlobalTableName.asInstanceOf[js.Any])
    if (ReplicaSettings != null) __obj.updateDynamic("ReplicaSettings")(ReplicaSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGlobalTableSettingsOutput]
  }
}

