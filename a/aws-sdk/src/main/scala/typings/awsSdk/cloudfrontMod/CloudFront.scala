package typings.awsSdk.cloudfrontMod

import typings.awsSdk.GetDistributionRequestwai
import typings.awsSdk.GetInvalidationRequestwai
import typings.awsSdk.GetStreamingDistributionR
import typings.awsSdk.awsSdkStrings.distributionDeployed
import typings.awsSdk.awsSdkStrings.invalidationCompleted
import typings.awsSdk.awsSdkStrings.streamingDistributionDeployed
import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.servicesCloudfrontMod.CloudFrontCustomizations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudFront extends CloudFrontCustomizations {
  @JSName("config")
  var config_CloudFront: ConfigBase with ClientConfiguration = js.native
  /**
    * Creates a new origin access identity. If you're using Amazon S3 for your origin, you can use an origin access identity to require users to access your content using a CloudFront URL instead of the Amazon S3 URL. For more information about how to use origin access identities, see Serving Private Content through CloudFront in the Amazon CloudFront Developer Guide.
    */
  def createCloudFrontOriginAccessIdentity(): Request[CreateCloudFrontOriginAccessIdentityResult, AWSError] = js.native
  def createCloudFrontOriginAccessIdentity(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCloudFrontOriginAccessIdentityResult, Unit]
  ): Request[CreateCloudFrontOriginAccessIdentityResult, AWSError] = js.native
  /**
    * Creates a new origin access identity. If you're using Amazon S3 for your origin, you can use an origin access identity to require users to access your content using a CloudFront URL instead of the Amazon S3 URL. For more information about how to use origin access identities, see Serving Private Content through CloudFront in the Amazon CloudFront Developer Guide.
    */
  def createCloudFrontOriginAccessIdentity(params: CreateCloudFrontOriginAccessIdentityRequest): Request[CreateCloudFrontOriginAccessIdentityResult, AWSError] = js.native
  def createCloudFrontOriginAccessIdentity(
    params: CreateCloudFrontOriginAccessIdentityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCloudFrontOriginAccessIdentityResult, Unit]
  ): Request[CreateCloudFrontOriginAccessIdentityResult, AWSError] = js.native
  /**
    * Creates a new web distribution. You create a CloudFront distribution to tell CloudFront where you want content to be delivered from, and the details about how to track and manage content delivery. Send a POST request to the /CloudFront API version/distribution/distribution ID resource.  When you update a distribution, there are more required fields than when you create a distribution. When you update your distribution by using UpdateDistribution, follow the steps included in the documentation to get the current configuration and then make your updates. This helps to make sure that you include all of the required fields. To view a summary, see Required Fields for Create Distribution and Update Distribution in the Amazon CloudFront Developer Guide. 
    */
  def createDistribution(): Request[CreateDistributionResult, AWSError] = js.native
  def createDistribution(callback: js.Function2[/* err */ AWSError, /* data */ CreateDistributionResult, Unit]): Request[CreateDistributionResult, AWSError] = js.native
  /**
    * Creates a new web distribution. You create a CloudFront distribution to tell CloudFront where you want content to be delivered from, and the details about how to track and manage content delivery. Send a POST request to the /CloudFront API version/distribution/distribution ID resource.  When you update a distribution, there are more required fields than when you create a distribution. When you update your distribution by using UpdateDistribution, follow the steps included in the documentation to get the current configuration and then make your updates. This helps to make sure that you include all of the required fields. To view a summary, see Required Fields for Create Distribution and Update Distribution in the Amazon CloudFront Developer Guide. 
    */
  def createDistribution(params: CreateDistributionRequest): Request[CreateDistributionResult, AWSError] = js.native
  def createDistribution(
    params: CreateDistributionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDistributionResult, Unit]
  ): Request[CreateDistributionResult, AWSError] = js.native
  /**
    * Create a new distribution with tags.
    */
  def createDistributionWithTags(): Request[CreateDistributionWithTagsResult, AWSError] = js.native
  def createDistributionWithTags(callback: js.Function2[/* err */ AWSError, /* data */ CreateDistributionWithTagsResult, Unit]): Request[CreateDistributionWithTagsResult, AWSError] = js.native
  /**
    * Create a new distribution with tags.
    */
  def createDistributionWithTags(params: CreateDistributionWithTagsRequest): Request[CreateDistributionWithTagsResult, AWSError] = js.native
  def createDistributionWithTags(
    params: CreateDistributionWithTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDistributionWithTagsResult, Unit]
  ): Request[CreateDistributionWithTagsResult, AWSError] = js.native
  /**
    * Create a new field-level encryption configuration.
    */
  def createFieldLevelEncryptionConfig(): Request[CreateFieldLevelEncryptionConfigResult, AWSError] = js.native
  def createFieldLevelEncryptionConfig(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFieldLevelEncryptionConfigResult, Unit]
  ): Request[CreateFieldLevelEncryptionConfigResult, AWSError] = js.native
  /**
    * Create a new field-level encryption configuration.
    */
  def createFieldLevelEncryptionConfig(params: CreateFieldLevelEncryptionConfigRequest): Request[CreateFieldLevelEncryptionConfigResult, AWSError] = js.native
  def createFieldLevelEncryptionConfig(
    params: CreateFieldLevelEncryptionConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFieldLevelEncryptionConfigResult, Unit]
  ): Request[CreateFieldLevelEncryptionConfigResult, AWSError] = js.native
  /**
    * Create a field-level encryption profile.
    */
  def createFieldLevelEncryptionProfile(): Request[CreateFieldLevelEncryptionProfileResult, AWSError] = js.native
  def createFieldLevelEncryptionProfile(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFieldLevelEncryptionProfileResult, Unit]
  ): Request[CreateFieldLevelEncryptionProfileResult, AWSError] = js.native
  /**
    * Create a field-level encryption profile.
    */
  def createFieldLevelEncryptionProfile(params: CreateFieldLevelEncryptionProfileRequest): Request[CreateFieldLevelEncryptionProfileResult, AWSError] = js.native
  def createFieldLevelEncryptionProfile(
    params: CreateFieldLevelEncryptionProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFieldLevelEncryptionProfileResult, Unit]
  ): Request[CreateFieldLevelEncryptionProfileResult, AWSError] = js.native
  /**
    * Create a new invalidation. 
    */
  def createInvalidation(): Request[CreateInvalidationResult, AWSError] = js.native
  def createInvalidation(callback: js.Function2[/* err */ AWSError, /* data */ CreateInvalidationResult, Unit]): Request[CreateInvalidationResult, AWSError] = js.native
  /**
    * Create a new invalidation. 
    */
  def createInvalidation(params: CreateInvalidationRequest): Request[CreateInvalidationResult, AWSError] = js.native
  def createInvalidation(
    params: CreateInvalidationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateInvalidationResult, Unit]
  ): Request[CreateInvalidationResult, AWSError] = js.native
  /**
    * Add a new public key to CloudFront to use, for example, for field-level encryption. You can add a maximum of 10 public keys with one AWS account.
    */
  def createPublicKey(): Request[CreatePublicKeyResult, AWSError] = js.native
  def createPublicKey(callback: js.Function2[/* err */ AWSError, /* data */ CreatePublicKeyResult, Unit]): Request[CreatePublicKeyResult, AWSError] = js.native
  /**
    * Add a new public key to CloudFront to use, for example, for field-level encryption. You can add a maximum of 10 public keys with one AWS account.
    */
  def createPublicKey(params: CreatePublicKeyRequest): Request[CreatePublicKeyResult, AWSError] = js.native
  def createPublicKey(
    params: CreatePublicKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePublicKeyResult, Unit]
  ): Request[CreatePublicKeyResult, AWSError] = js.native
  /**
    * Creates a new RTMP distribution. An RTMP distribution is similar to a web distribution, but an RTMP distribution streams media files using the Adobe Real-Time Messaging Protocol (RTMP) instead of serving files using HTTP.  To create a new distribution, submit a POST request to the CloudFront API version/distribution resource. The request body must include a document with a StreamingDistributionConfig element. The response echoes the StreamingDistributionConfig element and returns other information about the RTMP distribution. To get the status of your request, use the GET StreamingDistribution API action. When the value of Enabled is true and the value of Status is Deployed, your distribution is ready. A distribution usually deploys in less than 15 minutes. For more information about web distributions, see Working with RTMP Distributions in the Amazon CloudFront Developer Guide.  Beginning with the 2012-05-05 version of the CloudFront API, we made substantial changes to the format of the XML document that you include in the request body when you create or update a web distribution or an RTMP distribution, and when you invalidate objects. With previous versions of the API, we discovered that it was too easy to accidentally delete one or more values for an element that accepts multiple values, for example, CNAMEs and trusted signers. Our changes for the 2012-05-05 release are intended to prevent these accidental deletions and to notify you when there's a mismatch between the number of values you say you're specifying in the Quantity element and the number of values specified. 
    */
  def createStreamingDistribution(): Request[CreateStreamingDistributionResult, AWSError] = js.native
  def createStreamingDistribution(callback: js.Function2[/* err */ AWSError, /* data */ CreateStreamingDistributionResult, Unit]): Request[CreateStreamingDistributionResult, AWSError] = js.native
  /**
    * Creates a new RTMP distribution. An RTMP distribution is similar to a web distribution, but an RTMP distribution streams media files using the Adobe Real-Time Messaging Protocol (RTMP) instead of serving files using HTTP.  To create a new distribution, submit a POST request to the CloudFront API version/distribution resource. The request body must include a document with a StreamingDistributionConfig element. The response echoes the StreamingDistributionConfig element and returns other information about the RTMP distribution. To get the status of your request, use the GET StreamingDistribution API action. When the value of Enabled is true and the value of Status is Deployed, your distribution is ready. A distribution usually deploys in less than 15 minutes. For more information about web distributions, see Working with RTMP Distributions in the Amazon CloudFront Developer Guide.  Beginning with the 2012-05-05 version of the CloudFront API, we made substantial changes to the format of the XML document that you include in the request body when you create or update a web distribution or an RTMP distribution, and when you invalidate objects. With previous versions of the API, we discovered that it was too easy to accidentally delete one or more values for an element that accepts multiple values, for example, CNAMEs and trusted signers. Our changes for the 2012-05-05 release are intended to prevent these accidental deletions and to notify you when there's a mismatch between the number of values you say you're specifying in the Quantity element and the number of values specified. 
    */
  def createStreamingDistribution(params: CreateStreamingDistributionRequest): Request[CreateStreamingDistributionResult, AWSError] = js.native
  def createStreamingDistribution(
    params: CreateStreamingDistributionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateStreamingDistributionResult, Unit]
  ): Request[CreateStreamingDistributionResult, AWSError] = js.native
  /**
    * Create a new streaming distribution with tags.
    */
  def createStreamingDistributionWithTags(): Request[CreateStreamingDistributionWithTagsResult, AWSError] = js.native
  def createStreamingDistributionWithTags(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateStreamingDistributionWithTagsResult, Unit]
  ): Request[CreateStreamingDistributionWithTagsResult, AWSError] = js.native
  /**
    * Create a new streaming distribution with tags.
    */
  def createStreamingDistributionWithTags(params: CreateStreamingDistributionWithTagsRequest): Request[CreateStreamingDistributionWithTagsResult, AWSError] = js.native
  def createStreamingDistributionWithTags(
    params: CreateStreamingDistributionWithTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateStreamingDistributionWithTagsResult, Unit]
  ): Request[CreateStreamingDistributionWithTagsResult, AWSError] = js.native
  /**
    * Delete an origin access identity. 
    */
  def deleteCloudFrontOriginAccessIdentity(): Request[js.Object, AWSError] = js.native
  def deleteCloudFrontOriginAccessIdentity(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Delete an origin access identity. 
    */
  def deleteCloudFrontOriginAccessIdentity(params: DeleteCloudFrontOriginAccessIdentityRequest): Request[js.Object, AWSError] = js.native
  def deleteCloudFrontOriginAccessIdentity(
    params: DeleteCloudFrontOriginAccessIdentityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Delete a distribution. 
    */
  def deleteDistribution(): Request[js.Object, AWSError] = js.native
  def deleteDistribution(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Delete a distribution. 
    */
  def deleteDistribution(params: DeleteDistributionRequest): Request[js.Object, AWSError] = js.native
  def deleteDistribution(
    params: DeleteDistributionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Remove a field-level encryption configuration.
    */
  def deleteFieldLevelEncryptionConfig(): Request[js.Object, AWSError] = js.native
  def deleteFieldLevelEncryptionConfig(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Remove a field-level encryption configuration.
    */
  def deleteFieldLevelEncryptionConfig(params: DeleteFieldLevelEncryptionConfigRequest): Request[js.Object, AWSError] = js.native
  def deleteFieldLevelEncryptionConfig(
    params: DeleteFieldLevelEncryptionConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Remove a field-level encryption profile.
    */
  def deleteFieldLevelEncryptionProfile(): Request[js.Object, AWSError] = js.native
  def deleteFieldLevelEncryptionProfile(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Remove a field-level encryption profile.
    */
  def deleteFieldLevelEncryptionProfile(params: DeleteFieldLevelEncryptionProfileRequest): Request[js.Object, AWSError] = js.native
  def deleteFieldLevelEncryptionProfile(
    params: DeleteFieldLevelEncryptionProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Remove a public key you previously added to CloudFront.
    */
  def deletePublicKey(): Request[js.Object, AWSError] = js.native
  def deletePublicKey(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Remove a public key you previously added to CloudFront.
    */
  def deletePublicKey(params: DeletePublicKeyRequest): Request[js.Object, AWSError] = js.native
  def deletePublicKey(
    params: DeletePublicKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Delete a streaming distribution. To delete an RTMP distribution using the CloudFront API, perform the following steps.  To delete an RTMP distribution using the CloudFront API:   Disable the RTMP distribution.   Submit a GET Streaming Distribution Config request to get the current configuration and the Etag header for the distribution.    Update the XML document that was returned in the response to your GET Streaming Distribution Config request to change the value of Enabled to false.   Submit a PUT Streaming Distribution Config request to update the configuration for your distribution. In the request body, include the XML document that you updated in Step 3. Then set the value of the HTTP If-Match header to the value of the ETag header that CloudFront returned when you submitted the GET Streaming Distribution Config request in Step 2.   Review the response to the PUT Streaming Distribution Config request to confirm that the distribution was successfully disabled.   Submit a GET Streaming Distribution Config request to confirm that your changes have propagated. When propagation is complete, the value of Status is Deployed.   Submit a DELETE Streaming Distribution request. Set the value of the HTTP If-Match header to the value of the ETag header that CloudFront returned when you submitted the GET Streaming Distribution Config request in Step 2.   Review the response to your DELETE Streaming Distribution request to confirm that the distribution was successfully deleted.   For information about deleting a distribution using the CloudFront console, see Deleting a Distribution in the Amazon CloudFront Developer Guide.
    */
  def deleteStreamingDistribution(): Request[js.Object, AWSError] = js.native
  def deleteStreamingDistribution(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Delete a streaming distribution. To delete an RTMP distribution using the CloudFront API, perform the following steps.  To delete an RTMP distribution using the CloudFront API:   Disable the RTMP distribution.   Submit a GET Streaming Distribution Config request to get the current configuration and the Etag header for the distribution.    Update the XML document that was returned in the response to your GET Streaming Distribution Config request to change the value of Enabled to false.   Submit a PUT Streaming Distribution Config request to update the configuration for your distribution. In the request body, include the XML document that you updated in Step 3. Then set the value of the HTTP If-Match header to the value of the ETag header that CloudFront returned when you submitted the GET Streaming Distribution Config request in Step 2.   Review the response to the PUT Streaming Distribution Config request to confirm that the distribution was successfully disabled.   Submit a GET Streaming Distribution Config request to confirm that your changes have propagated. When propagation is complete, the value of Status is Deployed.   Submit a DELETE Streaming Distribution request. Set the value of the HTTP If-Match header to the value of the ETag header that CloudFront returned when you submitted the GET Streaming Distribution Config request in Step 2.   Review the response to your DELETE Streaming Distribution request to confirm that the distribution was successfully deleted.   For information about deleting a distribution using the CloudFront console, see Deleting a Distribution in the Amazon CloudFront Developer Guide.
    */
  def deleteStreamingDistribution(params: DeleteStreamingDistributionRequest): Request[js.Object, AWSError] = js.native
  def deleteStreamingDistribution(
    params: DeleteStreamingDistributionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Get the information about an origin access identity. 
    */
  def getCloudFrontOriginAccessIdentity(): Request[GetCloudFrontOriginAccessIdentityResult, AWSError] = js.native
  def getCloudFrontOriginAccessIdentity(
    callback: js.Function2[/* err */ AWSError, /* data */ GetCloudFrontOriginAccessIdentityResult, Unit]
  ): Request[GetCloudFrontOriginAccessIdentityResult, AWSError] = js.native
  /**
    * Get the information about an origin access identity. 
    */
  def getCloudFrontOriginAccessIdentity(params: GetCloudFrontOriginAccessIdentityRequest): Request[GetCloudFrontOriginAccessIdentityResult, AWSError] = js.native
  def getCloudFrontOriginAccessIdentity(
    params: GetCloudFrontOriginAccessIdentityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCloudFrontOriginAccessIdentityResult, Unit]
  ): Request[GetCloudFrontOriginAccessIdentityResult, AWSError] = js.native
  /**
    * Get the configuration information about an origin access identity. 
    */
  def getCloudFrontOriginAccessIdentityConfig(): Request[GetCloudFrontOriginAccessIdentityConfigResult, AWSError] = js.native
  def getCloudFrontOriginAccessIdentityConfig(
    callback: js.Function2[/* err */ AWSError, /* data */ GetCloudFrontOriginAccessIdentityConfigResult, Unit]
  ): Request[GetCloudFrontOriginAccessIdentityConfigResult, AWSError] = js.native
  /**
    * Get the configuration information about an origin access identity. 
    */
  def getCloudFrontOriginAccessIdentityConfig(params: GetCloudFrontOriginAccessIdentityConfigRequest): Request[GetCloudFrontOriginAccessIdentityConfigResult, AWSError] = js.native
  def getCloudFrontOriginAccessIdentityConfig(
    params: GetCloudFrontOriginAccessIdentityConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCloudFrontOriginAccessIdentityConfigResult, Unit]
  ): Request[GetCloudFrontOriginAccessIdentityConfigResult, AWSError] = js.native
  /**
    * Get the information about a distribution.
    */
  def getDistribution(): Request[GetDistributionResult, AWSError] = js.native
  def getDistribution(callback: js.Function2[/* err */ AWSError, /* data */ GetDistributionResult, Unit]): Request[GetDistributionResult, AWSError] = js.native
  /**
    * Get the information about a distribution.
    */
  def getDistribution(params: GetDistributionRequest): Request[GetDistributionResult, AWSError] = js.native
  def getDistribution(
    params: GetDistributionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDistributionResult, Unit]
  ): Request[GetDistributionResult, AWSError] = js.native
  /**
    * Get the configuration information about a distribution. 
    */
  def getDistributionConfig(): Request[GetDistributionConfigResult, AWSError] = js.native
  def getDistributionConfig(callback: js.Function2[/* err */ AWSError, /* data */ GetDistributionConfigResult, Unit]): Request[GetDistributionConfigResult, AWSError] = js.native
  /**
    * Get the configuration information about a distribution. 
    */
  def getDistributionConfig(params: GetDistributionConfigRequest): Request[GetDistributionConfigResult, AWSError] = js.native
  def getDistributionConfig(
    params: GetDistributionConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDistributionConfigResult, Unit]
  ): Request[GetDistributionConfigResult, AWSError] = js.native
  /**
    * Get the field-level encryption configuration information.
    */
  def getFieldLevelEncryption(): Request[GetFieldLevelEncryptionResult, AWSError] = js.native
  def getFieldLevelEncryption(callback: js.Function2[/* err */ AWSError, /* data */ GetFieldLevelEncryptionResult, Unit]): Request[GetFieldLevelEncryptionResult, AWSError] = js.native
  /**
    * Get the field-level encryption configuration information.
    */
  def getFieldLevelEncryption(params: GetFieldLevelEncryptionRequest): Request[GetFieldLevelEncryptionResult, AWSError] = js.native
  def getFieldLevelEncryption(
    params: GetFieldLevelEncryptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFieldLevelEncryptionResult, Unit]
  ): Request[GetFieldLevelEncryptionResult, AWSError] = js.native
  /**
    * Get the field-level encryption configuration information.
    */
  def getFieldLevelEncryptionConfig(): Request[GetFieldLevelEncryptionConfigResult, AWSError] = js.native
  def getFieldLevelEncryptionConfig(callback: js.Function2[/* err */ AWSError, /* data */ GetFieldLevelEncryptionConfigResult, Unit]): Request[GetFieldLevelEncryptionConfigResult, AWSError] = js.native
  /**
    * Get the field-level encryption configuration information.
    */
  def getFieldLevelEncryptionConfig(params: GetFieldLevelEncryptionConfigRequest): Request[GetFieldLevelEncryptionConfigResult, AWSError] = js.native
  def getFieldLevelEncryptionConfig(
    params: GetFieldLevelEncryptionConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFieldLevelEncryptionConfigResult, Unit]
  ): Request[GetFieldLevelEncryptionConfigResult, AWSError] = js.native
  /**
    * Get the field-level encryption profile information.
    */
  def getFieldLevelEncryptionProfile(): Request[GetFieldLevelEncryptionProfileResult, AWSError] = js.native
  def getFieldLevelEncryptionProfile(callback: js.Function2[/* err */ AWSError, /* data */ GetFieldLevelEncryptionProfileResult, Unit]): Request[GetFieldLevelEncryptionProfileResult, AWSError] = js.native
  /**
    * Get the field-level encryption profile information.
    */
  def getFieldLevelEncryptionProfile(params: GetFieldLevelEncryptionProfileRequest): Request[GetFieldLevelEncryptionProfileResult, AWSError] = js.native
  def getFieldLevelEncryptionProfile(
    params: GetFieldLevelEncryptionProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFieldLevelEncryptionProfileResult, Unit]
  ): Request[GetFieldLevelEncryptionProfileResult, AWSError] = js.native
  /**
    * Get the field-level encryption profile configuration information.
    */
  def getFieldLevelEncryptionProfileConfig(): Request[GetFieldLevelEncryptionProfileConfigResult, AWSError] = js.native
  def getFieldLevelEncryptionProfileConfig(
    callback: js.Function2[/* err */ AWSError, /* data */ GetFieldLevelEncryptionProfileConfigResult, Unit]
  ): Request[GetFieldLevelEncryptionProfileConfigResult, AWSError] = js.native
  /**
    * Get the field-level encryption profile configuration information.
    */
  def getFieldLevelEncryptionProfileConfig(params: GetFieldLevelEncryptionProfileConfigRequest): Request[GetFieldLevelEncryptionProfileConfigResult, AWSError] = js.native
  def getFieldLevelEncryptionProfileConfig(
    params: GetFieldLevelEncryptionProfileConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFieldLevelEncryptionProfileConfigResult, Unit]
  ): Request[GetFieldLevelEncryptionProfileConfigResult, AWSError] = js.native
  /**
    * Get the information about an invalidation. 
    */
  def getInvalidation(): Request[GetInvalidationResult, AWSError] = js.native
  def getInvalidation(callback: js.Function2[/* err */ AWSError, /* data */ GetInvalidationResult, Unit]): Request[GetInvalidationResult, AWSError] = js.native
  /**
    * Get the information about an invalidation. 
    */
  def getInvalidation(params: GetInvalidationRequest): Request[GetInvalidationResult, AWSError] = js.native
  def getInvalidation(
    params: GetInvalidationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetInvalidationResult, Unit]
  ): Request[GetInvalidationResult, AWSError] = js.native
  /**
    * Get the public key information.
    */
  def getPublicKey(): Request[GetPublicKeyResult, AWSError] = js.native
  def getPublicKey(callback: js.Function2[/* err */ AWSError, /* data */ GetPublicKeyResult, Unit]): Request[GetPublicKeyResult, AWSError] = js.native
  /**
    * Get the public key information.
    */
  def getPublicKey(params: GetPublicKeyRequest): Request[GetPublicKeyResult, AWSError] = js.native
  def getPublicKey(
    params: GetPublicKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPublicKeyResult, Unit]
  ): Request[GetPublicKeyResult, AWSError] = js.native
  /**
    * Return public key configuration informaation
    */
  def getPublicKeyConfig(): Request[GetPublicKeyConfigResult, AWSError] = js.native
  def getPublicKeyConfig(callback: js.Function2[/* err */ AWSError, /* data */ GetPublicKeyConfigResult, Unit]): Request[GetPublicKeyConfigResult, AWSError] = js.native
  /**
    * Return public key configuration informaation
    */
  def getPublicKeyConfig(params: GetPublicKeyConfigRequest): Request[GetPublicKeyConfigResult, AWSError] = js.native
  def getPublicKeyConfig(
    params: GetPublicKeyConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPublicKeyConfigResult, Unit]
  ): Request[GetPublicKeyConfigResult, AWSError] = js.native
  /**
    * Gets information about a specified RTMP distribution, including the distribution configuration.
    */
  def getStreamingDistribution(): Request[GetStreamingDistributionResult, AWSError] = js.native
  def getStreamingDistribution(callback: js.Function2[/* err */ AWSError, /* data */ GetStreamingDistributionResult, Unit]): Request[GetStreamingDistributionResult, AWSError] = js.native
  /**
    * Gets information about a specified RTMP distribution, including the distribution configuration.
    */
  def getStreamingDistribution(params: GetStreamingDistributionRequest): Request[GetStreamingDistributionResult, AWSError] = js.native
  def getStreamingDistribution(
    params: GetStreamingDistributionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStreamingDistributionResult, Unit]
  ): Request[GetStreamingDistributionResult, AWSError] = js.native
  /**
    * Get the configuration information about a streaming distribution. 
    */
  def getStreamingDistributionConfig(): Request[GetStreamingDistributionConfigResult, AWSError] = js.native
  def getStreamingDistributionConfig(callback: js.Function2[/* err */ AWSError, /* data */ GetStreamingDistributionConfigResult, Unit]): Request[GetStreamingDistributionConfigResult, AWSError] = js.native
  /**
    * Get the configuration information about a streaming distribution. 
    */
  def getStreamingDistributionConfig(params: GetStreamingDistributionConfigRequest): Request[GetStreamingDistributionConfigResult, AWSError] = js.native
  def getStreamingDistributionConfig(
    params: GetStreamingDistributionConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStreamingDistributionConfigResult, Unit]
  ): Request[GetStreamingDistributionConfigResult, AWSError] = js.native
  /**
    * Lists origin access identities.
    */
  def listCloudFrontOriginAccessIdentities(): Request[ListCloudFrontOriginAccessIdentitiesResult, AWSError] = js.native
  def listCloudFrontOriginAccessIdentities(
    callback: js.Function2[/* err */ AWSError, /* data */ ListCloudFrontOriginAccessIdentitiesResult, Unit]
  ): Request[ListCloudFrontOriginAccessIdentitiesResult, AWSError] = js.native
  /**
    * Lists origin access identities.
    */
  def listCloudFrontOriginAccessIdentities(params: ListCloudFrontOriginAccessIdentitiesRequest): Request[ListCloudFrontOriginAccessIdentitiesResult, AWSError] = js.native
  def listCloudFrontOriginAccessIdentities(
    params: ListCloudFrontOriginAccessIdentitiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCloudFrontOriginAccessIdentitiesResult, Unit]
  ): Request[ListCloudFrontOriginAccessIdentitiesResult, AWSError] = js.native
  /**
    * List CloudFront distributions.
    */
  def listDistributions(): Request[ListDistributionsResult, AWSError] = js.native
  def listDistributions(callback: js.Function2[/* err */ AWSError, /* data */ ListDistributionsResult, Unit]): Request[ListDistributionsResult, AWSError] = js.native
  /**
    * List CloudFront distributions.
    */
  def listDistributions(params: ListDistributionsRequest): Request[ListDistributionsResult, AWSError] = js.native
  def listDistributions(
    params: ListDistributionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDistributionsResult, Unit]
  ): Request[ListDistributionsResult, AWSError] = js.native
  /**
    * List the distributions that are associated with a specified AWS WAF web ACL. 
    */
  def listDistributionsByWebACLId(): Request[ListDistributionsByWebACLIdResult, AWSError] = js.native
  def listDistributionsByWebACLId(callback: js.Function2[/* err */ AWSError, /* data */ ListDistributionsByWebACLIdResult, Unit]): Request[ListDistributionsByWebACLIdResult, AWSError] = js.native
  /**
    * List the distributions that are associated with a specified AWS WAF web ACL. 
    */
  def listDistributionsByWebACLId(params: ListDistributionsByWebACLIdRequest): Request[ListDistributionsByWebACLIdResult, AWSError] = js.native
  def listDistributionsByWebACLId(
    params: ListDistributionsByWebACLIdRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDistributionsByWebACLIdResult, Unit]
  ): Request[ListDistributionsByWebACLIdResult, AWSError] = js.native
  /**
    * List all field-level encryption configurations that have been created in CloudFront for this account.
    */
  def listFieldLevelEncryptionConfigs(): Request[ListFieldLevelEncryptionConfigsResult, AWSError] = js.native
  def listFieldLevelEncryptionConfigs(callback: js.Function2[/* err */ AWSError, /* data */ ListFieldLevelEncryptionConfigsResult, Unit]): Request[ListFieldLevelEncryptionConfigsResult, AWSError] = js.native
  /**
    * List all field-level encryption configurations that have been created in CloudFront for this account.
    */
  def listFieldLevelEncryptionConfigs(params: ListFieldLevelEncryptionConfigsRequest): Request[ListFieldLevelEncryptionConfigsResult, AWSError] = js.native
  def listFieldLevelEncryptionConfigs(
    params: ListFieldLevelEncryptionConfigsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFieldLevelEncryptionConfigsResult, Unit]
  ): Request[ListFieldLevelEncryptionConfigsResult, AWSError] = js.native
  /**
    * Request a list of field-level encryption profiles that have been created in CloudFront for this account.
    */
  def listFieldLevelEncryptionProfiles(): Request[ListFieldLevelEncryptionProfilesResult, AWSError] = js.native
  def listFieldLevelEncryptionProfiles(
    callback: js.Function2[/* err */ AWSError, /* data */ ListFieldLevelEncryptionProfilesResult, Unit]
  ): Request[ListFieldLevelEncryptionProfilesResult, AWSError] = js.native
  /**
    * Request a list of field-level encryption profiles that have been created in CloudFront for this account.
    */
  def listFieldLevelEncryptionProfiles(params: ListFieldLevelEncryptionProfilesRequest): Request[ListFieldLevelEncryptionProfilesResult, AWSError] = js.native
  def listFieldLevelEncryptionProfiles(
    params: ListFieldLevelEncryptionProfilesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFieldLevelEncryptionProfilesResult, Unit]
  ): Request[ListFieldLevelEncryptionProfilesResult, AWSError] = js.native
  /**
    * Lists invalidation batches. 
    */
  def listInvalidations(): Request[ListInvalidationsResult, AWSError] = js.native
  def listInvalidations(callback: js.Function2[/* err */ AWSError, /* data */ ListInvalidationsResult, Unit]): Request[ListInvalidationsResult, AWSError] = js.native
  /**
    * Lists invalidation batches. 
    */
  def listInvalidations(params: ListInvalidationsRequest): Request[ListInvalidationsResult, AWSError] = js.native
  def listInvalidations(
    params: ListInvalidationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListInvalidationsResult, Unit]
  ): Request[ListInvalidationsResult, AWSError] = js.native
  /**
    * List all public keys that have been added to CloudFront for this account.
    */
  def listPublicKeys(): Request[ListPublicKeysResult, AWSError] = js.native
  def listPublicKeys(callback: js.Function2[/* err */ AWSError, /* data */ ListPublicKeysResult, Unit]): Request[ListPublicKeysResult, AWSError] = js.native
  /**
    * List all public keys that have been added to CloudFront for this account.
    */
  def listPublicKeys(params: ListPublicKeysRequest): Request[ListPublicKeysResult, AWSError] = js.native
  def listPublicKeys(
    params: ListPublicKeysRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPublicKeysResult, Unit]
  ): Request[ListPublicKeysResult, AWSError] = js.native
  /**
    * List streaming distributions. 
    */
  def listStreamingDistributions(): Request[ListStreamingDistributionsResult, AWSError] = js.native
  def listStreamingDistributions(callback: js.Function2[/* err */ AWSError, /* data */ ListStreamingDistributionsResult, Unit]): Request[ListStreamingDistributionsResult, AWSError] = js.native
  /**
    * List streaming distributions. 
    */
  def listStreamingDistributions(params: ListStreamingDistributionsRequest): Request[ListStreamingDistributionsResult, AWSError] = js.native
  def listStreamingDistributions(
    params: ListStreamingDistributionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListStreamingDistributionsResult, Unit]
  ): Request[ListStreamingDistributionsResult, AWSError] = js.native
  /**
    * List tags for a CloudFront resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResult, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResult, Unit]): Request[ListTagsForResourceResult, AWSError] = js.native
  /**
    * List tags for a CloudFront resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResult, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResult, Unit]
  ): Request[ListTagsForResourceResult, AWSError] = js.native
  /**
    * Add tags to a CloudFront resource.
    */
  def tagResource(): Request[js.Object, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Add tags to a CloudFront resource.
    */
  def tagResource(params: TagResourceRequest): Request[js.Object, AWSError] = js.native
  def tagResource(params: TagResourceRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Remove tags from a CloudFront resource.
    */
  def untagResource(): Request[js.Object, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Remove tags from a CloudFront resource.
    */
  def untagResource(params: UntagResourceRequest): Request[js.Object, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Update an origin access identity. 
    */
  def updateCloudFrontOriginAccessIdentity(): Request[UpdateCloudFrontOriginAccessIdentityResult, AWSError] = js.native
  def updateCloudFrontOriginAccessIdentity(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateCloudFrontOriginAccessIdentityResult, Unit]
  ): Request[UpdateCloudFrontOriginAccessIdentityResult, AWSError] = js.native
  /**
    * Update an origin access identity. 
    */
  def updateCloudFrontOriginAccessIdentity(params: UpdateCloudFrontOriginAccessIdentityRequest): Request[UpdateCloudFrontOriginAccessIdentityResult, AWSError] = js.native
  def updateCloudFrontOriginAccessIdentity(
    params: UpdateCloudFrontOriginAccessIdentityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateCloudFrontOriginAccessIdentityResult, Unit]
  ): Request[UpdateCloudFrontOriginAccessIdentityResult, AWSError] = js.native
  /**
    * Updates the configuration for a web distribution.   When you update a distribution, there are more required fields than when you create a distribution. When you update your distribution by using this API action, follow the steps here to get the current configuration and then make your updates, to make sure that you include all of the required fields. To view a summary, see Required Fields for Create Distribution and Update Distribution in the Amazon CloudFront Developer Guide.  The update process includes getting the current distribution configuration, updating the XML document that is returned to make your changes, and then submitting an UpdateDistribution request to make the updates. For information about updating a distribution using the CloudFront console instead, see Creating a Distribution in the Amazon CloudFront Developer Guide.  To update a web distribution using the CloudFront API    Submit a GetDistributionConfig request to get the current configuration and an Etag header for the distribution.  If you update the distribution again, you must get a new Etag header.    Update the XML document that was returned in the response to your GetDistributionConfig request to include your changes.   When you edit the XML file, be aware of the following:   You must strip out the ETag parameter that is returned.   Additional fields are required when you update a distribution. There may be fields included in the XML file for features that you haven't configured for your distribution. This is expected and required to successfully update the distribution.   You can't change the value of CallerReference. If you try to change this value, CloudFront returns an IllegalUpdate error.    The new configuration replaces the existing configuration; the values that you specify in an UpdateDistribution request are not merged into your existing configuration. When you add, delete, or replace values in an element that allows multiple values (for example, CNAME), you must specify all of the values that you want to appear in the updated distribution. In addition, you must update the corresponding Quantity element.      Submit an UpdateDistribution request to update the configuration for your distribution:   In the request body, include the XML document that you updated in Step 2. The request body must include an XML document with a DistributionConfig element.   Set the value of the HTTP If-Match header to the value of the ETag header that CloudFront returned when you submitted the GetDistributionConfig request in Step 1.     Review the response to the UpdateDistribution request to confirm that the configuration was successfully updated.   Optional: Submit a GetDistribution request to confirm that your changes have propagated. When propagation is complete, the value of Status is Deployed.  
    */
  def updateDistribution(): Request[UpdateDistributionResult, AWSError] = js.native
  def updateDistribution(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDistributionResult, Unit]): Request[UpdateDistributionResult, AWSError] = js.native
  /**
    * Updates the configuration for a web distribution.   When you update a distribution, there are more required fields than when you create a distribution. When you update your distribution by using this API action, follow the steps here to get the current configuration and then make your updates, to make sure that you include all of the required fields. To view a summary, see Required Fields for Create Distribution and Update Distribution in the Amazon CloudFront Developer Guide.  The update process includes getting the current distribution configuration, updating the XML document that is returned to make your changes, and then submitting an UpdateDistribution request to make the updates. For information about updating a distribution using the CloudFront console instead, see Creating a Distribution in the Amazon CloudFront Developer Guide.  To update a web distribution using the CloudFront API    Submit a GetDistributionConfig request to get the current configuration and an Etag header for the distribution.  If you update the distribution again, you must get a new Etag header.    Update the XML document that was returned in the response to your GetDistributionConfig request to include your changes.   When you edit the XML file, be aware of the following:   You must strip out the ETag parameter that is returned.   Additional fields are required when you update a distribution. There may be fields included in the XML file for features that you haven't configured for your distribution. This is expected and required to successfully update the distribution.   You can't change the value of CallerReference. If you try to change this value, CloudFront returns an IllegalUpdate error.    The new configuration replaces the existing configuration; the values that you specify in an UpdateDistribution request are not merged into your existing configuration. When you add, delete, or replace values in an element that allows multiple values (for example, CNAME), you must specify all of the values that you want to appear in the updated distribution. In addition, you must update the corresponding Quantity element.      Submit an UpdateDistribution request to update the configuration for your distribution:   In the request body, include the XML document that you updated in Step 2. The request body must include an XML document with a DistributionConfig element.   Set the value of the HTTP If-Match header to the value of the ETag header that CloudFront returned when you submitted the GetDistributionConfig request in Step 1.     Review the response to the UpdateDistribution request to confirm that the configuration was successfully updated.   Optional: Submit a GetDistribution request to confirm that your changes have propagated. When propagation is complete, the value of Status is Deployed.  
    */
  def updateDistribution(params: UpdateDistributionRequest): Request[UpdateDistributionResult, AWSError] = js.native
  def updateDistribution(
    params: UpdateDistributionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDistributionResult, Unit]
  ): Request[UpdateDistributionResult, AWSError] = js.native
  /**
    * Update a field-level encryption configuration. 
    */
  def updateFieldLevelEncryptionConfig(): Request[UpdateFieldLevelEncryptionConfigResult, AWSError] = js.native
  def updateFieldLevelEncryptionConfig(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFieldLevelEncryptionConfigResult, Unit]
  ): Request[UpdateFieldLevelEncryptionConfigResult, AWSError] = js.native
  /**
    * Update a field-level encryption configuration. 
    */
  def updateFieldLevelEncryptionConfig(params: UpdateFieldLevelEncryptionConfigRequest): Request[UpdateFieldLevelEncryptionConfigResult, AWSError] = js.native
  def updateFieldLevelEncryptionConfig(
    params: UpdateFieldLevelEncryptionConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFieldLevelEncryptionConfigResult, Unit]
  ): Request[UpdateFieldLevelEncryptionConfigResult, AWSError] = js.native
  /**
    * Update a field-level encryption profile. 
    */
  def updateFieldLevelEncryptionProfile(): Request[UpdateFieldLevelEncryptionProfileResult, AWSError] = js.native
  def updateFieldLevelEncryptionProfile(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFieldLevelEncryptionProfileResult, Unit]
  ): Request[UpdateFieldLevelEncryptionProfileResult, AWSError] = js.native
  /**
    * Update a field-level encryption profile. 
    */
  def updateFieldLevelEncryptionProfile(params: UpdateFieldLevelEncryptionProfileRequest): Request[UpdateFieldLevelEncryptionProfileResult, AWSError] = js.native
  def updateFieldLevelEncryptionProfile(
    params: UpdateFieldLevelEncryptionProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFieldLevelEncryptionProfileResult, Unit]
  ): Request[UpdateFieldLevelEncryptionProfileResult, AWSError] = js.native
  /**
    * Update public key information. Note that the only value you can change is the comment.
    */
  def updatePublicKey(): Request[UpdatePublicKeyResult, AWSError] = js.native
  def updatePublicKey(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePublicKeyResult, Unit]): Request[UpdatePublicKeyResult, AWSError] = js.native
  /**
    * Update public key information. Note that the only value you can change is the comment.
    */
  def updatePublicKey(params: UpdatePublicKeyRequest): Request[UpdatePublicKeyResult, AWSError] = js.native
  def updatePublicKey(
    params: UpdatePublicKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePublicKeyResult, Unit]
  ): Request[UpdatePublicKeyResult, AWSError] = js.native
  /**
    * Update a streaming distribution. 
    */
  def updateStreamingDistribution(): Request[UpdateStreamingDistributionResult, AWSError] = js.native
  def updateStreamingDistribution(callback: js.Function2[/* err */ AWSError, /* data */ UpdateStreamingDistributionResult, Unit]): Request[UpdateStreamingDistributionResult, AWSError] = js.native
  /**
    * Update a streaming distribution. 
    */
  def updateStreamingDistribution(params: UpdateStreamingDistributionRequest): Request[UpdateStreamingDistributionResult, AWSError] = js.native
  def updateStreamingDistribution(
    params: UpdateStreamingDistributionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateStreamingDistributionResult, Unit]
  ): Request[UpdateStreamingDistributionResult, AWSError] = js.native
  /**
    * Waits for the distributionDeployed state by periodically calling the underlying CloudFront.getDistributionoperation every 60 seconds (at most 35 times). Wait until a distribution is deployed.
    */
  @JSName("waitFor")
  def waitFor_distributionDeployed(state: distributionDeployed): Request[GetDistributionResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_distributionDeployed(
    state: distributionDeployed,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDistributionResult, Unit]
  ): Request[GetDistributionResult, AWSError] = js.native
  /**
    * Waits for the distributionDeployed state by periodically calling the underlying CloudFront.getDistributionoperation every 60 seconds (at most 35 times). Wait until a distribution is deployed.
    */
  @JSName("waitFor")
  def waitFor_distributionDeployed(state: distributionDeployed, params: GetDistributionRequestwai): Request[GetDistributionResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_distributionDeployed(
    state: distributionDeployed,
    params: GetDistributionRequestwai,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDistributionResult, Unit]
  ): Request[GetDistributionResult, AWSError] = js.native
  /**
    * Waits for the invalidationCompleted state by periodically calling the underlying CloudFront.getInvalidationoperation every 20 seconds (at most 30 times). Wait until an invalidation has completed.
    */
  @JSName("waitFor")
  def waitFor_invalidationCompleted(state: invalidationCompleted): Request[GetInvalidationResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_invalidationCompleted(
    state: invalidationCompleted,
    callback: js.Function2[/* err */ AWSError, /* data */ GetInvalidationResult, Unit]
  ): Request[GetInvalidationResult, AWSError] = js.native
  /**
    * Waits for the invalidationCompleted state by periodically calling the underlying CloudFront.getInvalidationoperation every 20 seconds (at most 30 times). Wait until an invalidation has completed.
    */
  @JSName("waitFor")
  def waitFor_invalidationCompleted(state: invalidationCompleted, params: GetInvalidationRequestwai): Request[GetInvalidationResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_invalidationCompleted(
    state: invalidationCompleted,
    params: GetInvalidationRequestwai,
    callback: js.Function2[/* err */ AWSError, /* data */ GetInvalidationResult, Unit]
  ): Request[GetInvalidationResult, AWSError] = js.native
  /**
    * Waits for the streamingDistributionDeployed state by periodically calling the underlying CloudFront.getStreamingDistributionoperation every 60 seconds (at most 25 times). Wait until a streaming distribution is deployed.
    */
  @JSName("waitFor")
  def waitFor_streamingDistributionDeployed(state: streamingDistributionDeployed): Request[GetStreamingDistributionResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_streamingDistributionDeployed(
    state: streamingDistributionDeployed,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStreamingDistributionResult, Unit]
  ): Request[GetStreamingDistributionResult, AWSError] = js.native
  /**
    * Waits for the streamingDistributionDeployed state by periodically calling the underlying CloudFront.getStreamingDistributionoperation every 60 seconds (at most 25 times). Wait until a streaming distribution is deployed.
    */
  @JSName("waitFor")
  def waitFor_streamingDistributionDeployed(state: streamingDistributionDeployed, params: GetStreamingDistributionR): Request[GetStreamingDistributionResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_streamingDistributionDeployed(
    state: streamingDistributionDeployed,
    params: GetStreamingDistributionR,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStreamingDistributionResult, Unit]
  ): Request[GetStreamingDistributionResult, AWSError] = js.native
}

