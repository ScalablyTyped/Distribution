package typings.awsSdk.signerMod

import typings.awsSdk.awsSdkStrings.successfulSigningJob
import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Signer extends Service {
  @JSName("config")
  var config_Signer: ConfigBase with ClientConfiguration = js.native
  /**
    * Changes the state of an ACTIVE signing profile to CANCELED. A canceled profile is still viewable with the ListSigningProfiles operation, but it cannot perform new signing jobs, and is deleted two years after cancelation.
    */
  def cancelSigningProfile(): Request[js.Object, AWSError] = js.native
  def cancelSigningProfile(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Changes the state of an ACTIVE signing profile to CANCELED. A canceled profile is still viewable with the ListSigningProfiles operation, but it cannot perform new signing jobs, and is deleted two years after cancelation.
    */
  def cancelSigningProfile(params: CancelSigningProfileRequest): Request[js.Object, AWSError] = js.native
  def cancelSigningProfile(
    params: CancelSigningProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Returns information about a specific code signing job. You specify the job by using the jobId value that is returned by the StartSigningJob operation. 
    */
  def describeSigningJob(): Request[DescribeSigningJobResponse, AWSError] = js.native
  def describeSigningJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSigningJobResponse, Unit]): Request[DescribeSigningJobResponse, AWSError] = js.native
  /**
    * Returns information about a specific code signing job. You specify the job by using the jobId value that is returned by the StartSigningJob operation. 
    */
  def describeSigningJob(params: DescribeSigningJobRequest): Request[DescribeSigningJobResponse, AWSError] = js.native
  def describeSigningJob(
    params: DescribeSigningJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSigningJobResponse, Unit]
  ): Request[DescribeSigningJobResponse, AWSError] = js.native
  /**
    * Returns information on a specific signing platform.
    */
  def getSigningPlatform(): Request[GetSigningPlatformResponse, AWSError] = js.native
  def getSigningPlatform(callback: js.Function2[/* err */ AWSError, /* data */ GetSigningPlatformResponse, Unit]): Request[GetSigningPlatformResponse, AWSError] = js.native
  /**
    * Returns information on a specific signing platform.
    */
  def getSigningPlatform(params: GetSigningPlatformRequest): Request[GetSigningPlatformResponse, AWSError] = js.native
  def getSigningPlatform(
    params: GetSigningPlatformRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSigningPlatformResponse, Unit]
  ): Request[GetSigningPlatformResponse, AWSError] = js.native
  /**
    * Returns information on a specific signing profile.
    */
  def getSigningProfile(): Request[GetSigningProfileResponse, AWSError] = js.native
  def getSigningProfile(callback: js.Function2[/* err */ AWSError, /* data */ GetSigningProfileResponse, Unit]): Request[GetSigningProfileResponse, AWSError] = js.native
  /**
    * Returns information on a specific signing profile.
    */
  def getSigningProfile(params: GetSigningProfileRequest): Request[GetSigningProfileResponse, AWSError] = js.native
  def getSigningProfile(
    params: GetSigningProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSigningProfileResponse, Unit]
  ): Request[GetSigningProfileResponse, AWSError] = js.native
  /**
    * Lists all your signing jobs. You can use the maxResults parameter to limit the number of signing jobs that are returned in the response. If additional jobs remain to be listed, code signing returns a nextToken value. Use this value in subsequent calls to ListSigningJobs to fetch the remaining values. You can continue calling ListSigningJobs with your maxResults parameter and with new values that code signing returns in the nextToken parameter until all of your signing jobs have been returned. 
    */
  def listSigningJobs(): Request[ListSigningJobsResponse, AWSError] = js.native
  def listSigningJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListSigningJobsResponse, Unit]): Request[ListSigningJobsResponse, AWSError] = js.native
  /**
    * Lists all your signing jobs. You can use the maxResults parameter to limit the number of signing jobs that are returned in the response. If additional jobs remain to be listed, code signing returns a nextToken value. Use this value in subsequent calls to ListSigningJobs to fetch the remaining values. You can continue calling ListSigningJobs with your maxResults parameter and with new values that code signing returns in the nextToken parameter until all of your signing jobs have been returned. 
    */
  def listSigningJobs(params: ListSigningJobsRequest): Request[ListSigningJobsResponse, AWSError] = js.native
  def listSigningJobs(
    params: ListSigningJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSigningJobsResponse, Unit]
  ): Request[ListSigningJobsResponse, AWSError] = js.native
  /**
    * Lists all signing platforms available in code signing that match the request parameters. If additional jobs remain to be listed, code signing returns a nextToken value. Use this value in subsequent calls to ListSigningJobs to fetch the remaining values. You can continue calling ListSigningJobs with your maxResults parameter and with new values that code signing returns in the nextToken parameter until all of your signing jobs have been returned.
    */
  def listSigningPlatforms(): Request[ListSigningPlatformsResponse, AWSError] = js.native
  def listSigningPlatforms(callback: js.Function2[/* err */ AWSError, /* data */ ListSigningPlatformsResponse, Unit]): Request[ListSigningPlatformsResponse, AWSError] = js.native
  /**
    * Lists all signing platforms available in code signing that match the request parameters. If additional jobs remain to be listed, code signing returns a nextToken value. Use this value in subsequent calls to ListSigningJobs to fetch the remaining values. You can continue calling ListSigningJobs with your maxResults parameter and with new values that code signing returns in the nextToken parameter until all of your signing jobs have been returned.
    */
  def listSigningPlatforms(params: ListSigningPlatformsRequest): Request[ListSigningPlatformsResponse, AWSError] = js.native
  def listSigningPlatforms(
    params: ListSigningPlatformsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSigningPlatformsResponse, Unit]
  ): Request[ListSigningPlatformsResponse, AWSError] = js.native
  /**
    * Lists all available signing profiles in your AWS account. Returns only profiles with an ACTIVE status unless the includeCanceled request field is set to true. If additional jobs remain to be listed, code signing returns a nextToken value. Use this value in subsequent calls to ListSigningJobs to fetch the remaining values. You can continue calling ListSigningJobs with your maxResults parameter and with new values that code signing returns in the nextToken parameter until all of your signing jobs have been returned.
    */
  def listSigningProfiles(): Request[ListSigningProfilesResponse, AWSError] = js.native
  def listSigningProfiles(callback: js.Function2[/* err */ AWSError, /* data */ ListSigningProfilesResponse, Unit]): Request[ListSigningProfilesResponse, AWSError] = js.native
  /**
    * Lists all available signing profiles in your AWS account. Returns only profiles with an ACTIVE status unless the includeCanceled request field is set to true. If additional jobs remain to be listed, code signing returns a nextToken value. Use this value in subsequent calls to ListSigningJobs to fetch the remaining values. You can continue calling ListSigningJobs with your maxResults parameter and with new values that code signing returns in the nextToken parameter until all of your signing jobs have been returned.
    */
  def listSigningProfiles(params: ListSigningProfilesRequest): Request[ListSigningProfilesResponse, AWSError] = js.native
  def listSigningProfiles(
    params: ListSigningProfilesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSigningProfilesResponse, Unit]
  ): Request[ListSigningProfilesResponse, AWSError] = js.native
  /**
    * Returns a list of the tags associated with a signing profile resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Returns a list of the tags associated with a signing profile resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Creates a signing profile. A signing profile is a code signing template that can be used to carry out a pre-defined signing job. For more information, see http://docs.aws.amazon.com/signer/latest/developerguide/gs-profile.html 
    */
  def putSigningProfile(): Request[PutSigningProfileResponse, AWSError] = js.native
  def putSigningProfile(callback: js.Function2[/* err */ AWSError, /* data */ PutSigningProfileResponse, Unit]): Request[PutSigningProfileResponse, AWSError] = js.native
  /**
    * Creates a signing profile. A signing profile is a code signing template that can be used to carry out a pre-defined signing job. For more information, see http://docs.aws.amazon.com/signer/latest/developerguide/gs-profile.html 
    */
  def putSigningProfile(params: PutSigningProfileRequest): Request[PutSigningProfileResponse, AWSError] = js.native
  def putSigningProfile(
    params: PutSigningProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutSigningProfileResponse, Unit]
  ): Request[PutSigningProfileResponse, AWSError] = js.native
  /**
    * Initiates a signing job to be performed on the code provided. Signing jobs are viewable by the ListSigningJobs operation for two years after they are performed. Note the following requirements:     You must create an Amazon S3 source bucket. For more information, see Create a Bucket in the Amazon S3 Getting Started Guide.    Your S3 source bucket must be version enabled.   You must create an S3 destination bucket. Code signing uses your S3 destination bucket to write your signed code.   You specify the name of the source and destination buckets when calling the StartSigningJob operation.   You must also specify a request token that identifies your request to code signing.   You can call the DescribeSigningJob and the ListSigningJobs actions after you call StartSigningJob. For a Java example that shows how to use this action, see http://docs.aws.amazon.com/acm/latest/userguide/ 
    */
  def startSigningJob(): Request[StartSigningJobResponse, AWSError] = js.native
  def startSigningJob(callback: js.Function2[/* err */ AWSError, /* data */ StartSigningJobResponse, Unit]): Request[StartSigningJobResponse, AWSError] = js.native
  /**
    * Initiates a signing job to be performed on the code provided. Signing jobs are viewable by the ListSigningJobs operation for two years after they are performed. Note the following requirements:     You must create an Amazon S3 source bucket. For more information, see Create a Bucket in the Amazon S3 Getting Started Guide.    Your S3 source bucket must be version enabled.   You must create an S3 destination bucket. Code signing uses your S3 destination bucket to write your signed code.   You specify the name of the source and destination buckets when calling the StartSigningJob operation.   You must also specify a request token that identifies your request to code signing.   You can call the DescribeSigningJob and the ListSigningJobs actions after you call StartSigningJob. For a Java example that shows how to use this action, see http://docs.aws.amazon.com/acm/latest/userguide/ 
    */
  def startSigningJob(params: StartSigningJobRequest): Request[StartSigningJobResponse, AWSError] = js.native
  def startSigningJob(
    params: StartSigningJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartSigningJobResponse, Unit]
  ): Request[StartSigningJobResponse, AWSError] = js.native
  /**
    * Adds one or more tags to a signing profile. Tags are labels that you can use to identify and organize your AWS resources. Each tag consists of a key and an optional value. You specify the signing profile using its Amazon Resource Name (ARN). You specify the tag by using a key-value pair.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds one or more tags to a signing profile. Tags are labels that you can use to identify and organize your AWS resources. Each tag consists of a key and an optional value. You specify the signing profile using its Amazon Resource Name (ARN). You specify the tag by using a key-value pair.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Remove one or more tags from a signing profile. Specify a list of tag keys to remove the tags.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Remove one or more tags from a signing profile. Specify a list of tag keys to remove the tags.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Waits for the successfulSigningJob state by periodically calling the underlying Signer.describeSigningJoboperation every 20 seconds (at most 25 times).
    */
  @JSName("waitFor")
  def waitFor_successfulSigningJob(state: successfulSigningJob): Request[DescribeSigningJobResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_successfulSigningJob(
    state: successfulSigningJob,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSigningJobResponse, Unit]
  ): Request[DescribeSigningJobResponse, AWSError] = js.native
  /**
    * Waits for the successfulSigningJob state by periodically calling the underlying Signer.describeSigningJoboperation every 20 seconds (at most 25 times).
    */
  @JSName("waitFor")
  def waitFor_successfulSigningJob(state: successfulSigningJob, params: typings.awsSdk.DescribeSigningJobRequest): Request[DescribeSigningJobResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_successfulSigningJob(
    state: successfulSigningJob,
    params: typings.awsSdk.DescribeSigningJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSigningJobResponse, Unit]
  ): Request[DescribeSigningJobResponse, AWSError] = js.native
}

