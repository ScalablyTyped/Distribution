package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreGlobalTableDescriptionMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.ACTIVE
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.CREATING
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.DELETING
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.UPDATING
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreReplicaDescriptionMod._UnmarshalledReplicaDescription
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledGlobalTableDescription extends _GlobalTableDescription {
  /**
    * <p>The creation time of the global table.</p>
    */
  @JSName("CreationDateTime")
  var CreationDateTime__UnmarshalledGlobalTableDescription: js.UndefOr[Date] = js.undefined
  /**
    * <p>The regions where the global table has replicas.</p>
    */
  @JSName("ReplicationGroup")
  var ReplicationGroup__UnmarshalledGlobalTableDescription: js.UndefOr[js.Array[_UnmarshalledReplicaDescription]] = js.undefined
}

object _UnmarshalledGlobalTableDescription {
  @scala.inline
  def apply(
    CreationDateTime: Date = null,
    GlobalTableArn: String = null,
    GlobalTableName: String = null,
    GlobalTableStatus: CREATING | ACTIVE | DELETING | UPDATING | String = null,
    ReplicationGroup: js.Array[_UnmarshalledReplicaDescription] = null
  ): _UnmarshalledGlobalTableDescription = {
    val __obj = js.Dynamic.literal()
    if (CreationDateTime != null) __obj.updateDynamic("CreationDateTime")(CreationDateTime.asInstanceOf[js.Any])
    if (GlobalTableArn != null) __obj.updateDynamic("GlobalTableArn")(GlobalTableArn.asInstanceOf[js.Any])
    if (GlobalTableName != null) __obj.updateDynamic("GlobalTableName")(GlobalTableName.asInstanceOf[js.Any])
    if (GlobalTableStatus != null) __obj.updateDynamic("GlobalTableStatus")(GlobalTableStatus.asInstanceOf[js.Any])
    if (ReplicationGroup != null) __obj.updateDynamic("ReplicationGroup")(ReplicationGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledGlobalTableDescription]
  }
}

