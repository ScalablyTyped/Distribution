package typings.awsSdk.personalizeMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Personalize extends Service {
  
  @JSName("config")
  var config_Personalize: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a batch inference job. The operation can handle up to 50 million records and the input file must be in JSON format. For more information, see Creating a batch inference job. 
    */
  def createBatchInferenceJob(): Request[CreateBatchInferenceJobResponse, AWSError] = js.native
  def createBatchInferenceJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateBatchInferenceJobResponse, Unit]): Request[CreateBatchInferenceJobResponse, AWSError] = js.native
  /**
    * Creates a batch inference job. The operation can handle up to 50 million records and the input file must be in JSON format. For more information, see Creating a batch inference job. 
    */
  def createBatchInferenceJob(params: CreateBatchInferenceJobRequest): Request[CreateBatchInferenceJobResponse, AWSError] = js.native
  def createBatchInferenceJob(
    params: CreateBatchInferenceJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateBatchInferenceJobResponse, Unit]
  ): Request[CreateBatchInferenceJobResponse, AWSError] = js.native
  
  /**
    * Creates a batch segment job. The operation can handle up to 50 million records and the input file must be in JSON format. For more information, see Getting batch recommendations and user segments.
    */
  def createBatchSegmentJob(): Request[CreateBatchSegmentJobResponse, AWSError] = js.native
  def createBatchSegmentJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateBatchSegmentJobResponse, Unit]): Request[CreateBatchSegmentJobResponse, AWSError] = js.native
  /**
    * Creates a batch segment job. The operation can handle up to 50 million records and the input file must be in JSON format. For more information, see Getting batch recommendations and user segments.
    */
  def createBatchSegmentJob(params: CreateBatchSegmentJobRequest): Request[CreateBatchSegmentJobResponse, AWSError] = js.native
  def createBatchSegmentJob(
    params: CreateBatchSegmentJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateBatchSegmentJobResponse, Unit]
  ): Request[CreateBatchSegmentJobResponse, AWSError] = js.native
  
  /**
    * Creates a campaign that deploys a solution version. When a client calls the GetRecommendations and GetPersonalizedRanking APIs, a campaign is specified in the request.  Minimum Provisioned TPS and Auto-Scaling  A transaction is a single GetRecommendations or GetPersonalizedRanking call. Transactions per second (TPS) is the throughput and unit of billing for Amazon Personalize. The minimum provisioned TPS (minProvisionedTPS) specifies the baseline throughput provisioned by Amazon Personalize, and thus, the minimum billing charge.   If your TPS increases beyond minProvisionedTPS, Amazon Personalize auto-scales the provisioned capacity up and down, but never below minProvisionedTPS. There's a short time delay while the capacity is increased that might cause loss of transactions. The actual TPS used is calculated as the average requests/second within a 5-minute window. You pay for maximum of either the minimum provisioned TPS or the actual TPS. We recommend starting with a low minProvisionedTPS, track your usage using Amazon CloudWatch metrics, and then increase the minProvisionedTPS as necessary.  Status  A campaign can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS   To get the campaign status, call DescribeCampaign.  Wait until the status of the campaign is ACTIVE before asking the campaign for recommendations.   Related APIs     ListCampaigns     DescribeCampaign     UpdateCampaign     DeleteCampaign   
    */
  def createCampaign(): Request[CreateCampaignResponse, AWSError] = js.native
  def createCampaign(callback: js.Function2[/* err */ AWSError, /* data */ CreateCampaignResponse, Unit]): Request[CreateCampaignResponse, AWSError] = js.native
  /**
    * Creates a campaign that deploys a solution version. When a client calls the GetRecommendations and GetPersonalizedRanking APIs, a campaign is specified in the request.  Minimum Provisioned TPS and Auto-Scaling  A transaction is a single GetRecommendations or GetPersonalizedRanking call. Transactions per second (TPS) is the throughput and unit of billing for Amazon Personalize. The minimum provisioned TPS (minProvisionedTPS) specifies the baseline throughput provisioned by Amazon Personalize, and thus, the minimum billing charge.   If your TPS increases beyond minProvisionedTPS, Amazon Personalize auto-scales the provisioned capacity up and down, but never below minProvisionedTPS. There's a short time delay while the capacity is increased that might cause loss of transactions. The actual TPS used is calculated as the average requests/second within a 5-minute window. You pay for maximum of either the minimum provisioned TPS or the actual TPS. We recommend starting with a low minProvisionedTPS, track your usage using Amazon CloudWatch metrics, and then increase the minProvisionedTPS as necessary.  Status  A campaign can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS   To get the campaign status, call DescribeCampaign.  Wait until the status of the campaign is ACTIVE before asking the campaign for recommendations.   Related APIs     ListCampaigns     DescribeCampaign     UpdateCampaign     DeleteCampaign   
    */
  def createCampaign(params: CreateCampaignRequest): Request[CreateCampaignResponse, AWSError] = js.native
  def createCampaign(
    params: CreateCampaignRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCampaignResponse, Unit]
  ): Request[CreateCampaignResponse, AWSError] = js.native
  
  /**
    * Creates an empty dataset and adds it to the specified dataset group. Use CreateDatasetImportJob to import your training data to a dataset. There are three types of datasets:   Interactions   Items   Users   Each dataset type has an associated schema with required field types. Only the Interactions dataset is required in order to train a model (also referred to as creating a solution). A dataset can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS   To get the status of the dataset, call DescribeDataset.  Related APIs     CreateDatasetGroup     ListDatasets     DescribeDataset     DeleteDataset   
    */
  def createDataset(): Request[CreateDatasetResponse, AWSError] = js.native
  def createDataset(callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetResponse, Unit]): Request[CreateDatasetResponse, AWSError] = js.native
  /**
    * Creates an empty dataset and adds it to the specified dataset group. Use CreateDatasetImportJob to import your training data to a dataset. There are three types of datasets:   Interactions   Items   Users   Each dataset type has an associated schema with required field types. Only the Interactions dataset is required in order to train a model (also referred to as creating a solution). A dataset can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS   To get the status of the dataset, call DescribeDataset.  Related APIs     CreateDatasetGroup     ListDatasets     DescribeDataset     DeleteDataset   
    */
  def createDataset(params: CreateDatasetRequest): Request[CreateDatasetResponse, AWSError] = js.native
  def createDataset(
    params: CreateDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetResponse, Unit]
  ): Request[CreateDatasetResponse, AWSError] = js.native
  
  /**
    *  Creates a job that exports data from your dataset to an Amazon S3 bucket. To allow Amazon Personalize to export the training data, you must specify an service-linked IAM role that gives Amazon Personalize PutObject permissions for your Amazon S3 bucket. For information, see Exporting a dataset in the Amazon Personalize developer guide.   Status  A dataset export job can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED    To get the status of the export job, call DescribeDatasetExportJob, and specify the Amazon Resource Name (ARN) of the dataset export job. The dataset export is complete when the status shows as ACTIVE. If the status shows as CREATE FAILED, the response includes a failureReason key, which describes why the job failed. 
    */
  def createDatasetExportJob(): Request[CreateDatasetExportJobResponse, AWSError] = js.native
  def createDatasetExportJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetExportJobResponse, Unit]): Request[CreateDatasetExportJobResponse, AWSError] = js.native
  /**
    *  Creates a job that exports data from your dataset to an Amazon S3 bucket. To allow Amazon Personalize to export the training data, you must specify an service-linked IAM role that gives Amazon Personalize PutObject permissions for your Amazon S3 bucket. For information, see Exporting a dataset in the Amazon Personalize developer guide.   Status  A dataset export job can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED    To get the status of the export job, call DescribeDatasetExportJob, and specify the Amazon Resource Name (ARN) of the dataset export job. The dataset export is complete when the status shows as ACTIVE. If the status shows as CREATE FAILED, the response includes a failureReason key, which describes why the job failed. 
    */
  def createDatasetExportJob(params: CreateDatasetExportJobRequest): Request[CreateDatasetExportJobResponse, AWSError] = js.native
  def createDatasetExportJob(
    params: CreateDatasetExportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetExportJobResponse, Unit]
  ): Request[CreateDatasetExportJobResponse, AWSError] = js.native
  
  /**
    * Creates an empty dataset group. A dataset group is a container for Amazon Personalize resources. A dataset group can contain at most three datasets, one for each type of dataset:   Interactions   Items   Users    A dataset group can be a Domain dataset group, where you specify a domain and use pre-configured resources like recommenders, or a Custom dataset group, where you use custom resources, such as a solution with a solution version, that you deploy with a campaign. If you start with a Domain dataset group, you can still add custom resources such as solutions and solution versions trained with recipes for custom use cases and deployed with campaigns.  A dataset group can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING   To get the status of the dataset group, call DescribeDatasetGroup. If the status shows as CREATE FAILED, the response includes a failureReason key, which describes why the creation failed.  You must wait until the status of the dataset group is ACTIVE before adding a dataset to the group.  You can specify an Key Management Service (KMS) key to encrypt the datasets in the group. If you specify a KMS key, you must also include an Identity and Access Management (IAM) role that has permission to access the key.  APIs that require a dataset group ARN in the request     CreateDataset     CreateEventTracker     CreateSolution     Related APIs     ListDatasetGroups     DescribeDatasetGroup     DeleteDatasetGroup   
    */
  def createDatasetGroup(): Request[CreateDatasetGroupResponse, AWSError] = js.native
  def createDatasetGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetGroupResponse, Unit]): Request[CreateDatasetGroupResponse, AWSError] = js.native
  /**
    * Creates an empty dataset group. A dataset group is a container for Amazon Personalize resources. A dataset group can contain at most three datasets, one for each type of dataset:   Interactions   Items   Users    A dataset group can be a Domain dataset group, where you specify a domain and use pre-configured resources like recommenders, or a Custom dataset group, where you use custom resources, such as a solution with a solution version, that you deploy with a campaign. If you start with a Domain dataset group, you can still add custom resources such as solutions and solution versions trained with recipes for custom use cases and deployed with campaigns.  A dataset group can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING   To get the status of the dataset group, call DescribeDatasetGroup. If the status shows as CREATE FAILED, the response includes a failureReason key, which describes why the creation failed.  You must wait until the status of the dataset group is ACTIVE before adding a dataset to the group.  You can specify an Key Management Service (KMS) key to encrypt the datasets in the group. If you specify a KMS key, you must also include an Identity and Access Management (IAM) role that has permission to access the key.  APIs that require a dataset group ARN in the request     CreateDataset     CreateEventTracker     CreateSolution     Related APIs     ListDatasetGroups     DescribeDatasetGroup     DeleteDatasetGroup   
    */
  def createDatasetGroup(params: CreateDatasetGroupRequest): Request[CreateDatasetGroupResponse, AWSError] = js.native
  def createDatasetGroup(
    params: CreateDatasetGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetGroupResponse, Unit]
  ): Request[CreateDatasetGroupResponse, AWSError] = js.native
  
  /**
    * Creates a job that imports training data from your data source (an Amazon S3 bucket) to an Amazon Personalize dataset. To allow Amazon Personalize to import the training data, you must specify an IAM service role that has permission to read from the data source, as Amazon Personalize makes a copy of your data and processes it internally. For information on granting access to your Amazon S3 bucket, see Giving Amazon Personalize Access to Amazon S3 Resources.   By default, a dataset import job replaces any existing data in the dataset that you imported in bulk. To add new records without replacing existing data, specify INCREMENTAL for the import mode in the CreateDatasetImportJob operation.   Status  A dataset import job can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   To get the status of the import job, call DescribeDatasetImportJob, providing the Amazon Resource Name (ARN) of the dataset import job. The dataset import is complete when the status shows as ACTIVE. If the status shows as CREATE FAILED, the response includes a failureReason key, which describes why the job failed.  Importing takes time. You must wait until the status shows as ACTIVE before training a model using the dataset.   Related APIs     ListDatasetImportJobs     DescribeDatasetImportJob   
    */
  def createDatasetImportJob(): Request[CreateDatasetImportJobResponse, AWSError] = js.native
  def createDatasetImportJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetImportJobResponse, Unit]): Request[CreateDatasetImportJobResponse, AWSError] = js.native
  /**
    * Creates a job that imports training data from your data source (an Amazon S3 bucket) to an Amazon Personalize dataset. To allow Amazon Personalize to import the training data, you must specify an IAM service role that has permission to read from the data source, as Amazon Personalize makes a copy of your data and processes it internally. For information on granting access to your Amazon S3 bucket, see Giving Amazon Personalize Access to Amazon S3 Resources.   By default, a dataset import job replaces any existing data in the dataset that you imported in bulk. To add new records without replacing existing data, specify INCREMENTAL for the import mode in the CreateDatasetImportJob operation.   Status  A dataset import job can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   To get the status of the import job, call DescribeDatasetImportJob, providing the Amazon Resource Name (ARN) of the dataset import job. The dataset import is complete when the status shows as ACTIVE. If the status shows as CREATE FAILED, the response includes a failureReason key, which describes why the job failed.  Importing takes time. You must wait until the status shows as ACTIVE before training a model using the dataset.   Related APIs     ListDatasetImportJobs     DescribeDatasetImportJob   
    */
  def createDatasetImportJob(params: CreateDatasetImportJobRequest): Request[CreateDatasetImportJobResponse, AWSError] = js.native
  def createDatasetImportJob(
    params: CreateDatasetImportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetImportJobResponse, Unit]
  ): Request[CreateDatasetImportJobResponse, AWSError] = js.native
  
  /**
    * Creates an event tracker that you use when adding event data to a specified dataset group using the PutEvents API.  Only one event tracker can be associated with a dataset group. You will get an error if you call CreateEventTracker using the same dataset group as an existing event tracker.  When you create an event tracker, the response includes a tracking ID, which you pass as a parameter when you use the PutEvents operation. Amazon Personalize then appends the event data to the Interactions dataset of the dataset group you specify in your event tracker.  The event tracker can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS   To get the status of the event tracker, call DescribeEventTracker.  The event tracker must be in the ACTIVE state before using the tracking ID.   Related APIs     ListEventTrackers     DescribeEventTracker     DeleteEventTracker   
    */
  def createEventTracker(): Request[CreateEventTrackerResponse, AWSError] = js.native
  def createEventTracker(callback: js.Function2[/* err */ AWSError, /* data */ CreateEventTrackerResponse, Unit]): Request[CreateEventTrackerResponse, AWSError] = js.native
  /**
    * Creates an event tracker that you use when adding event data to a specified dataset group using the PutEvents API.  Only one event tracker can be associated with a dataset group. You will get an error if you call CreateEventTracker using the same dataset group as an existing event tracker.  When you create an event tracker, the response includes a tracking ID, which you pass as a parameter when you use the PutEvents operation. Amazon Personalize then appends the event data to the Interactions dataset of the dataset group you specify in your event tracker.  The event tracker can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS   To get the status of the event tracker, call DescribeEventTracker.  The event tracker must be in the ACTIVE state before using the tracking ID.   Related APIs     ListEventTrackers     DescribeEventTracker     DeleteEventTracker   
    */
  def createEventTracker(params: CreateEventTrackerRequest): Request[CreateEventTrackerResponse, AWSError] = js.native
  def createEventTracker(
    params: CreateEventTrackerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEventTrackerResponse, Unit]
  ): Request[CreateEventTrackerResponse, AWSError] = js.native
  
  /**
    * Creates a recommendation filter. For more information, see Filtering recommendations and user segments.
    */
  def createFilter(): Request[CreateFilterResponse, AWSError] = js.native
  def createFilter(callback: js.Function2[/* err */ AWSError, /* data */ CreateFilterResponse, Unit]): Request[CreateFilterResponse, AWSError] = js.native
  /**
    * Creates a recommendation filter. For more information, see Filtering recommendations and user segments.
    */
  def createFilter(params: CreateFilterRequest): Request[CreateFilterResponse, AWSError] = js.native
  def createFilter(
    params: CreateFilterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFilterResponse, Unit]
  ): Request[CreateFilterResponse, AWSError] = js.native
  
  /**
    * Creates a recommender with the recipe (a Domain dataset group use case) you specify. You create recommenders for a Domain dataset group and specify the recommender's Amazon Resource Name (ARN) when you make a GetRecommendations request.   Minimum recommendation requests per second  When you create a recommender, you can configure the recommender's minimum recommendation requests per second. The minimum recommendation requests per second (minRecommendationRequestsPerSecond) specifies the baseline recommendation request throughput provisioned by Amazon Personalize. The default minRecommendationRequestsPerSecond is 1. A recommendation request is a single GetRecommendations operation. Request throughput is measured in requests per second and Amazon Personalize uses your requests per second to derive your requests per hour and the price of your recommender usage.   If your requests per second increases beyond minRecommendationRequestsPerSecond, Amazon Personalize auto-scales the provisioned capacity up and down, but never below minRecommendationRequestsPerSecond. There's a short time delay while the capacity is increased that might cause loss of requests.  Your bill is the greater of either the minimum requests per hour (based on minRecommendationRequestsPerSecond) or the actual number of requests. The actual request throughput used is calculated as the average requests/second within a one-hour window. We recommend starting with the default minRecommendationRequestsPerSecond, track your usage using Amazon CloudWatch metrics, and then increase the minRecommendationRequestsPerSecond as necessary.   Status  A recommender can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   STOP PENDING &gt; STOP IN_PROGRESS &gt; INACTIVE &gt; START PENDING &gt; START IN_PROGRESS &gt; ACTIVE   DELETE PENDING &gt; DELETE IN_PROGRESS   To get the recommender status, call DescribeRecommender.  Wait until the status of the recommender is ACTIVE before asking the recommender for recommendations.   Related APIs     ListRecommenders     DescribeRecommender     UpdateRecommender     DeleteRecommender   
    */
  def createRecommender(): Request[CreateRecommenderResponse, AWSError] = js.native
  def createRecommender(callback: js.Function2[/* err */ AWSError, /* data */ CreateRecommenderResponse, Unit]): Request[CreateRecommenderResponse, AWSError] = js.native
  /**
    * Creates a recommender with the recipe (a Domain dataset group use case) you specify. You create recommenders for a Domain dataset group and specify the recommender's Amazon Resource Name (ARN) when you make a GetRecommendations request.   Minimum recommendation requests per second  When you create a recommender, you can configure the recommender's minimum recommendation requests per second. The minimum recommendation requests per second (minRecommendationRequestsPerSecond) specifies the baseline recommendation request throughput provisioned by Amazon Personalize. The default minRecommendationRequestsPerSecond is 1. A recommendation request is a single GetRecommendations operation. Request throughput is measured in requests per second and Amazon Personalize uses your requests per second to derive your requests per hour and the price of your recommender usage.   If your requests per second increases beyond minRecommendationRequestsPerSecond, Amazon Personalize auto-scales the provisioned capacity up and down, but never below minRecommendationRequestsPerSecond. There's a short time delay while the capacity is increased that might cause loss of requests.  Your bill is the greater of either the minimum requests per hour (based on minRecommendationRequestsPerSecond) or the actual number of requests. The actual request throughput used is calculated as the average requests/second within a one-hour window. We recommend starting with the default minRecommendationRequestsPerSecond, track your usage using Amazon CloudWatch metrics, and then increase the minRecommendationRequestsPerSecond as necessary.   Status  A recommender can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   STOP PENDING &gt; STOP IN_PROGRESS &gt; INACTIVE &gt; START PENDING &gt; START IN_PROGRESS &gt; ACTIVE   DELETE PENDING &gt; DELETE IN_PROGRESS   To get the recommender status, call DescribeRecommender.  Wait until the status of the recommender is ACTIVE before asking the recommender for recommendations.   Related APIs     ListRecommenders     DescribeRecommender     UpdateRecommender     DeleteRecommender   
    */
  def createRecommender(params: CreateRecommenderRequest): Request[CreateRecommenderResponse, AWSError] = js.native
  def createRecommender(
    params: CreateRecommenderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRecommenderResponse, Unit]
  ): Request[CreateRecommenderResponse, AWSError] = js.native
  
  /**
    * Creates an Amazon Personalize schema from the specified schema string. The schema you create must be in Avro JSON format. Amazon Personalize recognizes three schema variants. Each schema is associated with a dataset type and has a set of required field and keywords. If you are creating a schema for a dataset in a Domain dataset group, you provide the domain of the Domain dataset group. You specify a schema when you call CreateDataset.  Related APIs     ListSchemas     DescribeSchema     DeleteSchema   
    */
  def createSchema(): Request[CreateSchemaResponse, AWSError] = js.native
  def createSchema(callback: js.Function2[/* err */ AWSError, /* data */ CreateSchemaResponse, Unit]): Request[CreateSchemaResponse, AWSError] = js.native
  /**
    * Creates an Amazon Personalize schema from the specified schema string. The schema you create must be in Avro JSON format. Amazon Personalize recognizes three schema variants. Each schema is associated with a dataset type and has a set of required field and keywords. If you are creating a schema for a dataset in a Domain dataset group, you provide the domain of the Domain dataset group. You specify a schema when you call CreateDataset.  Related APIs     ListSchemas     DescribeSchema     DeleteSchema   
    */
  def createSchema(params: CreateSchemaRequest): Request[CreateSchemaResponse, AWSError] = js.native
  def createSchema(
    params: CreateSchemaRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSchemaResponse, Unit]
  ): Request[CreateSchemaResponse, AWSError] = js.native
  
  /**
    * Creates the configuration for training a model. A trained model is known as a solution. After the configuration is created, you train the model (create a solution) by calling the CreateSolutionVersion operation. Every time you call CreateSolutionVersion, a new version of the solution is created. After creating a solution version, you check its accuracy by calling GetSolutionMetrics. When you are satisfied with the version, you deploy it using CreateCampaign. The campaign provides recommendations to a client through the GetRecommendations API. To train a model, Amazon Personalize requires training data and a recipe. The training data comes from the dataset group that you provide in the request. A recipe specifies the training algorithm and a feature transformation. You can specify one of the predefined recipes provided by Amazon Personalize. Alternatively, you can specify performAutoML and Amazon Personalize will analyze your data and select the optimum USER_PERSONALIZATION recipe for you.  Amazon Personalize doesn't support configuring the hpoObjective for solution hyperparameter optimization at this time.   Status  A solution can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS   To get the status of the solution, call DescribeSolution. Wait until the status shows as ACTIVE before calling CreateSolutionVersion.  Related APIs     ListSolutions     CreateSolutionVersion     DescribeSolution     DeleteSolution       ListSolutionVersions     DescribeSolutionVersion   
    */
  def createSolution(): Request[CreateSolutionResponse, AWSError] = js.native
  def createSolution(callback: js.Function2[/* err */ AWSError, /* data */ CreateSolutionResponse, Unit]): Request[CreateSolutionResponse, AWSError] = js.native
  /**
    * Creates the configuration for training a model. A trained model is known as a solution. After the configuration is created, you train the model (create a solution) by calling the CreateSolutionVersion operation. Every time you call CreateSolutionVersion, a new version of the solution is created. After creating a solution version, you check its accuracy by calling GetSolutionMetrics. When you are satisfied with the version, you deploy it using CreateCampaign. The campaign provides recommendations to a client through the GetRecommendations API. To train a model, Amazon Personalize requires training data and a recipe. The training data comes from the dataset group that you provide in the request. A recipe specifies the training algorithm and a feature transformation. You can specify one of the predefined recipes provided by Amazon Personalize. Alternatively, you can specify performAutoML and Amazon Personalize will analyze your data and select the optimum USER_PERSONALIZATION recipe for you.  Amazon Personalize doesn't support configuring the hpoObjective for solution hyperparameter optimization at this time.   Status  A solution can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS   To get the status of the solution, call DescribeSolution. Wait until the status shows as ACTIVE before calling CreateSolutionVersion.  Related APIs     ListSolutions     CreateSolutionVersion     DescribeSolution     DeleteSolution       ListSolutionVersions     DescribeSolutionVersion   
    */
  def createSolution(params: CreateSolutionRequest): Request[CreateSolutionResponse, AWSError] = js.native
  def createSolution(
    params: CreateSolutionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSolutionResponse, Unit]
  ): Request[CreateSolutionResponse, AWSError] = js.native
  
  /**
    * Trains or retrains an active solution in a Custom dataset group. A solution is created using the CreateSolution operation and must be in the ACTIVE state before calling CreateSolutionVersion. A new version of the solution is created every time you call this operation.  Status  A solution version can be in one of the following states:   CREATE PENDING   CREATE IN_PROGRESS   ACTIVE   CREATE FAILED   CREATE STOPPING   CREATE STOPPED   To get the status of the version, call DescribeSolutionVersion. Wait until the status shows as ACTIVE before calling CreateCampaign. If the status shows as CREATE FAILED, the response includes a failureReason key, which describes why the job failed.  Related APIs     ListSolutionVersions     DescribeSolutionVersion     ListSolutions     CreateSolution     DescribeSolution     DeleteSolution   
    */
  def createSolutionVersion(): Request[CreateSolutionVersionResponse, AWSError] = js.native
  def createSolutionVersion(callback: js.Function2[/* err */ AWSError, /* data */ CreateSolutionVersionResponse, Unit]): Request[CreateSolutionVersionResponse, AWSError] = js.native
  /**
    * Trains or retrains an active solution in a Custom dataset group. A solution is created using the CreateSolution operation and must be in the ACTIVE state before calling CreateSolutionVersion. A new version of the solution is created every time you call this operation.  Status  A solution version can be in one of the following states:   CREATE PENDING   CREATE IN_PROGRESS   ACTIVE   CREATE FAILED   CREATE STOPPING   CREATE STOPPED   To get the status of the version, call DescribeSolutionVersion. Wait until the status shows as ACTIVE before calling CreateCampaign. If the status shows as CREATE FAILED, the response includes a failureReason key, which describes why the job failed.  Related APIs     ListSolutionVersions     DescribeSolutionVersion     ListSolutions     CreateSolution     DescribeSolution     DeleteSolution   
    */
  def createSolutionVersion(params: CreateSolutionVersionRequest): Request[CreateSolutionVersionResponse, AWSError] = js.native
  def createSolutionVersion(
    params: CreateSolutionVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSolutionVersionResponse, Unit]
  ): Request[CreateSolutionVersionResponse, AWSError] = js.native
  
  /**
    * Removes a campaign by deleting the solution deployment. The solution that the campaign is based on is not deleted and can be redeployed when needed. A deleted campaign can no longer be specified in a GetRecommendations request. For information on creating campaigns, see CreateCampaign.
    */
  def deleteCampaign(): Request[js.Object, AWSError] = js.native
  def deleteCampaign(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes a campaign by deleting the solution deployment. The solution that the campaign is based on is not deleted and can be redeployed when needed. A deleted campaign can no longer be specified in a GetRecommendations request. For information on creating campaigns, see CreateCampaign.
    */
  def deleteCampaign(params: DeleteCampaignRequest): Request[js.Object, AWSError] = js.native
  def deleteCampaign(
    params: DeleteCampaignRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a dataset. You can't delete a dataset if an associated DatasetImportJob or SolutionVersion is in the CREATE PENDING or IN PROGRESS state. For more information on datasets, see CreateDataset.
    */
  def deleteDataset(): Request[js.Object, AWSError] = js.native
  def deleteDataset(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a dataset. You can't delete a dataset if an associated DatasetImportJob or SolutionVersion is in the CREATE PENDING or IN PROGRESS state. For more information on datasets, see CreateDataset.
    */
  def deleteDataset(params: DeleteDatasetRequest): Request[js.Object, AWSError] = js.native
  def deleteDataset(
    params: DeleteDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a dataset group. Before you delete a dataset group, you must delete the following:   All associated event trackers.   All associated solutions.   All datasets in the dataset group.  
    */
  def deleteDatasetGroup(): Request[js.Object, AWSError] = js.native
  def deleteDatasetGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a dataset group. Before you delete a dataset group, you must delete the following:   All associated event trackers.   All associated solutions.   All datasets in the dataset group.  
    */
  def deleteDatasetGroup(params: DeleteDatasetGroupRequest): Request[js.Object, AWSError] = js.native
  def deleteDatasetGroup(
    params: DeleteDatasetGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes the event tracker. Does not delete the event-interactions dataset from the associated dataset group. For more information on event trackers, see CreateEventTracker.
    */
  def deleteEventTracker(): Request[js.Object, AWSError] = js.native
  def deleteEventTracker(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the event tracker. Does not delete the event-interactions dataset from the associated dataset group. For more information on event trackers, see CreateEventTracker.
    */
  def deleteEventTracker(params: DeleteEventTrackerRequest): Request[js.Object, AWSError] = js.native
  def deleteEventTracker(
    params: DeleteEventTrackerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a filter.
    */
  def deleteFilter(): Request[js.Object, AWSError] = js.native
  def deleteFilter(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a filter.
    */
  def deleteFilter(params: DeleteFilterRequest): Request[js.Object, AWSError] = js.native
  def deleteFilter(
    params: DeleteFilterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deactivates and removes a recommender. A deleted recommender can no longer be specified in a GetRecommendations request.
    */
  def deleteRecommender(): Request[js.Object, AWSError] = js.native
  def deleteRecommender(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deactivates and removes a recommender. A deleted recommender can no longer be specified in a GetRecommendations request.
    */
  def deleteRecommender(params: DeleteRecommenderRequest): Request[js.Object, AWSError] = js.native
  def deleteRecommender(
    params: DeleteRecommenderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a schema. Before deleting a schema, you must delete all datasets referencing the schema. For more information on schemas, see CreateSchema.
    */
  def deleteSchema(): Request[js.Object, AWSError] = js.native
  def deleteSchema(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a schema. Before deleting a schema, you must delete all datasets referencing the schema. For more information on schemas, see CreateSchema.
    */
  def deleteSchema(params: DeleteSchemaRequest): Request[js.Object, AWSError] = js.native
  def deleteSchema(
    params: DeleteSchemaRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes all versions of a solution and the Solution object itself. Before deleting a solution, you must delete all campaigns based on the solution. To determine what campaigns are using the solution, call ListCampaigns and supply the Amazon Resource Name (ARN) of the solution. You can't delete a solution if an associated SolutionVersion is in the CREATE PENDING or IN PROGRESS state. For more information on solutions, see CreateSolution.
    */
  def deleteSolution(): Request[js.Object, AWSError] = js.native
  def deleteSolution(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes all versions of a solution and the Solution object itself. Before deleting a solution, you must delete all campaigns based on the solution. To determine what campaigns are using the solution, call ListCampaigns and supply the Amazon Resource Name (ARN) of the solution. You can't delete a solution if an associated SolutionVersion is in the CREATE PENDING or IN PROGRESS state. For more information on solutions, see CreateSolution.
    */
  def deleteSolution(params: DeleteSolutionRequest): Request[js.Object, AWSError] = js.native
  def deleteSolution(
    params: DeleteSolutionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Describes the given algorithm.
    */
  def describeAlgorithm(): Request[DescribeAlgorithmResponse, AWSError] = js.native
  def describeAlgorithm(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAlgorithmResponse, Unit]): Request[DescribeAlgorithmResponse, AWSError] = js.native
  /**
    * Describes the given algorithm.
    */
  def describeAlgorithm(params: DescribeAlgorithmRequest): Request[DescribeAlgorithmResponse, AWSError] = js.native
  def describeAlgorithm(
    params: DescribeAlgorithmRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAlgorithmResponse, Unit]
  ): Request[DescribeAlgorithmResponse, AWSError] = js.native
  
  /**
    * Gets the properties of a batch inference job including name, Amazon Resource Name (ARN), status, input and output configurations, and the ARN of the solution version used to generate the recommendations.
    */
  def describeBatchInferenceJob(): Request[DescribeBatchInferenceJobResponse, AWSError] = js.native
  def describeBatchInferenceJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeBatchInferenceJobResponse, Unit]): Request[DescribeBatchInferenceJobResponse, AWSError] = js.native
  /**
    * Gets the properties of a batch inference job including name, Amazon Resource Name (ARN), status, input and output configurations, and the ARN of the solution version used to generate the recommendations.
    */
  def describeBatchInferenceJob(params: DescribeBatchInferenceJobRequest): Request[DescribeBatchInferenceJobResponse, AWSError] = js.native
  def describeBatchInferenceJob(
    params: DescribeBatchInferenceJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeBatchInferenceJobResponse, Unit]
  ): Request[DescribeBatchInferenceJobResponse, AWSError] = js.native
  
  /**
    * Gets the properties of a batch segment job including name, Amazon Resource Name (ARN), status, input and output configurations, and the ARN of the solution version used to generate segments.
    */
  def describeBatchSegmentJob(): Request[DescribeBatchSegmentJobResponse, AWSError] = js.native
  def describeBatchSegmentJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeBatchSegmentJobResponse, Unit]): Request[DescribeBatchSegmentJobResponse, AWSError] = js.native
  /**
    * Gets the properties of a batch segment job including name, Amazon Resource Name (ARN), status, input and output configurations, and the ARN of the solution version used to generate segments.
    */
  def describeBatchSegmentJob(params: DescribeBatchSegmentJobRequest): Request[DescribeBatchSegmentJobResponse, AWSError] = js.native
  def describeBatchSegmentJob(
    params: DescribeBatchSegmentJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeBatchSegmentJobResponse, Unit]
  ): Request[DescribeBatchSegmentJobResponse, AWSError] = js.native
  
  /**
    * Describes the given campaign, including its status. A campaign can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS   When the status is CREATE FAILED, the response includes the failureReason key, which describes why. For more information on campaigns, see CreateCampaign.
    */
  def describeCampaign(): Request[DescribeCampaignResponse, AWSError] = js.native
  def describeCampaign(callback: js.Function2[/* err */ AWSError, /* data */ DescribeCampaignResponse, Unit]): Request[DescribeCampaignResponse, AWSError] = js.native
  /**
    * Describes the given campaign, including its status. A campaign can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS   When the status is CREATE FAILED, the response includes the failureReason key, which describes why. For more information on campaigns, see CreateCampaign.
    */
  def describeCampaign(params: DescribeCampaignRequest): Request[DescribeCampaignResponse, AWSError] = js.native
  def describeCampaign(
    params: DescribeCampaignRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCampaignResponse, Unit]
  ): Request[DescribeCampaignResponse, AWSError] = js.native
  
  /**
    * Describes the given dataset. For more information on datasets, see CreateDataset.
    */
  def describeDataset(): Request[DescribeDatasetResponse, AWSError] = js.native
  def describeDataset(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDatasetResponse, Unit]): Request[DescribeDatasetResponse, AWSError] = js.native
  /**
    * Describes the given dataset. For more information on datasets, see CreateDataset.
    */
  def describeDataset(params: DescribeDatasetRequest): Request[DescribeDatasetResponse, AWSError] = js.native
  def describeDataset(
    params: DescribeDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDatasetResponse, Unit]
  ): Request[DescribeDatasetResponse, AWSError] = js.native
  
  /**
    * Describes the dataset export job created by CreateDatasetExportJob, including the export job status.
    */
  def describeDatasetExportJob(): Request[DescribeDatasetExportJobResponse, AWSError] = js.native
  def describeDatasetExportJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDatasetExportJobResponse, Unit]): Request[DescribeDatasetExportJobResponse, AWSError] = js.native
  /**
    * Describes the dataset export job created by CreateDatasetExportJob, including the export job status.
    */
  def describeDatasetExportJob(params: DescribeDatasetExportJobRequest): Request[DescribeDatasetExportJobResponse, AWSError] = js.native
  def describeDatasetExportJob(
    params: DescribeDatasetExportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDatasetExportJobResponse, Unit]
  ): Request[DescribeDatasetExportJobResponse, AWSError] = js.native
  
  /**
    * Describes the given dataset group. For more information on dataset groups, see CreateDatasetGroup.
    */
  def describeDatasetGroup(): Request[DescribeDatasetGroupResponse, AWSError] = js.native
  def describeDatasetGroup(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDatasetGroupResponse, Unit]): Request[DescribeDatasetGroupResponse, AWSError] = js.native
  /**
    * Describes the given dataset group. For more information on dataset groups, see CreateDatasetGroup.
    */
  def describeDatasetGroup(params: DescribeDatasetGroupRequest): Request[DescribeDatasetGroupResponse, AWSError] = js.native
  def describeDatasetGroup(
    params: DescribeDatasetGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDatasetGroupResponse, Unit]
  ): Request[DescribeDatasetGroupResponse, AWSError] = js.native
  
  /**
    * Describes the dataset import job created by CreateDatasetImportJob, including the import job status.
    */
  def describeDatasetImportJob(): Request[DescribeDatasetImportJobResponse, AWSError] = js.native
  def describeDatasetImportJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDatasetImportJobResponse, Unit]): Request[DescribeDatasetImportJobResponse, AWSError] = js.native
  /**
    * Describes the dataset import job created by CreateDatasetImportJob, including the import job status.
    */
  def describeDatasetImportJob(params: DescribeDatasetImportJobRequest): Request[DescribeDatasetImportJobResponse, AWSError] = js.native
  def describeDatasetImportJob(
    params: DescribeDatasetImportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDatasetImportJobResponse, Unit]
  ): Request[DescribeDatasetImportJobResponse, AWSError] = js.native
  
  /**
    * Describes an event tracker. The response includes the trackingId and status of the event tracker. For more information on event trackers, see CreateEventTracker.
    */
  def describeEventTracker(): Request[DescribeEventTrackerResponse, AWSError] = js.native
  def describeEventTracker(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventTrackerResponse, Unit]): Request[DescribeEventTrackerResponse, AWSError] = js.native
  /**
    * Describes an event tracker. The response includes the trackingId and status of the event tracker. For more information on event trackers, see CreateEventTracker.
    */
  def describeEventTracker(params: DescribeEventTrackerRequest): Request[DescribeEventTrackerResponse, AWSError] = js.native
  def describeEventTracker(
    params: DescribeEventTrackerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEventTrackerResponse, Unit]
  ): Request[DescribeEventTrackerResponse, AWSError] = js.native
  
  /**
    * Describes the given feature transformation.
    */
  def describeFeatureTransformation(): Request[DescribeFeatureTransformationResponse, AWSError] = js.native
  def describeFeatureTransformation(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFeatureTransformationResponse, Unit]): Request[DescribeFeatureTransformationResponse, AWSError] = js.native
  /**
    * Describes the given feature transformation.
    */
  def describeFeatureTransformation(params: DescribeFeatureTransformationRequest): Request[DescribeFeatureTransformationResponse, AWSError] = js.native
  def describeFeatureTransformation(
    params: DescribeFeatureTransformationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFeatureTransformationResponse, Unit]
  ): Request[DescribeFeatureTransformationResponse, AWSError] = js.native
  
  /**
    * Describes a filter's properties.
    */
  def describeFilter(): Request[DescribeFilterResponse, AWSError] = js.native
  def describeFilter(callback: js.Function2[/* err */ AWSError, /* data */ DescribeFilterResponse, Unit]): Request[DescribeFilterResponse, AWSError] = js.native
  /**
    * Describes a filter's properties.
    */
  def describeFilter(params: DescribeFilterRequest): Request[DescribeFilterResponse, AWSError] = js.native
  def describeFilter(
    params: DescribeFilterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeFilterResponse, Unit]
  ): Request[DescribeFilterResponse, AWSError] = js.native
  
  /**
    * Describes a recipe. A recipe contains three items:   An algorithm that trains a model.   Hyperparameters that govern the training.   Feature transformation information for modifying the input data before training.   Amazon Personalize provides a set of predefined recipes. You specify a recipe when you create a solution with the CreateSolution API. CreateSolution trains a model by using the algorithm in the specified recipe and a training dataset. The solution, when deployed as a campaign, can provide recommendations using the GetRecommendations API.
    */
  def describeRecipe(): Request[DescribeRecipeResponse, AWSError] = js.native
  def describeRecipe(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRecipeResponse, Unit]): Request[DescribeRecipeResponse, AWSError] = js.native
  /**
    * Describes a recipe. A recipe contains three items:   An algorithm that trains a model.   Hyperparameters that govern the training.   Feature transformation information for modifying the input data before training.   Amazon Personalize provides a set of predefined recipes. You specify a recipe when you create a solution with the CreateSolution API. CreateSolution trains a model by using the algorithm in the specified recipe and a training dataset. The solution, when deployed as a campaign, can provide recommendations using the GetRecommendations API.
    */
  def describeRecipe(params: DescribeRecipeRequest): Request[DescribeRecipeResponse, AWSError] = js.native
  def describeRecipe(
    params: DescribeRecipeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRecipeResponse, Unit]
  ): Request[DescribeRecipeResponse, AWSError] = js.native
  
  /**
    * Describes the given recommender, including its status. A recommender can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   STOP PENDING &gt; STOP IN_PROGRESS &gt; INACTIVE &gt; START PENDING &gt; START IN_PROGRESS &gt; ACTIVE   DELETE PENDING &gt; DELETE IN_PROGRESS   When the status is CREATE FAILED, the response includes the failureReason key, which describes why. The modelMetrics key is null when the recommender is being created or deleted. For more information on recommenders, see CreateRecommender.
    */
  def describeRecommender(): Request[DescribeRecommenderResponse, AWSError] = js.native
  def describeRecommender(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRecommenderResponse, Unit]): Request[DescribeRecommenderResponse, AWSError] = js.native
  /**
    * Describes the given recommender, including its status. A recommender can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   STOP PENDING &gt; STOP IN_PROGRESS &gt; INACTIVE &gt; START PENDING &gt; START IN_PROGRESS &gt; ACTIVE   DELETE PENDING &gt; DELETE IN_PROGRESS   When the status is CREATE FAILED, the response includes the failureReason key, which describes why. The modelMetrics key is null when the recommender is being created or deleted. For more information on recommenders, see CreateRecommender.
    */
  def describeRecommender(params: DescribeRecommenderRequest): Request[DescribeRecommenderResponse, AWSError] = js.native
  def describeRecommender(
    params: DescribeRecommenderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRecommenderResponse, Unit]
  ): Request[DescribeRecommenderResponse, AWSError] = js.native
  
  /**
    * Describes a schema. For more information on schemas, see CreateSchema.
    */
  def describeSchema(): Request[DescribeSchemaResponse, AWSError] = js.native
  def describeSchema(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSchemaResponse, Unit]): Request[DescribeSchemaResponse, AWSError] = js.native
  /**
    * Describes a schema. For more information on schemas, see CreateSchema.
    */
  def describeSchema(params: DescribeSchemaRequest): Request[DescribeSchemaResponse, AWSError] = js.native
  def describeSchema(
    params: DescribeSchemaRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSchemaResponse, Unit]
  ): Request[DescribeSchemaResponse, AWSError] = js.native
  
  /**
    * Describes a solution. For more information on solutions, see CreateSolution.
    */
  def describeSolution(): Request[DescribeSolutionResponse, AWSError] = js.native
  def describeSolution(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSolutionResponse, Unit]): Request[DescribeSolutionResponse, AWSError] = js.native
  /**
    * Describes a solution. For more information on solutions, see CreateSolution.
    */
  def describeSolution(params: DescribeSolutionRequest): Request[DescribeSolutionResponse, AWSError] = js.native
  def describeSolution(
    params: DescribeSolutionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSolutionResponse, Unit]
  ): Request[DescribeSolutionResponse, AWSError] = js.native
  
  /**
    * Describes a specific version of a solution. For more information on solutions, see CreateSolution 
    */
  def describeSolutionVersion(): Request[DescribeSolutionVersionResponse, AWSError] = js.native
  def describeSolutionVersion(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSolutionVersionResponse, Unit]): Request[DescribeSolutionVersionResponse, AWSError] = js.native
  /**
    * Describes a specific version of a solution. For more information on solutions, see CreateSolution 
    */
  def describeSolutionVersion(params: DescribeSolutionVersionRequest): Request[DescribeSolutionVersionResponse, AWSError] = js.native
  def describeSolutionVersion(
    params: DescribeSolutionVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSolutionVersionResponse, Unit]
  ): Request[DescribeSolutionVersionResponse, AWSError] = js.native
  
  /**
    * Gets the metrics for the specified solution version.
    */
  def getSolutionMetrics(): Request[GetSolutionMetricsResponse, AWSError] = js.native
  def getSolutionMetrics(callback: js.Function2[/* err */ AWSError, /* data */ GetSolutionMetricsResponse, Unit]): Request[GetSolutionMetricsResponse, AWSError] = js.native
  /**
    * Gets the metrics for the specified solution version.
    */
  def getSolutionMetrics(params: GetSolutionMetricsRequest): Request[GetSolutionMetricsResponse, AWSError] = js.native
  def getSolutionMetrics(
    params: GetSolutionMetricsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSolutionMetricsResponse, Unit]
  ): Request[GetSolutionMetricsResponse, AWSError] = js.native
  
  /**
    * Gets a list of the batch inference jobs that have been performed off of a solution version.
    */
  def listBatchInferenceJobs(): Request[ListBatchInferenceJobsResponse, AWSError] = js.native
  def listBatchInferenceJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListBatchInferenceJobsResponse, Unit]): Request[ListBatchInferenceJobsResponse, AWSError] = js.native
  /**
    * Gets a list of the batch inference jobs that have been performed off of a solution version.
    */
  def listBatchInferenceJobs(params: ListBatchInferenceJobsRequest): Request[ListBatchInferenceJobsResponse, AWSError] = js.native
  def listBatchInferenceJobs(
    params: ListBatchInferenceJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBatchInferenceJobsResponse, Unit]
  ): Request[ListBatchInferenceJobsResponse, AWSError] = js.native
  
  /**
    * Gets a list of the batch segment jobs that have been performed off of a solution version that you specify.
    */
  def listBatchSegmentJobs(): Request[ListBatchSegmentJobsResponse, AWSError] = js.native
  def listBatchSegmentJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListBatchSegmentJobsResponse, Unit]): Request[ListBatchSegmentJobsResponse, AWSError] = js.native
  /**
    * Gets a list of the batch segment jobs that have been performed off of a solution version that you specify.
    */
  def listBatchSegmentJobs(params: ListBatchSegmentJobsRequest): Request[ListBatchSegmentJobsResponse, AWSError] = js.native
  def listBatchSegmentJobs(
    params: ListBatchSegmentJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBatchSegmentJobsResponse, Unit]
  ): Request[ListBatchSegmentJobsResponse, AWSError] = js.native
  
  /**
    * Returns a list of campaigns that use the given solution. When a solution is not specified, all the campaigns associated with the account are listed. The response provides the properties for each campaign, including the Amazon Resource Name (ARN). For more information on campaigns, see CreateCampaign.
    */
  def listCampaigns(): Request[ListCampaignsResponse, AWSError] = js.native
  def listCampaigns(callback: js.Function2[/* err */ AWSError, /* data */ ListCampaignsResponse, Unit]): Request[ListCampaignsResponse, AWSError] = js.native
  /**
    * Returns a list of campaigns that use the given solution. When a solution is not specified, all the campaigns associated with the account are listed. The response provides the properties for each campaign, including the Amazon Resource Name (ARN). For more information on campaigns, see CreateCampaign.
    */
  def listCampaigns(params: ListCampaignsRequest): Request[ListCampaignsResponse, AWSError] = js.native
  def listCampaigns(
    params: ListCampaignsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCampaignsResponse, Unit]
  ): Request[ListCampaignsResponse, AWSError] = js.native
  
  /**
    * Returns a list of dataset export jobs that use the given dataset. When a dataset is not specified, all the dataset export jobs associated with the account are listed. The response provides the properties for each dataset export job, including the Amazon Resource Name (ARN). For more information on dataset export jobs, see CreateDatasetExportJob. For more information on datasets, see CreateDataset.
    */
  def listDatasetExportJobs(): Request[ListDatasetExportJobsResponse, AWSError] = js.native
  def listDatasetExportJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetExportJobsResponse, Unit]): Request[ListDatasetExportJobsResponse, AWSError] = js.native
  /**
    * Returns a list of dataset export jobs that use the given dataset. When a dataset is not specified, all the dataset export jobs associated with the account are listed. The response provides the properties for each dataset export job, including the Amazon Resource Name (ARN). For more information on dataset export jobs, see CreateDatasetExportJob. For more information on datasets, see CreateDataset.
    */
  def listDatasetExportJobs(params: ListDatasetExportJobsRequest): Request[ListDatasetExportJobsResponse, AWSError] = js.native
  def listDatasetExportJobs(
    params: ListDatasetExportJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetExportJobsResponse, Unit]
  ): Request[ListDatasetExportJobsResponse, AWSError] = js.native
  
  /**
    * Returns a list of dataset groups. The response provides the properties for each dataset group, including the Amazon Resource Name (ARN). For more information on dataset groups, see CreateDatasetGroup.
    */
  def listDatasetGroups(): Request[ListDatasetGroupsResponse, AWSError] = js.native
  def listDatasetGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetGroupsResponse, Unit]): Request[ListDatasetGroupsResponse, AWSError] = js.native
  /**
    * Returns a list of dataset groups. The response provides the properties for each dataset group, including the Amazon Resource Name (ARN). For more information on dataset groups, see CreateDatasetGroup.
    */
  def listDatasetGroups(params: ListDatasetGroupsRequest): Request[ListDatasetGroupsResponse, AWSError] = js.native
  def listDatasetGroups(
    params: ListDatasetGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetGroupsResponse, Unit]
  ): Request[ListDatasetGroupsResponse, AWSError] = js.native
  
  /**
    * Returns a list of dataset import jobs that use the given dataset. When a dataset is not specified, all the dataset import jobs associated with the account are listed. The response provides the properties for each dataset import job, including the Amazon Resource Name (ARN). For more information on dataset import jobs, see CreateDatasetImportJob. For more information on datasets, see CreateDataset.
    */
  def listDatasetImportJobs(): Request[ListDatasetImportJobsResponse, AWSError] = js.native
  def listDatasetImportJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetImportJobsResponse, Unit]): Request[ListDatasetImportJobsResponse, AWSError] = js.native
  /**
    * Returns a list of dataset import jobs that use the given dataset. When a dataset is not specified, all the dataset import jobs associated with the account are listed. The response provides the properties for each dataset import job, including the Amazon Resource Name (ARN). For more information on dataset import jobs, see CreateDatasetImportJob. For more information on datasets, see CreateDataset.
    */
  def listDatasetImportJobs(params: ListDatasetImportJobsRequest): Request[ListDatasetImportJobsResponse, AWSError] = js.native
  def listDatasetImportJobs(
    params: ListDatasetImportJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetImportJobsResponse, Unit]
  ): Request[ListDatasetImportJobsResponse, AWSError] = js.native
  
  /**
    * Returns the list of datasets contained in the given dataset group. The response provides the properties for each dataset, including the Amazon Resource Name (ARN). For more information on datasets, see CreateDataset.
    */
  def listDatasets(): Request[ListDatasetsResponse, AWSError] = js.native
  def listDatasets(callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetsResponse, Unit]): Request[ListDatasetsResponse, AWSError] = js.native
  /**
    * Returns the list of datasets contained in the given dataset group. The response provides the properties for each dataset, including the Amazon Resource Name (ARN). For more information on datasets, see CreateDataset.
    */
  def listDatasets(params: ListDatasetsRequest): Request[ListDatasetsResponse, AWSError] = js.native
  def listDatasets(
    params: ListDatasetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetsResponse, Unit]
  ): Request[ListDatasetsResponse, AWSError] = js.native
  
  /**
    * Returns the list of event trackers associated with the account. The response provides the properties for each event tracker, including the Amazon Resource Name (ARN) and tracking ID. For more information on event trackers, see CreateEventTracker.
    */
  def listEventTrackers(): Request[ListEventTrackersResponse, AWSError] = js.native
  def listEventTrackers(callback: js.Function2[/* err */ AWSError, /* data */ ListEventTrackersResponse, Unit]): Request[ListEventTrackersResponse, AWSError] = js.native
  /**
    * Returns the list of event trackers associated with the account. The response provides the properties for each event tracker, including the Amazon Resource Name (ARN) and tracking ID. For more information on event trackers, see CreateEventTracker.
    */
  def listEventTrackers(params: ListEventTrackersRequest): Request[ListEventTrackersResponse, AWSError] = js.native
  def listEventTrackers(
    params: ListEventTrackersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEventTrackersResponse, Unit]
  ): Request[ListEventTrackersResponse, AWSError] = js.native
  
  /**
    * Lists all filters that belong to a given dataset group.
    */
  def listFilters(): Request[ListFiltersResponse, AWSError] = js.native
  def listFilters(callback: js.Function2[/* err */ AWSError, /* data */ ListFiltersResponse, Unit]): Request[ListFiltersResponse, AWSError] = js.native
  /**
    * Lists all filters that belong to a given dataset group.
    */
  def listFilters(params: ListFiltersRequest): Request[ListFiltersResponse, AWSError] = js.native
  def listFilters(
    params: ListFiltersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFiltersResponse, Unit]
  ): Request[ListFiltersResponse, AWSError] = js.native
  
  /**
    * Returns a list of available recipes. The response provides the properties for each recipe, including the recipe's Amazon Resource Name (ARN).
    */
  def listRecipes(): Request[ListRecipesResponse, AWSError] = js.native
  def listRecipes(callback: js.Function2[/* err */ AWSError, /* data */ ListRecipesResponse, Unit]): Request[ListRecipesResponse, AWSError] = js.native
  /**
    * Returns a list of available recipes. The response provides the properties for each recipe, including the recipe's Amazon Resource Name (ARN).
    */
  def listRecipes(params: ListRecipesRequest): Request[ListRecipesResponse, AWSError] = js.native
  def listRecipes(
    params: ListRecipesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRecipesResponse, Unit]
  ): Request[ListRecipesResponse, AWSError] = js.native
  
  /**
    * Returns a list of recommenders in a given Domain dataset group. When a Domain dataset group is not specified, all the recommenders associated with the account are listed. The response provides the properties for each recommender, including the Amazon Resource Name (ARN). For more information on recommenders, see CreateRecommender.
    */
  def listRecommenders(): Request[ListRecommendersResponse, AWSError] = js.native
  def listRecommenders(callback: js.Function2[/* err */ AWSError, /* data */ ListRecommendersResponse, Unit]): Request[ListRecommendersResponse, AWSError] = js.native
  /**
    * Returns a list of recommenders in a given Domain dataset group. When a Domain dataset group is not specified, all the recommenders associated with the account are listed. The response provides the properties for each recommender, including the Amazon Resource Name (ARN). For more information on recommenders, see CreateRecommender.
    */
  def listRecommenders(params: ListRecommendersRequest): Request[ListRecommendersResponse, AWSError] = js.native
  def listRecommenders(
    params: ListRecommendersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRecommendersResponse, Unit]
  ): Request[ListRecommendersResponse, AWSError] = js.native
  
  /**
    * Returns the list of schemas associated with the account. The response provides the properties for each schema, including the Amazon Resource Name (ARN). For more information on schemas, see CreateSchema.
    */
  def listSchemas(): Request[ListSchemasResponse, AWSError] = js.native
  def listSchemas(callback: js.Function2[/* err */ AWSError, /* data */ ListSchemasResponse, Unit]): Request[ListSchemasResponse, AWSError] = js.native
  /**
    * Returns the list of schemas associated with the account. The response provides the properties for each schema, including the Amazon Resource Name (ARN). For more information on schemas, see CreateSchema.
    */
  def listSchemas(params: ListSchemasRequest): Request[ListSchemasResponse, AWSError] = js.native
  def listSchemas(
    params: ListSchemasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSchemasResponse, Unit]
  ): Request[ListSchemasResponse, AWSError] = js.native
  
  /**
    * Returns a list of solution versions for the given solution. When a solution is not specified, all the solution versions associated with the account are listed. The response provides the properties for each solution version, including the Amazon Resource Name (ARN).
    */
  def listSolutionVersions(): Request[ListSolutionVersionsResponse, AWSError] = js.native
  def listSolutionVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListSolutionVersionsResponse, Unit]): Request[ListSolutionVersionsResponse, AWSError] = js.native
  /**
    * Returns a list of solution versions for the given solution. When a solution is not specified, all the solution versions associated with the account are listed. The response provides the properties for each solution version, including the Amazon Resource Name (ARN).
    */
  def listSolutionVersions(params: ListSolutionVersionsRequest): Request[ListSolutionVersionsResponse, AWSError] = js.native
  def listSolutionVersions(
    params: ListSolutionVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSolutionVersionsResponse, Unit]
  ): Request[ListSolutionVersionsResponse, AWSError] = js.native
  
  /**
    * Returns a list of solutions that use the given dataset group. When a dataset group is not specified, all the solutions associated with the account are listed. The response provides the properties for each solution, including the Amazon Resource Name (ARN). For more information on solutions, see CreateSolution.
    */
  def listSolutions(): Request[ListSolutionsResponse, AWSError] = js.native
  def listSolutions(callback: js.Function2[/* err */ AWSError, /* data */ ListSolutionsResponse, Unit]): Request[ListSolutionsResponse, AWSError] = js.native
  /**
    * Returns a list of solutions that use the given dataset group. When a dataset group is not specified, all the solutions associated with the account are listed. The response provides the properties for each solution, including the Amazon Resource Name (ARN). For more information on solutions, see CreateSolution.
    */
  def listSolutions(params: ListSolutionsRequest): Request[ListSolutionsResponse, AWSError] = js.native
  def listSolutions(
    params: ListSolutionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSolutionsResponse, Unit]
  ): Request[ListSolutionsResponse, AWSError] = js.native
  
  /**
    * Get a list of tags attached to a resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Get a list of tags attached to a resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Starts a recommender that is INACTIVE. Starting a recommender does not create any new models, but resumes billing and automatic retraining for the recommender.
    */
  def startRecommender(): Request[StartRecommenderResponse, AWSError] = js.native
  def startRecommender(callback: js.Function2[/* err */ AWSError, /* data */ StartRecommenderResponse, Unit]): Request[StartRecommenderResponse, AWSError] = js.native
  /**
    * Starts a recommender that is INACTIVE. Starting a recommender does not create any new models, but resumes billing and automatic retraining for the recommender.
    */
  def startRecommender(params: StartRecommenderRequest): Request[StartRecommenderResponse, AWSError] = js.native
  def startRecommender(
    params: StartRecommenderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartRecommenderResponse, Unit]
  ): Request[StartRecommenderResponse, AWSError] = js.native
  
  /**
    * Stops a recommender that is ACTIVE. Stopping a recommender halts billing and automatic retraining for the recommender.
    */
  def stopRecommender(): Request[StopRecommenderResponse, AWSError] = js.native
  def stopRecommender(callback: js.Function2[/* err */ AWSError, /* data */ StopRecommenderResponse, Unit]): Request[StopRecommenderResponse, AWSError] = js.native
  /**
    * Stops a recommender that is ACTIVE. Stopping a recommender halts billing and automatic retraining for the recommender.
    */
  def stopRecommender(params: StopRecommenderRequest): Request[StopRecommenderResponse, AWSError] = js.native
  def stopRecommender(
    params: StopRecommenderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopRecommenderResponse, Unit]
  ): Request[StopRecommenderResponse, AWSError] = js.native
  
  /**
    * Stops creating a solution version that is in a state of CREATE_PENDING or CREATE IN_PROGRESS.  Depending on the current state of the solution version, the solution version state changes as follows:   CREATE_PENDING &gt; CREATE_STOPPED or   CREATE_IN_PROGRESS &gt; CREATE_STOPPING &gt; CREATE_STOPPED   You are billed for all of the training completed up until you stop the solution version creation. You cannot resume creating a solution version once it has been stopped.
    */
  def stopSolutionVersionCreation(): Request[js.Object, AWSError] = js.native
  def stopSolutionVersionCreation(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Stops creating a solution version that is in a state of CREATE_PENDING or CREATE IN_PROGRESS.  Depending on the current state of the solution version, the solution version state changes as follows:   CREATE_PENDING &gt; CREATE_STOPPED or   CREATE_IN_PROGRESS &gt; CREATE_STOPPING &gt; CREATE_STOPPED   You are billed for all of the training completed up until you stop the solution version creation. You cannot resume creating a solution version once it has been stopped.
    */
  def stopSolutionVersionCreation(params: StopSolutionVersionCreationRequest): Request[js.Object, AWSError] = js.native
  def stopSolutionVersionCreation(
    params: StopSolutionVersionCreationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Add a list of tags to a resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Add a list of tags to a resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Remove tags that are attached to a resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Remove tags that are attached to a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates a campaign by either deploying a new solution or changing the value of the campaign's minProvisionedTPS parameter. To update a campaign, the campaign status must be ACTIVE or CREATE FAILED. Check the campaign status using the DescribeCampaign operation.  You can still get recommendations from a campaign while an update is in progress. The campaign will use the previous solution version and campaign configuration to generate recommendations until the latest campaign update status is Active.   For more information on campaigns, see CreateCampaign.
    */
  def updateCampaign(): Request[UpdateCampaignResponse, AWSError] = js.native
  def updateCampaign(callback: js.Function2[/* err */ AWSError, /* data */ UpdateCampaignResponse, Unit]): Request[UpdateCampaignResponse, AWSError] = js.native
  /**
    * Updates a campaign by either deploying a new solution or changing the value of the campaign's minProvisionedTPS parameter. To update a campaign, the campaign status must be ACTIVE or CREATE FAILED. Check the campaign status using the DescribeCampaign operation.  You can still get recommendations from a campaign while an update is in progress. The campaign will use the previous solution version and campaign configuration to generate recommendations until the latest campaign update status is Active.   For more information on campaigns, see CreateCampaign.
    */
  def updateCampaign(params: UpdateCampaignRequest): Request[UpdateCampaignResponse, AWSError] = js.native
  def updateCampaign(
    params: UpdateCampaignRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateCampaignResponse, Unit]
  ): Request[UpdateCampaignResponse, AWSError] = js.native
  
  /**
    * Updates the recommender to modify the recommender configuration.
    */
  def updateRecommender(): Request[UpdateRecommenderResponse, AWSError] = js.native
  def updateRecommender(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRecommenderResponse, Unit]): Request[UpdateRecommenderResponse, AWSError] = js.native
  /**
    * Updates the recommender to modify the recommender configuration.
    */
  def updateRecommender(params: UpdateRecommenderRequest): Request[UpdateRecommenderResponse, AWSError] = js.native
  def updateRecommender(
    params: UpdateRecommenderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRecommenderResponse, Unit]
  ): Request[UpdateRecommenderResponse, AWSError] = js.native
}
