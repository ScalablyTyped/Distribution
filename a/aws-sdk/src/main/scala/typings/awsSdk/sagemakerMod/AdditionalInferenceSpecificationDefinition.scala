package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalInferenceSpecificationDefinition extends StObject {
  
  /**
    * The Amazon ECR registry path of the Docker image that contains the inference code.
    */
  var Containers: ModelPackageContainerDefinitionList
  
  /**
    * A description of the additional Inference specification
    */
  var Description: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * A unique name to identify the additional inference specification. The name must be unique within the list of your additional inference specifications for a particular model package.
    */
  var Name: EntityName
  
  /**
    * The supported MIME types for the input data.
    */
  var SupportedContentTypes: js.UndefOr[ContentTypes] = js.undefined
  
  /**
    * A list of the instance types that are used to generate inferences in real-time.
    */
  var SupportedRealtimeInferenceInstanceTypes: js.UndefOr[RealtimeInferenceInstanceTypes] = js.undefined
  
  /**
    * The supported MIME types for the output data.
    */
  var SupportedResponseMIMETypes: js.UndefOr[ResponseMIMETypes] = js.undefined
  
  /**
    * A list of the instance types on which a transformation job can be run or on which an endpoint can be deployed.
    */
  var SupportedTransformInstanceTypes: js.UndefOr[TransformInstanceTypes] = js.undefined
}
object AdditionalInferenceSpecificationDefinition {
  
  inline def apply(Containers: ModelPackageContainerDefinitionList, Name: EntityName): AdditionalInferenceSpecificationDefinition = {
    val __obj = js.Dynamic.literal(Containers = Containers.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalInferenceSpecificationDefinition]
  }
  
  extension [Self <: AdditionalInferenceSpecificationDefinition](x: Self) {
    
    inline def setContainers(value: ModelPackageContainerDefinitionList): Self = StObject.set(x, "Containers", value.asInstanceOf[js.Any])
    
    inline def setContainersVarargs(value: ModelPackageContainerDefinition*): Self = StObject.set(x, "Containers", js.Array(value*))
    
    inline def setDescription(value: EntityDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: EntityName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSupportedContentTypes(value: ContentTypes): Self = StObject.set(x, "SupportedContentTypes", value.asInstanceOf[js.Any])
    
    inline def setSupportedContentTypesUndefined: Self = StObject.set(x, "SupportedContentTypes", js.undefined)
    
    inline def setSupportedContentTypesVarargs(value: ContentType*): Self = StObject.set(x, "SupportedContentTypes", js.Array(value*))
    
    inline def setSupportedRealtimeInferenceInstanceTypes(value: RealtimeInferenceInstanceTypes): Self = StObject.set(x, "SupportedRealtimeInferenceInstanceTypes", value.asInstanceOf[js.Any])
    
    inline def setSupportedRealtimeInferenceInstanceTypesUndefined: Self = StObject.set(x, "SupportedRealtimeInferenceInstanceTypes", js.undefined)
    
    inline def setSupportedRealtimeInferenceInstanceTypesVarargs(value: ProductionVariantInstanceType*): Self = StObject.set(x, "SupportedRealtimeInferenceInstanceTypes", js.Array(value*))
    
    inline def setSupportedResponseMIMETypes(value: ResponseMIMETypes): Self = StObject.set(x, "SupportedResponseMIMETypes", value.asInstanceOf[js.Any])
    
    inline def setSupportedResponseMIMETypesUndefined: Self = StObject.set(x, "SupportedResponseMIMETypes", js.undefined)
    
    inline def setSupportedResponseMIMETypesVarargs(value: ResponseMIMEType*): Self = StObject.set(x, "SupportedResponseMIMETypes", js.Array(value*))
    
    inline def setSupportedTransformInstanceTypes(value: TransformInstanceTypes): Self = StObject.set(x, "SupportedTransformInstanceTypes", value.asInstanceOf[js.Any])
    
    inline def setSupportedTransformInstanceTypesUndefined: Self = StObject.set(x, "SupportedTransformInstanceTypes", js.undefined)
    
    inline def setSupportedTransformInstanceTypesVarargs(value: TransformInstanceType*): Self = StObject.set(x, "SupportedTransformInstanceTypes", js.Array(value*))
  }
}
