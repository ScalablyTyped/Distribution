package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutExternalModelRequest extends js.Object {
  /**
    * The model endpoint input configuration.
    */
  var inputConfiguration: ModelInputConfiguration = js.native
  /**
    * The IAM role used to invoke the model endpoint.
    */
  var invokeModelEndpointRoleArn: String = js.native
  /**
    * The model endpoints name.
    */
  var modelEndpoint: sageMakerEndpointIdentifier = js.native
  /**
    * The model endpoint’s status in Amazon Fraud Detector.
    */
  var modelEndpointStatus: ModelEndpointStatus = js.native
  /**
    * The source of the model.
    */
  var modelSource: ModelSource = js.native
  /**
    * The model endpoint output configuration.
    */
  var outputConfiguration: ModelOutputConfiguration = js.native
  /**
    * A collection of key and value pairs.
    */
  var tags: js.UndefOr[tagList] = js.native
}

object PutExternalModelRequest {
  @scala.inline
  def apply(
    inputConfiguration: ModelInputConfiguration,
    invokeModelEndpointRoleArn: String,
    modelEndpoint: sageMakerEndpointIdentifier,
    modelEndpointStatus: ModelEndpointStatus,
    modelSource: ModelSource,
    outputConfiguration: ModelOutputConfiguration
  ): PutExternalModelRequest = {
    val __obj = js.Dynamic.literal(inputConfiguration = inputConfiguration.asInstanceOf[js.Any], invokeModelEndpointRoleArn = invokeModelEndpointRoleArn.asInstanceOf[js.Any], modelEndpoint = modelEndpoint.asInstanceOf[js.Any], modelEndpointStatus = modelEndpointStatus.asInstanceOf[js.Any], modelSource = modelSource.asInstanceOf[js.Any], outputConfiguration = outputConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutExternalModelRequest]
  }
  @scala.inline
  implicit class PutExternalModelRequestOps[Self <: PutExternalModelRequest] (val x: Self) extends AnyVal {
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
    def setInputConfiguration(value: ModelInputConfiguration): Self = this.set("inputConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvokeModelEndpointRoleArn(value: String): Self = this.set("invokeModelEndpointRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setModelEndpoint(value: sageMakerEndpointIdentifier): Self = this.set("modelEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setModelEndpointStatus(value: ModelEndpointStatus): Self = this.set("modelEndpointStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setModelSource(value: ModelSource): Self = this.set("modelSource", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputConfiguration(value: ModelOutputConfiguration): Self = this.set("outputConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: tagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

