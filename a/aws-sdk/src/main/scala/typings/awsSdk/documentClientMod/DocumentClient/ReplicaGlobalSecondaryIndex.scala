package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicaGlobalSecondaryIndex extends js.Object {
  /**
    * The name of the global secondary index.
    */
  var IndexName: typings.awsSdk.documentClientMod.DocumentClient.IndexName = js.native
  /**
    * Replica table GSI-specific provisioned throughput. If not specified, uses the source table GSI's read capacity settings.
    */
  var ProvisionedThroughputOverride: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.ProvisionedThroughputOverride] = js.native
}

object ReplicaGlobalSecondaryIndex {
  @scala.inline
  def apply(IndexName: IndexName, ProvisionedThroughputOverride: ProvisionedThroughputOverride = null): ReplicaGlobalSecondaryIndex = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
    if (ProvisionedThroughputOverride != null) __obj.updateDynamic("ProvisionedThroughputOverride")(ProvisionedThroughputOverride.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaGlobalSecondaryIndex]
  }
}

