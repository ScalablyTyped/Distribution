package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConnectionStatusRequest extends js.Object {
  /**
    * The ID of the instance.
    */
  var Target: SessionTarget = js.native
}

object GetConnectionStatusRequest {
  @scala.inline
  def apply(Target: SessionTarget): GetConnectionStatusRequest = {
    val __obj = js.Dynamic.literal(Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConnectionStatusRequest]
  }
  @scala.inline
  implicit class GetConnectionStatusRequestOps[Self <: GetConnectionStatusRequest] (val x: Self) extends AnyVal {
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
    def setTarget(value: SessionTarget): Self = this.set("Target", value.asInstanceOf[js.Any])
  }
  
}

