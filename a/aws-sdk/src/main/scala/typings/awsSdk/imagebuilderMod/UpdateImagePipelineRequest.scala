package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateImagePipelineRequest extends js.Object {
  
  /**
    * The idempotency token used to make this request idempotent. 
    */
  var clientToken: ClientToken = js.native
  
  /**
    * The description of the image pipeline. 
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the distribution configuration that will be used to configure and distribute images updated by this image pipeline. 
    */
  var distributionConfigurationArn: js.UndefOr[DistributionConfigurationArn] = js.native
  
  /**
    *  Collects additional information about the image being created, including the operating system (OS) version and package list. This information is used to enhance the overall experience of using EC2 Image Builder. Enabled by default. 
    */
  var enhancedImageMetadataEnabled: js.UndefOr[NullableBoolean] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the image pipeline that you want to update. 
    */
  var imagePipelineArn: ImagePipelineArn = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the image recipe that will be used to configure images updated by this image pipeline. 
    */
  var imageRecipeArn: ImageRecipeArn = js.native
  
  /**
    * The image test configuration of the image pipeline. 
    */
  var imageTestsConfiguration: js.UndefOr[ImageTestsConfiguration] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the infrastructure configuration that will be used to build images updated by this image pipeline. 
    */
  var infrastructureConfigurationArn: InfrastructureConfigurationArn = js.native
  
  /**
    * The schedule of the image pipeline. 
    */
  var schedule: js.UndefOr[Schedule] = js.native
  
  /**
    * The status of the image pipeline. 
    */
  var status: js.UndefOr[PipelineStatus] = js.native
}
object UpdateImagePipelineRequest {
  
  @scala.inline
  def apply(
    clientToken: ClientToken,
    imagePipelineArn: ImagePipelineArn,
    imageRecipeArn: ImageRecipeArn,
    infrastructureConfigurationArn: InfrastructureConfigurationArn
  ): UpdateImagePipelineRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], imagePipelineArn = imagePipelineArn.asInstanceOf[js.Any], imageRecipeArn = imageRecipeArn.asInstanceOf[js.Any], infrastructureConfigurationArn = infrastructureConfigurationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateImagePipelineRequest]
  }
  
  @scala.inline
  implicit class UpdateImagePipelineRequestOps[Self <: UpdateImagePipelineRequest] (val x: Self) extends AnyVal {
    
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
    def setClientToken(value: ClientToken): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePipelineArn(value: ImagePipelineArn): Self = this.set("imagePipelineArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageRecipeArn(value: ImageRecipeArn): Self = this.set("imageRecipeArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfrastructureConfigurationArn(value: InfrastructureConfigurationArn): Self = this.set("infrastructureConfigurationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: NonEmptyString): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDistributionConfigurationArn(value: DistributionConfigurationArn): Self = this.set("distributionConfigurationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistributionConfigurationArn: Self = this.set("distributionConfigurationArn", js.undefined)
    
    @scala.inline
    def setEnhancedImageMetadataEnabled(value: NullableBoolean): Self = this.set("enhancedImageMetadataEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnhancedImageMetadataEnabled: Self = this.set("enhancedImageMetadataEnabled", js.undefined)
    
    @scala.inline
    def setImageTestsConfiguration(value: ImageTestsConfiguration): Self = this.set("imageTestsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageTestsConfiguration: Self = this.set("imageTestsConfiguration", js.undefined)
    
    @scala.inline
    def setSchedule(value: Schedule): Self = this.set("schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchedule: Self = this.set("schedule", js.undefined)
    
    @scala.inline
    def setStatus(value: PipelineStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
