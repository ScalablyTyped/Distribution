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
  def apply(
    CreationTime: Timestamp = null,
    CurrentInferenceUnits: Int | scala.Double = null,
    DesiredInferenceUnits: Int | scala.Double = null,
    EndpointArn: ComprehendEndpointArn = null,
    LastModifiedTime: Timestamp = null,
    Message: AnyLengthString = null,
    ModelArn: ComprehendModelArn = null,
    Status: EndpointStatus = null
  ): EndpointProperties = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (CurrentInferenceUnits != null) __obj.updateDynamic("CurrentInferenceUnits")(CurrentInferenceUnits.asInstanceOf[js.Any])
    if (DesiredInferenceUnits != null) __obj.updateDynamic("DesiredInferenceUnits")(DesiredInferenceUnits.asInstanceOf[js.Any])
    if (EndpointArn != null) __obj.updateDynamic("EndpointArn")(EndpointArn.asInstanceOf[js.Any])
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (ModelArn != null) __obj.updateDynamic("ModelArn")(ModelArn.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointProperties]
  }
}

