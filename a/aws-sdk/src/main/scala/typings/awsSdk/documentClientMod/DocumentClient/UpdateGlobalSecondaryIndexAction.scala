package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGlobalSecondaryIndexAction extends js.Object {
  /**
    * The name of the global secondary index to be updated.
    */
  var IndexName: typings.awsSdk.documentClientMod.DocumentClient.IndexName = js.native
  /**
    * Represents the provisioned throughput settings for the specified global secondary index. For current minimum and maximum provisioned throughput values, see Limits in the Amazon DynamoDB Developer Guide.
    */
  var ProvisionedThroughput: typings.awsSdk.documentClientMod.DocumentClient.ProvisionedThroughput = js.native
}

object UpdateGlobalSecondaryIndexAction {
  @scala.inline
  def apply(IndexName: IndexName, ProvisionedThroughput: ProvisionedThroughput): UpdateGlobalSecondaryIndexAction = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGlobalSecondaryIndexAction]
  }
  @scala.inline
  implicit class UpdateGlobalSecondaryIndexActionOps[Self <: UpdateGlobalSecondaryIndexAction] (val x: Self) extends AnyVal {
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
    def setProvisionedThroughput(value: ProvisionedThroughput): Self = this.set("ProvisionedThroughput", value.asInstanceOf[js.Any])
  }
  
}

