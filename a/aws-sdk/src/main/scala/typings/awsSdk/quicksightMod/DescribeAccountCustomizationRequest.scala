package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAccountCustomizationRequest extends js.Object {
  /**
    * The ID for the AWS account that you want to describe QuickSight customizations for.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The namespace associated with the customization that you're describing.
    */
  var Namespace: js.UndefOr[typings.awsSdk.quicksightMod.Namespace] = js.native
  /**
    * The status of the creation of the customization. This is an asynchronous process. A status of CREATED means that your customization is ready to use.
    */
  var Resolved: js.UndefOr[scala.Boolean] = js.native
}

object DescribeAccountCustomizationRequest {
  @scala.inline
  def apply(AwsAccountId: AwsAccountId): DescribeAccountCustomizationRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAccountCustomizationRequest]
  }
  @scala.inline
  implicit class DescribeAccountCustomizationRequestOps[Self <: DescribeAccountCustomizationRequest] (val x: Self) extends AnyVal {
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
    def setNamespace(value: Namespace): Self = this.set("Namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("Namespace", js.undefined)
    @scala.inline
    def setResolved(value: scala.Boolean): Self = this.set("Resolved", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolved: Self = this.set("Resolved", js.undefined)
  }
  
}

