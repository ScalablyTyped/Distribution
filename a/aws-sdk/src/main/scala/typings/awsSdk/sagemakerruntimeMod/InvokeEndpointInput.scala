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
  def apply(
    Body: BodyBlob,
    EndpointName: EndpointName,
    Accept: Header = null,
    ContentType: Header = null,
    CustomAttributes: CustomAttributesHeader = null,
    TargetModel: TargetModelHeader = null,
    TargetVariant: TargetVariantHeader = null
  ): InvokeEndpointInput = {
    val __obj = js.Dynamic.literal(Body = Body.asInstanceOf[js.Any], EndpointName = EndpointName.asInstanceOf[js.Any])
    if (Accept != null) __obj.updateDynamic("Accept")(Accept.asInstanceOf[js.Any])
    if (ContentType != null) __obj.updateDynamic("ContentType")(ContentType.asInstanceOf[js.Any])
    if (CustomAttributes != null) __obj.updateDynamic("CustomAttributes")(CustomAttributes.asInstanceOf[js.Any])
    if (TargetModel != null) __obj.updateDynamic("TargetModel")(TargetModel.asInstanceOf[js.Any])
    if (TargetVariant != null) __obj.updateDynamic("TargetVariant")(TargetVariant.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvokeEndpointInput]
  }
}

