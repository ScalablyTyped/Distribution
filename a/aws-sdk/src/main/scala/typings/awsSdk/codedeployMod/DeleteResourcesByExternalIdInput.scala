package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteResourcesByExternalIdInput extends js.Object {
  /**
    * The unique ID of an external resource (for example, a CloudFormation stack ID) that is linked to one or more CodeDeploy resources.
    */
  var externalId: js.UndefOr[ExternalId] = js.native
}

object DeleteResourcesByExternalIdInput {
  @scala.inline
  def apply(): DeleteResourcesByExternalIdInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteResourcesByExternalIdInput]
  }
  @scala.inline
  implicit class DeleteResourcesByExternalIdInputOps[Self <: DeleteResourcesByExternalIdInput] (val x: Self) extends AnyVal {
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
    def setExternalId(value: ExternalId): Self = this.set("externalId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalId: Self = this.set("externalId", js.undefined)
  }
  
}

