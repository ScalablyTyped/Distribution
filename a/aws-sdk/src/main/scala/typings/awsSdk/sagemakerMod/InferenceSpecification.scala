package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class InferenceSpecificationOps[Self <: InferenceSpecification] (val x: Self) extends AnyVal {
    
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
    def setContainersVarargs(value: ModelPackageContainerDefinition*): Self = this.set("Containers", js.Array(value :_*))
    
    @scala.inline
    def setContainers(value: ModelPackageContainerDefinitionList): Self = this.set("Containers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedContentTypesVarargs(value: ContentType*): Self = this.set("SupportedContentTypes", js.Array(value :_*))
    
    @scala.inline
    def setSupportedContentTypes(value: ContentTypes): Self = this.set("SupportedContentTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedRealtimeInferenceInstanceTypesVarargs(value: ProductionVariantInstanceType*): Self = this.set("SupportedRealtimeInferenceInstanceTypes", js.Array(value :_*))
    
    @scala.inline
    def setSupportedRealtimeInferenceInstanceTypes(value: RealtimeInferenceInstanceTypes): Self = this.set("SupportedRealtimeInferenceInstanceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedResponseMIMETypesVarargs(value: ResponseMIMEType*): Self = this.set("SupportedResponseMIMETypes", js.Array(value :_*))
    
    @scala.inline
    def setSupportedResponseMIMETypes(value: ResponseMIMETypes): Self = this.set("SupportedResponseMIMETypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedTransformInstanceTypesVarargs(value: TransformInstanceType*): Self = this.set("SupportedTransformInstanceTypes", js.Array(value :_*))
    
    @scala.inline
    def setSupportedTransformInstanceTypes(value: TransformInstanceTypes): Self = this.set("SupportedTransformInstanceTypes", value.asInstanceOf[js.Any])
  }
}
