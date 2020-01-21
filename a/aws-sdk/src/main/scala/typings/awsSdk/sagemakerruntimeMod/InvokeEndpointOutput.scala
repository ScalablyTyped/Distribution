package typings.awsSdk.sagemakerruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvokeEndpointOutput extends js.Object {
  /**
    * Includes the inference provided by the model. For information about the format of the response body, see Common Data Formats—Inference.
    */
  var Body: BodyBlob = js.native
  /**
    * The MIME type of the inference returned in the response body.
    */
  var ContentType: js.UndefOr[Header] = js.native
  /**
    * Provides additional information in the response about the inference returned by a model hosted at an Amazon SageMaker endpoint. The information is an opaque value that is forwarded verbatim. You could use this value, for example, to return an ID received in the CustomAttributes header of a request or other metadata that a service endpoint was programmed to produce. The value must consist of no more than 1024 visible US-ASCII characters as specified in Section 3.3.6. Field Value Components of the Hypertext Transfer Protocol (HTTP/1.1). If the customer wants the custom attribute returned, the model must set the custom attribute to be included on the way back.  This feature is currently supported in the AWS SDKs but not in the Amazon SageMaker Python SDK.
    */
  var CustomAttributes: js.UndefOr[CustomAttributesHeader] = js.native
  /**
    * Identifies the production variant that was invoked.
    */
  var InvokedProductionVariant: js.UndefOr[Header] = js.native
}

object InvokeEndpointOutput {
  @scala.inline
  def apply(
    Body: BodyBlob,
    ContentType: Header = null,
    CustomAttributes: CustomAttributesHeader = null,
    InvokedProductionVariant: Header = null
  ): InvokeEndpointOutput = {
    val __obj = js.Dynamic.literal(Body = Body.asInstanceOf[js.Any])
    if (ContentType != null) __obj.updateDynamic("ContentType")(ContentType.asInstanceOf[js.Any])
    if (CustomAttributes != null) __obj.updateDynamic("CustomAttributes")(CustomAttributes.asInstanceOf[js.Any])
    if (InvokedProductionVariant != null) __obj.updateDynamic("InvokedProductionVariant")(InvokedProductionVariant.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvokeEndpointOutput]
  }
}

