package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object frauddetectorMod {
  
  type BatchCreateVariableErrorList = js.Array[typings.awsSdk.frauddetectorMod.BatchCreateVariableError]
  
  type BatchGetVariableErrorList = js.Array[typings.awsSdk.frauddetectorMod.BatchGetVariableError]
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.frauddetectorMod.ClientApiVersions
  
  type CsvIndexToVariableMap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.EVENT
    - typings.awsSdk.awsSdkStrings.MODEL_SCORE
    - typings.awsSdk.awsSdkStrings.EXTERNAL_MODEL_SCORE
    - java.lang.String
  */
  type DataSource = typings.awsSdk.frauddetectorMod._DataSource | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.STRING
    - typings.awsSdk.awsSdkStrings.INTEGER
    - typings.awsSdk.awsSdkStrings.FLOAT
    - typings.awsSdk.awsSdkStrings.BOOLEAN
    - java.lang.String
  */
  type DataType = typings.awsSdk.frauddetectorMod._DataType | java.lang.String
  
  type DetectorList = js.Array[typings.awsSdk.frauddetectorMod.Detector]
  
  type DetectorVersionMaxResults = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DRAFT
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.INACTIVE
    - java.lang.String
  */
  type DetectorVersionStatus = typings.awsSdk.frauddetectorMod._DetectorVersionStatus | java.lang.String
  
  type DetectorVersionSummaryList = js.Array[typings.awsSdk.frauddetectorMod.DetectorVersionSummary]
  
  type DetectorsMaxResults = scala.Double
  
  type EventVariableMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.frauddetectorMod.variableValue]
  
  type ExternalModelEndpointDataBlobMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.frauddetectorMod.ModelEndpointDataBlob]
  
  type ExternalModelList = js.Array[typings.awsSdk.frauddetectorMod.ExternalModel]
  
  type ExternalModelsMaxResults = scala.Double
  
  type JsonKeyToVariableMap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type KmsEncryptionKeyArn = java.lang.String
  
  type Language = typings.awsSdk.awsSdkStrings.DETECTORPL | java.lang.String
  
  type ListOfModelScores = js.Array[typings.awsSdk.frauddetectorMod.ModelScores]
  
  type ListOfModelVersions = js.Array[typings.awsSdk.frauddetectorMod.ModelVersion]
  
  type ListOfRuleResults = js.Array[typings.awsSdk.frauddetectorMod.RuleResult]
  
  type ListOfStrings = js.Array[java.lang.String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ASSOCIATED
    - typings.awsSdk.awsSdkStrings.DISSOCIATED
    - java.lang.String
  */
  type ModelEndpointStatus = typings.awsSdk.frauddetectorMod._ModelEndpointStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TEXT_CSV
    - typings.awsSdk.awsSdkStrings.APPLICATION_JSON
    - java.lang.String
  */
  type ModelInputDataFormat = typings.awsSdk.frauddetectorMod._ModelInputDataFormat | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TEXT_CSV
    - typings.awsSdk.awsSdkStrings.APPLICATION_JSONLINES
    - java.lang.String
  */
  type ModelOutputDataFormat = typings.awsSdk.frauddetectorMod._ModelOutputDataFormat | java.lang.String
  
  type ModelPredictionMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.frauddetectorMod.float]
  
  type ModelSource = typings.awsSdk.awsSdkStrings.SAGEMAKER | java.lang.String
  
  type ModelTypeEnum = typings.awsSdk.awsSdkStrings.ONLINE_FRAUD_INSIGHTS | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.INACTIVE
    - java.lang.String
  */
  type ModelVersionStatus = typings.awsSdk.frauddetectorMod._ModelVersionStatus | java.lang.String
  
  type NameList = js.Array[java.lang.String]
  
  type NonEmptyListOfStrings = js.Array[java.lang.String]
  
  type OutcomeList = js.Array[typings.awsSdk.frauddetectorMod.Outcome]
  
  type OutcomesMaxResults = scala.Double
  
  type RuleDetailList = js.Array[typings.awsSdk.frauddetectorMod.RuleDetail]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ALL_MATCHED
    - typings.awsSdk.awsSdkStrings.FIRST_MATCHED
    - java.lang.String
  */
  type RuleExecutionMode = typings.awsSdk.frauddetectorMod._RuleExecutionMode | java.lang.String
  
  type RuleList = js.Array[typings.awsSdk.frauddetectorMod.Rule]
  
  type RulesMaxResults = scala.Double
  
  type TagsMaxResults = scala.Double
  
  type TrainingDataSourceEnum = typings.awsSdk.awsSdkStrings.EXTERNAL_EVENTS | java.lang.String
  
  type UseEventVariables = scala.Boolean
  
  type VariableEntryList = js.Array[typings.awsSdk.frauddetectorMod.VariableEntry]
  
  type VariableList = js.Array[typings.awsSdk.frauddetectorMod.Variable]
  
  type VariablesMaxResults = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2019-11-15`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.frauddetectorMod._apiVersion | java.lang.String
  
  type blob = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.frauddetectorMod.Blob_ | java.lang.String
  
  type contentType = java.lang.String
  
  type description = java.lang.String
  
  type entityTypeList = js.Array[typings.awsSdk.frauddetectorMod.EntityType]
  
  type entityTypesMaxResults = scala.Double
  
  type eventTypeList = js.Array[typings.awsSdk.frauddetectorMod.EventType]
  
  type eventTypesMaxResults = scala.Double
  
  type fieldValidationMessageList = js.Array[typings.awsSdk.frauddetectorMod.FieldValidationMessage]
  
  type fileValidationMessageList = js.Array[typings.awsSdk.frauddetectorMod.FileValidationMessage]
  
  type float = scala.Double
  
  type floatVersionString = java.lang.String
  
  type fraudDetectorArn = java.lang.String
  
  type iamRoleArn = java.lang.String
  
  type identifier = java.lang.String
  
  type integer = scala.Double
  
  type labelList = js.Array[typings.awsSdk.frauddetectorMod.Label]
  
  type labelMapper = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.frauddetectorMod.ListOfStrings]
  
  type labelsMaxResults = scala.Double
  
  type listOfEntities = js.Array[typings.awsSdk.frauddetectorMod.Entity]
  
  type metricDataPointsList = js.Array[typings.awsSdk.frauddetectorMod.MetricDataPoint]
  
  type modelIdentifier = java.lang.String
  
  type modelList = js.Array[typings.awsSdk.frauddetectorMod.Model]
  
  type modelVersionDetailList = js.Array[typings.awsSdk.frauddetectorMod.ModelVersionDetail]
  
  type modelsMaxPageSize = scala.Double
  
  type nonEmptyString = java.lang.String
  
  type ruleExpression = java.lang.String
  
  type s3BucketLocation = java.lang.String
  
  type sageMakerEndpointIdentifier = java.lang.String
  
  type tagKey = java.lang.String
  
  type tagKeyList = js.Array[typings.awsSdk.frauddetectorMod.tagKey]
  
  type tagList = js.Array[typings.awsSdk.frauddetectorMod.Tag]
  
  type tagValue = java.lang.String
  
  type time = java.lang.String
  
  type variableName = java.lang.String
  
  type variableValue = java.lang.String
  
  type wholeNumberVersionString = java.lang.String
}
