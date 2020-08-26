package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalSecondaryIndexUpdate extends js.Object {
  /**
    * The parameters required for creating a global secondary index on an existing table:    IndexName      KeySchema      AttributeDefinitions      Projection      ProvisionedThroughput    
    */
  var Create: js.UndefOr[CreateGlobalSecondaryIndexAction] = js.native
  /**
    * The name of an existing global secondary index to be removed.
    */
  var Delete: js.UndefOr[DeleteGlobalSecondaryIndexAction] = js.native
  /**
    * The name of an existing global secondary index, along with new provisioned throughput settings to be applied to that index.
    */
  var Update: js.UndefOr[UpdateGlobalSecondaryIndexAction] = js.native
}

object GlobalSecondaryIndexUpdate {
  @scala.inline
  def apply(): GlobalSecondaryIndexUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalSecondaryIndexUpdate]
  }
  @scala.inline
  implicit class GlobalSecondaryIndexUpdateOps[Self <: GlobalSecondaryIndexUpdate] (val x: Self) extends AnyVal {
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
    def setCreate(value: CreateGlobalSecondaryIndexAction): Self = this.set("Create", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreate: Self = this.set("Create", js.undefined)
    @scala.inline
    def setDelete(value: DeleteGlobalSecondaryIndexAction): Self = this.set("Delete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelete: Self = this.set("Delete", js.undefined)
    @scala.inline
    def setUpdate(value: UpdateGlobalSecondaryIndexAction): Self = this.set("Update", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdate: Self = this.set("Update", js.undefined)
  }
  
}

