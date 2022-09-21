package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommendationJobInputConfig extends StObject {
  
  /**
    * Specifies mandatory fields for running an Inference Recommender job. The fields specified in ContainerConfig override the corresponding fields in the model package.
    */
  var ContainerConfig: js.UndefOr[RecommendationJobContainerConfig] = js.undefined
  
  /**
    * Specifies the endpoint configuration to use for a job.
    */
  var EndpointConfigurations: js.UndefOr[EndpointInputConfigurations] = js.undefined
  
  /**
    * Specifies the maximum duration of the job, in seconds.&gt;
    */
  var JobDurationInSeconds: js.UndefOr[typings.awsSdk.sagemakerMod.JobDurationInSeconds] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of a versioned model package.
    */
  var ModelPackageVersionArn: ModelPackageArn
  
  /**
    * Defines the resource limit of the job.
    */
  var ResourceLimit: js.UndefOr[RecommendationJobResourceLimit] = js.undefined
  
  /**
    * Specifies the traffic pattern of the job.
    */
  var TrafficPattern: js.UndefOr[typings.awsSdk.sagemakerMod.TrafficPattern] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of a Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to encrypt data on the storage volume attached to the ML compute instance that hosts the endpoint. This key will be passed to SageMaker Hosting for endpoint creation.  The SageMaker execution role must have kms:CreateGrant permission in order to encrypt data on the storage volume of the endpoints created for inference recommendation. The inference recommendation job will fail asynchronously during endpoint configuration creation if the role passed does not have kms:CreateGrant permission. The KmsKeyId can be any of the following formats:   // KMS Key ID  "1234abcd-12ab-34cd-56ef-1234567890ab"    // Amazon Resource Name (ARN) of a KMS Key  "arn:aws:kms:&lt;region&gt;:&lt;account&gt;:key/&lt;key-id-12ab-34cd-56ef-1234567890ab&gt;"    // KMS Key Alias  "alias/ExampleAlias"    // Amazon Resource Name (ARN) of a KMS Key Alias  "arn:aws:kms:&lt;region&gt;:&lt;account&gt;:alias/&lt;ExampleAlias&gt;"    For more information about key identifiers, see Key identifiers (KeyID) in the Amazon Web Services Key Management Service (Amazon Web Services KMS) documentation.
    */
  var VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
}
object RecommendationJobInputConfig {
  
  inline def apply(ModelPackageVersionArn: ModelPackageArn): RecommendationJobInputConfig = {
    val __obj = js.Dynamic.literal(ModelPackageVersionArn = ModelPackageVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecommendationJobInputConfig]
  }
  
  extension [Self <: RecommendationJobInputConfig](x: Self) {
    
    inline def setContainerConfig(value: RecommendationJobContainerConfig): Self = StObject.set(x, "ContainerConfig", value.asInstanceOf[js.Any])
    
    inline def setContainerConfigUndefined: Self = StObject.set(x, "ContainerConfig", js.undefined)
    
    inline def setEndpointConfigurations(value: EndpointInputConfigurations): Self = StObject.set(x, "EndpointConfigurations", value.asInstanceOf[js.Any])
    
    inline def setEndpointConfigurationsUndefined: Self = StObject.set(x, "EndpointConfigurations", js.undefined)
    
    inline def setEndpointConfigurationsVarargs(value: EndpointInputConfiguration*): Self = StObject.set(x, "EndpointConfigurations", js.Array(value*))
    
    inline def setJobDurationInSeconds(value: JobDurationInSeconds): Self = StObject.set(x, "JobDurationInSeconds", value.asInstanceOf[js.Any])
    
    inline def setJobDurationInSecondsUndefined: Self = StObject.set(x, "JobDurationInSeconds", js.undefined)
    
    inline def setModelPackageVersionArn(value: ModelPackageArn): Self = StObject.set(x, "ModelPackageVersionArn", value.asInstanceOf[js.Any])
    
    inline def setResourceLimit(value: RecommendationJobResourceLimit): Self = StObject.set(x, "ResourceLimit", value.asInstanceOf[js.Any])
    
    inline def setResourceLimitUndefined: Self = StObject.set(x, "ResourceLimit", js.undefined)
    
    inline def setTrafficPattern(value: TrafficPattern): Self = StObject.set(x, "TrafficPattern", value.asInstanceOf[js.Any])
    
    inline def setTrafficPatternUndefined: Self = StObject.set(x, "TrafficPattern", js.undefined)
    
    inline def setVolumeKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "VolumeKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setVolumeKmsKeyIdUndefined: Self = StObject.set(x, "VolumeKmsKeyId", js.undefined)
  }
}
