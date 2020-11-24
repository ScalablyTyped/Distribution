package typings.awsSdk.s3controlMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3Control extends Service {
  
  @JSName("config")
  var config_S3Control: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Creates an access point and associates it with the specified bucket. For more information, see Managing Data Access with Amazon S3 Access Points in the Amazon Simple Storage Service Developer Guide.   Using this action with Amazon S3 on Outposts  This action:    Requires a virtual private cloud (VPC) configuration as S3 on Outposts only supports VPC style access points.   Does not support ACL on S3 on Outposts buckets.   Does not support Public Access on S3 on Outposts buckets.   Does not support object lock for S3 on Outposts buckets.   For more information, see Using Amazon S3 on Outposts in the Amazon Simple Storage Service Developer Guide . All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section.  The following actions are related to CreateAccessPoint:    GetAccessPoint     DeleteAccessPoint     ListAccessPoints   
    */
  def createAccessPoint(): Request[CreateAccessPointResult, AWSError] = js.native
  def createAccessPoint(callback: js.Function2[/* err */ AWSError, /* data */ CreateAccessPointResult, Unit]): Request[CreateAccessPointResult, AWSError] = js.native
  /**
    * Creates an access point and associates it with the specified bucket. For more information, see Managing Data Access with Amazon S3 Access Points in the Amazon Simple Storage Service Developer Guide.   Using this action with Amazon S3 on Outposts  This action:    Requires a virtual private cloud (VPC) configuration as S3 on Outposts only supports VPC style access points.   Does not support ACL on S3 on Outposts buckets.   Does not support Public Access on S3 on Outposts buckets.   Does not support object lock for S3 on Outposts buckets.   For more information, see Using Amazon S3 on Outposts in the Amazon Simple Storage Service Developer Guide . All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section.  The following actions are related to CreateAccessPoint:    GetAccessPoint     DeleteAccessPoint     ListAccessPoints   
    */
  def createAccessPoint(params: CreateAccessPointRequest): Request[CreateAccessPointResult, AWSError] = js.native
  def createAccessPoint(
    params: CreateAccessPointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAccessPointResult, Unit]
  ): Request[CreateAccessPointResult, AWSError] = js.native
  
  /**
    *  This API operation creates an Amazon S3 on Outposts bucket. To create an S3 bucket, see Create Bucket in the Amazon Simple Storage Service API.   Creates a new Outposts bucket. By creating the bucket, you become the bucket owner. To create an Outposts bucket, you must have S3 on Outposts. For more information, see Using Amazon S3 on Outposts in Amazon Simple Storage Service Developer Guide. Not every string is an acceptable bucket name. For information on bucket naming restrictions, see Working with Amazon S3 Buckets. S3 on Outposts buckets do not support    ACLs. Instead, configure access point policies to manage access to buckets.   Public access.    Object Lock   Bucket Location constraint   For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and x-amz-outpost-id in your API request, see the Examples section. The following actions are related to CreateBucket for Amazon S3 on Outposts:    PutObject     GetBucket     DeleteBucket     CreateAccessPoint     PutAccessPointPolicy   
    */
  def createBucket(): Request[CreateBucketResult, AWSError] = js.native
  def createBucket(callback: js.Function2[/* err */ AWSError, /* data */ CreateBucketResult, Unit]): Request[CreateBucketResult, AWSError] = js.native
  /**
    *  This API operation creates an Amazon S3 on Outposts bucket. To create an S3 bucket, see Create Bucket in the Amazon Simple Storage Service API.   Creates a new Outposts bucket. By creating the bucket, you become the bucket owner. To create an Outposts bucket, you must have S3 on Outposts. For more information, see Using Amazon S3 on Outposts in Amazon Simple Storage Service Developer Guide. Not every string is an acceptable bucket name. For information on bucket naming restrictions, see Working with Amazon S3 Buckets. S3 on Outposts buckets do not support    ACLs. Instead, configure access point policies to manage access to buckets.   Public access.    Object Lock   Bucket Location constraint   For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and x-amz-outpost-id in your API request, see the Examples section. The following actions are related to CreateBucket for Amazon S3 on Outposts:    PutObject     GetBucket     DeleteBucket     CreateAccessPoint     PutAccessPointPolicy   
    */
  def createBucket(params: CreateBucketRequest): Request[CreateBucketResult, AWSError] = js.native
  def createBucket(
    params: CreateBucketRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateBucketResult, Unit]
  ): Request[CreateBucketResult, AWSError] = js.native
  
  /**
    * S3 Batch Operations performs large-scale Batch Operations on Amazon S3 objects. Batch Operations can run a single operation or action on lists of Amazon S3 objects that you specify. For more information, see S3 Batch Operations in the Amazon Simple Storage Service Developer Guide. This operation creates an S3 Batch Operations job.  Related actions include:    DescribeJob     ListJobs     UpdateJobPriority     UpdateJobStatus   
    */
  def createJob(): Request[CreateJobResult, AWSError] = js.native
  def createJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateJobResult, Unit]): Request[CreateJobResult, AWSError] = js.native
  /**
    * S3 Batch Operations performs large-scale Batch Operations on Amazon S3 objects. Batch Operations can run a single operation or action on lists of Amazon S3 objects that you specify. For more information, see S3 Batch Operations in the Amazon Simple Storage Service Developer Guide. This operation creates an S3 Batch Operations job.  Related actions include:    DescribeJob     ListJobs     UpdateJobPriority     UpdateJobStatus   
    */
  def createJob(params: CreateJobRequest): Request[CreateJobResult, AWSError] = js.native
  def createJob(
    params: CreateJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateJobResult, Unit]
  ): Request[CreateJobResult, AWSError] = js.native
  
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
    *  This API operation deletes an Amazon S3 on Outposts bucket. To delete an S3 bucket, see DeleteBucket in the Amazon Simple Storage Service API.   Deletes the Amazon S3 on Outposts bucket. All objects (including all object versions and delete markers) in the bucket must be deleted before the bucket itself can be deleted. For more information, see Using Amazon S3 on Outposts in Amazon Simple Storage Service Developer Guide. All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section.  Related Resources     CreateBucket     GetBucket     DeleteObject   
    */
  def deleteBucket(): Request[js.Object, AWSError] = js.native
  def deleteBucket(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    *  This API operation deletes an Amazon S3 on Outposts bucket. To delete an S3 bucket, see DeleteBucket in the Amazon Simple Storage Service API.   Deletes the Amazon S3 on Outposts bucket. All objects (including all object versions and delete markers) in the bucket must be deleted before the bucket itself can be deleted. For more information, see Using Amazon S3 on Outposts in Amazon Simple Storage Service Developer Guide. All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section.  Related Resources     CreateBucket     GetBucket     DeleteObject   
    */
  def deleteBucket(params: DeleteBucketRequest): Request[js.Object, AWSError] = js.native
  def deleteBucket(
    params: DeleteBucketRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    *  This API action deletes an Amazon S3 on Outposts bucket's lifecycle configuration. To delete an S3 bucket's lifecycle configuration, see DeleteBucketLifecycle in the Amazon Simple Storage Service API.   Deletes the lifecycle configuration from the specified Outposts bucket. Amazon S3 on Outposts removes all the lifecycle configuration rules in the lifecycle subresource associated with the bucket. Your objects never expire, and Amazon S3 on Outposts no longer automatically deletes any objects on the basis of rules contained in the deleted lifecycle configuration. For more information, see Using Amazon S3 on Outposts in Amazon Simple Storage Service Developer Guide. To use this operation, you must have permission to perform the s3-outposts:DeleteLifecycleConfiguration action. By default, the bucket owner has this permission and the Outposts bucket owner can grant this permission to others. All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. For more information about object expiration, see  Elements to Describe Lifecycle Actions. Related actions include:    PutBucketLifecycleConfiguration     GetBucketLifecycleConfiguration   
    */
  def deleteBucketLifecycleConfiguration(): Request[js.Object, AWSError] = js.native
  def deleteBucketLifecycleConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    *  This API action deletes an Amazon S3 on Outposts bucket's lifecycle configuration. To delete an S3 bucket's lifecycle configuration, see DeleteBucketLifecycle in the Amazon Simple Storage Service API.   Deletes the lifecycle configuration from the specified Outposts bucket. Amazon S3 on Outposts removes all the lifecycle configuration rules in the lifecycle subresource associated with the bucket. Your objects never expire, and Amazon S3 on Outposts no longer automatically deletes any objects on the basis of rules contained in the deleted lifecycle configuration. For more information, see Using Amazon S3 on Outposts in Amazon Simple Storage Service Developer Guide. To use this operation, you must have permission to perform the s3-outposts:DeleteLifecycleConfiguration action. By default, the bucket owner has this permission and the Outposts bucket owner can grant this permission to others. All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. For more information about object expiration, see  Elements to Describe Lifecycle Actions. Related actions include:    PutBucketLifecycleConfiguration     GetBucketLifecycleConfiguration   
    */
  def deleteBucketLifecycleConfiguration(params: DeleteBucketLifecycleConfigurationRequest): Request[js.Object, AWSError] = js.native
  def deleteBucketLifecycleConfiguration(
    params: DeleteBucketLifecycleConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    *  This API operation deletes an Amazon S3 on Outposts bucket policy. To delete an S3 bucket policy, see DeleteBucketPolicy in the Amazon Simple Storage Service API.   This implementation of the DELETE operation uses the policy subresource to delete the policy of a specified Amazon S3 on Outposts bucket. If you are using an identity other than the root user of the AWS account that owns the bucket, the calling identity must have the s3-outposts:DeleteBucketPolicy permissions on the specified Outposts bucket and belong to the bucket owner's account to use this operation. For more information, see Using Amazon S3 on Outposts in Amazon Simple Storage Service Developer Guide. If you don't have DeleteBucketPolicy permissions, Amazon S3 returns a 403 Access Denied error. If you have the correct permissions, but you're not using an identity that belongs to the bucket owner's account, Amazon S3 returns a 405 Method Not Allowed error.   As a security precaution, the root user of the AWS account that owns a bucket can always use this operation, even if the policy explicitly denies the root user the ability to perform this action.  For more information about bucket policies, see Using Bucket Policies and User Policies.  All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. The following actions are related to DeleteBucketPolicy:    GetBucketPolicy     PutBucketPolicy   
    */
  def deleteBucketPolicy(): Request[js.Object, AWSError] = js.native
  def deleteBucketPolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    *  This API operation deletes an Amazon S3 on Outposts bucket policy. To delete an S3 bucket policy, see DeleteBucketPolicy in the Amazon Simple Storage Service API.   This implementation of the DELETE operation uses the policy subresource to delete the policy of a specified Amazon S3 on Outposts bucket. If you are using an identity other than the root user of the AWS account that owns the bucket, the calling identity must have the s3-outposts:DeleteBucketPolicy permissions on the specified Outposts bucket and belong to the bucket owner's account to use this operation. For more information, see Using Amazon S3 on Outposts in Amazon Simple Storage Service Developer Guide. If you don't have DeleteBucketPolicy permissions, Amazon S3 returns a 403 Access Denied error. If you have the correct permissions, but you're not using an identity that belongs to the bucket owner's account, Amazon S3 returns a 405 Method Not Allowed error.   As a security precaution, the root user of the AWS account that owns a bucket can always use this operation, even if the policy explicitly denies the root user the ability to perform this action.  For more information about bucket policies, see Using Bucket Policies and User Policies.  All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. The following actions are related to DeleteBucketPolicy:    GetBucketPolicy     PutBucketPolicy   
    */
  def deleteBucketPolicy(params: DeleteBucketPolicyRequest): Request[js.Object, AWSError] = js.native
  def deleteBucketPolicy(
    params: DeleteBucketPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    *  This operation deletes an Amazon S3 on Outposts bucket's tags. To delete an S3 bucket tags, see DeleteBucketTagging in the Amazon Simple Storage Service API.   Deletes the tags from the Outposts bucket. For more information, see Using Amazon S3 on Outposts in Amazon Simple Storage Service Developer Guide. To use this operation, you must have permission to perform the PutBucketTagging action. By default, the bucket owner has this permission and can grant this permission to others.  All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. The following actions are related to DeleteBucketTagging:    GetBucketTagging     PutBucketTagging   
    */
  def deleteBucketTagging(): Request[js.Object, AWSError] = js.native
  def deleteBucketTagging(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    *  This operation deletes an Amazon S3 on Outposts bucket's tags. To delete an S3 bucket tags, see DeleteBucketTagging in the Amazon Simple Storage Service API.   Deletes the tags from the Outposts bucket. For more information, see Using Amazon S3 on Outposts in Amazon Simple Storage Service Developer Guide. To use this operation, you must have permission to perform the PutBucketTagging action. By default, the bucket owner has this permission and can grant this permission to others.  All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. The following actions are related to DeleteBucketTagging:    GetBucketTagging     PutBucketTagging   
    */
  def deleteBucketTagging(params: DeleteBucketTaggingRequest): Request[js.Object, AWSError] = js.native
  def deleteBucketTagging(
    params: DeleteBucketTaggingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Removes the entire tag set from the specified S3 Batch Operations job. To use this operation, you must have permission to perform the s3:DeleteJobTagging action. For more information, see Controlling access and labeling jobs using tags in the Amazon Simple Storage Service Developer Guide.  Related actions include:    CreateJob     GetJobTagging     PutJobTagging   
    */
  def deleteJobTagging(): Request[DeleteJobTaggingResult, AWSError] = js.native
  def deleteJobTagging(callback: js.Function2[/* err */ AWSError, /* data */ DeleteJobTaggingResult, Unit]): Request[DeleteJobTaggingResult, AWSError] = js.native
  /**
    * Removes the entire tag set from the specified S3 Batch Operations job. To use this operation, you must have permission to perform the s3:DeleteJobTagging action. For more information, see Controlling access and labeling jobs using tags in the Amazon Simple Storage Service Developer Guide.  Related actions include:    CreateJob     GetJobTagging     PutJobTagging   
    */
  def deleteJobTagging(params: DeleteJobTaggingRequest): Request[DeleteJobTaggingResult, AWSError] = js.native
  def deleteJobTagging(
    params: DeleteJobTaggingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteJobTaggingResult, Unit]
  ): Request[DeleteJobTaggingResult, AWSError] = js.native
  
  /**
    * Removes the PublicAccessBlock configuration for an AWS account. For more information, see  Using Amazon S3 block public access. Related actions include:    GetPublicAccessBlock     PutPublicAccessBlock   
    */
  def deletePublicAccessBlock(): Request[js.Object, AWSError] = js.native
  def deletePublicAccessBlock(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes the PublicAccessBlock configuration for an AWS account. For more information, see  Using Amazon S3 block public access. Related actions include:    GetPublicAccessBlock     PutPublicAccessBlock   
    */
  def deletePublicAccessBlock(params: DeletePublicAccessBlockRequest): Request[js.Object, AWSError] = js.native
  def deletePublicAccessBlock(
    params: DeletePublicAccessBlockRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the Amazon S3 Storage Lens configuration. For more information about S3 Storage Lens, see Working with Amazon S3 Storage Lens in the Amazon Simple Storage Service Developer Guide.  To use this action, you must have permission to perform the s3:DeleteStorageLensConfiguration action. For more information, see Setting permissions to use Amazon S3 Storage Lens in the Amazon Simple Storage Service Developer Guide. 
    */
  def deleteStorageLensConfiguration(): Request[js.Object, AWSError] = js.native
  def deleteStorageLensConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the Amazon S3 Storage Lens configuration. For more information about S3 Storage Lens, see Working with Amazon S3 Storage Lens in the Amazon Simple Storage Service Developer Guide.  To use this action, you must have permission to perform the s3:DeleteStorageLensConfiguration action. For more information, see Setting permissions to use Amazon S3 Storage Lens in the Amazon Simple Storage Service Developer Guide. 
    */
  def deleteStorageLensConfiguration(params: DeleteStorageLensConfigurationRequest): Request[js.Object, AWSError] = js.native
  def deleteStorageLensConfiguration(
    params: DeleteStorageLensConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the Amazon S3 Storage Lens configuration tags. For more information about S3 Storage Lens, see Working with Amazon S3 Storage Lens in the Amazon Simple Storage Service Developer Guide.  To use this action, you must have permission to perform the s3:DeleteStorageLensConfigurationTagging action. For more information, see Setting permissions to use Amazon S3 Storage Lens in the Amazon Simple Storage Service Developer Guide. 
    */
  def deleteStorageLensConfigurationTagging(): Request[DeleteStorageLensConfigurationTaggingResult, AWSError] = js.native
  def deleteStorageLensConfigurationTagging(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteStorageLensConfigurationTaggingResult, Unit]
  ): Request[DeleteStorageLensConfigurationTaggingResult, AWSError] = js.native
  /**
    * Deletes the Amazon S3 Storage Lens configuration tags. For more information about S3 Storage Lens, see Working with Amazon S3 Storage Lens in the Amazon Simple Storage Service Developer Guide.  To use this action, you must have permission to perform the s3:DeleteStorageLensConfigurationTagging action. For more information, see Setting permissions to use Amazon S3 Storage Lens in the Amazon Simple Storage Service Developer Guide. 
    */
  def deleteStorageLensConfigurationTagging(params: DeleteStorageLensConfigurationTaggingRequest): Request[DeleteStorageLensConfigurationTaggingResult, AWSError] = js.native
  def deleteStorageLensConfigurationTagging(
    params: DeleteStorageLensConfigurationTaggingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteStorageLensConfigurationTaggingResult, Unit]
  ): Request[DeleteStorageLensConfigurationTaggingResult, AWSError] = js.native
  
  /**
    * Retrieves the configuration parameters and status for a Batch Operations job. For more information, see S3 Batch Operations in the Amazon Simple Storage Service Developer Guide.  Related actions include:    CreateJob     ListJobs     UpdateJobPriority     UpdateJobStatus   
    */
  def describeJob(): Request[DescribeJobResult, AWSError] = js.native
  def describeJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobResult, Unit]): Request[DescribeJobResult, AWSError] = js.native
  /**
    * Retrieves the configuration parameters and status for a Batch Operations job. For more information, see S3 Batch Operations in the Amazon Simple Storage Service Developer Guide.  Related actions include:    CreateJob     ListJobs     UpdateJobPriority     UpdateJobStatus   
    */
  def describeJob(params: DescribeJobRequest): Request[DescribeJobResult, AWSError] = js.native
  def describeJob(
    params: DescribeJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobResult, Unit]
  ): Request[DescribeJobResult, AWSError] = js.native
  
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
    * Indicates whether the specified access point currently has a policy that allows public access. For more information about public access through access points, see Managing Data Access with Amazon S3 Access Points in the Amazon Simple Storage Service Developer Guide.
    */
  def getAccessPointPolicyStatus(): Request[GetAccessPointPolicyStatusResult, AWSError] = js.native
  def getAccessPointPolicyStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetAccessPointPolicyStatusResult, Unit]): Request[GetAccessPointPolicyStatusResult, AWSError] = js.native
  /**
    * Indicates whether the specified access point currently has a policy that allows public access. For more information about public access through access points, see Managing Data Access with Amazon S3 Access Points in the Amazon Simple Storage Service Developer Guide.
    */
  def getAccessPointPolicyStatus(params: GetAccessPointPolicyStatusRequest): Request[GetAccessPointPolicyStatusResult, AWSError] = js.native
  def getAccessPointPolicyStatus(
    params: GetAccessPointPolicyStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAccessPointPolicyStatusResult, Unit]
  ): Request[GetAccessPointPolicyStatusResult, AWSError] = js.native
  
  /**
    * Gets an Amazon S3 on Outposts bucket. For more information, see  Using Amazon S3 on Outposts in the Amazon Simple Storage Service Developer Guide. If you are using an identity other than the root user of the AWS account that owns the bucket, the calling identity must have the s3-outposts:GetBucket permissions on the specified bucket and belong to the bucket owner's account in order to use this operation. Only users from Outposts bucket owner account with the right permissions can perform actions on an Outposts bucket.   If you don't have s3-outposts:GetBucket permissions or you're not using an identity that belongs to the bucket owner's account, Amazon S3 returns a 403 Access Denied error. The following actions are related to GetBucket for Amazon S3 on Outposts: All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section.    PutObject     CreateBucket     DeleteBucket   
    */
  def getBucket(): Request[GetBucketResult, AWSError] = js.native
  def getBucket(callback: js.Function2[/* err */ AWSError, /* data */ GetBucketResult, Unit]): Request[GetBucketResult, AWSError] = js.native
  /**
    * Gets an Amazon S3 on Outposts bucket. For more information, see  Using Amazon S3 on Outposts in the Amazon Simple Storage Service Developer Guide. If you are using an identity other than the root user of the AWS account that owns the bucket, the calling identity must have the s3-outposts:GetBucket permissions on the specified bucket and belong to the bucket owner's account in order to use this operation. Only users from Outposts bucket owner account with the right permissions can perform actions on an Outposts bucket.   If you don't have s3-outposts:GetBucket permissions or you're not using an identity that belongs to the bucket owner's account, Amazon S3 returns a 403 Access Denied error. The following actions are related to GetBucket for Amazon S3 on Outposts: All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section.    PutObject     CreateBucket     DeleteBucket   
    */
  def getBucket(params: GetBucketRequest): Request[GetBucketResult, AWSError] = js.native
  def getBucket(
    params: GetBucketRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBucketResult, Unit]
  ): Request[GetBucketResult, AWSError] = js.native
  
  /**
    *  This operation gets an Amazon S3 on Outposts bucket's lifecycle configuration. To get an S3 bucket's lifecycle configuration, see GetBucketLifecycleConfiguration in the Amazon Simple Storage Service API.   Returns the lifecycle configuration information set on the Outposts bucket. For more information, see Using Amazon S3 on Outposts and for information about lifecycle configuration, see  Object Lifecycle Management in Amazon Simple Storage Service Developer Guide. To use this operation, you must have permission to perform the s3-outposts:GetLifecycleConfiguration action. The Outposts bucket owner has this permission, by default. The bucket owner can grant this permission to others. For more information about permissions, see Permissions Related to Bucket Subresource Operations and Managing Access Permissions to Your Amazon S3 Resources. All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section.  GetBucketLifecycleConfiguration has the following special error:   Error code: NoSuchLifecycleConfiguration    Description: The lifecycle configuration does not exist.   HTTP Status Code: 404 Not Found   SOAP Fault Code Prefix: Client     The following actions are related to GetBucketLifecycleConfiguration:    PutBucketLifecycleConfiguration     DeleteBucketLifecycleConfiguration   
    */
  def getBucketLifecycleConfiguration(): Request[GetBucketLifecycleConfigurationResult, AWSError] = js.native
  def getBucketLifecycleConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ GetBucketLifecycleConfigurationResult, Unit]): Request[GetBucketLifecycleConfigurationResult, AWSError] = js.native
  /**
    *  This operation gets an Amazon S3 on Outposts bucket's lifecycle configuration. To get an S3 bucket's lifecycle configuration, see GetBucketLifecycleConfiguration in the Amazon Simple Storage Service API.   Returns the lifecycle configuration information set on the Outposts bucket. For more information, see Using Amazon S3 on Outposts and for information about lifecycle configuration, see  Object Lifecycle Management in Amazon Simple Storage Service Developer Guide. To use this operation, you must have permission to perform the s3-outposts:GetLifecycleConfiguration action. The Outposts bucket owner has this permission, by default. The bucket owner can grant this permission to others. For more information about permissions, see Permissions Related to Bucket Subresource Operations and Managing Access Permissions to Your Amazon S3 Resources. All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section.  GetBucketLifecycleConfiguration has the following special error:   Error code: NoSuchLifecycleConfiguration    Description: The lifecycle configuration does not exist.   HTTP Status Code: 404 Not Found   SOAP Fault Code Prefix: Client     The following actions are related to GetBucketLifecycleConfiguration:    PutBucketLifecycleConfiguration     DeleteBucketLifecycleConfiguration   
    */
  def getBucketLifecycleConfiguration(params: GetBucketLifecycleConfigurationRequest): Request[GetBucketLifecycleConfigurationResult, AWSError] = js.native
  def getBucketLifecycleConfiguration(
    params: GetBucketLifecycleConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBucketLifecycleConfigurationResult, Unit]
  ): Request[GetBucketLifecycleConfigurationResult, AWSError] = js.native
  
  /**
    *  This action gets a bucket policy for an Amazon S3 on Outposts bucket. To get a policy for an S3 bucket, see GetBucketPolicy in the Amazon Simple Storage Service API.   Returns the policy of a specified Outposts bucket. For more information, see Using Amazon S3 on Outposts in the Amazon Simple Storage Service Developer Guide. If you are using an identity other than the root user of the AWS account that owns the bucket, the calling identity must have the GetBucketPolicy permissions on the specified bucket and belong to the bucket owner's account in order to use this operation. Only users from Outposts bucket owner account with the right permissions can perform actions on an Outposts bucket. If you don't have s3-outposts:GetBucketPolicy permissions or you're not using an identity that belongs to the bucket owner's account, Amazon S3 returns a 403 Access Denied error.  As a security precaution, the root user of the AWS account that owns a bucket can always use this operation, even if the policy explicitly denies the root user the ability to perform this action.  For more information about bucket policies, see Using Bucket Policies and User Policies. All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. The following actions are related to GetBucketPolicy:    GetObject     PutBucketPolicy     DeleteBucketPolicy   
    */
  def getBucketPolicy(): Request[GetBucketPolicyResult, AWSError] = js.native
  def getBucketPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetBucketPolicyResult, Unit]): Request[GetBucketPolicyResult, AWSError] = js.native
  /**
    *  This action gets a bucket policy for an Amazon S3 on Outposts bucket. To get a policy for an S3 bucket, see GetBucketPolicy in the Amazon Simple Storage Service API.   Returns the policy of a specified Outposts bucket. For more information, see Using Amazon S3 on Outposts in the Amazon Simple Storage Service Developer Guide. If you are using an identity other than the root user of the AWS account that owns the bucket, the calling identity must have the GetBucketPolicy permissions on the specified bucket and belong to the bucket owner's account in order to use this operation. Only users from Outposts bucket owner account with the right permissions can perform actions on an Outposts bucket. If you don't have s3-outposts:GetBucketPolicy permissions or you're not using an identity that belongs to the bucket owner's account, Amazon S3 returns a 403 Access Denied error.  As a security precaution, the root user of the AWS account that owns a bucket can always use this operation, even if the policy explicitly denies the root user the ability to perform this action.  For more information about bucket policies, see Using Bucket Policies and User Policies. All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. The following actions are related to GetBucketPolicy:    GetObject     PutBucketPolicy     DeleteBucketPolicy   
    */
  def getBucketPolicy(params: GetBucketPolicyRequest): Request[GetBucketPolicyResult, AWSError] = js.native
  def getBucketPolicy(
    params: GetBucketPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBucketPolicyResult, Unit]
  ): Request[GetBucketPolicyResult, AWSError] = js.native
  
  /**
    *  This operation gets an Amazon S3 on Outposts bucket's tags. To get an S3 bucket tags, see GetBucketTagging in the Amazon Simple Storage Service API.   Returns the tag set associated with the Outposts bucket. For more information, see Using Amazon S3 on Outposts in the Amazon Simple Storage Service Developer Guide. To use this operation, you must have permission to perform the GetBucketTagging action. By default, the bucket owner has this permission and can grant this permission to others.  GetBucketTagging has the following special error:   Error code: NoSuchTagSetError    Description: There is no tag set associated with the bucket.     All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. The following actions are related to GetBucketTagging:    PutBucketTagging     DeleteBucketTagging   
    */
  def getBucketTagging(): Request[GetBucketTaggingResult, AWSError] = js.native
  def getBucketTagging(callback: js.Function2[/* err */ AWSError, /* data */ GetBucketTaggingResult, Unit]): Request[GetBucketTaggingResult, AWSError] = js.native
  /**
    *  This operation gets an Amazon S3 on Outposts bucket's tags. To get an S3 bucket tags, see GetBucketTagging in the Amazon Simple Storage Service API.   Returns the tag set associated with the Outposts bucket. For more information, see Using Amazon S3 on Outposts in the Amazon Simple Storage Service Developer Guide. To use this operation, you must have permission to perform the GetBucketTagging action. By default, the bucket owner has this permission and can grant this permission to others.  GetBucketTagging has the following special error:   Error code: NoSuchTagSetError    Description: There is no tag set associated with the bucket.     All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. The following actions are related to GetBucketTagging:    PutBucketTagging     DeleteBucketTagging   
    */
  def getBucketTagging(params: GetBucketTaggingRequest): Request[GetBucketTaggingResult, AWSError] = js.native
  def getBucketTagging(
    params: GetBucketTaggingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBucketTaggingResult, Unit]
  ): Request[GetBucketTaggingResult, AWSError] = js.native
  
  /**
    * Returns the tags on an S3 Batch Operations job. To use this operation, you must have permission to perform the s3:GetJobTagging action. For more information, see Controlling access and labeling jobs using tags in the Amazon Simple Storage Service Developer Guide.  Related actions include:    CreateJob     PutJobTagging     DeleteJobTagging   
    */
  def getJobTagging(): Request[GetJobTaggingResult, AWSError] = js.native
  def getJobTagging(callback: js.Function2[/* err */ AWSError, /* data */ GetJobTaggingResult, Unit]): Request[GetJobTaggingResult, AWSError] = js.native
  /**
    * Returns the tags on an S3 Batch Operations job. To use this operation, you must have permission to perform the s3:GetJobTagging action. For more information, see Controlling access and labeling jobs using tags in the Amazon Simple Storage Service Developer Guide.  Related actions include:    CreateJob     PutJobTagging     DeleteJobTagging   
    */
  def getJobTagging(params: GetJobTaggingRequest): Request[GetJobTaggingResult, AWSError] = js.native
  def getJobTagging(
    params: GetJobTaggingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetJobTaggingResult, Unit]
  ): Request[GetJobTaggingResult, AWSError] = js.native
  
  /**
    * Retrieves the PublicAccessBlock configuration for an AWS account. For more information, see  Using Amazon S3 block public access. Related actions include:    DeletePublicAccessBlock     PutPublicAccessBlock   
    */
  def getPublicAccessBlock(): Request[GetPublicAccessBlockOutput, AWSError] = js.native
  def getPublicAccessBlock(callback: js.Function2[/* err */ AWSError, /* data */ GetPublicAccessBlockOutput, Unit]): Request[GetPublicAccessBlockOutput, AWSError] = js.native
  /**
    * Retrieves the PublicAccessBlock configuration for an AWS account. For more information, see  Using Amazon S3 block public access. Related actions include:    DeletePublicAccessBlock     PutPublicAccessBlock   
    */
  def getPublicAccessBlock(params: GetPublicAccessBlockRequest): Request[GetPublicAccessBlockOutput, AWSError] = js.native
  def getPublicAccessBlock(
    params: GetPublicAccessBlockRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPublicAccessBlockOutput, Unit]
  ): Request[GetPublicAccessBlockOutput, AWSError] = js.native
  
  /**
    * Gets the Amazon S3 Storage Lens configuration. For more information, see Working with Amazon S3 Storage Lens in the Amazon Simple Storage Service Developer Guide.  To use this action, you must have permission to perform the s3:GetStorageLensConfiguration action. For more information, see Setting permissions to use Amazon S3 Storage Lens in the Amazon Simple Storage Service Developer Guide. 
    */
  def getStorageLensConfiguration(): Request[GetStorageLensConfigurationResult, AWSError] = js.native
  def getStorageLensConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ GetStorageLensConfigurationResult, Unit]): Request[GetStorageLensConfigurationResult, AWSError] = js.native
  /**
    * Gets the Amazon S3 Storage Lens configuration. For more information, see Working with Amazon S3 Storage Lens in the Amazon Simple Storage Service Developer Guide.  To use this action, you must have permission to perform the s3:GetStorageLensConfiguration action. For more information, see Setting permissions to use Amazon S3 Storage Lens in the Amazon Simple Storage Service Developer Guide. 
    */
  def getStorageLensConfiguration(params: GetStorageLensConfigurationRequest): Request[GetStorageLensConfigurationResult, AWSError] = js.native
  def getStorageLensConfiguration(
    params: GetStorageLensConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStorageLensConfigurationResult, Unit]
  ): Request[GetStorageLensConfigurationResult, AWSError] = js.native
  
  /**
    * Gets the tags of Amazon S3 Storage Lens configuration. For more information about S3 Storage Lens, see Working with Amazon S3 Storage Lens in the Amazon Simple Storage Service Developer Guide.  To use this action, you must have permission to perform the s3:GetStorageLensConfigurationTagging action. For more information, see Setting permissions to use Amazon S3 Storage Lens in the Amazon Simple Storage Service Developer Guide. 
    */
  def getStorageLensConfigurationTagging(): Request[GetStorageLensConfigurationTaggingResult, AWSError] = js.native
  def getStorageLensConfigurationTagging(
    callback: js.Function2[/* err */ AWSError, /* data */ GetStorageLensConfigurationTaggingResult, Unit]
  ): Request[GetStorageLensConfigurationTaggingResult, AWSError] = js.native
  /**
    * Gets the tags of Amazon S3 Storage Lens configuration. For more information about S3 Storage Lens, see Working with Amazon S3 Storage Lens in the Amazon Simple Storage Service Developer Guide.  To use this action, you must have permission to perform the s3:GetStorageLensConfigurationTagging action. For more information, see Setting permissions to use Amazon S3 Storage Lens in the Amazon Simple Storage Service Developer Guide. 
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
    * Lists current S3 Batch Operations jobs and jobs that have ended within the last 30 days for the AWS account making the request. For more information, see S3 Batch Operations in the Amazon Simple Storage Service Developer Guide. Related actions include:     CreateJob     DescribeJob     UpdateJobPriority     UpdateJobStatus   
    */
  def listJobs(): Request[ListJobsResult, AWSError] = js.native
  def listJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListJobsResult, Unit]): Request[ListJobsResult, AWSError] = js.native
  /**
    * Lists current S3 Batch Operations jobs and jobs that have ended within the last 30 days for the AWS account making the request. For more information, see S3 Batch Operations in the Amazon Simple Storage Service Developer Guide. Related actions include:     CreateJob     DescribeJob     UpdateJobPriority     UpdateJobStatus   
    */
  def listJobs(params: ListJobsRequest): Request[ListJobsResult, AWSError] = js.native
  def listJobs(
    params: ListJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListJobsResult, Unit]
  ): Request[ListJobsResult, AWSError] = js.native
  
  /**
    * Returns a list of all Outposts buckets in an Outpost that are owned by the authenticated sender of the request. For more information, see Using Amazon S3 on Outposts in the Amazon Simple Storage Service Developer Guide. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and x-amz-outpost-id in your request, see the Examples section.
    */
  def listRegionalBuckets(): Request[ListRegionalBucketsResult, AWSError] = js.native
  def listRegionalBuckets(callback: js.Function2[/* err */ AWSError, /* data */ ListRegionalBucketsResult, Unit]): Request[ListRegionalBucketsResult, AWSError] = js.native
  /**
    * Returns a list of all Outposts buckets in an Outpost that are owned by the authenticated sender of the request. For more information, see Using Amazon S3 on Outposts in the Amazon Simple Storage Service Developer Guide. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and x-amz-outpost-id in your request, see the Examples section.
    */
  def listRegionalBuckets(params: ListRegionalBucketsRequest): Request[ListRegionalBucketsResult, AWSError] = js.native
  def listRegionalBuckets(
    params: ListRegionalBucketsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRegionalBucketsResult, Unit]
  ): Request[ListRegionalBucketsResult, AWSError] = js.native
  
  /**
    * Gets a list of Amazon S3 Storage Lens configurations. For more information about S3 Storage Lens, see Working with Amazon S3 Storage Lens in the Amazon Simple Storage Service Developer Guide.  To use this action, you must have permission to perform the s3:ListStorageLensConfigurations action. For more information, see Setting permissions to use Amazon S3 Storage Lens in the Amazon Simple Storage Service Developer Guide. 
    */
  def listStorageLensConfigurations(): Request[ListStorageLensConfigurationsResult, AWSError] = js.native
  def listStorageLensConfigurations(callback: js.Function2[/* err */ AWSError, /* data */ ListStorageLensConfigurationsResult, Unit]): Request[ListStorageLensConfigurationsResult, AWSError] = js.native
  /**
    * Gets a list of Amazon S3 Storage Lens configurations. For more information about S3 Storage Lens, see Working with Amazon S3 Storage Lens in the Amazon Simple Storage Service Developer Guide.  To use this action, you must have permission to perform the s3:ListStorageLensConfigurations action. For more information, see Setting permissions to use Amazon S3 Storage Lens in the Amazon Simple Storage Service Developer Guide. 
    */
  def listStorageLensConfigurations(params: ListStorageLensConfigurationsRequest): Request[ListStorageLensConfigurationsResult, AWSError] = js.native
  def listStorageLensConfigurations(
    params: ListStorageLensConfigurationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListStorageLensConfigurationsResult, Unit]
  ): Request[ListStorageLensConfigurationsResult, AWSError] = js.native
  
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
    *  This action puts a lifecycle configuration to an Amazon S3 on Outposts bucket. To put a lifecycle configuration to an S3 bucket, see PutBucketLifecycleConfiguration in the Amazon Simple Storage Service API.   Creates a new lifecycle configuration for the Outposts bucket or replaces an existing lifecycle configuration. Outposts buckets only support lifecycle configurations that delete/expire objects after a certain period of time and abort incomplete multipart uploads. For more information, see Managing Lifecycle Permissions for Amazon S3 on Outposts.  All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. The following actions are related to PutBucketLifecycleConfiguration:    GetBucketLifecycleConfiguration     DeleteBucketLifecycleConfiguration   
    */
  def putBucketLifecycleConfiguration(): Request[js.Object, AWSError] = js.native
  def putBucketLifecycleConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    *  This action puts a lifecycle configuration to an Amazon S3 on Outposts bucket. To put a lifecycle configuration to an S3 bucket, see PutBucketLifecycleConfiguration in the Amazon Simple Storage Service API.   Creates a new lifecycle configuration for the Outposts bucket or replaces an existing lifecycle configuration. Outposts buckets only support lifecycle configurations that delete/expire objects after a certain period of time and abort incomplete multipart uploads. For more information, see Managing Lifecycle Permissions for Amazon S3 on Outposts.  All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. The following actions are related to PutBucketLifecycleConfiguration:    GetBucketLifecycleConfiguration     DeleteBucketLifecycleConfiguration   
    */
  def putBucketLifecycleConfiguration(params: PutBucketLifecycleConfigurationRequest): Request[js.Object, AWSError] = js.native
  def putBucketLifecycleConfiguration(
    params: PutBucketLifecycleConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    *  This action puts a bucket policy to an Amazon S3 on Outposts bucket. To put a policy on an S3 bucket, see PutBucketPolicy in the Amazon Simple Storage Service API.   Applies an Amazon S3 bucket policy to an Outposts bucket. For more information, see Using Amazon S3 on Outposts in the Amazon Simple Storage Service Developer Guide. If you are using an identity other than the root user of the AWS account that owns the Outposts bucket, the calling identity must have the PutBucketPolicy permissions on the specified Outposts bucket and belong to the bucket owner's account in order to use this operation. If you don't have PutBucketPolicy permissions, Amazon S3 returns a 403 Access Denied error. If you have the correct permissions, but you're not using an identity that belongs to the bucket owner's account, Amazon S3 returns a 405 Method Not Allowed error.   As a security precaution, the root user of the AWS account that owns a bucket can always use this operation, even if the policy explicitly denies the root user the ability to perform this action.   For more information about bucket policies, see Using Bucket Policies and User Policies. All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. The following actions are related to PutBucketPolicy:    GetBucketPolicy     DeleteBucketPolicy   
    */
  def putBucketPolicy(): Request[js.Object, AWSError] = js.native
  def putBucketPolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    *  This action puts a bucket policy to an Amazon S3 on Outposts bucket. To put a policy on an S3 bucket, see PutBucketPolicy in the Amazon Simple Storage Service API.   Applies an Amazon S3 bucket policy to an Outposts bucket. For more information, see Using Amazon S3 on Outposts in the Amazon Simple Storage Service Developer Guide. If you are using an identity other than the root user of the AWS account that owns the Outposts bucket, the calling identity must have the PutBucketPolicy permissions on the specified Outposts bucket and belong to the bucket owner's account in order to use this operation. If you don't have PutBucketPolicy permissions, Amazon S3 returns a 403 Access Denied error. If you have the correct permissions, but you're not using an identity that belongs to the bucket owner's account, Amazon S3 returns a 405 Method Not Allowed error.   As a security precaution, the root user of the AWS account that owns a bucket can always use this operation, even if the policy explicitly denies the root user the ability to perform this action.   For more information about bucket policies, see Using Bucket Policies and User Policies. All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. The following actions are related to PutBucketPolicy:    GetBucketPolicy     DeleteBucketPolicy   
    */
  def putBucketPolicy(params: PutBucketPolicyRequest): Request[js.Object, AWSError] = js.native
  def putBucketPolicy(
    params: PutBucketPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    *  This action puts tags on an Amazon S3 on Outposts bucket. To put tags on an S3 bucket, see PutBucketTagging in the Amazon Simple Storage Service API.   Sets the tags for an Outposts bucket. For more information, see Using Amazon S3 on Outposts in the Amazon Simple Storage Service Developer Guide. Use tags to organize your AWS bill to reflect your own cost structure. To do this, sign up to get your AWS account bill with tag key values included. Then, to see the cost of combined resources, organize your billing information according to resources with the same tag key values. For example, you can tag several resources with a specific application name, and then organize your billing information to see the total cost of that application across several services. For more information, see Cost Allocation and Tagging.  Within a bucket, if you add a tag that has the same key as an existing tag, the new value overwrites the old value. For more information, see Using Cost Allocation in Amazon S3 Bucket Tags.  To use this operation, you must have permissions to perform the s3-outposts:PutBucketTagging action. The Outposts bucket owner has this permission by default and can grant this permission to others. For more information about permissions, see  Permissions Related to Bucket Subresource Operations and Managing Access Permissions to Your Amazon S3 Resources.  PutBucketTagging has the following special errors:   Error code: InvalidTagError    Description: The tag provided was not a valid tag. This error can occur if the tag did not pass input validation. For information about tag restrictions, see  User-Defined Tag Restrictions and  AWS-Generated Cost Allocation Tag Restrictions.     Error code: MalformedXMLError    Description: The XML provided does not match the schema.     Error code: OperationAbortedError     Description: A conflicting conditional operation is currently in progress against this resource. Try again.     Error code: InternalError    Description: The service was unable to apply the provided tag to the bucket.     All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. The following actions are related to PutBucketTagging:    GetBucketTagging     DeleteBucketTagging   
    */
  def putBucketTagging(): Request[js.Object, AWSError] = js.native
  def putBucketTagging(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    *  This action puts tags on an Amazon S3 on Outposts bucket. To put tags on an S3 bucket, see PutBucketTagging in the Amazon Simple Storage Service API.   Sets the tags for an Outposts bucket. For more information, see Using Amazon S3 on Outposts in the Amazon Simple Storage Service Developer Guide. Use tags to organize your AWS bill to reflect your own cost structure. To do this, sign up to get your AWS account bill with tag key values included. Then, to see the cost of combined resources, organize your billing information according to resources with the same tag key values. For example, you can tag several resources with a specific application name, and then organize your billing information to see the total cost of that application across several services. For more information, see Cost Allocation and Tagging.  Within a bucket, if you add a tag that has the same key as an existing tag, the new value overwrites the old value. For more information, see Using Cost Allocation in Amazon S3 Bucket Tags.  To use this operation, you must have permissions to perform the s3-outposts:PutBucketTagging action. The Outposts bucket owner has this permission by default and can grant this permission to others. For more information about permissions, see  Permissions Related to Bucket Subresource Operations and Managing Access Permissions to Your Amazon S3 Resources.  PutBucketTagging has the following special errors:   Error code: InvalidTagError    Description: The tag provided was not a valid tag. This error can occur if the tag did not pass input validation. For information about tag restrictions, see  User-Defined Tag Restrictions and  AWS-Generated Cost Allocation Tag Restrictions.     Error code: MalformedXMLError    Description: The XML provided does not match the schema.     Error code: OperationAbortedError     Description: A conflicting conditional operation is currently in progress against this resource. Try again.     Error code: InternalError    Description: The service was unable to apply the provided tag to the bucket.     All Amazon S3 on Outposts REST API requests for this action require an additional parameter of x-amz-outpost-id to be passed with the request and an S3 on Outposts endpoint hostname prefix instead of s3-control. For an example of the request syntax for Amazon S3 on Outposts that uses the S3 on Outposts endpoint hostname prefix and the x-amz-outpost-id derived using the access point ARN, see the Examples section. The following actions are related to PutBucketTagging:    GetBucketTagging     DeleteBucketTagging   
    */
  def putBucketTagging(params: PutBucketTaggingRequest): Request[js.Object, AWSError] = js.native
  def putBucketTagging(
    params: PutBucketTaggingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Sets the supplied tag-set on an S3 Batch Operations job. A tag is a key-value pair. You can associate S3 Batch Operations tags with any job by sending a PUT request against the tagging subresource that is associated with the job. To modify the existing tag set, you can either replace the existing tag set entirely, or make changes within the existing tag set by retrieving the existing tag set using GetJobTagging, modify that tag set, and use this action to replace the tag set with the one you modified. For more information, see Controlling access and labeling jobs using tags in the Amazon Simple Storage Service Developer Guide.      If you send this request with an empty tag set, Amazon S3 deletes the existing tag set on the Batch Operations job. If you use this method, you are charged for a Tier 1 Request (PUT). For more information, see Amazon S3 pricing.   For deleting existing tags for your Batch Operations job, a DeleteJobTagging request is preferred because it achieves the same result without incurring charges.   A few things to consider about using tags:   Amazon S3 limits the maximum number of tags to 50 tags per job.   You can associate up to 50 tags with a job as long as they have unique tag keys.   A tag key can be up to 128 Unicode characters in length, and tag values can be up to 256 Unicode characters in length.   The key and values are case sensitive.   For tagging-related restrictions related to characters and encodings, see User-Defined Tag Restrictions in the AWS Billing and Cost Management User Guide.       To use this operation, you must have permission to perform the s3:PutJobTagging action. Related actions include:    CreatJob     GetJobTagging     DeleteJobTagging   
    */
  def putJobTagging(): Request[PutJobTaggingResult, AWSError] = js.native
  def putJobTagging(callback: js.Function2[/* err */ AWSError, /* data */ PutJobTaggingResult, Unit]): Request[PutJobTaggingResult, AWSError] = js.native
  /**
    * Sets the supplied tag-set on an S3 Batch Operations job. A tag is a key-value pair. You can associate S3 Batch Operations tags with any job by sending a PUT request against the tagging subresource that is associated with the job. To modify the existing tag set, you can either replace the existing tag set entirely, or make changes within the existing tag set by retrieving the existing tag set using GetJobTagging, modify that tag set, and use this action to replace the tag set with the one you modified. For more information, see Controlling access and labeling jobs using tags in the Amazon Simple Storage Service Developer Guide.      If you send this request with an empty tag set, Amazon S3 deletes the existing tag set on the Batch Operations job. If you use this method, you are charged for a Tier 1 Request (PUT). For more information, see Amazon S3 pricing.   For deleting existing tags for your Batch Operations job, a DeleteJobTagging request is preferred because it achieves the same result without incurring charges.   A few things to consider about using tags:   Amazon S3 limits the maximum number of tags to 50 tags per job.   You can associate up to 50 tags with a job as long as they have unique tag keys.   A tag key can be up to 128 Unicode characters in length, and tag values can be up to 256 Unicode characters in length.   The key and values are case sensitive.   For tagging-related restrictions related to characters and encodings, see User-Defined Tag Restrictions in the AWS Billing and Cost Management User Guide.       To use this operation, you must have permission to perform the s3:PutJobTagging action. Related actions include:    CreatJob     GetJobTagging     DeleteJobTagging   
    */
  def putJobTagging(params: PutJobTaggingRequest): Request[PutJobTaggingResult, AWSError] = js.native
  def putJobTagging(
    params: PutJobTaggingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutJobTaggingResult, Unit]
  ): Request[PutJobTaggingResult, AWSError] = js.native
  
  /**
    * Creates or modifies the PublicAccessBlock configuration for an AWS account. For more information, see  Using Amazon S3 block public access. Related actions include:    GetPublicAccessBlock     DeletePublicAccessBlock   
    */
  def putPublicAccessBlock(): Request[js.Object, AWSError] = js.native
  def putPublicAccessBlock(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Creates or modifies the PublicAccessBlock configuration for an AWS account. For more information, see  Using Amazon S3 block public access. Related actions include:    GetPublicAccessBlock     DeletePublicAccessBlock   
    */
  def putPublicAccessBlock(params: PutPublicAccessBlockRequest): Request[js.Object, AWSError] = js.native
  def putPublicAccessBlock(
    params: PutPublicAccessBlockRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Puts an Amazon S3 Storage Lens configuration. For more information about S3 Storage Lens, see Working with Amazon S3 Storage Lens in the Amazon Simple Storage Service Developer Guide.  To use this action, you must have permission to perform the s3:PutStorageLensConfiguration action. For more information, see Setting permissions to use Amazon S3 Storage Lens in the Amazon Simple Storage Service Developer Guide. 
    */
  def putStorageLensConfiguration(): Request[js.Object, AWSError] = js.native
  def putStorageLensConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Puts an Amazon S3 Storage Lens configuration. For more information about S3 Storage Lens, see Working with Amazon S3 Storage Lens in the Amazon Simple Storage Service Developer Guide.  To use this action, you must have permission to perform the s3:PutStorageLensConfiguration action. For more information, see Setting permissions to use Amazon S3 Storage Lens in the Amazon Simple Storage Service Developer Guide. 
    */
  def putStorageLensConfiguration(params: PutStorageLensConfigurationRequest): Request[js.Object, AWSError] = js.native
  def putStorageLensConfiguration(
    params: PutStorageLensConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Put or replace tags on an existing Amazon S3 Storage Lens configuration. For more information about S3 Storage Lens, see Working with Amazon S3 Storage Lens in the Amazon Simple Storage Service Developer Guide.  To use this action, you must have permission to perform the s3:PutStorageLensConfigurationTagging action. For more information, see Setting permissions to use Amazon S3 Storage Lens in the Amazon Simple Storage Service Developer Guide. 
    */
  def putStorageLensConfigurationTagging(): Request[PutStorageLensConfigurationTaggingResult, AWSError] = js.native
  def putStorageLensConfigurationTagging(
    callback: js.Function2[/* err */ AWSError, /* data */ PutStorageLensConfigurationTaggingResult, Unit]
  ): Request[PutStorageLensConfigurationTaggingResult, AWSError] = js.native
  /**
    * Put or replace tags on an existing Amazon S3 Storage Lens configuration. For more information about S3 Storage Lens, see Working with Amazon S3 Storage Lens in the Amazon Simple Storage Service Developer Guide.  To use this action, you must have permission to perform the s3:PutStorageLensConfigurationTagging action. For more information, see Setting permissions to use Amazon S3 Storage Lens in the Amazon Simple Storage Service Developer Guide. 
    */
  def putStorageLensConfigurationTagging(params: PutStorageLensConfigurationTaggingRequest): Request[PutStorageLensConfigurationTaggingResult, AWSError] = js.native
  def putStorageLensConfigurationTagging(
    params: PutStorageLensConfigurationTaggingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutStorageLensConfigurationTaggingResult, Unit]
  ): Request[PutStorageLensConfigurationTaggingResult, AWSError] = js.native
  
  /**
    * Updates an existing S3 Batch Operations job's priority. For more information, see S3 Batch Operations in the Amazon Simple Storage Service Developer Guide.  Related actions include:    CreateJob     ListJobs     DescribeJob     UpdateJobStatus   
    */
  def updateJobPriority(): Request[UpdateJobPriorityResult, AWSError] = js.native
  def updateJobPriority(callback: js.Function2[/* err */ AWSError, /* data */ UpdateJobPriorityResult, Unit]): Request[UpdateJobPriorityResult, AWSError] = js.native
  /**
    * Updates an existing S3 Batch Operations job's priority. For more information, see S3 Batch Operations in the Amazon Simple Storage Service Developer Guide.  Related actions include:    CreateJob     ListJobs     DescribeJob     UpdateJobStatus   
    */
  def updateJobPriority(params: UpdateJobPriorityRequest): Request[UpdateJobPriorityResult, AWSError] = js.native
  def updateJobPriority(
    params: UpdateJobPriorityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateJobPriorityResult, Unit]
  ): Request[UpdateJobPriorityResult, AWSError] = js.native
  
  /**
    * Updates the status for the specified job. Use this operation to confirm that you want to run a job or to cancel an existing job. For more information, see S3 Batch Operations in the Amazon Simple Storage Service Developer Guide.  Related actions include:    CreateJob     ListJobs     DescribeJob     UpdateJobStatus   
    */
  def updateJobStatus(): Request[UpdateJobStatusResult, AWSError] = js.native
  def updateJobStatus(callback: js.Function2[/* err */ AWSError, /* data */ UpdateJobStatusResult, Unit]): Request[UpdateJobStatusResult, AWSError] = js.native
  /**
    * Updates the status for the specified job. Use this operation to confirm that you want to run a job or to cancel an existing job. For more information, see S3 Batch Operations in the Amazon Simple Storage Service Developer Guide.  Related actions include:    CreateJob     ListJobs     DescribeJob     UpdateJobStatus   
    */
  def updateJobStatus(params: UpdateJobStatusRequest): Request[UpdateJobStatusResult, AWSError] = js.native
  def updateJobStatus(
    params: UpdateJobStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateJobStatusResult, Unit]
  ): Request[UpdateJobStatusResult, AWSError] = js.native
}
