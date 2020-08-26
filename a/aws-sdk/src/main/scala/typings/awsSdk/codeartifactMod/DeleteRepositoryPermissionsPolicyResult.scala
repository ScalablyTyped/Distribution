package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRepositoryPermissionsPolicyResult extends js.Object {
  /**
    *  Information about the deleted policy after processing the request. 
    */
  var policy: js.UndefOr[ResourcePolicy] = js.native
}

object DeleteRepositoryPermissionsPolicyResult {
  @scala.inline
  def apply(): DeleteRepositoryPermissionsPolicyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteRepositoryPermissionsPolicyResult]
  }
  @scala.inline
  implicit class DeleteRepositoryPermissionsPolicyResultOps[Self <: DeleteRepositoryPermissionsPolicyResult] (val x: Self) extends AnyVal {
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
    def setPolicy(value: ResourcePolicy): Self = this.set("policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
  }
  
}

