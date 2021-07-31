package typings.awsSdk.importexportMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportExport extends Service {
  
  /**
    * This operation cancels a specified job. Only the job owner can cancel it. The operation fails if the job has already started or is complete.
    */
  def cancelJob(): Request[CancelJobOutput, AWSError] = js.native
  def cancelJob(callback: js.Function2[/* err */ AWSError, /* data */ CancelJobOutput, Unit]): Request[CancelJobOutput, AWSError] = js.native
  /**
    * This operation cancels a specified job. Only the job owner can cancel it. The operation fails if the job has already started or is complete.
    */
  def cancelJob(params: CancelJobInput): Request[CancelJobOutput, AWSError] = js.native
  def cancelJob(
    params: CancelJobInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelJobOutput, Unit]
  ): Request[CancelJobOutput, AWSError] = js.native
  
  @JSName("config")
  var config_ImportExport: ConfigBase & ClientConfiguration = js.native
  
  /**
    * This operation initiates the process of scheduling an upload or download of your data. You include in the request a manifest that describes the data transfer specifics. The response to the request includes a job ID, which you can use in other operations, a signature that you use to identify your storage device, and the address where you should ship your storage device.
    */
  def createJob(): Request[CreateJobOutput, AWSError] = js.native
  def createJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateJobOutput, Unit]): Request[CreateJobOutput, AWSError] = js.native
  /**
    * This operation initiates the process of scheduling an upload or download of your data. You include in the request a manifest that describes the data transfer specifics. The response to the request includes a job ID, which you can use in other operations, a signature that you use to identify your storage device, and the address where you should ship your storage device.
    */
  def createJob(params: CreateJobInput): Request[CreateJobOutput, AWSError] = js.native
  def createJob(
    params: CreateJobInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateJobOutput, Unit]
  ): Request[CreateJobOutput, AWSError] = js.native
  
  /**
    * This operation generates a pre-paid UPS shipping label that you will use to ship your device to AWS for processing.
    */
  def getShippingLabel(): Request[GetShippingLabelOutput, AWSError] = js.native
  def getShippingLabel(callback: js.Function2[/* err */ AWSError, /* data */ GetShippingLabelOutput, Unit]): Request[GetShippingLabelOutput, AWSError] = js.native
  /**
    * This operation generates a pre-paid UPS shipping label that you will use to ship your device to AWS for processing.
    */
  def getShippingLabel(params: GetShippingLabelInput): Request[GetShippingLabelOutput, AWSError] = js.native
  def getShippingLabel(
    params: GetShippingLabelInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetShippingLabelOutput, Unit]
  ): Request[GetShippingLabelOutput, AWSError] = js.native
  
  /**
    * This operation returns information about a job, including where the job is in the processing pipeline, the status of the results, and the signature value associated with the job. You can only return information about jobs you own.
    */
  def getStatus(): Request[GetStatusOutput, AWSError] = js.native
  def getStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetStatusOutput, Unit]): Request[GetStatusOutput, AWSError] = js.native
  /**
    * This operation returns information about a job, including where the job is in the processing pipeline, the status of the results, and the signature value associated with the job. You can only return information about jobs you own.
    */
  def getStatus(params: GetStatusInput): Request[GetStatusOutput, AWSError] = js.native
  def getStatus(
    params: GetStatusInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetStatusOutput, Unit]
  ): Request[GetStatusOutput, AWSError] = js.native
  
  /**
    * This operation returns the jobs associated with the requester. AWS Import/Export lists the jobs in reverse chronological order based on the date of creation. For example if Job Test1 was created 2009Dec30 and Test2 was created 2010Feb05, the ListJobs operation would return Test2 followed by Test1.
    */
  def listJobs(): Request[ListJobsOutput, AWSError] = js.native
  def listJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListJobsOutput, Unit]): Request[ListJobsOutput, AWSError] = js.native
  /**
    * This operation returns the jobs associated with the requester. AWS Import/Export lists the jobs in reverse chronological order based on the date of creation. For example if Job Test1 was created 2009Dec30 and Test2 was created 2010Feb05, the ListJobs operation would return Test2 followed by Test1.
    */
  def listJobs(params: ListJobsInput): Request[ListJobsOutput, AWSError] = js.native
  def listJobs(params: ListJobsInput, callback: js.Function2[/* err */ AWSError, /* data */ ListJobsOutput, Unit]): Request[ListJobsOutput, AWSError] = js.native
  
  /**
    * You use this operation to change the parameters specified in the original manifest file by supplying a new manifest file. The manifest file attached to this request replaces the original manifest file. You can only use the operation after a CreateJob request but before the data transfer starts and you can only use it on jobs you own.
    */
  def updateJob(): Request[UpdateJobOutput, AWSError] = js.native
  def updateJob(callback: js.Function2[/* err */ AWSError, /* data */ UpdateJobOutput, Unit]): Request[UpdateJobOutput, AWSError] = js.native
  /**
    * You use this operation to change the parameters specified in the original manifest file by supplying a new manifest file. The manifest file attached to this request replaces the original manifest file. You can only use the operation after a CreateJob request but before the data transfer starts and you can only use it on jobs you own.
    */
  def updateJob(params: UpdateJobInput): Request[UpdateJobOutput, AWSError] = js.native
  def updateJob(
    params: UpdateJobInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateJobOutput, Unit]
  ): Request[UpdateJobOutput, AWSError] = js.native
}
