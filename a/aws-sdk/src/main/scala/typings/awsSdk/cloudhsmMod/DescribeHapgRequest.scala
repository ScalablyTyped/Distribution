package typings.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHapgRequest extends js.Object {
  /**
    * The ARN of the high-availability partition group to describe.
    */
  var HapgArn: typings.awsSdk.cloudhsmMod.HapgArn = js.native
}

object DescribeHapgRequest {
  @scala.inline
  def apply(HapgArn: HapgArn): DescribeHapgRequest = {
    val __obj = js.Dynamic.literal(HapgArn = HapgArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHapgRequest]
  }
  @scala.inline
  implicit class DescribeHapgRequestOps[Self <: DescribeHapgRequest] (val x: Self) extends AnyVal {
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
    def setHapgArn(value: HapgArn): Self = this.set("HapgArn", value.asInstanceOf[js.Any])
  }
  
}

