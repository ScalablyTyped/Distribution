package typings.awsSdk.databrewMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataBrew extends Service {
  
  /**
    * Deletes one or more versions of a recipe at a time.
    */
  def batchDeleteRecipeVersion(): Request[BatchDeleteRecipeVersionResponse, AWSError] = js.native
  def batchDeleteRecipeVersion(callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteRecipeVersionResponse, Unit]): Request[BatchDeleteRecipeVersionResponse, AWSError] = js.native
  /**
    * Deletes one or more versions of a recipe at a time.
    */
  def batchDeleteRecipeVersion(params: BatchDeleteRecipeVersionRequest): Request[BatchDeleteRecipeVersionResponse, AWSError] = js.native
  def batchDeleteRecipeVersion(
    params: BatchDeleteRecipeVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteRecipeVersionResponse, Unit]
  ): Request[BatchDeleteRecipeVersionResponse, AWSError] = js.native
  
  @JSName("config")
  var config_DataBrew: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Creates a new AWS Glue DataBrew dataset for this AWS account.
    */
  def createDataset(): Request[CreateDatasetResponse, AWSError] = js.native
  def createDataset(callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetResponse, Unit]): Request[CreateDatasetResponse, AWSError] = js.native
  /**
    * Creates a new AWS Glue DataBrew dataset for this AWS account.
    */
  def createDataset(params: CreateDatasetRequest): Request[CreateDatasetResponse, AWSError] = js.native
  def createDataset(
    params: CreateDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetResponse, Unit]
  ): Request[CreateDatasetResponse, AWSError] = js.native
  
  /**
    * Creates a new job to profile an AWS Glue DataBrew dataset that exists in the current AWS account.
    */
  def createProfileJob(): Request[CreateProfileJobResponse, AWSError] = js.native
  def createProfileJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateProfileJobResponse, Unit]): Request[CreateProfileJobResponse, AWSError] = js.native
  /**
    * Creates a new job to profile an AWS Glue DataBrew dataset that exists in the current AWS account.
    */
  def createProfileJob(params: CreateProfileJobRequest): Request[CreateProfileJobResponse, AWSError] = js.native
  def createProfileJob(
    params: CreateProfileJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProfileJobResponse, Unit]
  ): Request[CreateProfileJobResponse, AWSError] = js.native
  
  /**
    * Creates a new AWS Glue DataBrew project in the current AWS account.
    */
  def createProject(): Request[CreateProjectResponse, AWSError] = js.native
  def createProject(callback: js.Function2[/* err */ AWSError, /* data */ CreateProjectResponse, Unit]): Request[CreateProjectResponse, AWSError] = js.native
  /**
    * Creates a new AWS Glue DataBrew project in the current AWS account.
    */
  def createProject(params: CreateProjectRequest): Request[CreateProjectResponse, AWSError] = js.native
  def createProject(
    params: CreateProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProjectResponse, Unit]
  ): Request[CreateProjectResponse, AWSError] = js.native
  
  /**
    * Creates a new AWS Glue DataBrew recipe for the current AWS account.
    */
  def createRecipe(): Request[CreateRecipeResponse, AWSError] = js.native
  def createRecipe(callback: js.Function2[/* err */ AWSError, /* data */ CreateRecipeResponse, Unit]): Request[CreateRecipeResponse, AWSError] = js.native
  /**
    * Creates a new AWS Glue DataBrew recipe for the current AWS account.
    */
  def createRecipe(params: CreateRecipeRequest): Request[CreateRecipeResponse, AWSError] = js.native
  def createRecipe(
    params: CreateRecipeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRecipeResponse, Unit]
  ): Request[CreateRecipeResponse, AWSError] = js.native
  
  /**
    * Creates a new job for an existing AWS Glue DataBrew recipe in the current AWS account. You can create a standalone job using either a project, or a combination of a recipe and a dataset.
    */
  def createRecipeJob(): Request[CreateRecipeJobResponse, AWSError] = js.native
  def createRecipeJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateRecipeJobResponse, Unit]): Request[CreateRecipeJobResponse, AWSError] = js.native
  /**
    * Creates a new job for an existing AWS Glue DataBrew recipe in the current AWS account. You can create a standalone job using either a project, or a combination of a recipe and a dataset.
    */
  def createRecipeJob(params: CreateRecipeJobRequest): Request[CreateRecipeJobResponse, AWSError] = js.native
  def createRecipeJob(
    params: CreateRecipeJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRecipeJobResponse, Unit]
  ): Request[CreateRecipeJobResponse, AWSError] = js.native
  
  /**
    * Creates a new schedule for one or more AWS Glue DataBrew jobs. Jobs can be run at a specific date and time, or at regular intervals.
    */
  def createSchedule(): Request[CreateScheduleResponse, AWSError] = js.native
  def createSchedule(callback: js.Function2[/* err */ AWSError, /* data */ CreateScheduleResponse, Unit]): Request[CreateScheduleResponse, AWSError] = js.native
  /**
    * Creates a new schedule for one or more AWS Glue DataBrew jobs. Jobs can be run at a specific date and time, or at regular intervals.
    */
  def createSchedule(params: CreateScheduleRequest): Request[CreateScheduleResponse, AWSError] = js.native
  def createSchedule(
    params: CreateScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateScheduleResponse, Unit]
  ): Request[CreateScheduleResponse, AWSError] = js.native
  
  /**
    * Deletes a dataset from AWS Glue DataBrew.
    */
  def deleteDataset(): Request[DeleteDatasetResponse, AWSError] = js.native
  def deleteDataset(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDatasetResponse, Unit]): Request[DeleteDatasetResponse, AWSError] = js.native
  /**
    * Deletes a dataset from AWS Glue DataBrew.
    */
  def deleteDataset(params: DeleteDatasetRequest): Request[DeleteDatasetResponse, AWSError] = js.native
  def deleteDataset(
    params: DeleteDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDatasetResponse, Unit]
  ): Request[DeleteDatasetResponse, AWSError] = js.native
  
  /**
    * Deletes the specified AWS Glue DataBrew job from the current AWS account. The job can be for a recipe or for a profile.
    */
  def deleteJob(): Request[DeleteJobResponse, AWSError] = js.native
  def deleteJob(callback: js.Function2[/* err */ AWSError, /* data */ DeleteJobResponse, Unit]): Request[DeleteJobResponse, AWSError] = js.native
  /**
    * Deletes the specified AWS Glue DataBrew job from the current AWS account. The job can be for a recipe or for a profile.
    */
  def deleteJob(params: DeleteJobRequest): Request[DeleteJobResponse, AWSError] = js.native
  def deleteJob(
    params: DeleteJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteJobResponse, Unit]
  ): Request[DeleteJobResponse, AWSError] = js.native
  
  /**
    * Deletes an existing AWS Glue DataBrew project from the current AWS account.
    */
  def deleteProject(): Request[DeleteProjectResponse, AWSError] = js.native
  def deleteProject(callback: js.Function2[/* err */ AWSError, /* data */ DeleteProjectResponse, Unit]): Request[DeleteProjectResponse, AWSError] = js.native
  /**
    * Deletes an existing AWS Glue DataBrew project from the current AWS account.
    */
  def deleteProject(params: DeleteProjectRequest): Request[DeleteProjectResponse, AWSError] = js.native
  def deleteProject(
    params: DeleteProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteProjectResponse, Unit]
  ): Request[DeleteProjectResponse, AWSError] = js.native
  
  /**
    * Deletes a single version of an AWS Glue DataBrew recipe.
    */
  def deleteRecipeVersion(): Request[DeleteRecipeVersionResponse, AWSError] = js.native
  def deleteRecipeVersion(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRecipeVersionResponse, Unit]): Request[DeleteRecipeVersionResponse, AWSError] = js.native
  /**
    * Deletes a single version of an AWS Glue DataBrew recipe.
    */
  def deleteRecipeVersion(params: DeleteRecipeVersionRequest): Request[DeleteRecipeVersionResponse, AWSError] = js.native
  def deleteRecipeVersion(
    params: DeleteRecipeVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRecipeVersionResponse, Unit]
  ): Request[DeleteRecipeVersionResponse, AWSError] = js.native
  
  /**
    * Deletes the specified AWS Glue DataBrew schedule from the current AWS account.
    */
  def deleteSchedule(): Request[DeleteScheduleResponse, AWSError] = js.native
  def deleteSchedule(callback: js.Function2[/* err */ AWSError, /* data */ DeleteScheduleResponse, Unit]): Request[DeleteScheduleResponse, AWSError] = js.native
  /**
    * Deletes the specified AWS Glue DataBrew schedule from the current AWS account.
    */
  def deleteSchedule(params: DeleteScheduleRequest): Request[DeleteScheduleResponse, AWSError] = js.native
  def deleteSchedule(
    params: DeleteScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteScheduleResponse, Unit]
  ): Request[DeleteScheduleResponse, AWSError] = js.native
  
  /**
    * Returns the definition of a specific AWS Glue DataBrew dataset that is in the current AWS account.
    */
  def describeDataset(): Request[DescribeDatasetResponse, AWSError] = js.native
  def describeDataset(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDatasetResponse, Unit]): Request[DescribeDatasetResponse, AWSError] = js.native
  /**
    * Returns the definition of a specific AWS Glue DataBrew dataset that is in the current AWS account.
    */
  def describeDataset(params: DescribeDatasetRequest): Request[DescribeDatasetResponse, AWSError] = js.native
  def describeDataset(
    params: DescribeDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDatasetResponse, Unit]
  ): Request[DescribeDatasetResponse, AWSError] = js.native
  
  /**
    * Returns the definition of a specific AWS Glue DataBrew job that is in the current AWS account.
    */
  def describeJob(): Request[DescribeJobResponse, AWSError] = js.native
  def describeJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobResponse, Unit]): Request[DescribeJobResponse, AWSError] = js.native
  /**
    * Returns the definition of a specific AWS Glue DataBrew job that is in the current AWS account.
    */
  def describeJob(params: DescribeJobRequest): Request[DescribeJobResponse, AWSError] = js.native
  def describeJob(
    params: DescribeJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobResponse, Unit]
  ): Request[DescribeJobResponse, AWSError] = js.native
  
  /**
    * Returns the definition of a specific AWS Glue DataBrew project that is in the current AWS account.
    */
  def describeProject(): Request[DescribeProjectResponse, AWSError] = js.native
  def describeProject(callback: js.Function2[/* err */ AWSError, /* data */ DescribeProjectResponse, Unit]): Request[DescribeProjectResponse, AWSError] = js.native
  /**
    * Returns the definition of a specific AWS Glue DataBrew project that is in the current AWS account.
    */
  def describeProject(params: DescribeProjectRequest): Request[DescribeProjectResponse, AWSError] = js.native
  def describeProject(
    params: DescribeProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProjectResponse, Unit]
  ): Request[DescribeProjectResponse, AWSError] = js.native
  
  /**
    * Returns the definition of a specific AWS Glue DataBrew recipe that is in the current AWS account.
    */
  def describeRecipe(): Request[DescribeRecipeResponse, AWSError] = js.native
  def describeRecipe(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRecipeResponse, Unit]): Request[DescribeRecipeResponse, AWSError] = js.native
  /**
    * Returns the definition of a specific AWS Glue DataBrew recipe that is in the current AWS account.
    */
  def describeRecipe(params: DescribeRecipeRequest): Request[DescribeRecipeResponse, AWSError] = js.native
  def describeRecipe(
    params: DescribeRecipeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRecipeResponse, Unit]
  ): Request[DescribeRecipeResponse, AWSError] = js.native
  
  /**
    * Returns the definition of a specific AWS Glue DataBrew schedule that is in the current AWS account.
    */
  def describeSchedule(): Request[DescribeScheduleResponse, AWSError] = js.native
  def describeSchedule(callback: js.Function2[/* err */ AWSError, /* data */ DescribeScheduleResponse, Unit]): Request[DescribeScheduleResponse, AWSError] = js.native
  /**
    * Returns the definition of a specific AWS Glue DataBrew schedule that is in the current AWS account.
    */
  def describeSchedule(params: DescribeScheduleRequest): Request[DescribeScheduleResponse, AWSError] = js.native
  def describeSchedule(
    params: DescribeScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeScheduleResponse, Unit]
  ): Request[DescribeScheduleResponse, AWSError] = js.native
  
  /**
    * Lists all of the AWS Glue DataBrew datasets for the current AWS account.
    */
  def listDatasets(): Request[ListDatasetsResponse, AWSError] = js.native
  def listDatasets(callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetsResponse, Unit]): Request[ListDatasetsResponse, AWSError] = js.native
  /**
    * Lists all of the AWS Glue DataBrew datasets for the current AWS account.
    */
  def listDatasets(params: ListDatasetsRequest): Request[ListDatasetsResponse, AWSError] = js.native
  def listDatasets(
    params: ListDatasetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetsResponse, Unit]
  ): Request[ListDatasetsResponse, AWSError] = js.native
  
  /**
    * Lists all of the previous runs of a particular AWS Glue DataBrew job in the current AWS account.
    */
  def listJobRuns(): Request[ListJobRunsResponse, AWSError] = js.native
  def listJobRuns(callback: js.Function2[/* err */ AWSError, /* data */ ListJobRunsResponse, Unit]): Request[ListJobRunsResponse, AWSError] = js.native
  /**
    * Lists all of the previous runs of a particular AWS Glue DataBrew job in the current AWS account.
    */
  def listJobRuns(params: ListJobRunsRequest): Request[ListJobRunsResponse, AWSError] = js.native
  def listJobRuns(
    params: ListJobRunsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListJobRunsResponse, Unit]
  ): Request[ListJobRunsResponse, AWSError] = js.native
  
  /**
    * Lists the AWS Glue DataBrew jobs in the current AWS account.
    */
  def listJobs(): Request[ListJobsResponse, AWSError] = js.native
  def listJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListJobsResponse, Unit]): Request[ListJobsResponse, AWSError] = js.native
  /**
    * Lists the AWS Glue DataBrew jobs in the current AWS account.
    */
  def listJobs(params: ListJobsRequest): Request[ListJobsResponse, AWSError] = js.native
  def listJobs(
    params: ListJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListJobsResponse, Unit]
  ): Request[ListJobsResponse, AWSError] = js.native
  
  /**
    * Lists all of the DataBrew projects in the current AWS account.
    */
  def listProjects(): Request[ListProjectsResponse, AWSError] = js.native
  def listProjects(callback: js.Function2[/* err */ AWSError, /* data */ ListProjectsResponse, Unit]): Request[ListProjectsResponse, AWSError] = js.native
  /**
    * Lists all of the DataBrew projects in the current AWS account.
    */
  def listProjects(params: ListProjectsRequest): Request[ListProjectsResponse, AWSError] = js.native
  def listProjects(
    params: ListProjectsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProjectsResponse, Unit]
  ): Request[ListProjectsResponse, AWSError] = js.native
  
  /**
    * Lists all of the versions of a particular AWS Glue DataBrew recipe in the current AWS account.
    */
  def listRecipeVersions(): Request[ListRecipeVersionsResponse, AWSError] = js.native
  def listRecipeVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListRecipeVersionsResponse, Unit]): Request[ListRecipeVersionsResponse, AWSError] = js.native
  /**
    * Lists all of the versions of a particular AWS Glue DataBrew recipe in the current AWS account.
    */
  def listRecipeVersions(params: ListRecipeVersionsRequest): Request[ListRecipeVersionsResponse, AWSError] = js.native
  def listRecipeVersions(
    params: ListRecipeVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRecipeVersionsResponse, Unit]
  ): Request[ListRecipeVersionsResponse, AWSError] = js.native
  
  /**
    * Lists all of the AWS Glue DataBrew recipes in the current AWS account.
    */
  def listRecipes(): Request[ListRecipesResponse, AWSError] = js.native
  def listRecipes(callback: js.Function2[/* err */ AWSError, /* data */ ListRecipesResponse, Unit]): Request[ListRecipesResponse, AWSError] = js.native
  /**
    * Lists all of the AWS Glue DataBrew recipes in the current AWS account.
    */
  def listRecipes(params: ListRecipesRequest): Request[ListRecipesResponse, AWSError] = js.native
  def listRecipes(
    params: ListRecipesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRecipesResponse, Unit]
  ): Request[ListRecipesResponse, AWSError] = js.native
  
  /**
    * Lists the AWS Glue DataBrew schedules in the current AWS account.
    */
  def listSchedules(): Request[ListSchedulesResponse, AWSError] = js.native
  def listSchedules(callback: js.Function2[/* err */ AWSError, /* data */ ListSchedulesResponse, Unit]): Request[ListSchedulesResponse, AWSError] = js.native
  /**
    * Lists the AWS Glue DataBrew schedules in the current AWS account.
    */
  def listSchedules(params: ListSchedulesRequest): Request[ListSchedulesResponse, AWSError] = js.native
  def listSchedules(
    params: ListSchedulesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSchedulesResponse, Unit]
  ): Request[ListSchedulesResponse, AWSError] = js.native
  
  /**
    * Lists all the tags for an AWS Glue DataBrew resource. 
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists all the tags for an AWS Glue DataBrew resource. 
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Publishes a new major version of an AWS Glue DataBrew recipe that exists in the current AWS account.
    */
  def publishRecipe(): Request[PublishRecipeResponse, AWSError] = js.native
  def publishRecipe(callback: js.Function2[/* err */ AWSError, /* data */ PublishRecipeResponse, Unit]): Request[PublishRecipeResponse, AWSError] = js.native
  /**
    * Publishes a new major version of an AWS Glue DataBrew recipe that exists in the current AWS account.
    */
  def publishRecipe(params: PublishRecipeRequest): Request[PublishRecipeResponse, AWSError] = js.native
  def publishRecipe(
    params: PublishRecipeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PublishRecipeResponse, Unit]
  ): Request[PublishRecipeResponse, AWSError] = js.native
  
  /**
    * Performs a recipe step within an interactive AWS Glue DataBrew session that's currently open.
    */
  def sendProjectSessionAction(): Request[SendProjectSessionActionResponse, AWSError] = js.native
  def sendProjectSessionAction(callback: js.Function2[/* err */ AWSError, /* data */ SendProjectSessionActionResponse, Unit]): Request[SendProjectSessionActionResponse, AWSError] = js.native
  /**
    * Performs a recipe step within an interactive AWS Glue DataBrew session that's currently open.
    */
  def sendProjectSessionAction(params: SendProjectSessionActionRequest): Request[SendProjectSessionActionResponse, AWSError] = js.native
  def sendProjectSessionAction(
    params: SendProjectSessionActionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendProjectSessionActionResponse, Unit]
  ): Request[SendProjectSessionActionResponse, AWSError] = js.native
  
  /**
    * Runs an AWS Glue DataBrew job that exists in the current AWS account.
    */
  def startJobRun(): Request[StartJobRunResponse, AWSError] = js.native
  def startJobRun(callback: js.Function2[/* err */ AWSError, /* data */ StartJobRunResponse, Unit]): Request[StartJobRunResponse, AWSError] = js.native
  /**
    * Runs an AWS Glue DataBrew job that exists in the current AWS account.
    */
  def startJobRun(params: StartJobRunRequest): Request[StartJobRunResponse, AWSError] = js.native
  def startJobRun(
    params: StartJobRunRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartJobRunResponse, Unit]
  ): Request[StartJobRunResponse, AWSError] = js.native
  
  /**
    * Creates an interactive session, enabling you to manipulate an AWS Glue DataBrew project.
    */
  def startProjectSession(): Request[StartProjectSessionResponse, AWSError] = js.native
  def startProjectSession(callback: js.Function2[/* err */ AWSError, /* data */ StartProjectSessionResponse, Unit]): Request[StartProjectSessionResponse, AWSError] = js.native
  /**
    * Creates an interactive session, enabling you to manipulate an AWS Glue DataBrew project.
    */
  def startProjectSession(params: StartProjectSessionRequest): Request[StartProjectSessionResponse, AWSError] = js.native
  def startProjectSession(
    params: StartProjectSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartProjectSessionResponse, Unit]
  ): Request[StartProjectSessionResponse, AWSError] = js.native
  
  /**
    * Stops the specified job from running in the current AWS account.
    */
  def stopJobRun(): Request[StopJobRunResponse, AWSError] = js.native
  def stopJobRun(callback: js.Function2[/* err */ AWSError, /* data */ StopJobRunResponse, Unit]): Request[StopJobRunResponse, AWSError] = js.native
  /**
    * Stops the specified job from running in the current AWS account.
    */
  def stopJobRun(params: StopJobRunRequest): Request[StopJobRunResponse, AWSError] = js.native
  def stopJobRun(
    params: StopJobRunRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopJobRunResponse, Unit]
  ): Request[StopJobRunResponse, AWSError] = js.native
  
  /**
    * Adds metadata tags to an AWS Glue DataBrew resource, such as a dataset, job, project, or recipe.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds metadata tags to an AWS Glue DataBrew resource, such as a dataset, job, project, or recipe.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes metadata tags from an AWS Glue DataBrew resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes metadata tags from an AWS Glue DataBrew resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Modifies the definition of an existing AWS Glue DataBrew dataset in the current AWS account.
    */
  def updateDataset(): Request[UpdateDatasetResponse, AWSError] = js.native
  def updateDataset(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDatasetResponse, Unit]): Request[UpdateDatasetResponse, AWSError] = js.native
  /**
    * Modifies the definition of an existing AWS Glue DataBrew dataset in the current AWS account.
    */
  def updateDataset(params: UpdateDatasetRequest): Request[UpdateDatasetResponse, AWSError] = js.native
  def updateDataset(
    params: UpdateDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDatasetResponse, Unit]
  ): Request[UpdateDatasetResponse, AWSError] = js.native
  
  /**
    * Modifies the definition of an existing AWS Glue DataBrew job in the current AWS account.
    */
  def updateProfileJob(): Request[UpdateProfileJobResponse, AWSError] = js.native
  def updateProfileJob(callback: js.Function2[/* err */ AWSError, /* data */ UpdateProfileJobResponse, Unit]): Request[UpdateProfileJobResponse, AWSError] = js.native
  /**
    * Modifies the definition of an existing AWS Glue DataBrew job in the current AWS account.
    */
  def updateProfileJob(params: UpdateProfileJobRequest): Request[UpdateProfileJobResponse, AWSError] = js.native
  def updateProfileJob(
    params: UpdateProfileJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateProfileJobResponse, Unit]
  ): Request[UpdateProfileJobResponse, AWSError] = js.native
  
  /**
    * Modifies the definition of an existing AWS Glue DataBrew project in the current AWS account.
    */
  def updateProject(): Request[UpdateProjectResponse, AWSError] = js.native
  def updateProject(callback: js.Function2[/* err */ AWSError, /* data */ UpdateProjectResponse, Unit]): Request[UpdateProjectResponse, AWSError] = js.native
  /**
    * Modifies the definition of an existing AWS Glue DataBrew project in the current AWS account.
    */
  def updateProject(params: UpdateProjectRequest): Request[UpdateProjectResponse, AWSError] = js.native
  def updateProject(
    params: UpdateProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateProjectResponse, Unit]
  ): Request[UpdateProjectResponse, AWSError] = js.native
  
  /**
    * Modifies the definition of the latest working version of an AWS Glue DataBrew recipe in the current AWS account.
    */
  def updateRecipe(): Request[UpdateRecipeResponse, AWSError] = js.native
  def updateRecipe(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRecipeResponse, Unit]): Request[UpdateRecipeResponse, AWSError] = js.native
  /**
    * Modifies the definition of the latest working version of an AWS Glue DataBrew recipe in the current AWS account.
    */
  def updateRecipe(params: UpdateRecipeRequest): Request[UpdateRecipeResponse, AWSError] = js.native
  def updateRecipe(
    params: UpdateRecipeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRecipeResponse, Unit]
  ): Request[UpdateRecipeResponse, AWSError] = js.native
  
  /**
    * Modifies the definition of an existing AWS Glue DataBrew recipe job in the current AWS account.
    */
  def updateRecipeJob(): Request[UpdateRecipeJobResponse, AWSError] = js.native
  def updateRecipeJob(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRecipeJobResponse, Unit]): Request[UpdateRecipeJobResponse, AWSError] = js.native
  /**
    * Modifies the definition of an existing AWS Glue DataBrew recipe job in the current AWS account.
    */
  def updateRecipeJob(params: UpdateRecipeJobRequest): Request[UpdateRecipeJobResponse, AWSError] = js.native
  def updateRecipeJob(
    params: UpdateRecipeJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRecipeJobResponse, Unit]
  ): Request[UpdateRecipeJobResponse, AWSError] = js.native
  
  /**
    * Modifies the definition of an existing AWS Glue DataBrew schedule in the current AWS account.
    */
  def updateSchedule(): Request[UpdateScheduleResponse, AWSError] = js.native
  def updateSchedule(callback: js.Function2[/* err */ AWSError, /* data */ UpdateScheduleResponse, Unit]): Request[UpdateScheduleResponse, AWSError] = js.native
  /**
    * Modifies the definition of an existing AWS Glue DataBrew schedule in the current AWS account.
    */
  def updateSchedule(params: UpdateScheduleRequest): Request[UpdateScheduleResponse, AWSError] = js.native
  def updateSchedule(
    params: UpdateScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateScheduleResponse, Unit]
  ): Request[UpdateScheduleResponse, AWSError] = js.native
}
