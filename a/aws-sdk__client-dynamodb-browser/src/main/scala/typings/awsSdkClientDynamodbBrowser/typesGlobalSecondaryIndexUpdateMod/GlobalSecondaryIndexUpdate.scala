package typings.awsSdkClientDynamodbBrowser.typesGlobalSecondaryIndexUpdateMod

import typings.awsSdkClientDynamodbBrowser.typesCreateGlobalSecondaryIndexActionMod.CreateGlobalSecondaryIndexAction
import typings.awsSdkClientDynamodbBrowser.typesDeleteGlobalSecondaryIndexActionMod.DeleteGlobalSecondaryIndexAction
import typings.awsSdkClientDynamodbBrowser.typesUpdateGlobalSecondaryIndexActionMod.UpdateGlobalSecondaryIndexAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalSecondaryIndexUpdate extends js.Object {
  /**
    * <p>The parameters required for creating a global secondary index on an existing table:</p> <ul> <li> <p> <code>IndexName </code> </p> </li> <li> <p> <code>KeySchema </code> </p> </li> <li> <p> <code>AttributeDefinitions </code> </p> </li> <li> <p> <code>Projection </code> </p> </li> <li> <p> <code>ProvisionedThroughput </code> </p> </li> </ul>
    */
  var Create: js.UndefOr[CreateGlobalSecondaryIndexAction] = js.undefined
  /**
    * <p>The name of an existing global secondary index to be removed.</p>
    */
  var Delete: js.UndefOr[DeleteGlobalSecondaryIndexAction] = js.undefined
  /**
    * <p>The name of an existing global secondary index, along with new provisioned throughput settings to be applied to that index.</p>
    */
  var Update: js.UndefOr[UpdateGlobalSecondaryIndexAction] = js.undefined
}

object GlobalSecondaryIndexUpdate {
  @scala.inline
  def apply(
    Create: CreateGlobalSecondaryIndexAction = null,
    Delete: DeleteGlobalSecondaryIndexAction = null,
    Update: UpdateGlobalSecondaryIndexAction = null
  ): GlobalSecondaryIndexUpdate = {
    val __obj = js.Dynamic.literal()
    if (Create != null) __obj.updateDynamic("Create")(Create.asInstanceOf[js.Any])
    if (Delete != null) __obj.updateDynamic("Delete")(Delete.asInstanceOf[js.Any])
    if (Update != null) __obj.updateDynamic("Update")(Update.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalSecondaryIndexUpdate]
  }
}

