package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  type EventAttributeMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.frauddetectorMod.attributeValue]
  type ExternalModelEndpointDataBlobMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.frauddetectorMod.ModelEndpointDataBlob]
  type ExternalModelList = js.Array[typings.awsSdk.frauddetectorMod.ExternalModel]
  type ExternalModelsMaxResults = scala.Double
  type IsOpaque = scala.Boolean
  type JsonKeyToVariableMap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type LabelMapper = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.frauddetectorMod.ListOfStrings]
  type Language = typings.awsSdk.awsSdkStrings.DETECTORPL | java.lang.String
  type ListOfModelScores = js.Array[typings.awsSdk.frauddetectorMod.ModelScores]
  type ListOfModelVersions = js.Array[typings.awsSdk.frauddetectorMod.ModelVersion]
  type ListOfStrings = js.Array[java.lang.String]
  type MaxResults = scala.Double
  type MetricsMap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
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
  type ModelList = js.Array[typings.awsSdk.frauddetectorMod.Model]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TEXT_CSV
    - typings.awsSdk.awsSdkStrings.APPLICATION_JSONLINES
    - java.lang.String
  */
  type ModelOutputDataFormat = typings.awsSdk.frauddetectorMod._ModelOutputDataFormat | java.lang.String
  type ModelPredictionMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.frauddetectorMod.float]
  type ModelSource = typings.awsSdk.awsSdkStrings.SAGEMAKER | java.lang.String
  type ModelTypeEnum = typings.awsSdk.awsSdkStrings.ONLINE_FRAUD_INSIGHTS | java.lang.String
  type ModelVariableIndex = scala.Double
  type ModelVariablesList = js.Array[typings.awsSdk.frauddetectorMod.ModelVariable]
  type ModelVersionDetailList = js.Array[typings.awsSdk.frauddetectorMod.ModelVersionDetail]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TRAINING_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.TRAINING_COMPLETE
    - typings.awsSdk.awsSdkStrings.ACTIVATE_REQUESTED
    - typings.awsSdk.awsSdkStrings.ACTIVATE_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.INACTIVATE_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.INACTIVE
    - typings.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type ModelVersionStatus = typings.awsSdk.frauddetectorMod._ModelVersionStatus | java.lang.String
  type NameList = js.Array[java.lang.String]
  type NonEmptyListOfStrings = js.Array[java.lang.String]
  type OutcomeList = js.Array[typings.awsSdk.frauddetectorMod.Outcome]
  type OutcomesMaxResults = scala.Double
  type RuleDetailList = js.Array[typings.awsSdk.frauddetectorMod.RuleDetail]
  type RuleList = js.Array[typings.awsSdk.frauddetectorMod.Rule]
  type RulesMaxResults = scala.Double
  type VariableEntryList = js.Array[typings.awsSdk.frauddetectorMod.VariableEntry]
  type VariableList = js.Array[typings.awsSdk.frauddetectorMod.Variable]
  type VariablesMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2019-11-15`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.frauddetectorMod._apiVersion | java.lang.String
  type attributeKey = java.lang.String
  type attributeValue = java.lang.String
  type blob = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.frauddetectorMod.Blob_ | java.lang.String
  type contentType = java.lang.String
  type description = java.lang.String
  type float = scala.Double
  type iamRoleArn = java.lang.String
  type identifier = java.lang.String
  type integer = scala.Double
  type nonEmptyString = java.lang.String
  type ruleExpression = java.lang.String
  type s3BucketLocation = java.lang.String
  type time = java.lang.String
}
