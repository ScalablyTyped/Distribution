package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulkDeployment extends js.Object {
  /**
    * The ARN of the bulk deployment.
    */
  var BulkDeploymentArn: js.UndefOr[string] = js.native
  /**
    * The ID of the bulk deployment.
    */
  var BulkDeploymentId: js.UndefOr[string] = js.native
  /**
    * The time, in ISO format, when the deployment was created.
    */
  var CreatedAt: js.UndefOr[string] = js.native
}

object BulkDeployment {
  @scala.inline
  def apply(): BulkDeployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkDeployment]
  }
  @scala.inline
  implicit class BulkDeploymentOps[Self <: BulkDeployment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBulkDeploymentArn(value: string): Self = this.set("BulkDeploymentArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBulkDeploymentArn: Self = this.set("BulkDeploymentArn", js.undefined)
    @scala.inline
    def setBulkDeploymentId(value: string): Self = this.set("BulkDeploymentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBulkDeploymentId: Self = this.set("BulkDeploymentId", js.undefined)
    @scala.inline
    def setCreatedAt(value: string): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
  }
  
}

