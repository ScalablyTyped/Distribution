package typings.awsSdk.cloudfrontMod

import typings.awsSdk.anon.GetDistributionRequestwai
import typings.awsSdk.anon.GetInvalidationRequestwai
import typings.awsSdk.anon.GetStreamingDistributionR
import typings.awsSdk.awsSdkStrings.distributionDeployed
import typings.awsSdk.awsSdkStrings.invalidationCompleted
import typings.awsSdk.awsSdkStrings.streamingDistributionDeployed
import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.servicesCloudfrontMod.CloudFrontCustomizations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudFront extends CloudFrontCustomizations {
  
  @JSName("config")
  var config_CloudFront: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a cache policy. After you create a cache policy, you can attach it to one or more cache behaviors. When it’s attached to a cache behavior, the cache policy determines the following:   The values that CloudFront includes in the cache key. These values can include HTTP headers, cookies, and URL query strings. CloudFront uses the cache key to find an object in its cache that it can return to the viewer.   The default, minimum, and maximum time to live (TTL) values that you want objects to stay in the CloudFront cache.   The headers, cookies, and query strings that are included in the cache key are automatically included in requests that CloudFront sends to the origin. CloudFront sends a request when it can’t find an object in its cache that matches the request’s cache key. If you want to send values to the origin but not include them in the cache key, use OriginRequestPolicy. For more information about cache policies, see Controlling the cache key in the Amazon CloudFront Developer Guide.
    */
  def createCachePolicy(): Request[CreateCachePolicyResult, AWSError] = js.native
  def createCachePolicy(callback: js.Function2[/* err */ AWSError, /* data */ CreateCachePolicyResult, Unit]): Request[CreateCachePolicyResult, AWSError] = js.native
  /**
    * Creates a cache policy. After you create a cache policy, you can attach it to one or more cache behaviors. When it’s attached to a cache behavior, the cache policy determines the following:   The values that CloudFront includes in the cache key. These values can include HTTP headers, cookies, and URL query strings. CloudFront uses the cache key to find an object in its cache that it can return to the viewer.   The default, minimum, and maximum time to live (TTL) values that you want objects to stay in the CloudFront cache.   The headers, cookies, and query strings that are included in the cache key are automatically included in requests that CloudFront sends to the origin. CloudFront sends a request when it can’t find an object in its cache that matches the request’s cache key. If you want to send values to the origin but not include them in the cache key, use OriginRequestPolicy. For more information about cache policies, see Controlling the cache key in the Amazon CloudFront Developer Guide.
    */
  def createCachePolicy(params: CreateCachePolicyRequest): Request[CreateCachePolicyResult, AWSError] = js.native
  def createCachePolicy(
    params: CreateCachePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCachePolicyResult, Unit]
  ): Request[CreateCachePolicyResult, AWSError] = js.native
  
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
    * Creates a key group that you can use with CloudFront signed URLs and signed cookies. To create a key group, you must specify at least one public key for the key group. After you create a key group, you can reference it from one or more cache behaviors. When you reference a key group in a cache behavior, CloudFront requires signed URLs or signed cookies for all requests that match the cache behavior. The URLs or cookies must be signed with a private key whose corresponding public key is in the key group. The signed URL or cookie contains information about which public key CloudFront should use to verify the signature. For more information, see Serving private content in the Amazon CloudFront Developer Guide.
    */
  def createKeyGroup(): Request[CreateKeyGroupResult, AWSError] = js.native
  def createKeyGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateKeyGroupResult, Unit]): Request[CreateKeyGroupResult, AWSError] = js.native
  /**
    * Creates a key group that you can use with CloudFront signed URLs and signed cookies. To create a key group, you must specify at least one public key for the key group. After you create a key group, you can reference it from one or more cache behaviors. When you reference a key group in a cache behavior, CloudFront requires signed URLs or signed cookies for all requests that match the cache behavior. The URLs or cookies must be signed with a private key whose corresponding public key is in the key group. The signed URL or cookie contains information about which public key CloudFront should use to verify the signature. For more information, see Serving private content in the Amazon CloudFront Developer Guide.
    */
  def createKeyGroup(params: CreateKeyGroupRequest): Request[CreateKeyGroupResult, AWSError] = js.native
  def createKeyGroup(
    params: CreateKeyGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateKeyGroupResult, Unit]
  ): Request[CreateKeyGroupResult, AWSError] = js.native
  
  /**
    * Enables additional CloudWatch metrics for the specified CloudFront distribution. The additional metrics incur an additional cost. For more information, see Viewing additional CloudFront distribution metrics in the Amazon CloudFront Developer Guide.
    */
  def createMonitoringSubscription(): Request[CreateMonitoringSubscriptionResult, AWSError] = js.native
  def createMonitoringSubscription(callback: js.Function2[/* err */ AWSError, /* data */ CreateMonitoringSubscriptionResult, Unit]): Request[CreateMonitoringSubscriptionResult, AWSError] = js.native
  /**
    * Enables additional CloudWatch metrics for the specified CloudFront distribution. The additional metrics incur an additional cost. For more information, see Viewing additional CloudFront distribution metrics in the Amazon CloudFront Developer Guide.
    */
  def createMonitoringSubscription(params: CreateMonitoringSubscriptionRequest): Request[CreateMonitoringSubscriptionResult, AWSError] = js.native
  def createMonitoringSubscription(
    params: CreateMonitoringSubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMonitoringSubscriptionResult, Unit]
  ): Request[CreateMonitoringSubscriptionResult, AWSError] = js.native
  
  /**
    * Creates an origin request policy. After you create an origin request policy, you can attach it to one or more cache behaviors. When it’s attached to a cache behavior, the origin request policy determines the values that CloudFront includes in requests that it sends to the origin. Each request that CloudFront sends to the origin includes the following:   The request body and the URL path (without the domain name) from the viewer request.   The headers that CloudFront automatically includes in every origin request, including Host, User-Agent, and X-Amz-Cf-Id.   All HTTP headers, cookies, and URL query strings that are specified in the cache policy or the origin request policy. These can include items from the viewer request and, in the case of headers, additional ones that are added by CloudFront.   CloudFront sends a request when it can’t find a valid object in its cache that matches the request. If you want to send values to the origin and also include them in the cache key, use CachePolicy. For more information about origin request policies, see Controlling origin requests in the Amazon CloudFront Developer Guide.
    */
  def createOriginRequestPolicy(): Request[CreateOriginRequestPolicyResult, AWSError] = js.native
  def createOriginRequestPolicy(callback: js.Function2[/* err */ AWSError, /* data */ CreateOriginRequestPolicyResult, Unit]): Request[CreateOriginRequestPolicyResult, AWSError] = js.native
  /**
    * Creates an origin request policy. After you create an origin request policy, you can attach it to one or more cache behaviors. When it’s attached to a cache behavior, the origin request policy determines the values that CloudFront includes in requests that it sends to the origin. Each request that CloudFront sends to the origin includes the following:   The request body and the URL path (without the domain name) from the viewer request.   The headers that CloudFront automatically includes in every origin request, including Host, User-Agent, and X-Amz-Cf-Id.   All HTTP headers, cookies, and URL query strings that are specified in the cache policy or the origin request policy. These can include items from the viewer request and, in the case of headers, additional ones that are added by CloudFront.   CloudFront sends a request when it can’t find a valid object in its cache that matches the request. If you want to send values to the origin and also include them in the cache key, use CachePolicy. For more information about origin request policies, see Controlling origin requests in the Amazon CloudFront Developer Guide.
    */
  def createOriginRequestPolicy(params: CreateOriginRequestPolicyRequest): Request[CreateOriginRequestPolicyResult, AWSError] = js.native
  def createOriginRequestPolicy(
    params: CreateOriginRequestPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateOriginRequestPolicyResult, Unit]
  ): Request[CreateOriginRequestPolicyResult, AWSError] = js.native
  
  /**
    * Uploads a public key to CloudFront that you can use with signed URLs and signed cookies, or with field-level encryption.
    */
  def createPublicKey(): Request[CreatePublicKeyResult, AWSError] = js.native
  def createPublicKey(callback: js.Function2[/* err */ AWSError, /* data */ CreatePublicKeyResult, Unit]): Request[CreatePublicKeyResult, AWSError] = js.native
  /**
    * Uploads a public key to CloudFront that you can use with signed URLs and signed cookies, or with field-level encryption.
    */
  def createPublicKey(params: CreatePublicKeyRequest): Request[CreatePublicKeyResult, AWSError] = js.native
  def createPublicKey(
    params: CreatePublicKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePublicKeyResult, Unit]
  ): Request[CreatePublicKeyResult, AWSError] = js.native
  
  /**
    * Creates a real-time log configuration. After you create a real-time log configuration, you can attach it to one or more cache behaviors to send real-time log data to the specified Amazon Kinesis data stream. For more information about real-time log configurations, see Real-time logs in the Amazon CloudFront Developer Guide.
    */
  def createRealtimeLogConfig(): Request[CreateRealtimeLogConfigResult, AWSError] = js.native
  def createRealtimeLogConfig(callback: js.Function2[/* err */ AWSError, /* data */ CreateRealtimeLogConfigResult, Unit]): Request[CreateRealtimeLogConfigResult, AWSError] = js.native
  /**
    * Creates a real-time log configuration. After you create a real-time log configuration, you can attach it to one or more cache behaviors to send real-time log data to the specified Amazon Kinesis data stream. For more information about real-time log configurations, see Real-time logs in the Amazon CloudFront Developer Guide.
    */
  def createRealtimeLogConfig(params: CreateRealtimeLogConfigRequest): Request[CreateRealtimeLogConfigResult, AWSError] = js.native
  def createRealtimeLogConfig(
    params: CreateRealtimeLogConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRealtimeLogConfigResult, Unit]
  ): Request[CreateRealtimeLogConfigResult, AWSError] = js.native
  
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
    * Deletes a cache policy. You cannot delete a cache policy if it’s attached to a cache behavior. First update your distributions to remove the cache policy from all cache behaviors, then delete the cache policy. To delete a cache policy, you must provide the policy’s identifier and version. To get these values, you can use ListCachePolicies or GetCachePolicy.
    */
  def deleteCachePolicy(): Request[js.Object, AWSError] = js.native
  def deleteCachePolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a cache policy. You cannot delete a cache policy if it’s attached to a cache behavior. First update your distributions to remove the cache policy from all cache behaviors, then delete the cache policy. To delete a cache policy, you must provide the policy’s identifier and version. To get these values, you can use ListCachePolicies or GetCachePolicy.
    */
  def deleteCachePolicy(params: DeleteCachePolicyRequest): Request[js.Object, AWSError] = js.native
  def deleteCachePolicy(
    params: DeleteCachePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
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
    * Deletes a key group. You cannot delete a key group that is referenced in a cache behavior. First update your distributions to remove the key group from all cache behaviors, then delete the key group. To delete a key group, you must provide the key group’s identifier and version. To get these values, use ListKeyGroups followed by GetKeyGroup or GetKeyGroupConfig.
    */
  def deleteKeyGroup(): Request[js.Object, AWSError] = js.native
  def deleteKeyGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a key group. You cannot delete a key group that is referenced in a cache behavior. First update your distributions to remove the key group from all cache behaviors, then delete the key group. To delete a key group, you must provide the key group’s identifier and version. To get these values, use ListKeyGroups followed by GetKeyGroup or GetKeyGroupConfig.
    */
  def deleteKeyGroup(params: DeleteKeyGroupRequest): Request[js.Object, AWSError] = js.native
  def deleteKeyGroup(
    params: DeleteKeyGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Disables additional CloudWatch metrics for the specified CloudFront distribution.
    */
  def deleteMonitoringSubscription(): Request[DeleteMonitoringSubscriptionResult, AWSError] = js.native
  def deleteMonitoringSubscription(callback: js.Function2[/* err */ AWSError, /* data */ DeleteMonitoringSubscriptionResult, Unit]): Request[DeleteMonitoringSubscriptionResult, AWSError] = js.native
  /**
    * Disables additional CloudWatch metrics for the specified CloudFront distribution.
    */
  def deleteMonitoringSubscription(params: DeleteMonitoringSubscriptionRequest): Request[DeleteMonitoringSubscriptionResult, AWSError] = js.native
  def deleteMonitoringSubscription(
    params: DeleteMonitoringSubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteMonitoringSubscriptionResult, Unit]
  ): Request[DeleteMonitoringSubscriptionResult, AWSError] = js.native
  
  /**
    * Deletes an origin request policy. You cannot delete an origin request policy if it’s attached to any cache behaviors. First update your distributions to remove the origin request policy from all cache behaviors, then delete the origin request policy. To delete an origin request policy, you must provide the policy’s identifier and version. To get the identifier, you can use ListOriginRequestPolicies or GetOriginRequestPolicy.
    */
  def deleteOriginRequestPolicy(): Request[js.Object, AWSError] = js.native
  def deleteOriginRequestPolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an origin request policy. You cannot delete an origin request policy if it’s attached to any cache behaviors. First update your distributions to remove the origin request policy from all cache behaviors, then delete the origin request policy. To delete an origin request policy, you must provide the policy’s identifier and version. To get the identifier, you can use ListOriginRequestPolicies or GetOriginRequestPolicy.
    */
  def deleteOriginRequestPolicy(params: DeleteOriginRequestPolicyRequest): Request[js.Object, AWSError] = js.native
  def deleteOriginRequestPolicy(
    params: DeleteOriginRequestPolicyRequest,
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
    * Deletes a real-time log configuration. You cannot delete a real-time log configuration if it’s attached to a cache behavior. First update your distributions to remove the real-time log configuration from all cache behaviors, then delete the real-time log configuration. To delete a real-time log configuration, you can provide the configuration’s name or its Amazon Resource Name (ARN). You must provide at least one. If you provide both, CloudFront uses the name to identify the real-time log configuration to delete.
    */
  def deleteRealtimeLogConfig(): Request[js.Object, AWSError] = js.native
  def deleteRealtimeLogConfig(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a real-time log configuration. You cannot delete a real-time log configuration if it’s attached to a cache behavior. First update your distributions to remove the real-time log configuration from all cache behaviors, then delete the real-time log configuration. To delete a real-time log configuration, you can provide the configuration’s name or its Amazon Resource Name (ARN). You must provide at least one. If you provide both, CloudFront uses the name to identify the real-time log configuration to delete.
    */
  def deleteRealtimeLogConfig(params: DeleteRealtimeLogConfigRequest): Request[js.Object, AWSError] = js.native
  def deleteRealtimeLogConfig(
    params: DeleteRealtimeLogConfigRequest,
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
    * Gets a cache policy, including the following metadata:   The policy’s identifier.   The date and time when the policy was last modified.   To get a cache policy, you must provide the policy’s identifier. If the cache policy is attached to a distribution’s cache behavior, you can get the policy’s identifier using ListDistributions or GetDistribution. If the cache policy is not attached to a cache behavior, you can get the identifier using ListCachePolicies.
    */
  def getCachePolicy(): Request[GetCachePolicyResult, AWSError] = js.native
  def getCachePolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetCachePolicyResult, Unit]): Request[GetCachePolicyResult, AWSError] = js.native
  /**
    * Gets a cache policy, including the following metadata:   The policy’s identifier.   The date and time when the policy was last modified.   To get a cache policy, you must provide the policy’s identifier. If the cache policy is attached to a distribution’s cache behavior, you can get the policy’s identifier using ListDistributions or GetDistribution. If the cache policy is not attached to a cache behavior, you can get the identifier using ListCachePolicies.
    */
  def getCachePolicy(params: GetCachePolicyRequest): Request[GetCachePolicyResult, AWSError] = js.native
  def getCachePolicy(
    params: GetCachePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCachePolicyResult, Unit]
  ): Request[GetCachePolicyResult, AWSError] = js.native
  
  /**
    * Gets a cache policy configuration. To get a cache policy configuration, you must provide the policy’s identifier. If the cache policy is attached to a distribution’s cache behavior, you can get the policy’s identifier using ListDistributions or GetDistribution. If the cache policy is not attached to a cache behavior, you can get the identifier using ListCachePolicies.
    */
  def getCachePolicyConfig(): Request[GetCachePolicyConfigResult, AWSError] = js.native
  def getCachePolicyConfig(callback: js.Function2[/* err */ AWSError, /* data */ GetCachePolicyConfigResult, Unit]): Request[GetCachePolicyConfigResult, AWSError] = js.native
  /**
    * Gets a cache policy configuration. To get a cache policy configuration, you must provide the policy’s identifier. If the cache policy is attached to a distribution’s cache behavior, you can get the policy’s identifier using ListDistributions or GetDistribution. If the cache policy is not attached to a cache behavior, you can get the identifier using ListCachePolicies.
    */
  def getCachePolicyConfig(params: GetCachePolicyConfigRequest): Request[GetCachePolicyConfigResult, AWSError] = js.native
  def getCachePolicyConfig(
    params: GetCachePolicyConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCachePolicyConfigResult, Unit]
  ): Request[GetCachePolicyConfigResult, AWSError] = js.native
  
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
    * Gets a key group, including the date and time when the key group was last modified. To get a key group, you must provide the key group’s identifier. If the key group is referenced in a distribution’s cache behavior, you can get the key group’s identifier using ListDistributions or GetDistribution. If the key group is not referenced in a cache behavior, you can get the identifier using ListKeyGroups.
    */
  def getKeyGroup(): Request[GetKeyGroupResult, AWSError] = js.native
  def getKeyGroup(callback: js.Function2[/* err */ AWSError, /* data */ GetKeyGroupResult, Unit]): Request[GetKeyGroupResult, AWSError] = js.native
  /**
    * Gets a key group, including the date and time when the key group was last modified. To get a key group, you must provide the key group’s identifier. If the key group is referenced in a distribution’s cache behavior, you can get the key group’s identifier using ListDistributions or GetDistribution. If the key group is not referenced in a cache behavior, you can get the identifier using ListKeyGroups.
    */
  def getKeyGroup(params: GetKeyGroupRequest): Request[GetKeyGroupResult, AWSError] = js.native
  def getKeyGroup(
    params: GetKeyGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetKeyGroupResult, Unit]
  ): Request[GetKeyGroupResult, AWSError] = js.native
  
  /**
    * Gets a key group configuration. To get a key group configuration, you must provide the key group’s identifier. If the key group is referenced in a distribution’s cache behavior, you can get the key group’s identifier using ListDistributions or GetDistribution. If the key group is not referenced in a cache behavior, you can get the identifier using ListKeyGroups.
    */
  def getKeyGroupConfig(): Request[GetKeyGroupConfigResult, AWSError] = js.native
  def getKeyGroupConfig(callback: js.Function2[/* err */ AWSError, /* data */ GetKeyGroupConfigResult, Unit]): Request[GetKeyGroupConfigResult, AWSError] = js.native
  /**
    * Gets a key group configuration. To get a key group configuration, you must provide the key group’s identifier. If the key group is referenced in a distribution’s cache behavior, you can get the key group’s identifier using ListDistributions or GetDistribution. If the key group is not referenced in a cache behavior, you can get the identifier using ListKeyGroups.
    */
  def getKeyGroupConfig(params: GetKeyGroupConfigRequest): Request[GetKeyGroupConfigResult, AWSError] = js.native
  def getKeyGroupConfig(
    params: GetKeyGroupConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetKeyGroupConfigResult, Unit]
  ): Request[GetKeyGroupConfigResult, AWSError] = js.native
  
  /**
    * Gets information about whether additional CloudWatch metrics are enabled for the specified CloudFront distribution.
    */
  def getMonitoringSubscription(): Request[GetMonitoringSubscriptionResult, AWSError] = js.native
  def getMonitoringSubscription(callback: js.Function2[/* err */ AWSError, /* data */ GetMonitoringSubscriptionResult, Unit]): Request[GetMonitoringSubscriptionResult, AWSError] = js.native
  /**
    * Gets information about whether additional CloudWatch metrics are enabled for the specified CloudFront distribution.
    */
  def getMonitoringSubscription(params: GetMonitoringSubscriptionRequest): Request[GetMonitoringSubscriptionResult, AWSError] = js.native
  def getMonitoringSubscription(
    params: GetMonitoringSubscriptionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMonitoringSubscriptionResult, Unit]
  ): Request[GetMonitoringSubscriptionResult, AWSError] = js.native
  
  /**
    * Gets an origin request policy, including the following metadata:   The policy’s identifier.   The date and time when the policy was last modified.   To get an origin request policy, you must provide the policy’s identifier. If the origin request policy is attached to a distribution’s cache behavior, you can get the policy’s identifier using ListDistributions or GetDistribution. If the origin request policy is not attached to a cache behavior, you can get the identifier using ListOriginRequestPolicies.
    */
  def getOriginRequestPolicy(): Request[GetOriginRequestPolicyResult, AWSError] = js.native
  def getOriginRequestPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetOriginRequestPolicyResult, Unit]): Request[GetOriginRequestPolicyResult, AWSError] = js.native
  /**
    * Gets an origin request policy, including the following metadata:   The policy’s identifier.   The date and time when the policy was last modified.   To get an origin request policy, you must provide the policy’s identifier. If the origin request policy is attached to a distribution’s cache behavior, you can get the policy’s identifier using ListDistributions or GetDistribution. If the origin request policy is not attached to a cache behavior, you can get the identifier using ListOriginRequestPolicies.
    */
  def getOriginRequestPolicy(params: GetOriginRequestPolicyRequest): Request[GetOriginRequestPolicyResult, AWSError] = js.native
  def getOriginRequestPolicy(
    params: GetOriginRequestPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetOriginRequestPolicyResult, Unit]
  ): Request[GetOriginRequestPolicyResult, AWSError] = js.native
  
  /**
    * Gets an origin request policy configuration. To get an origin request policy configuration, you must provide the policy’s identifier. If the origin request policy is attached to a distribution’s cache behavior, you can get the policy’s identifier using ListDistributions or GetDistribution. If the origin request policy is not attached to a cache behavior, you can get the identifier using ListOriginRequestPolicies.
    */
  def getOriginRequestPolicyConfig(): Request[GetOriginRequestPolicyConfigResult, AWSError] = js.native
  def getOriginRequestPolicyConfig(callback: js.Function2[/* err */ AWSError, /* data */ GetOriginRequestPolicyConfigResult, Unit]): Request[GetOriginRequestPolicyConfigResult, AWSError] = js.native
  /**
    * Gets an origin request policy configuration. To get an origin request policy configuration, you must provide the policy’s identifier. If the origin request policy is attached to a distribution’s cache behavior, you can get the policy’s identifier using ListDistributions or GetDistribution. If the origin request policy is not attached to a cache behavior, you can get the identifier using ListOriginRequestPolicies.
    */
  def getOriginRequestPolicyConfig(params: GetOriginRequestPolicyConfigRequest): Request[GetOriginRequestPolicyConfigResult, AWSError] = js.native
  def getOriginRequestPolicyConfig(
    params: GetOriginRequestPolicyConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetOriginRequestPolicyConfigResult, Unit]
  ): Request[GetOriginRequestPolicyConfigResult, AWSError] = js.native
  
  /**
    * Gets a public key.
    */
  def getPublicKey(): Request[GetPublicKeyResult, AWSError] = js.native
  def getPublicKey(callback: js.Function2[/* err */ AWSError, /* data */ GetPublicKeyResult, Unit]): Request[GetPublicKeyResult, AWSError] = js.native
  /**
    * Gets a public key.
    */
  def getPublicKey(params: GetPublicKeyRequest): Request[GetPublicKeyResult, AWSError] = js.native
  def getPublicKey(
    params: GetPublicKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPublicKeyResult, Unit]
  ): Request[GetPublicKeyResult, AWSError] = js.native
  
  /**
    * Gets a public key configuration.
    */
  def getPublicKeyConfig(): Request[GetPublicKeyConfigResult, AWSError] = js.native
  def getPublicKeyConfig(callback: js.Function2[/* err */ AWSError, /* data */ GetPublicKeyConfigResult, Unit]): Request[GetPublicKeyConfigResult, AWSError] = js.native
  /**
    * Gets a public key configuration.
    */
  def getPublicKeyConfig(params: GetPublicKeyConfigRequest): Request[GetPublicKeyConfigResult, AWSError] = js.native
  def getPublicKeyConfig(
    params: GetPublicKeyConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPublicKeyConfigResult, Unit]
  ): Request[GetPublicKeyConfigResult, AWSError] = js.native
  
  /**
    * Gets a real-time log configuration. To get a real-time log configuration, you can provide the configuration’s name or its Amazon Resource Name (ARN). You must provide at least one. If you provide both, CloudFront uses the name to identify the real-time log configuration to get.
    */
  def getRealtimeLogConfig(): Request[GetRealtimeLogConfigResult, AWSError] = js.native
  def getRealtimeLogConfig(callback: js.Function2[/* err */ AWSError, /* data */ GetRealtimeLogConfigResult, Unit]): Request[GetRealtimeLogConfigResult, AWSError] = js.native
  /**
    * Gets a real-time log configuration. To get a real-time log configuration, you can provide the configuration’s name or its Amazon Resource Name (ARN). You must provide at least one. If you provide both, CloudFront uses the name to identify the real-time log configuration to get.
    */
  def getRealtimeLogConfig(params: GetRealtimeLogConfigRequest): Request[GetRealtimeLogConfigResult, AWSError] = js.native
  def getRealtimeLogConfig(
    params: GetRealtimeLogConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRealtimeLogConfigResult, Unit]
  ): Request[GetRealtimeLogConfigResult, AWSError] = js.native
  
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
    * Gets a list of cache policies. You can optionally apply a filter to return only the managed policies created by AWS, or only the custom policies created in your AWS account. You can optionally specify the maximum number of items to receive in the response. If the total number of items in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the next page of items, send a subsequent request that specifies the NextMarker value from the current response as the Marker value in the subsequent request.
    */
  def listCachePolicies(): Request[ListCachePoliciesResult, AWSError] = js.native
  def listCachePolicies(callback: js.Function2[/* err */ AWSError, /* data */ ListCachePoliciesResult, Unit]): Request[ListCachePoliciesResult, AWSError] = js.native
  /**
    * Gets a list of cache policies. You can optionally apply a filter to return only the managed policies created by AWS, or only the custom policies created in your AWS account. You can optionally specify the maximum number of items to receive in the response. If the total number of items in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the next page of items, send a subsequent request that specifies the NextMarker value from the current response as the Marker value in the subsequent request.
    */
  def listCachePolicies(params: ListCachePoliciesRequest): Request[ListCachePoliciesResult, AWSError] = js.native
  def listCachePolicies(
    params: ListCachePoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCachePoliciesResult, Unit]
  ): Request[ListCachePoliciesResult, AWSError] = js.native
  
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
    * Gets a list of distribution IDs for distributions that have a cache behavior that’s associated with the specified cache policy. You can optionally specify the maximum number of items to receive in the response. If the total number of items in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the next page of items, send a subsequent request that specifies the NextMarker value from the current response as the Marker value in the subsequent request.
    */
  def listDistributionsByCachePolicyId(): Request[ListDistributionsByCachePolicyIdResult, AWSError] = js.native
  def listDistributionsByCachePolicyId(
    callback: js.Function2[/* err */ AWSError, /* data */ ListDistributionsByCachePolicyIdResult, Unit]
  ): Request[ListDistributionsByCachePolicyIdResult, AWSError] = js.native
  /**
    * Gets a list of distribution IDs for distributions that have a cache behavior that’s associated with the specified cache policy. You can optionally specify the maximum number of items to receive in the response. If the total number of items in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the next page of items, send a subsequent request that specifies the NextMarker value from the current response as the Marker value in the subsequent request.
    */
  def listDistributionsByCachePolicyId(params: ListDistributionsByCachePolicyIdRequest): Request[ListDistributionsByCachePolicyIdResult, AWSError] = js.native
  def listDistributionsByCachePolicyId(
    params: ListDistributionsByCachePolicyIdRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDistributionsByCachePolicyIdResult, Unit]
  ): Request[ListDistributionsByCachePolicyIdResult, AWSError] = js.native
  
  /**
    * Gets a list of distribution IDs for distributions that have a cache behavior that references the specified key group. You can optionally specify the maximum number of items to receive in the response. If the total number of items in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the next page of items, send a subsequent request that specifies the NextMarker value from the current response as the Marker value in the subsequent request.
    */
  def listDistributionsByKeyGroup(): Request[ListDistributionsByKeyGroupResult, AWSError] = js.native
  def listDistributionsByKeyGroup(callback: js.Function2[/* err */ AWSError, /* data */ ListDistributionsByKeyGroupResult, Unit]): Request[ListDistributionsByKeyGroupResult, AWSError] = js.native
  /**
    * Gets a list of distribution IDs for distributions that have a cache behavior that references the specified key group. You can optionally specify the maximum number of items to receive in the response. If the total number of items in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the next page of items, send a subsequent request that specifies the NextMarker value from the current response as the Marker value in the subsequent request.
    */
  def listDistributionsByKeyGroup(params: ListDistributionsByKeyGroupRequest): Request[ListDistributionsByKeyGroupResult, AWSError] = js.native
  def listDistributionsByKeyGroup(
    params: ListDistributionsByKeyGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDistributionsByKeyGroupResult, Unit]
  ): Request[ListDistributionsByKeyGroupResult, AWSError] = js.native
  
  /**
    * Gets a list of distribution IDs for distributions that have a cache behavior that’s associated with the specified origin request policy. You can optionally specify the maximum number of items to receive in the response. If the total number of items in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the next page of items, send a subsequent request that specifies the NextMarker value from the current response as the Marker value in the subsequent request.
    */
  def listDistributionsByOriginRequestPolicyId(): Request[ListDistributionsByOriginRequestPolicyIdResult, AWSError] = js.native
  def listDistributionsByOriginRequestPolicyId(
    callback: js.Function2[/* err */ AWSError, /* data */ ListDistributionsByOriginRequestPolicyIdResult, Unit]
  ): Request[ListDistributionsByOriginRequestPolicyIdResult, AWSError] = js.native
  /**
    * Gets a list of distribution IDs for distributions that have a cache behavior that’s associated with the specified origin request policy. You can optionally specify the maximum number of items to receive in the response. If the total number of items in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the next page of items, send a subsequent request that specifies the NextMarker value from the current response as the Marker value in the subsequent request.
    */
  def listDistributionsByOriginRequestPolicyId(params: ListDistributionsByOriginRequestPolicyIdRequest): Request[ListDistributionsByOriginRequestPolicyIdResult, AWSError] = js.native
  def listDistributionsByOriginRequestPolicyId(
    params: ListDistributionsByOriginRequestPolicyIdRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDistributionsByOriginRequestPolicyIdResult, Unit]
  ): Request[ListDistributionsByOriginRequestPolicyIdResult, AWSError] = js.native
  
  /**
    * Gets a list of distributions that have a cache behavior that’s associated with the specified real-time log configuration. You can specify the real-time log configuration by its name or its Amazon Resource Name (ARN). You must provide at least one. If you provide both, CloudFront uses the name to identify the real-time log configuration to list distributions for. You can optionally specify the maximum number of items to receive in the response. If the total number of items in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the next page of items, send a subsequent request that specifies the NextMarker value from the current response as the Marker value in the subsequent request. 
    */
  def listDistributionsByRealtimeLogConfig(): Request[ListDistributionsByRealtimeLogConfigResult, AWSError] = js.native
  def listDistributionsByRealtimeLogConfig(
    callback: js.Function2[/* err */ AWSError, /* data */ ListDistributionsByRealtimeLogConfigResult, Unit]
  ): Request[ListDistributionsByRealtimeLogConfigResult, AWSError] = js.native
  /**
    * Gets a list of distributions that have a cache behavior that’s associated with the specified real-time log configuration. You can specify the real-time log configuration by its name or its Amazon Resource Name (ARN). You must provide at least one. If you provide both, CloudFront uses the name to identify the real-time log configuration to list distributions for. You can optionally specify the maximum number of items to receive in the response. If the total number of items in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the next page of items, send a subsequent request that specifies the NextMarker value from the current response as the Marker value in the subsequent request. 
    */
  def listDistributionsByRealtimeLogConfig(params: ListDistributionsByRealtimeLogConfigRequest): Request[ListDistributionsByRealtimeLogConfigResult, AWSError] = js.native
  def listDistributionsByRealtimeLogConfig(
    params: ListDistributionsByRealtimeLogConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDistributionsByRealtimeLogConfigResult, Unit]
  ): Request[ListDistributionsByRealtimeLogConfigResult, AWSError] = js.native
  
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
    * Gets a list of key groups. You can optionally specify the maximum number of items to receive in the response. If the total number of items in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the next page of items, send a subsequent request that specifies the NextMarker value from the current response as the Marker value in the subsequent request.
    */
  def listKeyGroups(): Request[ListKeyGroupsResult, AWSError] = js.native
  def listKeyGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListKeyGroupsResult, Unit]): Request[ListKeyGroupsResult, AWSError] = js.native
  /**
    * Gets a list of key groups. You can optionally specify the maximum number of items to receive in the response. If the total number of items in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the next page of items, send a subsequent request that specifies the NextMarker value from the current response as the Marker value in the subsequent request.
    */
  def listKeyGroups(params: ListKeyGroupsRequest): Request[ListKeyGroupsResult, AWSError] = js.native
  def listKeyGroups(
    params: ListKeyGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListKeyGroupsResult, Unit]
  ): Request[ListKeyGroupsResult, AWSError] = js.native
  
  /**
    * Gets a list of origin request policies. You can optionally apply a filter to return only the managed policies created by AWS, or only the custom policies created in your AWS account. You can optionally specify the maximum number of items to receive in the response. If the total number of items in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the next page of items, send a subsequent request that specifies the NextMarker value from the current response as the Marker value in the subsequent request.
    */
  def listOriginRequestPolicies(): Request[ListOriginRequestPoliciesResult, AWSError] = js.native
  def listOriginRequestPolicies(callback: js.Function2[/* err */ AWSError, /* data */ ListOriginRequestPoliciesResult, Unit]): Request[ListOriginRequestPoliciesResult, AWSError] = js.native
  /**
    * Gets a list of origin request policies. You can optionally apply a filter to return only the managed policies created by AWS, or only the custom policies created in your AWS account. You can optionally specify the maximum number of items to receive in the response. If the total number of items in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the next page of items, send a subsequent request that specifies the NextMarker value from the current response as the Marker value in the subsequent request.
    */
  def listOriginRequestPolicies(params: ListOriginRequestPoliciesRequest): Request[ListOriginRequestPoliciesResult, AWSError] = js.native
  def listOriginRequestPolicies(
    params: ListOriginRequestPoliciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListOriginRequestPoliciesResult, Unit]
  ): Request[ListOriginRequestPoliciesResult, AWSError] = js.native
  
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
    * Gets a list of real-time log configurations. You can optionally specify the maximum number of items to receive in the response. If the total number of items in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the next page of items, send a subsequent request that specifies the NextMarker value from the current response as the Marker value in the subsequent request. 
    */
  def listRealtimeLogConfigs(): Request[ListRealtimeLogConfigsResult, AWSError] = js.native
  def listRealtimeLogConfigs(callback: js.Function2[/* err */ AWSError, /* data */ ListRealtimeLogConfigsResult, Unit]): Request[ListRealtimeLogConfigsResult, AWSError] = js.native
  /**
    * Gets a list of real-time log configurations. You can optionally specify the maximum number of items to receive in the response. If the total number of items in the list exceeds the maximum that you specify, or the default maximum, the response is paginated. To get the next page of items, send a subsequent request that specifies the NextMarker value from the current response as the Marker value in the subsequent request. 
    */
  def listRealtimeLogConfigs(params: ListRealtimeLogConfigsRequest): Request[ListRealtimeLogConfigsResult, AWSError] = js.native
  def listRealtimeLogConfigs(
    params: ListRealtimeLogConfigsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRealtimeLogConfigsResult, Unit]
  ): Request[ListRealtimeLogConfigsResult, AWSError] = js.native
  
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
    * Updates a cache policy configuration. When you update a cache policy configuration, all the fields are updated with the values provided in the request. You cannot update some fields independent of others. To update a cache policy configuration:   Use GetCachePolicyConfig to get the current configuration.   Locally modify the fields in the cache policy configuration that you want to update.   Call UpdateCachePolicy by providing the entire cache policy configuration, including the fields that you modified and those that you didn’t.  
    */
  def updateCachePolicy(): Request[UpdateCachePolicyResult, AWSError] = js.native
  def updateCachePolicy(callback: js.Function2[/* err */ AWSError, /* data */ UpdateCachePolicyResult, Unit]): Request[UpdateCachePolicyResult, AWSError] = js.native
  /**
    * Updates a cache policy configuration. When you update a cache policy configuration, all the fields are updated with the values provided in the request. You cannot update some fields independent of others. To update a cache policy configuration:   Use GetCachePolicyConfig to get the current configuration.   Locally modify the fields in the cache policy configuration that you want to update.   Call UpdateCachePolicy by providing the entire cache policy configuration, including the fields that you modified and those that you didn’t.  
    */
  def updateCachePolicy(params: UpdateCachePolicyRequest): Request[UpdateCachePolicyResult, AWSError] = js.native
  def updateCachePolicy(
    params: UpdateCachePolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateCachePolicyResult, Unit]
  ): Request[UpdateCachePolicyResult, AWSError] = js.native
  
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
    * Updates a key group. When you update a key group, all the fields are updated with the values provided in the request. You cannot update some fields independent of others. To update a key group:   Get the current key group with GetKeyGroup or GetKeyGroupConfig.   Locally modify the fields in the key group that you want to update. For example, add or remove public key IDs.   Call UpdateKeyGroup with the entire key group object, including the fields that you modified and those that you didn’t.  
    */
  def updateKeyGroup(): Request[UpdateKeyGroupResult, AWSError] = js.native
  def updateKeyGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateKeyGroupResult, Unit]): Request[UpdateKeyGroupResult, AWSError] = js.native
  /**
    * Updates a key group. When you update a key group, all the fields are updated with the values provided in the request. You cannot update some fields independent of others. To update a key group:   Get the current key group with GetKeyGroup or GetKeyGroupConfig.   Locally modify the fields in the key group that you want to update. For example, add or remove public key IDs.   Call UpdateKeyGroup with the entire key group object, including the fields that you modified and those that you didn’t.  
    */
  def updateKeyGroup(params: UpdateKeyGroupRequest): Request[UpdateKeyGroupResult, AWSError] = js.native
  def updateKeyGroup(
    params: UpdateKeyGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateKeyGroupResult, Unit]
  ): Request[UpdateKeyGroupResult, AWSError] = js.native
  
  /**
    * Updates an origin request policy configuration. When you update an origin request policy configuration, all the fields are updated with the values provided in the request. You cannot update some fields independent of others. To update an origin request policy configuration:   Use GetOriginRequestPolicyConfig to get the current configuration.   Locally modify the fields in the origin request policy configuration that you want to update.   Call UpdateOriginRequestPolicy by providing the entire origin request policy configuration, including the fields that you modified and those that you didn’t.  
    */
  def updateOriginRequestPolicy(): Request[UpdateOriginRequestPolicyResult, AWSError] = js.native
  def updateOriginRequestPolicy(callback: js.Function2[/* err */ AWSError, /* data */ UpdateOriginRequestPolicyResult, Unit]): Request[UpdateOriginRequestPolicyResult, AWSError] = js.native
  /**
    * Updates an origin request policy configuration. When you update an origin request policy configuration, all the fields are updated with the values provided in the request. You cannot update some fields independent of others. To update an origin request policy configuration:   Use GetOriginRequestPolicyConfig to get the current configuration.   Locally modify the fields in the origin request policy configuration that you want to update.   Call UpdateOriginRequestPolicy by providing the entire origin request policy configuration, including the fields that you modified and those that you didn’t.  
    */
  def updateOriginRequestPolicy(params: UpdateOriginRequestPolicyRequest): Request[UpdateOriginRequestPolicyResult, AWSError] = js.native
  def updateOriginRequestPolicy(
    params: UpdateOriginRequestPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateOriginRequestPolicyResult, Unit]
  ): Request[UpdateOriginRequestPolicyResult, AWSError] = js.native
  
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
    * Updates a real-time log configuration. When you update a real-time log configuration, all the parameters are updated with the values provided in the request. You cannot update some parameters independent of others. To update a real-time log configuration:   Call GetRealtimeLogConfig to get the current real-time log configuration.   Locally modify the parameters in the real-time log configuration that you want to update.   Call this API (UpdateRealtimeLogConfig) by providing the entire real-time log configuration, including the parameters that you modified and those that you didn’t.   You cannot update a real-time log configuration’s Name or ARN.
    */
  def updateRealtimeLogConfig(): Request[UpdateRealtimeLogConfigResult, AWSError] = js.native
  def updateRealtimeLogConfig(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRealtimeLogConfigResult, Unit]): Request[UpdateRealtimeLogConfigResult, AWSError] = js.native
  /**
    * Updates a real-time log configuration. When you update a real-time log configuration, all the parameters are updated with the values provided in the request. You cannot update some parameters independent of others. To update a real-time log configuration:   Call GetRealtimeLogConfig to get the current real-time log configuration.   Locally modify the parameters in the real-time log configuration that you want to update.   Call this API (UpdateRealtimeLogConfig) by providing the entire real-time log configuration, including the parameters that you modified and those that you didn’t.   You cannot update a real-time log configuration’s Name or ARN.
    */
  def updateRealtimeLogConfig(params: UpdateRealtimeLogConfigRequest): Request[UpdateRealtimeLogConfigResult, AWSError] = js.native
  def updateRealtimeLogConfig(
    params: UpdateRealtimeLogConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRealtimeLogConfigResult, Unit]
  ): Request[UpdateRealtimeLogConfigResult, AWSError] = js.native
  
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
