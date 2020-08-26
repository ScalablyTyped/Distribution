package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitoringInput extends js.Object {
  /**
    * The endpoint for a monitoring job.
    */
  var EndpointInput: typings.awsSdk.sagemakerMod.EndpointInput = js.native
}

object MonitoringInput {
  @scala.inline
  def apply(EndpointInput: EndpointInput): MonitoringInput = {
    val __obj = js.Dynamic.literal(EndpointInput = EndpointInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringInput]
  }
  @scala.inline
  implicit class MonitoringInputOps[Self <: MonitoringInput] (val x: Self) extends AnyVal {
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
    def setEndpointInput(value: EndpointInput): Self = this.set("EndpointInput", value.asInstanceOf[js.Any])
  }
  
}

