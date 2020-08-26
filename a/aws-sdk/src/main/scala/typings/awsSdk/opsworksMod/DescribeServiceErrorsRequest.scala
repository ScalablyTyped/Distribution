package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeServiceErrorsRequest extends js.Object {
  /**
    * The instance ID. If you use this parameter, DescribeServiceErrors returns descriptions of the errors associated with the specified instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * An array of service error IDs. If you use this parameter, DescribeServiceErrors returns descriptions of the specified errors. Otherwise, it returns a description of every error.
    */
  var ServiceErrorIds: js.UndefOr[Strings] = js.native
  /**
    * The stack ID. If you use this parameter, DescribeServiceErrors returns descriptions of the errors associated with the specified stack.
    */
  var StackId: js.UndefOr[String] = js.native
}

object DescribeServiceErrorsRequest {
  @scala.inline
  def apply(): DescribeServiceErrorsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeServiceErrorsRequest]
  }
  @scala.inline
  implicit class DescribeServiceErrorsRequestOps[Self <: DescribeServiceErrorsRequest] (val x: Self) extends AnyVal {
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
    def setInstanceId(value: String): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    @scala.inline
    def setServiceErrorIdsVarargs(value: String*): Self = this.set("ServiceErrorIds", js.Array(value :_*))
    @scala.inline
    def setServiceErrorIds(value: Strings): Self = this.set("ServiceErrorIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceErrorIds: Self = this.set("ServiceErrorIds", js.undefined)
    @scala.inline
    def setStackId(value: String): Self = this.set("StackId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackId: Self = this.set("StackId", js.undefined)
  }
  
}

