package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreGlobalSecondaryIndexUpdateMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreCreateGlobalSecondaryIndexActionMod._CreateGlobalSecondaryIndexAction
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreDeleteGlobalSecondaryIndexActionMod._DeleteGlobalSecondaryIndexAction
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreUpdateGlobalSecondaryIndexActionMod._UpdateGlobalSecondaryIndexAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _GlobalSecondaryIndexUpdate extends js.Object {
  /**
    * <p>The parameters required for creating a global secondary index on an existing table:</p> <ul> <li> <p> <code>IndexName </code> </p> </li> <li> <p> <code>KeySchema </code> </p> </li> <li> <p> <code>AttributeDefinitions </code> </p> </li> <li> <p> <code>Projection </code> </p> </li> <li> <p> <code>ProvisionedThroughput </code> </p> </li> </ul>
    */
  var Create: js.UndefOr[_CreateGlobalSecondaryIndexAction] = js.undefined
  /**
    * <p>The name of an existing global secondary index to be removed.</p>
    */
  var Delete: js.UndefOr[_DeleteGlobalSecondaryIndexAction] = js.undefined
  /**
    * <p>The name of an existing global secondary index, along with new provisioned throughput settings to be applied to that index.</p>
    */
  var Update: js.UndefOr[_UpdateGlobalSecondaryIndexAction] = js.undefined
}

object _GlobalSecondaryIndexUpdate {
  @scala.inline
  def apply(
    Create: _CreateGlobalSecondaryIndexAction = null,
    Delete: _DeleteGlobalSecondaryIndexAction = null,
    Update: _UpdateGlobalSecondaryIndexAction = null
  ): _GlobalSecondaryIndexUpdate = {
    val __obj = js.Dynamic.literal()
    if (Create != null) __obj.updateDynamic("Create")(Create.asInstanceOf[js.Any])
    if (Delete != null) __obj.updateDynamic("Delete")(Delete.asInstanceOf[js.Any])
    if (Update != null) __obj.updateDynamic("Update")(Update.asInstanceOf[js.Any])
    __obj.asInstanceOf[_GlobalSecondaryIndexUpdate]
  }
}

