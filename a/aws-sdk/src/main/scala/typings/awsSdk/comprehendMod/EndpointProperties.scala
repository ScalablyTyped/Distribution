package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointProperties extends js.Object {
  /**
    * The creation date and time of the endpoint.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The number of inference units currently used by the model using this endpoint.
    */
  var CurrentInferenceUnits: js.UndefOr[InferenceUnitsInteger] = js.native
  /**
    * The desired number of inference units to be used by the model using this endpoint. Each inference unit represents of a throughput of 100 characters per second.
    */
  var DesiredInferenceUnits: js.UndefOr[InferenceUnitsInteger] = js.native
  /**
    * The Amazon Resource Number (ARN) of the endpoint.
    */
  var EndpointArn: js.UndefOr[ComprehendEndpointArn] = js.native
  /**
    * The date and time that the endpoint was last modified.
    */
  var LastModifiedTime: js.UndefOr[Timestamp] = js.native
  /**
    * Specifies a reason for failure in cases of Failed status.
    */
  var Message: js.UndefOr[AnyLengthString] = js.native
  /**
    * The Amazon Resource Number (ARN) of the model to which the endpoint is attached.
    */
  var ModelArn: js.UndefOr[ComprehendModelArn] = js.native
  /**
    * Specifies the status of the endpoint. Because the endpoint updates and creation are asynchronous, so customers will need to wait for the endpoint to be Ready status before making inference requests.
    */
  var Status: js.UndefOr[EndpointStatus] = js.native
}

object EndpointProperties {
  @scala.inline
  def apply(): EndpointProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointProperties]
  }
  @scala.inline
  implicit class EndpointPropertiesOps[Self <: EndpointProperties] (val x: Self) extends AnyVal {
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
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    @scala.inline
    def setCurrentInferenceUnits(value: InferenceUnitsInteger): Self = this.set("CurrentInferenceUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentInferenceUnits: Self = this.set("CurrentInferenceUnits", js.undefined)
    @scala.inline
    def setDesiredInferenceUnits(value: InferenceUnitsInteger): Self = this.set("DesiredInferenceUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesiredInferenceUnits: Self = this.set("DesiredInferenceUnits", js.undefined)
    @scala.inline
    def setEndpointArn(value: ComprehendEndpointArn): Self = this.set("EndpointArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointArn: Self = this.set("EndpointArn", js.undefined)
    @scala.inline
    def setLastModifiedTime(value: Timestamp): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("LastModifiedTime", js.undefined)
    @scala.inline
    def setMessage(value: AnyLengthString): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    @scala.inline
    def setModelArn(value: ComprehendModelArn): Self = this.set("ModelArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModelArn: Self = this.set("ModelArn", js.undefined)
    @scala.inline
    def setStatus(value: EndpointStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

