package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBrokerRequest extends js.Object {
  /**
    * The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain only letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard characters, or special characters.
    */
  var BrokerId: string = js.native
}

object DescribeBrokerRequest {
  @scala.inline
  def apply(BrokerId: string): DescribeBrokerRequest = {
    val __obj = js.Dynamic.literal(BrokerId = BrokerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBrokerRequest]
  }
  @scala.inline
  implicit class DescribeBrokerRequestOps[Self <: DescribeBrokerRequest] (val x: Self) extends AnyVal {
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
    def setBrokerId(value: string): Self = this.set("BrokerId", value.asInstanceOf[js.Any])
  }
  
}

