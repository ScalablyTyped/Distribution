package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTemplateRequest extends js.Object {
  /**
    * The ID of the AWS account that contains the template that you're deleting.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * An ID for the template you want to delete.
    */
  var TemplateId: RestrictiveResourceId = js.native
  /**
    * Specifies the version of the template that you want to delete. If you don't provide a version number, DeleteTemplate deletes all versions of the template. 
    */
  var VersionNumber: js.UndefOr[typings.awsSdk.quicksightMod.VersionNumber] = js.native
}

object DeleteTemplateRequest {
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, TemplateId: RestrictiveResourceId): DeleteTemplateRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], TemplateId = TemplateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTemplateRequest]
  }
  @scala.inline
  implicit class DeleteTemplateRequestOps[Self <: DeleteTemplateRequest] (val x: Self) extends AnyVal {
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
    def setAwsAccountId(value: AwsAccountId): Self = this.set("AwsAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplateId(value: RestrictiveResourceId): Self = this.set("TemplateId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersionNumber(value: VersionNumber): Self = this.set("VersionNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionNumber: Self = this.set("VersionNumber", js.undefined)
  }
  
}

