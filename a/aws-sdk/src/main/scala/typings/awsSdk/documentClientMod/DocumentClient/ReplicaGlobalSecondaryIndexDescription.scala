package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicaGlobalSecondaryIndexDescription extends js.Object {
  /**
    * The name of the global secondary index.
    */
  var IndexName: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.IndexName] = js.native
  /**
    * If not described, uses the source table GSI's read capacity settings.
    */
  var ProvisionedThroughputOverride: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ProvisionedThroughputOverride] = js.native
}

object ReplicaGlobalSecondaryIndexDescription {
  @scala.inline
  def apply(IndexName: IndexName = null, ProvisionedThroughputOverride: ProvisionedThroughputOverride = null): ReplicaGlobalSecondaryIndexDescription = {
    val __obj = js.Dynamic.literal()
    if (IndexName != null) __obj.updateDynamic("IndexName")(IndexName.asInstanceOf[js.Any])
    if (ProvisionedThroughputOverride != null) __obj.updateDynamic("ProvisionedThroughputOverride")(ProvisionedThroughputOverride.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaGlobalSecondaryIndexDescription]
  }
}

