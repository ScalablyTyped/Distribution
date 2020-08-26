package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeNamespaceRequest extends js.Object {
  /**
    * The ID for the AWS account that contains the QuickSight namespace that you want to describe.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The namespace that you want to describe.
    */
  var Namespace: typings.awsSdk.quicksightMod.Namespace = js.native
}

object DescribeNamespaceRequest {
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, Namespace: Namespace): DescribeNamespaceRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNamespaceRequest]
  }
  @scala.inline
  implicit class DescribeNamespaceRequestOps[Self <: DescribeNamespaceRequest] (val x: Self) extends AnyVal {
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
  }
  
}

