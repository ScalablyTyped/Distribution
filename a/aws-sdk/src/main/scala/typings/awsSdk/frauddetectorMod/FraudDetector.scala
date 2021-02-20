package typings.awsSdk.frauddetectorMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FraudDetector extends Service {
  
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
  
  @JSName("config")
  var config_FraudDetector: ConfigBase with ClientConfiguration = js.native
  
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
    * Creates a model using the specified model type.
    */
  def createModel(): Request[CreateModelResult, AWSError] = js.native
  def createModel(callback: js.Function2[/* err */ AWSError, /* data */ CreateModelResult, Unit]): Request[CreateModelResult, AWSError] = js.native
  /**
    * Creates a model using the specified model type.
    */
  def createModel(params: CreateModelRequest): Request[CreateModelResult, AWSError] = js.native
  def createModel(
    params: CreateModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateModelResult, Unit]
  ): Request[CreateModelResult, AWSError] = js.native
  
  /**
    * Creates a version of the model using the specified model type and model id. 
    */
  def createModelVersion(): Request[CreateModelVersionResult, AWSError] = js.native
  def createModelVersion(callback: js.Function2[/* err */ AWSError, /* data */ CreateModelVersionResult, Unit]): Request[CreateModelVersionResult, AWSError] = js.native
  /**
    * Creates a version of the model using the specified model type and model id. 
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
    * Deletes the detector. Before deleting a detector, you must first delete all detector versions and rule versions associated with the detector. When you delete a detector, Amazon Fraud Detector permanently deletes the detector and the data is no longer stored in Amazon Fraud Detector.
    */
  def deleteDetector(): Request[DeleteDetectorResult, AWSError] = js.native
  def deleteDetector(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDetectorResult, Unit]): Request[DeleteDetectorResult, AWSError] = js.native
  /**
    * Deletes the detector. Before deleting a detector, you must first delete all detector versions and rule versions associated with the detector. When you delete a detector, Amazon Fraud Detector permanently deletes the detector and the data is no longer stored in Amazon Fraud Detector.
    */
  def deleteDetector(params: DeleteDetectorRequest): Request[DeleteDetectorResult, AWSError] = js.native
  def deleteDetector(
    params: DeleteDetectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDetectorResult, Unit]
  ): Request[DeleteDetectorResult, AWSError] = js.native
  
  /**
    * Deletes the detector version. You cannot delete detector versions that are in ACTIVE status. When you delete a detector version, Amazon Fraud Detector permanently deletes the detector and the data is no longer stored in Amazon Fraud Detector.
    */
  def deleteDetectorVersion(): Request[DeleteDetectorVersionResult, AWSError] = js.native
  def deleteDetectorVersion(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDetectorVersionResult, Unit]): Request[DeleteDetectorVersionResult, AWSError] = js.native
  /**
    * Deletes the detector version. You cannot delete detector versions that are in ACTIVE status. When you delete a detector version, Amazon Fraud Detector permanently deletes the detector and the data is no longer stored in Amazon Fraud Detector.
    */
  def deleteDetectorVersion(params: DeleteDetectorVersionRequest): Request[DeleteDetectorVersionResult, AWSError] = js.native
  def deleteDetectorVersion(
    params: DeleteDetectorVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDetectorVersionResult, Unit]
  ): Request[DeleteDetectorVersionResult, AWSError] = js.native
  
  /**
    * Deletes an entity type. You cannot delete an entity type that is included in an event type. When you delete an entity type, Amazon Fraud Detector permanently deletes that entity type from the evaluation history, and the data is no longer stored in Amazon Fraud Detector.
    */
  def deleteEntityType(): Request[DeleteEntityTypeResult, AWSError] = js.native
  def deleteEntityType(callback: js.Function2[/* err */ AWSError, /* data */ DeleteEntityTypeResult, Unit]): Request[DeleteEntityTypeResult, AWSError] = js.native
  /**
    * Deletes an entity type. You cannot delete an entity type that is included in an event type. When you delete an entity type, Amazon Fraud Detector permanently deletes that entity type from the evaluation history, and the data is no longer stored in Amazon Fraud Detector.
    */
  def deleteEntityType(params: DeleteEntityTypeRequest): Request[DeleteEntityTypeResult, AWSError] = js.native
  def deleteEntityType(
    params: DeleteEntityTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEntityTypeResult, Unit]
  ): Request[DeleteEntityTypeResult, AWSError] = js.native
  
  /**
    * Deletes the specified event. When you delete an event, Amazon Fraud Detector permanently deletes that event from the evaluation history, and the event data is no longer stored in Amazon Fraud Detector.
    */
  def deleteEvent(): Request[DeleteEventResult, AWSError] = js.native
  def deleteEvent(callback: js.Function2[/* err */ AWSError, /* data */ DeleteEventResult, Unit]): Request[DeleteEventResult, AWSError] = js.native
  /**
    * Deletes the specified event. When you delete an event, Amazon Fraud Detector permanently deletes that event from the evaluation history, and the event data is no longer stored in Amazon Fraud Detector.
    */
  def deleteEvent(params: DeleteEventRequest): Request[DeleteEventResult, AWSError] = js.native
  def deleteEvent(
    params: DeleteEventRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEventResult, Unit]
  ): Request[DeleteEventResult, AWSError] = js.native
  
  /**
    * Deletes an event type. You cannot delete an event type that is used in a detector or a model. When you delete an entity type, Amazon Fraud Detector permanently deletes that entity type from the evaluation history, and the data is no longer stored in Amazon Fraud Detector.
    */
  def deleteEventType(): Request[DeleteEventTypeResult, AWSError] = js.native
  def deleteEventType(callback: js.Function2[/* err */ AWSError, /* data */ DeleteEventTypeResult, Unit]): Request[DeleteEventTypeResult, AWSError] = js.native
  /**
    * Deletes an event type. You cannot delete an event type that is used in a detector or a model. When you delete an entity type, Amazon Fraud Detector permanently deletes that entity type from the evaluation history, and the data is no longer stored in Amazon Fraud Detector.
    */
  def deleteEventType(params: DeleteEventTypeRequest): Request[DeleteEventTypeResult, AWSError] = js.native
  def deleteEventType(
    params: DeleteEventTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteEventTypeResult, Unit]
  ): Request[DeleteEventTypeResult, AWSError] = js.native
  
  /**
    * Removes a SageMaker model from Amazon Fraud Detector. You can remove an Amazon SageMaker model if it is not associated with a detector version. Removing a SageMaker model disconnects it from Amazon Fraud Detector, but the model remains available in SageMaker.
    */
  def deleteExternalModel(): Request[DeleteExternalModelResult, AWSError] = js.native
  def deleteExternalModel(callback: js.Function2[/* err */ AWSError, /* data */ DeleteExternalModelResult, Unit]): Request[DeleteExternalModelResult, AWSError] = js.native
  /**
    * Removes a SageMaker model from Amazon Fraud Detector. You can remove an Amazon SageMaker model if it is not associated with a detector version. Removing a SageMaker model disconnects it from Amazon Fraud Detector, but the model remains available in SageMaker.
    */
  def deleteExternalModel(params: DeleteExternalModelRequest): Request[DeleteExternalModelResult, AWSError] = js.native
  def deleteExternalModel(
    params: DeleteExternalModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteExternalModelResult, Unit]
  ): Request[DeleteExternalModelResult, AWSError] = js.native
  
  /**
    * Deletes a label. You cannot delete labels that are included in an event type in Amazon Fraud Detector. You cannot delete a label assigned to an event ID. You must first delete the relevant event ID. When you delete a label, Amazon Fraud Detector permanently deletes that label from the evaluation history, and the data is no longer stored in Amazon Fraud Detector.
    */
  def deleteLabel(): Request[DeleteLabelResult, AWSError] = js.native
  def deleteLabel(callback: js.Function2[/* err */ AWSError, /* data */ DeleteLabelResult, Unit]): Request[DeleteLabelResult, AWSError] = js.native
  /**
    * Deletes a label. You cannot delete labels that are included in an event type in Amazon Fraud Detector. You cannot delete a label assigned to an event ID. You must first delete the relevant event ID. When you delete a label, Amazon Fraud Detector permanently deletes that label from the evaluation history, and the data is no longer stored in Amazon Fraud Detector.
    */
  def deleteLabel(params: DeleteLabelRequest): Request[DeleteLabelResult, AWSError] = js.native
  def deleteLabel(
    params: DeleteLabelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLabelResult, Unit]
  ): Request[DeleteLabelResult, AWSError] = js.native
  
  /**
    * Deletes a model. You can delete models and model versions in Amazon Fraud Detector, provided that they are not associated with a detector version.  When you delete a model, Amazon Fraud Detector permanently deletes that model from the evaluation history, and the data is no longer stored in Amazon Fraud Detector.
    */
  def deleteModel(): Request[DeleteModelResult, AWSError] = js.native
  def deleteModel(callback: js.Function2[/* err */ AWSError, /* data */ DeleteModelResult, Unit]): Request[DeleteModelResult, AWSError] = js.native
  /**
    * Deletes a model. You can delete models and model versions in Amazon Fraud Detector, provided that they are not associated with a detector version.  When you delete a model, Amazon Fraud Detector permanently deletes that model from the evaluation history, and the data is no longer stored in Amazon Fraud Detector.
    */
  def deleteModel(params: DeleteModelRequest): Request[DeleteModelResult, AWSError] = js.native
  def deleteModel(
    params: DeleteModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteModelResult, Unit]
  ): Request[DeleteModelResult, AWSError] = js.native
  
  /**
    * Deletes a model version. You can delete models and model versions in Amazon Fraud Detector, provided that they are not associated with a detector version.  When you delete a model version, Amazon Fraud Detector permanently deletes that model version from the evaluation history, and the data is no longer stored in Amazon Fraud Detector.
    */
  def deleteModelVersion(): Request[DeleteModelVersionResult, AWSError] = js.native
  def deleteModelVersion(callback: js.Function2[/* err */ AWSError, /* data */ DeleteModelVersionResult, Unit]): Request[DeleteModelVersionResult, AWSError] = js.native
  /**
    * Deletes a model version. You can delete models and model versions in Amazon Fraud Detector, provided that they are not associated with a detector version.  When you delete a model version, Amazon Fraud Detector permanently deletes that model version from the evaluation history, and the data is no longer stored in Amazon Fraud Detector.
    */
  def deleteModelVersion(params: DeleteModelVersionRequest): Request[DeleteModelVersionResult, AWSError] = js.native
  def deleteModelVersion(
    params: DeleteModelVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteModelVersionResult, Unit]
  ): Request[DeleteModelVersionResult, AWSError] = js.native
  
  /**
    * Deletes an outcome. You cannot delete an outcome that is used in a rule version. When you delete an outcome, Amazon Fraud Detector permanently deletes that outcome from the evaluation history, and the data is no longer stored in Amazon Fraud Detector.
    */
  def deleteOutcome(): Request[DeleteOutcomeResult, AWSError] = js.native
  def deleteOutcome(callback: js.Function2[/* err */ AWSError, /* data */ DeleteOutcomeResult, Unit]): Request[DeleteOutcomeResult, AWSError] = js.native
  /**
    * Deletes an outcome. You cannot delete an outcome that is used in a rule version. When you delete an outcome, Amazon Fraud Detector permanently deletes that outcome from the evaluation history, and the data is no longer stored in Amazon Fraud Detector.
    */
  def deleteOutcome(params: DeleteOutcomeRequest): Request[DeleteOutcomeResult, AWSError] = js.native
  def deleteOutcome(
    params: DeleteOutcomeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteOutcomeResult, Unit]
  ): Request[DeleteOutcomeResult, AWSError] = js.native
  
  /**
    * Deletes the rule. You cannot delete a rule if it is used by an ACTIVE or INACTIVE detector version. When you delete a rule, Amazon Fraud Detector permanently deletes that rule from the evaluation history, and the data is no longer stored in Amazon Fraud Detector.
    */
  def deleteRule(): Request[DeleteRuleResult, AWSError] = js.native
  def deleteRule(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRuleResult, Unit]): Request[DeleteRuleResult, AWSError] = js.native
  /**
    * Deletes the rule. You cannot delete a rule if it is used by an ACTIVE or INACTIVE detector version. When you delete a rule, Amazon Fraud Detector permanently deletes that rule from the evaluation history, and the data is no longer stored in Amazon Fraud Detector.
    */
  def deleteRule(params: DeleteRuleRequest): Request[DeleteRuleResult, AWSError] = js.native
  def deleteRule(
    params: DeleteRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRuleResult, Unit]
  ): Request[DeleteRuleResult, AWSError] = js.native
  
  /**
    * Deletes a variable. You can't delete variables that are included in an event type in Amazon Fraud Detector. Amazon Fraud Detector automatically deletes model output variables and SageMaker model output variables when you delete the model. You can't delete these variables manually. When you delete a variable, Amazon Fraud Detector permanently deletes that variable from the evaluation history, and the data is no longer stored in Amazon Fraud Detector.
    */
  def deleteVariable(): Request[DeleteVariableResult, AWSError] = js.native
  def deleteVariable(callback: js.Function2[/* err */ AWSError, /* data */ DeleteVariableResult, Unit]): Request[DeleteVariableResult, AWSError] = js.native
  /**
    * Deletes a variable. You can't delete variables that are included in an event type in Amazon Fraud Detector. Amazon Fraud Detector automatically deletes model output variables and SageMaker model output variables when you delete the model. You can't delete these variables manually. When you delete a variable, Amazon Fraud Detector permanently deletes that variable from the evaluation history, and the data is no longer stored in Amazon Fraud Detector.
    */
  def deleteVariable(params: DeleteVariableRequest): Request[DeleteVariableResult, AWSError] = js.native
  def deleteVariable(
    params: DeleteVariableRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteVariableResult, Unit]
  ): Request[DeleteVariableResult, AWSError] = js.native
  
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
    * Gets all detectors or a single detector if a detectorId is specified. This is a paginated API. If you provide a null maxResults, this action retrieves a maximum of 10 records per page. If you provide a maxResults, the value must be between 5 and 10. To get the next page results, provide the pagination token from the GetDetectorsResponse as part of your request. A null pagination token fetches the records from the beginning. 
    */
  def getDetectors(): Request[GetDetectorsResult, AWSError] = js.native
  def getDetectors(callback: js.Function2[/* err */ AWSError, /* data */ GetDetectorsResult, Unit]): Request[GetDetectorsResult, AWSError] = js.native
  /**
    * Gets all detectors or a single detector if a detectorId is specified. This is a paginated API. If you provide a null maxResults, this action retrieves a maximum of 10 records per page. If you provide a maxResults, the value must be between 5 and 10. To get the next page results, provide the pagination token from the GetDetectorsResponse as part of your request. A null pagination token fetches the records from the beginning. 
    */
  def getDetectors(params: GetDetectorsRequest): Request[GetDetectorsResult, AWSError] = js.native
  def getDetectors(
    params: GetDetectorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDetectorsResult, Unit]
  ): Request[GetDetectorsResult, AWSError] = js.native
  
  /**
    * Gets all entity types or a specific entity type if a name is specified. This is a paginated API. If you provide a null maxResults, this action retrieves a maximum of 10 records per page. If you provide a maxResults, the value must be between 5 and 10. To get the next page results, provide the pagination token from the GetEntityTypesResponse as part of your request. A null pagination token fetches the records from the beginning. 
    */
  def getEntityTypes(): Request[GetEntityTypesResult, AWSError] = js.native
  def getEntityTypes(callback: js.Function2[/* err */ AWSError, /* data */ GetEntityTypesResult, Unit]): Request[GetEntityTypesResult, AWSError] = js.native
  /**
    * Gets all entity types or a specific entity type if a name is specified. This is a paginated API. If you provide a null maxResults, this action retrieves a maximum of 10 records per page. If you provide a maxResults, the value must be between 5 and 10. To get the next page results, provide the pagination token from the GetEntityTypesResponse as part of your request. A null pagination token fetches the records from the beginning. 
    */
  def getEntityTypes(params: GetEntityTypesRequest): Request[GetEntityTypesResult, AWSError] = js.native
  def getEntityTypes(
    params: GetEntityTypesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEntityTypesResult, Unit]
  ): Request[GetEntityTypesResult, AWSError] = js.native
  
  /**
    * Evaluates an event against a detector version. If a version ID is not provided, the detector’s (ACTIVE) version is used.
    */
  def getEventPrediction(): Request[GetEventPredictionResult, AWSError] = js.native
  def getEventPrediction(callback: js.Function2[/* err */ AWSError, /* data */ GetEventPredictionResult, Unit]): Request[GetEventPredictionResult, AWSError] = js.native
  /**
    * Evaluates an event against a detector version. If a version ID is not provided, the detector’s (ACTIVE) version is used.
    */
  def getEventPrediction(params: GetEventPredictionRequest): Request[GetEventPredictionResult, AWSError] = js.native
  def getEventPrediction(
    params: GetEventPredictionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEventPredictionResult, Unit]
  ): Request[GetEventPredictionResult, AWSError] = js.native
  
  /**
    * Gets all event types or a specific event type if name is provided. This is a paginated API. If you provide a null maxResults, this action retrieves a maximum of 10 records per page. If you provide a maxResults, the value must be between 5 and 10. To get the next page results, provide the pagination token from the GetEventTypesResponse as part of your request. A null pagination token fetches the records from the beginning. 
    */
  def getEventTypes(): Request[GetEventTypesResult, AWSError] = js.native
  def getEventTypes(callback: js.Function2[/* err */ AWSError, /* data */ GetEventTypesResult, Unit]): Request[GetEventTypesResult, AWSError] = js.native
  /**
    * Gets all event types or a specific event type if name is provided. This is a paginated API. If you provide a null maxResults, this action retrieves a maximum of 10 records per page. If you provide a maxResults, the value must be between 5 and 10. To get the next page results, provide the pagination token from the GetEventTypesResponse as part of your request. A null pagination token fetches the records from the beginning. 
    */
  def getEventTypes(params: GetEventTypesRequest): Request[GetEventTypesResult, AWSError] = js.native
  def getEventTypes(
    params: GetEventTypesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEventTypesResult, Unit]
  ): Request[GetEventTypesResult, AWSError] = js.native
  
  /**
    * Gets the details for one or more Amazon SageMaker models that have been imported into the service. This is a paginated API. If you provide a null maxResults, this actions retrieves a maximum of 10 records per page. If you provide a maxResults, the value must be between 5 and 10. To get the next page results, provide the pagination token from the GetExternalModelsResult as part of your request. A null pagination token fetches the records from the beginning. 
    */
  def getExternalModels(): Request[GetExternalModelsResult, AWSError] = js.native
  def getExternalModels(callback: js.Function2[/* err */ AWSError, /* data */ GetExternalModelsResult, Unit]): Request[GetExternalModelsResult, AWSError] = js.native
  /**
    * Gets the details for one or more Amazon SageMaker models that have been imported into the service. This is a paginated API. If you provide a null maxResults, this actions retrieves a maximum of 10 records per page. If you provide a maxResults, the value must be between 5 and 10. To get the next page results, provide the pagination token from the GetExternalModelsResult as part of your request. A null pagination token fetches the records from the beginning. 
    */
  def getExternalModels(params: GetExternalModelsRequest): Request[GetExternalModelsResult, AWSError] = js.native
  def getExternalModels(
    params: GetExternalModelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetExternalModelsResult, Unit]
  ): Request[GetExternalModelsResult, AWSError] = js.native
  
  /**
    * Gets the encryption key if a Key Management Service (KMS) customer master key (CMK) has been specified to be used to encrypt content in Amazon Fraud Detector.
    */
  def getKMSEncryptionKey(): Request[GetKMSEncryptionKeyResult, AWSError] = js.native
  def getKMSEncryptionKey(callback: js.Function2[/* err */ AWSError, /* data */ GetKMSEncryptionKeyResult, Unit]): Request[GetKMSEncryptionKeyResult, AWSError] = js.native
  
  /**
    * Gets all labels or a specific label if name is provided. This is a paginated API. If you provide a null maxResults, this action retrieves a maximum of 50 records per page. If you provide a maxResults, the value must be between 10 and 50. To get the next page results, provide the pagination token from the GetGetLabelsResponse as part of your request. A null pagination token fetches the records from the beginning. 
    */
  def getLabels(): Request[GetLabelsResult, AWSError] = js.native
  def getLabels(callback: js.Function2[/* err */ AWSError, /* data */ GetLabelsResult, Unit]): Request[GetLabelsResult, AWSError] = js.native
  /**
    * Gets all labels or a specific label if name is provided. This is a paginated API. If you provide a null maxResults, this action retrieves a maximum of 50 records per page. If you provide a maxResults, the value must be between 10 and 50. To get the next page results, provide the pagination token from the GetGetLabelsResponse as part of your request. A null pagination token fetches the records from the beginning. 
    */
  def getLabels(params: GetLabelsRequest): Request[GetLabelsResult, AWSError] = js.native
  def getLabels(
    params: GetLabelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLabelsResult, Unit]
  ): Request[GetLabelsResult, AWSError] = js.native
  
  /**
    * Gets the details of the specified model version.
    */
  def getModelVersion(): Request[GetModelVersionResult, AWSError] = js.native
  def getModelVersion(callback: js.Function2[/* err */ AWSError, /* data */ GetModelVersionResult, Unit]): Request[GetModelVersionResult, AWSError] = js.native
  /**
    * Gets the details of the specified model version.
    */
  def getModelVersion(params: GetModelVersionRequest): Request[GetModelVersionResult, AWSError] = js.native
  def getModelVersion(
    params: GetModelVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetModelVersionResult, Unit]
  ): Request[GetModelVersionResult, AWSError] = js.native
  
  /**
    * Gets one or more models. Gets all models for the AWS account if no model type and no model id provided. Gets all models for the AWS account and model type, if the model type is specified but model id is not provided. Gets a specific model if (model type, model id) tuple is specified.  This is a paginated API. If you provide a null maxResults, this action retrieves a maximum of 10 records per page. If you provide a maxResults, the value must be between 1 and 10. To get the next page results, provide the pagination token from the response as part of your request. A null pagination token fetches the records from the beginning.
    */
  def getModels(): Request[GetModelsResult, AWSError] = js.native
  def getModels(callback: js.Function2[/* err */ AWSError, /* data */ GetModelsResult, Unit]): Request[GetModelsResult, AWSError] = js.native
  /**
    * Gets one or more models. Gets all models for the AWS account if no model type and no model id provided. Gets all models for the AWS account and model type, if the model type is specified but model id is not provided. Gets a specific model if (model type, model id) tuple is specified.  This is a paginated API. If you provide a null maxResults, this action retrieves a maximum of 10 records per page. If you provide a maxResults, the value must be between 1 and 10. To get the next page results, provide the pagination token from the response as part of your request. A null pagination token fetches the records from the beginning.
    */
  def getModels(params: GetModelsRequest): Request[GetModelsResult, AWSError] = js.native
  def getModels(
    params: GetModelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetModelsResult, Unit]
  ): Request[GetModelsResult, AWSError] = js.native
  
  /**
    * Gets one or more outcomes. This is a paginated API. If you provide a null maxResults, this actions retrieves a maximum of 100 records per page. If you provide a maxResults, the value must be between 50 and 100. To get the next page results, provide the pagination token from the GetOutcomesResult as part of your request. A null pagination token fetches the records from the beginning. 
    */
  def getOutcomes(): Request[GetOutcomesResult, AWSError] = js.native
  def getOutcomes(callback: js.Function2[/* err */ AWSError, /* data */ GetOutcomesResult, Unit]): Request[GetOutcomesResult, AWSError] = js.native
  /**
    * Gets one or more outcomes. This is a paginated API. If you provide a null maxResults, this actions retrieves a maximum of 100 records per page. If you provide a maxResults, the value must be between 50 and 100. To get the next page results, provide the pagination token from the GetOutcomesResult as part of your request. A null pagination token fetches the records from the beginning. 
    */
  def getOutcomes(params: GetOutcomesRequest): Request[GetOutcomesResult, AWSError] = js.native
  def getOutcomes(
    params: GetOutcomesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetOutcomesResult, Unit]
  ): Request[GetOutcomesResult, AWSError] = js.native
  
  /**
    * Get all rules for a detector (paginated) if ruleId and ruleVersion are not specified. Gets all rules for the detector and the ruleId if present (paginated). Gets a specific rule if both the ruleId and the ruleVersion are specified. This is a paginated API. Providing null maxResults results in retrieving maximum of 100 records per page. If you provide maxResults the value must be between 50 and 100. To get the next page result, a provide a pagination token from GetRulesResult as part of your request. Null pagination token fetches the records from the beginning.
    */
  def getRules(): Request[GetRulesResult, AWSError] = js.native
  def getRules(callback: js.Function2[/* err */ AWSError, /* data */ GetRulesResult, Unit]): Request[GetRulesResult, AWSError] = js.native
  /**
    * Get all rules for a detector (paginated) if ruleId and ruleVersion are not specified. Gets all rules for the detector and the ruleId if present (paginated). Gets a specific rule if both the ruleId and the ruleVersion are specified. This is a paginated API. Providing null maxResults results in retrieving maximum of 100 records per page. If you provide maxResults the value must be between 50 and 100. To get the next page result, a provide a pagination token from GetRulesResult as part of your request. Null pagination token fetches the records from the beginning.
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
    * Lists all tags associated with the resource. This is a paginated API. To get the next page results, provide the pagination token from the response as part of your request. A null pagination token fetches the records from the beginning. 
    */
  def listTagsForResource(): Request[ListTagsForResourceResult, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResult, Unit]): Request[ListTagsForResourceResult, AWSError] = js.native
  /**
    * Lists all tags associated with the resource. This is a paginated API. To get the next page results, provide the pagination token from the response as part of your request. A null pagination token fetches the records from the beginning. 
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResult, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResult, Unit]
  ): Request[ListTagsForResourceResult, AWSError] = js.native
  
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
    * Creates or updates an entity type. An entity represents who is performing the event. As part of a fraud prediction, you pass the entity ID to indicate the specific entity who performed the event. An entity type classifies the entity. Example classifications include customer, merchant, or account.
    */
  def putEntityType(): Request[PutEntityTypeResult, AWSError] = js.native
  def putEntityType(callback: js.Function2[/* err */ AWSError, /* data */ PutEntityTypeResult, Unit]): Request[PutEntityTypeResult, AWSError] = js.native
  /**
    * Creates or updates an entity type. An entity represents who is performing the event. As part of a fraud prediction, you pass the entity ID to indicate the specific entity who performed the event. An entity type classifies the entity. Example classifications include customer, merchant, or account.
    */
  def putEntityType(params: PutEntityTypeRequest): Request[PutEntityTypeResult, AWSError] = js.native
  def putEntityType(
    params: PutEntityTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutEntityTypeResult, Unit]
  ): Request[PutEntityTypeResult, AWSError] = js.native
  
  /**
    * Creates or updates an event type. An event is a business activity that is evaluated for fraud risk. With Amazon Fraud Detector, you generate fraud predictions for events. An event type defines the structure for an event sent to Amazon Fraud Detector. This includes the variables sent as part of the event, the entity performing the event (such as a customer), and the labels that classify the event. Example event types include online payment transactions, account registrations, and authentications.
    */
  def putEventType(): Request[PutEventTypeResult, AWSError] = js.native
  def putEventType(callback: js.Function2[/* err */ AWSError, /* data */ PutEventTypeResult, Unit]): Request[PutEventTypeResult, AWSError] = js.native
  /**
    * Creates or updates an event type. An event is a business activity that is evaluated for fraud risk. With Amazon Fraud Detector, you generate fraud predictions for events. An event type defines the structure for an event sent to Amazon Fraud Detector. This includes the variables sent as part of the event, the entity performing the event (such as a customer), and the labels that classify the event. Example event types include online payment transactions, account registrations, and authentications.
    */
  def putEventType(params: PutEventTypeRequest): Request[PutEventTypeResult, AWSError] = js.native
  def putEventType(
    params: PutEventTypeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutEventTypeResult, Unit]
  ): Request[PutEventTypeResult, AWSError] = js.native
  
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
    * Specifies the Key Management Service (KMS) customer master key (CMK) to be used to encrypt content in Amazon Fraud Detector.
    */
  def putKMSEncryptionKey(): Request[PutKMSEncryptionKeyResult, AWSError] = js.native
  def putKMSEncryptionKey(callback: js.Function2[/* err */ AWSError, /* data */ PutKMSEncryptionKeyResult, Unit]): Request[PutKMSEncryptionKeyResult, AWSError] = js.native
  /**
    * Specifies the Key Management Service (KMS) customer master key (CMK) to be used to encrypt content in Amazon Fraud Detector.
    */
  def putKMSEncryptionKey(params: PutKMSEncryptionKeyRequest): Request[PutKMSEncryptionKeyResult, AWSError] = js.native
  def putKMSEncryptionKey(
    params: PutKMSEncryptionKeyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutKMSEncryptionKeyResult, Unit]
  ): Request[PutKMSEncryptionKeyResult, AWSError] = js.native
  
  /**
    * Creates or updates label. A label classifies an event as fraudulent or legitimate. Labels are associated with event types and used to train supervised machine learning models in Amazon Fraud Detector. 
    */
  def putLabel(): Request[PutLabelResult, AWSError] = js.native
  def putLabel(callback: js.Function2[/* err */ AWSError, /* data */ PutLabelResult, Unit]): Request[PutLabelResult, AWSError] = js.native
  /**
    * Creates or updates label. A label classifies an event as fraudulent or legitimate. Labels are associated with event types and used to train supervised machine learning models in Amazon Fraud Detector. 
    */
  def putLabel(params: PutLabelRequest): Request[PutLabelResult, AWSError] = js.native
  def putLabel(
    params: PutLabelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutLabelResult, Unit]
  ): Request[PutLabelResult, AWSError] = js.native
  
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
    * Assigns tags to a resource.
    */
  def tagResource(): Request[TagResourceResult, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResult, Unit]): Request[TagResourceResult, AWSError] = js.native
  /**
    * Assigns tags to a resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResult, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResult, Unit]
  ): Request[TagResourceResult, AWSError] = js.native
  
  /**
    * Removes tags from a resource.
    */
  def untagResource(): Request[UntagResourceResult, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResult, Unit]): Request[UntagResourceResult, AWSError] = js.native
  /**
    * Removes tags from a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResult, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResult, Unit]
  ): Request[UntagResourceResult, AWSError] = js.native
  
  /**
    *  Updates a detector version. The detector version attributes that you can update include models, external model endpoints, rules, rule execution mode, and description. You can only update a DRAFT detector version.
    */
  def updateDetectorVersion(): Request[UpdateDetectorVersionResult, AWSError] = js.native
  def updateDetectorVersion(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDetectorVersionResult, Unit]): Request[UpdateDetectorVersionResult, AWSError] = js.native
  /**
    *  Updates a detector version. The detector version attributes that you can update include models, external model endpoints, rules, rule execution mode, and description. You can only update a DRAFT detector version.
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
    * Updates a model. You can update the description attribute using this action.
    */
  def updateModel(): Request[UpdateModelResult, AWSError] = js.native
  def updateModel(callback: js.Function2[/* err */ AWSError, /* data */ UpdateModelResult, Unit]): Request[UpdateModelResult, AWSError] = js.native
  /**
    * Updates a model. You can update the description attribute using this action.
    */
  def updateModel(params: UpdateModelRequest): Request[UpdateModelResult, AWSError] = js.native
  def updateModel(
    params: UpdateModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateModelResult, Unit]
  ): Request[UpdateModelResult, AWSError] = js.native
  
  /**
    * Updates a model version. Updating a model version retrains an existing model version using updated training data and produces a new minor version of the model. You can update the training data set location and data access role attributes using this action. This action creates and trains a new minor version of the model, for example version 1.01, 1.02, 1.03.
    */
  def updateModelVersion(): Request[UpdateModelVersionResult, AWSError] = js.native
  def updateModelVersion(callback: js.Function2[/* err */ AWSError, /* data */ UpdateModelVersionResult, Unit]): Request[UpdateModelVersionResult, AWSError] = js.native
  /**
    * Updates a model version. Updating a model version retrains an existing model version using updated training data and produces a new minor version of the model. You can update the training data set location and data access role attributes using this action. This action creates and trains a new minor version of the model, for example version 1.01, 1.02, 1.03.
    */
  def updateModelVersion(params: UpdateModelVersionRequest): Request[UpdateModelVersionResult, AWSError] = js.native
  def updateModelVersion(
    params: UpdateModelVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateModelVersionResult, Unit]
  ): Request[UpdateModelVersionResult, AWSError] = js.native
  
  /**
    * Updates the status of a model version. You can perform the following status updates:   Change the TRAINING_COMPLETE status to ACTIVE.   Change ACTIVEto INACTIVE.  
    */
  def updateModelVersionStatus(): Request[UpdateModelVersionStatusResult, AWSError] = js.native
  def updateModelVersionStatus(callback: js.Function2[/* err */ AWSError, /* data */ UpdateModelVersionStatusResult, Unit]): Request[UpdateModelVersionStatusResult, AWSError] = js.native
  /**
    * Updates the status of a model version. You can perform the following status updates:   Change the TRAINING_COMPLETE status to ACTIVE.   Change ACTIVEto INACTIVE.  
    */
  def updateModelVersionStatus(params: UpdateModelVersionStatusRequest): Request[UpdateModelVersionStatusResult, AWSError] = js.native
  def updateModelVersionStatus(
    params: UpdateModelVersionStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateModelVersionStatusResult, Unit]
  ): Request[UpdateModelVersionStatusResult, AWSError] = js.native
  
  /**
    * Updates a rule's metadata. The description attribute can be updated.
    */
  def updateRuleMetadata(): Request[UpdateRuleMetadataResult, AWSError] = js.native
  def updateRuleMetadata(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRuleMetadataResult, Unit]): Request[UpdateRuleMetadataResult, AWSError] = js.native
  /**
    * Updates a rule's metadata. The description attribute can be updated.
    */
  def updateRuleMetadata(params: UpdateRuleMetadataRequest): Request[UpdateRuleMetadataResult, AWSError] = js.native
  def updateRuleMetadata(
    params: UpdateRuleMetadataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRuleMetadataResult, Unit]
  ): Request[UpdateRuleMetadataResult, AWSError] = js.native
  
  /**
    * Updates a rule version resulting in a new rule version. Updates a rule version resulting in a new rule version (version 1, 2, 3 ...). 
    */
  def updateRuleVersion(): Request[UpdateRuleVersionResult, AWSError] = js.native
  def updateRuleVersion(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRuleVersionResult, Unit]): Request[UpdateRuleVersionResult, AWSError] = js.native
  /**
    * Updates a rule version resulting in a new rule version. Updates a rule version resulting in a new rule version (version 1, 2, 3 ...). 
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
