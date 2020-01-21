package typings.awsSdk.comprehendmedicalMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComprehendMedical extends Service {
  @JSName("config")
  var config_ComprehendMedical: ConfigBase with ClientConfiguration = js.native
  /**
    * Gets the properties associated with a medical entities detection job. Use this operation to get the status of a detection job.
    */
  def describeEntitiesDetectionV2Job(): Request[DescribeEntitiesDetectionV2JobResponse, AWSError] = js.native
  def describeEntitiesDetectionV2Job(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEntitiesDetectionV2JobResponse, Unit]
  ): Request[DescribeEntitiesDetectionV2JobResponse, AWSError] = js.native
  /**
    * Gets the properties associated with a medical entities detection job. Use this operation to get the status of a detection job.
    */
  def describeEntitiesDetectionV2Job(params: DescribeEntitiesDetectionV2JobRequest): Request[DescribeEntitiesDetectionV2JobResponse, AWSError] = js.native
  def describeEntitiesDetectionV2Job(
    params: DescribeEntitiesDetectionV2JobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEntitiesDetectionV2JobResponse, Unit]
  ): Request[DescribeEntitiesDetectionV2JobResponse, AWSError] = js.native
  /**
    * Gets the properties associated with a protected health information (PHI) detection job. Use this operation to get the status of a detection job.
    */
  def describePHIDetectionJob(): Request[DescribePHIDetectionJobResponse, AWSError] = js.native
  def describePHIDetectionJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribePHIDetectionJobResponse, Unit]): Request[DescribePHIDetectionJobResponse, AWSError] = js.native
  /**
    * Gets the properties associated with a protected health information (PHI) detection job. Use this operation to get the status of a detection job.
    */
  def describePHIDetectionJob(params: DescribePHIDetectionJobRequest): Request[DescribePHIDetectionJobResponse, AWSError] = js.native
  def describePHIDetectionJob(
    params: DescribePHIDetectionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePHIDetectionJobResponse, Unit]
  ): Request[DescribePHIDetectionJobResponse, AWSError] = js.native
  /**
    * The DetectEntities operation is deprecated. You should use the DetectEntitiesV2 operation instead.  Inspects the clinical text for a variety of medical entities and returns specific information about them such as entity category, location, and confidence score on that information .
    */
  def detectEntities(): Request[DetectEntitiesResponse, AWSError] = js.native
  def detectEntities(callback: js.Function2[/* err */ AWSError, /* data */ DetectEntitiesResponse, Unit]): Request[DetectEntitiesResponse, AWSError] = js.native
  /**
    * The DetectEntities operation is deprecated. You should use the DetectEntitiesV2 operation instead.  Inspects the clinical text for a variety of medical entities and returns specific information about them such as entity category, location, and confidence score on that information .
    */
  def detectEntities(params: DetectEntitiesRequest): Request[DetectEntitiesResponse, AWSError] = js.native
  def detectEntities(
    params: DetectEntitiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DetectEntitiesResponse, Unit]
  ): Request[DetectEntitiesResponse, AWSError] = js.native
  /**
    * Inspects the clinical text for a variety of medical entities and returns specific information about them such as entity category, location, and confidence score on that information. The DetectEntitiesV2 operation replaces the DetectEntities operation. This new action uses a different model for determining the entities in your medical text and changes the way that some entities are returned in the output. You should use the DetectEntitiesV2 operation in all new applications. The DetectEntitiesV2 operation returns the Acuity and Direction entities as attributes instead of types. 
    */
  def detectEntitiesV2(): Request[DetectEntitiesV2Response, AWSError] = js.native
  def detectEntitiesV2(callback: js.Function2[/* err */ AWSError, /* data */ DetectEntitiesV2Response, Unit]): Request[DetectEntitiesV2Response, AWSError] = js.native
  /**
    * Inspects the clinical text for a variety of medical entities and returns specific information about them such as entity category, location, and confidence score on that information. The DetectEntitiesV2 operation replaces the DetectEntities operation. This new action uses a different model for determining the entities in your medical text and changes the way that some entities are returned in the output. You should use the DetectEntitiesV2 operation in all new applications. The DetectEntitiesV2 operation returns the Acuity and Direction entities as attributes instead of types. 
    */
  def detectEntitiesV2(params: DetectEntitiesV2Request): Request[DetectEntitiesV2Response, AWSError] = js.native
  def detectEntitiesV2(
    params: DetectEntitiesV2Request,
    callback: js.Function2[/* err */ AWSError, /* data */ DetectEntitiesV2Response, Unit]
  ): Request[DetectEntitiesV2Response, AWSError] = js.native
  /**
    *  Inspects the clinical text for protected health information (PHI) entities and entity category, location, and confidence score on that information.
    */
  def detectPHI(): Request[DetectPHIResponse, AWSError] = js.native
  def detectPHI(callback: js.Function2[/* err */ AWSError, /* data */ DetectPHIResponse, Unit]): Request[DetectPHIResponse, AWSError] = js.native
  /**
    *  Inspects the clinical text for protected health information (PHI) entities and entity category, location, and confidence score on that information.
    */
  def detectPHI(params: DetectPHIRequest): Request[DetectPHIResponse, AWSError] = js.native
  def detectPHI(
    params: DetectPHIRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DetectPHIResponse, Unit]
  ): Request[DetectPHIResponse, AWSError] = js.native
  /**
    * InferICD10CM detects medical conditions as entities listed in a patient record and links those entities to normalized concept identifiers in the ICD-10-CM knowledge base from the Centers for Disease Control.
    */
  def inferICD10CM(): Request[InferICD10CMResponse, AWSError] = js.native
  def inferICD10CM(callback: js.Function2[/* err */ AWSError, /* data */ InferICD10CMResponse, Unit]): Request[InferICD10CMResponse, AWSError] = js.native
  /**
    * InferICD10CM detects medical conditions as entities listed in a patient record and links those entities to normalized concept identifiers in the ICD-10-CM knowledge base from the Centers for Disease Control.
    */
  def inferICD10CM(params: InferICD10CMRequest): Request[InferICD10CMResponse, AWSError] = js.native
  def inferICD10CM(
    params: InferICD10CMRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ InferICD10CMResponse, Unit]
  ): Request[InferICD10CMResponse, AWSError] = js.native
  /**
    * InferRxNorm detects medications as entities listed in a patient record and links to the normalized concept identifiers in the RxNorm database from the National Library of Medicine.
    */
  def inferRxNorm(): Request[InferRxNormResponse, AWSError] = js.native
  def inferRxNorm(callback: js.Function2[/* err */ AWSError, /* data */ InferRxNormResponse, Unit]): Request[InferRxNormResponse, AWSError] = js.native
  /**
    * InferRxNorm detects medications as entities listed in a patient record and links to the normalized concept identifiers in the RxNorm database from the National Library of Medicine.
    */
  def inferRxNorm(params: InferRxNormRequest): Request[InferRxNormResponse, AWSError] = js.native
  def inferRxNorm(
    params: InferRxNormRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ InferRxNormResponse, Unit]
  ): Request[InferRxNormResponse, AWSError] = js.native
  /**
    * Gets a list of medical entity detection jobs that you have submitted.
    */
  def listEntitiesDetectionV2Jobs(): Request[ListEntitiesDetectionV2JobsResponse, AWSError] = js.native
  def listEntitiesDetectionV2Jobs(callback: js.Function2[/* err */ AWSError, /* data */ ListEntitiesDetectionV2JobsResponse, Unit]): Request[ListEntitiesDetectionV2JobsResponse, AWSError] = js.native
  /**
    * Gets a list of medical entity detection jobs that you have submitted.
    */
  def listEntitiesDetectionV2Jobs(params: ListEntitiesDetectionV2JobsRequest): Request[ListEntitiesDetectionV2JobsResponse, AWSError] = js.native
  def listEntitiesDetectionV2Jobs(
    params: ListEntitiesDetectionV2JobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEntitiesDetectionV2JobsResponse, Unit]
  ): Request[ListEntitiesDetectionV2JobsResponse, AWSError] = js.native
  /**
    * Gets a list of protected health information (PHI) detection jobs that you have submitted.
    */
  def listPHIDetectionJobs(): Request[ListPHIDetectionJobsResponse, AWSError] = js.native
  def listPHIDetectionJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListPHIDetectionJobsResponse, Unit]): Request[ListPHIDetectionJobsResponse, AWSError] = js.native
  /**
    * Gets a list of protected health information (PHI) detection jobs that you have submitted.
    */
  def listPHIDetectionJobs(params: ListPHIDetectionJobsRequest): Request[ListPHIDetectionJobsResponse, AWSError] = js.native
  def listPHIDetectionJobs(
    params: ListPHIDetectionJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPHIDetectionJobsResponse, Unit]
  ): Request[ListPHIDetectionJobsResponse, AWSError] = js.native
  /**
    * Starts an asynchronous medical entity detection job for a collection of documents. Use the DescribeEntitiesDetectionV2Job operation to track the status of a job.
    */
  def startEntitiesDetectionV2Job(): Request[StartEntitiesDetectionV2JobResponse, AWSError] = js.native
  def startEntitiesDetectionV2Job(callback: js.Function2[/* err */ AWSError, /* data */ StartEntitiesDetectionV2JobResponse, Unit]): Request[StartEntitiesDetectionV2JobResponse, AWSError] = js.native
  /**
    * Starts an asynchronous medical entity detection job for a collection of documents. Use the DescribeEntitiesDetectionV2Job operation to track the status of a job.
    */
  def startEntitiesDetectionV2Job(params: StartEntitiesDetectionV2JobRequest): Request[StartEntitiesDetectionV2JobResponse, AWSError] = js.native
  def startEntitiesDetectionV2Job(
    params: StartEntitiesDetectionV2JobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartEntitiesDetectionV2JobResponse, Unit]
  ): Request[StartEntitiesDetectionV2JobResponse, AWSError] = js.native
  /**
    * Starts an asynchronous job to detect protected health information (PHI). Use the DescribePHIDetectionJob operation to track the status of a job.
    */
  def startPHIDetectionJob(): Request[StartPHIDetectionJobResponse, AWSError] = js.native
  def startPHIDetectionJob(callback: js.Function2[/* err */ AWSError, /* data */ StartPHIDetectionJobResponse, Unit]): Request[StartPHIDetectionJobResponse, AWSError] = js.native
  /**
    * Starts an asynchronous job to detect protected health information (PHI). Use the DescribePHIDetectionJob operation to track the status of a job.
    */
  def startPHIDetectionJob(params: StartPHIDetectionJobRequest): Request[StartPHIDetectionJobResponse, AWSError] = js.native
  def startPHIDetectionJob(
    params: StartPHIDetectionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartPHIDetectionJobResponse, Unit]
  ): Request[StartPHIDetectionJobResponse, AWSError] = js.native
  /**
    * Stops a medical entities detection job in progress.
    */
  def stopEntitiesDetectionV2Job(): Request[StopEntitiesDetectionV2JobResponse, AWSError] = js.native
  def stopEntitiesDetectionV2Job(callback: js.Function2[/* err */ AWSError, /* data */ StopEntitiesDetectionV2JobResponse, Unit]): Request[StopEntitiesDetectionV2JobResponse, AWSError] = js.native
  /**
    * Stops a medical entities detection job in progress.
    */
  def stopEntitiesDetectionV2Job(params: StopEntitiesDetectionV2JobRequest): Request[StopEntitiesDetectionV2JobResponse, AWSError] = js.native
  def stopEntitiesDetectionV2Job(
    params: StopEntitiesDetectionV2JobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopEntitiesDetectionV2JobResponse, Unit]
  ): Request[StopEntitiesDetectionV2JobResponse, AWSError] = js.native
  /**
    * Stops a protected health information (PHI) detection job in progress.
    */
  def stopPHIDetectionJob(): Request[StopPHIDetectionJobResponse, AWSError] = js.native
  def stopPHIDetectionJob(callback: js.Function2[/* err */ AWSError, /* data */ StopPHIDetectionJobResponse, Unit]): Request[StopPHIDetectionJobResponse, AWSError] = js.native
  /**
    * Stops a protected health information (PHI) detection job in progress.
    */
  def stopPHIDetectionJob(params: StopPHIDetectionJobRequest): Request[StopPHIDetectionJobResponse, AWSError] = js.native
  def stopPHIDetectionJob(
    params: StopPHIDetectionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopPHIDetectionJobResponse, Unit]
  ): Request[StopPHIDetectionJobResponse, AWSError] = js.native
}

