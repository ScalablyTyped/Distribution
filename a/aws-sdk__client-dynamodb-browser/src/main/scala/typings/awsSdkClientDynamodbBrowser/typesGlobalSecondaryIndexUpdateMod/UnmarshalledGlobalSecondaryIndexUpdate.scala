package typings.awsSdkClientDynamodbBrowser.typesGlobalSecondaryIndexUpdateMod

import typings.awsSdkClientDynamodbBrowser.typesCreateGlobalSecondaryIndexActionMod.UnmarshalledCreateGlobalSecondaryIndexAction
import typings.awsSdkClientDynamodbBrowser.typesDeleteGlobalSecondaryIndexActionMod.UnmarshalledDeleteGlobalSecondaryIndexAction
import typings.awsSdkClientDynamodbBrowser.typesUpdateGlobalSecondaryIndexActionMod.UnmarshalledUpdateGlobalSecondaryIndexAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledGlobalSecondaryIndexUpdate extends GlobalSecondaryIndexUpdate {
  /**
    * <p>The parameters required for creating a global secondary index on an existing table:</p> <ul> <li> <p> <code>IndexName </code> </p> </li> <li> <p> <code>KeySchema </code> </p> </li> <li> <p> <code>AttributeDefinitions </code> </p> </li> <li> <p> <code>Projection </code> </p> </li> <li> <p> <code>ProvisionedThroughput </code> </p> </li> </ul>
    */
  @JSName("Create")
  var Create_UnmarshalledGlobalSecondaryIndexUpdate: js.UndefOr[UnmarshalledCreateGlobalSecondaryIndexAction] = js.undefined
  /**
    * <p>The name of an existing global secondary index to be removed.</p>
    */
  @JSName("Delete")
  var Delete_UnmarshalledGlobalSecondaryIndexUpdate: js.UndefOr[UnmarshalledDeleteGlobalSecondaryIndexAction] = js.undefined
  /**
    * <p>The name of an existing global secondary index, along with new provisioned throughput settings to be applied to that index.</p>
    */
  @JSName("Update")
  var Update_UnmarshalledGlobalSecondaryIndexUpdate: js.UndefOr[UnmarshalledUpdateGlobalSecondaryIndexAction] = js.undefined
}

object UnmarshalledGlobalSecondaryIndexUpdate {
  @scala.inline
  def apply(
    Create: UnmarshalledCreateGlobalSecondaryIndexAction = null,
    Delete: UnmarshalledDeleteGlobalSecondaryIndexAction = null,
    Update: UnmarshalledUpdateGlobalSecondaryIndexAction = null
  ): UnmarshalledGlobalSecondaryIndexUpdate = {
    val __obj = js.Dynamic.literal()
    if (Create != null) __obj.updateDynamic("Create")(Create.asInstanceOf[js.Any])
    if (Delete != null) __obj.updateDynamic("Delete")(Delete.asInstanceOf[js.Any])
    if (Update != null) __obj.updateDynamic("Update")(Update.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledGlobalSecondaryIndexUpdate]
  }
}

