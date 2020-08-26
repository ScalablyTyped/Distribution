package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicaGlobalSecondaryIndex extends js.Object {
  /**
    * The name of the global secondary index.
    */
  var IndexName: typings.awsSdk.dynamodbMod.IndexName = js.native
  /**
    * Replica table GSI-specific provisioned throughput. If not specified, uses the source table GSI's read capacity settings.
    */
  var ProvisionedThroughputOverride: js.UndefOr[typings.awsSdk.dynamodbMod.ProvisionedThroughputOverride] = js.native
}

object ReplicaGlobalSecondaryIndex {
  @scala.inline
  def apply(IndexName: IndexName): ReplicaGlobalSecondaryIndex = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaGlobalSecondaryIndex]
  }
  @scala.inline
  implicit class ReplicaGlobalSecondaryIndexOps[Self <: ReplicaGlobalSecondaryIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIndexName(value: IndexName): Self = this.set("IndexName", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvisionedThroughputOverride(value: ProvisionedThroughputOverride): Self = this.set("ProvisionedThroughputOverride", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisionedThroughputOverride: Self = this.set("ProvisionedThroughputOverride", js.undefined)
  }
  
}

