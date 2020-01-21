package typings.awsSdkClientDynamodbNode.typesGlobalTableDescriptionMod

import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ACTIVE
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.CREATING
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.DELETING
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.UPDATING
import typings.awsSdkClientDynamodbNode.typesReplicaDescriptionMod.UnmarshalledReplicaDescription
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledGlobalTableDescription extends GlobalTableDescription {
  /**
    * <p>The creation time of the global table.</p>
    */
  @JSName("CreationDateTime")
  var CreationDateTime_UnmarshalledGlobalTableDescription: js.UndefOr[Date] = js.undefined
  /**
    * <p>The regions where the global table has replicas.</p>
    */
  @JSName("ReplicationGroup")
  var ReplicationGroup_UnmarshalledGlobalTableDescription: js.UndefOr[js.Array[UnmarshalledReplicaDescription]] = js.undefined
}

object UnmarshalledGlobalTableDescription {
  @scala.inline
  def apply(
    CreationDateTime: Date = null,
    GlobalTableArn: String = null,
    GlobalTableName: String = null,
    GlobalTableStatus: CREATING | ACTIVE | DELETING | UPDATING | String = null,
    ReplicationGroup: js.Array[UnmarshalledReplicaDescription] = null
  ): UnmarshalledGlobalTableDescription = {
    val __obj = js.Dynamic.literal()
    if (CreationDateTime != null) __obj.updateDynamic("CreationDateTime")(CreationDateTime.asInstanceOf[js.Any])
    if (GlobalTableArn != null) __obj.updateDynamic("GlobalTableArn")(GlobalTableArn.asInstanceOf[js.Any])
    if (GlobalTableName != null) __obj.updateDynamic("GlobalTableName")(GlobalTableName.asInstanceOf[js.Any])
    if (GlobalTableStatus != null) __obj.updateDynamic("GlobalTableStatus")(GlobalTableStatus.asInstanceOf[js.Any])
    if (ReplicationGroup != null) __obj.updateDynamic("ReplicationGroup")(ReplicationGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledGlobalTableDescription]
  }
}

