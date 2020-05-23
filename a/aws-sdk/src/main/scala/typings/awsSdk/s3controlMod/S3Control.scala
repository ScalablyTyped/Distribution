package typings.awsSdk.s3controlMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Control extends Service {
  @JSName("config")
  var config_S3Control: ConfigBase with ClientConfiguration = js.native
  /**
    * Creates an access point and associates it with the specified bucket.
    */
  def createAccessPoint(): Request[js.Object, AWSError] = js.native
  def createAccessPoint(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Creates an access point and associates it with the specified bucket.
    */
  def createAccessPoint(params: CreateAccessPointRequest): Request[js.Object, AWSError] = js.native
  def createAccessPoint(
    params: CreateAccessPointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * You can use Amazon S3 Batch Operations to perform large-scale Batch Operations on Amazon S3 objects. Amazon S3 Batch Operations can execute a single operation or action on lists of Amazon S3 objects that you specify. For more information, see Amazon S3 Batch Operations in the Amazon Simple Storage Service Developer Guide. Related actions include:    DescribeJob     ListJobs     UpdateJobPriority     UpdateJobStatus   
    */
  def createJob(): Request[CreateJobResult, AWSError] = js.native
  def createJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateJobResult, Unit]): Request[CreateJobResult, AWSError] = js.native
  /**
    * You can use Amazon S3 Batch Operations to perform large-scale Batch Operations on Amazon S3 objects. Amazon S3 Batch Operations can execute a single operation or action on lists of Amazon S3 objects that you specify. For more information, see Amazon S3 Batch Operations in the Amazon Simple Storage Service Developer Guide. Related actions include:    DescribeJob     ListJobs     UpdateJobPriority     UpdateJobStatus   
    */
  def createJob(params: CreateJobRequest): Request[CreateJobResult, AWSError] = js.native
  def createJob(
    params: CreateJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateJobResult, Unit]
  ): Request[CreateJobResult, AWSError] = js.native
  /**
    * Deletes the specified access point.
    */
  def deleteAccessPoint(): Request[js.Object, AWSError] = js.native
  def deleteAccessPoint(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified access point.
    */
  def deleteAccessPoint(params: DeleteAccessPointRequest): Request[js.Object, AWSError] = js.native
  def deleteAccessPoint(
    params: DeleteAccessPointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the access point policy for the specified access point.
    */
  def deleteAccessPointPolicy(): Request[js.Object, AWSError] = js.native
  def deleteAccessPointPolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the access point policy for the specified access point.
    */
  def deleteAccessPointPolicy(params: DeleteAccessPointPolicyRequest): Request[js.Object, AWSError] = js.native
  def deleteAccessPointPolicy(
    params: DeleteAccessPointPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Removes the entire tag set from the specified Amazon S3 Batch Operations job. To use this operation, you must have permission to perform the s3:DeleteJobTagging action. For more information, see Using Job Tags in the Amazon Simple Storage Service Developer Guide.  Related actions include:    CreateJob     GetJobTagging     PutJobTagging   
    */
  def deleteJobTagging(): Request[DeleteJobTaggingResult, AWSError] = js.native
  def deleteJobTagging(callback: js.Function2[/* err */ AWSError, /* data */ DeleteJobTaggingResult, Unit]): Request[DeleteJobTaggingResult, AWSError] = js.native
  /**
    * Removes the entire tag set from the specified Amazon S3 Batch Operations job. To use this operation, you must have permission to perform the s3:DeleteJobTagging action. For more information, see Using Job Tags in the Amazon Simple Storage Service Developer Guide.  Related actions include:    CreateJob     GetJobTagging     PutJobTagging   
    */
  def deleteJobTagging(params: DeleteJobTaggingRequest): Request[DeleteJobTaggingResult, AWSError] = js.native
  def deleteJobTagging(
    params: DeleteJobTaggingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteJobTaggingResult, Unit]
  ): Request[DeleteJobTaggingResult, AWSError] = js.native
  /**
    * Removes the PublicAccessBlock configuration for an Amazon Web Services account.
    */
  def deletePublicAccessBlock(): Request[js.Object, AWSError] = js.native
  def deletePublicAccessBlock(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes the PublicAccessBlock configuration for an Amazon Web Services account.
    */
  def deletePublicAccessBlock(params: DeletePublicAccessBlockRequest): Request[js.Object, AWSError] = js.native
  def deletePublicAccessBlock(
    params: DeletePublicAccessBlockRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Retrieves the configuration parameters and status for a Batch Operations job. For more information, see Amazon S3 Batch Operations in the Amazon Simple Storage Service Developer Guide.  Related actions include:    CreateJob     ListJobs     UpdateJobPriority     UpdateJobStatus   
    */
  def describeJob(): Request[DescribeJobResult, AWSError] = js.native
  def describeJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobResult, Unit]): Request[DescribeJobResult, AWSError] = js.native
  /**
    * Retrieves the configuration parameters and status for a Batch Operations job. For more information, see Amazon S3 Batch Operations in the Amazon Simple Storage Service Developer Guide.  Related actions include:    CreateJob     ListJobs     UpdateJobPriority     UpdateJobStatus   
    */
  def describeJob(params: DescribeJobRequest): Request[DescribeJobResult, AWSError] = js.native
  def describeJob(
    params: DescribeJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobResult, Unit]
  ): Request[DescribeJobResult, AWSError] = js.native
  /**
    * Returns configuration information about the specified access point.
    */
  def getAccessPoint(): Request[GetAccessPointResult, AWSError] = js.native
  def getAccessPoint(callback: js.Function2[/* err */ AWSError, /* data */ GetAccessPointResult, Unit]): Request[GetAccessPointResult, AWSError] = js.native
  /**
    * Returns configuration information about the specified access point.
    */
  def getAccessPoint(params: GetAccessPointRequest): Request[GetAccessPointResult, AWSError] = js.native
  def getAccessPoint(
    params: GetAccessPointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAccessPointResult, Unit]
  ): Request[GetAccessPointResult, AWSError] = js.native
  /**
    * Returns the access point policy associated with the specified access point.
    */
  def getAccessPointPolicy(): Request[GetAccessPointPolicyResult, AWSError] = js.native
  def getAccessPointPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetAccessPointPolicyResult, Unit]): Request[GetAccessPointPolicyResult, AWSError] = js.native
  /**
    * Returns the access point policy associated with the specified access point.
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
    * Returns the tags on an Amazon S3 Batch Operations job. To use this operation, you must have permission to perform the s3:GetJobTagging action. For more information, see Using Job Tags in the Amazon Simple Storage Service Developer Guide.  Related actions include:    CreateJob     PutJobTagging     DeleteJobTagging   
    */
  def getJobTagging(): Request[GetJobTaggingResult, AWSError] = js.native
  def getJobTagging(callback: js.Function2[/* err */ AWSError, /* data */ GetJobTaggingResult, Unit]): Request[GetJobTaggingResult, AWSError] = js.native
  /**
    * Returns the tags on an Amazon S3 Batch Operations job. To use this operation, you must have permission to perform the s3:GetJobTagging action. For more information, see Using Job Tags in the Amazon Simple Storage Service Developer Guide.  Related actions include:    CreateJob     PutJobTagging     DeleteJobTagging   
    */
  def getJobTagging(params: GetJobTaggingRequest): Request[GetJobTaggingResult, AWSError] = js.native
  def getJobTagging(
    params: GetJobTaggingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetJobTaggingResult, Unit]
  ): Request[GetJobTaggingResult, AWSError] = js.native
  /**
    * Retrieves the PublicAccessBlock configuration for an Amazon Web Services account.
    */
  def getPublicAccessBlock(): Request[GetPublicAccessBlockOutput, AWSError] = js.native
  def getPublicAccessBlock(callback: js.Function2[/* err */ AWSError, /* data */ GetPublicAccessBlockOutput, Unit]): Request[GetPublicAccessBlockOutput, AWSError] = js.native
  /**
    * Retrieves the PublicAccessBlock configuration for an Amazon Web Services account.
    */
  def getPublicAccessBlock(params: GetPublicAccessBlockRequest): Request[GetPublicAccessBlockOutput, AWSError] = js.native
  def getPublicAccessBlock(
    params: GetPublicAccessBlockRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPublicAccessBlockOutput, Unit]
  ): Request[GetPublicAccessBlockOutput, AWSError] = js.native
  /**
    * Returns a list of the access points currently associated with the specified bucket. You can retrieve up to 1000 access points per call. If the specified bucket has more than 1,000 access points (or the number specified in maxResults, whichever is less), the response will include a continuation token that you can use to list the additional access points.
    */
  def listAccessPoints(): Request[ListAccessPointsResult, AWSError] = js.native
  def listAccessPoints(callback: js.Function2[/* err */ AWSError, /* data */ ListAccessPointsResult, Unit]): Request[ListAccessPointsResult, AWSError] = js.native
  /**
    * Returns a list of the access points currently associated with the specified bucket. You can retrieve up to 1000 access points per call. If the specified bucket has more than 1,000 access points (or the number specified in maxResults, whichever is less), the response will include a continuation token that you can use to list the additional access points.
    */
  def listAccessPoints(params: ListAccessPointsRequest): Request[ListAccessPointsResult, AWSError] = js.native
  def listAccessPoints(
    params: ListAccessPointsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAccessPointsResult, Unit]
  ): Request[ListAccessPointsResult, AWSError] = js.native
  /**
    * Lists current Amazon S3 Batch Operations jobs and jobs that have ended within the last 30 days for the AWS account making the request. For more information, see Amazon S3 Batch Operations in the Amazon Simple Storage Service Developer Guide. Related actions include:     CreateJob     DescribeJob     UpdateJobPriority     UpdateJobStatus   
    */
  def listJobs(): Request[ListJobsResult, AWSError] = js.native
  def listJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListJobsResult, Unit]): Request[ListJobsResult, AWSError] = js.native
  /**
    * Lists current Amazon S3 Batch Operations jobs and jobs that have ended within the last 30 days for the AWS account making the request. For more information, see Amazon S3 Batch Operations in the Amazon Simple Storage Service Developer Guide. Related actions include:     CreateJob     DescribeJob     UpdateJobPriority     UpdateJobStatus   
    */
  def listJobs(params: ListJobsRequest): Request[ListJobsResult, AWSError] = js.native
  def listJobs(
    params: ListJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListJobsResult, Unit]
  ): Request[ListJobsResult, AWSError] = js.native
  /**
    * Associates an access policy with the specified access point. Each access point can have only one policy, so a request made to this API replaces any existing policy associated with the specified access point.
    */
  def putAccessPointPolicy(): Request[js.Object, AWSError] = js.native
  def putAccessPointPolicy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Associates an access policy with the specified access point. Each access point can have only one policy, so a request made to this API replaces any existing policy associated with the specified access point.
    */
  def putAccessPointPolicy(params: PutAccessPointPolicyRequest): Request[js.Object, AWSError] = js.native
  def putAccessPointPolicy(
    params: PutAccessPointPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Set the supplied tag-set on an Amazon S3 Batch Operations job. A tag is a key-value pair. You can associate Amazon S3 Batch Operations tags with any job by sending a PUT request against the tagging subresource that is associated with the job. To modify the existing tag set, you can either replace the existing tag set entirely, or make changes within the existing tag set by retrieving the existing tag set using GetJobTagging, modify that tag set, and use this API action to replace the tag set with the one you have modified.. For more information, see Using Job Tags in the Amazon Simple Storage Service Developer Guide.      If you send this request with an empty tag set, Amazon S3 deletes the existing tag set on the Batch Operations job. If you use this method, you will be charged for a Tier 1 Request (PUT). For more information, see Amazon S3 pricing.   For deleting existing tags for your batch operations job, DeleteJobTagging request is preferred because it achieves the same result without incurring charges.   A few things to consider about using tags:   Amazon S3 limits the maximum number of tags to 50 tags per job.   You can associate up to 50 tags with a job as long as they have unique tag keys.   A tag key can be up to 128 Unicode characters in length, and tag values can be up to 256 Unicode characters in length.   The key and values are case sensitive.   For tagging-related restrictions related to characters and encodings, see User-Defined Tag Restrictions.       To use this operation, you must have permission to perform the s3:PutJobTagging action. Related actions include:    CreateJob     GetJobTagging     DeleteJobTagging   
    */
  def putJobTagging(): Request[PutJobTaggingResult, AWSError] = js.native
  def putJobTagging(callback: js.Function2[/* err */ AWSError, /* data */ PutJobTaggingResult, Unit]): Request[PutJobTaggingResult, AWSError] = js.native
  /**
    * Set the supplied tag-set on an Amazon S3 Batch Operations job. A tag is a key-value pair. You can associate Amazon S3 Batch Operations tags with any job by sending a PUT request against the tagging subresource that is associated with the job. To modify the existing tag set, you can either replace the existing tag set entirely, or make changes within the existing tag set by retrieving the existing tag set using GetJobTagging, modify that tag set, and use this API action to replace the tag set with the one you have modified.. For more information, see Using Job Tags in the Amazon Simple Storage Service Developer Guide.      If you send this request with an empty tag set, Amazon S3 deletes the existing tag set on the Batch Operations job. If you use this method, you will be charged for a Tier 1 Request (PUT). For more information, see Amazon S3 pricing.   For deleting existing tags for your batch operations job, DeleteJobTagging request is preferred because it achieves the same result without incurring charges.   A few things to consider about using tags:   Amazon S3 limits the maximum number of tags to 50 tags per job.   You can associate up to 50 tags with a job as long as they have unique tag keys.   A tag key can be up to 128 Unicode characters in length, and tag values can be up to 256 Unicode characters in length.   The key and values are case sensitive.   For tagging-related restrictions related to characters and encodings, see User-Defined Tag Restrictions.       To use this operation, you must have permission to perform the s3:PutJobTagging action. Related actions include:    CreateJob     GetJobTagging     DeleteJobTagging   
    */
  def putJobTagging(params: PutJobTaggingRequest): Request[PutJobTaggingResult, AWSError] = js.native
  def putJobTagging(
    params: PutJobTaggingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutJobTaggingResult, Unit]
  ): Request[PutJobTaggingResult, AWSError] = js.native
  /**
    * Creates or modifies the PublicAccessBlock configuration for an Amazon Web Services account.
    */
  def putPublicAccessBlock(): Request[js.Object, AWSError] = js.native
  def putPublicAccessBlock(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Creates or modifies the PublicAccessBlock configuration for an Amazon Web Services account.
    */
  def putPublicAccessBlock(params: PutPublicAccessBlockRequest): Request[js.Object, AWSError] = js.native
  def putPublicAccessBlock(
    params: PutPublicAccessBlockRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Updates an existing Amazon S3 Batch Operations job's priority. For more information, see Amazon S3 Batch Operations in the Amazon Simple Storage Service Developer Guide.  Related actions include:    CreateJob     ListJobs     DescribeJob     UpdateJobStatus   
    */
  def updateJobPriority(): Request[UpdateJobPriorityResult, AWSError] = js.native
  def updateJobPriority(callback: js.Function2[/* err */ AWSError, /* data */ UpdateJobPriorityResult, Unit]): Request[UpdateJobPriorityResult, AWSError] = js.native
  /**
    * Updates an existing Amazon S3 Batch Operations job's priority. For more information, see Amazon S3 Batch Operations in the Amazon Simple Storage Service Developer Guide.  Related actions include:    CreateJob     ListJobs     DescribeJob     UpdateJobStatus   
    */
  def updateJobPriority(params: UpdateJobPriorityRequest): Request[UpdateJobPriorityResult, AWSError] = js.native
  def updateJobPriority(
    params: UpdateJobPriorityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateJobPriorityResult, Unit]
  ): Request[UpdateJobPriorityResult, AWSError] = js.native
  /**
    * Updates the status for the specified job. Use this operation to confirm that you want to run a job or to cancel an existing job. For more information, see Amazon S3 Batch Operations in the Amazon Simple Storage Service Developer Guide.  Related actions include:    CreateJob     ListJobs     DescribeJob     UpdateJobStatus   
    */
  def updateJobStatus(): Request[UpdateJobStatusResult, AWSError] = js.native
  def updateJobStatus(callback: js.Function2[/* err */ AWSError, /* data */ UpdateJobStatusResult, Unit]): Request[UpdateJobStatusResult, AWSError] = js.native
  /**
    * Updates the status for the specified job. Use this operation to confirm that you want to run a job or to cancel an existing job. For more information, see Amazon S3 Batch Operations in the Amazon Simple Storage Service Developer Guide.  Related actions include:    CreateJob     ListJobs     DescribeJob     UpdateJobStatus   
    */
  def updateJobStatus(params: UpdateJobStatusRequest): Request[UpdateJobStatusResult, AWSError] = js.native
  def updateJobStatus(
    params: UpdateJobStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateJobStatusResult, Unit]
  ): Request[UpdateJobStatusResult, AWSError] = js.native
}

