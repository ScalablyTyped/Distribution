package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAcceleratorRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the accelerator to describe.
    */
  var AcceleratorArn: GenericString = js.native
}

object DescribeAcceleratorRequest {
  @scala.inline
  def apply(AcceleratorArn: GenericString): DescribeAcceleratorRequest = {
    val __obj = js.Dynamic.literal(AcceleratorArn = AcceleratorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAcceleratorRequest]
  }
  @scala.inline
  implicit class DescribeAcceleratorRequestOps[Self <: DescribeAcceleratorRequest] (val x: Self) extends AnyVal {
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
    def setAcceleratorArn(value: GenericString): Self = this.set("AcceleratorArn", value.asInstanceOf[js.Any])
  }
  
}

