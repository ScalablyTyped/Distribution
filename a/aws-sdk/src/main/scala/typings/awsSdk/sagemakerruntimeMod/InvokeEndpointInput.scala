package typings.awsSdk.sagemakerruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvokeEndpointInput extends js.Object {
  /**
    * The desired MIME type of the inference in the response.
    */
  var Accept: js.UndefOr[Header] = js.native
  /**
    * Provides input data, in the format specified in the ContentType request header. Amazon SageMaker passes all of the data in the body to the model.  For information about the format of the request body, see Common Data Formats-Inference.
    */
  var Body: BodyBlob = js.native
  /**
    * The MIME type of the input data in the request body.
    */
  var ContentType: js.UndefOr[Header] = js.native
  /**
    * Provides additional information about a request for an inference submitted to a model hosted at an Amazon SageMaker endpoint. The information is an opaque value that is forwarded verbatim. You could use this value, for example, to provide an ID that you can use to track a request or to provide other metadata that a service endpoint was programmed to process. The value must consist of no more than 1024 visible US-ASCII characters as specified in Section 3.3.6. Field Value Components of the Hypertext Transfer Protocol (HTTP/1.1). This feature is currently supported in the AWS SDKs but not in the Amazon SageMaker Python SDK.
    */
  var CustomAttributes: js.UndefOr[CustomAttributesHeader] = js.native
  /**
    * The name of the endpoint that you specified when you created the endpoint using the CreateEndpoint API. 
    */
  var EndpointName: typings.awsSdk.sagemakerruntimeMod.EndpointName = js.native
  /**
    * The model to request for inference when invoking a multi-model endpoint. 
    */
  var TargetModel: js.UndefOr[TargetModelHeader] = js.native
  /**
    * Specify the production variant to send the inference request to when invoking an endpoint that is running two or more variants. Note that this parameter overrides the default behavior for the endpoint, which is to distribute the invocation traffic based on the variant weights.
    */
  var TargetVariant: js.UndefOr[TargetVariantHeader] = js.native
}

object InvokeEndpointInput {
  @scala.inline
  def apply(Body: BodyBlob, EndpointName: EndpointName): InvokeEndpointInput = {
    val __obj = js.Dynamic.literal(Body = Body.asInstanceOf[js.Any], EndpointName = EndpointName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvokeEndpointInput]
  }
  @scala.inline
  implicit class InvokeEndpointInputOps[Self <: InvokeEndpointInput] (val x: Self) extends AnyVal {
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
    def setBody(value: BodyBlob): Self = this.set("Body", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndpointName(value: EndpointName): Self = this.set("EndpointName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccept(value: Header): Self = this.set("Accept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccept: Self = this.set("Accept", js.undefined)
    @scala.inline
    def setContentType(value: Header): Self = this.set("ContentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("ContentType", js.undefined)
    @scala.inline
    def setCustomAttributes(value: CustomAttributesHeader): Self = this.set("CustomAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomAttributes: Self = this.set("CustomAttributes", js.undefined)
    @scala.inline
    def setTargetModel(value: TargetModelHeader): Self = this.set("TargetModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetModel: Self = this.set("TargetModel", js.undefined)
    @scala.inline
    def setTargetVariant(value: TargetVariantHeader): Self = this.set("TargetVariant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetVariant: Self = this.set("TargetVariant", js.undefined)
  }
  
}

