package typings.awsSdk.databrewMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataBrew extends Service {
  
  /**
    * Deletes one or more versions of a recipe at a time. The entire request will be rejected if:   The recipe does not exist.   There is an invalid version identifier in the list of versions.   The version list is empty.   The version list size exceeds 50.   The version list contains duplicate entries.   The request will complete successfully, but with partial failures, if:   A version does not exist.   A version is being used by a job.   You specify LATEST_WORKING, but it's being used by a project.   The version fails to be deleted.   The LATEST_WORKING version will only be deleted if the recipe has no other versions. If you try to delete LATEST_WORKING while other versions exist (or if they can't be deleted), then LATEST_WORKING will be listed as partial failure in the response.
    */
  def batchDeleteRecipeVersion(): Request[BatchDeleteRecipeVersionResponse, AWSError] = js.native
  def batchDeleteRecipeVersion(callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteRecipeVersionResponse, Unit]): Request[BatchDeleteRecipeVersionResponse, AWSError] = js.native
  /**
    * Deletes one or more versions of a recipe at a time. The entire request will be rejected if:   The recipe does not exist.   There is an invalid version identifier in the list of versions.   The version list is empty.   The version list size exceeds 50.   The version list contains duplicate entries.   The request will complete successfully, but with partial failures, if:   A version does not exist.   A version is being used by a job.   You specify LATEST_WORKING, but it's being used by a project.   The version fails to be deleted.   The LATEST_WORKING version will only be deleted if the recipe has no other versions. If you try to delete LATEST_WORKING while other versions exist (or if they can't be deleted), then LATEST_WORKING will be listed as partial failure in the response.
    */
  def batchDeleteRecipeVersion(params: BatchDeleteRecipeVersionRequest): Request[BatchDeleteRecipeVersionResponse, AWSError] = js.native
  def batchDeleteRecipeVersion(
    params: BatchDeleteRecipeVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteRecipeVersionResponse, Unit]
  ): Request[BatchDeleteRecipeVersionResponse, AWSError] = js.native
  
  @JSName("config")
  var config_DataBrew: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a new DataBrew dataset.
    */
  def createDataset(): Request[CreateDatasetResponse, AWSError] = js.native
  def createDataset(callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetResponse, Unit]): Request[CreateDatasetResponse, AWSError] = js.native
  /**
    * Creates a new DataBrew dataset.
    */
  def createDataset(params: CreateDatasetRequest): Request[CreateDatasetResponse, AWSError] = js.native
  def createDataset(
    params: CreateDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetResponse, Unit]
  ): Request[CreateDatasetResponse, AWSError] = js.native
  
  /**
    * Creates a new job to analyze a dataset and create its data profile.
    */
  def createProfileJob(): Request[CreateProfileJobResponse, AWSError] = js.native
  def createProfileJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateProfileJobResponse, Unit]): Request[CreateProfileJobResponse, AWSError] = js.native
  /**
    * Creates a new job to analyze a dataset and create its data profile.
    */
  def createProfileJob(params: CreateProfileJobRequest): Request[CreateProfileJobResponse, AWSError] = js.native
  def createProfileJob(
    params: CreateProfileJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProfileJobResponse, Unit]
  ): Request[CreateProfileJobResponse, AWSError] = js.native
  
  /**
    * Creates a new DataBrew project.
    */
  def createProject(): Request[CreateProjectResponse, AWSError] = js.native
  def createProject(callback: js.Function2[/* err */ AWSError, /* data */ CreateProjectResponse, Unit]): Request[CreateProjectResponse, AWSError] = js.native
  /**
    * Creates a new DataBrew project.
    */
  def createProject(params: CreateProjectRequest): Request[CreateProjectResponse, AWSError] = js.native
  def createProject(
    params: CreateProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProjectResponse, Unit]
  ): Request[CreateProjectResponse, AWSError] = js.native
  
  /**
    * Creates a new DataBrew recipe.
    */
  def createRecipe(): Request[CreateRecipeResponse, AWSError] = js.native
  def createRecipe(callback: js.Function2[/* err */ AWSError, /* data */ CreateRecipeResponse, Unit]): Request[CreateRecipeResponse, AWSError] = js.native
  /**
    * Creates a new DataBrew recipe.
    */
  def createRecipe(params: CreateRecipeRequest): Request[CreateRecipeResponse, AWSError] = js.native
  def createRecipe(
    params: CreateRecipeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRecipeResponse, Unit]
  ): Request[CreateRecipeResponse, AWSError] = js.native
  
  /**
    * Creates a new job to transform input data, using steps defined in an existing Glue DataBrew recipe
    */
  def createRecipeJob(): Request[CreateRecipeJobResponse, AWSError] = js.native
  def createRecipeJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateRecipeJobResponse, Unit]): Request[CreateRecipeJobResponse, AWSError] = js.native
  /**
    * Creates a new job to transform input data, using steps defined in an existing Glue DataBrew recipe
    */
  def createRecipeJob(params: CreateRecipeJobRequest): Request[CreateRecipeJobResponse, AWSError] = js.native
  def createRecipeJob(
    params: CreateRecipeJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRecipeJobResponse, Unit]
  ): Request[CreateRecipeJobResponse, AWSError] = js.native
  
  /**
    * Creates a new ruleset that can be used in a profile job to validate the data quality of a dataset.
    */
  def createRuleset(): Request[CreateRulesetResponse, AWSError] = js.native
  def createRuleset(callback: js.Function2[/* err */ AWSError, /* data */ CreateRulesetResponse, Unit]): Request[CreateRulesetResponse, AWSError] = js.native
  /**
    * Creates a new ruleset that can be used in a profile job to validate the data quality of a dataset.
    */
  def createRuleset(params: CreateRulesetRequest): Request[CreateRulesetResponse, AWSError] = js.native
  def createRuleset(
    params: CreateRulesetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRulesetResponse, Unit]
  ): Request[CreateRulesetResponse, AWSError] = js.native
  
  /**
    * Creates a new schedule for one or more DataBrew jobs. Jobs can be run at a specific date and time, or at regular intervals.
    */
  def createSchedule(): Request[CreateScheduleResponse, AWSError] = js.native
  def createSchedule(callback: js.Function2[/* err */ AWSError, /* data */ CreateScheduleResponse, Unit]): Request[CreateScheduleResponse, AWSError] = js.native
  /**
    * Creates a new schedule for one or more DataBrew jobs. Jobs can be run at a specific date and time, or at regular intervals.
    */
  def createSchedule(params: CreateScheduleRequest): Request[CreateScheduleResponse, AWSError] = js.native
  def createSchedule(
    params: CreateScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateScheduleResponse, Unit]
  ): Request[CreateScheduleResponse, AWSError] = js.native
  
  /**
    * Deletes a dataset from DataBrew.
    */
  def deleteDataset(): Request[DeleteDatasetResponse, AWSError] = js.native
  def deleteDataset(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDatasetResponse, Unit]): Request[DeleteDatasetResponse, AWSError] = js.native
  /**
    * Deletes a dataset from DataBrew.
    */
  def deleteDataset(params: DeleteDatasetRequest): Request[DeleteDatasetResponse, AWSError] = js.native
  def deleteDataset(
    params: DeleteDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDatasetResponse, Unit]
  ): Request[DeleteDatasetResponse, AWSError] = js.native
  
  /**
    * Deletes the specified DataBrew job.
    */
  def deleteJob(): Request[DeleteJobResponse, AWSError] = js.native
  def deleteJob(callback: js.Function2[/* err */ AWSError, /* data */ DeleteJobResponse, Unit]): Request[DeleteJobResponse, AWSError] = js.native
  /**
    * Deletes the specified DataBrew job.
    */
  def deleteJob(params: DeleteJobRequest): Request[DeleteJobResponse, AWSError] = js.native
  def deleteJob(
    params: DeleteJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteJobResponse, Unit]
  ): Request[DeleteJobResponse, AWSError] = js.native
  
  /**
    * Deletes an existing DataBrew project.
    */
  def deleteProject(): Request[DeleteProjectResponse, AWSError] = js.native
  def deleteProject(callback: js.Function2[/* err */ AWSError, /* data */ DeleteProjectResponse, Unit]): Request[DeleteProjectResponse, AWSError] = js.native
  /**
    * Deletes an existing DataBrew project.
    */
  def deleteProject(params: DeleteProjectRequest): Request[DeleteProjectResponse, AWSError] = js.native
  def deleteProject(
    params: DeleteProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteProjectResponse, Unit]
  ): Request[DeleteProjectResponse, AWSError] = js.native
  
  /**
    * Deletes a single version of a DataBrew recipe.
    */
  def deleteRecipeVersion(): Request[DeleteRecipeVersionResponse, AWSError] = js.native
  def deleteRecipeVersion(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRecipeVersionResponse, Unit]): Request[DeleteRecipeVersionResponse, AWSError] = js.native
  /**
    * Deletes a single version of a DataBrew recipe.
    */
  def deleteRecipeVersion(params: DeleteRecipeVersionRequest): Request[DeleteRecipeVersionResponse, AWSError] = js.native
  def deleteRecipeVersion(
    params: DeleteRecipeVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRecipeVersionResponse, Unit]
  ): Request[DeleteRecipeVersionResponse, AWSError] = js.native
  
  /**
    * Deletes a ruleset.
    */
  def deleteRuleset(): Request[DeleteRulesetResponse, AWSError] = js.native
  def deleteRuleset(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRulesetResponse, Unit]): Request[DeleteRulesetResponse, AWSError] = js.native
  /**
    * Deletes a ruleset.
    */
  def deleteRuleset(params: DeleteRulesetRequest): Request[DeleteRulesetResponse, AWSError] = js.native
  def deleteRuleset(
    params: DeleteRulesetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRulesetResponse, Unit]
  ): Request[DeleteRulesetResponse, AWSError] = js.native
  
  /**
    * Deletes the specified DataBrew schedule.
    */
  def deleteSchedule(): Request[DeleteScheduleResponse, AWSError] = js.native
  def deleteSchedule(callback: js.Function2[/* err */ AWSError, /* data */ DeleteScheduleResponse, Unit]): Request[DeleteScheduleResponse, AWSError] = js.native
  /**
    * Deletes the specified DataBrew schedule.
    */
  def deleteSchedule(params: DeleteScheduleRequest): Request[DeleteScheduleResponse, AWSError] = js.native
  def deleteSchedule(
    params: DeleteScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteScheduleResponse, Unit]
  ): Request[DeleteScheduleResponse, AWSError] = js.native
  
  /**
    * Returns the definition of a specific DataBrew dataset.
    */
  def describeDataset(): Request[DescribeDatasetResponse, AWSError] = js.native
  def describeDataset(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDatasetResponse, Unit]): Request[DescribeDatasetResponse, AWSError] = js.native
  /**
    * Returns the definition of a specific DataBrew dataset.
    */
  def describeDataset(params: DescribeDatasetRequest): Request[DescribeDatasetResponse, AWSError] = js.native
  def describeDataset(
    params: DescribeDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDatasetResponse, Unit]
  ): Request[DescribeDatasetResponse, AWSError] = js.native
  
  /**
    * Returns the definition of a specific DataBrew job.
    */
  def describeJob(): Request[DescribeJobResponse, AWSError] = js.native
  def describeJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobResponse, Unit]): Request[DescribeJobResponse, AWSError] = js.native
  /**
    * Returns the definition of a specific DataBrew job.
    */
  def describeJob(params: DescribeJobRequest): Request[DescribeJobResponse, AWSError] = js.native
  def describeJob(
    params: DescribeJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobResponse, Unit]
  ): Request[DescribeJobResponse, AWSError] = js.native
  
  /**
    * Represents one run of a DataBrew job.
    */
  def describeJobRun(): Request[DescribeJobRunResponse, AWSError] = js.native
  def describeJobRun(callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobRunResponse, Unit]): Request[DescribeJobRunResponse, AWSError] = js.native
  /**
    * Represents one run of a DataBrew job.
    */
  def describeJobRun(params: DescribeJobRunRequest): Request[DescribeJobRunResponse, AWSError] = js.native
  def describeJobRun(
    params: DescribeJobRunRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobRunResponse, Unit]
  ): Request[DescribeJobRunResponse, AWSError] = js.native
  
  /**
    * Returns the definition of a specific DataBrew project.
    */
  def describeProject(): Request[DescribeProjectResponse, AWSError] = js.native
  def describeProject(callback: js.Function2[/* err */ AWSError, /* data */ DescribeProjectResponse, Unit]): Request[DescribeProjectResponse, AWSError] = js.native
  /**
    * Returns the definition of a specific DataBrew project.
    */
  def describeProject(params: DescribeProjectRequest): Request[DescribeProjectResponse, AWSError] = js.native
  def describeProject(
    params: DescribeProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProjectResponse, Unit]
  ): Request[DescribeProjectResponse, AWSError] = js.native
  
  /**
    * Returns the definition of a specific DataBrew recipe corresponding to a particular version.
    */
  def describeRecipe(): Request[DescribeRecipeResponse, AWSError] = js.native
  def describeRecipe(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRecipeResponse, Unit]): Request[DescribeRecipeResponse, AWSError] = js.native
  /**
    * Returns the definition of a specific DataBrew recipe corresponding to a particular version.
    */
  def describeRecipe(params: DescribeRecipeRequest): Request[DescribeRecipeResponse, AWSError] = js.native
  def describeRecipe(
    params: DescribeRecipeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRecipeResponse, Unit]
  ): Request[DescribeRecipeResponse, AWSError] = js.native
  
  /**
    * Retrieves detailed information about the ruleset.
    */
  def describeRuleset(): Request[DescribeRulesetResponse, AWSError] = js.native
  def describeRuleset(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRulesetResponse, Unit]): Request[DescribeRulesetResponse, AWSError] = js.native
  /**
    * Retrieves detailed information about the ruleset.
    */
  def describeRuleset(params: DescribeRulesetRequest): Request[DescribeRulesetResponse, AWSError] = js.native
  def describeRuleset(
    params: DescribeRulesetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRulesetResponse, Unit]
  ): Request[DescribeRulesetResponse, AWSError] = js.native
  
  /**
    * Returns the definition of a specific DataBrew schedule.
    */
  def describeSchedule(): Request[DescribeScheduleResponse, AWSError] = js.native
  def describeSchedule(callback: js.Function2[/* err */ AWSError, /* data */ DescribeScheduleResponse, Unit]): Request[DescribeScheduleResponse, AWSError] = js.native
  /**
    * Returns the definition of a specific DataBrew schedule.
    */
  def describeSchedule(params: DescribeScheduleRequest): Request[DescribeScheduleResponse, AWSError] = js.native
  def describeSchedule(
    params: DescribeScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeScheduleResponse, Unit]
  ): Request[DescribeScheduleResponse, AWSError] = js.native
  
  /**
    * Lists all of the DataBrew datasets.
    */
  def listDatasets(): Request[ListDatasetsResponse, AWSError] = js.native
  def listDatasets(callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetsResponse, Unit]): Request[ListDatasetsResponse, AWSError] = js.native
  /**
    * Lists all of the DataBrew datasets.
    */
  def listDatasets(params: ListDatasetsRequest): Request[ListDatasetsResponse, AWSError] = js.native
  def listDatasets(
    params: ListDatasetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetsResponse, Unit]
  ): Request[ListDatasetsResponse, AWSError] = js.native
  
  /**
    * Lists all of the previous runs of a particular DataBrew job.
    */
  def listJobRuns(): Request[ListJobRunsResponse, AWSError] = js.native
  def listJobRuns(callback: js.Function2[/* err */ AWSError, /* data */ ListJobRunsResponse, Unit]): Request[ListJobRunsResponse, AWSError] = js.native
  /**
    * Lists all of the previous runs of a particular DataBrew job.
    */
  def listJobRuns(params: ListJobRunsRequest): Request[ListJobRunsResponse, AWSError] = js.native
  def listJobRuns(
    params: ListJobRunsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListJobRunsResponse, Unit]
  ): Request[ListJobRunsResponse, AWSError] = js.native
  
  /**
    * Lists all of the DataBrew jobs that are defined.
    */
  def listJobs(): Request[ListJobsResponse, AWSError] = js.native
  def listJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListJobsResponse, Unit]): Request[ListJobsResponse, AWSError] = js.native
  /**
    * Lists all of the DataBrew jobs that are defined.
    */
  def listJobs(params: ListJobsRequest): Request[ListJobsResponse, AWSError] = js.native
  def listJobs(
    params: ListJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListJobsResponse, Unit]
  ): Request[ListJobsResponse, AWSError] = js.native
  
  /**
    * Lists all of the DataBrew projects that are defined.
    */
  def listProjects(): Request[ListProjectsResponse, AWSError] = js.native
  def listProjects(callback: js.Function2[/* err */ AWSError, /* data */ ListProjectsResponse, Unit]): Request[ListProjectsResponse, AWSError] = js.native
  /**
    * Lists all of the DataBrew projects that are defined.
    */
  def listProjects(params: ListProjectsRequest): Request[ListProjectsResponse, AWSError] = js.native
  def listProjects(
    params: ListProjectsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProjectsResponse, Unit]
  ): Request[ListProjectsResponse, AWSError] = js.native
  
  /**
    * Lists the versions of a particular DataBrew recipe, except for LATEST_WORKING.
    */
  def listRecipeVersions(): Request[ListRecipeVersionsResponse, AWSError] = js.native
  def listRecipeVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListRecipeVersionsResponse, Unit]): Request[ListRecipeVersionsResponse, AWSError] = js.native
  /**
    * Lists the versions of a particular DataBrew recipe, except for LATEST_WORKING.
    */
  def listRecipeVersions(params: ListRecipeVersionsRequest): Request[ListRecipeVersionsResponse, AWSError] = js.native
  def listRecipeVersions(
    params: ListRecipeVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRecipeVersionsResponse, Unit]
  ): Request[ListRecipeVersionsResponse, AWSError] = js.native
  
  /**
    * Lists all of the DataBrew recipes that are defined.
    */
  def listRecipes(): Request[ListRecipesResponse, AWSError] = js.native
  def listRecipes(callback: js.Function2[/* err */ AWSError, /* data */ ListRecipesResponse, Unit]): Request[ListRecipesResponse, AWSError] = js.native
  /**
    * Lists all of the DataBrew recipes that are defined.
    */
  def listRecipes(params: ListRecipesRequest): Request[ListRecipesResponse, AWSError] = js.native
  def listRecipes(
    params: ListRecipesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRecipesResponse, Unit]
  ): Request[ListRecipesResponse, AWSError] = js.native
  
  /**
    * List all rulesets available in the current account or rulesets associated with a specific resource (dataset).
    */
  def listRulesets(): Request[ListRulesetsResponse, AWSError] = js.native
  def listRulesets(callback: js.Function2[/* err */ AWSError, /* data */ ListRulesetsResponse, Unit]): Request[ListRulesetsResponse, AWSError] = js.native
  /**
    * List all rulesets available in the current account or rulesets associated with a specific resource (dataset).
    */
  def listRulesets(params: ListRulesetsRequest): Request[ListRulesetsResponse, AWSError] = js.native
  def listRulesets(
    params: ListRulesetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRulesetsResponse, Unit]
  ): Request[ListRulesetsResponse, AWSError] = js.native
  
  /**
    * Lists the DataBrew schedules that are defined.
    */
  def listSchedules(): Request[ListSchedulesResponse, AWSError] = js.native
  def listSchedules(callback: js.Function2[/* err */ AWSError, /* data */ ListSchedulesResponse, Unit]): Request[ListSchedulesResponse, AWSError] = js.native
  /**
    * Lists the DataBrew schedules that are defined.
    */
  def listSchedules(params: ListSchedulesRequest): Request[ListSchedulesResponse, AWSError] = js.native
  def listSchedules(
    params: ListSchedulesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSchedulesResponse, Unit]
  ): Request[ListSchedulesResponse, AWSError] = js.native
  
  /**
    * Lists all the tags for a DataBrew resource. 
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists all the tags for a DataBrew resource. 
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Publishes a new version of a DataBrew recipe.
    */
  def publishRecipe(): Request[PublishRecipeResponse, AWSError] = js.native
  def publishRecipe(callback: js.Function2[/* err */ AWSError, /* data */ PublishRecipeResponse, Unit]): Request[PublishRecipeResponse, AWSError] = js.native
  /**
    * Publishes a new version of a DataBrew recipe.
    */
  def publishRecipe(params: PublishRecipeRequest): Request[PublishRecipeResponse, AWSError] = js.native
  def publishRecipe(
    params: PublishRecipeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PublishRecipeResponse, Unit]
  ): Request[PublishRecipeResponse, AWSError] = js.native
  
  /**
    * Performs a recipe step within an interactive DataBrew session that's currently open.
    */
  def sendProjectSessionAction(): Request[SendProjectSessionActionResponse, AWSError] = js.native
  def sendProjectSessionAction(callback: js.Function2[/* err */ AWSError, /* data */ SendProjectSessionActionResponse, Unit]): Request[SendProjectSessionActionResponse, AWSError] = js.native
  /**
    * Performs a recipe step within an interactive DataBrew session that's currently open.
    */
  def sendProjectSessionAction(params: SendProjectSessionActionRequest): Request[SendProjectSessionActionResponse, AWSError] = js.native
  def sendProjectSessionAction(
    params: SendProjectSessionActionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendProjectSessionActionResponse, Unit]
  ): Request[SendProjectSessionActionResponse, AWSError] = js.native
  
  /**
    * Runs a DataBrew job.
    */
  def startJobRun(): Request[StartJobRunResponse, AWSError] = js.native
  def startJobRun(callback: js.Function2[/* err */ AWSError, /* data */ StartJobRunResponse, Unit]): Request[StartJobRunResponse, AWSError] = js.native
  /**
    * Runs a DataBrew job.
    */
  def startJobRun(params: StartJobRunRequest): Request[StartJobRunResponse, AWSError] = js.native
  def startJobRun(
    params: StartJobRunRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartJobRunResponse, Unit]
  ): Request[StartJobRunResponse, AWSError] = js.native
  
  /**
    * Creates an interactive session, enabling you to manipulate data in a DataBrew project.
    */
  def startProjectSession(): Request[StartProjectSessionResponse, AWSError] = js.native
  def startProjectSession(callback: js.Function2[/* err */ AWSError, /* data */ StartProjectSessionResponse, Unit]): Request[StartProjectSessionResponse, AWSError] = js.native
  /**
    * Creates an interactive session, enabling you to manipulate data in a DataBrew project.
    */
  def startProjectSession(params: StartProjectSessionRequest): Request[StartProjectSessionResponse, AWSError] = js.native
  def startProjectSession(
    params: StartProjectSessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartProjectSessionResponse, Unit]
  ): Request[StartProjectSessionResponse, AWSError] = js.native
  
  /**
    * Stops a particular run of a job.
    */
  def stopJobRun(): Request[StopJobRunResponse, AWSError] = js.native
  def stopJobRun(callback: js.Function2[/* err */ AWSError, /* data */ StopJobRunResponse, Unit]): Request[StopJobRunResponse, AWSError] = js.native
  /**
    * Stops a particular run of a job.
    */
  def stopJobRun(params: StopJobRunRequest): Request[StopJobRunResponse, AWSError] = js.native
  def stopJobRun(
    params: StopJobRunRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopJobRunResponse, Unit]
  ): Request[StopJobRunResponse, AWSError] = js.native
  
  /**
    * Adds metadata tags to a DataBrew resource, such as a dataset, project, recipe, job, or schedule.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds metadata tags to a DataBrew resource, such as a dataset, project, recipe, job, or schedule.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes metadata tags from a DataBrew resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes metadata tags from a DataBrew resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Modifies the definition of an existing DataBrew dataset.
    */
  def updateDataset(): Request[UpdateDatasetResponse, AWSError] = js.native
  def updateDataset(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDatasetResponse, Unit]): Request[UpdateDatasetResponse, AWSError] = js.native
  /**
    * Modifies the definition of an existing DataBrew dataset.
    */
  def updateDataset(params: UpdateDatasetRequest): Request[UpdateDatasetResponse, AWSError] = js.native
  def updateDataset(
    params: UpdateDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDatasetResponse, Unit]
  ): Request[UpdateDatasetResponse, AWSError] = js.native
  
  /**
    * Modifies the definition of an existing profile job.
    */
  def updateProfileJob(): Request[UpdateProfileJobResponse, AWSError] = js.native
  def updateProfileJob(callback: js.Function2[/* err */ AWSError, /* data */ UpdateProfileJobResponse, Unit]): Request[UpdateProfileJobResponse, AWSError] = js.native
  /**
    * Modifies the definition of an existing profile job.
    */
  def updateProfileJob(params: UpdateProfileJobRequest): Request[UpdateProfileJobResponse, AWSError] = js.native
  def updateProfileJob(
    params: UpdateProfileJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateProfileJobResponse, Unit]
  ): Request[UpdateProfileJobResponse, AWSError] = js.native
  
  /**
    * Modifies the definition of an existing DataBrew project.
    */
  def updateProject(): Request[UpdateProjectResponse, AWSError] = js.native
  def updateProject(callback: js.Function2[/* err */ AWSError, /* data */ UpdateProjectResponse, Unit]): Request[UpdateProjectResponse, AWSError] = js.native
  /**
    * Modifies the definition of an existing DataBrew project.
    */
  def updateProject(params: UpdateProjectRequest): Request[UpdateProjectResponse, AWSError] = js.native
  def updateProject(
    params: UpdateProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateProjectResponse, Unit]
  ): Request[UpdateProjectResponse, AWSError] = js.native
  
  /**
    * Modifies the definition of the LATEST_WORKING version of a DataBrew recipe.
    */
  def updateRecipe(): Request[UpdateRecipeResponse, AWSError] = js.native
  def updateRecipe(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRecipeResponse, Unit]): Request[UpdateRecipeResponse, AWSError] = js.native
  /**
    * Modifies the definition of the LATEST_WORKING version of a DataBrew recipe.
    */
  def updateRecipe(params: UpdateRecipeRequest): Request[UpdateRecipeResponse, AWSError] = js.native
  def updateRecipe(
    params: UpdateRecipeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRecipeResponse, Unit]
  ): Request[UpdateRecipeResponse, AWSError] = js.native
  
  /**
    * Modifies the definition of an existing DataBrew recipe job.
    */
  def updateRecipeJob(): Request[UpdateRecipeJobResponse, AWSError] = js.native
  def updateRecipeJob(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRecipeJobResponse, Unit]): Request[UpdateRecipeJobResponse, AWSError] = js.native
  /**
    * Modifies the definition of an existing DataBrew recipe job.
    */
  def updateRecipeJob(params: UpdateRecipeJobRequest): Request[UpdateRecipeJobResponse, AWSError] = js.native
  def updateRecipeJob(
    params: UpdateRecipeJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRecipeJobResponse, Unit]
  ): Request[UpdateRecipeJobResponse, AWSError] = js.native
  
  /**
    * Updates specified ruleset.
    */
  def updateRuleset(): Request[UpdateRulesetResponse, AWSError] = js.native
  def updateRuleset(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRulesetResponse, Unit]): Request[UpdateRulesetResponse, AWSError] = js.native
  /**
    * Updates specified ruleset.
    */
  def updateRuleset(params: UpdateRulesetRequest): Request[UpdateRulesetResponse, AWSError] = js.native
  def updateRuleset(
    params: UpdateRulesetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRulesetResponse, Unit]
  ): Request[UpdateRulesetResponse, AWSError] = js.native
  
  /**
    * Modifies the definition of an existing DataBrew schedule.
    */
  def updateSchedule(): Request[UpdateScheduleResponse, AWSError] = js.native
  def updateSchedule(callback: js.Function2[/* err */ AWSError, /* data */ UpdateScheduleResponse, Unit]): Request[UpdateScheduleResponse, AWSError] = js.native
  /**
    * Modifies the definition of an existing DataBrew schedule.
    */
  def updateSchedule(params: UpdateScheduleRequest): Request[UpdateScheduleResponse, AWSError] = js.native
  def updateSchedule(
    params: UpdateScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateScheduleResponse, Unit]
  ): Request[UpdateScheduleResponse, AWSError] = js.native
}
