package typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreGlobalSecondaryIndexUpdateMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreCreateGlobalSecondaryIndexActionMod._UnmarshalledCreateGlobalSecondaryIndexAction
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreDeleteGlobalSecondaryIndexActionMod._UnmarshalledDeleteGlobalSecondaryIndexAction
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreUpdateGlobalSecondaryIndexActionMod._UnmarshalledUpdateGlobalSecondaryIndexAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledGlobalSecondaryIndexUpdate extends _GlobalSecondaryIndexUpdate {
  /**
    * <p>The parameters required for creating a global secondary index on an existing table:</p> <ul> <li> <p> <code>IndexName </code> </p> </li> <li> <p> <code>KeySchema </code> </p> </li> <li> <p> <code>AttributeDefinitions </code> </p> </li> <li> <p> <code>Projection </code> </p> </li> <li> <p> <code>ProvisionedThroughput </code> </p> </li> </ul>
    */
  @JSName("Create")
  var Create__UnmarshalledGlobalSecondaryIndexUpdate: js.UndefOr[_UnmarshalledCreateGlobalSecondaryIndexAction] = js.undefined
  /**
    * <p>The name of an existing global secondary index to be removed.</p>
    */
  @JSName("Delete")
  var Delete__UnmarshalledGlobalSecondaryIndexUpdate: js.UndefOr[_UnmarshalledDeleteGlobalSecondaryIndexAction] = js.undefined
  /**
    * <p>The name of an existing global secondary index, along with new provisioned throughput settings to be applied to that index.</p>
    */
  @JSName("Update")
  var Update__UnmarshalledGlobalSecondaryIndexUpdate: js.UndefOr[_UnmarshalledUpdateGlobalSecondaryIndexAction] = js.undefined
}

object _UnmarshalledGlobalSecondaryIndexUpdate {
  @scala.inline
  def apply(
    Create: _UnmarshalledCreateGlobalSecondaryIndexAction = null,
    Delete: _UnmarshalledDeleteGlobalSecondaryIndexAction = null,
    Update: _UnmarshalledUpdateGlobalSecondaryIndexAction = null
  ): _UnmarshalledGlobalSecondaryIndexUpdate = {
    val __obj = js.Dynamic.literal()
    if (Create != null) __obj.updateDynamic("Create")(Create)
    if (Delete != null) __obj.updateDynamic("Delete")(Delete)
    if (Update != null) __obj.updateDynamic("Update")(Update)
    __obj.asInstanceOf[_UnmarshalledGlobalSecondaryIndexUpdate]
  }
}

