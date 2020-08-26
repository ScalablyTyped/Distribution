package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInputRequest extends js.Object {
  /**
    * Unique ID of the input
    */
  var InputId: string = js.native
}

object DescribeInputRequest {
  @scala.inline
  def apply(InputId: string): DescribeInputRequest = {
    val __obj = js.Dynamic.literal(InputId = InputId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInputRequest]
  }
  @scala.inline
  implicit class DescribeInputRequestOps[Self <: DescribeInputRequest] (val x: Self) extends AnyVal {
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
    def setInputId(value: string): Self = this.set("InputId", value.asInstanceOf[js.Any])
  }
  
}

