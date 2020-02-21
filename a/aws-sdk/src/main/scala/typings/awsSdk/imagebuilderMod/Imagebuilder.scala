package typings.awsSdk.imagebuilderMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Imagebuilder extends Service {
  @JSName("config")
  var config_Imagebuilder: ConfigBase with ClientConfiguration = js.native
  /**
    * CancelImageCreation cancels the creation of Image. This operation can only be used on images in a non-terminal state.
    */
  def cancelImageCreation(): Request[CancelImageCreationResponse, AWSError] = js.native
  def cancelImageCreation(callback: js.Function2[/* err */ AWSError, /* data */ CancelImageCreationResponse, Unit]): Request[CancelImageCreationResponse, AWSError] = js.native
  /**
    * CancelImageCreation cancels the creation of Image. This operation can only be used on images in a non-terminal state.
    */
  def cancelImageCreation(params: CancelImageCreationRequest): Request[CancelImageCreationResponse, AWSError] = js.native
  def cancelImageCreation(
    params: CancelImageCreationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelImageCreationResponse, Unit]
  ): Request[CancelImageCreationResponse, AWSError] = js.native
  /**
    * Creates a new component that can be used to build, validate, test, and assess your image.
    */
  def createComponent(): Request[CreateComponentResponse, AWSError] = js.native
  def createComponent(callback: js.Function2[/* err */ AWSError, /* data */ CreateComponentResponse, Unit]): Request[CreateComponentResponse, AWSError] = js.native
  /**
    * Creates a new component that can be used to build, validate, test, and assess your image.
    */
  def createComponent(params: CreateComponentRequest): Request[CreateComponentResponse, AWSError] = js.native
  def createComponent(
    params: CreateComponentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateComponentResponse, Unit]
  ): Request[CreateComponentResponse, AWSError] = js.native
  /**
    * Creates a new distribution configuration. Distribution configurations define and configure the outputs of your pipeline. 
    */
  def createDistributionConfiguration(): Request[CreateDistributionConfigurationResponse, AWSError] = js.native
  def createDistributionConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDistributionConfigurationResponse, Unit]
  ): Request[CreateDistributionConfigurationResponse, AWSError] = js.native
  /**
    * Creates a new distribution configuration. Distribution configurations define and configure the outputs of your pipeline. 
    */
  def createDistributionConfiguration(params: CreateDistributionConfigurationRequest): Request[CreateDistributionConfigurationResponse, AWSError] = js.native
  def createDistributionConfiguration(
    params: CreateDistributionConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDistributionConfigurationResponse, Unit]
  ): Request[CreateDistributionConfigurationResponse, AWSError] = js.native
  /**
    *  Creates a new image. This request will create a new image along with all of the configured output resources defined in the distribution configuration. 
    */
  def createImage(): Request[CreateImageResponse, AWSError] = js.native
  def createImage(callback: js.Function2[/* err */ AWSError, /* data */ CreateImageResponse, Unit]): Request[CreateImageResponse, AWSError] = js.native
  /**
    *  Creates a new image. This request will create a new image along with all of the configured output resources defined in the distribution configuration. 
    */
  def createImage(params: CreateImageRequest): Request[CreateImageResponse, AWSError] = js.native
  def createImage(
    params: CreateImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateImageResponse, Unit]
  ): Request[CreateImageResponse, AWSError] = js.native
  /**
    *  Creates a new image pipeline. Image pipelines enable you to automate the creation and distribution of images. 
    */
  def createImagePipeline(): Request[CreateImagePipelineResponse, AWSError] = js.native
  def createImagePipeline(callback: js.Function2[/* err */ AWSError, /* data */ CreateImagePipelineResponse, Unit]): Request[CreateImagePipelineResponse, AWSError] = js.native
  /**
    *  Creates a new image pipeline. Image pipelines enable you to automate the creation and distribution of images. 
    */
  def createImagePipeline(params: CreateImagePipelineRequest): Request[CreateImagePipelineResponse, AWSError] = js.native
  def createImagePipeline(
    params: CreateImagePipelineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateImagePipelineResponse, Unit]
  ): Request[CreateImagePipelineResponse, AWSError] = js.native
  /**
    *  Creates a new image recipe. Image recipes define how images are configured, tested, and assessed. 
    */
  def createImageRecipe(): Request[CreateImageRecipeResponse, AWSError] = js.native
  def createImageRecipe(callback: js.Function2[/* err */ AWSError, /* data */ CreateImageRecipeResponse, Unit]): Request[CreateImageRecipeResponse, AWSError] = js.native
  /**
    *  Creates a new image recipe. Image recipes define how images are configured, tested, and assessed. 
    */
  def createImageRecipe(params: CreateImageRecipeRequest): Request[CreateImageRecipeResponse, AWSError] = js.native
  def createImageRecipe(
    params: CreateImageRecipeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateImageRecipeResponse, Unit]
  ): Request[CreateImageRecipeResponse, AWSError] = js.native
  /**
    *  Creates a new infrastructure configuration. An infrastructure configuration defines the environment in which your image will be built and tested. 
    */
  def createInfrastructureConfiguration(): Request[CreateInfrastructureConfigurationResponse, AWSError] = js.native
  def createInfrastructureConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateInfrastructureConfigurationResponse, Unit]
  ): Request[CreateInfrastructureConfigurationResponse, AWSError] = js.native
  /**
    *  Creates a new infrastructure configuration. An infrastructure configuration defines the environment in which your image will be built and tested. 
    */
  def createInfrastructureConfiguration(params: CreateInfrastructureConfigurationRequest): Request[CreateInfrastructureConfigurationResponse, AWSError] = js.native
  def createInfrastructureConfiguration(
    params: CreateInfrastructureConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateInfrastructureConfigurationResponse, Unit]
  ): Request[CreateInfrastructureConfigurationResponse, AWSError] = js.native
  /**
    *  Deletes a component build version. 
    */
  def deleteComponent(): Request[DeleteComponentResponse, AWSError] = js.native
  def deleteComponent(callback: js.Function2[/* err */ AWSError, /* data */ DeleteComponentResponse, Unit]): Request[DeleteComponentResponse, AWSError] = js.native
  /**
    *  Deletes a component build version. 
    */
  def deleteComponent(params: DeleteComponentRequest): Request[DeleteComponentResponse, AWSError] = js.native
  def deleteComponent(
    params: DeleteComponentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteComponentResponse, Unit]
  ): Request[DeleteComponentResponse, AWSError] = js.native
  /**
    *  Deletes a distribution configuration. 
    */
  def deleteDistributionConfiguration(): Request[DeleteDistributionConfigurationResponse, AWSError] = js.native
  def deleteDistributionConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDistributionConfigurationResponse, Unit]
  ): Request[DeleteDistributionConfigurationResponse, AWSError] = js.native
  /**
    *  Deletes a distribution configuration. 
    */
  def deleteDistributionConfiguration(params: DeleteDistributionConfigurationRequest): Request[DeleteDistributionConfigurationResponse, AWSError] = js.native
  def deleteDistributionConfiguration(
    params: DeleteDistributionConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDistributionConfigurationResponse, Unit]
  ): Request[DeleteDistributionConfigurationResponse, AWSError] = js.native
  /**
    *  Deletes an image. 
    */
  def deleteImage(): Request[DeleteImageResponse, AWSError] = js.native
  def deleteImage(callback: js.Function2[/* err */ AWSError, /* data */ DeleteImageResponse, Unit]): Request[DeleteImageResponse, AWSError] = js.native
  /**
    *  Deletes an image. 
    */
  def deleteImage(params: DeleteImageRequest): Request[DeleteImageResponse, AWSError] = js.native
  def deleteImage(
    params: DeleteImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteImageResponse, Unit]
  ): Request[DeleteImageResponse, AWSError] = js.native
  /**
    *  Deletes an image pipeline. 
    */
  def deleteImagePipeline(): Request[DeleteImagePipelineResponse, AWSError] = js.native
  def deleteImagePipeline(callback: js.Function2[/* err */ AWSError, /* data */ DeleteImagePipelineResponse, Unit]): Request[DeleteImagePipelineResponse, AWSError] = js.native
  /**
    *  Deletes an image pipeline. 
    */
  def deleteImagePipeline(params: DeleteImagePipelineRequest): Request[DeleteImagePipelineResponse, AWSError] = js.native
  def deleteImagePipeline(
    params: DeleteImagePipelineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteImagePipelineResponse, Unit]
  ): Request[DeleteImagePipelineResponse, AWSError] = js.native
  /**
    *  Deletes an image recipe. 
    */
  def deleteImageRecipe(): Request[DeleteImageRecipeResponse, AWSError] = js.native
  def deleteImageRecipe(callback: js.Function2[/* err */ AWSError, /* data */ DeleteImageRecipeResponse, Unit]): Request[DeleteImageRecipeResponse, AWSError] = js.native
  /**
    *  Deletes an image recipe. 
    */
  def deleteImageRecipe(params: DeleteImageRecipeRequest): Request[DeleteImageRecipeResponse, AWSError] = js.native
  def deleteImageRecipe(
    params: DeleteImageRecipeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteImageRecipeResponse, Unit]
  ): Request[DeleteImageRecipeResponse, AWSError] = js.native
  /**
    *  Deletes an infrastructure configuration. 
    */
  def deleteInfrastructureConfiguration(): Request[DeleteInfrastructureConfigurationResponse, AWSError] = js.native
  def deleteInfrastructureConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteInfrastructureConfigurationResponse, Unit]
  ): Request[DeleteInfrastructureConfigurationResponse, AWSError] = js.native
  /**
    *  Deletes an infrastructure configuration. 
    */
  def deleteInfrastructureConfiguration(params: DeleteInfrastructureConfigurationRequest): Request[DeleteInfrastructureConfigurationResponse, AWSError] = js.native
  def deleteInfrastructureConfiguration(
    params: DeleteInfrastructureConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteInfrastructureConfigurationResponse, Unit]
  ): Request[DeleteInfrastructureConfigurationResponse, AWSError] = js.native
  /**
    *  Gets a component object. 
    */
  def getComponent(): Request[GetComponentResponse, AWSError] = js.native
  def getComponent(callback: js.Function2[/* err */ AWSError, /* data */ GetComponentResponse, Unit]): Request[GetComponentResponse, AWSError] = js.native
  /**
    *  Gets a component object. 
    */
  def getComponent(params: GetComponentRequest): Request[GetComponentResponse, AWSError] = js.native
  def getComponent(
    params: GetComponentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetComponentResponse, Unit]
  ): Request[GetComponentResponse, AWSError] = js.native
  /**
    *  Gets a component policy. 
    */
  def getComponentPolicy(): Request[GetComponentPolicyResponse, AWSError] = js.native
  def getComponentPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetComponentPolicyResponse, Unit]): Request[GetComponentPolicyResponse, AWSError] = js.native
  /**
    *  Gets a component policy. 
    */
  def getComponentPolicy(params: GetComponentPolicyRequest): Request[GetComponentPolicyResponse, AWSError] = js.native
  def getComponentPolicy(
    params: GetComponentPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetComponentPolicyResponse, Unit]
  ): Request[GetComponentPolicyResponse, AWSError] = js.native
  /**
    *  Gets a distribution configuration. 
    */
  def getDistributionConfiguration(): Request[GetDistributionConfigurationResponse, AWSError] = js.native
  def getDistributionConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ GetDistributionConfigurationResponse, Unit]): Request[GetDistributionConfigurationResponse, AWSError] = js.native
  /**
    *  Gets a distribution configuration. 
    */
  def getDistributionConfiguration(params: GetDistributionConfigurationRequest): Request[GetDistributionConfigurationResponse, AWSError] = js.native
  def getDistributionConfiguration(
    params: GetDistributionConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDistributionConfigurationResponse, Unit]
  ): Request[GetDistributionConfigurationResponse, AWSError] = js.native
  /**
    *  Gets an image. 
    */
  def getImage(): Request[GetImageResponse, AWSError] = js.native
  def getImage(callback: js.Function2[/* err */ AWSError, /* data */ GetImageResponse, Unit]): Request[GetImageResponse, AWSError] = js.native
  /**
    *  Gets an image. 
    */
  def getImage(params: GetImageRequest): Request[GetImageResponse, AWSError] = js.native
  def getImage(
    params: GetImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetImageResponse, Unit]
  ): Request[GetImageResponse, AWSError] = js.native
  /**
    *  Gets an image pipeline. 
    */
  def getImagePipeline(): Request[GetImagePipelineResponse, AWSError] = js.native
  def getImagePipeline(callback: js.Function2[/* err */ AWSError, /* data */ GetImagePipelineResponse, Unit]): Request[GetImagePipelineResponse, AWSError] = js.native
  /**
    *  Gets an image pipeline. 
    */
  def getImagePipeline(params: GetImagePipelineRequest): Request[GetImagePipelineResponse, AWSError] = js.native
  def getImagePipeline(
    params: GetImagePipelineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetImagePipelineResponse, Unit]
  ): Request[GetImagePipelineResponse, AWSError] = js.native
  /**
    *  Gets an image policy. 
    */
  def getImagePolicy(): Request[GetImagePolicyResponse, AWSError] = js.native
  def getImagePolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetImagePolicyResponse, Unit]): Request[GetImagePolicyResponse, AWSError] = js.native
  /**
    *  Gets an image policy. 
    */
  def getImagePolicy(params: GetImagePolicyRequest): Request[GetImagePolicyResponse, AWSError] = js.native
  def getImagePolicy(
    params: GetImagePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetImagePolicyResponse, Unit]
  ): Request[GetImagePolicyResponse, AWSError] = js.native
  /**
    *  Gets an image recipe. 
    */
  def getImageRecipe(): Request[GetImageRecipeResponse, AWSError] = js.native
  def getImageRecipe(callback: js.Function2[/* err */ AWSError, /* data */ GetImageRecipeResponse, Unit]): Request[GetImageRecipeResponse, AWSError] = js.native
  /**
    *  Gets an image recipe. 
    */
  def getImageRecipe(params: GetImageRecipeRequest): Request[GetImageRecipeResponse, AWSError] = js.native
  def getImageRecipe(
    params: GetImageRecipeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetImageRecipeResponse, Unit]
  ): Request[GetImageRecipeResponse, AWSError] = js.native
  /**
    *  Gets an image recipe policy. 
    */
  def getImageRecipePolicy(): Request[GetImageRecipePolicyResponse, AWSError] = js.native
  def getImageRecipePolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetImageRecipePolicyResponse, Unit]): Request[GetImageRecipePolicyResponse, AWSError] = js.native
  /**
    *  Gets an image recipe policy. 
    */
  def getImageRecipePolicy(params: GetImageRecipePolicyRequest): Request[GetImageRecipePolicyResponse, AWSError] = js.native
  def getImageRecipePolicy(
    params: GetImageRecipePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetImageRecipePolicyResponse, Unit]
  ): Request[GetImageRecipePolicyResponse, AWSError] = js.native
  /**
    *  Gets an infrastructure configuration. 
    */
  def getInfrastructureConfiguration(): Request[GetInfrastructureConfigurationResponse, AWSError] = js.native
  def getInfrastructureConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ GetInfrastructureConfigurationResponse, Unit]
  ): Request[GetInfrastructureConfigurationResponse, AWSError] = js.native
  /**
    *  Gets an infrastructure configuration. 
    */
  def getInfrastructureConfiguration(params: GetInfrastructureConfigurationRequest): Request[GetInfrastructureConfigurationResponse, AWSError] = js.native
  def getInfrastructureConfiguration(
    params: GetInfrastructureConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetInfrastructureConfigurationResponse, Unit]
  ): Request[GetInfrastructureConfigurationResponse, AWSError] = js.native
  /**
    * Imports a component and transforms its data into a component document. 
    */
  def importComponent(): Request[ImportComponentResponse, AWSError] = js.native
  def importComponent(callback: js.Function2[/* err */ AWSError, /* data */ ImportComponentResponse, Unit]): Request[ImportComponentResponse, AWSError] = js.native
  /**
    * Imports a component and transforms its data into a component document. 
    */
  def importComponent(params: ImportComponentRequest): Request[ImportComponentResponse, AWSError] = js.native
  def importComponent(
    params: ImportComponentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ImportComponentResponse, Unit]
  ): Request[ImportComponentResponse, AWSError] = js.native
  /**
    *  Returns the list of component build versions for the specified semantic version. 
    */
  def listComponentBuildVersions(): Request[ListComponentBuildVersionsResponse, AWSError] = js.native
  def listComponentBuildVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListComponentBuildVersionsResponse, Unit]): Request[ListComponentBuildVersionsResponse, AWSError] = js.native
  /**
    *  Returns the list of component build versions for the specified semantic version. 
    */
  def listComponentBuildVersions(params: ListComponentBuildVersionsRequest): Request[ListComponentBuildVersionsResponse, AWSError] = js.native
  def listComponentBuildVersions(
    params: ListComponentBuildVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListComponentBuildVersionsResponse, Unit]
  ): Request[ListComponentBuildVersionsResponse, AWSError] = js.native
  /**
    * Returns the list of component build versions for the specified semantic version. 
    */
  def listComponents(): Request[ListComponentsResponse, AWSError] = js.native
  def listComponents(callback: js.Function2[/* err */ AWSError, /* data */ ListComponentsResponse, Unit]): Request[ListComponentsResponse, AWSError] = js.native
  /**
    * Returns the list of component build versions for the specified semantic version. 
    */
  def listComponents(params: ListComponentsRequest): Request[ListComponentsResponse, AWSError] = js.native
  def listComponents(
    params: ListComponentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListComponentsResponse, Unit]
  ): Request[ListComponentsResponse, AWSError] = js.native
  /**
    *  Returns a list of distribution configurations. 
    */
  def listDistributionConfigurations(): Request[ListDistributionConfigurationsResponse, AWSError] = js.native
  def listDistributionConfigurations(
    callback: js.Function2[/* err */ AWSError, /* data */ ListDistributionConfigurationsResponse, Unit]
  ): Request[ListDistributionConfigurationsResponse, AWSError] = js.native
  /**
    *  Returns a list of distribution configurations. 
    */
  def listDistributionConfigurations(params: ListDistributionConfigurationsRequest): Request[ListDistributionConfigurationsResponse, AWSError] = js.native
  def listDistributionConfigurations(
    params: ListDistributionConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDistributionConfigurationsResponse, Unit]
  ): Request[ListDistributionConfigurationsResponse, AWSError] = js.native
  /**
    *  Returns a list of distribution configurations. 
    */
  def listImageBuildVersions(): Request[ListImageBuildVersionsResponse, AWSError] = js.native
  def listImageBuildVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListImageBuildVersionsResponse, Unit]): Request[ListImageBuildVersionsResponse, AWSError] = js.native
  /**
    *  Returns a list of distribution configurations. 
    */
  def listImageBuildVersions(params: ListImageBuildVersionsRequest): Request[ListImageBuildVersionsResponse, AWSError] = js.native
  def listImageBuildVersions(
    params: ListImageBuildVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListImageBuildVersionsResponse, Unit]
  ): Request[ListImageBuildVersionsResponse, AWSError] = js.native
  /**
    *  Returns a list of images created by the specified pipeline. 
    */
  def listImagePipelineImages(): Request[ListImagePipelineImagesResponse, AWSError] = js.native
  def listImagePipelineImages(callback: js.Function2[/* err */ AWSError, /* data */ ListImagePipelineImagesResponse, Unit]): Request[ListImagePipelineImagesResponse, AWSError] = js.native
  /**
    *  Returns a list of images created by the specified pipeline. 
    */
  def listImagePipelineImages(params: ListImagePipelineImagesRequest): Request[ListImagePipelineImagesResponse, AWSError] = js.native
  def listImagePipelineImages(
    params: ListImagePipelineImagesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListImagePipelineImagesResponse, Unit]
  ): Request[ListImagePipelineImagesResponse, AWSError] = js.native
  /**
    * Returns a list of image pipelines. 
    */
  def listImagePipelines(): Request[ListImagePipelinesResponse, AWSError] = js.native
  def listImagePipelines(callback: js.Function2[/* err */ AWSError, /* data */ ListImagePipelinesResponse, Unit]): Request[ListImagePipelinesResponse, AWSError] = js.native
  /**
    * Returns a list of image pipelines. 
    */
  def listImagePipelines(params: ListImagePipelinesRequest): Request[ListImagePipelinesResponse, AWSError] = js.native
  def listImagePipelines(
    params: ListImagePipelinesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListImagePipelinesResponse, Unit]
  ): Request[ListImagePipelinesResponse, AWSError] = js.native
  /**
    *  Returns a list of image recipes. 
    */
  def listImageRecipes(): Request[ListImageRecipesResponse, AWSError] = js.native
  def listImageRecipes(callback: js.Function2[/* err */ AWSError, /* data */ ListImageRecipesResponse, Unit]): Request[ListImageRecipesResponse, AWSError] = js.native
  /**
    *  Returns a list of image recipes. 
    */
  def listImageRecipes(params: ListImageRecipesRequest): Request[ListImageRecipesResponse, AWSError] = js.native
  def listImageRecipes(
    params: ListImageRecipesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListImageRecipesResponse, Unit]
  ): Request[ListImageRecipesResponse, AWSError] = js.native
  /**
    *  Returns the list of image build versions for the specified semantic version. 
    */
  def listImages(): Request[ListImagesResponse, AWSError] = js.native
  def listImages(callback: js.Function2[/* err */ AWSError, /* data */ ListImagesResponse, Unit]): Request[ListImagesResponse, AWSError] = js.native
  /**
    *  Returns the list of image build versions for the specified semantic version. 
    */
  def listImages(params: ListImagesRequest): Request[ListImagesResponse, AWSError] = js.native
  def listImages(
    params: ListImagesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListImagesResponse, Unit]
  ): Request[ListImagesResponse, AWSError] = js.native
  /**
    *  Returns a list of infrastructure configurations. 
    */
  def listInfrastructureConfigurations(): Request[ListInfrastructureConfigurationsResponse, AWSError] = js.native
  def listInfrastructureConfigurations(
    callback: js.Function2[/* err */ AWSError, /* data */ ListInfrastructureConfigurationsResponse, Unit]
  ): Request[ListInfrastructureConfigurationsResponse, AWSError] = js.native
  /**
    *  Returns a list of infrastructure configurations. 
    */
  def listInfrastructureConfigurations(params: ListInfrastructureConfigurationsRequest): Request[ListInfrastructureConfigurationsResponse, AWSError] = js.native
  def listInfrastructureConfigurations(
    params: ListInfrastructureConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListInfrastructureConfigurationsResponse, Unit]
  ): Request[ListInfrastructureConfigurationsResponse, AWSError] = js.native
  /**
    *  Returns the list of tags for the specified resource. 
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    *  Returns the list of tags for the specified resource. 
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    *  Applies a policy to a component. 
    */
  def putComponentPolicy(): Request[PutComponentPolicyResponse, AWSError] = js.native
  def putComponentPolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutComponentPolicyResponse, Unit]): Request[PutComponentPolicyResponse, AWSError] = js.native
  /**
    *  Applies a policy to a component. 
    */
  def putComponentPolicy(params: PutComponentPolicyRequest): Request[PutComponentPolicyResponse, AWSError] = js.native
  def putComponentPolicy(
    params: PutComponentPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutComponentPolicyResponse, Unit]
  ): Request[PutComponentPolicyResponse, AWSError] = js.native
  /**
    *  Applies a policy to an image. 
    */
  def putImagePolicy(): Request[PutImagePolicyResponse, AWSError] = js.native
  def putImagePolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutImagePolicyResponse, Unit]): Request[PutImagePolicyResponse, AWSError] = js.native
  /**
    *  Applies a policy to an image. 
    */
  def putImagePolicy(params: PutImagePolicyRequest): Request[PutImagePolicyResponse, AWSError] = js.native
  def putImagePolicy(
    params: PutImagePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutImagePolicyResponse, Unit]
  ): Request[PutImagePolicyResponse, AWSError] = js.native
  /**
    *  Applies a policy to an image recipe. 
    */
  def putImageRecipePolicy(): Request[PutImageRecipePolicyResponse, AWSError] = js.native
  def putImageRecipePolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutImageRecipePolicyResponse, Unit]): Request[PutImageRecipePolicyResponse, AWSError] = js.native
  /**
    *  Applies a policy to an image recipe. 
    */
  def putImageRecipePolicy(params: PutImageRecipePolicyRequest): Request[PutImageRecipePolicyResponse, AWSError] = js.native
  def putImageRecipePolicy(
    params: PutImageRecipePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutImageRecipePolicyResponse, Unit]
  ): Request[PutImageRecipePolicyResponse, AWSError] = js.native
  /**
    *  Manually triggers a pipeline to create an image. 
    */
  def startImagePipelineExecution(): Request[StartImagePipelineExecutionResponse, AWSError] = js.native
  def startImagePipelineExecution(callback: js.Function2[/* err */ AWSError, /* data */ StartImagePipelineExecutionResponse, Unit]): Request[StartImagePipelineExecutionResponse, AWSError] = js.native
  /**
    *  Manually triggers a pipeline to create an image. 
    */
  def startImagePipelineExecution(params: StartImagePipelineExecutionRequest): Request[StartImagePipelineExecutionResponse, AWSError] = js.native
  def startImagePipelineExecution(
    params: StartImagePipelineExecutionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartImagePipelineExecutionResponse, Unit]
  ): Request[StartImagePipelineExecutionResponse, AWSError] = js.native
  /**
    *  Adds a tag to a resource. 
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    *  Adds a tag to a resource. 
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  /**
    *  Removes a tag from a resource. 
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    *  Removes a tag from a resource. 
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  /**
    *  Updates a new distribution configuration. Distribution configurations define and configure the outputs of your pipeline. 
    */
  def updateDistributionConfiguration(): Request[UpdateDistributionConfigurationResponse, AWSError] = js.native
  def updateDistributionConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDistributionConfigurationResponse, Unit]
  ): Request[UpdateDistributionConfigurationResponse, AWSError] = js.native
  /**
    *  Updates a new distribution configuration. Distribution configurations define and configure the outputs of your pipeline. 
    */
  def updateDistributionConfiguration(params: UpdateDistributionConfigurationRequest): Request[UpdateDistributionConfigurationResponse, AWSError] = js.native
  def updateDistributionConfiguration(
    params: UpdateDistributionConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDistributionConfigurationResponse, Unit]
  ): Request[UpdateDistributionConfigurationResponse, AWSError] = js.native
  /**
    *  Updates a new image pipeline. Image pipelines enable you to automate the creation and distribution of images. 
    */
  def updateImagePipeline(): Request[UpdateImagePipelineResponse, AWSError] = js.native
  def updateImagePipeline(callback: js.Function2[/* err */ AWSError, /* data */ UpdateImagePipelineResponse, Unit]): Request[UpdateImagePipelineResponse, AWSError] = js.native
  /**
    *  Updates a new image pipeline. Image pipelines enable you to automate the creation and distribution of images. 
    */
  def updateImagePipeline(params: UpdateImagePipelineRequest): Request[UpdateImagePipelineResponse, AWSError] = js.native
  def updateImagePipeline(
    params: UpdateImagePipelineRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateImagePipelineResponse, Unit]
  ): Request[UpdateImagePipelineResponse, AWSError] = js.native
  /**
    *  Updates a new infrastructure configuration. An infrastructure configuration defines the environment in which your image will be built and tested. 
    */
  def updateInfrastructureConfiguration(): Request[UpdateInfrastructureConfigurationResponse, AWSError] = js.native
  def updateInfrastructureConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateInfrastructureConfigurationResponse, Unit]
  ): Request[UpdateInfrastructureConfigurationResponse, AWSError] = js.native
  /**
    *  Updates a new infrastructure configuration. An infrastructure configuration defines the environment in which your image will be built and tested. 
    */
  def updateInfrastructureConfiguration(params: UpdateInfrastructureConfigurationRequest): Request[UpdateInfrastructureConfigurationResponse, AWSError] = js.native
  def updateInfrastructureConfiguration(
    params: UpdateInfrastructureConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateInfrastructureConfigurationResponse, Unit]
  ): Request[UpdateInfrastructureConfigurationResponse, AWSError] = js.native
}

