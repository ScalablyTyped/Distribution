package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEndpointRequest extends js.Object {
  /**
    * An idempotency token provided by the customer. If this token matches a previous endpoint creation request, Amazon Comprehend will not return a ResourceInUseException. 
    */
  var ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.native
  /**
    *  The desired number of inference units to be used by the model using this endpoint. Each inference unit represents of a throughput of 100 characters per second.
    */
  var DesiredInferenceUnits: InferenceUnitsInteger = js.native
  /**
    * This is the descriptive suffix that becomes part of the EndpointArn used for all subsequent requests to this resource. 
    */
  var EndpointName: ComprehendEndpointName = js.native
  /**
    * The Amazon Resource Number (ARN) of the model to which the endpoint will be attached.
    */
  var ModelArn: ComprehendModelArn = js.native
  /**
    * Tags associated with the endpoint being created. A tag is a key-value pair that adds metadata to the endpoint. For example, a tag with "Sales" as the key might be added to an endpoint to indicate its use by the sales department. 
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateEndpointRequest {
  @scala.inline
  def apply(
    DesiredInferenceUnits: InferenceUnitsInteger,
    EndpointName: ComprehendEndpointName,
    ModelArn: ComprehendModelArn
  ): CreateEndpointRequest = {
    val __obj = js.Dynamic.literal(DesiredInferenceUnits = DesiredInferenceUnits.asInstanceOf[js.Any], EndpointName = EndpointName.asInstanceOf[js.Any], ModelArn = ModelArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEndpointRequest]
  }
  @scala.inline
  implicit class CreateEndpointRequestOps[Self <: CreateEndpointRequest] (val x: Self) extends AnyVal {
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
    def setEndpointName(value: ComprehendEndpointName): Self = this.set("EndpointName", value.asInstanceOf[js.Any])
    @scala.inline
    def setModelArn(value: ComprehendModelArn): Self = this.set("ModelArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientRequestToken(value: ClientRequestTokenString): Self = this.set("ClientRequestToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientRequestToken: Self = this.set("ClientRequestToken", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

