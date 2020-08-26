package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTemplateAliasResponse extends js.Object {
  /**
    * The name for the template alias.
    */
  var AliasName: js.UndefOr[typings.awsSdk.quicksightMod.AliasName] = js.native
  /**
    * The Amazon Resource Name (ARN) of the template you want to delete.
    */
  var Arn: js.UndefOr[typings.awsSdk.quicksightMod.Arn] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
  /**
    * An ID for the template associated with the deletion.
    */
  var TemplateId: js.UndefOr[RestrictiveResourceId] = js.native
}

object DeleteTemplateAliasResponse {
  @scala.inline
  def apply(): DeleteTemplateAliasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTemplateAliasResponse]
  }
  @scala.inline
  implicit class DeleteTemplateAliasResponseOps[Self <: DeleteTemplateAliasResponse] (val x: Self) extends AnyVal {
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
    def setAliasName(value: AliasName): Self = this.set("AliasName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAliasName: Self = this.set("AliasName", js.undefined)
    @scala.inline
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setRequestId(value: String): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestId: Self = this.set("RequestId", js.undefined)
    @scala.inline
    def setStatus(value: StatusCode): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setTemplateId(value: RestrictiveResourceId): Self = this.set("TemplateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateId: Self = this.set("TemplateId", js.undefined)
  }
  
}

