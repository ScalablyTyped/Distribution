package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRdsDbInstancesRequest extends js.Object {
  /**
    * An array containing the ARNs of the instances to be described.
    */
  var RdsDbInstanceArns: js.UndefOr[Strings] = js.native
  /**
    * The ID of the stack with which the instances are registered. The operation returns descriptions of all registered Amazon RDS instances.
    */
  var StackId: String = js.native
}

object DescribeRdsDbInstancesRequest {
  @scala.inline
  def apply(StackId: String): DescribeRdsDbInstancesRequest = {
    val __obj = js.Dynamic.literal(StackId = StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRdsDbInstancesRequest]
  }
  @scala.inline
  implicit class DescribeRdsDbInstancesRequestOps[Self <: DescribeRdsDbInstancesRequest] (val x: Self) extends AnyVal {
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
    def setStackId(value: String): Self = this.set("StackId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRdsDbInstanceArnsVarargs(value: String*): Self = this.set("RdsDbInstanceArns", js.Array(value :_*))
    @scala.inline
    def setRdsDbInstanceArns(value: Strings): Self = this.set("RdsDbInstanceArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRdsDbInstanceArns: Self = this.set("RdsDbInstanceArns", js.undefined)
  }
  
}

