package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InferenceSpecification extends StObject {
  
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
  implicit class InferenceSpecificationMutableBuilder[Self <: InferenceSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainers(value: ModelPackageContainerDefinitionList): Self = StObject.set(x, "Containers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainersVarargs(value: ModelPackageContainerDefinition*): Self = StObject.set(x, "Containers", js.Array(value :_*))
    
    @scala.inline
    def setSupportedContentTypes(value: ContentTypes): Self = StObject.set(x, "SupportedContentTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedContentTypesVarargs(value: ContentType*): Self = StObject.set(x, "SupportedContentTypes", js.Array(value :_*))
    
    @scala.inline
    def setSupportedRealtimeInferenceInstanceTypes(value: RealtimeInferenceInstanceTypes): Self = StObject.set(x, "SupportedRealtimeInferenceInstanceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedRealtimeInferenceInstanceTypesVarargs(value: ProductionVariantInstanceType*): Self = StObject.set(x, "SupportedRealtimeInferenceInstanceTypes", js.Array(value :_*))
    
    @scala.inline
    def setSupportedResponseMIMETypes(value: ResponseMIMETypes): Self = StObject.set(x, "SupportedResponseMIMETypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedResponseMIMETypesVarargs(value: ResponseMIMEType*): Self = StObject.set(x, "SupportedResponseMIMETypes", js.Array(value :_*))
    
    @scala.inline
    def setSupportedTransformInstanceTypes(value: TransformInstanceTypes): Self = StObject.set(x, "SupportedTransformInstanceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedTransformInstanceTypesVarargs(value: TransformInstanceType*): Self = StObject.set(x, "SupportedTransformInstanceTypes", js.Array(value :_*))
  }
}
