package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFleetRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var fleet: Arn = js.native
}

object DescribeFleetRequest {
  @scala.inline
  def apply(fleet: Arn): DescribeFleetRequest = {
    val __obj = js.Dynamic.literal(fleet = fleet.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFleetRequest]
  }
  @scala.inline
  implicit class DescribeFleetRequestOps[Self <: DescribeFleetRequest] (val x: Self) extends AnyVal {
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
    def setFleet(value: Arn): Self = this.set("fleet", value.asInstanceOf[js.Any])
  }
  
}

