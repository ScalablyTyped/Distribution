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
    * Creates an Amazon Forecast predictor. Amazon Forecast creates predictors with AutoPredictor, which involves applying the optimal combination of algorithms to each time series in your datasets. You can use CreateAutoPredictor to create new predictors or upgrade/retrain existing predictors.  Creating new predictors  The following parameters are required when creating a new predictor:    PredictorName - A unique name for the predictor.    DatasetGroupArn - The ARN of the dataset group used to train the predictor.    ForecastFrequency - The granularity of your forecasts (hourly, daily, weekly, etc).    ForecastHorizon - The number of time-steps that the model predicts. The forecast horizon is also called the prediction length.   When creating a new predictor, do not specify a value for ReferencePredictorArn.  Upgrading and retraining predictors  The following parameters are required when retraining or upgrading a predictor:    PredictorName - A unique name for the predictor.    ReferencePredictorArn - The ARN of the predictor to retrain or upgrade.   When upgrading or retraining a predictor, only specify values for the ReferencePredictorArn and PredictorName. 
    */
  def createAutoPredictor(): Request[CreateAutoPredictorResponse, AWSError] = js.native
  def createAutoPredictor(callback: js.Function2[/* err */ AWSError, /* data */ CreateAutoPredictorResponse, Unit]): Request[CreateAutoPredictorResponse, AWSError] = js.native
  /**
    * Creates an Amazon Forecast predictor. Amazon Forecast creates predictors with AutoPredictor, which involves applying the optimal combination of algorithms to each time series in your datasets. You can use CreateAutoPredictor to create new predictors or upgrade/retrain existing predictors.  Creating new predictors  The following parameters are required when creating a new predictor:    PredictorName - A unique name for the predictor.    DatasetGroupArn - The ARN of the dataset group used to train the predictor.    ForecastFrequency - The granularity of your forecasts (hourly, daily, weekly, etc).    ForecastHorizon - The number of time-steps that the model predicts. The forecast horizon is also called the prediction length.   When creating a new predictor, do not specify a value for ReferencePredictorArn.  Upgrading and retraining predictors  The following parameters are required when retraining or upgrading a predictor:    PredictorName - A unique name for the predictor.    ReferencePredictorArn - The ARN of the predictor to retrain or upgrade.   When upgrading or retraining a predictor, only specify values for the ReferencePredictorArn and PredictorName. 
    */
  def createAutoPredictor(params: CreateAutoPredictorRequest): Request[CreateAutoPredictorResponse, AWSError] = js.native
  def createAutoPredictor(
    params: CreateAutoPredictorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAutoPredictorResponse, Unit]
  ): Request[CreateAutoPredictorResponse, AWSError] = js.native
  
  /**
    * Creates an Amazon Forecast dataset. The information about the dataset that you provide helps Forecast understand how to consume the data for model training. This includes the following:     DataFrequency  - How frequently your historical time-series data is collected.     Domain  and  DatasetType  - Each dataset has an associated dataset domain and a type within the domain. Amazon Forecast provides a list of predefined domains and types within each domain. For each unique dataset domain and type within the domain, Amazon Forecast requires your data to include a minimum set of predefined fields.     Schema  - A schema specifies the fields in the dataset, including the field name and data type.   After creating a dataset, you import your training data into it and add the dataset to a dataset group. You use the dataset group to create a predictor. For more information, see Importing datasets. To get a list of all your datasets, use the ListDatasets operation. For example Forecast datasets, see the Amazon Forecast Sample GitHub repository.  The Status of a dataset must be ACTIVE before you can import training data. Use the DescribeDataset operation to get the status. 
    */
  def createDataset(): Request[CreateDatasetResponse, AWSError] = js.native
  def createDataset(callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetResponse, Unit]): Request[CreateDatasetResponse, AWSError] = js.native
  /**
    * Creates an Amazon Forecast dataset. The information about the dataset that you provide helps Forecast understand how to consume the data for model training. This includes the following:     DataFrequency  - How frequently your historical time-series data is collected.     Domain  and  DatasetType  - Each dataset has an associated dataset domain and a type within the domain. Amazon Forecast provides a list of predefined domains and types within each domain. For each unique dataset domain and type within the domain, Amazon Forecast requires your data to include a minimum set of predefined fields.     Schema  - A schema specifies the fields in the dataset, including the field name and data type.   After creating a dataset, you import your training data into it and add the dataset to a dataset group. You use the dataset group to create a predictor. For more information, see Importing datasets. To get a list of all your datasets, use the ListDatasets operation. For example Forecast datasets, see the Amazon Forecast Sample GitHub repository.  The Status of a dataset must be ACTIVE before you can import training data. Use the DescribeDataset operation to get the status. 
    */
  def createDataset(params: CreateDatasetRequest): Request[CreateDatasetResponse, AWSError] = js.native
  def createDataset(
    params: CreateDatasetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetResponse, Unit]
  ): Request[CreateDatasetResponse, AWSError] = js.native
  
  /**
    * Creates a dataset group, which holds a collection of related datasets. You can add datasets to the dataset group when you create the dataset group, or later by using the UpdateDatasetGroup operation. After creating a dataset group and adding datasets, you use the dataset group when you create a predictor. For more information, see Dataset groups. To get a list of all your datasets groups, use the ListDatasetGroups operation.  The Status of a dataset group must be ACTIVE before you can use the dataset group to create a predictor. To get the status, use the DescribeDatasetGroup operation. 
    */
  def createDatasetGroup(): Request[CreateDatasetGroupResponse, AWSError] = js.native
  def createDatasetGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetGroupResponse, Unit]): Request[CreateDatasetGroupResponse, AWSError] = js.native
  /**
    * Creates a dataset group, which holds a collection of related datasets. You can add datasets to the dataset group when you create the dataset group, or later by using the UpdateDatasetGroup operation. After creating a dataset group and adding datasets, you use the dataset group when you create a predictor. For more information, see Dataset groups. To get a list of all your datasets groups, use the ListDatasetGroups operation.  The Status of a dataset group must be ACTIVE before you can use the dataset group to create a predictor. To get the status, use the DescribeDatasetGroup operation. 
    */
  def createDatasetGroup(params: CreateDatasetGroupRequest): Request[CreateDatasetGroupResponse, AWSError] = js.native
  def createDatasetGroup(
    params: CreateDatasetGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetGroupResponse, Unit]
  ): Request[CreateDatasetGroupResponse, AWSError] = js.native
  
  /**
    * Imports your training data to an Amazon Forecast dataset. You provide the location of your training data in an Amazon Simple Storage Service (Amazon S3) bucket and the Amazon Resource Name (ARN) of the dataset that you want to import the data to. You must specify a DataSource object that includes an AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the data, as Amazon Forecast makes a copy of your data and processes it in an internal AWS system. For more information, see Set up permissions. The training data must be in CSV or Parquet format. The delimiter must be a comma (,). You can specify the path to a specific file, the S3 bucket, or to a folder in the S3 bucket. For the latter two cases, Amazon Forecast imports all files up to the limit of 10,000 files. Because dataset imports are not aggregated, your most recent dataset import is the one that is used when training a predictor or generating a forecast. Make sure that your most recent dataset import contains all of the data you want to model off of, and not just the new data collected since the previous import. To get a list of all your dataset import jobs, filtered by specified criteria, use the ListDatasetImportJobs operation.
    */
  def createDatasetImportJob(): Request[CreateDatasetImportJobResponse, AWSError] = js.native
  def createDatasetImportJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetImportJobResponse, Unit]): Request[CreateDatasetImportJobResponse, AWSError] = js.native
  /**
    * Imports your training data to an Amazon Forecast dataset. You provide the location of your training data in an Amazon Simple Storage Service (Amazon S3) bucket and the Amazon Resource Name (ARN) of the dataset that you want to import the data to. You must specify a DataSource object that includes an AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the data, as Amazon Forecast makes a copy of your data and processes it in an internal AWS system. For more information, see Set up permissions. The training data must be in CSV or Parquet format. The delimiter must be a comma (,). You can specify the path to a specific file, the S3 bucket, or to a folder in the S3 bucket. For the latter two cases, Amazon Forecast imports all files up to the limit of 10,000 files. Because dataset imports are not aggregated, your most recent dataset import is the one that is used when training a predictor or generating a forecast. Make sure that your most recent dataset import contains all of the data you want to model off of, and not just the new data collected since the previous import. To get a list of all your dataset import jobs, filtered by specified criteria, use the ListDatasetImportJobs operation.
    */
  def createDatasetImportJob(params: CreateDatasetImportJobRequest): Request[CreateDatasetImportJobResponse, AWSError] = js.native
  def createDatasetImportJob(
    params: CreateDatasetImportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDatasetImportJobResponse, Unit]
  ): Request[CreateDatasetImportJobResponse, AWSError] = js.native
  
  /**
    *  Explainability is only available for Forecasts and Predictors generated from an AutoPredictor (CreateAutoPredictor)  Creates an Amazon Forecast Explainability. Explainability helps you better understand how the attributes in your datasets impact forecast. Amazon Forecast uses a metric called Impact scores to quantify the relative impact of each attribute and determine whether they increase or decrease forecast values. To enable Forecast Explainability, your predictor must include at least one of the following: related time series, item metadata, or additional datasets like Holidays and the Weather Index. CreateExplainability accepts either a Predictor ARN or Forecast ARN. To receive aggregated Impact scores for all time series and time points in your datasets, provide a Predictor ARN. To receive Impact scores for specific time series and time points, provide a Forecast ARN.  CreateExplainability with a Predictor ARN   You can only have one Explainability resource per predictor. If you already enabled ExplainPredictor in CreateAutoPredictor, that predictor already has an Explainability resource.  The following parameters are required when providing a Predictor ARN:    ExplainabilityName - A unique name for the Explainability.    ResourceArn - The Arn of the predictor.    TimePointGranularity - Must be set to “ALL”.    TimeSeriesGranularity - Must be set to “ALL”.   Do not specify a value for the following parameters:    DataSource - Only valid when TimeSeriesGranularity is “SPECIFIC”.    Schema - Only valid when TimeSeriesGranularity is “SPECIFIC”.    StartDateTime - Only valid when TimePointGranularity is “SPECIFIC”.    EndDateTime - Only valid when TimePointGranularity is “SPECIFIC”.    CreateExplainability with a Forecast ARN   You can specify a maximum of 50 time series and 500 time points.  The following parameters are required when providing a Predictor ARN:    ExplainabilityName - A unique name for the Explainability.    ResourceArn - The Arn of the forecast.    TimePointGranularity - Either “ALL” or “SPECIFIC”.    TimeSeriesGranularity - Either “ALL” or “SPECIFIC”.   If you set TimeSeriesGranularity to “SPECIFIC”, you must also provide the following:    DataSource - The S3 location of the CSV file specifying your time series.    Schema - The Schema defines the attributes and attribute types listed in the Data Source.   If you set TimePointGranularity to “SPECIFIC”, you must also provide the following:    StartDateTime - The first timestamp in the range of time points.    EndDateTime - The last timestamp in the range of time points.  
    */
  def createExplainability(): Request[CreateExplainabilityResponse, AWSError] = js.native
  def createExplainability(callback: js.Function2[/* err */ AWSError, /* data */ CreateExplainabilityResponse, Unit]): Request[CreateExplainabilityResponse, AWSError] = js.native
  /**
    *  Explainability is only available for Forecasts and Predictors generated from an AutoPredictor (CreateAutoPredictor)  Creates an Amazon Forecast Explainability. Explainability helps you better understand how the attributes in your datasets impact forecast. Amazon Forecast uses a metric called Impact scores to quantify the relative impact of each attribute and determine whether they increase or decrease forecast values. To enable Forecast Explainability, your predictor must include at least one of the following: related time series, item metadata, or additional datasets like Holidays and the Weather Index. CreateExplainability accepts either a Predictor ARN or Forecast ARN. To receive aggregated Impact scores for all time series and time points in your datasets, provide a Predictor ARN. To receive Impact scores for specific time series and time points, provide a Forecast ARN.  CreateExplainability with a Predictor ARN   You can only have one Explainability resource per predictor. If you already enabled ExplainPredictor in CreateAutoPredictor, that predictor already has an Explainability resource.  The following parameters are required when providing a Predictor ARN:    ExplainabilityName - A unique name for the Explainability.    ResourceArn - The Arn of the predictor.    TimePointGranularity - Must be set to “ALL”.    TimeSeriesGranularity - Must be set to “ALL”.   Do not specify a value for the following parameters:    DataSource - Only valid when TimeSeriesGranularity is “SPECIFIC”.    Schema - Only valid when TimeSeriesGranularity is “SPECIFIC”.    StartDateTime - Only valid when TimePointGranularity is “SPECIFIC”.    EndDateTime - Only valid when TimePointGranularity is “SPECIFIC”.    CreateExplainability with a Forecast ARN   You can specify a maximum of 50 time series and 500 time points.  The following parameters are required when providing a Predictor ARN:    ExplainabilityName - A unique name for the Explainability.    ResourceArn - The Arn of the forecast.    TimePointGranularity - Either “ALL” or “SPECIFIC”.    TimeSeriesGranularity - Either “ALL” or “SPECIFIC”.   If you set TimeSeriesGranularity to “SPECIFIC”, you must also provide the following:    DataSource - The S3 location of the CSV file specifying your time series.    Schema - The Schema defines the attributes and attribute types listed in the Data Source.   If you set TimePointGranularity to “SPECIFIC”, you must also provide the following:    StartDateTime - The first timestamp in the range of time points.    EndDateTime - The last timestamp in the range of time points.  
    */
  def createExplainability(params: CreateExplainabilityRequest): Request[CreateExplainabilityResponse, AWSError] = js.native
  def createExplainability(
    params: CreateExplainabilityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateExplainabilityResponse, Unit]
  ): Request[CreateExplainabilityResponse, AWSError] = js.native
  
  /**
    * Exports an Explainability resource created by the CreateExplainability operation. Exported files are exported to an Amazon Simple Storage Service (Amazon S3) bucket. You must specify a DataDestination object that includes an Amazon S3 bucket and an AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the Amazon S3 bucket. For more information, see aws-forecast-iam-roles.  The Status of the export job must be ACTIVE before you can access the export in your Amazon S3 bucket. To get the status, use the DescribeExplainabilityExport operation. 
    */
  def createExplainabilityExport(): Request[CreateExplainabilityExportResponse, AWSError] = js.native
  def createExplainabilityExport(callback: js.Function2[/* err */ AWSError, /* data */ CreateExplainabilityExportResponse, Unit]): Request[CreateExplainabilityExportResponse, AWSError] = js.native
  /**
    * Exports an Explainability resource created by the CreateExplainability operation. Exported files are exported to an Amazon Simple Storage Service (Amazon S3) bucket. You must specify a DataDestination object that includes an Amazon S3 bucket and an AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the Amazon S3 bucket. For more information, see aws-forecast-iam-roles.  The Status of the export job must be ACTIVE before you can access the export in your Amazon S3 bucket. To get the status, use the DescribeExplainabilityExport operation. 
    */
  def createExplainabilityExport(params: CreateExplainabilityExportRequest): Request[CreateExplainabilityExportResponse, AWSError] = js.native
  def createExplainabilityExport(
    params: CreateExplainabilityExportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateExplainabilityExportResponse, Unit]
  ): Request[CreateExplainabilityExportResponse, AWSError] = js.native
  
  /**
    * Creates a forecast for each item in the TARGET_TIME_SERIES dataset that was used to train the predictor. This is known as inference. To retrieve the forecast for a single item at low latency, use the operation. To export the complete forecast into your Amazon Simple Storage Service (Amazon S3) bucket, use the CreateForecastExportJob operation. The range of the forecast is determined by the ForecastHorizon value, which you specify in the CreatePredictor request. When you query a forecast, you can request a specific date range within the forecast. To get a list of all your forecasts, use the ListForecasts operation.  The forecasts generated by Amazon Forecast are in the same time zone as the dataset that was used to create the predictor.  For more information, see howitworks-forecast.  The Status of the forecast must be ACTIVE before you can query or export the forecast. Use the DescribeForecast operation to get the status.  By default, a forecast includes predictions for every item (item_id) in the dataset group that was used to train the predictor. However, you can use the TimeSeriesSelector object to generate a forecast on a subset of time series. Forecast creation is skipped for any time series that you specify that are not in the input dataset. The forecast export file will not contain these time series or their forecasted values.
    */
  def createForecast(): Request[CreateForecastResponse, AWSError] = js.native
  def createForecast(callback: js.Function2[/* err */ AWSError, /* data */ CreateForecastResponse, Unit]): Request[CreateForecastResponse, AWSError] = js.native
  /**
    * Creates a forecast for each item in the TARGET_TIME_SERIES dataset that was used to train the predictor. This is known as inference. To retrieve the forecast for a single item at low latency, use the operation. To export the complete forecast into your Amazon Simple Storage Service (Amazon S3) bucket, use the CreateForecastExportJob operation. The range of the forecast is determined by the ForecastHorizon value, which you specify in the CreatePredictor request. When you query a forecast, you can request a specific date range within the forecast. To get a list of all your forecasts, use the ListForecasts operation.  The forecasts generated by Amazon Forecast are in the same time zone as the dataset that was used to create the predictor.  For more information, see howitworks-forecast.  The Status of the forecast must be ACTIVE before you can query or export the forecast. Use the DescribeForecast operation to get the status.  By default, a forecast includes predictions for every item (item_id) in the dataset group that was used to train the predictor. However, you can use the TimeSeriesSelector object to generate a forecast on a subset of time series. Forecast creation is skipped for any time series that you specify that are not in the input dataset. The forecast export file will not contain these time series or their forecasted values.
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
    * Creates a predictor monitor resource for an existing auto predictor. Predictor monitoring allows you to see how your predictor's performance changes over time. For more information, see Predictor Monitoring. 
    */
  def createMonitor(): Request[CreateMonitorResponse, AWSError] = js.native
  def createMonitor(callback: js.Function2[/* err */ AWSError, /* data */ CreateMonitorResponse, Unit]): Request[CreateMonitorResponse, AWSError] = js.native
  /**
    * Creates a predictor monitor resource for an existing auto predictor. Predictor monitoring allows you to see how your predictor's performance changes over time. For more information, see Predictor Monitoring. 
    */
  def createMonitor(params: CreateMonitorRequest): Request[CreateMonitorResponse, AWSError] = js.native
  def createMonitor(
    params: CreateMonitorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMonitorResponse, Unit]
  ): Request[CreateMonitorResponse, AWSError] = js.native
  
  /**
    *   This operation creates a legacy predictor that does not include all the predictor functionalities provided by Amazon Forecast. To create a predictor that is compatible with all aspects of Forecast, use CreateAutoPredictor.  Creates an Amazon Forecast predictor. In the request, provide a dataset group and either specify an algorithm or let Amazon Forecast choose an algorithm for you using AutoML. If you specify an algorithm, you also can override algorithm-specific hyperparameters. Amazon Forecast uses the algorithm to train a predictor using the latest version of the datasets in the specified dataset group. You can then generate a forecast using the CreateForecast operation.  To see the evaluation metrics, use the GetAccuracyMetrics operation.  You can specify a featurization configuration to fill and aggregate the data fields in the TARGET_TIME_SERIES dataset to improve model training. For more information, see FeaturizationConfig. For RELATED_TIME_SERIES datasets, CreatePredictor verifies that the DataFrequency specified when the dataset was created matches the ForecastFrequency. TARGET_TIME_SERIES datasets don't have this restriction. Amazon Forecast also verifies the delimiter and timestamp format. For more information, see howitworks-datasets-groups. By default, predictors are trained and evaluated at the 0.1 (P10), 0.5 (P50), and 0.9 (P90) quantiles. You can choose custom forecast types to train and evaluate your predictor by setting the ForecastTypes.   AutoML  If you want Amazon Forecast to evaluate each algorithm and choose the one that minimizes the objective function, set PerformAutoML to true. The objective function is defined as the mean of the weighted losses over the forecast types. By default, these are the p10, p50, and p90 quantile losses. For more information, see EvaluationResult. When AutoML is enabled, the following properties are disallowed:    AlgorithmArn     HPOConfig     PerformHPO     TrainingParameters    To get a list of all of your predictors, use the ListPredictors operation.  Before you can use the predictor to create a forecast, the Status of the predictor must be ACTIVE, signifying that training has completed. To get the status, use the DescribePredictor operation. 
    */
  def createPredictor(): Request[CreatePredictorResponse, AWSError] = js.native
  def createPredictor(callback: js.Function2[/* err */ AWSError, /* data */ CreatePredictorResponse, Unit]): Request[CreatePredictorResponse, AWSError] = js.native
  /**
    *   This operation creates a legacy predictor that does not include all the predictor functionalities provided by Amazon Forecast. To create a predictor that is compatible with all aspects of Forecast, use CreateAutoPredictor.  Creates an Amazon Forecast predictor. In the request, provide a dataset group and either specify an algorithm or let Amazon Forecast choose an algorithm for you using AutoML. If you specify an algorithm, you also can override algorithm-specific hyperparameters. Amazon Forecast uses the algorithm to train a predictor using the latest version of the datasets in the specified dataset group. You can then generate a forecast using the CreateForecast operation.  To see the evaluation metrics, use the GetAccuracyMetrics operation.  You can specify a featurization configuration to fill and aggregate the data fields in the TARGET_TIME_SERIES dataset to improve model training. For more information, see FeaturizationConfig. For RELATED_TIME_SERIES datasets, CreatePredictor verifies that the DataFrequency specified when the dataset was created matches the ForecastFrequency. TARGET_TIME_SERIES datasets don't have this restriction. Amazon Forecast also verifies the delimiter and timestamp format. For more information, see howitworks-datasets-groups. By default, predictors are trained and evaluated at the 0.1 (P10), 0.5 (P50), and 0.9 (P90) quantiles. You can choose custom forecast types to train and evaluate your predictor by setting the ForecastTypes.   AutoML  If you want Amazon Forecast to evaluate each algorithm and choose the one that minimizes the objective function, set PerformAutoML to true. The objective function is defined as the mean of the weighted losses over the forecast types. By default, these are the p10, p50, and p90 quantile losses. For more information, see EvaluationResult. When AutoML is enabled, the following properties are disallowed:    AlgorithmArn     HPOConfig     PerformHPO     TrainingParameters    To get a list of all of your predictors, use the ListPredictors operation.  Before you can use the predictor to create a forecast, the Status of the predictor must be ACTIVE, signifying that training has completed. To get the status, use the DescribePredictor operation. 
    */
  def createPredictor(params: CreatePredictorRequest): Request[CreatePredictorResponse, AWSError] = js.native
  def createPredictor(
    params: CreatePredictorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePredictorResponse, Unit]
  ): Request[CreatePredictorResponse, AWSError] = js.native
  
  /**
    * Exports backtest forecasts and accuracy metrics generated by the CreateAutoPredictor or CreatePredictor operations. Two folders containing CSV or Parquet files are exported to your specified S3 bucket.  The export file names will match the following conventions:  &lt;ExportJobName&gt;_&lt;ExportTimestamp&gt;_&lt;PartNumber&gt;.csv  The &lt;ExportTimestamp&gt; component is in Java SimpleDate format (yyyy-MM-ddTHH-mm-ssZ). You must specify a DataDestination object that includes an Amazon S3 bucket and an AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the Amazon S3 bucket. For more information, see aws-forecast-iam-roles.  The Status of the export job must be ACTIVE before you can access the export in your Amazon S3 bucket. To get the status, use the DescribePredictorBacktestExportJob operation. 
    */
  def createPredictorBacktestExportJob(): Request[CreatePredictorBacktestExportJobResponse, AWSError] = js.native
  def createPredictorBacktestExportJob(
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePredictorBacktestExportJobResponse, Unit]
  ): Request[CreatePredictorBacktestExportJobResponse, AWSError] = js.native
  /**
    * Exports backtest forecasts and accuracy metrics generated by the CreateAutoPredictor or CreatePredictor operations. Two folders containing CSV or Parquet files are exported to your specified S3 bucket.  The export file names will match the following conventions:  &lt;ExportJobName&gt;_&lt;ExportTimestamp&gt;_&lt;PartNumber&gt;.csv  The &lt;ExportTimestamp&gt; component is in Java SimpleDate format (yyyy-MM-ddTHH-mm-ssZ). You must specify a DataDestination object that includes an Amazon S3 bucket and an AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the Amazon S3 bucket. For more information, see aws-forecast-iam-roles.  The Status of the export job must be ACTIVE before you can access the export in your Amazon S3 bucket. To get the status, use the DescribePredictorBacktestExportJob operation. 
    */
  def createPredictorBacktestExportJob(params: CreatePredictorBacktestExportJobRequest): Request[CreatePredictorBacktestExportJobResponse, AWSError] = js.native
  def createPredictorBacktestExportJob(
    params: CreatePredictorBacktestExportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePredictorBacktestExportJobResponse, Unit]
  ): Request[CreatePredictorBacktestExportJobResponse, AWSError] = js.native
  
  /**
    * What-if analysis is a scenario modeling technique where you make a hypothetical change to a time series and compare the forecasts generated by these changes against the baseline, unchanged time series. It is important to remember that the purpose of a what-if analysis is to understand how a forecast can change given different modifications to the baseline time series. For example, imagine you are a clothing retailer who is considering an end of season sale to clear space for new styles. After creating a baseline forecast, you can use a what-if analysis to investigate how different sales tactics might affect your goals. You could create a scenario where everything is given a 25% markdown and another where everything is given a fixed dollar markdown. You can create a scenario where the sale lasts for 1 week and another where the sale lasts for 1 month. Your what-if analysis enables you to compare many different scenarios against each other. Note that a what-if analysis is meant to display what the forecasting model has learned and how it will behave in the scenarios that you are evaluating. Do not blindly use the results of the what-if analysis to make business decisions. For instance, forecasts might not be accurate for novel scenarios where there is no reference available to determine whether a forecast is good. The TimeSeriesSelector object defines the items that you want in the what-if analysis.
    */
  def createWhatIfAnalysis(): Request[CreateWhatIfAnalysisResponse, AWSError] = js.native
  def createWhatIfAnalysis(callback: js.Function2[/* err */ AWSError, /* data */ CreateWhatIfAnalysisResponse, Unit]): Request[CreateWhatIfAnalysisResponse, AWSError] = js.native
  /**
    * What-if analysis is a scenario modeling technique where you make a hypothetical change to a time series and compare the forecasts generated by these changes against the baseline, unchanged time series. It is important to remember that the purpose of a what-if analysis is to understand how a forecast can change given different modifications to the baseline time series. For example, imagine you are a clothing retailer who is considering an end of season sale to clear space for new styles. After creating a baseline forecast, you can use a what-if analysis to investigate how different sales tactics might affect your goals. You could create a scenario where everything is given a 25% markdown and another where everything is given a fixed dollar markdown. You can create a scenario where the sale lasts for 1 week and another where the sale lasts for 1 month. Your what-if analysis enables you to compare many different scenarios against each other. Note that a what-if analysis is meant to display what the forecasting model has learned and how it will behave in the scenarios that you are evaluating. Do not blindly use the results of the what-if analysis to make business decisions. For instance, forecasts might not be accurate for novel scenarios where there is no reference available to determine whether a forecast is good. The TimeSeriesSelector object defines the items that you want in the what-if analysis.
    */
  def createWhatIfAnalysis(params: CreateWhatIfAnalysisRequest): Request[CreateWhatIfAnalysisResponse, AWSError] = js.native
  def createWhatIfAnalysis(
    params: CreateWhatIfAnalysisRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWhatIfAnalysisResponse, Unit]
  ): Request[CreateWhatIfAnalysisResponse, AWSError] = js.native
  
  /**
    * A what-if forecast is a forecast that is created from a modified version of the baseline forecast. Each what-if forecast incorporates either a replacement dataset or a set of transformations to the original dataset. 
    */
  def createWhatIfForecast(): Request[CreateWhatIfForecastResponse, AWSError] = js.native
  def createWhatIfForecast(callback: js.Function2[/* err */ AWSError, /* data */ CreateWhatIfForecastResponse, Unit]): Request[CreateWhatIfForecastResponse, AWSError] = js.native
  /**
    * A what-if forecast is a forecast that is created from a modified version of the baseline forecast. Each what-if forecast incorporates either a replacement dataset or a set of transformations to the original dataset. 
    */
  def createWhatIfForecast(params: CreateWhatIfForecastRequest): Request[CreateWhatIfForecastResponse, AWSError] = js.native
  def createWhatIfForecast(
    params: CreateWhatIfForecastRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWhatIfForecastResponse, Unit]
  ): Request[CreateWhatIfForecastResponse, AWSError] = js.native
  
  /**
    * Exports a forecast created by the CreateWhatIfForecast operation to your Amazon Simple Storage Service (Amazon S3) bucket. The forecast file name will match the following conventions:  ≈&lt;ForecastExportJobName&gt;_&lt;ExportTimestamp&gt;_&lt;PartNumber&gt;  The &lt;ExportTimestamp&gt; component is in Java SimpleDateFormat (yyyy-MM-ddTHH-mm-ssZ). You must specify a DataDestination object that includes an AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the Amazon S3 bucket. For more information, see aws-forecast-iam-roles. For more information, see howitworks-forecast. To get a list of all your what-if forecast export jobs, use the ListWhatIfForecastExports operation.  The Status of the forecast export job must be ACTIVE before you can access the forecast in your Amazon S3 bucket. To get the status, use the DescribeWhatIfForecastExport operation. 
    */
  def createWhatIfForecastExport(): Request[CreateWhatIfForecastExportResponse, AWSError] = js.native
  def createWhatIfForecastExport(callback: js.Function2[/* err */ AWSError, /* data */ CreateWhatIfForecastExportResponse, Unit]): Request[CreateWhatIfForecastExportResponse, AWSError] = js.native
  /**
    * Exports a forecast created by the CreateWhatIfForecast operation to your Amazon Simple Storage Service (Amazon S3) bucket. The forecast file name will match the following conventions:  ≈&lt;ForecastExportJobName&gt;_&lt;ExportTimestamp&gt;_&lt;PartNumber&gt;  The &lt;ExportTimestamp&gt; component is in Java SimpleDateFormat (yyyy-MM-ddTHH-mm-ssZ). You must specify a DataDestination object that includes an AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the Amazon S3 bucket. For more information, see aws-forecast-iam-roles. For more information, see howitworks-forecast. To get a list of all your what-if forecast export jobs, use the ListWhatIfForecastExports operation.  The Status of the forecast export job must be ACTIVE before you can access the forecast in your Amazon S3 bucket. To get the status, use the DescribeWhatIfForecastExport operation. 
    */
  def createWhatIfForecastExport(params: CreateWhatIfForecastExportRequest): Request[CreateWhatIfForecastExportResponse, AWSError] = js.native
  def createWhatIfForecastExport(
    params: CreateWhatIfForecastExportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWhatIfForecastExportResponse, Unit]
  ): Request[CreateWhatIfForecastExportResponse, AWSError] = js.native
  
  /**
    * Deletes an Amazon Forecast dataset that was created using the CreateDataset operation. You can only delete datasets that have a status of ACTIVE or CREATE_FAILED. To get the status use the DescribeDataset operation.  Forecast does not automatically update any dataset groups that contain the deleted dataset. In order to update the dataset group, use the UpdateDatasetGroup operation, omitting the deleted dataset's ARN. 
    */
  def deleteDataset(): Request[js.Object, AWSError] = js.native
  def deleteDataset(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an Amazon Forecast dataset that was created using the CreateDataset operation. You can only delete datasets that have a status of ACTIVE or CREATE_FAILED. To get the status use the DescribeDataset operation.  Forecast does not automatically update any dataset groups that contain the deleted dataset. In order to update the dataset group, use the UpdateDatasetGroup operation, omitting the deleted dataset's ARN. 
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
    * Deletes an Explainability resource. You can delete only predictor that have a status of ACTIVE or CREATE_FAILED. To get the status, use the DescribeExplainability operation.
    */
  def deleteExplainability(): Request[js.Object, AWSError] = js.native
  def deleteExplainability(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an Explainability resource. You can delete only predictor that have a status of ACTIVE or CREATE_FAILED. To get the status, use the DescribeExplainability operation.
    */
  def deleteExplainability(params: DeleteExplainabilityRequest): Request[js.Object, AWSError] = js.native
  def deleteExplainability(
    params: DeleteExplainabilityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes an Explainability export.
    */
  def deleteExplainabilityExport(): Request[js.Object, AWSError] = js.native
  def deleteExplainabilityExport(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an Explainability export.
    */
  def deleteExplainabilityExport(params: DeleteExplainabilityExportRequest): Request[js.Object, AWSError] = js.native
  def deleteExplainabilityExport(
    params: DeleteExplainabilityExportRequest,
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
    * Deletes a monitor resource. You can only delete a monitor resource with a status of ACTIVE, ACTIVE_STOPPED, CREATE_FAILED, or CREATE_STOPPED.
    */
  def deleteMonitor(): Request[js.Object, AWSError] = js.native
  def deleteMonitor(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a monitor resource. You can only delete a monitor resource with a status of ACTIVE, ACTIVE_STOPPED, CREATE_FAILED, or CREATE_STOPPED.
    */
  def deleteMonitor(params: DeleteMonitorRequest): Request[js.Object, AWSError] = js.native
  def deleteMonitor(
    params: DeleteMonitorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a predictor created using the DescribePredictor or CreatePredictor operations. You can delete only predictor that have a status of ACTIVE or CREATE_FAILED. To get the status, use the DescribePredictor operation.
    */
  def deletePredictor(): Request[js.Object, AWSError] = js.native
  def deletePredictor(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a predictor created using the DescribePredictor or CreatePredictor operations. You can delete only predictor that have a status of ACTIVE or CREATE_FAILED. To get the status, use the DescribePredictor operation.
    */
  def deletePredictor(params: DeletePredictorRequest): Request[js.Object, AWSError] = js.native
  def deletePredictor(
    params: DeletePredictorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a predictor backtest export job.
    */
  def deletePredictorBacktestExportJob(): Request[js.Object, AWSError] = js.native
  def deletePredictorBacktestExportJob(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a predictor backtest export job.
    */
  def deletePredictorBacktestExportJob(params: DeletePredictorBacktestExportJobRequest): Request[js.Object, AWSError] = js.native
  def deletePredictorBacktestExportJob(
    params: DeletePredictorBacktestExportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes an entire resource tree. This operation will delete the parent resource and its child resources. Child resources are resources that were created from another resource. For example, when a forecast is generated from a predictor, the forecast is the child resource and the predictor is the parent resource. Amazon Forecast resources possess the following parent-child resource hierarchies:    Dataset: dataset import jobs    Dataset Group: predictors, predictor backtest export jobs, forecasts, forecast export jobs    Predictor: predictor backtest export jobs, forecasts, forecast export jobs    Forecast: forecast export jobs     DeleteResourceTree will only delete Amazon Forecast resources, and will not delete datasets or exported files stored in Amazon S3.  
    */
  def deleteResourceTree(): Request[js.Object, AWSError] = js.native
  def deleteResourceTree(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an entire resource tree. This operation will delete the parent resource and its child resources. Child resources are resources that were created from another resource. For example, when a forecast is generated from a predictor, the forecast is the child resource and the predictor is the parent resource. Amazon Forecast resources possess the following parent-child resource hierarchies:    Dataset: dataset import jobs    Dataset Group: predictors, predictor backtest export jobs, forecasts, forecast export jobs    Predictor: predictor backtest export jobs, forecasts, forecast export jobs    Forecast: forecast export jobs     DeleteResourceTree will only delete Amazon Forecast resources, and will not delete datasets or exported files stored in Amazon S3.  
    */
  def deleteResourceTree(params: DeleteResourceTreeRequest): Request[js.Object, AWSError] = js.native
  def deleteResourceTree(
    params: DeleteResourceTreeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a what-if analysis created using the CreateWhatIfAnalysis operation. You can delete only what-if analyses that have a status of ACTIVE or CREATE_FAILED. To get the status, use the DescribeWhatIfAnalysis operation.  You can't delete a what-if analysis while any of its forecasts are being exported.
    */
  def deleteWhatIfAnalysis(): Request[js.Object, AWSError] = js.native
  def deleteWhatIfAnalysis(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a what-if analysis created using the CreateWhatIfAnalysis operation. You can delete only what-if analyses that have a status of ACTIVE or CREATE_FAILED. To get the status, use the DescribeWhatIfAnalysis operation.  You can't delete a what-if analysis while any of its forecasts are being exported.
    */
  def deleteWhatIfAnalysis(params: DeleteWhatIfAnalysisRequest): Request[js.Object, AWSError] = js.native
  def deleteWhatIfAnalysis(
    params: DeleteWhatIfAnalysisRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a what-if forecast created using the CreateWhatIfForecast operation. You can delete only what-if forecasts that have a status of ACTIVE or CREATE_FAILED. To get the status, use the DescribeWhatIfForecast operation.  You can't delete a what-if forecast while it is being exported. After a what-if forecast is deleted, you can no longer query the what-if analysis.
    */
  def deleteWhatIfForecast(): Request[js.Object, AWSError] = js.native
  def deleteWhatIfForecast(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a what-if forecast created using the CreateWhatIfForecast operation. You can delete only what-if forecasts that have a status of ACTIVE or CREATE_FAILED. To get the status, use the DescribeWhatIfForecast operation.  You can't delete a what-if forecast while it is being exported. After a what-if forecast is deleted, you can no longer query the what-if analysis.
    */
  def deleteWhatIfForecast(params: DeleteWhatIfForecastRequest): Request[js.Object, AWSError] = js.native
  def deleteWhatIfForecast(
    params: DeleteWhatIfForecastRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a what-if forecast export created using the CreateWhatIfForecastExport operation. You can delete only what-if forecast exports that have a status of ACTIVE or CREATE_FAILED. To get the status, use the DescribeWhatIfForecastExport operation. 
    */
  def deleteWhatIfForecastExport(): Request[js.Object, AWSError] = js.native
  def deleteWhatIfForecastExport(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a what-if forecast export created using the CreateWhatIfForecastExport operation. You can delete only what-if forecast exports that have a status of ACTIVE or CREATE_FAILED. To get the status, use the DescribeWhatIfForecastExport operation. 
    */
  def deleteWhatIfForecastExport(params: DeleteWhatIfForecastExportRequest): Request[js.Object, AWSError] = js.native
  def deleteWhatIfForecastExport(
    params: DeleteWhatIfForecastExportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Describes a predictor created using the CreateAutoPredictor operation.
    */
  def describeAutoPredictor(): Request[DescribeAutoPredictorResponse, AWSError] = js.native
  def describeAutoPredictor(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAutoPredictorResponse, Unit]): Request[DescribeAutoPredictorResponse, AWSError] = js.native
  /**
    * Describes a predictor created using the CreateAutoPredictor operation.
    */
  def describeAutoPredictor(params: DescribeAutoPredictorRequest): Request[DescribeAutoPredictorResponse, AWSError] = js.native
  def describeAutoPredictor(
    params: DescribeAutoPredictorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAutoPredictorResponse, Unit]
  ): Request[DescribeAutoPredictorResponse, AWSError] = js.native
  
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
    * Describes an Explainability resource created using the CreateExplainability operation.
    */
  def describeExplainability(): Request[DescribeExplainabilityResponse, AWSError] = js.native
  def describeExplainability(callback: js.Function2[/* err */ AWSError, /* data */ DescribeExplainabilityResponse, Unit]): Request[DescribeExplainabilityResponse, AWSError] = js.native
  /**
    * Describes an Explainability resource created using the CreateExplainability operation.
    */
  def describeExplainability(params: DescribeExplainabilityRequest): Request[DescribeExplainabilityResponse, AWSError] = js.native
  def describeExplainability(
    params: DescribeExplainabilityRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeExplainabilityResponse, Unit]
  ): Request[DescribeExplainabilityResponse, AWSError] = js.native
  
  /**
    * Describes an Explainability export created using the CreateExplainabilityExport operation.
    */
  def describeExplainabilityExport(): Request[DescribeExplainabilityExportResponse, AWSError] = js.native
  def describeExplainabilityExport(callback: js.Function2[/* err */ AWSError, /* data */ DescribeExplainabilityExportResponse, Unit]): Request[DescribeExplainabilityExportResponse, AWSError] = js.native
  /**
    * Describes an Explainability export created using the CreateExplainabilityExport operation.
    */
  def describeExplainabilityExport(params: DescribeExplainabilityExportRequest): Request[DescribeExplainabilityExportResponse, AWSError] = js.native
  def describeExplainabilityExport(
    params: DescribeExplainabilityExportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeExplainabilityExportResponse, Unit]
  ): Request[DescribeExplainabilityExportResponse, AWSError] = js.native
  
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
    * Describes a monitor resource. In addition to listing the properties provided in the CreateMonitor request, this operation lists the following properties:    Baseline     CreationTime     LastEvaluationTime     LastEvaluationState     LastModificationTime     Message     Status   
    */
  def describeMonitor(): Request[DescribeMonitorResponse, AWSError] = js.native
  def describeMonitor(callback: js.Function2[/* err */ AWSError, /* data */ DescribeMonitorResponse, Unit]): Request[DescribeMonitorResponse, AWSError] = js.native
  /**
    * Describes a monitor resource. In addition to listing the properties provided in the CreateMonitor request, this operation lists the following properties:    Baseline     CreationTime     LastEvaluationTime     LastEvaluationState     LastModificationTime     Message     Status   
    */
  def describeMonitor(params: DescribeMonitorRequest): Request[DescribeMonitorResponse, AWSError] = js.native
  def describeMonitor(
    params: DescribeMonitorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeMonitorResponse, Unit]
  ): Request[DescribeMonitorResponse, AWSError] = js.native
  
  /**
    *   This operation is only valid for legacy predictors created with CreatePredictor. If you are not using a legacy predictor, use DescribeAutoPredictor.  Describes a predictor created using the CreatePredictor operation. In addition to listing the properties provided in the CreatePredictor request, this operation lists the following properties:    DatasetImportJobArns - The dataset import jobs used to import training data.    AutoMLAlgorithmArns - If AutoML is performed, the algorithms that were evaluated.    CreationTime     LastModificationTime     Status     Message - If an error occurred, information about the error.  
    */
  def describePredictor(): Request[DescribePredictorResponse, AWSError] = js.native
  def describePredictor(callback: js.Function2[/* err */ AWSError, /* data */ DescribePredictorResponse, Unit]): Request[DescribePredictorResponse, AWSError] = js.native
  /**
    *   This operation is only valid for legacy predictors created with CreatePredictor. If you are not using a legacy predictor, use DescribeAutoPredictor.  Describes a predictor created using the CreatePredictor operation. In addition to listing the properties provided in the CreatePredictor request, this operation lists the following properties:    DatasetImportJobArns - The dataset import jobs used to import training data.    AutoMLAlgorithmArns - If AutoML is performed, the algorithms that were evaluated.    CreationTime     LastModificationTime     Status     Message - If an error occurred, information about the error.  
    */
  def describePredictor(params: DescribePredictorRequest): Request[DescribePredictorResponse, AWSError] = js.native
  def describePredictor(
    params: DescribePredictorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePredictorResponse, Unit]
  ): Request[DescribePredictorResponse, AWSError] = js.native
  
  /**
    * Describes a predictor backtest export job created using the CreatePredictorBacktestExportJob operation. In addition to listing the properties provided by the user in the CreatePredictorBacktestExportJob request, this operation lists the following properties:    CreationTime     LastModificationTime     Status     Message (if an error occurred)  
    */
  def describePredictorBacktestExportJob(): Request[DescribePredictorBacktestExportJobResponse, AWSError] = js.native
  def describePredictorBacktestExportJob(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePredictorBacktestExportJobResponse, Unit]
  ): Request[DescribePredictorBacktestExportJobResponse, AWSError] = js.native
  /**
    * Describes a predictor backtest export job created using the CreatePredictorBacktestExportJob operation. In addition to listing the properties provided by the user in the CreatePredictorBacktestExportJob request, this operation lists the following properties:    CreationTime     LastModificationTime     Status     Message (if an error occurred)  
    */
  def describePredictorBacktestExportJob(params: DescribePredictorBacktestExportJobRequest): Request[DescribePredictorBacktestExportJobResponse, AWSError] = js.native
  def describePredictorBacktestExportJob(
    params: DescribePredictorBacktestExportJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePredictorBacktestExportJobResponse, Unit]
  ): Request[DescribePredictorBacktestExportJobResponse, AWSError] = js.native
  
  /**
    * Describes the what-if analysis created using the CreateWhatIfAnalysis operation. In addition to listing the properties provided in the CreateWhatIfAnalysis request, this operation lists the following properties:    CreationTime     LastModificationTime     Message - If an error occurred, information about the error.    Status   
    */
  def describeWhatIfAnalysis(): Request[DescribeWhatIfAnalysisResponse, AWSError] = js.native
  def describeWhatIfAnalysis(callback: js.Function2[/* err */ AWSError, /* data */ DescribeWhatIfAnalysisResponse, Unit]): Request[DescribeWhatIfAnalysisResponse, AWSError] = js.native
  /**
    * Describes the what-if analysis created using the CreateWhatIfAnalysis operation. In addition to listing the properties provided in the CreateWhatIfAnalysis request, this operation lists the following properties:    CreationTime     LastModificationTime     Message - If an error occurred, information about the error.    Status   
    */
  def describeWhatIfAnalysis(params: DescribeWhatIfAnalysisRequest): Request[DescribeWhatIfAnalysisResponse, AWSError] = js.native
  def describeWhatIfAnalysis(
    params: DescribeWhatIfAnalysisRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeWhatIfAnalysisResponse, Unit]
  ): Request[DescribeWhatIfAnalysisResponse, AWSError] = js.native
  
  /**
    * Describes the what-if forecast created using the CreateWhatIfForecast operation. In addition to listing the properties provided in the CreateWhatIfForecast request, this operation lists the following properties:    CreationTime     LastModificationTime     Message - If an error occurred, information about the error.    Status   
    */
  def describeWhatIfForecast(): Request[DescribeWhatIfForecastResponse, AWSError] = js.native
  def describeWhatIfForecast(callback: js.Function2[/* err */ AWSError, /* data */ DescribeWhatIfForecastResponse, Unit]): Request[DescribeWhatIfForecastResponse, AWSError] = js.native
  /**
    * Describes the what-if forecast created using the CreateWhatIfForecast operation. In addition to listing the properties provided in the CreateWhatIfForecast request, this operation lists the following properties:    CreationTime     LastModificationTime     Message - If an error occurred, information about the error.    Status   
    */
  def describeWhatIfForecast(params: DescribeWhatIfForecastRequest): Request[DescribeWhatIfForecastResponse, AWSError] = js.native
  def describeWhatIfForecast(
    params: DescribeWhatIfForecastRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeWhatIfForecastResponse, Unit]
  ): Request[DescribeWhatIfForecastResponse, AWSError] = js.native
  
  /**
    * Describes the what-if forecast export created using the CreateWhatIfForecastExport operation. In addition to listing the properties provided in the CreateWhatIfForecastExport request, this operation lists the following properties:    CreationTime     LastModificationTime     Message - If an error occurred, information about the error.    Status   
    */
  def describeWhatIfForecastExport(): Request[DescribeWhatIfForecastExportResponse, AWSError] = js.native
  def describeWhatIfForecastExport(callback: js.Function2[/* err */ AWSError, /* data */ DescribeWhatIfForecastExportResponse, Unit]): Request[DescribeWhatIfForecastExportResponse, AWSError] = js.native
  /**
    * Describes the what-if forecast export created using the CreateWhatIfForecastExport operation. In addition to listing the properties provided in the CreateWhatIfForecastExport request, this operation lists the following properties:    CreationTime     LastModificationTime     Message - If an error occurred, information about the error.    Status   
    */
  def describeWhatIfForecastExport(params: DescribeWhatIfForecastExportRequest): Request[DescribeWhatIfForecastExportResponse, AWSError] = js.native
  def describeWhatIfForecastExport(
    params: DescribeWhatIfForecastExportRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeWhatIfForecastExportResponse, Unit]
  ): Request[DescribeWhatIfForecastExportResponse, AWSError] = js.native
  
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
    * Returns a list of Explainability resources created using the CreateExplainability operation. This operation returns a summary for each Explainability. You can filter the list using an array of Filter objects. To retrieve the complete set of properties for a particular Explainability resource, use the ARN with the DescribeExplainability operation.
    */
  def listExplainabilities(): Request[ListExplainabilitiesResponse, AWSError] = js.native
  def listExplainabilities(callback: js.Function2[/* err */ AWSError, /* data */ ListExplainabilitiesResponse, Unit]): Request[ListExplainabilitiesResponse, AWSError] = js.native
  /**
    * Returns a list of Explainability resources created using the CreateExplainability operation. This operation returns a summary for each Explainability. You can filter the list using an array of Filter objects. To retrieve the complete set of properties for a particular Explainability resource, use the ARN with the DescribeExplainability operation.
    */
  def listExplainabilities(params: ListExplainabilitiesRequest): Request[ListExplainabilitiesResponse, AWSError] = js.native
  def listExplainabilities(
    params: ListExplainabilitiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListExplainabilitiesResponse, Unit]
  ): Request[ListExplainabilitiesResponse, AWSError] = js.native
  
  /**
    * Returns a list of Explainability exports created using the CreateExplainabilityExport operation. This operation returns a summary for each Explainability export. You can filter the list using an array of Filter objects. To retrieve the complete set of properties for a particular Explainability export, use the ARN with the DescribeExplainability operation.
    */
  def listExplainabilityExports(): Request[ListExplainabilityExportsResponse, AWSError] = js.native
  def listExplainabilityExports(callback: js.Function2[/* err */ AWSError, /* data */ ListExplainabilityExportsResponse, Unit]): Request[ListExplainabilityExportsResponse, AWSError] = js.native
  /**
    * Returns a list of Explainability exports created using the CreateExplainabilityExport operation. This operation returns a summary for each Explainability export. You can filter the list using an array of Filter objects. To retrieve the complete set of properties for a particular Explainability export, use the ARN with the DescribeExplainability operation.
    */
  def listExplainabilityExports(params: ListExplainabilityExportsRequest): Request[ListExplainabilityExportsResponse, AWSError] = js.native
  def listExplainabilityExports(
    params: ListExplainabilityExportsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListExplainabilityExportsResponse, Unit]
  ): Request[ListExplainabilityExportsResponse, AWSError] = js.native
  
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
    * Returns a list of the monitoring evaluation results and predictor events collected by the monitor resource during different windows of time. For information about monitoring see predictor-monitoring. For more information about retrieving monitoring results see Viewing Monitoring Results.
    */
  def listMonitorEvaluations(): Request[ListMonitorEvaluationsResponse, AWSError] = js.native
  def listMonitorEvaluations(callback: js.Function2[/* err */ AWSError, /* data */ ListMonitorEvaluationsResponse, Unit]): Request[ListMonitorEvaluationsResponse, AWSError] = js.native
  /**
    * Returns a list of the monitoring evaluation results and predictor events collected by the monitor resource during different windows of time. For information about monitoring see predictor-monitoring. For more information about retrieving monitoring results see Viewing Monitoring Results.
    */
  def listMonitorEvaluations(params: ListMonitorEvaluationsRequest): Request[ListMonitorEvaluationsResponse, AWSError] = js.native
  def listMonitorEvaluations(
    params: ListMonitorEvaluationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMonitorEvaluationsResponse, Unit]
  ): Request[ListMonitorEvaluationsResponse, AWSError] = js.native
  
  /**
    * Returns a list of monitors created with the CreateMonitor operation and CreateAutoPredictor operation. For each monitor resource, this operation returns of a summary of its properties, including its Amazon Resource Name (ARN). You can retrieve a complete set of properties of a monitor resource by specify the monitor's ARN in the DescribeMonitor operation.
    */
  def listMonitors(): Request[ListMonitorsResponse, AWSError] = js.native
  def listMonitors(callback: js.Function2[/* err */ AWSError, /* data */ ListMonitorsResponse, Unit]): Request[ListMonitorsResponse, AWSError] = js.native
  /**
    * Returns a list of monitors created with the CreateMonitor operation and CreateAutoPredictor operation. For each monitor resource, this operation returns of a summary of its properties, including its Amazon Resource Name (ARN). You can retrieve a complete set of properties of a monitor resource by specify the monitor's ARN in the DescribeMonitor operation.
    */
  def listMonitors(params: ListMonitorsRequest): Request[ListMonitorsResponse, AWSError] = js.native
  def listMonitors(
    params: ListMonitorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMonitorsResponse, Unit]
  ): Request[ListMonitorsResponse, AWSError] = js.native
  
  /**
    * Returns a list of predictor backtest export jobs created using the CreatePredictorBacktestExportJob operation. This operation returns a summary for each backtest export job. You can filter the list using an array of Filter objects. To retrieve the complete set of properties for a particular backtest export job, use the ARN with the DescribePredictorBacktestExportJob operation.
    */
  def listPredictorBacktestExportJobs(): Request[ListPredictorBacktestExportJobsResponse, AWSError] = js.native
  def listPredictorBacktestExportJobs(
    callback: js.Function2[/* err */ AWSError, /* data */ ListPredictorBacktestExportJobsResponse, Unit]
  ): Request[ListPredictorBacktestExportJobsResponse, AWSError] = js.native
  /**
    * Returns a list of predictor backtest export jobs created using the CreatePredictorBacktestExportJob operation. This operation returns a summary for each backtest export job. You can filter the list using an array of Filter objects. To retrieve the complete set of properties for a particular backtest export job, use the ARN with the DescribePredictorBacktestExportJob operation.
    */
  def listPredictorBacktestExportJobs(params: ListPredictorBacktestExportJobsRequest): Request[ListPredictorBacktestExportJobsResponse, AWSError] = js.native
  def listPredictorBacktestExportJobs(
    params: ListPredictorBacktestExportJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPredictorBacktestExportJobsResponse, Unit]
  ): Request[ListPredictorBacktestExportJobsResponse, AWSError] = js.native
  
  /**
    * Returns a list of predictors created using the CreateAutoPredictor or CreatePredictor operations. For each predictor, this operation returns a summary of its properties, including its Amazon Resource Name (ARN).  You can retrieve the complete set of properties by using the ARN with the DescribeAutoPredictor and DescribePredictor operations. You can filter the list using an array of Filter objects.
    */
  def listPredictors(): Request[ListPredictorsResponse, AWSError] = js.native
  def listPredictors(callback: js.Function2[/* err */ AWSError, /* data */ ListPredictorsResponse, Unit]): Request[ListPredictorsResponse, AWSError] = js.native
  /**
    * Returns a list of predictors created using the CreateAutoPredictor or CreatePredictor operations. For each predictor, this operation returns a summary of its properties, including its Amazon Resource Name (ARN).  You can retrieve the complete set of properties by using the ARN with the DescribeAutoPredictor and DescribePredictor operations. You can filter the list using an array of Filter objects.
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
    * Returns a list of what-if analyses created using the CreateWhatIfAnalysis operation. For each what-if analysis, this operation returns a summary of its properties, including its Amazon Resource Name (ARN). You can retrieve the complete set of properties by using the what-if analysis ARN with the DescribeWhatIfAnalysis operation.
    */
  def listWhatIfAnalyses(): Request[ListWhatIfAnalysesResponse, AWSError] = js.native
  def listWhatIfAnalyses(callback: js.Function2[/* err */ AWSError, /* data */ ListWhatIfAnalysesResponse, Unit]): Request[ListWhatIfAnalysesResponse, AWSError] = js.native
  /**
    * Returns a list of what-if analyses created using the CreateWhatIfAnalysis operation. For each what-if analysis, this operation returns a summary of its properties, including its Amazon Resource Name (ARN). You can retrieve the complete set of properties by using the what-if analysis ARN with the DescribeWhatIfAnalysis operation.
    */
  def listWhatIfAnalyses(params: ListWhatIfAnalysesRequest): Request[ListWhatIfAnalysesResponse, AWSError] = js.native
  def listWhatIfAnalyses(
    params: ListWhatIfAnalysesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListWhatIfAnalysesResponse, Unit]
  ): Request[ListWhatIfAnalysesResponse, AWSError] = js.native
  
  /**
    * Returns a list of what-if forecast exports created using the CreateWhatIfForecastExport operation. For each what-if forecast export, this operation returns a summary of its properties, including its Amazon Resource Name (ARN). You can retrieve the complete set of properties by using the what-if forecast export ARN with the DescribeWhatIfForecastExport operation.
    */
  def listWhatIfForecastExports(): Request[ListWhatIfForecastExportsResponse, AWSError] = js.native
  def listWhatIfForecastExports(callback: js.Function2[/* err */ AWSError, /* data */ ListWhatIfForecastExportsResponse, Unit]): Request[ListWhatIfForecastExportsResponse, AWSError] = js.native
  /**
    * Returns a list of what-if forecast exports created using the CreateWhatIfForecastExport operation. For each what-if forecast export, this operation returns a summary of its properties, including its Amazon Resource Name (ARN). You can retrieve the complete set of properties by using the what-if forecast export ARN with the DescribeWhatIfForecastExport operation.
    */
  def listWhatIfForecastExports(params: ListWhatIfForecastExportsRequest): Request[ListWhatIfForecastExportsResponse, AWSError] = js.native
  def listWhatIfForecastExports(
    params: ListWhatIfForecastExportsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListWhatIfForecastExportsResponse, Unit]
  ): Request[ListWhatIfForecastExportsResponse, AWSError] = js.native
  
  /**
    * Returns a list of what-if forecasts created using the CreateWhatIfForecast operation. For each what-if forecast, this operation returns a summary of its properties, including its Amazon Resource Name (ARN). You can retrieve the complete set of properties by using the what-if forecast ARN with the DescribeWhatIfForecast operation.
    */
  def listWhatIfForecasts(): Request[ListWhatIfForecastsResponse, AWSError] = js.native
  def listWhatIfForecasts(callback: js.Function2[/* err */ AWSError, /* data */ ListWhatIfForecastsResponse, Unit]): Request[ListWhatIfForecastsResponse, AWSError] = js.native
  /**
    * Returns a list of what-if forecasts created using the CreateWhatIfForecast operation. For each what-if forecast, this operation returns a summary of its properties, including its Amazon Resource Name (ARN). You can retrieve the complete set of properties by using the what-if forecast ARN with the DescribeWhatIfForecast operation.
    */
  def listWhatIfForecasts(params: ListWhatIfForecastsRequest): Request[ListWhatIfForecastsResponse, AWSError] = js.native
  def listWhatIfForecasts(
    params: ListWhatIfForecastsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListWhatIfForecastsResponse, Unit]
  ): Request[ListWhatIfForecastsResponse, AWSError] = js.native
  
  /**
    * Resumes a stopped monitor resource.
    */
  def resumeResource(): Request[js.Object, AWSError] = js.native
  def resumeResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Resumes a stopped monitor resource.
    */
  def resumeResource(params: ResumeResourceRequest): Request[js.Object, AWSError] = js.native
  def resumeResource(
    params: ResumeResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Stops a resource. The resource undergoes the following states: CREATE_STOPPING and CREATE_STOPPED. You cannot resume a resource once it has been stopped. This operation can be applied to the following resources (and their corresponding child resources):   Dataset Import Job   Predictor Job   Forecast Job   Forecast Export Job   Predictor Backtest Export Job   Explainability Job   Explainability Export Job  
    */
  def stopResource(): Request[js.Object, AWSError] = js.native
  def stopResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Stops a resource. The resource undergoes the following states: CREATE_STOPPING and CREATE_STOPPED. You cannot resume a resource once it has been stopped. This operation can be applied to the following resources (and their corresponding child resources):   Dataset Import Job   Predictor Job   Forecast Job   Forecast Export Job   Predictor Backtest Export Job   Explainability Job   Explainability Export Job  
    */
  def stopResource(params: StopResourceRequest): Request[js.Object, AWSError] = js.native
  def stopResource(
    params: StopResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
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
