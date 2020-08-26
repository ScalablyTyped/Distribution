package typings.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeResourceRequest extends js.Object {
  /**
    * The resource ARN.
    */
  var ResourceArn: ResourceArnString = js.native
}

object DescribeResourceRequest {
  @scala.inline
  def apply(ResourceArn: ResourceArnString): DescribeResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeResourceRequest]
  }
  @scala.inline
  implicit class DescribeResourceRequestOps[Self <: DescribeResourceRequest] (val x: Self) extends AnyVal {
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
    def setResourceArn(value: ResourceArnString): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
  }
  
}

