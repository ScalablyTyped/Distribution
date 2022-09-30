package typings.awsSdk.emrserverlessMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EMRServerless extends Service {
  
  /**
    * Cancels a job run.
    */
  def cancelJobRun(): Request[CancelJobRunResponse, AWSError] = js.native
  def cancelJobRun(callback: js.Function2[/* err */ AWSError, /* data */ CancelJobRunResponse, Unit]): Request[CancelJobRunResponse, AWSError] = js.native
  /**
    * Cancels a job run.
    */
  def cancelJobRun(params: CancelJobRunRequest): Request[CancelJobRunResponse, AWSError] = js.native
  def cancelJobRun(
    params: CancelJobRunRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelJobRunResponse, Unit]
  ): Request[CancelJobRunResponse, AWSError] = js.native
  
  @JSName("config")
  var config_EMRServerless: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an application.
    */
  def createApplication(): Request[CreateApplicationResponse, AWSError] = js.native
  def createApplication(callback: js.Function2[/* err */ AWSError, /* data */ CreateApplicationResponse, Unit]): Request[CreateApplicationResponse, AWSError] = js.native
  /**
    * Creates an application.
    */
  def createApplication(params: CreateApplicationRequest): Request[CreateApplicationResponse, AWSError] = js.native
  def createApplication(
    params: CreateApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateApplicationResponse, Unit]
  ): Request[CreateApplicationResponse, AWSError] = js.native
  
  /**
    * Deletes an application. An application has to be in a stopped or created state in order to be deleted.
    */
  def deleteApplication(): Request[DeleteApplicationResponse, AWSError] = js.native
  def deleteApplication(callback: js.Function2[/* err */ AWSError, /* data */ DeleteApplicationResponse, Unit]): Request[DeleteApplicationResponse, AWSError] = js.native
  /**
    * Deletes an application. An application has to be in a stopped or created state in order to be deleted.
    */
  def deleteApplication(params: DeleteApplicationRequest): Request[DeleteApplicationResponse, AWSError] = js.native
  def deleteApplication(
    params: DeleteApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteApplicationResponse, Unit]
  ): Request[DeleteApplicationResponse, AWSError] = js.native
  
  /**
    * Displays detailed information about a specified application.
    */
  def getApplication(): Request[GetApplicationResponse, AWSError] = js.native
  def getApplication(callback: js.Function2[/* err */ AWSError, /* data */ GetApplicationResponse, Unit]): Request[GetApplicationResponse, AWSError] = js.native
  /**
    * Displays detailed information about a specified application.
    */
  def getApplication(params: GetApplicationRequest): Request[GetApplicationResponse, AWSError] = js.native
  def getApplication(
    params: GetApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetApplicationResponse, Unit]
  ): Request[GetApplicationResponse, AWSError] = js.native
  
  /**
    * Returns a URL to access the job run dashboard.
    */
  def getDashboardForJobRun(): Request[GetDashboardForJobRunResponse, AWSError] = js.native
  def getDashboardForJobRun(callback: js.Function2[/* err */ AWSError, /* data */ GetDashboardForJobRunResponse, Unit]): Request[GetDashboardForJobRunResponse, AWSError] = js.native
  /**
    * Returns a URL to access the job run dashboard.
    */
  def getDashboardForJobRun(params: GetDashboardForJobRunRequest): Request[GetDashboardForJobRunResponse, AWSError] = js.native
  def getDashboardForJobRun(
    params: GetDashboardForJobRunRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDashboardForJobRunResponse, Unit]
  ): Request[GetDashboardForJobRunResponse, AWSError] = js.native
  
  /**
    * Displays detailed information about a job run.
    */
  def getJobRun(): Request[GetJobRunResponse, AWSError] = js.native
  def getJobRun(callback: js.Function2[/* err */ AWSError, /* data */ GetJobRunResponse, Unit]): Request[GetJobRunResponse, AWSError] = js.native
  /**
    * Displays detailed information about a job run.
    */
  def getJobRun(params: GetJobRunRequest): Request[GetJobRunResponse, AWSError] = js.native
  def getJobRun(
    params: GetJobRunRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetJobRunResponse, Unit]
  ): Request[GetJobRunResponse, AWSError] = js.native
  
  /**
    * Lists applications based on a set of parameters.
    */
  def listApplications(): Request[ListApplicationsResponse, AWSError] = js.native
  def listApplications(callback: js.Function2[/* err */ AWSError, /* data */ ListApplicationsResponse, Unit]): Request[ListApplicationsResponse, AWSError] = js.native
  /**
    * Lists applications based on a set of parameters.
    */
  def listApplications(params: ListApplicationsRequest): Request[ListApplicationsResponse, AWSError] = js.native
  def listApplications(
    params: ListApplicationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListApplicationsResponse, Unit]
  ): Request[ListApplicationsResponse, AWSError] = js.native
  
  /**
    * Lists job runs based on a set of parameters.
    */
  def listJobRuns(): Request[ListJobRunsResponse, AWSError] = js.native
  def listJobRuns(callback: js.Function2[/* err */ AWSError, /* data */ ListJobRunsResponse, Unit]): Request[ListJobRunsResponse, AWSError] = js.native
  /**
    * Lists job runs based on a set of parameters.
    */
  def listJobRuns(params: ListJobRunsRequest): Request[ListJobRunsResponse, AWSError] = js.native
  def listJobRuns(
    params: ListJobRunsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListJobRunsResponse, Unit]
  ): Request[ListJobRunsResponse, AWSError] = js.native
  
  /**
    * Lists the tags assigned to the resources.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags assigned to the resources.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Starts a specified application and initializes initial capacity if configured.
    */
  def startApplication(): Request[StartApplicationResponse, AWSError] = js.native
  def startApplication(callback: js.Function2[/* err */ AWSError, /* data */ StartApplicationResponse, Unit]): Request[StartApplicationResponse, AWSError] = js.native
  /**
    * Starts a specified application and initializes initial capacity if configured.
    */
  def startApplication(params: StartApplicationRequest): Request[StartApplicationResponse, AWSError] = js.native
  def startApplication(
    params: StartApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartApplicationResponse, Unit]
  ): Request[StartApplicationResponse, AWSError] = js.native
  
  /**
    * Starts a job run.
    */
  def startJobRun(): Request[StartJobRunResponse, AWSError] = js.native
  def startJobRun(callback: js.Function2[/* err */ AWSError, /* data */ StartJobRunResponse, Unit]): Request[StartJobRunResponse, AWSError] = js.native
  /**
    * Starts a job run.
    */
  def startJobRun(params: StartJobRunRequest): Request[StartJobRunResponse, AWSError] = js.native
  def startJobRun(
    params: StartJobRunRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartJobRunResponse, Unit]
  ): Request[StartJobRunResponse, AWSError] = js.native
  
  /**
    * Stops a specified application and releases initial capacity if configured. All scheduled and running jobs must be completed or cancelled before stopping an application.
    */
  def stopApplication(): Request[StopApplicationResponse, AWSError] = js.native
  def stopApplication(callback: js.Function2[/* err */ AWSError, /* data */ StopApplicationResponse, Unit]): Request[StopApplicationResponse, AWSError] = js.native
  /**
    * Stops a specified application and releases initial capacity if configured. All scheduled and running jobs must be completed or cancelled before stopping an application.
    */
  def stopApplication(params: StopApplicationRequest): Request[StopApplicationResponse, AWSError] = js.native
  def stopApplication(
    params: StopApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopApplicationResponse, Unit]
  ): Request[StopApplicationResponse, AWSError] = js.native
  
  /**
    * Assigns tags to resources. A tag is a label that you assign to an AWS resource. Each tag consists of a key and an optional value, both of which you define. Tags enable you to categorize your AWS resources by attributes such as purpose, owner, or environment. When you have many resources of the same type, you can quickly identify a specific resource based on the tags you've assigned to it. 
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Assigns tags to resources. A tag is a label that you assign to an AWS resource. Each tag consists of a key and an optional value, both of which you define. Tags enable you to categorize your AWS resources by attributes such as purpose, owner, or environment. When you have many resources of the same type, you can quickly identify a specific resource based on the tags you've assigned to it. 
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes tags from resources.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes tags from resources.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates a specified application. An application has to be in a stopped or created state in order to be updated.
    */
  def updateApplication(): Request[UpdateApplicationResponse, AWSError] = js.native
  def updateApplication(callback: js.Function2[/* err */ AWSError, /* data */ UpdateApplicationResponse, Unit]): Request[UpdateApplicationResponse, AWSError] = js.native
  /**
    * Updates a specified application. An application has to be in a stopped or created state in order to be updated.
    */
  def updateApplication(params: UpdateApplicationRequest): Request[UpdateApplicationResponse, AWSError] = js.native
  def updateApplication(
    params: UpdateApplicationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateApplicationResponse, Unit]
  ): Request[UpdateApplicationResponse, AWSError] = js.native
}
