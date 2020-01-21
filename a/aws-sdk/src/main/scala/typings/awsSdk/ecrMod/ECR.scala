package typings.awsSdk.ecrMod

import typings.awsSdk.AnonWaiter
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
    * Check the availability of multiple image layers in a specified registry and repository.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
    */
  def batchCheckLayerAvailability(): Request[BatchCheckLayerAvailabilityResponse, AWSError] = js.native
  def batchCheckLayerAvailability(callback: js.Function2[/* err */ AWSError, /* data */ BatchCheckLayerAvailabilityResponse, Unit]): Request[BatchCheckLayerAvailabilityResponse, AWSError] = js.native
  /**
    * Check the availability of multiple image layers in a specified registry and repository.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
    */
  def batchCheckLayerAvailability(params: BatchCheckLayerAvailabilityRequest): Request[BatchCheckLayerAvailabilityResponse, AWSError] = js.native
  def batchCheckLayerAvailability(
    params: BatchCheckLayerAvailabilityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchCheckLayerAvailabilityResponse, Unit]
  ): Request[BatchCheckLayerAvailabilityResponse, AWSError] = js.native
  /**
    * Deletes a list of specified images within a specified repository. Images are specified with either imageTag or imageDigest. You can remove a tag from an image by specifying the image's tag in your request. When you remove the last tag from an image, the image is deleted from your repository. You can completely delete an image (and all of its tags) by specifying the image's digest in your request.
    */
  def batchDeleteImage(): Request[BatchDeleteImageResponse, AWSError] = js.native
  def batchDeleteImage(callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteImageResponse, Unit]): Request[BatchDeleteImageResponse, AWSError] = js.native
  /**
    * Deletes a list of specified images within a specified repository. Images are specified with either imageTag or imageDigest. You can remove a tag from an image by specifying the image's tag in your request. When you remove the last tag from an image, the image is deleted from your repository. You can completely delete an image (and all of its tags) by specifying the image's digest in your request.
    */
  def batchDeleteImage(params: BatchDeleteImageRequest): Request[BatchDeleteImageResponse, AWSError] = js.native
  def batchDeleteImage(
    params: BatchDeleteImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteImageResponse, Unit]
  ): Request[BatchDeleteImageResponse, AWSError] = js.native
  /**
    * Gets detailed information for specified images within a specified repository. Images are specified with either imageTag or imageDigest.
    */
  def batchGetImage(): Request[BatchGetImageResponse, AWSError] = js.native
  def batchGetImage(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetImageResponse, Unit]): Request[BatchGetImageResponse, AWSError] = js.native
  /**
    * Gets detailed information for specified images within a specified repository. Images are specified with either imageTag or imageDigest.
    */
  def batchGetImage(params: BatchGetImageRequest): Request[BatchGetImageResponse, AWSError] = js.native
  def batchGetImage(
    params: BatchGetImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetImageResponse, Unit]
  ): Request[BatchGetImageResponse, AWSError] = js.native
  /**
    * Informs Amazon ECR that the image layer upload has completed for a specified registry, repository name, and upload ID. You can optionally provide a sha256 digest of the image layer for data validation purposes.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
    */
  def completeLayerUpload(): Request[CompleteLayerUploadResponse, AWSError] = js.native
  def completeLayerUpload(callback: js.Function2[/* err */ AWSError, /* data */ CompleteLayerUploadResponse, Unit]): Request[CompleteLayerUploadResponse, AWSError] = js.native
  /**
    * Informs Amazon ECR that the image layer upload has completed for a specified registry, repository name, and upload ID. You can optionally provide a sha256 digest of the image layer for data validation purposes.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
    */
  def completeLayerUpload(params: CompleteLayerUploadRequest): Request[CompleteLayerUploadResponse, AWSError] = js.native
  def completeLayerUpload(
    params: CompleteLayerUploadRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CompleteLayerUploadResponse, Unit]
  ): Request[CompleteLayerUploadResponse, AWSError] = js.native
  /**
    * Creates an Amazon Elastic Container Registry (Amazon ECR) repository, where users can push and pull Docker images. For more information, see Amazon ECR Repositories in the Amazon Elastic Container Registry User Guide.
    */
  def createRepository(): Request[CreateRepositoryResponse, AWSError] = js.native
  def createRepository(callback: js.Function2[/* err */ AWSError, /* data */ CreateRepositoryResponse, Unit]): Request[CreateRepositoryResponse, AWSError] = js.native
  /**
    * Creates an Amazon Elastic Container Registry (Amazon ECR) repository, where users can push and pull Docker images. For more information, see Amazon ECR Repositories in the Amazon Elastic Container Registry User Guide.
    */
  def createRepository(params: CreateRepositoryRequest): Request[CreateRepositoryResponse, AWSError] = js.native
  def createRepository(
    params: CreateRepositoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRepositoryResponse, Unit]
  ): Request[CreateRepositoryResponse, AWSError] = js.native
  /**
    * Deletes the specified lifecycle policy.
    */
  def deleteLifecyclePolicy(): Request[DeleteLifecyclePolicyResponse, AWSError] = js.native
  def deleteLifecyclePolicy(callback: js.Function2[/* err */ AWSError, /* data */ DeleteLifecyclePolicyResponse, Unit]): Request[DeleteLifecyclePolicyResponse, AWSError] = js.native
  /**
    * Deletes the specified lifecycle policy.
    */
  def deleteLifecyclePolicy(params: DeleteLifecyclePolicyRequest): Request[DeleteLifecyclePolicyResponse, AWSError] = js.native
  def deleteLifecyclePolicy(
    params: DeleteLifecyclePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLifecyclePolicyResponse, Unit]
  ): Request[DeleteLifecyclePolicyResponse, AWSError] = js.native
  /**
    * Deletes an existing image repository. If a repository contains images, you must use the force option to delete it.
    */
  def deleteRepository(): Request[DeleteRepositoryResponse, AWSError] = js.native
  def deleteRepository(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRepositoryResponse, Unit]): Request[DeleteRepositoryResponse, AWSError] = js.native
  /**
    * Deletes an existing image repository. If a repository contains images, you must use the force option to delete it.
    */
  def deleteRepository(params: DeleteRepositoryRequest): Request[DeleteRepositoryResponse, AWSError] = js.native
  def deleteRepository(
    params: DeleteRepositoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRepositoryResponse, Unit]
  ): Request[DeleteRepositoryResponse, AWSError] = js.native
  /**
    * Deletes the repository policy from a specified repository.
    */
  def deleteRepositoryPolicy(): Request[DeleteRepositoryPolicyResponse, AWSError] = js.native
  def deleteRepositoryPolicy(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRepositoryPolicyResponse, Unit]): Request[DeleteRepositoryPolicyResponse, AWSError] = js.native
  /**
    * Deletes the repository policy from a specified repository.
    */
  def deleteRepositoryPolicy(params: DeleteRepositoryPolicyRequest): Request[DeleteRepositoryPolicyResponse, AWSError] = js.native
  def deleteRepositoryPolicy(
    params: DeleteRepositoryPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRepositoryPolicyResponse, Unit]
  ): Request[DeleteRepositoryPolicyResponse, AWSError] = js.native
  /**
    * Describes the image scan findings for the specified image.
    */
  def describeImageScanFindings(): Request[DescribeImageScanFindingsResponse, AWSError] = js.native
  def describeImageScanFindings(callback: js.Function2[/* err */ AWSError, /* data */ DescribeImageScanFindingsResponse, Unit]): Request[DescribeImageScanFindingsResponse, AWSError] = js.native
  /**
    * Describes the image scan findings for the specified image.
    */
  def describeImageScanFindings(params: DescribeImageScanFindingsRequest): Request[DescribeImageScanFindingsResponse, AWSError] = js.native
  def describeImageScanFindings(
    params: DescribeImageScanFindingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeImageScanFindingsResponse, Unit]
  ): Request[DescribeImageScanFindingsResponse, AWSError] = js.native
  /**
    * Returns metadata about the images in a repository, including image size, image tags, and creation date.  Beginning with Docker version 1.9, the Docker client compresses image layers before pushing them to a V2 Docker registry. The output of the docker images command shows the uncompressed image size, so it may return a larger image size than the image sizes returned by DescribeImages. 
    */
  def describeImages(): Request[DescribeImagesResponse, AWSError] = js.native
  def describeImages(callback: js.Function2[/* err */ AWSError, /* data */ DescribeImagesResponse, Unit]): Request[DescribeImagesResponse, AWSError] = js.native
  /**
    * Returns metadata about the images in a repository, including image size, image tags, and creation date.  Beginning with Docker version 1.9, the Docker client compresses image layers before pushing them to a V2 Docker registry. The output of the docker images command shows the uncompressed image size, so it may return a larger image size than the image sizes returned by DescribeImages. 
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
    * Retrieves a token that is valid for a specified registry for 12 hours. This command allows you to use the docker CLI to push and pull images with Amazon ECR. If you do not specify a registry, the default registry is assumed. The authorizationToken returned for each registry specified is a base64 encoded string that can be decoded and used in a docker login command to authenticate to a registry. The AWS CLI offers an aws ecr get-login command that simplifies the login process.
    */
  def getAuthorizationToken(): Request[GetAuthorizationTokenResponse, AWSError] = js.native
  def getAuthorizationToken(callback: js.Function2[/* err */ AWSError, /* data */ GetAuthorizationTokenResponse, Unit]): Request[GetAuthorizationTokenResponse, AWSError] = js.native
  /**
    * Retrieves a token that is valid for a specified registry for 12 hours. This command allows you to use the docker CLI to push and pull images with Amazon ECR. If you do not specify a registry, the default registry is assumed. The authorizationToken returned for each registry specified is a base64 encoded string that can be decoded and used in a docker login command to authenticate to a registry. The AWS CLI offers an aws ecr get-login command that simplifies the login process.
    */
  def getAuthorizationToken(params: GetAuthorizationTokenRequest): Request[GetAuthorizationTokenResponse, AWSError] = js.native
  def getAuthorizationToken(
    params: GetAuthorizationTokenRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAuthorizationTokenResponse, Unit]
  ): Request[GetAuthorizationTokenResponse, AWSError] = js.native
  /**
    * Retrieves the pre-signed Amazon S3 download URL corresponding to an image layer. You can only get URLs for image layers that are referenced in an image.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
    */
  def getDownloadUrlForLayer(): Request[GetDownloadUrlForLayerResponse, AWSError] = js.native
  def getDownloadUrlForLayer(callback: js.Function2[/* err */ AWSError, /* data */ GetDownloadUrlForLayerResponse, Unit]): Request[GetDownloadUrlForLayerResponse, AWSError] = js.native
  /**
    * Retrieves the pre-signed Amazon S3 download URL corresponding to an image layer. You can only get URLs for image layers that are referenced in an image.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
    */
  def getDownloadUrlForLayer(params: GetDownloadUrlForLayerRequest): Request[GetDownloadUrlForLayerResponse, AWSError] = js.native
  def getDownloadUrlForLayer(
    params: GetDownloadUrlForLayerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDownloadUrlForLayerResponse, Unit]
  ): Request[GetDownloadUrlForLayerResponse, AWSError] = js.native
  /**
    * Retrieves the specified lifecycle policy.
    */
  def getLifecyclePolicy(): Request[GetLifecyclePolicyResponse, AWSError] = js.native
  def getLifecyclePolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetLifecyclePolicyResponse, Unit]): Request[GetLifecyclePolicyResponse, AWSError] = js.native
  /**
    * Retrieves the specified lifecycle policy.
    */
  def getLifecyclePolicy(params: GetLifecyclePolicyRequest): Request[GetLifecyclePolicyResponse, AWSError] = js.native
  def getLifecyclePolicy(
    params: GetLifecyclePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLifecyclePolicyResponse, Unit]
  ): Request[GetLifecyclePolicyResponse, AWSError] = js.native
  /**
    * Retrieves the results of the specified lifecycle policy preview request.
    */
  def getLifecyclePolicyPreview(): Request[GetLifecyclePolicyPreviewResponse, AWSError] = js.native
  def getLifecyclePolicyPreview(callback: js.Function2[/* err */ AWSError, /* data */ GetLifecyclePolicyPreviewResponse, Unit]): Request[GetLifecyclePolicyPreviewResponse, AWSError] = js.native
  /**
    * Retrieves the results of the specified lifecycle policy preview request.
    */
  def getLifecyclePolicyPreview(params: GetLifecyclePolicyPreviewRequest): Request[GetLifecyclePolicyPreviewResponse, AWSError] = js.native
  def getLifecyclePolicyPreview(
    params: GetLifecyclePolicyPreviewRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLifecyclePolicyPreviewResponse, Unit]
  ): Request[GetLifecyclePolicyPreviewResponse, AWSError] = js.native
  /**
    * Retrieves the repository policy for a specified repository.
    */
  def getRepositoryPolicy(): Request[GetRepositoryPolicyResponse, AWSError] = js.native
  def getRepositoryPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetRepositoryPolicyResponse, Unit]): Request[GetRepositoryPolicyResponse, AWSError] = js.native
  /**
    * Retrieves the repository policy for a specified repository.
    */
  def getRepositoryPolicy(params: GetRepositoryPolicyRequest): Request[GetRepositoryPolicyResponse, AWSError] = js.native
  def getRepositoryPolicy(
    params: GetRepositoryPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRepositoryPolicyResponse, Unit]
  ): Request[GetRepositoryPolicyResponse, AWSError] = js.native
  /**
    * Notify Amazon ECR that you intend to upload an image layer.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
    */
  def initiateLayerUpload(): Request[InitiateLayerUploadResponse, AWSError] = js.native
  def initiateLayerUpload(callback: js.Function2[/* err */ AWSError, /* data */ InitiateLayerUploadResponse, Unit]): Request[InitiateLayerUploadResponse, AWSError] = js.native
  /**
    * Notify Amazon ECR that you intend to upload an image layer.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
    */
  def initiateLayerUpload(params: InitiateLayerUploadRequest): Request[InitiateLayerUploadResponse, AWSError] = js.native
  def initiateLayerUpload(
    params: InitiateLayerUploadRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ InitiateLayerUploadResponse, Unit]
  ): Request[InitiateLayerUploadResponse, AWSError] = js.native
  /**
    * Lists all the image IDs for a given repository. You can filter images based on whether or not they are tagged by setting the tagStatus parameter to TAGGED or UNTAGGED. For example, you can filter your results to return only UNTAGGED images and then pipe that result to a BatchDeleteImage operation to delete them. Or, you can filter your results to return only TAGGED images to list all of the tags in your repository.
    */
  def listImages(): Request[ListImagesResponse, AWSError] = js.native
  def listImages(callback: js.Function2[/* err */ AWSError, /* data */ ListImagesResponse, Unit]): Request[ListImagesResponse, AWSError] = js.native
  /**
    * Lists all the image IDs for a given repository. You can filter images based on whether or not they are tagged by setting the tagStatus parameter to TAGGED or UNTAGGED. For example, you can filter your results to return only UNTAGGED images and then pipe that result to a BatchDeleteImage operation to delete them. Or, you can filter your results to return only TAGGED images to list all of the tags in your repository.
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
    * Creates or updates the image manifest and tags associated with an image.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
    */
  def putImage(): Request[PutImageResponse, AWSError] = js.native
  def putImage(callback: js.Function2[/* err */ AWSError, /* data */ PutImageResponse, Unit]): Request[PutImageResponse, AWSError] = js.native
  /**
    * Creates or updates the image manifest and tags associated with an image.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
    */
  def putImage(params: PutImageRequest): Request[PutImageResponse, AWSError] = js.native
  def putImage(
    params: PutImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutImageResponse, Unit]
  ): Request[PutImageResponse, AWSError] = js.native
  /**
    * Updates the image scanning configuration for a repository.
    */
  def putImageScanningConfiguration(): Request[PutImageScanningConfigurationResponse, AWSError] = js.native
  def putImageScanningConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ PutImageScanningConfigurationResponse, Unit]): Request[PutImageScanningConfigurationResponse, AWSError] = js.native
  /**
    * Updates the image scanning configuration for a repository.
    */
  def putImageScanningConfiguration(params: PutImageScanningConfigurationRequest): Request[PutImageScanningConfigurationResponse, AWSError] = js.native
  def putImageScanningConfiguration(
    params: PutImageScanningConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutImageScanningConfigurationResponse, Unit]
  ): Request[PutImageScanningConfigurationResponse, AWSError] = js.native
  /**
    * Updates the image tag mutability settings for a repository. When a repository is configured with tag immutability, all image tags within the repository will be prevented them from being overwritten. For more information, see Image Tag Mutability in the Amazon Elastic Container Registry User Guide.
    */
  def putImageTagMutability(): Request[PutImageTagMutabilityResponse, AWSError] = js.native
  def putImageTagMutability(callback: js.Function2[/* err */ AWSError, /* data */ PutImageTagMutabilityResponse, Unit]): Request[PutImageTagMutabilityResponse, AWSError] = js.native
  /**
    * Updates the image tag mutability settings for a repository. When a repository is configured with tag immutability, all image tags within the repository will be prevented them from being overwritten. For more information, see Image Tag Mutability in the Amazon Elastic Container Registry User Guide.
    */
  def putImageTagMutability(params: PutImageTagMutabilityRequest): Request[PutImageTagMutabilityResponse, AWSError] = js.native
  def putImageTagMutability(
    params: PutImageTagMutabilityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutImageTagMutabilityResponse, Unit]
  ): Request[PutImageTagMutabilityResponse, AWSError] = js.native
  /**
    * Creates or updates a lifecycle policy. For information about lifecycle policy syntax, see Lifecycle Policy Template.
    */
  def putLifecyclePolicy(): Request[PutLifecyclePolicyResponse, AWSError] = js.native
  def putLifecyclePolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutLifecyclePolicyResponse, Unit]): Request[PutLifecyclePolicyResponse, AWSError] = js.native
  /**
    * Creates or updates a lifecycle policy. For information about lifecycle policy syntax, see Lifecycle Policy Template.
    */
  def putLifecyclePolicy(params: PutLifecyclePolicyRequest): Request[PutLifecyclePolicyResponse, AWSError] = js.native
  def putLifecyclePolicy(
    params: PutLifecyclePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutLifecyclePolicyResponse, Unit]
  ): Request[PutLifecyclePolicyResponse, AWSError] = js.native
  /**
    * Applies a repository policy on a specified repository to control access permissions. For more information, see Amazon ECR Repository Policies in the Amazon Elastic Container Registry User Guide.
    */
  def setRepositoryPolicy(): Request[SetRepositoryPolicyResponse, AWSError] = js.native
  def setRepositoryPolicy(callback: js.Function2[/* err */ AWSError, /* data */ SetRepositoryPolicyResponse, Unit]): Request[SetRepositoryPolicyResponse, AWSError] = js.native
  /**
    * Applies a repository policy on a specified repository to control access permissions. For more information, see Amazon ECR Repository Policies in the Amazon Elastic Container Registry User Guide.
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
    * Starts a preview of the specified lifecycle policy. This allows you to see the results before creating the lifecycle policy.
    */
  def startLifecyclePolicyPreview(): Request[StartLifecyclePolicyPreviewResponse, AWSError] = js.native
  def startLifecyclePolicyPreview(callback: js.Function2[/* err */ AWSError, /* data */ StartLifecyclePolicyPreviewResponse, Unit]): Request[StartLifecyclePolicyPreviewResponse, AWSError] = js.native
  /**
    * Starts a preview of the specified lifecycle policy. This allows you to see the results before creating the lifecycle policy.
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
    * Uploads an image layer part to Amazon ECR.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
    */
  def uploadLayerPart(): Request[UploadLayerPartResponse, AWSError] = js.native
  def uploadLayerPart(callback: js.Function2[/* err */ AWSError, /* data */ UploadLayerPartResponse, Unit]): Request[UploadLayerPartResponse, AWSError] = js.native
  /**
    * Uploads an image layer part to Amazon ECR.  This operation is used by the Amazon ECR proxy, and it is not intended for general use by customers for pulling and pushing images. In most cases, you should use the docker CLI to pull, tag, and push images. 
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
  def waitFor_imageScanComplete(state: imageScanComplete, params: DescribeImageScanFindingsRequest with AnonWaiter): Request[DescribeImageScanFindingsResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_imageScanComplete(
    state: imageScanComplete,
    params: DescribeImageScanFindingsRequest with AnonWaiter,
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
  def waitFor_lifecyclePolicyPreviewComplete(state: lifecyclePolicyPreviewComplete, params: GetLifecyclePolicyPreviewRequest with AnonWaiter): Request[GetLifecyclePolicyPreviewResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_lifecyclePolicyPreviewComplete(
    state: lifecyclePolicyPreviewComplete,
    params: GetLifecyclePolicyPreviewRequest with AnonWaiter,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLifecyclePolicyPreviewResponse, Unit]
  ): Request[GetLifecyclePolicyPreviewResponse, AWSError] = js.native
}

