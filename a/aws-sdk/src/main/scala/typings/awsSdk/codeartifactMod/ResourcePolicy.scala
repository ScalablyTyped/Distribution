package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourcePolicy extends js.Object {
  /**
    *  The resource policy formatted in JSON. 
    */
  var document: js.UndefOr[PolicyDocument] = js.native
  /**
    *  The ARN of the resource associated with the resource policy 
    */
  var resourceArn: js.UndefOr[Arn] = js.native
  /**
    *  The current revision of the resource policy. 
    */
  var revision: js.UndefOr[PolicyRevision] = js.native
}

object ResourcePolicy {
  @scala.inline
  def apply(): ResourcePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePolicy]
  }
  @scala.inline
  implicit class ResourcePolicyOps[Self <: ResourcePolicy] (val x: Self) extends AnyVal {
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
    def setDocument(value: PolicyDocument): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocument: Self = this.set("document", js.undefined)
    @scala.inline
    def setResourceArn(value: Arn): Self = this.set("resourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceArn: Self = this.set("resourceArn", js.undefined)
    @scala.inline
    def setRevision(value: PolicyRevision): Self = this.set("revision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevision: Self = this.set("revision", js.undefined)
  }
  
}

