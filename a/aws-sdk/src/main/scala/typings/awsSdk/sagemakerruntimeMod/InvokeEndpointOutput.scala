package typings.awsSdk.sagemakerruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvokeEndpointOutput extends js.Object {
  /**
    * Includes the inference provided by the model. For information about the format of the response body, see Common Data Formats-Inference.
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
  def apply(Body: BodyBlob): InvokeEndpointOutput = {
    val __obj = js.Dynamic.literal(Body = Body.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvokeEndpointOutput]
  }
  @scala.inline
  implicit class InvokeEndpointOutputOps[Self <: InvokeEndpointOutput] (val x: Self) extends AnyVal {
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
    def setContentType(value: Header): Self = this.set("ContentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("ContentType", js.undefined)
    @scala.inline
    def setCustomAttributes(value: CustomAttributesHeader): Self = this.set("CustomAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomAttributes: Self = this.set("CustomAttributes", js.undefined)
    @scala.inline
    def setInvokedProductionVariant(value: Header): Self = this.set("InvokedProductionVariant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvokedProductionVariant: Self = this.set("InvokedProductionVariant", js.undefined)
  }
  
}

