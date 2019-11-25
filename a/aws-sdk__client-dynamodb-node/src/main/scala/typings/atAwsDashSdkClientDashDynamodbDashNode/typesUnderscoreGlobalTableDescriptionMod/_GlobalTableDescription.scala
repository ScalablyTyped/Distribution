package typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreGlobalTableDescriptionMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.ACTIVE
import typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.CREATING
import typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.DELETING
import typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.UPDATING
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreReplicaDescriptionMod._ReplicaDescription
import typings.std.Date
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _GlobalTableDescription extends js.Object {
  /**
    * <p>The creation time of the global table.</p>
    */
  var CreationDateTime: js.UndefOr[Date | String | Double] = js.undefined
  /**
    * <p>The unique identifier of the global table.</p>
    */
  var GlobalTableArn: js.UndefOr[String] = js.undefined
  /**
    * <p>The global table name.</p>
    */
  var GlobalTableName: js.UndefOr[String] = js.undefined
  /**
    * <p>The current state of the global table:</p> <ul> <li> <p> <code>CREATING</code> - The global table is being created.</p> </li> <li> <p> <code>UPDATING</code> - The global table is being updated.</p> </li> <li> <p> <code>DELETING</code> - The global table is being deleted.</p> </li> <li> <p> <code>ACTIVE</code> - The global table is ready for use.</p> </li> </ul>
    */
  var GlobalTableStatus: js.UndefOr[CREATING | ACTIVE | DELETING | UPDATING | String] = js.undefined
  /**
    * <p>The regions where the global table has replicas.</p>
    */
  var ReplicationGroup: js.UndefOr[js.Array[_ReplicaDescription] | Iterable[_ReplicaDescription]] = js.undefined
}

object _GlobalTableDescription {
  @scala.inline
  def apply(
    CreationDateTime: Date | String | Double = null,
    GlobalTableArn: String = null,
    GlobalTableName: String = null,
    GlobalTableStatus: CREATING | ACTIVE | DELETING | UPDATING | String = null,
    ReplicationGroup: js.Array[_ReplicaDescription] | Iterable[_ReplicaDescription] = null
  ): _GlobalTableDescription = {
    val __obj = js.Dynamic.literal()
    if (CreationDateTime != null) __obj.updateDynamic("CreationDateTime")(CreationDateTime.asInstanceOf[js.Any])
    if (GlobalTableArn != null) __obj.updateDynamic("GlobalTableArn")(GlobalTableArn.asInstanceOf[js.Any])
    if (GlobalTableName != null) __obj.updateDynamic("GlobalTableName")(GlobalTableName.asInstanceOf[js.Any])
    if (GlobalTableStatus != null) __obj.updateDynamic("GlobalTableStatus")(GlobalTableStatus.asInstanceOf[js.Any])
    if (ReplicationGroup != null) __obj.updateDynamic("ReplicationGroup")(ReplicationGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[_GlobalTableDescription]
  }
}

