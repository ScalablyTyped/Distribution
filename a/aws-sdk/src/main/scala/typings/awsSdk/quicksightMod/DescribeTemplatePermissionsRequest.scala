package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTemplatePermissionsRequest extends js.Object {
  /**
    * The ID of the AWS account that contains the template that you're describing.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The ID for the template.
    */
  var TemplateId: RestrictiveResourceId = js.native
}

object DescribeTemplatePermissionsRequest {
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, TemplateId: RestrictiveResourceId): DescribeTemplatePermissionsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], TemplateId = TemplateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTemplatePermissionsRequest]
  }
  @scala.inline
  implicit class DescribeTemplatePermissionsRequestOps[Self <: DescribeTemplatePermissionsRequest] (val x: Self) extends AnyVal {
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
  }
  
}

