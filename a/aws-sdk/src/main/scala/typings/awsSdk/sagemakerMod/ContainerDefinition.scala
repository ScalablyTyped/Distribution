package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerDefinition extends StObject {
  
  /**
    * This parameter is ignored for models that contain only a PrimaryContainer. When a ContainerDefinition is part of an inference pipeline, the value of the parameter uniquely identifies the container for the purposes of logging and metrics. For information, see Use Logs and Metrics to Monitor an Inference Pipeline. If you don't specify a value for this parameter for a ContainerDefinition that is part of an inference pipeline, a unique name is automatically assigned based on the position of the ContainerDefinition in the pipeline. If you specify a value for the ContainerHostName for any ContainerDefinition that is part of an inference pipeline, you must specify a value for the ContainerHostName parameter of every ContainerDefinition in that pipeline.
    */
  var ContainerHostname: js.UndefOr[typings.awsSdk.sagemakerMod.ContainerHostname] = js.native
  
  /**
    * The environment variables to set in the Docker container. Each key and value in the Environment string to string map can have length of up to 1024. We support up to 16 entries in the map. 
    */
  var Environment: js.UndefOr[EnvironmentMap] = js.native
  
  /**
    * The path where inference code is stored. This can be either in Amazon EC2 Container Registry or in a Docker registry that is accessible from the same VPC that you configure for your endpoint. If you are using your own custom algorithm instead of an algorithm provided by Amazon SageMaker, the inference code must meet Amazon SageMaker requirements. Amazon SageMaker supports both registry/repository[:tag] and registry/repository[@digest] image path formats. For more information, see Using Your Own Algorithms with Amazon SageMaker 
    */
  var Image: js.UndefOr[ContainerImage] = js.native
  
  /**
    * Specifies whether the model container is in Amazon ECR or a private Docker registry accessible from your Amazon Virtual Private Cloud (VPC). For information about storing containers in a private Docker registry, see Use a Private Docker Registry for Real-Time Inference Containers 
    */
  var ImageConfig: js.UndefOr[typings.awsSdk.sagemakerMod.ImageConfig] = js.native
  
  /**
    * Whether the container hosts a single model or multiple models.
    */
  var Mode: js.UndefOr[ContainerMode] = js.native
  
  /**
    * The S3 path where the model artifacts, which result from model training, are stored. This path must point to a single gzip compressed tar archive (.tar.gz suffix). The S3 path is required for Amazon SageMaker built-in algorithms, but not if you use your own algorithms. For more information on built-in algorithms, see Common Parameters.   The model artifacts must be in an S3 bucket that is in the same region as the model or endpoint you are creating.  If you provide a value for this parameter, Amazon SageMaker uses AWS Security Token Service to download model artifacts from the S3 path you provide. AWS STS is activated in your IAM user account by default. If you previously deactivated AWS STS for a region, you need to reactivate AWS STS for that region. For more information, see Activating and Deactivating AWS STS in an AWS Region in the AWS Identity and Access Management User Guide.  If you use a built-in algorithm to create a model, Amazon SageMaker requires that you provide a S3 path to the model artifacts in ModelDataUrl. 
    */
  var ModelDataUrl: js.UndefOr[Url] = js.native
  
  /**
    * The name or Amazon Resource Name (ARN) of the model package to use to create the model.
    */
  var ModelPackageName: js.UndefOr[VersionedArnOrName] = js.native
}
object ContainerDefinition {
  
  @scala.inline
  def apply(): ContainerDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerDefinition]
  }
  
  @scala.inline
  implicit class ContainerDefinitionMutableBuilder[Self <: ContainerDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerHostname(value: ContainerHostname): Self = StObject.set(x, "ContainerHostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerHostnameUndefined: Self = StObject.set(x, "ContainerHostname", js.undefined)
    
    @scala.inline
    def setEnvironment(value: EnvironmentMap): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
    
    @scala.inline
    def setImage(value: ContainerImage): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageConfig(value: ImageConfig): Self = StObject.set(x, "ImageConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageConfigUndefined: Self = StObject.set(x, "ImageConfig", js.undefined)
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "Image", js.undefined)
    
    @scala.inline
    def setMode(value: ContainerMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    @scala.inline
    def setModelDataUrl(value: Url): Self = StObject.set(x, "ModelDataUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelDataUrlUndefined: Self = StObject.set(x, "ModelDataUrl", js.undefined)
    
    @scala.inline
    def setModelPackageName(value: VersionedArnOrName): Self = StObject.set(x, "ModelPackageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelPackageNameUndefined: Self = StObject.set(x, "ModelPackageName", js.undefined)
  }
}
