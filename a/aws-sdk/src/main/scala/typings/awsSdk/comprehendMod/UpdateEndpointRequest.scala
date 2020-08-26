package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEndpointRequest extends js.Object {
  /**
    *  The desired number of inference units to be used by the model using this endpoint. Each inference unit represents of a throughput of 100 characters per second.
    */
  var DesiredInferenceUnits: InferenceUnitsInteger = js.native
  /**
    * The Amazon Resource Number (ARN) of the endpoint being updated.
    */
  var EndpointArn: ComprehendEndpointArn = js.native
}

object UpdateEndpointRequest {
  @scala.inline
  def apply(DesiredInferenceUnits: InferenceUnitsInteger, EndpointArn: ComprehendEndpointArn): UpdateEndpointRequest = {
    val __obj = js.Dynamic.literal(DesiredInferenceUnits = DesiredInferenceUnits.asInstanceOf[js.Any], EndpointArn = EndpointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEndpointRequest]
  }
  @scala.inline
  implicit class UpdateEndpointRequestOps[Self <: UpdateEndpointRequest] (val x: Self) extends AnyVal {
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
    def setDesiredInferenceUnits(value: InferenceUnitsInteger): Self = this.set("DesiredInferenceUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndpointArn(value: ComprehendEndpointArn): Self = this.set("EndpointArn", value.asInstanceOf[js.Any])
  }
  
}

