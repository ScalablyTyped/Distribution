package typings.awsSdk.forecastserviceMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForecastService extends Service {
  
  @JSName("config")
  var config_ForecastService: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an Amazon Forecast dataset. The information about the dataset that you provide helps Forecast understand how to consume the data for model training. This includes the following:     DataFrequency  - How frequently your historical time-series data is collected.     Domain  and  DatasetType  - Each dataset has an associated dataset domain and a type within the domain. Amazon Forecast provides a list of predefined domains and types within each domain. For each unique dataset domain and type within the domain, Amazon Forecast requires your data to include a minimum set of predefined fields.     Schema  - A schema specifies the fields in the dataset, including the field name and data type.   After creating a dataset, you import your training data into it and add the dataset to a dataset group. You use the dataset group to create a predictor. For more information, see howitworks-datasets-groups. To get a list of all your datasets, use the ListDatasets operation. For example Forecast datasets, see the Amazon Forecast Sample GitHub repository.  The Status of a dataset must be ACTIVE before you can import training data. Use the DescribeDataset operation to get the status. 
    */
  def createDataset(): Request[CreateDatasetResponse, AWSError] = js.native
  def createDataset(callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetResponse, Unit]): Request[CreateDatasetResponse, AWSError] = js.native
  /**
    * Creates an Amazon Forecast dataset. The information about the dataset that you provide helps Forecast understand how to consume the data for model training. This includes the following:     DataFrequency  - How frequently your historical time-series data is collected.     Domain  and  DatasetType  - Each dataset has an associated dataset domain and a type within the domain. Amazon Forecast provides a list of predefined domains and types within each domain. For each unique dataset domain and type within the domain, Amazon Forecast requires your data to include a minimum set of predefined fields.     Schema  - A schema specifies the fields in the dataset, including the field name and data type.   After creating a dataset, you import your training data into it and add the dataset to a dataset group. You use the dataset group to create a predictor. For more information, see howitworks-datasets-groups. To get a list of all your datasets, use the ListDatasets operation. For example Forecast datasets, see the Amazon Forecast Sample GitHub repository.  The Status of a dataset must be ACTIVE before you can import training data. Use the DescribeDataset operation to get the status. 
    */
  def createDataset(params: CreateDatasetRequest): Request[CreateDatasetResponse, AWSError] = js.native
  def createDataset(
    params: CreateDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetResponse, Unit]
  ): Request[CreateDatasetResponse, AWSError] = js.native
  
  /**
    * Creates a dataset group, which holds a collection of related datasets. You can add datasets to the dataset group when you create the dataset group, or later by using the UpdateDatasetGroup operation. After creating a dataset group and adding datasets, you use the dataset group when you create a predictor. For more information, see howitworks-datasets-groups. To get a list of all your datasets groups, use the ListDatasetGroups operation.  The Status of a dataset group must be ACTIVE before you can use the dataset group to create a predictor. To get the status, use the DescribeDatasetGroup operation. 
    */
  def createDatasetGroup(): Request[CreateDatasetGroupResponse, AWSError] = js.native
  def createDatasetGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetGroupResponse, Unit]): Request[CreateDatasetGroupResponse, AWSError] = js.native
  /**
    * Creates a dataset group, which holds a collection of related datasets. You can add datasets to the dataset group when you create the dataset group, or later by using the UpdateDatasetGroup operation. After creating a dataset group and adding datasets, you use the dataset group when you create a predictor. For more information, see howitworks-datasets-groups. To get a list of all your datasets groups, use the ListDatasetGroups operation.  The Status of a dataset group must be ACTIVE before you can use the dataset group to create a predictor. To get the status, use the DescribeDatasetGroup operation. 
    */
  def createDatasetGroup(params: CreateDatasetGroupRequest): Request[CreateDatasetGroupResponse, AWSError] = js.native
  def createDatasetGroup(
    params: CreateDatasetGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetGroupResponse, Unit]
  ): Request[CreateDatasetGroupResponse, AWSError] = js.native
  
  /**
    * Imports your training data to an Amazon Forecast dataset. You provide the location of your training data in an Amazon Simple Storage Service (Amazon S3) bucket and the Amazon Resource Name (ARN) of the dataset that you want to import the data to. You must specify a DataSource object that includes an AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the data, as Amazon Forecast makes a copy of your data and processes it in an internal AWS system. For more information, see aws-forecast-iam-roles. The training data must be in CSV format. The delimiter must be a comma (,). You can specify the path to a specific CSV file, the S3 bucket, or to a folder in the S3 bucket. For the latter two cases, Amazon Forecast imports all files up to the limit of 10,000 files. Because dataset imports are not aggregated, your most recent dataset import is the one that is used when training a predictor or generating a forecast. Make sure that your most recent dataset import contains all of the data you want to model off of, and not just the new data collected since the previous import. To get a list of all your dataset import jobs, filtered by specified criteria, use the ListDatasetImportJobs operation.
    */
  def createDatasetImportJob(): Request[CreateDatasetImportJobResponse, AWSError] = js.native
  def createDatasetImportJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetImportJobResponse, Unit]): Request[CreateDatasetImportJobResponse, AWSError] = js.native
  /**
    * Imports your training data to an Amazon Forecast dataset. You provide the location of your training data in an Amazon Simple Storage Service (Amazon S3) bucket and the Amazon Resource Name (ARN) of the dataset that you want to import the data to. You must specify a DataSource object that includes an AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the data, as Amazon Forecast makes a copy of your data and processes it in an internal AWS system. For more information, see aws-forecast-iam-roles. The training data must be in CSV format. The delimiter must be a comma (,). You can specify the path to a specific CSV file, the S3 bucket, or to a folder in the S3 bucket. For the latter two cases, Amazon Forecast imports all files up to the limit of 10,000 files. Because dataset imports are not aggregated, your most recent dataset import is the one that is used when training a predictor or generating a forecast. Make sure that your most recent dataset import contains all of the data you want to model off of, and not just the new data collected since the previous import. To get a list of all your dataset import jobs, filtered by specified criteria, use the ListDatasetImportJobs operation.
    */
  def createDatasetImportJob(params: CreateDatasetImportJobRequest): Request[CreateDatasetImportJobResponse, AWSError] = js.native
  def createDatasetImportJob(
    params: CreateDatasetImportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetImportJobResponse, Unit]
  ): Request[CreateDatasetImportJobResponse, AWSError] = js.native
  
  /**
    * Creates a forecast for each item in the TARGET_TIME_SERIES dataset that was used to train the predictor. This is known as inference. To retrieve the forecast for a single item at low latency, use the operation. To export the complete forecast into your Amazon Simple Storage Service (Amazon S3) bucket, use the CreateForecastExportJob operation. The range of the forecast is determined by the ForecastHorizon value, which you specify in the CreatePredictor request. When you query a forecast, you can request a specific date range within the forecast. To get a list of all your forecasts, use the ListForecasts operation.  The forecasts generated by Amazon Forecast are in the same time zone as the dataset that was used to create the predictor.  For more information, see howitworks-forecast.  The Status of the forecast must be ACTIVE before you can query or export the forecast. Use the DescribeForecast operation to get the status. 
    */
  def createForecast(): Request[CreateForecastResponse, AWSError] = js.native
  def createForecast(callback: js.Function2[/* err */ AWSError, /* data */ CreateForecastResponse, Unit]): Request[CreateForecastResponse, AWSError] = js.native
  /**
    * Creates a forecast for each item in the TARGET_TIME_SERIES dataset that was used to train the predictor. This is known as inference. To retrieve the forecast for a single item at low latency, use the operation. To export the complete forecast into your Amazon Simple Storage Service (Amazon S3) bucket, use the CreateForecastExportJob operation. The range of the forecast is determined by the ForecastHorizon value, which you specify in the CreatePredictor request. When you query a forecast, you can request a specific date range within the forecast. To get a list of all your forecasts, use the ListForecasts operation.  The forecasts generated by Amazon Forecast are in the same time zone as the dataset that was used to create the predictor.  For more information, see howitworks-forecast.  The Status of the forecast must be ACTIVE before you can query or export the forecast. Use the DescribeForecast operation to get the status. 
    */
  def createForecast(params: CreateForecastRequest): Request[CreateForecastResponse, AWSError] = js.native
  def createForecast(
    params: CreateForecastRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateForecastResponse, Unit]
  ): Request[CreateForecastResponse, AWSError] = js.native
  
  /**
    * Exports a forecast created by the CreateForecast operation to your Amazon Simple Storage Service (Amazon S3) bucket. The forecast file name will match the following conventions: &lt;ForecastExportJobName&gt;_&lt;ExportTimestamp&gt;_&lt;PartNumber&gt; where the &lt;ExportTimestamp&gt; component is in Java SimpleDateFormat (yyyy-MM-ddTHH-mm-ssZ). You must specify a DataDestination object that includes an AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the Amazon S3 bucket. For more information, see aws-forecast-iam-roles. For more information, see howitworks-forecast. To get a list of all your forecast export jobs, use the ListForecastExportJobs operation.  The Status of the forecast export job must be ACTIVE before you can access the forecast in your Amazon S3 bucket. To get the status, use the DescribeForecastExportJob operation. 
    */
  def createForecastExportJob(): Request[CreateForecastExportJobResponse, AWSError] = js.native
  def createForecastExportJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateForecastExportJobResponse, Unit]): Request[CreateForecastExportJobResponse, AWSError] = js.native
  /**
    * Exports a forecast created by the CreateForecast operation to your Amazon Simple Storage Service (Amazon S3) bucket. The forecast file name will match the following conventions: &lt;ForecastExportJobName&gt;_&lt;ExportTimestamp&gt;_&lt;PartNumber&gt; where the &lt;ExportTimestamp&gt; component is in Java SimpleDateFormat (yyyy-MM-ddTHH-mm-ssZ). You must specify a DataDestination object that includes an AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the Amazon S3 bucket. For more information, see aws-forecast-iam-roles. For more information, see howitworks-forecast. To get a list of all your forecast export jobs, use the ListForecastExportJobs operation.  The Status of the forecast export job must be ACTIVE before you can access the forecast in your Amazon S3 bucket. To get the status, use the DescribeForecastExportJob operation. 
    */
  def createForecastExportJob(params: CreateForecastExportJobRequest): Request[CreateForecastExportJobResponse, AWSError] = js.native
  def createForecastExportJob(
    params: CreateForecastExportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateForecastExportJobResponse, Unit]
  ): Request[CreateForecastExportJobResponse, AWSError] = js.native
  
  /**
    * Creates an Amazon Forecast predictor. In the request, provide a dataset group and either specify an algorithm or let Amazon Forecast choose an algorithm for you using AutoML. If you specify an algorithm, you also can override algorithm-specific hyperparameters. Amazon Forecast uses the algorithm to train a predictor using the latest version of the datasets in the specified dataset group. You can then generate a forecast using the CreateForecast operation.  To see the evaluation metrics, use the GetAccuracyMetrics operation.  You can specify a featurization configuration to fill and aggregate the data fields in the TARGET_TIME_SERIES dataset to improve model training. For more information, see FeaturizationConfig. For RELATED_TIME_SERIES datasets, CreatePredictor verifies that the DataFrequency specified when the dataset was created matches the ForecastFrequency. TARGET_TIME_SERIES datasets don't have this restriction. Amazon Forecast also verifies the delimiter and timestamp format. For more information, see howitworks-datasets-groups. By default, predictors are trained and evaluated at the 0.1 (P10), 0.5 (P50), and 0.9 (P90) quantiles. You can choose custom forecast types to train and evaluate your predictor by setting the ForecastTypes.   AutoML  If you want Amazon Forecast to evaluate each algorithm and choose the one that minimizes the objective function, set PerformAutoML to true. The objective function is defined as the mean of the weighted losses over the forecast types. By default, these are the p10, p50, and p90 quantile losses. For more information, see EvaluationResult. When AutoML is enabled, the following properties are disallowed:    AlgorithmArn     HPOConfig     PerformHPO     TrainingParameters    To get a list of all of your predictors, use the ListPredictors operation.  Before you can use the predictor to create a forecast, the Status of the predictor must be ACTIVE, signifying that training has completed. To get the status, use the DescribePredictor operation. 
    */
  def createPredictor(): Request[CreatePredictorResponse, AWSError] = js.native
  def createPredictor(callback: js.Function2[/* err */ AWSError, /* data */ CreatePredictorResponse, Unit]): Request[CreatePredictorResponse, AWSError] = js.native
  /**
    * Creates an Amazon Forecast predictor. In the request, provide a dataset group and either specify an algorithm or let Amazon Forecast choose an algorithm for you using AutoML. If you specify an algorithm, you also can override algorithm-specific hyperparameters. Amazon Forecast uses the algorithm to train a predictor using the latest version of the datasets in the specified dataset group. You can then generate a forecast using the CreateForecast operation.  To see the evaluation metrics, use the GetAccuracyMetrics operation.  You can specify a featurization configuration to fill and aggregate the data fields in the TARGET_TIME_SERIES dataset to improve model training. For more information, see FeaturizationConfig. For RELATED_TIME_SERIES datasets, CreatePredictor verifies that the DataFrequency specified when the dataset was created matches the ForecastFrequency. TARGET_TIME_SERIES datasets don't have this restriction. Amazon Forecast also verifies the delimiter and timestamp format. For more information, see howitworks-datasets-groups. By default, predictors are trained and evaluated at the 0.1 (P10), 0.5 (P50), and 0.9 (P90) quantiles. You can choose custom forecast types to train and evaluate your predictor by setting the ForecastTypes.   AutoML  If you want Amazon Forecast to evaluate each algorithm and choose the one that minimizes the objective function, set PerformAutoML to true. The objective function is defined as the mean of the weighted losses over the forecast types. By default, these are the p10, p50, and p90 quantile losses. For more information, see EvaluationResult. When AutoML is enabled, the following properties are disallowed:    AlgorithmArn     HPOConfig     PerformHPO     TrainingParameters    To get a list of all of your predictors, use the ListPredictors operation.  Before you can use the predictor to create a forecast, the Status of the predictor must be ACTIVE, signifying that training has completed. To get the status, use the DescribePredictor operation. 
    */
  def createPredictor(params: CreatePredictorRequest): Request[CreatePredictorResponse, AWSError] = js.native
  def createPredictor(
    params: CreatePredictorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePredictorResponse, Unit]
  ): Request[CreatePredictorResponse, AWSError] = js.native
  
  /**
    * Deletes an Amazon Forecast dataset that was created using the CreateDataset operation. You can only delete datasets that have a status of ACTIVE or CREATE_FAILED. To get the status use the DescribeDataset operation.  Forecast does not automatically update any dataset groups that contain the deleted dataset. In order to update the dataset group, use the operation, omitting the deleted dataset's ARN. 
    */
  def deleteDataset(): Request[js.Object, AWSError] = js.native
  def deleteDataset(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an Amazon Forecast dataset that was created using the CreateDataset operation. You can only delete datasets that have a status of ACTIVE or CREATE_FAILED. To get the status use the DescribeDataset operation.  Forecast does not automatically update any dataset groups that contain the deleted dataset. In order to update the dataset group, use the operation, omitting the deleted dataset's ARN. 
    */
  def deleteDataset(params: DeleteDatasetRequest): Request[js.Object, AWSError] = js.native
  def deleteDataset(
    params: DeleteDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a dataset group created using the CreateDatasetGroup operation. You can only delete dataset groups that have a status of ACTIVE, CREATE_FAILED, or UPDATE_FAILED. To get the status, use the DescribeDatasetGroup operation. This operation deletes only the dataset group, not the datasets in the group.
    */
  def deleteDatasetGroup(): Request[js.Object, AWSError] = js.native
  def deleteDatasetGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a dataset group created using the CreateDatasetGroup operation. You can only delete dataset groups that have a status of ACTIVE, CREATE_FAILED, or UPDATE_FAILED. To get the status, use the DescribeDatasetGroup operation. This operation deletes only the dataset group, not the datasets in the group.
    */
  def deleteDatasetGroup(params: DeleteDatasetGroupRequest): Request[js.Object, AWSError] = js.native
  def deleteDatasetGroup(
    params: DeleteDatasetGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a dataset import job created using the CreateDatasetImportJob operation. You can delete only dataset import jobs that have a status of ACTIVE or CREATE_FAILED. To get the status, use the DescribeDatasetImportJob operation.
    */
  def deleteDatasetImportJob(): Request[js.Object, AWSError] = js.native
  def deleteDatasetImportJob(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a dataset import job created using the CreateDatasetImportJob operation. You can delete only dataset import jobs that have a status of ACTIVE or CREATE_FAILED. To get the status, use the DescribeDatasetImportJob operation.
    */
  def deleteDatasetImportJob(params: DeleteDatasetImportJobRequest): Request[js.Object, AWSError] = js.native
  def deleteDatasetImportJob(
    params: DeleteDatasetImportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a forecast created using the CreateForecast operation. You can delete only forecasts that have a status of ACTIVE or CREATE_FAILED. To get the status, use the DescribeForecast operation. You can't delete a forecast while it is being exported. After a forecast is deleted, you can no longer query the forecast.
    */
  def deleteForecast(): Request[js.Object, AWSError] = js.native
  def deleteForecast(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a forecast created using the CreateForecast operation. You can delete only forecasts that have a status of ACTIVE or CREATE_FAILED. To get the status, use the DescribeForecast operation. You can't delete a forecast while it is being exported. After a forecast is deleted, you can no longer query the forecast.
    */
  def deleteForecast(params: DeleteForecastRequest): Request[js.Object, AWSError] = js.native
  def deleteForecast(
    params: DeleteForecastRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a forecast export job created using the CreateForecastExportJob operation. You can delete only export jobs that have a status of ACTIVE or CREATE_FAILED. To get the status, use the DescribeForecastExportJob operation.
    */
  def deleteForecastExportJob(): Request[js.Object, AWSError] = js.native
  def deleteForecastExportJob(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a forecast export job created using the CreateForecastExportJob operation. You can delete only export jobs that have a status of ACTIVE or CREATE_FAILED. To get the status, use the DescribeForecastExportJob operation.
    */
  def deleteForecastExportJob(params: DeleteForecastExportJobRequest): Request[js.Object, AWSError] = js.native
  def deleteForecastExportJob(
    params: DeleteForecastExportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a predictor created using the CreatePredictor operation. You can delete only predictor that have a status of ACTIVE or CREATE_FAILED. To get the status, use the DescribePredictor operation.
    */
  def deletePredictor(): Request[js.Object, AWSError] = js.native
  def deletePredictor(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a predictor created using the CreatePredictor operation. You can delete only predictor that have a status of ACTIVE or CREATE_FAILED. To get the status, use the DescribePredictor operation.
    */
  def deletePredictor(params: DeletePredictorRequest): Request[js.Object, AWSError] = js.native
  def deletePredictor(
    params: DeletePredictorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Describes an Amazon Forecast dataset created using the CreateDataset operation. In addition to listing the parameters specified in the CreateDataset request, this operation includes the following dataset properties:    CreationTime     LastModificationTime     Status   
    */
  def describeDataset(): Request[DescribeDatasetResponse, AWSError] = js.native
  def describeDataset(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDatasetResponse, Unit]): Request[DescribeDatasetResponse, AWSError] = js.native
  /**
    * Describes an Amazon Forecast dataset created using the CreateDataset operation. In addition to listing the parameters specified in the CreateDataset request, this operation includes the following dataset properties:    CreationTime     LastModificationTime     Status   
    */
  def describeDataset(params: DescribeDatasetRequest): Request[DescribeDatasetResponse, AWSError] = js.native
  def describeDataset(
    params: DescribeDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDatasetResponse, Unit]
  ): Request[DescribeDatasetResponse, AWSError] = js.native
  
  /**
    * Describes a dataset group created using the CreateDatasetGroup operation. In addition to listing the parameters provided in the CreateDatasetGroup request, this operation includes the following properties:    DatasetArns - The datasets belonging to the group.    CreationTime     LastModificationTime     Status   
    */
  def describeDatasetGroup(): Request[DescribeDatasetGroupResponse, AWSError] = js.native
  def describeDatasetGroup(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDatasetGroupResponse, Unit]): Request[DescribeDatasetGroupResponse, AWSError] = js.native
  /**
    * Describes a dataset group created using the CreateDatasetGroup operation. In addition to listing the parameters provided in the CreateDatasetGroup request, this operation includes the following properties:    DatasetArns - The datasets belonging to the group.    CreationTime     LastModificationTime     Status   
    */
  def describeDatasetGroup(params: DescribeDatasetGroupRequest): Request[DescribeDatasetGroupResponse, AWSError] = js.native
  def describeDatasetGroup(
    params: DescribeDatasetGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDatasetGroupResponse, Unit]
  ): Request[DescribeDatasetGroupResponse, AWSError] = js.native
  
  /**
    * Describes a dataset import job created using the CreateDatasetImportJob operation. In addition to listing the parameters provided in the CreateDatasetImportJob request, this operation includes the following properties:    CreationTime     LastModificationTime     DataSize     FieldStatistics     Status     Message - If an error occurred, information about the error.  
    */
  def describeDatasetImportJob(): Request[DescribeDatasetImportJobResponse, AWSError] = js.native
  def describeDatasetImportJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDatasetImportJobResponse, Unit]): Request[DescribeDatasetImportJobResponse, AWSError] = js.native
  /**
    * Describes a dataset import job created using the CreateDatasetImportJob operation. In addition to listing the parameters provided in the CreateDatasetImportJob request, this operation includes the following properties:    CreationTime     LastModificationTime     DataSize     FieldStatistics     Status     Message - If an error occurred, information about the error.  
    */
  def describeDatasetImportJob(params: DescribeDatasetImportJobRequest): Request[DescribeDatasetImportJobResponse, AWSError] = js.native
  def describeDatasetImportJob(
    params: DescribeDatasetImportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDatasetImportJobResponse, Unit]
  ): Request[DescribeDatasetImportJobResponse, AWSError] = js.native
  
  /**
    * Describes a forecast created using the CreateForecast operation. In addition to listing the properties provided in the CreateForecast request, this operation lists the following properties:    DatasetGroupArn - The dataset group that provided the training data.    CreationTime     LastModificationTime     Status     Message - If an error occurred, information about the error.  
    */
  def describeForecast(): Request[DescribeForecastResponse, AWSError] = js.native
  def describeForecast(callback: js.Function2[/* err */ AWSError, /* data */ DescribeForecastResponse, Unit]): Request[DescribeForecastResponse, AWSError] = js.native
  /**
    * Describes a forecast created using the CreateForecast operation. In addition to listing the properties provided in the CreateForecast request, this operation lists the following properties:    DatasetGroupArn - The dataset group that provided the training data.    CreationTime     LastModificationTime     Status     Message - If an error occurred, information about the error.  
    */
  def describeForecast(params: DescribeForecastRequest): Request[DescribeForecastResponse, AWSError] = js.native
  def describeForecast(
    params: DescribeForecastRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeForecastResponse, Unit]
  ): Request[DescribeForecastResponse, AWSError] = js.native
  
  /**
    * Describes a forecast export job created using the CreateForecastExportJob operation. In addition to listing the properties provided by the user in the CreateForecastExportJob request, this operation lists the following properties:    CreationTime     LastModificationTime     Status     Message - If an error occurred, information about the error.  
    */
  def describeForecastExportJob(): Request[DescribeForecastExportJobResponse, AWSError] = js.native
  def describeForecastExportJob(callback: js.Function2[/* err */ AWSError, /* data */ DescribeForecastExportJobResponse, Unit]): Request[DescribeForecastExportJobResponse, AWSError] = js.native
  /**
    * Describes a forecast export job created using the CreateForecastExportJob operation. In addition to listing the properties provided by the user in the CreateForecastExportJob request, this operation lists the following properties:    CreationTime     LastModificationTime     Status     Message - If an error occurred, information about the error.  
    */
  def describeForecastExportJob(params: DescribeForecastExportJobRequest): Request[DescribeForecastExportJobResponse, AWSError] = js.native
  def describeForecastExportJob(
    params: DescribeForecastExportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeForecastExportJobResponse, Unit]
  ): Request[DescribeForecastExportJobResponse, AWSError] = js.native
  
  /**
    * Describes a predictor created using the CreatePredictor operation. In addition to listing the properties provided in the CreatePredictor request, this operation lists the following properties:    DatasetImportJobArns - The dataset import jobs used to import training data.    AutoMLAlgorithmArns - If AutoML is performed, the algorithms that were evaluated.    CreationTime     LastModificationTime     Status     Message - If an error occurred, information about the error.  
    */
  def describePredictor(): Request[DescribePredictorResponse, AWSError] = js.native
  def describePredictor(callback: js.Function2[/* err */ AWSError, /* data */ DescribePredictorResponse, Unit]): Request[DescribePredictorResponse, AWSError] = js.native
  /**
    * Describes a predictor created using the CreatePredictor operation. In addition to listing the properties provided in the CreatePredictor request, this operation lists the following properties:    DatasetImportJobArns - The dataset import jobs used to import training data.    AutoMLAlgorithmArns - If AutoML is performed, the algorithms that were evaluated.    CreationTime     LastModificationTime     Status     Message - If an error occurred, information about the error.  
    */
  def describePredictor(params: DescribePredictorRequest): Request[DescribePredictorResponse, AWSError] = js.native
  def describePredictor(
    params: DescribePredictorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePredictorResponse, Unit]
  ): Request[DescribePredictorResponse, AWSError] = js.native
  
  /**
    * Provides metrics on the accuracy of the models that were trained by the CreatePredictor operation. Use metrics to see how well the model performed and to decide whether to use the predictor to generate a forecast. For more information, see Predictor Metrics. This operation generates metrics for each backtest window that was evaluated. The number of backtest windows (NumberOfBacktestWindows) is specified using the EvaluationParameters object, which is optionally included in the CreatePredictor request. If NumberOfBacktestWindows isn't specified, the number defaults to one. The parameters of the filling method determine which items contribute to the metrics. If you want all items to contribute, specify zero. If you want only those items that have complete data in the range being evaluated to contribute, specify nan. For more information, see FeaturizationMethod.  Before you can get accuracy metrics, the Status of the predictor must be ACTIVE, signifying that training has completed. To get the status, use the DescribePredictor operation. 
    */
  def getAccuracyMetrics(): Request[GetAccuracyMetricsResponse, AWSError] = js.native
  def getAccuracyMetrics(callback: js.Function2[/* err */ AWSError, /* data */ GetAccuracyMetricsResponse, Unit]): Request[GetAccuracyMetricsResponse, AWSError] = js.native
  /**
    * Provides metrics on the accuracy of the models that were trained by the CreatePredictor operation. Use metrics to see how well the model performed and to decide whether to use the predictor to generate a forecast. For more information, see Predictor Metrics. This operation generates metrics for each backtest window that was evaluated. The number of backtest windows (NumberOfBacktestWindows) is specified using the EvaluationParameters object, which is optionally included in the CreatePredictor request. If NumberOfBacktestWindows isn't specified, the number defaults to one. The parameters of the filling method determine which items contribute to the metrics. If you want all items to contribute, specify zero. If you want only those items that have complete data in the range being evaluated to contribute, specify nan. For more information, see FeaturizationMethod.  Before you can get accuracy metrics, the Status of the predictor must be ACTIVE, signifying that training has completed. To get the status, use the DescribePredictor operation. 
    */
  def getAccuracyMetrics(params: GetAccuracyMetricsRequest): Request[GetAccuracyMetricsResponse, AWSError] = js.native
  def getAccuracyMetrics(
    params: GetAccuracyMetricsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAccuracyMetricsResponse, Unit]
  ): Request[GetAccuracyMetricsResponse, AWSError] = js.native
  
  /**
    * Returns a list of dataset groups created using the CreateDatasetGroup operation. For each dataset group, this operation returns a summary of its properties, including its Amazon Resource Name (ARN). You can retrieve the complete set of properties by using the dataset group ARN with the DescribeDatasetGroup operation.
    */
  def listDatasetGroups(): Request[ListDatasetGroupsResponse, AWSError] = js.native
  def listDatasetGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetGroupsResponse, Unit]): Request[ListDatasetGroupsResponse, AWSError] = js.native
  /**
    * Returns a list of dataset groups created using the CreateDatasetGroup operation. For each dataset group, this operation returns a summary of its properties, including its Amazon Resource Name (ARN). You can retrieve the complete set of properties by using the dataset group ARN with the DescribeDatasetGroup operation.
    */
  def listDatasetGroups(params: ListDatasetGroupsRequest): Request[ListDatasetGroupsResponse, AWSError] = js.native
  def listDatasetGroups(
    params: ListDatasetGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetGroupsResponse, Unit]
  ): Request[ListDatasetGroupsResponse, AWSError] = js.native
  
  /**
    * Returns a list of dataset import jobs created using the CreateDatasetImportJob operation. For each import job, this operation returns a summary of its properties, including its Amazon Resource Name (ARN). You can retrieve the complete set of properties by using the ARN with the DescribeDatasetImportJob operation. You can filter the list by providing an array of Filter objects.
    */
  def listDatasetImportJobs(): Request[ListDatasetImportJobsResponse, AWSError] = js.native
  def listDatasetImportJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetImportJobsResponse, Unit]): Request[ListDatasetImportJobsResponse, AWSError] = js.native
  /**
    * Returns a list of dataset import jobs created using the CreateDatasetImportJob operation. For each import job, this operation returns a summary of its properties, including its Amazon Resource Name (ARN). You can retrieve the complete set of properties by using the ARN with the DescribeDatasetImportJob operation. You can filter the list by providing an array of Filter objects.
    */
  def listDatasetImportJobs(params: ListDatasetImportJobsRequest): Request[ListDatasetImportJobsResponse, AWSError] = js.native
  def listDatasetImportJobs(
    params: ListDatasetImportJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetImportJobsResponse, Unit]
  ): Request[ListDatasetImportJobsResponse, AWSError] = js.native
  
  /**
    * Returns a list of datasets created using the CreateDataset operation. For each dataset, a summary of its properties, including its Amazon Resource Name (ARN), is returned. To retrieve the complete set of properties, use the ARN with the DescribeDataset operation.
    */
  def listDatasets(): Request[ListDatasetsResponse, AWSError] = js.native
  def listDatasets(callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetsResponse, Unit]): Request[ListDatasetsResponse, AWSError] = js.native
  /**
    * Returns a list of datasets created using the CreateDataset operation. For each dataset, a summary of its properties, including its Amazon Resource Name (ARN), is returned. To retrieve the complete set of properties, use the ARN with the DescribeDataset operation.
    */
  def listDatasets(params: ListDatasetsRequest): Request[ListDatasetsResponse, AWSError] = js.native
  def listDatasets(
    params: ListDatasetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDatasetsResponse, Unit]
  ): Request[ListDatasetsResponse, AWSError] = js.native
  
  /**
    * Returns a list of forecast export jobs created using the CreateForecastExportJob operation. For each forecast export job, this operation returns a summary of its properties, including its Amazon Resource Name (ARN). To retrieve the complete set of properties, use the ARN with the DescribeForecastExportJob operation. You can filter the list using an array of Filter objects.
    */
  def listForecastExportJobs(): Request[ListForecastExportJobsResponse, AWSError] = js.native
  def listForecastExportJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListForecastExportJobsResponse, Unit]): Request[ListForecastExportJobsResponse, AWSError] = js.native
  /**
    * Returns a list of forecast export jobs created using the CreateForecastExportJob operation. For each forecast export job, this operation returns a summary of its properties, including its Amazon Resource Name (ARN). To retrieve the complete set of properties, use the ARN with the DescribeForecastExportJob operation. You can filter the list using an array of Filter objects.
    */
  def listForecastExportJobs(params: ListForecastExportJobsRequest): Request[ListForecastExportJobsResponse, AWSError] = js.native
  def listForecastExportJobs(
    params: ListForecastExportJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListForecastExportJobsResponse, Unit]
  ): Request[ListForecastExportJobsResponse, AWSError] = js.native
  
  /**
    * Returns a list of forecasts created using the CreateForecast operation. For each forecast, this operation returns a summary of its properties, including its Amazon Resource Name (ARN). To retrieve the complete set of properties, specify the ARN with the DescribeForecast operation. You can filter the list using an array of Filter objects.
    */
  def listForecasts(): Request[ListForecastsResponse, AWSError] = js.native
  def listForecasts(callback: js.Function2[/* err */ AWSError, /* data */ ListForecastsResponse, Unit]): Request[ListForecastsResponse, AWSError] = js.native
  /**
    * Returns a list of forecasts created using the CreateForecast operation. For each forecast, this operation returns a summary of its properties, including its Amazon Resource Name (ARN). To retrieve the complete set of properties, specify the ARN with the DescribeForecast operation. You can filter the list using an array of Filter objects.
    */
  def listForecasts(params: ListForecastsRequest): Request[ListForecastsResponse, AWSError] = js.native
  def listForecasts(
    params: ListForecastsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListForecastsResponse, Unit]
  ): Request[ListForecastsResponse, AWSError] = js.native
  
  /**
    * Returns a list of predictors created using the CreatePredictor operation. For each predictor, this operation returns a summary of its properties, including its Amazon Resource Name (ARN). You can retrieve the complete set of properties by using the ARN with the DescribePredictor operation. You can filter the list using an array of Filter objects.
    */
  def listPredictors(): Request[ListPredictorsResponse, AWSError] = js.native
  def listPredictors(callback: js.Function2[/* err */ AWSError, /* data */ ListPredictorsResponse, Unit]): Request[ListPredictorsResponse, AWSError] = js.native
  /**
    * Returns a list of predictors created using the CreatePredictor operation. For each predictor, this operation returns a summary of its properties, including its Amazon Resource Name (ARN). You can retrieve the complete set of properties by using the ARN with the DescribePredictor operation. You can filter the list using an array of Filter objects.
    */
  def listPredictors(params: ListPredictorsRequest): Request[ListPredictorsResponse, AWSError] = js.native
  def listPredictors(
    params: ListPredictorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPredictorsResponse, Unit]
  ): Request[ListPredictorsResponse, AWSError] = js.native
  
  /**
    * Lists the tags for an Amazon Forecast resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags for an Amazon Forecast resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are not specified in the request parameters, they are not changed. When a resource is deleted, the tags associated with that resource are also deleted.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are not specified in the request parameters, they are not changed. When a resource is deleted, the tags associated with that resource are also deleted.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Deletes the specified tags from a resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Deletes the specified tags from a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Replaces the datasets in a dataset group with the specified datasets.  The Status of the dataset group must be ACTIVE before you can use the dataset group to create a predictor. Use the DescribeDatasetGroup operation to get the status. 
    */
  def updateDatasetGroup(): Request[UpdateDatasetGroupResponse, AWSError] = js.native
  def updateDatasetGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDatasetGroupResponse, Unit]): Request[UpdateDatasetGroupResponse, AWSError] = js.native
  /**
    * Replaces the datasets in a dataset group with the specified datasets.  The Status of the dataset group must be ACTIVE before you can use the dataset group to create a predictor. Use the DescribeDatasetGroup operation to get the status. 
    */
  def updateDatasetGroup(params: UpdateDatasetGroupRequest): Request[UpdateDatasetGroupResponse, AWSError] = js.native
  def updateDatasetGroup(
    params: UpdateDatasetGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDatasetGroupResponse, Unit]
  ): Request[UpdateDatasetGroupResponse, AWSError] = js.native
}
