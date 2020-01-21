package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InferenceSpecification extends js.Object {
  /**
    * The Amazon ECR registry path of the Docker image that contains the inference code.
    */
  var Containers: ModelPackageContainerDefinitionList = js.native
  /**
    * The supported MIME types for the input data.
    */
  var SupportedContentTypes: ContentTypes = js.native
  /**
    * A list of the instance types that are used to generate inferences in real-time.
    */
  var SupportedRealtimeInferenceInstanceTypes: RealtimeInferenceInstanceTypes = js.native
  /**
    * The supported MIME types for the output data.
    */
  var SupportedResponseMIMETypes: ResponseMIMETypes = js.native
  /**
    * A list of the instance types on which a transformation job can be run or on which an endpoint can be deployed.
    */
  var SupportedTransformInstanceTypes: TransformInstanceTypes = js.native
}

object InferenceSpecification {
  @scala.inline
  def apply(
    Containers: ModelPackageContainerDefinitionList,
    SupportedContentTypes: ContentTypes,
    SupportedRealtimeInferenceInstanceTypes: RealtimeInferenceInstanceTypes,
    SupportedResponseMIMETypes: ResponseMIMETypes,
    SupportedTransformInstanceTypes: TransformInstanceTypes
  ): InferenceSpecification = {
    val __obj = js.Dynamic.literal(Containers = Containers.asInstanceOf[js.Any], SupportedContentTypes = SupportedContentTypes.asInstanceOf[js.Any], SupportedRealtimeInferenceInstanceTypes = SupportedRealtimeInferenceInstanceTypes.asInstanceOf[js.Any], SupportedResponseMIMETypes = SupportedResponseMIMETypes.asInstanceOf[js.Any], SupportedTransformInstanceTypes = SupportedTransformInstanceTypes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InferenceSpecification]
  }
}

