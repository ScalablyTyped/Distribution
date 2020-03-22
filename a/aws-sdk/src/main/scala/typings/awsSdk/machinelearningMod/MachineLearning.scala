package typings.awsSdk.machinelearningMod

import typings.awsSdk.DescribeBatchPredictionsI
import typings.awsSdk.DescribeDataSourcesInputw
import typings.awsSdk.DescribeEvaluationsInputw
import typings.awsSdk.DescribeMLModelsInputwait
import typings.awsSdk.awsSdkStrings.batchPredictionAvailable
import typings.awsSdk.awsSdkStrings.dataSourceAvailable
import typings.awsSdk.awsSdkStrings.evaluationAvailable
import typings.awsSdk.awsSdkStrings.mLModelAvailable
import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MachineLearning extends Service {
  @JSName("config")
  var config_MachineLearning: ConfigBase with ClientConfiguration = js.native
  /**
    * Adds one or more tags to an object, up to a limit of 10. Each tag consists of a key and an optional value. If you add a tag using a key that is already associated with the ML object, AddTags updates the tag's value.
    */
  def addTags(): Request[AddTagsOutput, AWSError] = js.native
  def addTags(callback: js.Function2[/* err */ AWSError, /* data */ AddTagsOutput, Unit]): Request[AddTagsOutput, AWSError] = js.native
  /**
    * Adds one or more tags to an object, up to a limit of 10. Each tag consists of a key and an optional value. If you add a tag using a key that is already associated with the ML object, AddTags updates the tag's value.
    */
  def addTags(params: AddTagsInput): Request[AddTagsOutput, AWSError] = js.native
  def addTags(params: AddTagsInput, callback: js.Function2[/* err */ AWSError, /* data */ AddTagsOutput, Unit]): Request[AddTagsOutput, AWSError] = js.native
  /**
    * Generates predictions for a group of observations. The observations to process exist in one or more data files referenced by a DataSource. This operation creates a new BatchPrediction, and uses an MLModel and the data files referenced by the DataSource as information sources.  CreateBatchPrediction is an asynchronous operation. In response to CreateBatchPrediction, Amazon Machine Learning (Amazon ML) immediately returns and sets the BatchPrediction status to PENDING. After the BatchPrediction completes, Amazon ML sets the status to COMPLETED.  You can poll for status updates by using the GetBatchPrediction operation and checking the Status parameter of the result. After the COMPLETED status appears, the results are available in the location specified by the OutputUri parameter.
    */
  def createBatchPrediction(): Request[CreateBatchPredictionOutput, AWSError] = js.native
  def createBatchPrediction(callback: js.Function2[/* err */ AWSError, /* data */ CreateBatchPredictionOutput, Unit]): Request[CreateBatchPredictionOutput, AWSError] = js.native
  /**
    * Generates predictions for a group of observations. The observations to process exist in one or more data files referenced by a DataSource. This operation creates a new BatchPrediction, and uses an MLModel and the data files referenced by the DataSource as information sources.  CreateBatchPrediction is an asynchronous operation. In response to CreateBatchPrediction, Amazon Machine Learning (Amazon ML) immediately returns and sets the BatchPrediction status to PENDING. After the BatchPrediction completes, Amazon ML sets the status to COMPLETED.  You can poll for status updates by using the GetBatchPrediction operation and checking the Status parameter of the result. After the COMPLETED status appears, the results are available in the location specified by the OutputUri parameter.
    */
  def createBatchPrediction(params: CreateBatchPredictionInput): Request[CreateBatchPredictionOutput, AWSError] = js.native
  def createBatchPrediction(
    params: CreateBatchPredictionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateBatchPredictionOutput, Unit]
  ): Request[CreateBatchPredictionOutput, AWSError] = js.native
  /**
    * Creates a DataSource object from an  Amazon Relational Database Service (Amazon RDS). A DataSource references data that can be used to perform CreateMLModel, CreateEvaluation, or CreateBatchPrediction operations. CreateDataSourceFromRDS is an asynchronous operation. In response to CreateDataSourceFromRDS, Amazon Machine Learning (Amazon ML) immediately returns and sets the DataSource status to PENDING. After the DataSource is created and ready for use, Amazon ML sets the Status parameter to COMPLETED. DataSource in the COMPLETED or PENDING state can be used only to perform &gt;CreateMLModel&gt;, CreateEvaluation, or CreateBatchPrediction operations.   If Amazon ML cannot accept the input source, it sets the Status parameter to FAILED and includes an error message in the Message attribute of the GetDataSource operation response. 
    */
  def createDataSourceFromRDS(): Request[CreateDataSourceFromRDSOutput, AWSError] = js.native
  def createDataSourceFromRDS(callback: js.Function2[/* err */ AWSError, /* data */ CreateDataSourceFromRDSOutput, Unit]): Request[CreateDataSourceFromRDSOutput, AWSError] = js.native
  /**
    * Creates a DataSource object from an  Amazon Relational Database Service (Amazon RDS). A DataSource references data that can be used to perform CreateMLModel, CreateEvaluation, or CreateBatchPrediction operations. CreateDataSourceFromRDS is an asynchronous operation. In response to CreateDataSourceFromRDS, Amazon Machine Learning (Amazon ML) immediately returns and sets the DataSource status to PENDING. After the DataSource is created and ready for use, Amazon ML sets the Status parameter to COMPLETED. DataSource in the COMPLETED or PENDING state can be used only to perform &gt;CreateMLModel&gt;, CreateEvaluation, or CreateBatchPrediction operations.   If Amazon ML cannot accept the input source, it sets the Status parameter to FAILED and includes an error message in the Message attribute of the GetDataSource operation response. 
    */
  def createDataSourceFromRDS(params: CreateDataSourceFromRDSInput): Request[CreateDataSourceFromRDSOutput, AWSError] = js.native
  def createDataSourceFromRDS(
    params: CreateDataSourceFromRDSInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDataSourceFromRDSOutput, Unit]
  ): Request[CreateDataSourceFromRDSOutput, AWSError] = js.native
  /**
    * Creates a DataSource from a database hosted on an Amazon Redshift cluster. A DataSource references data that can be used to perform either CreateMLModel, CreateEvaluation, or CreateBatchPrediction operations. CreateDataSourceFromRedshift is an asynchronous operation. In response to CreateDataSourceFromRedshift, Amazon Machine Learning (Amazon ML) immediately returns and sets the DataSource status to PENDING. After the DataSource is created and ready for use, Amazon ML sets the Status parameter to COMPLETED. DataSource in COMPLETED or PENDING states can be used to perform only CreateMLModel, CreateEvaluation, or CreateBatchPrediction operations.   If Amazon ML can't accept the input source, it sets the Status parameter to FAILED and includes an error message in the Message attribute of the GetDataSource operation response.  The observations should be contained in the database hosted on an Amazon Redshift cluster and should be specified by a SelectSqlQuery query. Amazon ML executes an Unload command in Amazon Redshift to transfer the result set of the SelectSqlQuery query to S3StagingLocation. After the DataSource has been created, it's ready for use in evaluations and batch predictions. If you plan to use the DataSource to train an MLModel, the DataSource also requires a recipe. A recipe describes how each input variable will be used in training an MLModel. Will the variable be included or excluded from training? Will the variable be manipulated; for example, will it be combined with another variable or will it be split apart into word combinations? The recipe provides answers to these questions. You can't change an existing datasource, but you can copy and modify the settings from an existing Amazon Redshift datasource to create a new datasource. To do so, call GetDataSource for an existing datasource and copy the values to a CreateDataSource call. Change the settings that you want to change and make sure that all required fields have the appropriate values. 
    */
  def createDataSourceFromRedshift(): Request[CreateDataSourceFromRedshiftOutput, AWSError] = js.native
  def createDataSourceFromRedshift(callback: js.Function2[/* err */ AWSError, /* data */ CreateDataSourceFromRedshiftOutput, Unit]): Request[CreateDataSourceFromRedshiftOutput, AWSError] = js.native
  /**
    * Creates a DataSource from a database hosted on an Amazon Redshift cluster. A DataSource references data that can be used to perform either CreateMLModel, CreateEvaluation, or CreateBatchPrediction operations. CreateDataSourceFromRedshift is an asynchronous operation. In response to CreateDataSourceFromRedshift, Amazon Machine Learning (Amazon ML) immediately returns and sets the DataSource status to PENDING. After the DataSource is created and ready for use, Amazon ML sets the Status parameter to COMPLETED. DataSource in COMPLETED or PENDING states can be used to perform only CreateMLModel, CreateEvaluation, or CreateBatchPrediction operations.   If Amazon ML can't accept the input source, it sets the Status parameter to FAILED and includes an error message in the Message attribute of the GetDataSource operation response.  The observations should be contained in the database hosted on an Amazon Redshift cluster and should be specified by a SelectSqlQuery query. Amazon ML executes an Unload command in Amazon Redshift to transfer the result set of the SelectSqlQuery query to S3StagingLocation. After the DataSource has been created, it's ready for use in evaluations and batch predictions. If you plan to use the DataSource to train an MLModel, the DataSource also requires a recipe. A recipe describes how each input variable will be used in training an MLModel. Will the variable be included or excluded from training? Will the variable be manipulated; for example, will it be combined with another variable or will it be split apart into word combinations? The recipe provides answers to these questions. You can't change an existing datasource, but you can copy and modify the settings from an existing Amazon Redshift datasource to create a new datasource. To do so, call GetDataSource for an existing datasource and copy the values to a CreateDataSource call. Change the settings that you want to change and make sure that all required fields have the appropriate values. 
    */
  def createDataSourceFromRedshift(params: CreateDataSourceFromRedshiftInput): Request[CreateDataSourceFromRedshiftOutput, AWSError] = js.native
  def createDataSourceFromRedshift(
    params: CreateDataSourceFromRedshiftInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDataSourceFromRedshiftOutput, Unit]
  ): Request[CreateDataSourceFromRedshiftOutput, AWSError] = js.native
  /**
    * Creates a DataSource object. A DataSource references data that can be used to perform CreateMLModel, CreateEvaluation, or CreateBatchPrediction operations. CreateDataSourceFromS3 is an asynchronous operation. In response to CreateDataSourceFromS3, Amazon Machine Learning (Amazon ML) immediately returns and sets the DataSource status to PENDING. After the DataSource has been created and is ready for use, Amazon ML sets the Status parameter to COMPLETED. DataSource in the COMPLETED or PENDING state can be used to perform only CreateMLModel, CreateEvaluation or CreateBatchPrediction operations.   If Amazon ML can't accept the input source, it sets the Status parameter to FAILED and includes an error message in the Message attribute of the GetDataSource operation response.  The observation data used in a DataSource should be ready to use; that is, it should have a consistent structure, and missing data values should be kept to a minimum. The observation data must reside in one or more .csv files in an Amazon Simple Storage Service (Amazon S3) location, along with a schema that describes the data items by name and type. The same schema must be used for all of the data files referenced by the DataSource.  After the DataSource has been created, it's ready to use in evaluations and batch predictions. If you plan to use the DataSource to train an MLModel, the DataSource also needs a recipe. A recipe describes how each input variable will be used in training an MLModel. Will the variable be included or excluded from training? Will the variable be manipulated; for example, will it be combined with another variable or will it be split apart into word combinations? The recipe provides answers to these questions.
    */
  def createDataSourceFromS3(): Request[CreateDataSourceFromS3Output, AWSError] = js.native
  def createDataSourceFromS3(callback: js.Function2[/* err */ AWSError, /* data */ CreateDataSourceFromS3Output, Unit]): Request[CreateDataSourceFromS3Output, AWSError] = js.native
  /**
    * Creates a DataSource object. A DataSource references data that can be used to perform CreateMLModel, CreateEvaluation, or CreateBatchPrediction operations. CreateDataSourceFromS3 is an asynchronous operation. In response to CreateDataSourceFromS3, Amazon Machine Learning (Amazon ML) immediately returns and sets the DataSource status to PENDING. After the DataSource has been created and is ready for use, Amazon ML sets the Status parameter to COMPLETED. DataSource in the COMPLETED or PENDING state can be used to perform only CreateMLModel, CreateEvaluation or CreateBatchPrediction operations.   If Amazon ML can't accept the input source, it sets the Status parameter to FAILED and includes an error message in the Message attribute of the GetDataSource operation response.  The observation data used in a DataSource should be ready to use; that is, it should have a consistent structure, and missing data values should be kept to a minimum. The observation data must reside in one or more .csv files in an Amazon Simple Storage Service (Amazon S3) location, along with a schema that describes the data items by name and type. The same schema must be used for all of the data files referenced by the DataSource.  After the DataSource has been created, it's ready to use in evaluations and batch predictions. If you plan to use the DataSource to train an MLModel, the DataSource also needs a recipe. A recipe describes how each input variable will be used in training an MLModel. Will the variable be included or excluded from training? Will the variable be manipulated; for example, will it be combined with another variable or will it be split apart into word combinations? The recipe provides answers to these questions.
    */
  def createDataSourceFromS3(params: CreateDataSourceFromS3Input): Request[CreateDataSourceFromS3Output, AWSError] = js.native
  def createDataSourceFromS3(
    params: CreateDataSourceFromS3Input,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDataSourceFromS3Output, Unit]
  ): Request[CreateDataSourceFromS3Output, AWSError] = js.native
  /**
    * Creates a new Evaluation of an MLModel. An MLModel is evaluated on a set of observations associated to a DataSource. Like a DataSource for an MLModel, the DataSource for an Evaluation contains values for the Target Variable. The Evaluation compares the predicted result for each observation to the actual outcome and provides a summary so that you know how effective the MLModel functions on the test data. Evaluation generates a relevant performance metric, such as BinaryAUC, RegressionRMSE or MulticlassAvgFScore based on the corresponding MLModelType: BINARY, REGRESSION or MULTICLASS.  CreateEvaluation is an asynchronous operation. In response to CreateEvaluation, Amazon Machine Learning (Amazon ML) immediately returns and sets the evaluation status to PENDING. After the Evaluation is created and ready for use, Amazon ML sets the status to COMPLETED.  You can use the GetEvaluation operation to check progress of the evaluation during the creation operation.
    */
  def createEvaluation(): Request[CreateEvaluationOutput, AWSError] = js.native
  def createEvaluation(callback: js.Function2[/* err */ AWSError, /* data */ CreateEvaluationOutput, Unit]): Request[CreateEvaluationOutput, AWSError] = js.native
  /**
    * Creates a new Evaluation of an MLModel. An MLModel is evaluated on a set of observations associated to a DataSource. Like a DataSource for an MLModel, the DataSource for an Evaluation contains values for the Target Variable. The Evaluation compares the predicted result for each observation to the actual outcome and provides a summary so that you know how effective the MLModel functions on the test data. Evaluation generates a relevant performance metric, such as BinaryAUC, RegressionRMSE or MulticlassAvgFScore based on the corresponding MLModelType: BINARY, REGRESSION or MULTICLASS.  CreateEvaluation is an asynchronous operation. In response to CreateEvaluation, Amazon Machine Learning (Amazon ML) immediately returns and sets the evaluation status to PENDING. After the Evaluation is created and ready for use, Amazon ML sets the status to COMPLETED.  You can use the GetEvaluation operation to check progress of the evaluation during the creation operation.
    */
  def createEvaluation(params: CreateEvaluationInput): Request[CreateEvaluationOutput, AWSError] = js.native
  def createEvaluation(
    params: CreateEvaluationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEvaluationOutput, Unit]
  ): Request[CreateEvaluationOutput, AWSError] = js.native
  /**
    * Creates a new MLModel using the DataSource and the recipe as information sources.  An MLModel is nearly immutable. Users can update only the MLModelName and the ScoreThreshold in an MLModel without creating a new MLModel.  CreateMLModel is an asynchronous operation. In response to CreateMLModel, Amazon Machine Learning (Amazon ML) immediately returns and sets the MLModel status to PENDING. After the MLModel has been created and ready is for use, Amazon ML sets the status to COMPLETED.  You can use the GetMLModel operation to check the progress of the MLModel during the creation operation.  CreateMLModel requires a DataSource with computed statistics, which can be created by setting ComputeStatistics to true in CreateDataSourceFromRDS, CreateDataSourceFromS3, or CreateDataSourceFromRedshift operations. 
    */
  def createMLModel(): Request[CreateMLModelOutput, AWSError] = js.native
  def createMLModel(callback: js.Function2[/* err */ AWSError, /* data */ CreateMLModelOutput, Unit]): Request[CreateMLModelOutput, AWSError] = js.native
  /**
    * Creates a new MLModel using the DataSource and the recipe as information sources.  An MLModel is nearly immutable. Users can update only the MLModelName and the ScoreThreshold in an MLModel without creating a new MLModel.  CreateMLModel is an asynchronous operation. In response to CreateMLModel, Amazon Machine Learning (Amazon ML) immediately returns and sets the MLModel status to PENDING. After the MLModel has been created and ready is for use, Amazon ML sets the status to COMPLETED.  You can use the GetMLModel operation to check the progress of the MLModel during the creation operation.  CreateMLModel requires a DataSource with computed statistics, which can be created by setting ComputeStatistics to true in CreateDataSourceFromRDS, CreateDataSourceFromS3, or CreateDataSourceFromRedshift operations. 
    */
  def createMLModel(params: CreateMLModelInput): Request[CreateMLModelOutput, AWSError] = js.native
  def createMLModel(
    params: CreateMLModelInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMLModelOutput, Unit]
  ): Request[CreateMLModelOutput, AWSError] = js.native
  /**
    * Creates a real-time endpoint for the MLModel. The endpoint contains the URI of the MLModel; that is, the location to send real-time prediction requests for the specified MLModel.
    */
  def createRealtimeEndpoint(): Request[CreateRealtimeEndpointOutput, AWSError] = js.native
  def createRealtimeEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ CreateRealtimeEndpointOutput, Unit]): Request[CreateRealtimeEndpointOutput, AWSError] = js.native
  /**
    * Creates a real-time endpoint for the MLModel. The endpoint contains the URI of the MLModel; that is, the location to send real-time prediction requests for the specified MLModel.
    */
  def createRealtimeEndpoint(params: CreateRealtimeEndpointInput): Request[CreateRealtimeEndpointOutput, AWSError] = js.native
  def createRealtimeEndpoint(
    params: CreateRealtimeEndpointInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRealtimeEndpointOutput, Unit]
  ): Request[CreateRealtimeEndpointOutput, AWSError] = js.native
  /**
    * Assigns the DELETED status to a BatchPrediction, rendering it unusable. After using the DeleteBatchPrediction operation, you can use the GetBatchPrediction operation to verify that the status of the BatchPrediction changed to DELETED. Caution: The result of the DeleteBatchPrediction operation is irreversible.
    */
  def deleteBatchPrediction(): Request[DeleteBatchPredictionOutput, AWSError] = js.native
  def deleteBatchPrediction(callback: js.Function2[/* err */ AWSError, /* data */ DeleteBatchPredictionOutput, Unit]): Request[DeleteBatchPredictionOutput, AWSError] = js.native
  /**
    * Assigns the DELETED status to a BatchPrediction, rendering it unusable. After using the DeleteBatchPrediction operation, you can use the GetBatchPrediction operation to verify that the status of the BatchPrediction changed to DELETED. Caution: The result of the DeleteBatchPrediction operation is irreversible.
    */
  def deleteBatchPrediction(params: DeleteBatchPredictionInput): Request[DeleteBatchPredictionOutput, AWSError] = js.native
  def deleteBatchPrediction(
    params: DeleteBatchPredictionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteBatchPredictionOutput, Unit]
  ): Request[DeleteBatchPredictionOutput, AWSError] = js.native
  /**
    * Assigns the DELETED status to a DataSource, rendering it unusable. After using the DeleteDataSource operation, you can use the GetDataSource operation to verify that the status of the DataSource changed to DELETED. Caution: The results of the DeleteDataSource operation are irreversible.
    */
  def deleteDataSource(): Request[DeleteDataSourceOutput, AWSError] = js.native
  def deleteDataSource(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDataSourceOutput, Unit]): Request[DeleteDataSourceOutput, AWSError] = js.native
  /**
    * Assigns the DELETED status to a DataSource, rendering it unusable. After using the DeleteDataSource operation, you can use the GetDataSource operation to verify that the status of the DataSource changed to DELETED. Caution: The results of the DeleteDataSource operation are irreversible.
    */
  def deleteDataSource(params: DeleteDataSourceInput): Request[DeleteDataSourceOutput, AWSError] = js.native
  def deleteDataSource(
    params: DeleteDataSourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDataSourceOutput, Unit]
  ): Request[DeleteDataSourceOutput, AWSError] = js.native
  /**
    * Assigns the DELETED status to an Evaluation, rendering it unusable. After invoking the DeleteEvaluation operation, you can use the GetEvaluation operation to verify that the status of the Evaluation changed to DELETED. Caution The results of the DeleteEvaluation operation are irreversible.
    */
  def deleteEvaluation(): Request[DeleteEvaluationOutput, AWSError] = js.native
  def deleteEvaluation(callback: js.Function2[/* err */ AWSError, /* data */ DeleteEvaluationOutput, Unit]): Request[DeleteEvaluationOutput, AWSError] = js.native
  /**
    * Assigns the DELETED status to an Evaluation, rendering it unusable. After invoking the DeleteEvaluation operation, you can use the GetEvaluation operation to verify that the status of the Evaluation changed to DELETED. Caution The results of the DeleteEvaluation operation are irreversible.
    */
  def deleteEvaluation(params: DeleteEvaluationInput): Request[DeleteEvaluationOutput, AWSError] = js.native
  def deleteEvaluation(
    params: DeleteEvaluationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEvaluationOutput, Unit]
  ): Request[DeleteEvaluationOutput, AWSError] = js.native
  /**
    * Assigns the DELETED status to an MLModel, rendering it unusable. After using the DeleteMLModel operation, you can use the GetMLModel operation to verify that the status of the MLModel changed to DELETED. Caution: The result of the DeleteMLModel operation is irreversible.
    */
  def deleteMLModel(): Request[DeleteMLModelOutput, AWSError] = js.native
  def deleteMLModel(callback: js.Function2[/* err */ AWSError, /* data */ DeleteMLModelOutput, Unit]): Request[DeleteMLModelOutput, AWSError] = js.native
  /**
    * Assigns the DELETED status to an MLModel, rendering it unusable. After using the DeleteMLModel operation, you can use the GetMLModel operation to verify that the status of the MLModel changed to DELETED. Caution: The result of the DeleteMLModel operation is irreversible.
    */
  def deleteMLModel(params: DeleteMLModelInput): Request[DeleteMLModelOutput, AWSError] = js.native
  def deleteMLModel(
    params: DeleteMLModelInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteMLModelOutput, Unit]
  ): Request[DeleteMLModelOutput, AWSError] = js.native
  /**
    * Deletes a real time endpoint of an MLModel.
    */
  def deleteRealtimeEndpoint(): Request[DeleteRealtimeEndpointOutput, AWSError] = js.native
  def deleteRealtimeEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRealtimeEndpointOutput, Unit]): Request[DeleteRealtimeEndpointOutput, AWSError] = js.native
  /**
    * Deletes a real time endpoint of an MLModel.
    */
  def deleteRealtimeEndpoint(params: DeleteRealtimeEndpointInput): Request[DeleteRealtimeEndpointOutput, AWSError] = js.native
  def deleteRealtimeEndpoint(
    params: DeleteRealtimeEndpointInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRealtimeEndpointOutput, Unit]
  ): Request[DeleteRealtimeEndpointOutput, AWSError] = js.native
  /**
    * Deletes the specified tags associated with an ML object. After this operation is complete, you can't recover deleted tags. If you specify a tag that doesn't exist, Amazon ML ignores it.
    */
  def deleteTags(): Request[DeleteTagsOutput, AWSError] = js.native
  def deleteTags(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTagsOutput, Unit]): Request[DeleteTagsOutput, AWSError] = js.native
  /**
    * Deletes the specified tags associated with an ML object. After this operation is complete, you can't recover deleted tags. If you specify a tag that doesn't exist, Amazon ML ignores it.
    */
  def deleteTags(params: DeleteTagsInput): Request[DeleteTagsOutput, AWSError] = js.native
  def deleteTags(
    params: DeleteTagsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTagsOutput, Unit]
  ): Request[DeleteTagsOutput, AWSError] = js.native
  /**
    * Returns a list of BatchPrediction operations that match the search criteria in the request.
    */
  def describeBatchPredictions(): Request[DescribeBatchPredictionsOutput, AWSError] = js.native
  def describeBatchPredictions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeBatchPredictionsOutput, Unit]): Request[DescribeBatchPredictionsOutput, AWSError] = js.native
  /**
    * Returns a list of BatchPrediction operations that match the search criteria in the request.
    */
  def describeBatchPredictions(params: DescribeBatchPredictionsInput): Request[DescribeBatchPredictionsOutput, AWSError] = js.native
  def describeBatchPredictions(
    params: DescribeBatchPredictionsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeBatchPredictionsOutput, Unit]
  ): Request[DescribeBatchPredictionsOutput, AWSError] = js.native
  /**
    * Returns a list of DataSource that match the search criteria in the request.
    */
  def describeDataSources(): Request[DescribeDataSourcesOutput, AWSError] = js.native
  def describeDataSources(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataSourcesOutput, Unit]): Request[DescribeDataSourcesOutput, AWSError] = js.native
  /**
    * Returns a list of DataSource that match the search criteria in the request.
    */
  def describeDataSources(params: DescribeDataSourcesInput): Request[DescribeDataSourcesOutput, AWSError] = js.native
  def describeDataSources(
    params: DescribeDataSourcesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataSourcesOutput, Unit]
  ): Request[DescribeDataSourcesOutput, AWSError] = js.native
  /**
    * Returns a list of DescribeEvaluations that match the search criteria in the request.
    */
  def describeEvaluations(): Request[DescribeEvaluationsOutput, AWSError] = js.native
  def describeEvaluations(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEvaluationsOutput, Unit]): Request[DescribeEvaluationsOutput, AWSError] = js.native
  /**
    * Returns a list of DescribeEvaluations that match the search criteria in the request.
    */
  def describeEvaluations(params: DescribeEvaluationsInput): Request[DescribeEvaluationsOutput, AWSError] = js.native
  def describeEvaluations(
    params: DescribeEvaluationsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEvaluationsOutput, Unit]
  ): Request[DescribeEvaluationsOutput, AWSError] = js.native
  /**
    * Returns a list of MLModel that match the search criteria in the request.
    */
  def describeMLModels(): Request[DescribeMLModelsOutput, AWSError] = js.native
  def describeMLModels(callback: js.Function2[/* err */ AWSError, /* data */ DescribeMLModelsOutput, Unit]): Request[DescribeMLModelsOutput, AWSError] = js.native
  /**
    * Returns a list of MLModel that match the search criteria in the request.
    */
  def describeMLModels(params: DescribeMLModelsInput): Request[DescribeMLModelsOutput, AWSError] = js.native
  def describeMLModels(
    params: DescribeMLModelsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMLModelsOutput, Unit]
  ): Request[DescribeMLModelsOutput, AWSError] = js.native
  /**
    * Describes one or more of the tags for your Amazon ML object.
    */
  def describeTags(): Request[DescribeTagsOutput, AWSError] = js.native
  def describeTags(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTagsOutput, Unit]): Request[DescribeTagsOutput, AWSError] = js.native
  /**
    * Describes one or more of the tags for your Amazon ML object.
    */
  def describeTags(params: DescribeTagsInput): Request[DescribeTagsOutput, AWSError] = js.native
  def describeTags(
    params: DescribeTagsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTagsOutput, Unit]
  ): Request[DescribeTagsOutput, AWSError] = js.native
  /**
    * Returns a BatchPrediction that includes detailed metadata, status, and data file information for a Batch Prediction request.
    */
  def getBatchPrediction(): Request[GetBatchPredictionOutput, AWSError] = js.native
  def getBatchPrediction(callback: js.Function2[/* err */ AWSError, /* data */ GetBatchPredictionOutput, Unit]): Request[GetBatchPredictionOutput, AWSError] = js.native
  /**
    * Returns a BatchPrediction that includes detailed metadata, status, and data file information for a Batch Prediction request.
    */
  def getBatchPrediction(params: GetBatchPredictionInput): Request[GetBatchPredictionOutput, AWSError] = js.native
  def getBatchPrediction(
    params: GetBatchPredictionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetBatchPredictionOutput, Unit]
  ): Request[GetBatchPredictionOutput, AWSError] = js.native
  /**
    * Returns a DataSource that includes metadata and data file information, as well as the current status of the DataSource. GetDataSource provides results in normal or verbose format. The verbose format adds the schema description and the list of files pointed to by the DataSource to the normal format.
    */
  def getDataSource(): Request[GetDataSourceOutput, AWSError] = js.native
  def getDataSource(callback: js.Function2[/* err */ AWSError, /* data */ GetDataSourceOutput, Unit]): Request[GetDataSourceOutput, AWSError] = js.native
  /**
    * Returns a DataSource that includes metadata and data file information, as well as the current status of the DataSource. GetDataSource provides results in normal or verbose format. The verbose format adds the schema description and the list of files pointed to by the DataSource to the normal format.
    */
  def getDataSource(params: GetDataSourceInput): Request[GetDataSourceOutput, AWSError] = js.native
  def getDataSource(
    params: GetDataSourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDataSourceOutput, Unit]
  ): Request[GetDataSourceOutput, AWSError] = js.native
  /**
    * Returns an Evaluation that includes metadata as well as the current status of the Evaluation.
    */
  def getEvaluation(): Request[GetEvaluationOutput, AWSError] = js.native
  def getEvaluation(callback: js.Function2[/* err */ AWSError, /* data */ GetEvaluationOutput, Unit]): Request[GetEvaluationOutput, AWSError] = js.native
  /**
    * Returns an Evaluation that includes metadata as well as the current status of the Evaluation.
    */
  def getEvaluation(params: GetEvaluationInput): Request[GetEvaluationOutput, AWSError] = js.native
  def getEvaluation(
    params: GetEvaluationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEvaluationOutput, Unit]
  ): Request[GetEvaluationOutput, AWSError] = js.native
  /**
    * Returns an MLModel that includes detailed metadata, data source information, and the current status of the MLModel. GetMLModel provides results in normal or verbose format. 
    */
  def getMLModel(): Request[GetMLModelOutput, AWSError] = js.native
  def getMLModel(callback: js.Function2[/* err */ AWSError, /* data */ GetMLModelOutput, Unit]): Request[GetMLModelOutput, AWSError] = js.native
  /**
    * Returns an MLModel that includes detailed metadata, data source information, and the current status of the MLModel. GetMLModel provides results in normal or verbose format. 
    */
  def getMLModel(params: GetMLModelInput): Request[GetMLModelOutput, AWSError] = js.native
  def getMLModel(
    params: GetMLModelInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMLModelOutput, Unit]
  ): Request[GetMLModelOutput, AWSError] = js.native
  /**
    * Generates a prediction for the observation using the specified ML Model. Note Not all response parameters will be populated. Whether a response parameter is populated depends on the type of model requested.
    */
  def predict(): Request[PredictOutput, AWSError] = js.native
  def predict(callback: js.Function2[/* err */ AWSError, /* data */ PredictOutput, Unit]): Request[PredictOutput, AWSError] = js.native
  /**
    * Generates a prediction for the observation using the specified ML Model. Note Not all response parameters will be populated. Whether a response parameter is populated depends on the type of model requested.
    */
  def predict(params: PredictInput): Request[PredictOutput, AWSError] = js.native
  def predict(params: PredictInput, callback: js.Function2[/* err */ AWSError, /* data */ PredictOutput, Unit]): Request[PredictOutput, AWSError] = js.native
  /**
    * Updates the BatchPredictionName of a BatchPrediction. You can use the GetBatchPrediction operation to view the contents of the updated data element.
    */
  def updateBatchPrediction(): Request[UpdateBatchPredictionOutput, AWSError] = js.native
  def updateBatchPrediction(callback: js.Function2[/* err */ AWSError, /* data */ UpdateBatchPredictionOutput, Unit]): Request[UpdateBatchPredictionOutput, AWSError] = js.native
  /**
    * Updates the BatchPredictionName of a BatchPrediction. You can use the GetBatchPrediction operation to view the contents of the updated data element.
    */
  def updateBatchPrediction(params: UpdateBatchPredictionInput): Request[UpdateBatchPredictionOutput, AWSError] = js.native
  def updateBatchPrediction(
    params: UpdateBatchPredictionInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateBatchPredictionOutput, Unit]
  ): Request[UpdateBatchPredictionOutput, AWSError] = js.native
  /**
    * Updates the DataSourceName of a DataSource. You can use the GetDataSource operation to view the contents of the updated data element.
    */
  def updateDataSource(): Request[UpdateDataSourceOutput, AWSError] = js.native
  def updateDataSource(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDataSourceOutput, Unit]): Request[UpdateDataSourceOutput, AWSError] = js.native
  /**
    * Updates the DataSourceName of a DataSource. You can use the GetDataSource operation to view the contents of the updated data element.
    */
  def updateDataSource(params: UpdateDataSourceInput): Request[UpdateDataSourceOutput, AWSError] = js.native
  def updateDataSource(
    params: UpdateDataSourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDataSourceOutput, Unit]
  ): Request[UpdateDataSourceOutput, AWSError] = js.native
  /**
    * Updates the EvaluationName of an Evaluation. You can use the GetEvaluation operation to view the contents of the updated data element.
    */
  def updateEvaluation(): Request[UpdateEvaluationOutput, AWSError] = js.native
  def updateEvaluation(callback: js.Function2[/* err */ AWSError, /* data */ UpdateEvaluationOutput, Unit]): Request[UpdateEvaluationOutput, AWSError] = js.native
  /**
    * Updates the EvaluationName of an Evaluation. You can use the GetEvaluation operation to view the contents of the updated data element.
    */
  def updateEvaluation(params: UpdateEvaluationInput): Request[UpdateEvaluationOutput, AWSError] = js.native
  def updateEvaluation(
    params: UpdateEvaluationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateEvaluationOutput, Unit]
  ): Request[UpdateEvaluationOutput, AWSError] = js.native
  /**
    * Updates the MLModelName and the ScoreThreshold of an MLModel. You can use the GetMLModel operation to view the contents of the updated data element.
    */
  def updateMLModel(): Request[UpdateMLModelOutput, AWSError] = js.native
  def updateMLModel(callback: js.Function2[/* err */ AWSError, /* data */ UpdateMLModelOutput, Unit]): Request[UpdateMLModelOutput, AWSError] = js.native
  /**
    * Updates the MLModelName and the ScoreThreshold of an MLModel. You can use the GetMLModel operation to view the contents of the updated data element.
    */
  def updateMLModel(params: UpdateMLModelInput): Request[UpdateMLModelOutput, AWSError] = js.native
  def updateMLModel(
    params: UpdateMLModelInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateMLModelOutput, Unit]
  ): Request[UpdateMLModelOutput, AWSError] = js.native
  /**
    * Waits for the batchPredictionAvailable state by periodically calling the underlying MachineLearning.describeBatchPredictionsoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_batchPredictionAvailable(state: batchPredictionAvailable): Request[DescribeBatchPredictionsOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_batchPredictionAvailable(
    state: batchPredictionAvailable,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeBatchPredictionsOutput, Unit]
  ): Request[DescribeBatchPredictionsOutput, AWSError] = js.native
  /**
    * Waits for the batchPredictionAvailable state by periodically calling the underlying MachineLearning.describeBatchPredictionsoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_batchPredictionAvailable(state: batchPredictionAvailable, params: DescribeBatchPredictionsI): Request[DescribeBatchPredictionsOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_batchPredictionAvailable(
    state: batchPredictionAvailable,
    params: DescribeBatchPredictionsI,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeBatchPredictionsOutput, Unit]
  ): Request[DescribeBatchPredictionsOutput, AWSError] = js.native
  /**
    * Waits for the dataSourceAvailable state by periodically calling the underlying MachineLearning.describeDataSourcesoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dataSourceAvailable(state: dataSourceAvailable): Request[DescribeDataSourcesOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_dataSourceAvailable(
    state: dataSourceAvailable,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataSourcesOutput, Unit]
  ): Request[DescribeDataSourcesOutput, AWSError] = js.native
  /**
    * Waits for the dataSourceAvailable state by periodically calling the underlying MachineLearning.describeDataSourcesoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_dataSourceAvailable(state: dataSourceAvailable, params: DescribeDataSourcesInputw): Request[DescribeDataSourcesOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_dataSourceAvailable(
    state: dataSourceAvailable,
    params: DescribeDataSourcesInputw,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataSourcesOutput, Unit]
  ): Request[DescribeDataSourcesOutput, AWSError] = js.native
  /**
    * Waits for the evaluationAvailable state by periodically calling the underlying MachineLearning.describeEvaluationsoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_evaluationAvailable(state: evaluationAvailable): Request[DescribeEvaluationsOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_evaluationAvailable(
    state: evaluationAvailable,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEvaluationsOutput, Unit]
  ): Request[DescribeEvaluationsOutput, AWSError] = js.native
  /**
    * Waits for the evaluationAvailable state by periodically calling the underlying MachineLearning.describeEvaluationsoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_evaluationAvailable(state: evaluationAvailable, params: DescribeEvaluationsInputw): Request[DescribeEvaluationsOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_evaluationAvailable(
    state: evaluationAvailable,
    params: DescribeEvaluationsInputw,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEvaluationsOutput, Unit]
  ): Request[DescribeEvaluationsOutput, AWSError] = js.native
  /**
    * Waits for the mLModelAvailable state by periodically calling the underlying MachineLearning.describeMLModelsoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_mLModelAvailable(state: mLModelAvailable): Request[DescribeMLModelsOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_mLModelAvailable(
    state: mLModelAvailable,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMLModelsOutput, Unit]
  ): Request[DescribeMLModelsOutput, AWSError] = js.native
  /**
    * Waits for the mLModelAvailable state by periodically calling the underlying MachineLearning.describeMLModelsoperation every 30 seconds (at most 60 times).
    */
  @JSName("waitFor")
  def waitFor_mLModelAvailable(state: mLModelAvailable, params: DescribeMLModelsInputwait): Request[DescribeMLModelsOutput, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_mLModelAvailable(
    state: mLModelAvailable,
    params: DescribeMLModelsInputwait,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMLModelsOutput, Unit]
  ): Request[DescribeMLModelsOutput, AWSError] = js.native
}

