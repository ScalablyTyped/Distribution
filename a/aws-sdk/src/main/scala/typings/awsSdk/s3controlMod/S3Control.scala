package typings.awsSdk.s3controlMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3Control extends Service {
  
  @JSName("config")
  var config_S3Control: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an access point and associates it with the specified bucket. For more information, see Managing Data Access with Amazon S3 Access Points in the Amazon S3 User Guide.   S3 on Outposts only supports VPC-style access points.  For more information, see  Accessing Amazon S3 on Outposts using virtual private cloud (VPC) only access points in the Amazon S3 User Guide.  All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section.  The following actions are related to CreateAccessPoint:    GetAccessPoint     DeleteAccessPoint     ListAccessPoints   
    */
  def createAccessPoint(): Request[CreateAccessPointResult, AWSError] = js.native
  def createAccessPoint(callback: js.Function2[/* err */ AWSError, /* data */ CreateAccessPointResult, Unit]): Request[CreateAccessPointResult, AWSError] = js.native
  /**
    * Creates an access point and associates it with the specified bucket. For more information, see Managing Data Access with Amazon S3 Access Points in the Amazon S3 User Guide.   S3 on Outposts only supports VPC-style access points.  For more information, see  Accessing Amazon S3 on Outposts using virtual private cloud (VPC) only access points in the Amazon S3 User Guide.  All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section.  The following actions are related to CreateAccessPoint:    GetAccessPoint     DeleteAccessPoint     ListAccessPoints   
    */
  def createAccessPoint(params: CreateAccessPointRequest): Request[CreateAccessPointResult, AWSError] = js.native
  def createAccessPoint(
    params: CreateAccessPointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAccessPointResult, Unit]
  ): Request[CreateAccessPointResult, AWSError] = js.native
  
  /**
    * Creates an Object Lambda Access Point. For more information, see Transforming objects with Object Lambda Access Points in the Amazon S3 User Guide. The following actions are related to CreateAccessPointForObjectLambda:    DeleteAccessPointForObjectLambda     GetAccessPointForObjectLambda     ListAccessPointsForObjectLambda   
    */
  def createAccessPointForObjectLambda(): Request[CreateAccessPointForObjectLambdaResult, AWSError] = js.native
  def createAccessPointForObjectLambda(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAccessPointForObjectLambdaResult, Unit]
  ): Request[CreateAccessPointForObjectLambdaResult, AWSError] = js.native
  /**
    * Creates an Object Lambda Access Point. For more information, see Transforming objects with Object Lambda Access Points in the Amazon S3 User Guide. The following actions are related to CreateAccessPointForObjectLambda:    DeleteAccessPointForObjectLambda     GetAccessPointForObjectLambda     ListAccessPointsForObjectLambda   
    */
  def createAccessPointForObjectLambda(params: CreateAccessPointForObjectLambdaRequest): Request[CreateAccessPointForObjectLambdaResult, AWSError] = js.native
  def createAccessPointForObjectLambda(
    params: CreateAccessPointForObjectLambdaRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAccessPointForObjectLambdaResult, Unit]
  ): Request[CreateAccessPointForObjectLambdaResult, AWSError] = js.native
  
  /**
    *  This action creates an Amazon S3 on Outposts bucket. To create an S3 bucket, see Create Bucket in the Amazon S3 API Reference.   Creates a new Outposts bucket. By creating the bucket, you become the bucket owner. To create an Outposts bucket, you must have S3 on Outposts. For more information, see Using Amazon S3 on Outposts in Amazon S3 User Guide. Not every string is an acceptable bucket name. For information on bucket naming restrictions, see Working with Amazon S3 Buckets. S3 on Outposts buckets support:   Tags   LifecycleConfigurations for deleting expired objects   For a complete list of restrictions and Amazon S3 feature limitations on S3 on Outposts, see  Amazon S3 on Outposts Restrictions and Limitations. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and x-amz-outpost-id in your API request, see the Examples section. The following actions are related to CreateBucket for Amazon S3 on Outposts:    PutObject     GetBucket     DeleteBucket     CreateAccessPoint     PutAccessPointPolicy   
    */
  def createBucket(): Request[CreateBucketResult, AWSError] = js.native
  def createBucket(callback: js.Function2[/* err */ AWSError, /* data */ CreateBucketResult, Unit]): Request[CreateBucketResult, AWSError] = js.native
  /**
    *  This action creates an Amazon S3 on Outposts bucket. To create an S3 bucket, see Create Bucket in the Amazon S3 API Reference.   Creates a new Outposts bucket. By creating the bucket, you become the bucket owner. To create an Outposts bucket, you must have S3 on Outposts. For more information, see Using Amazon S3 on Outposts in Amazon S3 User Guide. Not every string is an acceptable bucket name. For information on bucket naming restrictions, see Working with Amazon S3 Buckets. S3 on Outposts buckets support:   Tags   LifecycleConfigurations for deleting expired objects   For a complete list of restrictions and Amazon S3 feature limitations on S3 on Outposts, see  Amazon S3 on Outposts Restrictions and Limitations. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and x-amz-outpost-id in your API request, see the Examples section. The following actions are related to CreateBucket for Amazon S3 on Outposts:    PutObject     GetBucket     DeleteBucket     CreateAccessPoint     PutAccessPointPolicy   
    */
  def createBucket(params: CreateBucketRequest): Request[CreateBucketResult, AWSError] = js.native
  def createBucket(
    params: CreateBucketRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateBucketResult, Unit]
  ): Request[CreateBucketResult, AWSError] = js.native
  
  /**
    * You can use S3 Batch Operations to perform large-scale batch actions on Amazon S3 objects. Batch Operations can run a single action on lists of Amazon S3 objects that you specify. For more information, see S3 Batch Operations in the Amazon S3 User Guide. This action creates a S3 Batch Operations job.  Related actions include:    DescribeJob     ListJobs     UpdateJobPriority     UpdateJobStatus     JobOperation   
    */
  def createJob(): Request[CreateJobResult, AWSError] = js.native
  def createJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateJobResult, Unit]): Request[CreateJobResult, AWSError] = js.native
  /**
    * You can use S3 Batch Operations to perform large-scale batch actions on Amazon S3 objects. Batch Operations can run a single action on lists of Amazon S3 objects that you specify. For more information, see S3 Batch Operations in the Amazon S3 User Guide. This action creates a S3 Batch Operations job.  Related actions include:    DescribeJob     ListJobs     UpdateJobPriority     UpdateJobStatus     JobOperation   
    */
  def createJob(params: CreateJobRequest): Request[CreateJobResult, AWSError] = js.native
  def createJob(
    params: CreateJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateJobResult, Unit]
  ): Request[CreateJobResult, AWSError] = js.native
  
  /**
    * Creates a Multi-Region Access Point and associates it with the specified buckets. For more information about creating Multi-Region Access Points, see Creating Multi-Region Access Points in the Amazon S3 User Guide. This action will always be routed to the US West (Oregon) Region. For more information about the restrictions around managing Multi-Region Access Points, see Managing Multi-Region Access Points in the Amazon S3 User Guide. This request is asynchronous, meaning that you might receive a response before the command has completed. When this request provides a response, it provides a token that you can use to monitor the status of the request with DescribeMultiRegionAccessPointOperation. The following actions are related to CreateMultiRegionAccessPoint:    DeleteMultiRegionAccessPoint     DescribeMultiRegionAccessPointOperation     GetMultiRegionAccessPoint     ListMultiRegionAccessPoints   
    */
  def createMultiRegionAccessPoint(): Request[CreateMultiRegionAccessPointResult, AWSError] = js.native
  def createMultiRegionAccessPoint(callback: js.Function2[/* err */ AWSError, /* data */ CreateMultiRegionAccessPointResult, Unit]): Request[CreateMultiRegionAccessPointResult, AWSError] = js.native
  /**
    * Creates a Multi-Region Access Point and associates it with the specified buckets. For more information about creating Multi-Region Access Points, see Creating Multi-Region Access Points in the Amazon S3 User Guide. This action will always be routed to the US West (Oregon) Region. For more information about the restrictions around managing Multi-Region Access Points, see Managing Multi-Region Access Points in the Amazon S3 User Guide. This request is asynchronous, meaning that you might receive a response before the command has completed. When this request provides a response, it provides a token that you can use to monitor the status of the request with DescribeMultiRegionAccessPointOperation. The following actions are related to CreateMultiRegionAccessPoint:    DeleteMultiRegionAccessPoint     DescribeMultiRegionAccessPointOperation     GetMultiRegionAccessPoint     ListMultiRegionAccessPoints   
    */
  def createMultiRegionAccessPoint(params: CreateMultiRegionAccessPointRequest): Request[CreateMultiRegionAccessPointResult, AWSError] = js.native
  def createMultiRegionAccessPoint(
    params: CreateMultiRegionAccessPointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMultiRegionAccessPointResult, Unit]
  ): Request[CreateMultiRegionAccessPointResult, AWSError] = js.native
  
  /**
    * Deletes the specified access point. All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. The following actions are related to DeleteAccessPoint:    CreateAccessPoint     GetAccessPoint     ListAccessPoints   
    */
  def deleteAccessPoint(): Request[js.Object, AWSError] = js.native
  def deleteAccessPoint(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified access point. All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. The following actions are related to DeleteAccessPoint:    CreateAccessPoint     GetAccessPoint     ListAccessPoints   
    */
  def deleteAccessPoint(params: DeleteAccessPointRequest): Request[js.Object, AWSError] = js.native
  def deleteAccessPoint(
    params: DeleteAccessPointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified Object Lambda Access Point. The following actions are related to DeleteAccessPointForObjectLambda:    CreateAccessPointForObjectLambda     GetAccessPointForObjectLambda     ListAccessPointsForObjectLambda   
    */
  def deleteAccessPointForObjectLambda(): Request[js.Object, AWSError] = js.native
  def deleteAccessPointForObjectLambda(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified Object Lambda Access Point. The following actions are related to DeleteAccessPointForObjectLambda:    CreateAccessPointForObjectLambda     GetAccessPointForObjectLambda     ListAccessPointsForObjectLambda   
    */
  def deleteAccessPointForObjectLambda(params: DeleteAccessPointForObjectLambdaRequest): Request[js.Object, AWSError] = js.native
  def deleteAccessPointForObjectLambda(
    params: DeleteAccessPointForObjectLambdaRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the access point policy for the specified access point.  All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. The following actions are related to DeleteAccessPointPolicy:    PutAccessPointPolicy     GetAccessPointPolicy   
    */
  def deleteAccessPointPolicy(): Request[js.Object, AWSError] = js.native
  def deleteAccessPointPolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the access point policy for the specified access point.  All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. The following actions are related to DeleteAccessPointPolicy:    PutAccessPointPolicy     GetAccessPointPolicy   
    */
  def deleteAccessPointPolicy(params: DeleteAccessPointPolicyRequest): Request[js.Object, AWSError] = js.native
  def deleteAccessPointPolicy(
    params: DeleteAccessPointPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Removes the resource policy for an Object Lambda Access Point. The following actions are related to DeleteAccessPointPolicyForObjectLambda:    GetAccessPointPolicyForObjectLambda     PutAccessPointPolicyForObjectLambda   
    */
  def deleteAccessPointPolicyForObjectLambda(): Request[js.Object, AWSError] = js.native
  def deleteAccessPointPolicyForObjectLambda(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes the resource policy for an Object Lambda Access Point. The following actions are related to DeleteAccessPointPolicyForObjectLambda:    GetAccessPointPolicyForObjectLambda     PutAccessPointPolicyForObjectLambda   
    */
  def deleteAccessPointPolicyForObjectLambda(params: DeleteAccessPointPolicyForObjectLambdaRequest): Request[js.Object, AWSError] = js.native
  def deleteAccessPointPolicyForObjectLambda(
    params: DeleteAccessPointPolicyForObjectLambdaRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    *  This action deletes an Amazon S3 on Outposts bucket. To delete an S3 bucket, see DeleteBucket in the Amazon S3 API Reference.   Deletes the Amazon S3 on Outposts bucket. All objects (including all object versions and delete markers) in the bucket must be deleted before the bucket itself can be deleted. For more information, see Using Amazon S3 on Outposts in Amazon S3 User Guide. All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section.  Related Resources     CreateBucket     GetBucket     DeleteObject   
    */
  def deleteBucket(): Request[js.Object, AWSError] = js.native
  def deleteBucket(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    *  This action deletes an Amazon S3 on Outposts bucket. To delete an S3 bucket, see DeleteBucket in the Amazon S3 API Reference.   Deletes the Amazon S3 on Outposts bucket. All objects (including all object versions and delete markers) in the bucket must be deleted before the bucket itself can be deleted. For more information, see Using Amazon S3 on Outposts in Amazon S3 User Guide. All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section.  Related Resources     CreateBucket     GetBucket     DeleteObject   
    */
  def deleteBucket(params: DeleteBucketRequest): Request[js.Object, AWSError] = js.native
  def deleteBucket(
    params: DeleteBucketRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    *  This action deletes an Amazon S3 on Outposts bucket's lifecycle configuration. To delete an S3 bucket's lifecycle configuration, see DeleteBucketLifecycle in the Amazon S3 API Reference.   Deletes the lifecycle configuration from the specified Outposts bucket. Amazon S3 on Outposts removes all the lifecycle configuration rules in the lifecycle subresource associated with the bucket. Your objects never expire, and Amazon S3 on Outposts no longer automatically deletes any objects on the basis of rules contained in the deleted lifecycle configuration. For more information, see Using Amazon S3 on Outposts in Amazon S3 User Guide. To use this action, you must have permission to perform the s3-outposts:DeleteLifecycleConfiguration action. By default, the bucket owner has this permission and the Outposts bucket owner can grant this permission to others. All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. For more information about object expiration, see Elements to Describe Lifecycle Actions. Related actions include:    PutBucketLifecycleConfiguration     GetBucketLifecycleConfiguration   
    */
  def deleteBucketLifecycleConfiguration(): Request[js.Object, AWSError] = js.native
  def deleteBucketLifecycleConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    *  This action deletes an Amazon S3 on Outposts bucket's lifecycle configuration. To delete an S3 bucket's lifecycle configuration, see DeleteBucketLifecycle in the Amazon S3 API Reference.   Deletes the lifecycle configuration from the specified Outposts bucket. Amazon S3 on Outposts removes all the lifecycle configuration rules in the lifecycle subresource associated with the bucket. Your objects never expire, and Amazon S3 on Outposts no longer automatically deletes any objects on the basis of rules contained in the deleted lifecycle configuration. For more information, see Using Amazon S3 on Outposts in Amazon S3 User Guide. To use this action, you must have permission to perform the s3-outposts:DeleteLifecycleConfiguration action. By default, the bucket owner has this permission and the Outposts bucket owner can grant this permission to others. All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. For more information about object expiration, see Elements to Describe Lifecycle Actions. Related actions include:    PutBucketLifecycleConfiguration     GetBucketLifecycleConfiguration   
    */
  def deleteBucketLifecycleConfiguration(params: DeleteBucketLifecycleConfigurationRequest): Request[js.Object, AWSError] = js.native
  def deleteBucketLifecycleConfiguration(
    params: DeleteBucketLifecycleConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    *  This action deletes an Amazon S3 on Outposts bucket policy. To delete an S3 bucket policy, see DeleteBucketPolicy in the Amazon S3 API Reference.   This implementation of the DELETE action uses the policy subresource to delete the policy of a specified Amazon S3 on Outposts bucket. If you are using an identity other than the root user of the Amazon Web Services account that owns the bucket, the calling identity must have the s3-outposts:DeleteBucketPolicy permissions on the specified Outposts bucket and belong to the bucket owner's account to use this action. For more information, see Using Amazon S3 on Outposts in Amazon S3 User Guide. If you don't have DeleteBucketPolicy permissions, Amazon S3 returns a 403 Access Denied error. If you have the correct permissions, but you're not using an identity that belongs to the bucket owner's account, Amazon S3 returns a 405 Method Not Allowed error.   As a security precaution, the root user of the Amazon Web Services account that owns a bucket can always use this action, even if the policy explicitly denies the root user the ability to perform this action.  For more information about bucket policies, see Using Bucket Policies and User Policies.  All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. The following actions are related to DeleteBucketPolicy:    GetBucketPolicy     PutBucketPolicy   
    */
  def deleteBucketPolicy(): Request[js.Object, AWSError] = js.native
  def deleteBucketPolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    *  This action deletes an Amazon S3 on Outposts bucket policy. To delete an S3 bucket policy, see DeleteBucketPolicy in the Amazon S3 API Reference.   This implementation of the DELETE action uses the policy subresource to delete the policy of a specified Amazon S3 on Outposts bucket. If you are using an identity other than the root user of the Amazon Web Services account that owns the bucket, the calling identity must have the s3-outposts:DeleteBucketPolicy permissions on the specified Outposts bucket and belong to the bucket owner's account to use this action. For more information, see Using Amazon S3 on Outposts in Amazon S3 User Guide. If you don't have DeleteBucketPolicy permissions, Amazon S3 returns a 403 Access Denied error. If you have the correct permissions, but you're not using an identity that belongs to the bucket owner's account, Amazon S3 returns a 405 Method Not Allowed error.   As a security precaution, the root user of the Amazon Web Services account that owns a bucket can always use this action, even if the policy explicitly denies the root user the ability to perform this action.  For more information about bucket policies, see Using Bucket Policies and User Policies.  All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. The following actions are related to DeleteBucketPolicy:    GetBucketPolicy     PutBucketPolicy   
    */
  def deleteBucketPolicy(params: DeleteBucketPolicyRequest): Request[js.Object, AWSError] = js.native
  def deleteBucketPolicy(
    params: DeleteBucketPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    *  This action deletes an Amazon S3 on Outposts bucket's tags. To delete an S3 bucket tags, see DeleteBucketTagging in the Amazon S3 API Reference.   Deletes the tags from the Outposts bucket. For more information, see Using Amazon S3 on Outposts in Amazon S3 User Guide. To use this action, you must have permission to perform the PutBucketTagging action. By default, the bucket owner has this permission and can grant this permission to others.  All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. The following actions are related to DeleteBucketTagging:    GetBucketTagging     PutBucketTagging   
    */
  def deleteBucketTagging(): Request[js.Object, AWSError] = js.native
  def deleteBucketTagging(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    *  This action deletes an Amazon S3 on Outposts bucket's tags. To delete an S3 bucket tags, see DeleteBucketTagging in the Amazon S3 API Reference.   Deletes the tags from the Outposts bucket. For more information, see Using Amazon S3 on Outposts in Amazon S3 User Guide. To use this action, you must have permission to perform the PutBucketTagging action. By default, the bucket owner has this permission and can grant this permission to others.  All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. The following actions are related to DeleteBucketTagging:    GetBucketTagging     PutBucketTagging   
    */
  def deleteBucketTagging(params: DeleteBucketTaggingRequest): Request[js.Object, AWSError] = js.native
  def deleteBucketTagging(
    params: DeleteBucketTaggingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Removes the entire tag set from the specified S3 Batch Operations job. To use this operation, you must have permission to perform the s3:DeleteJobTagging action. For more information, see Controlling access and labeling jobs using tags in the Amazon S3 User Guide.  Related actions include:    CreateJob     GetJobTagging     PutJobTagging   
    */
  def deleteJobTagging(): Request[DeleteJobTaggingResult, AWSError] = js.native
  def deleteJobTagging(callback: js.Function2[/* err */ AWSError, /* data */ DeleteJobTaggingResult, Unit]): Request[DeleteJobTaggingResult, AWSError] = js.native
  /**
    * Removes the entire tag set from the specified S3 Batch Operations job. To use this operation, you must have permission to perform the s3:DeleteJobTagging action. For more information, see Controlling access and labeling jobs using tags in the Amazon S3 User Guide.  Related actions include:    CreateJob     GetJobTagging     PutJobTagging   
    */
  def deleteJobTagging(params: DeleteJobTaggingRequest): Request[DeleteJobTaggingResult, AWSError] = js.native
  def deleteJobTagging(
    params: DeleteJobTaggingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteJobTaggingResult, Unit]
  ): Request[DeleteJobTaggingResult, AWSError] = js.native
  
  /**
    * Deletes a Multi-Region Access Point. This action does not delete the buckets associated with the Multi-Region Access Point, only the Multi-Region Access Point itself. This action will always be routed to the US West (Oregon) Region. For more information about the restrictions around managing Multi-Region Access Points, see Managing Multi-Region Access Points in the Amazon S3 User Guide. This request is asynchronous, meaning that you might receive a response before the command has completed. When this request provides a response, it provides a token that you can use to monitor the status of the request with DescribeMultiRegionAccessPointOperation. The following actions are related to DeleteMultiRegionAccessPoint:    CreateMultiRegionAccessPoint     DescribeMultiRegionAccessPointOperation     GetMultiRegionAccessPoint     ListMultiRegionAccessPoints   
    */
  def deleteMultiRegionAccessPoint(): Request[DeleteMultiRegionAccessPointResult, AWSError] = js.native
  def deleteMultiRegionAccessPoint(callback: js.Function2[/* err */ AWSError, /* data */ DeleteMultiRegionAccessPointResult, Unit]): Request[DeleteMultiRegionAccessPointResult, AWSError] = js.native
  /**
    * Deletes a Multi-Region Access Point. This action does not delete the buckets associated with the Multi-Region Access Point, only the Multi-Region Access Point itself. This action will always be routed to the US West (Oregon) Region. For more information about the restrictions around managing Multi-Region Access Points, see Managing Multi-Region Access Points in the Amazon S3 User Guide. This request is asynchronous, meaning that you might receive a response before the command has completed. When this request provides a response, it provides a token that you can use to monitor the status of the request with DescribeMultiRegionAccessPointOperation. The following actions are related to DeleteMultiRegionAccessPoint:    CreateMultiRegionAccessPoint     DescribeMultiRegionAccessPointOperation     GetMultiRegionAccessPoint     ListMultiRegionAccessPoints   
    */
  def deleteMultiRegionAccessPoint(params: DeleteMultiRegionAccessPointRequest): Request[DeleteMultiRegionAccessPointResult, AWSError] = js.native
  def deleteMultiRegionAccessPoint(
    params: DeleteMultiRegionAccessPointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteMultiRegionAccessPointResult, Unit]
  ): Request[DeleteMultiRegionAccessPointResult, AWSError] = js.native
  
  /**
    * Removes the PublicAccessBlock configuration for an Amazon Web Services account. For more information, see  Using Amazon S3 block public access. Related actions include:    GetPublicAccessBlock     PutPublicAccessBlock   
    */
  def deletePublicAccessBlock(): Request[js.Object, AWSError] = js.native
  def deletePublicAccessBlock(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes the PublicAccessBlock configuration for an Amazon Web Services account. For more information, see  Using Amazon S3 block public access. Related actions include:    GetPublicAccessBlock     PutPublicAccessBlock   
    */
  def deletePublicAccessBlock(params: DeletePublicAccessBlockRequest): Request[js.Object, AWSError] = js.native
  def deletePublicAccessBlock(
    params: DeletePublicAccessBlockRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the Amazon S3 Storage Lens configuration. For more information about S3 Storage Lens, see Assessing your storage activity and usage with Amazon S3 Storage Lens  in the Amazon S3 User Guide.  To use this action, you must have permission to perform the s3:DeleteStorageLensConfiguration action. For more information, see Setting permissions to use Amazon S3 Storage Lens in the Amazon S3 User Guide. 
    */
  def deleteStorageLensConfiguration(): Request[js.Object, AWSError] = js.native
  def deleteStorageLensConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the Amazon S3 Storage Lens configuration. For more information about S3 Storage Lens, see Assessing your storage activity and usage with Amazon S3 Storage Lens  in the Amazon S3 User Guide.  To use this action, you must have permission to perform the s3:DeleteStorageLensConfiguration action. For more information, see Setting permissions to use Amazon S3 Storage Lens in the Amazon S3 User Guide. 
    */
  def deleteStorageLensConfiguration(params: DeleteStorageLensConfigurationRequest): Request[js.Object, AWSError] = js.native
  def deleteStorageLensConfiguration(
    params: DeleteStorageLensConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the Amazon S3 Storage Lens configuration tags. For more information about S3 Storage Lens, see Assessing your storage activity and usage with Amazon S3 Storage Lens  in the Amazon S3 User Guide.  To use this action, you must have permission to perform the s3:DeleteStorageLensConfigurationTagging action. For more information, see Setting permissions to use Amazon S3 Storage Lens in the Amazon S3 User Guide. 
    */
  def deleteStorageLensConfigurationTagging(): Request[DeleteStorageLensConfigurationTaggingResult, AWSError] = js.native
  def deleteStorageLensConfigurationTagging(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteStorageLensConfigurationTaggingResult, Unit]
  ): Request[DeleteStorageLensConfigurationTaggingResult, AWSError] = js.native
  /**
    * Deletes the Amazon S3 Storage Lens configuration tags. For more information about S3 Storage Lens, see Assessing your storage activity and usage with Amazon S3 Storage Lens  in the Amazon S3 User Guide.  To use this action, you must have permission to perform the s3:DeleteStorageLensConfigurationTagging action. For more information, see Setting permissions to use Amazon S3 Storage Lens in the Amazon S3 User Guide. 
    */
  def deleteStorageLensConfigurationTagging(params: DeleteStorageLensConfigurationTaggingRequest): Request[DeleteStorageLensConfigurationTaggingResult, AWSError] = js.native
  def deleteStorageLensConfigurationTagging(
    params: DeleteStorageLensConfigurationTaggingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteStorageLensConfigurationTaggingResult, Unit]
  ): Request[DeleteStorageLensConfigurationTaggingResult, AWSError] = js.native
  
  /**
    * Retrieves the configuration parameters and status for a Batch Operations job. For more information, see S3 Batch Operations in the Amazon S3 User Guide.  Related actions include:    CreateJob     ListJobs     UpdateJobPriority     UpdateJobStatus   
    */
  def describeJob(): Request[DescribeJobResult, AWSError] = js.native
  def describeJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobResult, Unit]): Request[DescribeJobResult, AWSError] = js.native
  /**
    * Retrieves the configuration parameters and status for a Batch Operations job. For more information, see S3 Batch Operations in the Amazon S3 User Guide.  Related actions include:    CreateJob     ListJobs     UpdateJobPriority     UpdateJobStatus   
    */
  def describeJob(params: DescribeJobRequest): Request[DescribeJobResult, AWSError] = js.native
  def describeJob(
    params: DescribeJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobResult, Unit]
  ): Request[DescribeJobResult, AWSError] = js.native
  
  /**
    * Retrieves the status of an asynchronous request to manage a Multi-Region Access Point. For more information about managing Multi-Region Access Points and how asynchronous requests work, see Managing Multi-Region Access Points in the Amazon S3 User Guide. The following actions are related to GetMultiRegionAccessPoint:    CreateMultiRegionAccessPoint     DeleteMultiRegionAccessPoint     GetMultiRegionAccessPoint     ListMultiRegionAccessPoints   
    */
  def describeMultiRegionAccessPointOperation(): Request[DescribeMultiRegionAccessPointOperationResult, AWSError] = js.native
  def describeMultiRegionAccessPointOperation(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMultiRegionAccessPointOperationResult, Unit]
  ): Request[DescribeMultiRegionAccessPointOperationResult, AWSError] = js.native
  /**
    * Retrieves the status of an asynchronous request to manage a Multi-Region Access Point. For more information about managing Multi-Region Access Points and how asynchronous requests work, see Managing Multi-Region Access Points in the Amazon S3 User Guide. The following actions are related to GetMultiRegionAccessPoint:    CreateMultiRegionAccessPoint     DeleteMultiRegionAccessPoint     GetMultiRegionAccessPoint     ListMultiRegionAccessPoints   
    */
  def describeMultiRegionAccessPointOperation(params: DescribeMultiRegionAccessPointOperationRequest): Request[DescribeMultiRegionAccessPointOperationResult, AWSError] = js.native
  def describeMultiRegionAccessPointOperation(
    params: DescribeMultiRegionAccessPointOperationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMultiRegionAccessPointOperationResult, Unit]
  ): Request[DescribeMultiRegionAccessPointOperationResult, AWSError] = js.native
  
  /**
    * Returns configuration information about the specified access point.  All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. The following actions are related to GetAccessPoint:    CreateAccessPoint     DeleteAccessPoint     ListAccessPoints   
    */
  def getAccessPoint(): Request[GetAccessPointResult, AWSError] = js.native
  def getAccessPoint(callback: js.Function2[/* err */ AWSError, /* data */ GetAccessPointResult, Unit]): Request[GetAccessPointResult, AWSError] = js.native
  /**
    * Returns configuration information about the specified access point.  All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. The following actions are related to GetAccessPoint:    CreateAccessPoint     DeleteAccessPoint     ListAccessPoints   
    */
  def getAccessPoint(params: GetAccessPointRequest): Request[GetAccessPointResult, AWSError] = js.native
  def getAccessPoint(
    params: GetAccessPointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAccessPointResult, Unit]
  ): Request[GetAccessPointResult, AWSError] = js.native
  
  /**
    * Returns configuration for an Object Lambda Access Point. The following actions are related to GetAccessPointConfigurationForObjectLambda:    PutAccessPointConfigurationForObjectLambda   
    */
  def getAccessPointConfigurationForObjectLambda(): Request[GetAccessPointConfigurationForObjectLambdaResult, AWSError] = js.native
  def getAccessPointConfigurationForObjectLambda(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ GetAccessPointConfigurationForObjectLambdaResult, 
      Unit
    ]
  ): Request[GetAccessPointConfigurationForObjectLambdaResult, AWSError] = js.native
  /**
    * Returns configuration for an Object Lambda Access Point. The following actions are related to GetAccessPointConfigurationForObjectLambda:    PutAccessPointConfigurationForObjectLambda   
    */
  def getAccessPointConfigurationForObjectLambda(params: GetAccessPointConfigurationForObjectLambdaRequest): Request[GetAccessPointConfigurationForObjectLambdaResult, AWSError] = js.native
  def getAccessPointConfigurationForObjectLambda(
    params: GetAccessPointConfigurationForObjectLambdaRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ GetAccessPointConfigurationForObjectLambdaResult, 
      Unit
    ]
  ): Request[GetAccessPointConfigurationForObjectLambdaResult, AWSError] = js.native
  
  /**
    * Returns configuration information about the specified Object Lambda Access Point The following actions are related to GetAccessPointForObjectLambda:    CreateAccessPointForObjectLambda     DeleteAccessPointForObjectLambda     ListAccessPointsForObjectLambda   
    */
  def getAccessPointForObjectLambda(): Request[GetAccessPointForObjectLambdaResult, AWSError] = js.native
  def getAccessPointForObjectLambda(callback: js.Function2[/* err */ AWSError, /* data */ GetAccessPointForObjectLambdaResult, Unit]): Request[GetAccessPointForObjectLambdaResult, AWSError] = js.native
  /**
    * Returns configuration information about the specified Object Lambda Access Point The following actions are related to GetAccessPointForObjectLambda:    CreateAccessPointForObjectLambda     DeleteAccessPointForObjectLambda     ListAccessPointsForObjectLambda   
    */
  def getAccessPointForObjectLambda(params: GetAccessPointForObjectLambdaRequest): Request[GetAccessPointForObjectLambdaResult, AWSError] = js.native
  def getAccessPointForObjectLambda(
    params: GetAccessPointForObjectLambdaRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAccessPointForObjectLambdaResult, Unit]
  ): Request[GetAccessPointForObjectLambdaResult, AWSError] = js.native
  
  /**
    * Returns the access point policy associated with the specified access point. The following actions are related to GetAccessPointPolicy:    PutAccessPointPolicy     DeleteAccessPointPolicy   
    */
  def getAccessPointPolicy(): Request[GetAccessPointPolicyResult, AWSError] = js.native
  def getAccessPointPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetAccessPointPolicyResult, Unit]): Request[GetAccessPointPolicyResult, AWSError] = js.native
  /**
    * Returns the access point policy associated with the specified access point. The following actions are related to GetAccessPointPolicy:    PutAccessPointPolicy     DeleteAccessPointPolicy   
    */
  def getAccessPointPolicy(params: GetAccessPointPolicyRequest): Request[GetAccessPointPolicyResult, AWSError] = js.native
  def getAccessPointPolicy(
    params: GetAccessPointPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAccessPointPolicyResult, Unit]
  ): Request[GetAccessPointPolicyResult, AWSError] = js.native
  
  /**
    * Returns the resource policy for an Object Lambda Access Point. The following actions are related to GetAccessPointPolicyForObjectLambda:    DeleteAccessPointPolicyForObjectLambda     PutAccessPointPolicyForObjectLambda   
    */
  def getAccessPointPolicyForObjectLambda(): Request[GetAccessPointPolicyForObjectLambdaResult, AWSError] = js.native
  def getAccessPointPolicyForObjectLambda(
    callback: js.Function2[/* err */ AWSError, /* data */ GetAccessPointPolicyForObjectLambdaResult, Unit]
  ): Request[GetAccessPointPolicyForObjectLambdaResult, AWSError] = js.native
  /**
    * Returns the resource policy for an Object Lambda Access Point. The following actions are related to GetAccessPointPolicyForObjectLambda:    DeleteAccessPointPolicyForObjectLambda     PutAccessPointPolicyForObjectLambda   
    */
  def getAccessPointPolicyForObjectLambda(params: GetAccessPointPolicyForObjectLambdaRequest): Request[GetAccessPointPolicyForObjectLambdaResult, AWSError] = js.native
  def getAccessPointPolicyForObjectLambda(
    params: GetAccessPointPolicyForObjectLambdaRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAccessPointPolicyForObjectLambdaResult, Unit]
  ): Request[GetAccessPointPolicyForObjectLambdaResult, AWSError] = js.native
  
  /**
    * Indicates whether the specified access point currently has a policy that allows public access. For more information about public access through access points, see Managing Data Access with Amazon S3 access points in the Amazon S3 User Guide.
    */
  def getAccessPointPolicyStatus(): Request[GetAccessPointPolicyStatusResult, AWSError] = js.native
  def getAccessPointPolicyStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetAccessPointPolicyStatusResult, Unit]): Request[GetAccessPointPolicyStatusResult, AWSError] = js.native
  /**
    * Indicates whether the specified access point currently has a policy that allows public access. For more information about public access through access points, see Managing Data Access with Amazon S3 access points in the Amazon S3 User Guide.
    */
  def getAccessPointPolicyStatus(params: GetAccessPointPolicyStatusRequest): Request[GetAccessPointPolicyStatusResult, AWSError] = js.native
  def getAccessPointPolicyStatus(
    params: GetAccessPointPolicyStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAccessPointPolicyStatusResult, Unit]
  ): Request[GetAccessPointPolicyStatusResult, AWSError] = js.native
  
  /**
    * Returns the status of the resource policy associated with an Object Lambda Access Point.
    */
  def getAccessPointPolicyStatusForObjectLambda(): Request[GetAccessPointPolicyStatusForObjectLambdaResult, AWSError] = js.native
  def getAccessPointPolicyStatusForObjectLambda(
    callback: js.Function2[/* err */ AWSError, /* data */ GetAccessPointPolicyStatusForObjectLambdaResult, Unit]
  ): Request[GetAccessPointPolicyStatusForObjectLambdaResult, AWSError] = js.native
  /**
    * Returns the status of the resource policy associated with an Object Lambda Access Point.
    */
  def getAccessPointPolicyStatusForObjectLambda(params: GetAccessPointPolicyStatusForObjectLambdaRequest): Request[GetAccessPointPolicyStatusForObjectLambdaResult, AWSError] = js.native
  def getAccessPointPolicyStatusForObjectLambda(
    params: GetAccessPointPolicyStatusForObjectLambdaRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAccessPointPolicyStatusForObjectLambdaResult, Unit]
  ): Request[GetAccessPointPolicyStatusForObjectLambdaResult, AWSError] = js.native
  
  /**
    * Gets an Amazon S3 on Outposts bucket. For more information, see  Using Amazon S3 on Outposts in the Amazon S3 User Guide. If you are using an identity other than the root user of the Amazon Web Services account that owns the Outposts bucket, the calling identity must have the s3-outposts:GetBucket permissions on the specified Outposts bucket and belong to the Outposts bucket owner's account in order to use this action. Only users from Outposts bucket owner account with the right permissions can perform actions on an Outposts bucket.   If you don't have s3-outposts:GetBucket permissions or you're not using an identity that belongs to the bucket owner's account, Amazon S3 returns a 403 Access Denied error. The following actions are related to GetBucket for Amazon S3 on Outposts: All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section.    PutObject     CreateBucket     DeleteBucket   
    */
  def getBucket(): Request[GetBucketResult, AWSError] = js.native
  def getBucket(callback: js.Function2[/* err */ AWSError, /* data */ GetBucketResult, Unit]): Request[GetBucketResult, AWSError] = js.native
  /**
    * Gets an Amazon S3 on Outposts bucket. For more information, see  Using Amazon S3 on Outposts in the Amazon S3 User Guide. If you are using an identity other than the root user of the Amazon Web Services account that owns the Outposts bucket, the calling identity must have the s3-outposts:GetBucket permissions on the specified Outposts bucket and belong to the Outposts bucket owner's account in order to use this action. Only users from Outposts bucket owner account with the right permissions can perform actions on an Outposts bucket.   If you don't have s3-outposts:GetBucket permissions or you're not using an identity that belongs to the bucket owner's account, Amazon S3 returns a 403 Access Denied error. The following actions are related to GetBucket for Amazon S3 on Outposts: All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section.    PutObject     CreateBucket     DeleteBucket   
    */
  def getBucket(params: GetBucketRequest): Request[GetBucketResult, AWSError] = js.native
  def getBucket(
    params: GetBucketRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBucketResult, Unit]
  ): Request[GetBucketResult, AWSError] = js.native
  
  /**
    *  This action gets an Amazon S3 on Outposts bucket's lifecycle configuration. To get an S3 bucket's lifecycle configuration, see GetBucketLifecycleConfiguration in the Amazon S3 API Reference.   Returns the lifecycle configuration information set on the Outposts bucket. For more information, see Using Amazon S3 on Outposts and for information about lifecycle configuration, see  Object Lifecycle Management in Amazon S3 User Guide. To use this action, you must have permission to perform the s3-outposts:GetLifecycleConfiguration action. The Outposts bucket owner has this permission, by default. The bucket owner can grant this permission to others. For more information about permissions, see Permissions Related to Bucket Subresource Operations and Managing Access Permissions to Your Amazon S3 Resources. All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section.  GetBucketLifecycleConfiguration has the following special error:   Error code: NoSuchLifecycleConfiguration    Description: The lifecycle configuration does not exist.   HTTP Status Code: 404 Not Found   SOAP Fault Code Prefix: Client     The following actions are related to GetBucketLifecycleConfiguration:    PutBucketLifecycleConfiguration     DeleteBucketLifecycleConfiguration   
    */
  def getBucketLifecycleConfiguration(): Request[GetBucketLifecycleConfigurationResult, AWSError] = js.native
  def getBucketLifecycleConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ GetBucketLifecycleConfigurationResult, Unit]): Request[GetBucketLifecycleConfigurationResult, AWSError] = js.native
  /**
    *  This action gets an Amazon S3 on Outposts bucket's lifecycle configuration. To get an S3 bucket's lifecycle configuration, see GetBucketLifecycleConfiguration in the Amazon S3 API Reference.   Returns the lifecycle configuration information set on the Outposts bucket. For more information, see Using Amazon S3 on Outposts and for information about lifecycle configuration, see  Object Lifecycle Management in Amazon S3 User Guide. To use this action, you must have permission to perform the s3-outposts:GetLifecycleConfiguration action. The Outposts bucket owner has this permission, by default. The bucket owner can grant this permission to others. For more information about permissions, see Permissions Related to Bucket Subresource Operations and Managing Access Permissions to Your Amazon S3 Resources. All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section.  GetBucketLifecycleConfiguration has the following special error:   Error code: NoSuchLifecycleConfiguration    Description: The lifecycle configuration does not exist.   HTTP Status Code: 404 Not Found   SOAP Fault Code Prefix: Client     The following actions are related to GetBucketLifecycleConfiguration:    PutBucketLifecycleConfiguration     DeleteBucketLifecycleConfiguration   
    */
  def getBucketLifecycleConfiguration(params: GetBucketLifecycleConfigurationRequest): Request[GetBucketLifecycleConfigurationResult, AWSError] = js.native
  def getBucketLifecycleConfiguration(
    params: GetBucketLifecycleConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBucketLifecycleConfigurationResult, Unit]
  ): Request[GetBucketLifecycleConfigurationResult, AWSError] = js.native
  
  /**
    *  This action gets a bucket policy for an Amazon S3 on Outposts bucket. To get a policy for an S3 bucket, see GetBucketPolicy in the Amazon S3 API Reference.   Returns the policy of a specified Outposts bucket. For more information, see Using Amazon S3 on Outposts in the Amazon S3 User Guide. If you are using an identity other than the root user of the Amazon Web Services account that owns the bucket, the calling identity must have the GetBucketPolicy permissions on the specified bucket and belong to the bucket owner's account in order to use this action. Only users from Outposts bucket owner account with the right permissions can perform actions on an Outposts bucket. If you don't have s3-outposts:GetBucketPolicy permissions or you're not using an identity that belongs to the bucket owner's account, Amazon S3 returns a 403 Access Denied error.  As a security precaution, the root user of the Amazon Web Services account that owns a bucket can always use this action, even if the policy explicitly denies the root user the ability to perform this action.  For more information about bucket policies, see Using Bucket Policies and User Policies. All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. The following actions are related to GetBucketPolicy:    GetObject     PutBucketPolicy     DeleteBucketPolicy   
    */
  def getBucketPolicy(): Request[GetBucketPolicyResult, AWSError] = js.native
  def getBucketPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetBucketPolicyResult, Unit]): Request[GetBucketPolicyResult, AWSError] = js.native
  /**
    *  This action gets a bucket policy for an Amazon S3 on Outposts bucket. To get a policy for an S3 bucket, see GetBucketPolicy in the Amazon S3 API Reference.   Returns the policy of a specified Outposts bucket. For more information, see Using Amazon S3 on Outposts in the Amazon S3 User Guide. If you are using an identity other than the root user of the Amazon Web Services account that owns the bucket, the calling identity must have the GetBucketPolicy permissions on the specified bucket and belong to the bucket owner's account in order to use this action. Only users from Outposts bucket owner account with the right permissions can perform actions on an Outposts bucket. If you don't have s3-outposts:GetBucketPolicy permissions or you're not using an identity that belongs to the bucket owner's account, Amazon S3 returns a 403 Access Denied error.  As a security precaution, the root user of the Amazon Web Services account that owns a bucket can always use this action, even if the policy explicitly denies the root user the ability to perform this action.  For more information about bucket policies, see Using Bucket Policies and User Policies. All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. The following actions are related to GetBucketPolicy:    GetObject     PutBucketPolicy     DeleteBucketPolicy   
    */
  def getBucketPolicy(params: GetBucketPolicyRequest): Request[GetBucketPolicyResult, AWSError] = js.native
  def getBucketPolicy(
    params: GetBucketPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBucketPolicyResult, Unit]
  ): Request[GetBucketPolicyResult, AWSError] = js.native
  
  /**
    *  This action gets an Amazon S3 on Outposts bucket's tags. To get an S3 bucket tags, see GetBucketTagging in the Amazon S3 API Reference.   Returns the tag set associated with the Outposts bucket. For more information, see Using Amazon S3 on Outposts in the Amazon S3 User Guide. To use this action, you must have permission to perform the GetBucketTagging action. By default, the bucket owner has this permission and can grant this permission to others.  GetBucketTagging has the following special error:   Error code: NoSuchTagSetError    Description: There is no tag set associated with the bucket.     All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. The following actions are related to GetBucketTagging:    PutBucketTagging     DeleteBucketTagging   
    */
  def getBucketTagging(): Request[GetBucketTaggingResult, AWSError] = js.native
  def getBucketTagging(callback: js.Function2[/* err */ AWSError, /* data */ GetBucketTaggingResult, Unit]): Request[GetBucketTaggingResult, AWSError] = js.native
  /**
    *  This action gets an Amazon S3 on Outposts bucket's tags. To get an S3 bucket tags, see GetBucketTagging in the Amazon S3 API Reference.   Returns the tag set associated with the Outposts bucket. For more information, see Using Amazon S3 on Outposts in the Amazon S3 User Guide. To use this action, you must have permission to perform the GetBucketTagging action. By default, the bucket owner has this permission and can grant this permission to others.  GetBucketTagging has the following special error:   Error code: NoSuchTagSetError    Description: There is no tag set associated with the bucket.     All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. The following actions are related to GetBucketTagging:    PutBucketTagging     DeleteBucketTagging   
    */
  def getBucketTagging(params: GetBucketTaggingRequest): Request[GetBucketTaggingResult, AWSError] = js.native
  def getBucketTagging(
    params: GetBucketTaggingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBucketTaggingResult, Unit]
  ): Request[GetBucketTaggingResult, AWSError] = js.native
  
  /**
    * Returns the tags on an S3 Batch Operations job. To use this operation, you must have permission to perform the s3:GetJobTagging action. For more information, see Controlling access and labeling jobs using tags in the Amazon S3 User Guide.  Related actions include:    CreateJob     PutJobTagging     DeleteJobTagging   
    */
  def getJobTagging(): Request[GetJobTaggingResult, AWSError] = js.native
  def getJobTagging(callback: js.Function2[/* err */ AWSError, /* data */ GetJobTaggingResult, Unit]): Request[GetJobTaggingResult, AWSError] = js.native
  /**
    * Returns the tags on an S3 Batch Operations job. To use this operation, you must have permission to perform the s3:GetJobTagging action. For more information, see Controlling access and labeling jobs using tags in the Amazon S3 User Guide.  Related actions include:    CreateJob     PutJobTagging     DeleteJobTagging   
    */
  def getJobTagging(params: GetJobTaggingRequest): Request[GetJobTaggingResult, AWSError] = js.native
  def getJobTagging(
    params: GetJobTaggingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetJobTaggingResult, Unit]
  ): Request[GetJobTaggingResult, AWSError] = js.native
  
  /**
    * Returns configuration information about the specified Multi-Region Access Point. This action will always be routed to the US West (Oregon) Region. For more information about the restrictions around managing Multi-Region Access Points, see Managing Multi-Region Access Points in the Amazon S3 User Guide. The following actions are related to GetMultiRegionAccessPoint:    CreateMultiRegionAccessPoint     DeleteMultiRegionAccessPoint     DescribeMultiRegionAccessPointOperation     ListMultiRegionAccessPoints   
    */
  def getMultiRegionAccessPoint(): Request[GetMultiRegionAccessPointResult, AWSError] = js.native
  def getMultiRegionAccessPoint(callback: js.Function2[/* err */ AWSError, /* data */ GetMultiRegionAccessPointResult, Unit]): Request[GetMultiRegionAccessPointResult, AWSError] = js.native
  /**
    * Returns configuration information about the specified Multi-Region Access Point. This action will always be routed to the US West (Oregon) Region. For more information about the restrictions around managing Multi-Region Access Points, see Managing Multi-Region Access Points in the Amazon S3 User Guide. The following actions are related to GetMultiRegionAccessPoint:    CreateMultiRegionAccessPoint     DeleteMultiRegionAccessPoint     DescribeMultiRegionAccessPointOperation     ListMultiRegionAccessPoints   
    */
  def getMultiRegionAccessPoint(params: GetMultiRegionAccessPointRequest): Request[GetMultiRegionAccessPointResult, AWSError] = js.native
  def getMultiRegionAccessPoint(
    params: GetMultiRegionAccessPointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMultiRegionAccessPointResult, Unit]
  ): Request[GetMultiRegionAccessPointResult, AWSError] = js.native
  
  /**
    * Returns the access control policy of the specified Multi-Region Access Point. This action will always be routed to the US West (Oregon) Region. For more information about the restrictions around managing Multi-Region Access Points, see Managing Multi-Region Access Points in the Amazon S3 User Guide. The following actions are related to GetMultiRegionAccessPointPolicy:    GetMultiRegionAccessPointPolicyStatus     PutMultiRegionAccessPointPolicy   
    */
  def getMultiRegionAccessPointPolicy(): Request[GetMultiRegionAccessPointPolicyResult, AWSError] = js.native
  def getMultiRegionAccessPointPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetMultiRegionAccessPointPolicyResult, Unit]): Request[GetMultiRegionAccessPointPolicyResult, AWSError] = js.native
  /**
    * Returns the access control policy of the specified Multi-Region Access Point. This action will always be routed to the US West (Oregon) Region. For more information about the restrictions around managing Multi-Region Access Points, see Managing Multi-Region Access Points in the Amazon S3 User Guide. The following actions are related to GetMultiRegionAccessPointPolicy:    GetMultiRegionAccessPointPolicyStatus     PutMultiRegionAccessPointPolicy   
    */
  def getMultiRegionAccessPointPolicy(params: GetMultiRegionAccessPointPolicyRequest): Request[GetMultiRegionAccessPointPolicyResult, AWSError] = js.native
  def getMultiRegionAccessPointPolicy(
    params: GetMultiRegionAccessPointPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMultiRegionAccessPointPolicyResult, Unit]
  ): Request[GetMultiRegionAccessPointPolicyResult, AWSError] = js.native
  
  /**
    * Indicates whether the specified Multi-Region Access Point has an access control policy that allows public access. This action will always be routed to the US West (Oregon) Region. For more information about the restrictions around managing Multi-Region Access Points, see Managing Multi-Region Access Points in the Amazon S3 User Guide. The following actions are related to GetMultiRegionAccessPointPolicyStatus:    GetMultiRegionAccessPointPolicy     PutMultiRegionAccessPointPolicy   
    */
  def getMultiRegionAccessPointPolicyStatus(): Request[GetMultiRegionAccessPointPolicyStatusResult, AWSError] = js.native
  def getMultiRegionAccessPointPolicyStatus(
    callback: js.Function2[/* err */ AWSError, /* data */ GetMultiRegionAccessPointPolicyStatusResult, Unit]
  ): Request[GetMultiRegionAccessPointPolicyStatusResult, AWSError] = js.native
  /**
    * Indicates whether the specified Multi-Region Access Point has an access control policy that allows public access. This action will always be routed to the US West (Oregon) Region. For more information about the restrictions around managing Multi-Region Access Points, see Managing Multi-Region Access Points in the Amazon S3 User Guide. The following actions are related to GetMultiRegionAccessPointPolicyStatus:    GetMultiRegionAccessPointPolicy     PutMultiRegionAccessPointPolicy   
    */
  def getMultiRegionAccessPointPolicyStatus(params: GetMultiRegionAccessPointPolicyStatusRequest): Request[GetMultiRegionAccessPointPolicyStatusResult, AWSError] = js.native
  def getMultiRegionAccessPointPolicyStatus(
    params: GetMultiRegionAccessPointPolicyStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMultiRegionAccessPointPolicyStatusResult, Unit]
  ): Request[GetMultiRegionAccessPointPolicyStatusResult, AWSError] = js.native
  
  /**
    * Retrieves the PublicAccessBlock configuration for an Amazon Web Services account. For more information, see  Using Amazon S3 block public access. Related actions include:    DeletePublicAccessBlock     PutPublicAccessBlock   
    */
  def getPublicAccessBlock(): Request[GetPublicAccessBlockOutput, AWSError] = js.native
  def getPublicAccessBlock(callback: js.Function2[/* err */ AWSError, /* data */ GetPublicAccessBlockOutput, Unit]): Request[GetPublicAccessBlockOutput, AWSError] = js.native
  /**
    * Retrieves the PublicAccessBlock configuration for an Amazon Web Services account. For more information, see  Using Amazon S3 block public access. Related actions include:    DeletePublicAccessBlock     PutPublicAccessBlock   
    */
  def getPublicAccessBlock(params: GetPublicAccessBlockRequest): Request[GetPublicAccessBlockOutput, AWSError] = js.native
  def getPublicAccessBlock(
    params: GetPublicAccessBlockRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPublicAccessBlockOutput, Unit]
  ): Request[GetPublicAccessBlockOutput, AWSError] = js.native
  
  /**
    * Gets the Amazon S3 Storage Lens configuration. For more information, see Assessing your storage activity and usage with Amazon S3 Storage Lens  in the Amazon S3 User Guide.  To use this action, you must have permission to perform the s3:GetStorageLensConfiguration action. For more information, see Setting permissions to use Amazon S3 Storage Lens in the Amazon S3 User Guide. 
    */
  def getStorageLensConfiguration(): Request[GetStorageLensConfigurationResult, AWSError] = js.native
  def getStorageLensConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ GetStorageLensConfigurationResult, Unit]): Request[GetStorageLensConfigurationResult, AWSError] = js.native
  /**
    * Gets the Amazon S3 Storage Lens configuration. For more information, see Assessing your storage activity and usage with Amazon S3 Storage Lens  in the Amazon S3 User Guide.  To use this action, you must have permission to perform the s3:GetStorageLensConfiguration action. For more information, see Setting permissions to use Amazon S3 Storage Lens in the Amazon S3 User Guide. 
    */
  def getStorageLensConfiguration(params: GetStorageLensConfigurationRequest): Request[GetStorageLensConfigurationResult, AWSError] = js.native
  def getStorageLensConfiguration(
    params: GetStorageLensConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStorageLensConfigurationResult, Unit]
  ): Request[GetStorageLensConfigurationResult, AWSError] = js.native
  
  /**
    * Gets the tags of Amazon S3 Storage Lens configuration. For more information about S3 Storage Lens, see Assessing your storage activity and usage with Amazon S3 Storage Lens  in the Amazon S3 User Guide.  To use this action, you must have permission to perform the s3:GetStorageLensConfigurationTagging action. For more information, see Setting permissions to use Amazon S3 Storage Lens in the Amazon S3 User Guide. 
    */
  def getStorageLensConfigurationTagging(): Request[GetStorageLensConfigurationTaggingResult, AWSError] = js.native
  def getStorageLensConfigurationTagging(
    callback: js.Function2[/* err */ AWSError, /* data */ GetStorageLensConfigurationTaggingResult, Unit]
  ): Request[GetStorageLensConfigurationTaggingResult, AWSError] = js.native
  /**
    * Gets the tags of Amazon S3 Storage Lens configuration. For more information about S3 Storage Lens, see Assessing your storage activity and usage with Amazon S3 Storage Lens  in the Amazon S3 User Guide.  To use this action, you must have permission to perform the s3:GetStorageLensConfigurationTagging action. For more information, see Setting permissions to use Amazon S3 Storage Lens in the Amazon S3 User Guide. 
    */
  def getStorageLensConfigurationTagging(params: GetStorageLensConfigurationTaggingRequest): Request[GetStorageLensConfigurationTaggingResult, AWSError] = js.native
  def getStorageLensConfigurationTagging(
    params: GetStorageLensConfigurationTaggingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStorageLensConfigurationTaggingResult, Unit]
  ): Request[GetStorageLensConfigurationTaggingResult, AWSError] = js.native
  
  /**
    * Returns a list of the access points currently associated with the specified bucket. You can retrieve up to 1000 access points per call. If the specified bucket has more than 1,000 access points (or the number specified in maxResults, whichever is less), the response will include a continuation token that you can use to list the additional access points.  All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. The following actions are related to ListAccessPoints:    CreateAccessPoint     DeleteAccessPoint     GetAccessPoint   
    */
  def listAccessPoints(): Request[ListAccessPointsResult, AWSError] = js.native
  def listAccessPoints(callback: js.Function2[/* err */ AWSError, /* data */ ListAccessPointsResult, Unit]): Request[ListAccessPointsResult, AWSError] = js.native
  /**
    * Returns a list of the access points currently associated with the specified bucket. You can retrieve up to 1000 access points per call. If the specified bucket has more than 1,000 access points (or the number specified in maxResults, whichever is less), the response will include a continuation token that you can use to list the additional access points.  All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. The following actions are related to ListAccessPoints:    CreateAccessPoint     DeleteAccessPoint     GetAccessPoint   
    */
  def listAccessPoints(params: ListAccessPointsRequest): Request[ListAccessPointsResult, AWSError] = js.native
  def listAccessPoints(
    params: ListAccessPointsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAccessPointsResult, Unit]
  ): Request[ListAccessPointsResult, AWSError] = js.native
  
  /**
    * Returns some or all (up to 1,000) access points associated with the Object Lambda Access Point per call. If there are more access points than what can be returned in one call, the response will include a continuation token that you can use to list the additional access points. The following actions are related to ListAccessPointsForObjectLambda:    CreateAccessPointForObjectLambda     DeleteAccessPointForObjectLambda     GetAccessPointForObjectLambda   
    */
  def listAccessPointsForObjectLambda(): Request[ListAccessPointsForObjectLambdaResult, AWSError] = js.native
  def listAccessPointsForObjectLambda(callback: js.Function2[/* err */ AWSError, /* data */ ListAccessPointsForObjectLambdaResult, Unit]): Request[ListAccessPointsForObjectLambdaResult, AWSError] = js.native
  /**
    * Returns some or all (up to 1,000) access points associated with the Object Lambda Access Point per call. If there are more access points than what can be returned in one call, the response will include a continuation token that you can use to list the additional access points. The following actions are related to ListAccessPointsForObjectLambda:    CreateAccessPointForObjectLambda     DeleteAccessPointForObjectLambda     GetAccessPointForObjectLambda   
    */
  def listAccessPointsForObjectLambda(params: ListAccessPointsForObjectLambdaRequest): Request[ListAccessPointsForObjectLambdaResult, AWSError] = js.native
  def listAccessPointsForObjectLambda(
    params: ListAccessPointsForObjectLambdaRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAccessPointsForObjectLambdaResult, Unit]
  ): Request[ListAccessPointsForObjectLambdaResult, AWSError] = js.native
  
  /**
    * Lists current S3 Batch Operations jobs and jobs that have ended within the last 30 days for the Amazon Web Services account making the request. For more information, see S3 Batch Operations in the Amazon S3 User Guide. Related actions include:     CreateJob     DescribeJob     UpdateJobPriority     UpdateJobStatus   
    */
  def listJobs(): Request[ListJobsResult, AWSError] = js.native
  def listJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListJobsResult, Unit]): Request[ListJobsResult, AWSError] = js.native
  /**
    * Lists current S3 Batch Operations jobs and jobs that have ended within the last 30 days for the Amazon Web Services account making the request. For more information, see S3 Batch Operations in the Amazon S3 User Guide. Related actions include:     CreateJob     DescribeJob     UpdateJobPriority     UpdateJobStatus   
    */
  def listJobs(params: ListJobsRequest): Request[ListJobsResult, AWSError] = js.native
  def listJobs(
    params: ListJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListJobsResult, Unit]
  ): Request[ListJobsResult, AWSError] = js.native
  
  /**
    * Returns a list of the Multi-Region Access Points currently associated with the specified Amazon Web Services account. Each call can return up to 100 Multi-Region Access Points, the maximum number of Multi-Region Access Points that can be associated with a single account. This action will always be routed to the US West (Oregon) Region. For more information about the restrictions around managing Multi-Region Access Points, see Managing Multi-Region Access Points in the Amazon S3 User Guide. The following actions are related to ListMultiRegionAccessPoint:    CreateMultiRegionAccessPoint     DeleteMultiRegionAccessPoint     DescribeMultiRegionAccessPointOperation     GetMultiRegionAccessPoint   
    */
  def listMultiRegionAccessPoints(): Request[ListMultiRegionAccessPointsResult, AWSError] = js.native
  def listMultiRegionAccessPoints(callback: js.Function2[/* err */ AWSError, /* data */ ListMultiRegionAccessPointsResult, Unit]): Request[ListMultiRegionAccessPointsResult, AWSError] = js.native
  /**
    * Returns a list of the Multi-Region Access Points currently associated with the specified Amazon Web Services account. Each call can return up to 100 Multi-Region Access Points, the maximum number of Multi-Region Access Points that can be associated with a single account. This action will always be routed to the US West (Oregon) Region. For more information about the restrictions around managing Multi-Region Access Points, see Managing Multi-Region Access Points in the Amazon S3 User Guide. The following actions are related to ListMultiRegionAccessPoint:    CreateMultiRegionAccessPoint     DeleteMultiRegionAccessPoint     DescribeMultiRegionAccessPointOperation     GetMultiRegionAccessPoint   
    */
  def listMultiRegionAccessPoints(params: ListMultiRegionAccessPointsRequest): Request[ListMultiRegionAccessPointsResult, AWSError] = js.native
  def listMultiRegionAccessPoints(
    params: ListMultiRegionAccessPointsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMultiRegionAccessPointsResult, Unit]
  ): Request[ListMultiRegionAccessPointsResult, AWSError] = js.native
  
  /**
    * Returns a list of all Outposts buckets in an Outpost that are owned by the authenticated sender of the request. For more information, see Using Amazon S3 on Outposts in the Amazon S3 User Guide. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and x-amz-outpost-id in your request, see the Examples section.
    */
  def listRegionalBuckets(): Request[ListRegionalBucketsResult, AWSError] = js.native
  def listRegionalBuckets(callback: js.Function2[/* err */ AWSError, /* data */ ListRegionalBucketsResult, Unit]): Request[ListRegionalBucketsResult, AWSError] = js.native
  /**
    * Returns a list of all Outposts buckets in an Outpost that are owned by the authenticated sender of the request. For more information, see Using Amazon S3 on Outposts in the Amazon S3 User Guide. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and x-amz-outpost-id in your request, see the Examples section.
    */
  def listRegionalBuckets(params: ListRegionalBucketsRequest): Request[ListRegionalBucketsResult, AWSError] = js.native
  def listRegionalBuckets(
    params: ListRegionalBucketsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRegionalBucketsResult, Unit]
  ): Request[ListRegionalBucketsResult, AWSError] = js.native
  
  /**
    * Gets a list of Amazon S3 Storage Lens configurations. For more information about S3 Storage Lens, see Assessing your storage activity and usage with Amazon S3 Storage Lens  in the Amazon S3 User Guide.  To use this action, you must have permission to perform the s3:ListStorageLensConfigurations action. For more information, see Setting permissions to use Amazon S3 Storage Lens in the Amazon S3 User Guide. 
    */
  def listStorageLensConfigurations(): Request[ListStorageLensConfigurationsResult, AWSError] = js.native
  def listStorageLensConfigurations(callback: js.Function2[/* err */ AWSError, /* data */ ListStorageLensConfigurationsResult, Unit]): Request[ListStorageLensConfigurationsResult, AWSError] = js.native
  /**
    * Gets a list of Amazon S3 Storage Lens configurations. For more information about S3 Storage Lens, see Assessing your storage activity and usage with Amazon S3 Storage Lens  in the Amazon S3 User Guide.  To use this action, you must have permission to perform the s3:ListStorageLensConfigurations action. For more information, see Setting permissions to use Amazon S3 Storage Lens in the Amazon S3 User Guide. 
    */
  def listStorageLensConfigurations(params: ListStorageLensConfigurationsRequest): Request[ListStorageLensConfigurationsResult, AWSError] = js.native
  def listStorageLensConfigurations(
    params: ListStorageLensConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListStorageLensConfigurationsResult, Unit]
  ): Request[ListStorageLensConfigurationsResult, AWSError] = js.native
  
  /**
    * Replaces configuration for an Object Lambda Access Point. The following actions are related to PutAccessPointConfigurationForObjectLambda:    GetAccessPointConfigurationForObjectLambda   
    */
  def putAccessPointConfigurationForObjectLambda(): Request[js.Object, AWSError] = js.native
  def putAccessPointConfigurationForObjectLambda(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Replaces configuration for an Object Lambda Access Point. The following actions are related to PutAccessPointConfigurationForObjectLambda:    GetAccessPointConfigurationForObjectLambda   
    */
  def putAccessPointConfigurationForObjectLambda(params: PutAccessPointConfigurationForObjectLambdaRequest): Request[js.Object, AWSError] = js.native
  def putAccessPointConfigurationForObjectLambda(
    params: PutAccessPointConfigurationForObjectLambdaRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Associates an access policy with the specified access point. Each access point can have only one policy, so a request made to this API replaces any existing policy associated with the specified access point.  All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. The following actions are related to PutAccessPointPolicy:    GetAccessPointPolicy     DeleteAccessPointPolicy   
    */
  def putAccessPointPolicy(): Request[js.Object, AWSError] = js.native
  def putAccessPointPolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Associates an access policy with the specified access point. Each access point can have only one policy, so a request made to this API replaces any existing policy associated with the specified access point.  All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. The following actions are related to PutAccessPointPolicy:    GetAccessPointPolicy     DeleteAccessPointPolicy   
    */
  def putAccessPointPolicy(params: PutAccessPointPolicyRequest): Request[js.Object, AWSError] = js.native
  def putAccessPointPolicy(
    params: PutAccessPointPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Creates or replaces resource policy for an Object Lambda Access Point. For an example policy, see Creating Object Lambda Access Points in the Amazon S3 User Guide. The following actions are related to PutAccessPointPolicyForObjectLambda:    DeleteAccessPointPolicyForObjectLambda     GetAccessPointPolicyForObjectLambda   
    */
  def putAccessPointPolicyForObjectLambda(): Request[js.Object, AWSError] = js.native
  def putAccessPointPolicyForObjectLambda(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Creates or replaces resource policy for an Object Lambda Access Point. For an example policy, see Creating Object Lambda Access Points in the Amazon S3 User Guide. The following actions are related to PutAccessPointPolicyForObjectLambda:    DeleteAccessPointPolicyForObjectLambda     GetAccessPointPolicyForObjectLambda   
    */
  def putAccessPointPolicyForObjectLambda(params: PutAccessPointPolicyForObjectLambdaRequest): Request[js.Object, AWSError] = js.native
  def putAccessPointPolicyForObjectLambda(
    params: PutAccessPointPolicyForObjectLambdaRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    *  This action puts a lifecycle configuration to an Amazon S3 on Outposts bucket. To put a lifecycle configuration to an S3 bucket, see PutBucketLifecycleConfiguration in the Amazon S3 API Reference.   Creates a new lifecycle configuration for the S3 on Outposts bucket or replaces an existing lifecycle configuration. Outposts buckets only support lifecycle configurations that delete/expire objects after a certain period of time and abort incomplete multipart uploads.  All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. The following actions are related to PutBucketLifecycleConfiguration:    GetBucketLifecycleConfiguration     DeleteBucketLifecycleConfiguration   
    */
  def putBucketLifecycleConfiguration(): Request[js.Object, AWSError] = js.native
  def putBucketLifecycleConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    *  This action puts a lifecycle configuration to an Amazon S3 on Outposts bucket. To put a lifecycle configuration to an S3 bucket, see PutBucketLifecycleConfiguration in the Amazon S3 API Reference.   Creates a new lifecycle configuration for the S3 on Outposts bucket or replaces an existing lifecycle configuration. Outposts buckets only support lifecycle configurations that delete/expire objects after a certain period of time and abort incomplete multipart uploads.  All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. The following actions are related to PutBucketLifecycleConfiguration:    GetBucketLifecycleConfiguration     DeleteBucketLifecycleConfiguration   
    */
  def putBucketLifecycleConfiguration(params: PutBucketLifecycleConfigurationRequest): Request[js.Object, AWSError] = js.native
  def putBucketLifecycleConfiguration(
    params: PutBucketLifecycleConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    *  This action puts a bucket policy to an Amazon S3 on Outposts bucket. To put a policy on an S3 bucket, see PutBucketPolicy in the Amazon S3 API Reference.   Applies an Amazon S3 bucket policy to an Outposts bucket. For more information, see Using Amazon S3 on Outposts in the Amazon S3 User Guide. If you are using an identity other than the root user of the Amazon Web Services account that owns the Outposts bucket, the calling identity must have the PutBucketPolicy permissions on the specified Outposts bucket and belong to the bucket owner's account in order to use this action. If you don't have PutBucketPolicy permissions, Amazon S3 returns a 403 Access Denied error. If you have the correct permissions, but you're not using an identity that belongs to the bucket owner's account, Amazon S3 returns a 405 Method Not Allowed error.   As a security precaution, the root user of the Amazon Web Services account that owns a bucket can always use this action, even if the policy explicitly denies the root user the ability to perform this action.   For more information about bucket policies, see Using Bucket Policies and User Policies. All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. The following actions are related to PutBucketPolicy:    GetBucketPolicy     DeleteBucketPolicy   
    */
  def putBucketPolicy(): Request[js.Object, AWSError] = js.native
  def putBucketPolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    *  This action puts a bucket policy to an Amazon S3 on Outposts bucket. To put a policy on an S3 bucket, see PutBucketPolicy in the Amazon S3 API Reference.   Applies an Amazon S3 bucket policy to an Outposts bucket. For more information, see Using Amazon S3 on Outposts in the Amazon S3 User Guide. If you are using an identity other than the root user of the Amazon Web Services account that owns the Outposts bucket, the calling identity must have the PutBucketPolicy permissions on the specified Outposts bucket and belong to the bucket owner's account in order to use this action. If you don't have PutBucketPolicy permissions, Amazon S3 returns a 403 Access Denied error. If you have the correct permissions, but you're not using an identity that belongs to the bucket owner's account, Amazon S3 returns a 405 Method Not Allowed error.   As a security precaution, the root user of the Amazon Web Services account that owns a bucket can always use this action, even if the policy explicitly denies the root user the ability to perform this action.   For more information about bucket policies, see Using Bucket Policies and User Policies. All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. The following actions are related to PutBucketPolicy:    GetBucketPolicy     DeleteBucketPolicy   
    */
  def putBucketPolicy(params: PutBucketPolicyRequest): Request[js.Object, AWSError] = js.native
  def putBucketPolicy(
    params: PutBucketPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    *  This action puts tags on an Amazon S3 on Outposts bucket. To put tags on an S3 bucket, see PutBucketTagging in the Amazon S3 API Reference.   Sets the tags for an S3 on Outposts bucket. For more information, see Using Amazon S3 on Outposts in the Amazon S3 User Guide. Use tags to organize your Amazon Web Services bill to reflect your own cost structure. To do this, sign up to get your Amazon Web Services account bill with tag key values included. Then, to see the cost of combined resources, organize your billing information according to resources with the same tag key values. For example, you can tag several resources with a specific application name, and then organize your billing information to see the total cost of that application across several services. For more information, see Cost allocation and tagging.  Within a bucket, if you add a tag that has the same key as an existing tag, the new value overwrites the old value. For more information, see  Using cost allocation in Amazon S3 bucket tags.  To use this action, you must have permissions to perform the s3-outposts:PutBucketTagging action. The Outposts bucket owner has this permission by default and can grant this permission to others. For more information about permissions, see  Permissions Related to Bucket Subresource Operations and Managing access permissions to your Amazon S3 resources.  PutBucketTagging has the following special errors:   Error code: InvalidTagError    Description: The tag provided was not a valid tag. This error can occur if the tag did not pass input validation. For information about tag restrictions, see  User-Defined Tag Restrictions and  Amazon Web Services-Generated Cost Allocation Tag Restrictions.     Error code: MalformedXMLError    Description: The XML provided does not match the schema.     Error code: OperationAbortedError     Description: A conflicting conditional action is currently in progress against this resource. Try again.     Error code: InternalError    Description: The service was unable to apply the provided tag to the bucket.     All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. The following actions are related to PutBucketTagging:    GetBucketTagging     DeleteBucketTagging   
    */
  def putBucketTagging(): Request[js.Object, AWSError] = js.native
  def putBucketTagging(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    *  This action puts tags on an Amazon S3 on Outposts bucket. To put tags on an S3 bucket, see PutBucketTagging in the Amazon S3 API Reference.   Sets the tags for an S3 on Outposts bucket. For more information, see Using Amazon S3 on Outposts in the Amazon S3 User Guide. Use tags to organize your Amazon Web Services bill to reflect your own cost structure. To do this, sign up to get your Amazon Web Services account bill with tag key values included. Then, to see the cost of combined resources, organize your billing information according to resources with the same tag key values. For example, you can tag several resources with a specific application name, and then organize your billing information to see the total cost of that application across several services. For more information, see Cost allocation and tagging.  Within a bucket, if you add a tag that has the same key as an existing tag, the new value overwrites the old value. For more information, see  Using cost allocation in Amazon S3 bucket tags.  To use this action, you must have permissions to perform the s3-outposts:PutBucketTagging action. The Outposts bucket owner has this permission by default and can grant this permission to others. For more information about permissions, see  Permissions Related to Bucket Subresource Operations and Managing access permissions to your Amazon S3 resources.  PutBucketTagging has the following special errors:   Error code: InvalidTagError    Description: The tag provided was not a valid tag. This error can occur if the tag did not pass input validation. For information about tag restrictions, see  User-Defined Tag Restrictions and  Amazon Web Services-Generated Cost Allocation Tag Restrictions.     Error code: MalformedXMLError    Description: The XML provided does not match the schema.     Error code: OperationAbortedError     Description: A conflicting conditional action is currently in progress against this resource. Try again.     Error code: InternalError    Description: The service was unable to apply the provided tag to the bucket.     All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. The following actions are related to PutBucketTagging:    GetBucketTagging     DeleteBucketTagging   
    */
  def putBucketTagging(params: PutBucketTaggingRequest): Request[js.Object, AWSError] = js.native
  def putBucketTagging(
    params: PutBucketTaggingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Sets the supplied tag-set on an S3 Batch Operations job. A tag is a key-value pair. You can associate S3 Batch Operations tags with any job by sending a PUT request against the tagging subresource that is associated with the job. To modify the existing tag set, you can either replace the existing tag set entirely, or make changes within the existing tag set by retrieving the existing tag set using GetJobTagging, modify that tag set, and use this action to replace the tag set with the one you modified. For more information, see Controlling access and labeling jobs using tags in the Amazon S3 User Guide.      If you send this request with an empty tag set, Amazon S3 deletes the existing tag set on the Batch Operations job. If you use this method, you are charged for a Tier 1 Request (PUT). For more information, see Amazon S3 pricing.   For deleting existing tags for your Batch Operations job, a DeleteJobTagging request is preferred because it achieves the same result without incurring charges.   A few things to consider about using tags:   Amazon S3 limits the maximum number of tags to 50 tags per job.   You can associate up to 50 tags with a job as long as they have unique tag keys.   A tag key can be up to 128 Unicode characters in length, and tag values can be up to 256 Unicode characters in length.   The key and values are case sensitive.   For tagging-related restrictions related to characters and encodings, see User-Defined Tag Restrictions in the Billing and Cost Management User Guide.       To use this action, you must have permission to perform the s3:PutJobTagging action. Related actions include:    CreateJob     GetJobTagging     DeleteJobTagging   
    */
  def putJobTagging(): Request[PutJobTaggingResult, AWSError] = js.native
  def putJobTagging(callback: js.Function2[/* err */ AWSError, /* data */ PutJobTaggingResult, Unit]): Request[PutJobTaggingResult, AWSError] = js.native
  /**
    * Sets the supplied tag-set on an S3 Batch Operations job. A tag is a key-value pair. You can associate S3 Batch Operations tags with any job by sending a PUT request against the tagging subresource that is associated with the job. To modify the existing tag set, you can either replace the existing tag set entirely, or make changes within the existing tag set by retrieving the existing tag set using GetJobTagging, modify that tag set, and use this action to replace the tag set with the one you modified. For more information, see Controlling access and labeling jobs using tags in the Amazon S3 User Guide.      If you send this request with an empty tag set, Amazon S3 deletes the existing tag set on the Batch Operations job. If you use this method, you are charged for a Tier 1 Request (PUT). For more information, see Amazon S3 pricing.   For deleting existing tags for your Batch Operations job, a DeleteJobTagging request is preferred because it achieves the same result without incurring charges.   A few things to consider about using tags:   Amazon S3 limits the maximum number of tags to 50 tags per job.   You can associate up to 50 tags with a job as long as they have unique tag keys.   A tag key can be up to 128 Unicode characters in length, and tag values can be up to 256 Unicode characters in length.   The key and values are case sensitive.   For tagging-related restrictions related to characters and encodings, see User-Defined Tag Restrictions in the Billing and Cost Management User Guide.       To use this action, you must have permission to perform the s3:PutJobTagging action. Related actions include:    CreateJob     GetJobTagging     DeleteJobTagging   
    */
  def putJobTagging(params: PutJobTaggingRequest): Request[PutJobTaggingResult, AWSError] = js.native
  def putJobTagging(
    params: PutJobTaggingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutJobTaggingResult, Unit]
  ): Request[PutJobTaggingResult, AWSError] = js.native
  
  /**
    * Associates an access control policy with the specified Multi-Region Access Point. Each Multi-Region Access Point can have only one policy, so a request made to this action replaces any existing policy that is associated with the specified Multi-Region Access Point. This action will always be routed to the US West (Oregon) Region. For more information about the restrictions around managing Multi-Region Access Points, see Managing Multi-Region Access Points in the Amazon S3 User Guide. The following actions are related to PutMultiRegionAccessPointPolicy:    GetMultiRegionAccessPointPolicy     GetMultiRegionAccessPointPolicyStatus   
    */
  def putMultiRegionAccessPointPolicy(): Request[PutMultiRegionAccessPointPolicyResult, AWSError] = js.native
  def putMultiRegionAccessPointPolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutMultiRegionAccessPointPolicyResult, Unit]): Request[PutMultiRegionAccessPointPolicyResult, AWSError] = js.native
  /**
    * Associates an access control policy with the specified Multi-Region Access Point. Each Multi-Region Access Point can have only one policy, so a request made to this action replaces any existing policy that is associated with the specified Multi-Region Access Point. This action will always be routed to the US West (Oregon) Region. For more information about the restrictions around managing Multi-Region Access Points, see Managing Multi-Region Access Points in the Amazon S3 User Guide. The following actions are related to PutMultiRegionAccessPointPolicy:    GetMultiRegionAccessPointPolicy     GetMultiRegionAccessPointPolicyStatus   
    */
  def putMultiRegionAccessPointPolicy(params: PutMultiRegionAccessPointPolicyRequest): Request[PutMultiRegionAccessPointPolicyResult, AWSError] = js.native
  def putMultiRegionAccessPointPolicy(
    params: PutMultiRegionAccessPointPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutMultiRegionAccessPointPolicyResult, Unit]
  ): Request[PutMultiRegionAccessPointPolicyResult, AWSError] = js.native
  
  /**
    * Creates or modifies the PublicAccessBlock configuration for an Amazon Web Services account. For this operation, users must have the s3:PutBucketPublicAccessBlock permission. For more information, see  Using Amazon S3 block public access. Related actions include:    GetPublicAccessBlock     DeletePublicAccessBlock   
    */
  def putPublicAccessBlock(): Request[js.Object, AWSError] = js.native
  def putPublicAccessBlock(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Creates or modifies the PublicAccessBlock configuration for an Amazon Web Services account. For this operation, users must have the s3:PutBucketPublicAccessBlock permission. For more information, see  Using Amazon S3 block public access. Related actions include:    GetPublicAccessBlock     DeletePublicAccessBlock   
    */
  def putPublicAccessBlock(params: PutPublicAccessBlockRequest): Request[js.Object, AWSError] = js.native
  def putPublicAccessBlock(
    params: PutPublicAccessBlockRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Puts an Amazon S3 Storage Lens configuration. For more information about S3 Storage Lens, see Working with Amazon S3 Storage Lens in the Amazon S3 User Guide.  To use this action, you must have permission to perform the s3:PutStorageLensConfiguration action. For more information, see Setting permissions to use Amazon S3 Storage Lens in the Amazon S3 User Guide. 
    */
  def putStorageLensConfiguration(): Request[js.Object, AWSError] = js.native
  def putStorageLensConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Puts an Amazon S3 Storage Lens configuration. For more information about S3 Storage Lens, see Working with Amazon S3 Storage Lens in the Amazon S3 User Guide.  To use this action, you must have permission to perform the s3:PutStorageLensConfiguration action. For more information, see Setting permissions to use Amazon S3 Storage Lens in the Amazon S3 User Guide. 
    */
  def putStorageLensConfiguration(params: PutStorageLensConfigurationRequest): Request[js.Object, AWSError] = js.native
  def putStorageLensConfiguration(
    params: PutStorageLensConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Put or replace tags on an existing Amazon S3 Storage Lens configuration. For more information about S3 Storage Lens, see Assessing your storage activity and usage with Amazon S3 Storage Lens  in the Amazon S3 User Guide.  To use this action, you must have permission to perform the s3:PutStorageLensConfigurationTagging action. For more information, see Setting permissions to use Amazon S3 Storage Lens in the Amazon S3 User Guide. 
    */
  def putStorageLensConfigurationTagging(): Request[PutStorageLensConfigurationTaggingResult, AWSError] = js.native
  def putStorageLensConfigurationTagging(
    callback: js.Function2[/* err */ AWSError, /* data */ PutStorageLensConfigurationTaggingResult, Unit]
  ): Request[PutStorageLensConfigurationTaggingResult, AWSError] = js.native
  /**
    * Put or replace tags on an existing Amazon S3 Storage Lens configuration. For more information about S3 Storage Lens, see Assessing your storage activity and usage with Amazon S3 Storage Lens  in the Amazon S3 User Guide.  To use this action, you must have permission to perform the s3:PutStorageLensConfigurationTagging action. For more information, see Setting permissions to use Amazon S3 Storage Lens in the Amazon S3 User Guide. 
    */
  def putStorageLensConfigurationTagging(params: PutStorageLensConfigurationTaggingRequest): Request[PutStorageLensConfigurationTaggingResult, AWSError] = js.native
  def putStorageLensConfigurationTagging(
    params: PutStorageLensConfigurationTaggingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutStorageLensConfigurationTaggingResult, Unit]
  ): Request[PutStorageLensConfigurationTaggingResult, AWSError] = js.native
  
  /**
    * Updates an existing S3 Batch Operations job's priority. For more information, see S3 Batch Operations in the Amazon S3 User Guide.  Related actions include:    CreateJob     ListJobs     DescribeJob     UpdateJobStatus   
    */
  def updateJobPriority(): Request[UpdateJobPriorityResult, AWSError] = js.native
  def updateJobPriority(callback: js.Function2[/* err */ AWSError, /* data */ UpdateJobPriorityResult, Unit]): Request[UpdateJobPriorityResult, AWSError] = js.native
  /**
    * Updates an existing S3 Batch Operations job's priority. For more information, see S3 Batch Operations in the Amazon S3 User Guide.  Related actions include:    CreateJob     ListJobs     DescribeJob     UpdateJobStatus   
    */
  def updateJobPriority(params: UpdateJobPriorityRequest): Request[UpdateJobPriorityResult, AWSError] = js.native
  def updateJobPriority(
    params: UpdateJobPriorityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateJobPriorityResult, Unit]
  ): Request[UpdateJobPriorityResult, AWSError] = js.native
  
  /**
    * Updates the status for the specified job. Use this action to confirm that you want to run a job or to cancel an existing job. For more information, see S3 Batch Operations in the Amazon S3 User Guide.  Related actions include:    CreateJob     ListJobs     DescribeJob     UpdateJobStatus   
    */
  def updateJobStatus(): Request[UpdateJobStatusResult, AWSError] = js.native
  def updateJobStatus(callback: js.Function2[/* err */ AWSError, /* data */ UpdateJobStatusResult, Unit]): Request[UpdateJobStatusResult, AWSError] = js.native
  /**
    * Updates the status for the specified job. Use this action to confirm that you want to run a job or to cancel an existing job. For more information, see S3 Batch Operations in the Amazon S3 User Guide.  Related actions include:    CreateJob     ListJobs     DescribeJob     UpdateJobStatus   
    */
  def updateJobStatus(params: UpdateJobStatusRequest): Request[UpdateJobStatusResult, AWSError] = js.native
  def updateJobStatus(
    params: UpdateJobStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateJobStatusResult, Unit]
  ): Request[UpdateJobStatusResult, AWSError] = js.native
}
