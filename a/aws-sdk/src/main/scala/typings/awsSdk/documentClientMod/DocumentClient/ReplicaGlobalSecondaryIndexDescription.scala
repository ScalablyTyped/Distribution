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
  def apply(): ReplicaGlobalSecondaryIndexDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicaGlobalSecondaryIndexDescription]
  }
  @scala.inline
  implicit class ReplicaGlobalSecondaryIndexDescriptionOps[Self <: ReplicaGlobalSecondaryIndexDescription] (val x: Self) extends AnyVal {
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
    def deleteIndexName: Self = this.set("IndexName", js.undefined)
    @scala.inline
    def setProvisionedThroughputOverride(value: ProvisionedThroughputOverride): Self = this.set("ProvisionedThroughputOverride", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisionedThroughputOverride: Self = this.set("ProvisionedThroughputOverride", js.undefined)
  }
  
}

