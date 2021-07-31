package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateImageRequest extends StObject {
  
  /**
    *  The idempotency token used to make this request idempotent. 
    */
  var clientToken: ClientToken
  
  /**
    *  The Amazon Resource Name (ARN) of the distribution configuration that defines and configures the outputs of your pipeline. 
    */
  var distributionConfigurationArn: js.UndefOr[DistributionConfigurationArn] = js.undefined
  
  /**
    *  Collects additional information about the image being created, including the operating system (OS) version and package list. This information is used to enhance the overall experience of using EC2 Image Builder. Enabled by default. 
    */
  var enhancedImageMetadataEnabled: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the image recipe that defines how images are configured, tested, and assessed. 
    */
  var imageRecipeArn: ImageRecipeArn
  
  /**
    *  The image tests configuration of the image. 
    */
  var imageTestsConfiguration: js.UndefOr[ImageTestsConfiguration] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the infrastructure configuration that defines the environment in which your image will be built and tested. 
    */
  var infrastructureConfigurationArn: InfrastructureConfigurationArn
  
  /**
    *  The tags of the image. 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateImageRequest {
  
  @scala.inline
  def apply(
    clientToken: ClientToken,
    imageRecipeArn: ImageRecipeArn,
    infrastructureConfigurationArn: InfrastructureConfigurationArn
  ): CreateImageRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], imageRecipeArn = imageRecipeArn.asInstanceOf[js.Any], infrastructureConfigurationArn = infrastructureConfigurationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateImageRequest]
  }
  
  @scala.inline
  implicit class CreateImageRequestMutableBuilder[Self <: CreateImageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionConfigurationArn(value: DistributionConfigurationArn): Self = StObject.set(x, "distributionConfigurationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionConfigurationArnUndefined: Self = StObject.set(x, "distributionConfigurationArn", js.undefined)
    
    @scala.inline
    def setEnhancedImageMetadataEnabled(value: NullableBoolean): Self = StObject.set(x, "enhancedImageMetadataEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnhancedImageMetadataEnabledUndefined: Self = StObject.set(x, "enhancedImageMetadataEnabled", js.undefined)
    
    @scala.inline
    def setImageRecipeArn(value: ImageRecipeArn): Self = StObject.set(x, "imageRecipeArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageTestsConfiguration(value: ImageTestsConfiguration): Self = StObject.set(x, "imageTestsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageTestsConfigurationUndefined: Self = StObject.set(x, "imageTestsConfiguration", js.undefined)
    
    @scala.inline
    def setInfrastructureConfigurationArn(value: InfrastructureConfigurationArn): Self = StObject.set(x, "infrastructureConfigurationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
