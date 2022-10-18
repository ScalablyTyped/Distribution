package typings.awsSdk.clientsVoiceidMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoiceID extends Service {
  
  @JSName("config")
  var config_VoiceID: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a domain that contains all Amazon Connect Voice ID data, such as speakers, fraudsters, customer audio, and voiceprints. 
    */
  def createDomain(): Request[CreateDomainResponse, AWSError] = js.native
  def createDomain(callback: js.Function2[/* err */ AWSError, /* data */ CreateDomainResponse, Unit]): Request[CreateDomainResponse, AWSError] = js.native
  /**
    * Creates a domain that contains all Amazon Connect Voice ID data, such as speakers, fraudsters, customer audio, and voiceprints. 
    */
  def createDomain(params: CreateDomainRequest): Request[CreateDomainResponse, AWSError] = js.native
  def createDomain(
    params: CreateDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDomainResponse, Unit]
  ): Request[CreateDomainResponse, AWSError] = js.native
  
  /**
    * Deletes the specified domain from Voice ID.
    */
  def deleteDomain(): Request[js.Object, AWSError] = js.native
  def deleteDomain(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified domain from Voice ID.
    */
  def deleteDomain(params: DeleteDomainRequest): Request[js.Object, AWSError] = js.native
  def deleteDomain(
    params: DeleteDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified fraudster from Voice ID.
    */
  def deleteFraudster(): Request[js.Object, AWSError] = js.native
  def deleteFraudster(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified fraudster from Voice ID.
    */
  def deleteFraudster(params: DeleteFraudsterRequest): Request[js.Object, AWSError] = js.native
  def deleteFraudster(
    params: DeleteFraudsterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the specified speaker from Voice ID.
    */
  def deleteSpeaker(): Request[js.Object, AWSError] = js.native
  def deleteSpeaker(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified speaker from Voice ID.
    */
  def deleteSpeaker(params: DeleteSpeakerRequest): Request[js.Object, AWSError] = js.native
  def deleteSpeaker(
    params: DeleteSpeakerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Describes the specified domain.
    */
  def describeDomain(): Request[DescribeDomainResponse, AWSError] = js.native
  def describeDomain(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainResponse, Unit]): Request[DescribeDomainResponse, AWSError] = js.native
  /**
    * Describes the specified domain.
    */
  def describeDomain(params: DescribeDomainRequest): Request[DescribeDomainResponse, AWSError] = js.native
  def describeDomain(
    params: DescribeDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainResponse, Unit]
  ): Request[DescribeDomainResponse, AWSError] = js.native
  
  /**
    * Describes the specified fraudster.
    */
  def describeFraudster(): Request[DescribeFraudsterResponse, AWSError] = js.native
  def describeFraudster(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFraudsterResponse, Unit]): Request[DescribeFraudsterResponse, AWSError] = js.native
  /**
    * Describes the specified fraudster.
    */
  def describeFraudster(params: DescribeFraudsterRequest): Request[DescribeFraudsterResponse, AWSError] = js.native
  def describeFraudster(
    params: DescribeFraudsterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFraudsterResponse, Unit]
  ): Request[DescribeFraudsterResponse, AWSError] = js.native
  
  /**
    * Describes the specified fraudster registration job.
    */
  def describeFraudsterRegistrationJob(): Request[DescribeFraudsterRegistrationJobResponse, AWSError] = js.native
  def describeFraudsterRegistrationJob(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFraudsterRegistrationJobResponse, Unit]
  ): Request[DescribeFraudsterRegistrationJobResponse, AWSError] = js.native
  /**
    * Describes the specified fraudster registration job.
    */
  def describeFraudsterRegistrationJob(params: DescribeFraudsterRegistrationJobRequest): Request[DescribeFraudsterRegistrationJobResponse, AWSError] = js.native
  def describeFraudsterRegistrationJob(
    params: DescribeFraudsterRegistrationJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFraudsterRegistrationJobResponse, Unit]
  ): Request[DescribeFraudsterRegistrationJobResponse, AWSError] = js.native
  
  /**
    * Describes the specified speaker.
    */
  def describeSpeaker(): Request[DescribeSpeakerResponse, AWSError] = js.native
  def describeSpeaker(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSpeakerResponse, Unit]): Request[DescribeSpeakerResponse, AWSError] = js.native
  /**
    * Describes the specified speaker.
    */
  def describeSpeaker(params: DescribeSpeakerRequest): Request[DescribeSpeakerResponse, AWSError] = js.native
  def describeSpeaker(
    params: DescribeSpeakerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSpeakerResponse, Unit]
  ): Request[DescribeSpeakerResponse, AWSError] = js.native
  
  /**
    * Describes the specified speaker enrollment job.
    */
  def describeSpeakerEnrollmentJob(): Request[DescribeSpeakerEnrollmentJobResponse, AWSError] = js.native
  def describeSpeakerEnrollmentJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSpeakerEnrollmentJobResponse, Unit]): Request[DescribeSpeakerEnrollmentJobResponse, AWSError] = js.native
  /**
    * Describes the specified speaker enrollment job.
    */
  def describeSpeakerEnrollmentJob(params: DescribeSpeakerEnrollmentJobRequest): Request[DescribeSpeakerEnrollmentJobResponse, AWSError] = js.native
  def describeSpeakerEnrollmentJob(
    params: DescribeSpeakerEnrollmentJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSpeakerEnrollmentJobResponse, Unit]
  ): Request[DescribeSpeakerEnrollmentJobResponse, AWSError] = js.native
  
  /**
    * Evaluates a specified session based on audio data accumulated during a streaming Amazon Connect Voice ID call.
    */
  def evaluateSession(): Request[EvaluateSessionResponse, AWSError] = js.native
  def evaluateSession(callback: js.Function2[/* err */ AWSError, /* data */ EvaluateSessionResponse, Unit]): Request[EvaluateSessionResponse, AWSError] = js.native
  /**
    * Evaluates a specified session based on audio data accumulated during a streaming Amazon Connect Voice ID call.
    */
  def evaluateSession(params: EvaluateSessionRequest): Request[EvaluateSessionResponse, AWSError] = js.native
  def evaluateSession(
    params: EvaluateSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ EvaluateSessionResponse, Unit]
  ): Request[EvaluateSessionResponse, AWSError] = js.native
  
  /**
    * Lists all the domains in the Amazon Web Services account. 
    */
  def listDomains(): Request[ListDomainsResponse, AWSError] = js.native
  def listDomains(callback: js.Function2[/* err */ AWSError, /* data */ ListDomainsResponse, Unit]): Request[ListDomainsResponse, AWSError] = js.native
  /**
    * Lists all the domains in the Amazon Web Services account. 
    */
  def listDomains(params: ListDomainsRequest): Request[ListDomainsResponse, AWSError] = js.native
  def listDomains(
    params: ListDomainsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDomainsResponse, Unit]
  ): Request[ListDomainsResponse, AWSError] = js.native
  
  /**
    * Lists all the fraudster registration jobs in the domain with the given JobStatus. If JobStatus is not provided, this lists all fraudster registration jobs in the given domain. 
    */
  def listFraudsterRegistrationJobs(): Request[ListFraudsterRegistrationJobsResponse, AWSError] = js.native
  def listFraudsterRegistrationJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListFraudsterRegistrationJobsResponse, Unit]): Request[ListFraudsterRegistrationJobsResponse, AWSError] = js.native
  /**
    * Lists all the fraudster registration jobs in the domain with the given JobStatus. If JobStatus is not provided, this lists all fraudster registration jobs in the given domain. 
    */
  def listFraudsterRegistrationJobs(params: ListFraudsterRegistrationJobsRequest): Request[ListFraudsterRegistrationJobsResponse, AWSError] = js.native
  def listFraudsterRegistrationJobs(
    params: ListFraudsterRegistrationJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFraudsterRegistrationJobsResponse, Unit]
  ): Request[ListFraudsterRegistrationJobsResponse, AWSError] = js.native
  
  /**
    * Lists all the speaker enrollment jobs in the domain with the specified JobStatus. If JobStatus is not provided, this lists all jobs with all possible speaker enrollment job statuses.
    */
  def listSpeakerEnrollmentJobs(): Request[ListSpeakerEnrollmentJobsResponse, AWSError] = js.native
  def listSpeakerEnrollmentJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListSpeakerEnrollmentJobsResponse, Unit]): Request[ListSpeakerEnrollmentJobsResponse, AWSError] = js.native
  /**
    * Lists all the speaker enrollment jobs in the domain with the specified JobStatus. If JobStatus is not provided, this lists all jobs with all possible speaker enrollment job statuses.
    */
  def listSpeakerEnrollmentJobs(params: ListSpeakerEnrollmentJobsRequest): Request[ListSpeakerEnrollmentJobsResponse, AWSError] = js.native
  def listSpeakerEnrollmentJobs(
    params: ListSpeakerEnrollmentJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSpeakerEnrollmentJobsResponse, Unit]
  ): Request[ListSpeakerEnrollmentJobsResponse, AWSError] = js.native
  
  /**
    * Lists all speakers in a specified domain.
    */
  def listSpeakers(): Request[ListSpeakersResponse, AWSError] = js.native
  def listSpeakers(callback: js.Function2[/* err */ AWSError, /* data */ ListSpeakersResponse, Unit]): Request[ListSpeakersResponse, AWSError] = js.native
  /**
    * Lists all speakers in a specified domain.
    */
  def listSpeakers(params: ListSpeakersRequest): Request[ListSpeakersResponse, AWSError] = js.native
  def listSpeakers(
    params: ListSpeakersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSpeakersResponse, Unit]
  ): Request[ListSpeakersResponse, AWSError] = js.native
  
  /**
    * Lists all tags associated with a specified Voice ID resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists all tags associated with a specified Voice ID resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Opts out a speaker from Voice ID. A speaker can be opted out regardless of whether or not they already exist in Voice ID. If they don't yet exist, a new speaker is created in an opted out state. If they already exist, their existing status is overridden and they are opted out. Enrollment and evaluation authentication requests are rejected for opted out speakers, and opted out speakers have no voice embeddings stored in Voice ID.
    */
  def optOutSpeaker(): Request[OptOutSpeakerResponse, AWSError] = js.native
  def optOutSpeaker(callback: js.Function2[/* err */ AWSError, /* data */ OptOutSpeakerResponse, Unit]): Request[OptOutSpeakerResponse, AWSError] = js.native
  /**
    * Opts out a speaker from Voice ID. A speaker can be opted out regardless of whether or not they already exist in Voice ID. If they don't yet exist, a new speaker is created in an opted out state. If they already exist, their existing status is overridden and they are opted out. Enrollment and evaluation authentication requests are rejected for opted out speakers, and opted out speakers have no voice embeddings stored in Voice ID.
    */
  def optOutSpeaker(params: OptOutSpeakerRequest): Request[OptOutSpeakerResponse, AWSError] = js.native
  def optOutSpeaker(
    params: OptOutSpeakerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ OptOutSpeakerResponse, Unit]
  ): Request[OptOutSpeakerResponse, AWSError] = js.native
  
  /**
    * Starts a new batch fraudster registration job using provided details.
    */
  def startFraudsterRegistrationJob(): Request[StartFraudsterRegistrationJobResponse, AWSError] = js.native
  def startFraudsterRegistrationJob(callback: js.Function2[/* err */ AWSError, /* data */ StartFraudsterRegistrationJobResponse, Unit]): Request[StartFraudsterRegistrationJobResponse, AWSError] = js.native
  /**
    * Starts a new batch fraudster registration job using provided details.
    */
  def startFraudsterRegistrationJob(params: StartFraudsterRegistrationJobRequest): Request[StartFraudsterRegistrationJobResponse, AWSError] = js.native
  def startFraudsterRegistrationJob(
    params: StartFraudsterRegistrationJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartFraudsterRegistrationJobResponse, Unit]
  ): Request[StartFraudsterRegistrationJobResponse, AWSError] = js.native
  
  /**
    * Starts a new batch speaker enrollment job using specified details.
    */
  def startSpeakerEnrollmentJob(): Request[StartSpeakerEnrollmentJobResponse, AWSError] = js.native
  def startSpeakerEnrollmentJob(callback: js.Function2[/* err */ AWSError, /* data */ StartSpeakerEnrollmentJobResponse, Unit]): Request[StartSpeakerEnrollmentJobResponse, AWSError] = js.native
  /**
    * Starts a new batch speaker enrollment job using specified details.
    */
  def startSpeakerEnrollmentJob(params: StartSpeakerEnrollmentJobRequest): Request[StartSpeakerEnrollmentJobResponse, AWSError] = js.native
  def startSpeakerEnrollmentJob(
    params: StartSpeakerEnrollmentJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartSpeakerEnrollmentJobResponse, Unit]
  ): Request[StartSpeakerEnrollmentJobResponse, AWSError] = js.native
  
  /**
    * Tags a Voice ID resource with the provided list of tags.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Tags a Voice ID resource with the provided list of tags.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes specified tags from a specified Amazon Connect Voice ID resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes specified tags from a specified Amazon Connect Voice ID resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates the specified domain. This API has clobber behavior, and clears and replaces all attributes. If an optional field, such as 'Description' is not provided, it is removed from the domain.
    */
  def updateDomain(): Request[UpdateDomainResponse, AWSError] = js.native
  def updateDomain(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDomainResponse, Unit]): Request[UpdateDomainResponse, AWSError] = js.native
  /**
    * Updates the specified domain. This API has clobber behavior, and clears and replaces all attributes. If an optional field, such as 'Description' is not provided, it is removed from the domain.
    */
  def updateDomain(params: UpdateDomainRequest): Request[UpdateDomainResponse, AWSError] = js.native
  def updateDomain(
    params: UpdateDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDomainResponse, Unit]
  ): Request[UpdateDomainResponse, AWSError] = js.native
}
