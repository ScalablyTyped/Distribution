package typings.awsSdk.ecrMod

import typings.awsSdk.DescribeImageScanFindings
import typings.awsSdk.GetLifecyclePolicyPreview
import typings.awsSdk.awsSdkStrings.imageScanComplete
import typings.awsSdk.awsSdkStrings.lifecyclePolicyPreviewComplete
import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECR extends Service {
  @JSName("config")
  var config_ECR: ConfigBase with ClientConfiguration = js.native
  /**
    * Checks the availability of one or more image layers in a repository. When an image is pushed to a repository, each image layer is checked to verify if it has been uploaded before. If it is, then the image layer is skipped. When an image is pulled from a repository, each image layer is checked once to verify it is available to be pulled.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
    */
  def batchCheckLayerAvailability(): Request[BatchCheckLayerAvailabilityResponse, AWSError] = js.native
  def batchCheckLayerAvailability(callback: js.Function2[/* err */ AWSError, /* data */ BatchCheckLayerAvailabilityResponse, Unit]): Request[BatchCheckLayerAvailabilityResponse, AWSError] = js.native
  /**
    * Checks the availability of one or more image layers in a repository. When an image is pushed to a repository, each image layer is checked to verify if it has been uploaded before. If it is, then the image layer is skipped. When an image is pulled from a repository, each image layer is checked once to verify it is available to be pulled.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
    */
  def batchCheckLayerAvailability(params: BatchCheckLayerAvailabilityRequest): Request[BatchCheckLayerAvailabilityResponse, AWSError] = js.native
  def batchCheckLayerAvailability(
    params: BatchCheckLayerAvailabilityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchCheckLayerAvailabilityResponse, Unit]
  ): Request[BatchCheckLayerAvailabilityResponse, AWSError] = js.native
  /**
    * Deletes a list of specified images within a repository. Images are specified with either an imageTag or imageDigest. You can remove a tag from an image by specifying the image's tag in your request. When you remove the last tag from an image, the image is deleted from your repository. You can completely delete an image (and all of its tags) by specifying the image's digest in your request.
    */
  def batchDeleteImage(): Request[BatchDeleteImageResponse, AWSError] = js.native
  def batchDeleteImage(callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteImageResponse, Unit]): Request[BatchDeleteImageResponse, AWSError] = js.native
  /**
    * Deletes a list of specified images within a repository. Images are specified with either an imageTag or imageDigest. You can remove a tag from an image by specifying the image's tag in your request. When you remove the last tag from an image, the image is deleted from your repository. You can completely delete an image (and all of its tags) by specifying the image's digest in your request.
    */
  def batchDeleteImage(params: BatchDeleteImageRequest): Request[BatchDeleteImageResponse, AWSError] = js.native
  def batchDeleteImage(
    params: BatchDeleteImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteImageResponse, Unit]
  ): Request[BatchDeleteImageResponse, AWSError] = js.native
  /**
    * Gets detailed information for an image. Images are specified with either an imageTag or imageDigest. When an image is pulled, the BatchGetImage API is called once to retrieve the image manifest.
    */
  def batchGetImage(): Request[BatchGetImageResponse, AWSError] = js.native
  def batchGetImage(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetImageResponse, Unit]): Request[BatchGetImageResponse, AWSError] = js.native
  /**
    * Gets detailed information for an image. Images are specified with either an imageTag or imageDigest. When an image is pulled, the BatchGetImage API is called once to retrieve the image manifest.
    */
  def batchGetImage(params: BatchGetImageRequest): Request[BatchGetImageResponse, AWSError] = js.native
  def batchGetImage(
    params: BatchGetImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetImageResponse, Unit]
  ): Request[BatchGetImageResponse, AWSError] = js.native
  /**
    * Informs Amazon ECR that the image layer upload has completed for a specified registry, repository name, and upload ID. You can optionally provide a sha256 digest of the image layer for data validation purposes. When an image is pushed, the CompleteLayerUpload API is called once per each new image layer to verify that the upload has completed.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
    */
  def completeLayerUpload(): Request[CompleteLayerUploadResponse, AWSError] = js.native
  def completeLayerUpload(callback: js.Function2[/* err */ AWSError, /* data */ CompleteLayerUploadResponse, Unit]): Request[CompleteLayerUploadResponse, AWSError] = js.native
  /**
    * Informs Amazon ECR that the image layer upload has completed for a specified registry, repository name, and upload ID. You can optionally provide a sha256 digest of the image layer for data validation purposes. When an image is pushed, the CompleteLayerUpload API is called once per each new image layer to verify that the upload has completed.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
    */
  def completeLayerUpload(params: CompleteLayerUploadRequest): Request[CompleteLayerUploadResponse, AWSError] = js.native
  def completeLayerUpload(
    params: CompleteLayerUploadRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CompleteLayerUploadResponse, Unit]
  ): Request[CompleteLayerUploadResponse, AWSError] = js.native
  /**
    * Creates a repository. For more information, see Amazon ECR Repositories in the Amazon Elastic Container Registry User Guide.
    */
  def createRepository(): Request[CreateRepositoryResponse, AWSError] = js.native
  def createRepository(callback: js.Function2[/* err */ AWSError, /* data */ CreateRepositoryResponse, Unit]): Request[CreateRepositoryResponse, AWSError] = js.native
  /**
    * Creates a repository. For more information, see Amazon ECR Repositories in the Amazon Elastic Container Registry User Guide.
    */
  def createRepository(params: CreateRepositoryRequest): Request[CreateRepositoryResponse, AWSError] = js.native
  def createRepository(
    params: CreateRepositoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRepositoryResponse, Unit]
  ): Request[CreateRepositoryResponse, AWSError] = js.native
  /**
    * Deletes the lifecycle policy associated with the specified repository.
    */
  def deleteLifecyclePolicy(): Request[DeleteLifecyclePolicyResponse, AWSError] = js.native
  def deleteLifecyclePolicy(callback: js.Function2[/* err */ AWSError, /* data */ DeleteLifecyclePolicyResponse, Unit]): Request[DeleteLifecyclePolicyResponse, AWSError] = js.native
  /**
    * Deletes the lifecycle policy associated with the specified repository.
    */
  def deleteLifecyclePolicy(params: DeleteLifecyclePolicyRequest): Request[DeleteLifecyclePolicyResponse, AWSError] = js.native
  def deleteLifecyclePolicy(
    params: DeleteLifecyclePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLifecyclePolicyResponse, Unit]
  ): Request[DeleteLifecyclePolicyResponse, AWSError] = js.native
  /**
    * Deletes a repository. If the repository contains images, you must either delete all images in the repository or use the force option to delete the repository.
    */
  def deleteRepository(): Request[DeleteRepositoryResponse, AWSError] = js.native
  def deleteRepository(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRepositoryResponse, Unit]): Request[DeleteRepositoryResponse, AWSError] = js.native
  /**
    * Deletes a repository. If the repository contains images, you must either delete all images in the repository or use the force option to delete the repository.
    */
  def deleteRepository(params: DeleteRepositoryRequest): Request[DeleteRepositoryResponse, AWSError] = js.native
  def deleteRepository(
    params: DeleteRepositoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRepositoryResponse, Unit]
  ): Request[DeleteRepositoryResponse, AWSError] = js.native
  /**
    * Deletes the repository policy associated with the specified repository.
    */
  def deleteRepositoryPolicy(): Request[DeleteRepositoryPolicyResponse, AWSError] = js.native
  def deleteRepositoryPolicy(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRepositoryPolicyResponse, Unit]): Request[DeleteRepositoryPolicyResponse, AWSError] = js.native
  /**
    * Deletes the repository policy associated with the specified repository.
    */
  def deleteRepositoryPolicy(params: DeleteRepositoryPolicyRequest): Request[DeleteRepositoryPolicyResponse, AWSError] = js.native
  def deleteRepositoryPolicy(
    params: DeleteRepositoryPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRepositoryPolicyResponse, Unit]
  ): Request[DeleteRepositoryPolicyResponse, AWSError] = js.native
  /**
    * Returns the scan findings for the specified image.
    */
  def describeImageScanFindings(): Request[DescribeImageScanFindingsResponse, AWSError] = js.native
  def describeImageScanFindings(callback: js.Function2[/* err */ AWSError, /* data */ DescribeImageScanFindingsResponse, Unit]): Request[DescribeImageScanFindingsResponse, AWSError] = js.native
  /**
    * Returns the scan findings for the specified image.
    */
  def describeImageScanFindings(params: DescribeImageScanFindingsRequest): Request[DescribeImageScanFindingsResponse, AWSError] = js.native
  def describeImageScanFindings(
    params: DescribeImageScanFindingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeImageScanFindingsResponse, Unit]
  ): Request[DescribeImageScanFindingsResponse, AWSError] = js.native
  /**
    * Returns metadata about the images in a repository.  Beginning with Docker version 1.9, the Docker client compresses image layers before pushing them to a V2 Docker registry. The output of the docker images command shows the uncompressed image size, so it may return a larger image size than the image sizes returned by DescribeImages. 
    */
  def describeImages(): Request[DescribeImagesResponse, AWSError] = js.native
  def describeImages(callback: js.Function2[/* err */ AWSError, /* data */ DescribeImagesResponse, Unit]): Request[DescribeImagesResponse, AWSError] = js.native
  /**
    * Returns metadata about the images in a repository.  Beginning with Docker version 1.9, the Docker client compresses image layers before pushing them to a V2 Docker registry. The output of the docker images command shows the uncompressed image size, so it may return a larger image size than the image sizes returned by DescribeImages. 
    */
  def describeImages(params: DescribeImagesRequest): Request[DescribeImagesResponse, AWSError] = js.native
  def describeImages(
    params: DescribeImagesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeImagesResponse, Unit]
  ): Request[DescribeImagesResponse, AWSError] = js.native
  /**
    * Describes image repositories in a registry.
    */
  def describeRepositories(): Request[DescribeRepositoriesResponse, AWSError] = js.native
  def describeRepositories(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRepositoriesResponse, Unit]): Request[DescribeRepositoriesResponse, AWSError] = js.native
  /**
    * Describes image repositories in a registry.
    */
  def describeRepositories(params: DescribeRepositoriesRequest): Request[DescribeRepositoriesResponse, AWSError] = js.native
  def describeRepositories(
    params: DescribeRepositoriesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRepositoriesResponse, Unit]
  ): Request[DescribeRepositoriesResponse, AWSError] = js.native
  /**
    * Retrieves an authorization token. An authorization token represents your IAM authentication credentials and can be used to access any Amazon ECR registry that your IAM principal has access to. The authorization token is valid for 12 hours. The authorizationToken returned is a base64 encoded string that can be decoded and used in a docker login command to authenticate to a registry. The AWS CLI offers an get-login-password command that simplifies the login process. For more information, see Registry Authentication in the Amazon Elastic Container Registry User Guide.
    */
  def getAuthorizationToken(): Request[GetAuthorizationTokenResponse, AWSError] = js.native
  def getAuthorizationToken(callback: js.Function2[/* err */ AWSError, /* data */ GetAuthorizationTokenResponse, Unit]): Request[GetAuthorizationTokenResponse, AWSError] = js.native
  /**
    * Retrieves an authorization token. An authorization token represents your IAM authentication credentials and can be used to access any Amazon ECR registry that your IAM principal has access to. The authorization token is valid for 12 hours. The authorizationToken returned is a base64 encoded string that can be decoded and used in a docker login command to authenticate to a registry. The AWS CLI offers an get-login-password command that simplifies the login process. For more information, see Registry Authentication in the Amazon Elastic Container Registry User Guide.
    */
  def getAuthorizationToken(params: GetAuthorizationTokenRequest): Request[GetAuthorizationTokenResponse, AWSError] = js.native
  def getAuthorizationToken(
    params: GetAuthorizationTokenRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAuthorizationTokenResponse, Unit]
  ): Request[GetAuthorizationTokenResponse, AWSError] = js.native
  /**
    * Retrieves the pre-signed Amazon S3 download URL corresponding to an image layer. You can only get URLs for image layers that are referenced in an image. When an image is pulled, the GetDownloadUrlForLayer API is called once per image layer.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
    */
  def getDownloadUrlForLayer(): Request[GetDownloadUrlForLayerResponse, AWSError] = js.native
  def getDownloadUrlForLayer(callback: js.Function2[/* err */ AWSError, /* data */ GetDownloadUrlForLayerResponse, Unit]): Request[GetDownloadUrlForLayerResponse, AWSError] = js.native
  /**
    * Retrieves the pre-signed Amazon S3 download URL corresponding to an image layer. You can only get URLs for image layers that are referenced in an image. When an image is pulled, the GetDownloadUrlForLayer API is called once per image layer.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
    */
  def getDownloadUrlForLayer(params: GetDownloadUrlForLayerRequest): Request[GetDownloadUrlForLayerResponse, AWSError] = js.native
  def getDownloadUrlForLayer(
    params: GetDownloadUrlForLayerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDownloadUrlForLayerResponse, Unit]
  ): Request[GetDownloadUrlForLayerResponse, AWSError] = js.native
  /**
    * Retrieves the lifecycle policy for the specified repository.
    */
  def getLifecyclePolicy(): Request[GetLifecyclePolicyResponse, AWSError] = js.native
  def getLifecyclePolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetLifecyclePolicyResponse, Unit]): Request[GetLifecyclePolicyResponse, AWSError] = js.native
  /**
    * Retrieves the lifecycle policy for the specified repository.
    */
  def getLifecyclePolicy(params: GetLifecyclePolicyRequest): Request[GetLifecyclePolicyResponse, AWSError] = js.native
  def getLifecyclePolicy(
    params: GetLifecyclePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLifecyclePolicyResponse, Unit]
  ): Request[GetLifecyclePolicyResponse, AWSError] = js.native
  /**
    * Retrieves the results of the lifecycle policy preview request for the specified repository.
    */
  def getLifecyclePolicyPreview(): Request[GetLifecyclePolicyPreviewResponse, AWSError] = js.native
  def getLifecyclePolicyPreview(callback: js.Function2[/* err */ AWSError, /* data */ GetLifecyclePolicyPreviewResponse, Unit]): Request[GetLifecyclePolicyPreviewResponse, AWSError] = js.native
  /**
    * Retrieves the results of the lifecycle policy preview request for the specified repository.
    */
  def getLifecyclePolicyPreview(params: GetLifecyclePolicyPreviewRequest): Request[GetLifecyclePolicyPreviewResponse, AWSError] = js.native
  def getLifecyclePolicyPreview(
    params: GetLifecyclePolicyPreviewRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLifecyclePolicyPreviewResponse, Unit]
  ): Request[GetLifecyclePolicyPreviewResponse, AWSError] = js.native
  /**
    * Retrieves the repository policy for the specified repository.
    */
  def getRepositoryPolicy(): Request[GetRepositoryPolicyResponse, AWSError] = js.native
  def getRepositoryPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetRepositoryPolicyResponse, Unit]): Request[GetRepositoryPolicyResponse, AWSError] = js.native
  /**
    * Retrieves the repository policy for the specified repository.
    */
  def getRepositoryPolicy(params: GetRepositoryPolicyRequest): Request[GetRepositoryPolicyResponse, AWSError] = js.native
  def getRepositoryPolicy(
    params: GetRepositoryPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRepositoryPolicyResponse, Unit]
  ): Request[GetRepositoryPolicyResponse, AWSError] = js.native
  /**
    * Notifies Amazon ECR that you intend to upload an image layer. When an image is pushed, the InitiateLayerUpload API is called once per image layer that has not already been uploaded. Whether an image layer has been uploaded before is determined by the BatchCheckLayerAvailability API action.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
    */
  def initiateLayerUpload(): Request[InitiateLayerUploadResponse, AWSError] = js.native
  def initiateLayerUpload(callback: js.Function2[/* err */ AWSError, /* data */ InitiateLayerUploadResponse, Unit]): Request[InitiateLayerUploadResponse, AWSError] = js.native
  /**
    * Notifies Amazon ECR that you intend to upload an image layer. When an image is pushed, the InitiateLayerUpload API is called once per image layer that has not already been uploaded. Whether an image layer has been uploaded before is determined by the BatchCheckLayerAvailability API action.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
    */
  def initiateLayerUpload(params: InitiateLayerUploadRequest): Request[InitiateLayerUploadResponse, AWSError] = js.native
  def initiateLayerUpload(
    params: InitiateLayerUploadRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ InitiateLayerUploadResponse, Unit]
  ): Request[InitiateLayerUploadResponse, AWSError] = js.native
  /**
    * Lists all the image IDs for the specified repository. You can filter images based on whether or not they are tagged by using the tagStatus filter and specifying either TAGGED, UNTAGGED or ANY. For example, you can filter your results to return only UNTAGGED images and then pipe that result to a BatchDeleteImage operation to delete them. Or, you can filter your results to return only TAGGED images to list all of the tags in your repository.
    */
  def listImages(): Request[ListImagesResponse, AWSError] = js.native
  def listImages(callback: js.Function2[/* err */ AWSError, /* data */ ListImagesResponse, Unit]): Request[ListImagesResponse, AWSError] = js.native
  /**
    * Lists all the image IDs for the specified repository. You can filter images based on whether or not they are tagged by using the tagStatus filter and specifying either TAGGED, UNTAGGED or ANY. For example, you can filter your results to return only UNTAGGED images and then pipe that result to a BatchDeleteImage operation to delete them. Or, you can filter your results to return only TAGGED images to list all of the tags in your repository.
    */
  def listImages(params: ListImagesRequest): Request[ListImagesResponse, AWSError] = js.native
  def listImages(
    params: ListImagesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListImagesResponse, Unit]
  ): Request[ListImagesResponse, AWSError] = js.native
  /**
    * List the tags for an Amazon ECR resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * List the tags for an Amazon ECR resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Creates or updates the image manifest and tags associated with an image. When an image is pushed and all new image layers have been uploaded, the PutImage API is called once to create or update the image manifest and tags associated with the image.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
    */
  def putImage(): Request[PutImageResponse, AWSError] = js.native
  def putImage(callback: js.Function2[/* err */ AWSError, /* data */ PutImageResponse, Unit]): Request[PutImageResponse, AWSError] = js.native
  /**
    * Creates or updates the image manifest and tags associated with an image. When an image is pushed and all new image layers have been uploaded, the PutImage API is called once to create or update the image manifest and tags associated with the image.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
    */
  def putImage(params: PutImageRequest): Request[PutImageResponse, AWSError] = js.native
  def putImage(
    params: PutImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutImageResponse, Unit]
  ): Request[PutImageResponse, AWSError] = js.native
  /**
    * Updates the image scanning configuration for the specified repository.
    */
  def putImageScanningConfiguration(): Request[PutImageScanningConfigurationResponse, AWSError] = js.native
  def putImageScanningConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ PutImageScanningConfigurationResponse, Unit]): Request[PutImageScanningConfigurationResponse, AWSError] = js.native
  /**
    * Updates the image scanning configuration for the specified repository.
    */
  def putImageScanningConfiguration(params: PutImageScanningConfigurationRequest): Request[PutImageScanningConfigurationResponse, AWSError] = js.native
  def putImageScanningConfiguration(
    params: PutImageScanningConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutImageScanningConfigurationResponse, Unit]
  ): Request[PutImageScanningConfigurationResponse, AWSError] = js.native
  /**
    * Updates the image tag mutability settings for the specified repository. For more information, see Image Tag Mutability in the Amazon Elastic Container Registry User Guide.
    */
  def putImageTagMutability(): Request[PutImageTagMutabilityResponse, AWSError] = js.native
  def putImageTagMutability(callback: js.Function2[/* err */ AWSError, /* data */ PutImageTagMutabilityResponse, Unit]): Request[PutImageTagMutabilityResponse, AWSError] = js.native
  /**
    * Updates the image tag mutability settings for the specified repository. For more information, see Image Tag Mutability in the Amazon Elastic Container Registry User Guide.
    */
  def putImageTagMutability(params: PutImageTagMutabilityRequest): Request[PutImageTagMutabilityResponse, AWSError] = js.native
  def putImageTagMutability(
    params: PutImageTagMutabilityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutImageTagMutabilityResponse, Unit]
  ): Request[PutImageTagMutabilityResponse, AWSError] = js.native
  /**
    * Creates or updates the lifecycle policy for the specified repository. For more information, see Lifecycle Policy Template.
    */
  def putLifecyclePolicy(): Request[PutLifecyclePolicyResponse, AWSError] = js.native
  def putLifecyclePolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutLifecyclePolicyResponse, Unit]): Request[PutLifecyclePolicyResponse, AWSError] = js.native
  /**
    * Creates or updates the lifecycle policy for the specified repository. For more information, see Lifecycle Policy Template.
    */
  def putLifecyclePolicy(params: PutLifecyclePolicyRequest): Request[PutLifecyclePolicyResponse, AWSError] = js.native
  def putLifecyclePolicy(
    params: PutLifecyclePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutLifecyclePolicyResponse, Unit]
  ): Request[PutLifecyclePolicyResponse, AWSError] = js.native
  /**
    * Applies a repository policy to the specified repository to control access permissions. For more information, see Amazon ECR Repository Policies in the Amazon Elastic Container Registry User Guide.
    */
  def setRepositoryPolicy(): Request[SetRepositoryPolicyResponse, AWSError] = js.native
  def setRepositoryPolicy(callback: js.Function2[/* err */ AWSError, /* data */ SetRepositoryPolicyResponse, Unit]): Request[SetRepositoryPolicyResponse, AWSError] = js.native
  /**
    * Applies a repository policy to the specified repository to control access permissions. For more information, see Amazon ECR Repository Policies in the Amazon Elastic Container Registry User Guide.
    */
  def setRepositoryPolicy(params: SetRepositoryPolicyRequest): Request[SetRepositoryPolicyResponse, AWSError] = js.native
  def setRepositoryPolicy(
    params: SetRepositoryPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SetRepositoryPolicyResponse, Unit]
  ): Request[SetRepositoryPolicyResponse, AWSError] = js.native
  /**
    * Starts an image vulnerability scan. An image scan can only be started once per day on an individual image. This limit includes if an image was scanned on initial push. For more information, see Image Scanning in the Amazon Elastic Container Registry User Guide.
    */
  def startImageScan(): Request[StartImageScanResponse, AWSError] = js.native
  def startImageScan(callback: js.Function2[/* err */ AWSError, /* data */ StartImageScanResponse, Unit]): Request[StartImageScanResponse, AWSError] = js.native
  /**
    * Starts an image vulnerability scan. An image scan can only be started once per day on an individual image. This limit includes if an image was scanned on initial push. For more information, see Image Scanning in the Amazon Elastic Container Registry User Guide.
    */
  def startImageScan(params: StartImageScanRequest): Request[StartImageScanResponse, AWSError] = js.native
  def startImageScan(
    params: StartImageScanRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartImageScanResponse, Unit]
  ): Request[StartImageScanResponse, AWSError] = js.native
  /**
    * Starts a preview of a lifecycle policy for the specified repository. This allows you to see the results before associating the lifecycle policy with the repository.
    */
  def startLifecyclePolicyPreview(): Request[StartLifecyclePolicyPreviewResponse, AWSError] = js.native
  def startLifecyclePolicyPreview(callback: js.Function2[/* err */ AWSError, /* data */ StartLifecyclePolicyPreviewResponse, Unit]): Request[StartLifecyclePolicyPreviewResponse, AWSError] = js.native
  /**
    * Starts a preview of a lifecycle policy for the specified repository. This allows you to see the results before associating the lifecycle policy with the repository.
    */
  def startLifecyclePolicyPreview(params: StartLifecyclePolicyPreviewRequest): Request[StartLifecyclePolicyPreviewResponse, AWSError] = js.native
  def startLifecyclePolicyPreview(
    params: StartLifecyclePolicyPreviewRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartLifecyclePolicyPreviewResponse, Unit]
  ): Request[StartLifecyclePolicyPreviewResponse, AWSError] = js.native
  /**
    * Adds specified tags to a resource with the specified ARN. Existing tags on a resource are not changed if they are not specified in the request parameters.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds specified tags to a resource with the specified ARN. Existing tags on a resource are not changed if they are not specified in the request parameters.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Deletes specified tags from a resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Deletes specified tags from a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Uploads an image layer part to Amazon ECR. When an image is pushed, each new image layer is uploaded in parts. The maximum size of each image layer part can be 20971520 bytes (or about 20MB). The UploadLayerPart API is called once per each new image layer part.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
    */
  def uploadLayerPart(): Request[UploadLayerPartResponse, AWSError] = js.native
  def uploadLayerPart(callback: js.Function2[/* err */ AWSError, /* data */ UploadLayerPartResponse, Unit]): Request[UploadLayerPartResponse, AWSError] = js.native
  /**
    * Uploads an image layer part to Amazon ECR. When an image is pushed, each new image layer is uploaded in parts. The maximum size of each image layer part can be 20971520 bytes (or about 20MB). The UploadLayerPart API is called once per each new image layer part.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
    */
  def uploadLayerPart(params: UploadLayerPartRequest): Request[UploadLayerPartResponse, AWSError] = js.native
  def uploadLayerPart(
    params: UploadLayerPartRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UploadLayerPartResponse, Unit]
  ): Request[UploadLayerPartResponse, AWSError] = js.native
  /**
    * Waits for the imageScanComplete state by periodically calling the underlying ECR.describeImageScanFindingsoperation every 5 seconds (at most 60 times). Wait until an image scan is complete and findings can be accessed
    */
  @JSName("waitFor")
  def waitFor_imageScanComplete(state: imageScanComplete): Request[DescribeImageScanFindingsResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_imageScanComplete(
    state: imageScanComplete,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeImageScanFindingsResponse, Unit]
  ): Request[DescribeImageScanFindingsResponse, AWSError] = js.native
  /**
    * Waits for the imageScanComplete state by periodically calling the underlying ECR.describeImageScanFindingsoperation every 5 seconds (at most 60 times). Wait until an image scan is complete and findings can be accessed
    */
  @JSName("waitFor")
  def waitFor_imageScanComplete(state: imageScanComplete, params: DescribeImageScanFindings): Request[DescribeImageScanFindingsResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_imageScanComplete(
    state: imageScanComplete,
    params: DescribeImageScanFindings,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeImageScanFindingsResponse, Unit]
  ): Request[DescribeImageScanFindingsResponse, AWSError] = js.native
  /**
    * Waits for the lifecyclePolicyPreviewComplete state by periodically calling the underlying ECR.getLifecyclePolicyPreviewoperation every 5 seconds (at most 20 times). Wait until a lifecycle policy preview request is complete and results can be accessed
    */
  @JSName("waitFor")
  def waitFor_lifecyclePolicyPreviewComplete(state: lifecyclePolicyPreviewComplete): Request[GetLifecyclePolicyPreviewResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_lifecyclePolicyPreviewComplete(
    state: lifecyclePolicyPreviewComplete,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLifecyclePolicyPreviewResponse, Unit]
  ): Request[GetLifecyclePolicyPreviewResponse, AWSError] = js.native
  /**
    * Waits for the lifecyclePolicyPreviewComplete state by periodically calling the underlying ECR.getLifecyclePolicyPreviewoperation every 5 seconds (at most 20 times). Wait until a lifecycle policy preview request is complete and results can be accessed
    */
  @JSName("waitFor")
  def waitFor_lifecyclePolicyPreviewComplete(state: lifecyclePolicyPreviewComplete, params: GetLifecyclePolicyPreview): Request[GetLifecyclePolicyPreviewResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_lifecyclePolicyPreviewComplete(
    state: lifecyclePolicyPreviewComplete,
    params: GetLifecyclePolicyPreview,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLifecyclePolicyPreviewResponse, Unit]
  ): Request[GetLifecyclePolicyPreviewResponse, AWSError] = js.native
}

