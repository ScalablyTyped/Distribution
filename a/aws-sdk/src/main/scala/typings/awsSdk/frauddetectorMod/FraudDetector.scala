package typings.awsSdk.frauddetectorMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FraudDetector extends Service {
  @JSName("config")
  var config_FraudDetector: ConfigBase with ClientConfiguration = js.native
  /**
    * Creates a batch of variables.
    */
  def batchCreateVariable(): Request[BatchCreateVariableResult, AWSError] = js.native
  def batchCreateVariable(callback: js.Function2[/* err */ AWSError, /* data */ BatchCreateVariableResult, Unit]): Request[BatchCreateVariableResult, AWSError] = js.native
  /**
    * Creates a batch of variables.
    */
  def batchCreateVariable(params: BatchCreateVariableRequest): Request[BatchCreateVariableResult, AWSError] = js.native
  def batchCreateVariable(
    params: BatchCreateVariableRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchCreateVariableResult, Unit]
  ): Request[BatchCreateVariableResult, AWSError] = js.native
  /**
    * Gets a batch of variables.
    */
  def batchGetVariable(): Request[BatchGetVariableResult, AWSError] = js.native
  def batchGetVariable(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetVariableResult, Unit]): Request[BatchGetVariableResult, AWSError] = js.native
  /**
    * Gets a batch of variables.
    */
  def batchGetVariable(params: BatchGetVariableRequest): Request[BatchGetVariableResult, AWSError] = js.native
  def batchGetVariable(
    params: BatchGetVariableRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetVariableResult, Unit]
  ): Request[BatchGetVariableResult, AWSError] = js.native
  /**
    * Creates a detector version. The detector version starts in a DRAFT status.
    */
  def createDetectorVersion(): Request[CreateDetectorVersionResult, AWSError] = js.native
  def createDetectorVersion(callback: js.Function2[/* err */ AWSError, /* data */ CreateDetectorVersionResult, Unit]): Request[CreateDetectorVersionResult, AWSError] = js.native
  /**
    * Creates a detector version. The detector version starts in a DRAFT status.
    */
  def createDetectorVersion(params: CreateDetectorVersionRequest): Request[CreateDetectorVersionResult, AWSError] = js.native
  def createDetectorVersion(
    params: CreateDetectorVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDetectorVersionResult, Unit]
  ): Request[CreateDetectorVersionResult, AWSError] = js.native
  /**
    * Creates a version of the model using the specified model type. 
    */
  def createModelVersion(): Request[CreateModelVersionResult, AWSError] = js.native
  def createModelVersion(callback: js.Function2[/* err */ AWSError, /* data */ CreateModelVersionResult, Unit]): Request[CreateModelVersionResult, AWSError] = js.native
  /**
    * Creates a version of the model using the specified model type. 
    */
  def createModelVersion(params: CreateModelVersionRequest): Request[CreateModelVersionResult, AWSError] = js.native
  def createModelVersion(
    params: CreateModelVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateModelVersionResult, Unit]
  ): Request[CreateModelVersionResult, AWSError] = js.native
  /**
    * Creates a rule for use with the specified detector. 
    */
  def createRule(): Request[CreateRuleResult, AWSError] = js.native
  def createRule(callback: js.Function2[/* err */ AWSError, /* data */ CreateRuleResult, Unit]): Request[CreateRuleResult, AWSError] = js.native
  /**
    * Creates a rule for use with the specified detector. 
    */
  def createRule(params: CreateRuleRequest): Request[CreateRuleResult, AWSError] = js.native
  def createRule(
    params: CreateRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRuleResult, Unit]
  ): Request[CreateRuleResult, AWSError] = js.native
  /**
    * Creates a variable.
    */
  def createVariable(): Request[CreateVariableResult, AWSError] = js.native
  def createVariable(callback: js.Function2[/* err */ AWSError, /* data */ CreateVariableResult, Unit]): Request[CreateVariableResult, AWSError] = js.native
  /**
    * Creates a variable.
    */
  def createVariable(params: CreateVariableRequest): Request[CreateVariableResult, AWSError] = js.native
  def createVariable(
    params: CreateVariableRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVariableResult, Unit]
  ): Request[CreateVariableResult, AWSError] = js.native
  /**
    * Deletes the detector version.
    */
  def deleteDetectorVersion(): Request[DeleteDetectorVersionResult, AWSError] = js.native
  def deleteDetectorVersion(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDetectorVersionResult, Unit]): Request[DeleteDetectorVersionResult, AWSError] = js.native
  /**
    * Deletes the detector version.
    */
  def deleteDetectorVersion(params: DeleteDetectorVersionRequest): Request[DeleteDetectorVersionResult, AWSError] = js.native
  def deleteDetectorVersion(
    params: DeleteDetectorVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDetectorVersionResult, Unit]
  ): Request[DeleteDetectorVersionResult, AWSError] = js.native
  /**
    * Deletes the specified event.
    */
  def deleteEvent(): Request[DeleteEventResult, AWSError] = js.native
  def deleteEvent(callback: js.Function2[/* err */ AWSError, /* data */ DeleteEventResult, Unit]): Request[DeleteEventResult, AWSError] = js.native
  /**
    * Deletes the specified event.
    */
  def deleteEvent(params: DeleteEventRequest): Request[DeleteEventResult, AWSError] = js.native
  def deleteEvent(
    params: DeleteEventRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEventResult, Unit]
  ): Request[DeleteEventResult, AWSError] = js.native
  /**
    * Gets all versions for a specified detector.
    */
  def describeDetector(): Request[DescribeDetectorResult, AWSError] = js.native
  def describeDetector(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDetectorResult, Unit]): Request[DescribeDetectorResult, AWSError] = js.native
  /**
    * Gets all versions for a specified detector.
    */
  def describeDetector(params: DescribeDetectorRequest): Request[DescribeDetectorResult, AWSError] = js.native
  def describeDetector(
    params: DescribeDetectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDetectorResult, Unit]
  ): Request[DescribeDetectorResult, AWSError] = js.native
  /**
    * Gets all of the model versions for the specified model type or for the specified model type and model ID. You can also get details for a single, specified model version. 
    */
  def describeModelVersions(): Request[DescribeModelVersionsResult, AWSError] = js.native
  def describeModelVersions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeModelVersionsResult, Unit]): Request[DescribeModelVersionsResult, AWSError] = js.native
  /**
    * Gets all of the model versions for the specified model type or for the specified model type and model ID. You can also get details for a single, specified model version. 
    */
  def describeModelVersions(params: DescribeModelVersionsRequest): Request[DescribeModelVersionsResult, AWSError] = js.native
  def describeModelVersions(
    params: DescribeModelVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeModelVersionsResult, Unit]
  ): Request[DescribeModelVersionsResult, AWSError] = js.native
  /**
    * Gets a particular detector version. 
    */
  def getDetectorVersion(): Request[GetDetectorVersionResult, AWSError] = js.native
  def getDetectorVersion(callback: js.Function2[/* err */ AWSError, /* data */ GetDetectorVersionResult, Unit]): Request[GetDetectorVersionResult, AWSError] = js.native
  /**
    * Gets a particular detector version. 
    */
  def getDetectorVersion(params: GetDetectorVersionRequest): Request[GetDetectorVersionResult, AWSError] = js.native
  def getDetectorVersion(
    params: GetDetectorVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDetectorVersionResult, Unit]
  ): Request[GetDetectorVersionResult, AWSError] = js.native
  /**
    * Gets all of detectors. This is a paginated API. If you provide a null maxSizePerPage, this actions retrieves a maximum of 10 records per page. If you provide a maxSizePerPage, the value must be between 5 and 10. To get the next page results, provide the pagination token from the GetEventTypesResponse as part of your request. A null pagination token fetches the records from the beginning. 
    */
  def getDetectors(): Request[GetDetectorsResult, AWSError] = js.native
  def getDetectors(callback: js.Function2[/* err */ AWSError, /* data */ GetDetectorsResult, Unit]): Request[GetDetectorsResult, AWSError] = js.native
  /**
    * Gets all of detectors. This is a paginated API. If you provide a null maxSizePerPage, this actions retrieves a maximum of 10 records per page. If you provide a maxSizePerPage, the value must be between 5 and 10. To get the next page results, provide the pagination token from the GetEventTypesResponse as part of your request. A null pagination token fetches the records from the beginning. 
    */
  def getDetectors(params: GetDetectorsRequest): Request[GetDetectorsResult, AWSError] = js.native
  def getDetectors(
    params: GetDetectorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDetectorsResult, Unit]
  ): Request[GetDetectorsResult, AWSError] = js.native
  /**
    * Gets the details for one or more Amazon SageMaker models that have been imported into the service. This is a paginated API. If you provide a null maxSizePerPage, this actions retrieves a maximum of 10 records per page. If you provide a maxSizePerPage, the value must be between 5 and 10. To get the next page results, provide the pagination token from the GetExternalModelsResult as part of your request. A null pagination token fetches the records from the beginning. 
    */
  def getExternalModels(): Request[GetExternalModelsResult, AWSError] = js.native
  def getExternalModels(callback: js.Function2[/* err */ AWSError, /* data */ GetExternalModelsResult, Unit]): Request[GetExternalModelsResult, AWSError] = js.native
  /**
    * Gets the details for one or more Amazon SageMaker models that have been imported into the service. This is a paginated API. If you provide a null maxSizePerPage, this actions retrieves a maximum of 10 records per page. If you provide a maxSizePerPage, the value must be between 5 and 10. To get the next page results, provide the pagination token from the GetExternalModelsResult as part of your request. A null pagination token fetches the records from the beginning. 
    */
  def getExternalModels(params: GetExternalModelsRequest): Request[GetExternalModelsResult, AWSError] = js.native
  def getExternalModels(
    params: GetExternalModelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetExternalModelsResult, Unit]
  ): Request[GetExternalModelsResult, AWSError] = js.native
  /**
    * Gets a model version. 
    */
  def getModelVersion(): Request[GetModelVersionResult, AWSError] = js.native
  def getModelVersion(callback: js.Function2[/* err */ AWSError, /* data */ GetModelVersionResult, Unit]): Request[GetModelVersionResult, AWSError] = js.native
  /**
    * Gets a model version. 
    */
  def getModelVersion(params: GetModelVersionRequest): Request[GetModelVersionResult, AWSError] = js.native
  def getModelVersion(
    params: GetModelVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetModelVersionResult, Unit]
  ): Request[GetModelVersionResult, AWSError] = js.native
  /**
    * Gets all of the models for the AWS account, or the specified model type, or gets a single model for the specified model type, model ID combination. 
    */
  def getModels(): Request[GetModelsResult, AWSError] = js.native
  def getModels(callback: js.Function2[/* err */ AWSError, /* data */ GetModelsResult, Unit]): Request[GetModelsResult, AWSError] = js.native
  /**
    * Gets all of the models for the AWS account, or the specified model type, or gets a single model for the specified model type, model ID combination. 
    */
  def getModels(params: GetModelsRequest): Request[GetModelsResult, AWSError] = js.native
  def getModels(
    params: GetModelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetModelsResult, Unit]
  ): Request[GetModelsResult, AWSError] = js.native
  /**
    * Gets one or more outcomes. This is a paginated API. If you provide a null maxSizePerPage, this actions retrieves a maximum of 10 records per page. If you provide a maxSizePerPage, the value must be between 50 and 100. To get the next page results, provide the pagination token from the GetOutcomesResult as part of your request. A null pagination token fetches the records from the beginning. 
    */
  def getOutcomes(): Request[GetOutcomesResult, AWSError] = js.native
  def getOutcomes(callback: js.Function2[/* err */ AWSError, /* data */ GetOutcomesResult, Unit]): Request[GetOutcomesResult, AWSError] = js.native
  /**
    * Gets one or more outcomes. This is a paginated API. If you provide a null maxSizePerPage, this actions retrieves a maximum of 10 records per page. If you provide a maxSizePerPage, the value must be between 50 and 100. To get the next page results, provide the pagination token from the GetOutcomesResult as part of your request. A null pagination token fetches the records from the beginning. 
    */
  def getOutcomes(params: GetOutcomesRequest): Request[GetOutcomesResult, AWSError] = js.native
  def getOutcomes(
    params: GetOutcomesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetOutcomesResult, Unit]
  ): Request[GetOutcomesResult, AWSError] = js.native
  /**
    * Evaluates an event against a detector version. If a version ID is not provided, the detector’s (ACTIVE) version is used. 
    */
  def getPrediction(): Request[GetPredictionResult, AWSError] = js.native
  def getPrediction(callback: js.Function2[/* err */ AWSError, /* data */ GetPredictionResult, Unit]): Request[GetPredictionResult, AWSError] = js.native
  /**
    * Evaluates an event against a detector version. If a version ID is not provided, the detector’s (ACTIVE) version is used. 
    */
  def getPrediction(params: GetPredictionRequest): Request[GetPredictionResult, AWSError] = js.native
  def getPrediction(
    params: GetPredictionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPredictionResult, Unit]
  ): Request[GetPredictionResult, AWSError] = js.native
  /**
    * Gets all rules available for the specified detector.
    */
  def getRules(): Request[GetRulesResult, AWSError] = js.native
  def getRules(callback: js.Function2[/* err */ AWSError, /* data */ GetRulesResult, Unit]): Request[GetRulesResult, AWSError] = js.native
  /**
    * Gets all rules available for the specified detector.
    */
  def getRules(params: GetRulesRequest): Request[GetRulesResult, AWSError] = js.native
  def getRules(
    params: GetRulesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRulesResult, Unit]
  ): Request[GetRulesResult, AWSError] = js.native
  /**
    * Gets all of the variables or the specific variable. This is a paginated API. Providing null maxSizePerPage results in retrieving maximum of 100 records per page. If you provide maxSizePerPage the value must be between 50 and 100. To get the next page result, a provide a pagination token from GetVariablesResult as part of your request. Null pagination token fetches the records from the beginning. 
    */
  def getVariables(): Request[GetVariablesResult, AWSError] = js.native
  def getVariables(callback: js.Function2[/* err */ AWSError, /* data */ GetVariablesResult, Unit]): Request[GetVariablesResult, AWSError] = js.native
  /**
    * Gets all of the variables or the specific variable. This is a paginated API. Providing null maxSizePerPage results in retrieving maximum of 100 records per page. If you provide maxSizePerPage the value must be between 50 and 100. To get the next page result, a provide a pagination token from GetVariablesResult as part of your request. Null pagination token fetches the records from the beginning. 
    */
  def getVariables(params: GetVariablesRequest): Request[GetVariablesResult, AWSError] = js.native
  def getVariables(
    params: GetVariablesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVariablesResult, Unit]
  ): Request[GetVariablesResult, AWSError] = js.native
  /**
    * Creates or updates a detector. 
    */
  def putDetector(): Request[PutDetectorResult, AWSError] = js.native
  def putDetector(callback: js.Function2[/* err */ AWSError, /* data */ PutDetectorResult, Unit]): Request[PutDetectorResult, AWSError] = js.native
  /**
    * Creates or updates a detector. 
    */
  def putDetector(params: PutDetectorRequest): Request[PutDetectorResult, AWSError] = js.native
  def putDetector(
    params: PutDetectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutDetectorResult, Unit]
  ): Request[PutDetectorResult, AWSError] = js.native
  /**
    * Creates or updates an Amazon SageMaker model endpoint. You can also use this action to update the configuration of the model endpoint, including the IAM role and/or the mapped variables. 
    */
  def putExternalModel(): Request[PutExternalModelResult, AWSError] = js.native
  def putExternalModel(callback: js.Function2[/* err */ AWSError, /* data */ PutExternalModelResult, Unit]): Request[PutExternalModelResult, AWSError] = js.native
  /**
    * Creates or updates an Amazon SageMaker model endpoint. You can also use this action to update the configuration of the model endpoint, including the IAM role and/or the mapped variables. 
    */
  def putExternalModel(params: PutExternalModelRequest): Request[PutExternalModelResult, AWSError] = js.native
  def putExternalModel(
    params: PutExternalModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutExternalModelResult, Unit]
  ): Request[PutExternalModelResult, AWSError] = js.native
  /**
    * Creates or updates a model. 
    */
  def putModel(): Request[PutModelResult, AWSError] = js.native
  def putModel(callback: js.Function2[/* err */ AWSError, /* data */ PutModelResult, Unit]): Request[PutModelResult, AWSError] = js.native
  /**
    * Creates or updates a model. 
    */
  def putModel(params: PutModelRequest): Request[PutModelResult, AWSError] = js.native
  def putModel(
    params: PutModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutModelResult, Unit]
  ): Request[PutModelResult, AWSError] = js.native
  /**
    * Creates or updates an outcome. 
    */
  def putOutcome(): Request[PutOutcomeResult, AWSError] = js.native
  def putOutcome(callback: js.Function2[/* err */ AWSError, /* data */ PutOutcomeResult, Unit]): Request[PutOutcomeResult, AWSError] = js.native
  /**
    * Creates or updates an outcome. 
    */
  def putOutcome(params: PutOutcomeRequest): Request[PutOutcomeResult, AWSError] = js.native
  def putOutcome(
    params: PutOutcomeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutOutcomeResult, Unit]
  ): Request[PutOutcomeResult, AWSError] = js.native
  /**
    *  Updates a detector version. The detector version attributes that you can update include models, external model endpoints, rules, and description. You can only update a DRAFT detector version.
    */
  def updateDetectorVersion(): Request[UpdateDetectorVersionResult, AWSError] = js.native
  def updateDetectorVersion(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDetectorVersionResult, Unit]): Request[UpdateDetectorVersionResult, AWSError] = js.native
  /**
    *  Updates a detector version. The detector version attributes that you can update include models, external model endpoints, rules, and description. You can only update a DRAFT detector version.
    */
  def updateDetectorVersion(params: UpdateDetectorVersionRequest): Request[UpdateDetectorVersionResult, AWSError] = js.native
  def updateDetectorVersion(
    params: UpdateDetectorVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDetectorVersionResult, Unit]
  ): Request[UpdateDetectorVersionResult, AWSError] = js.native
  /**
    * Updates the detector version's description. You can update the metadata for any detector version (DRAFT, ACTIVE, or INACTIVE). 
    */
  def updateDetectorVersionMetadata(): Request[UpdateDetectorVersionMetadataResult, AWSError] = js.native
  def updateDetectorVersionMetadata(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDetectorVersionMetadataResult, Unit]): Request[UpdateDetectorVersionMetadataResult, AWSError] = js.native
  /**
    * Updates the detector version's description. You can update the metadata for any detector version (DRAFT, ACTIVE, or INACTIVE). 
    */
  def updateDetectorVersionMetadata(params: UpdateDetectorVersionMetadataRequest): Request[UpdateDetectorVersionMetadataResult, AWSError] = js.native
  def updateDetectorVersionMetadata(
    params: UpdateDetectorVersionMetadataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDetectorVersionMetadataResult, Unit]
  ): Request[UpdateDetectorVersionMetadataResult, AWSError] = js.native
  /**
    * Updates the detector version’s status. You can perform the following promotions or demotions using UpdateDetectorVersionStatus: DRAFT to ACTIVE, ACTIVE to INACTIVE, and INACTIVE to ACTIVE.
    */
  def updateDetectorVersionStatus(): Request[UpdateDetectorVersionStatusResult, AWSError] = js.native
  def updateDetectorVersionStatus(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDetectorVersionStatusResult, Unit]): Request[UpdateDetectorVersionStatusResult, AWSError] = js.native
  /**
    * Updates the detector version’s status. You can perform the following promotions or demotions using UpdateDetectorVersionStatus: DRAFT to ACTIVE, ACTIVE to INACTIVE, and INACTIVE to ACTIVE.
    */
  def updateDetectorVersionStatus(params: UpdateDetectorVersionStatusRequest): Request[UpdateDetectorVersionStatusResult, AWSError] = js.native
  def updateDetectorVersionStatus(
    params: UpdateDetectorVersionStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDetectorVersionStatusResult, Unit]
  ): Request[UpdateDetectorVersionStatusResult, AWSError] = js.native
  /**
    * Updates a model version. You can update the description and status attributes using this action. You can perform the following status updates:    Change the TRAINING_COMPLETE status to ACTIVE    Change ACTIVE back to TRAINING_COMPLETE   
    */
  def updateModelVersion(): Request[UpdateModelVersionResult, AWSError] = js.native
  def updateModelVersion(callback: js.Function2[/* err */ AWSError, /* data */ UpdateModelVersionResult, Unit]): Request[UpdateModelVersionResult, AWSError] = js.native
  /**
    * Updates a model version. You can update the description and status attributes using this action. You can perform the following status updates:    Change the TRAINING_COMPLETE status to ACTIVE    Change ACTIVE back to TRAINING_COMPLETE   
    */
  def updateModelVersion(params: UpdateModelVersionRequest): Request[UpdateModelVersionResult, AWSError] = js.native
  def updateModelVersion(
    params: UpdateModelVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateModelVersionResult, Unit]
  ): Request[UpdateModelVersionResult, AWSError] = js.native
  /**
    * Updates a rule's metadata. 
    */
  def updateRuleMetadata(): Request[UpdateRuleMetadataResult, AWSError] = js.native
  def updateRuleMetadata(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRuleMetadataResult, Unit]): Request[UpdateRuleMetadataResult, AWSError] = js.native
  /**
    * Updates a rule's metadata. 
    */
  def updateRuleMetadata(params: UpdateRuleMetadataRequest): Request[UpdateRuleMetadataResult, AWSError] = js.native
  def updateRuleMetadata(
    params: UpdateRuleMetadataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRuleMetadataResult, Unit]
  ): Request[UpdateRuleMetadataResult, AWSError] = js.native
  /**
    * Updates a rule version resulting in a new rule version. 
    */
  def updateRuleVersion(): Request[UpdateRuleVersionResult, AWSError] = js.native
  def updateRuleVersion(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRuleVersionResult, Unit]): Request[UpdateRuleVersionResult, AWSError] = js.native
  /**
    * Updates a rule version resulting in a new rule version. 
    */
  def updateRuleVersion(params: UpdateRuleVersionRequest): Request[UpdateRuleVersionResult, AWSError] = js.native
  def updateRuleVersion(
    params: UpdateRuleVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRuleVersionResult, Unit]
  ): Request[UpdateRuleVersionResult, AWSError] = js.native
  /**
    * Updates a variable.
    */
  def updateVariable(): Request[UpdateVariableResult, AWSError] = js.native
  def updateVariable(callback: js.Function2[/* err */ AWSError, /* data */ UpdateVariableResult, Unit]): Request[UpdateVariableResult, AWSError] = js.native
  /**
    * Updates a variable.
    */
  def updateVariable(params: UpdateVariableRequest): Request[UpdateVariableResult, AWSError] = js.native
  def updateVariable(
    params: UpdateVariableRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateVariableResult, Unit]
  ): Request[UpdateVariableResult, AWSError] = js.native
}

