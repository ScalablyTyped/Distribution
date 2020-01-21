package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object textractMod {
  type BlockList = js.Array[typings.awsSdk.textractMod.Block]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.KEY_VALUE_SET
    - typings.awsSdk.awsSdkStrings.PAGE
    - typings.awsSdk.awsSdkStrings.LINE
    - typings.awsSdk.awsSdkStrings.WORD
    - typings.awsSdk.awsSdkStrings.TABLE
    - typings.awsSdk.awsSdkStrings.CELL
    - typings.awsSdk.awsSdkStrings.SELECTION_ELEMENT
    - java.lang.String
  */
  type BlockType = typings.awsSdk.textractMod._BlockType | java.lang.String
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.textractMod.ClientApiVersions
  type ClientRequestToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.FreeOfPersonallyIdentifiableInformation
    - typings.awsSdk.awsSdkStrings.FreeOfAdultContent
    - java.lang.String
  */
  type ContentClassifier = typings.awsSdk.textractMod._ContentClassifier | java.lang.String
  type ContentClassifiers = js.Array[typings.awsSdk.textractMod.ContentClassifier]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.KEY
    - typings.awsSdk.awsSdkStrings.VALUE
    - java.lang.String
  */
  type EntityType = typings.awsSdk.textractMod._EntityType | java.lang.String
  type EntityTypes = js.Array[typings.awsSdk.textractMod.EntityType]
  type ErrorCode = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TABLES
    - typings.awsSdk.awsSdkStrings.FORMS
    - java.lang.String
  */
  type FeatureType = typings.awsSdk.textractMod._FeatureType | java.lang.String
  type FeatureTypes = js.Array[typings.awsSdk.textractMod.FeatureType]
  type Float = scala.Double
  type FlowDefinitionArn = java.lang.String
  type HumanLoopActivationConditionsEvaluationResults = java.lang.String
  type HumanLoopActivationReason = java.lang.String
  type HumanLoopActivationReasons = js.Array[typings.awsSdk.textractMod.HumanLoopActivationReason]
  type HumanLoopArn = java.lang.String
  type HumanLoopName = java.lang.String
  type IdList = js.Array[typings.awsSdk.textractMod.NonEmptyString]
  type ImageBlob = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.textractMod.Blob | java.lang.String
  type JobId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.SUCCEEDED
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.PARTIAL_SUCCESS
    - java.lang.String
  */
  type JobStatus = typings.awsSdk.textractMod._JobStatus | java.lang.String
  type JobTag = java.lang.String
  type MaxResults = scala.Double
  type NonEmptyString = java.lang.String
  type Pages = js.Array[typings.awsSdk.textractMod.UInteger]
  type PaginationToken = java.lang.String
  type Percent = scala.Double
  type Polygon = js.Array[typings.awsSdk.textractMod.Point]
  type RelationshipList = js.Array[typings.awsSdk.textractMod.Relationship]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.VALUE
    - typings.awsSdk.awsSdkStrings.CHILD
    - java.lang.String
  */
  type RelationshipType = typings.awsSdk.textractMod._RelationshipType | java.lang.String
  type RoleArn = java.lang.String
  type S3Bucket = java.lang.String
  type S3ObjectName = java.lang.String
  type S3ObjectVersion = java.lang.String
  type SNSTopicArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SELECTED
    - typings.awsSdk.awsSdkStrings.NOT_SELECTED
    - java.lang.String
  */
  type SelectionStatus = typings.awsSdk.textractMod._SelectionStatus | java.lang.String
  type StatusMessage = java.lang.String
  type String = java.lang.String
  type UInteger = scala.Double
  type Warnings = js.Array[typings.awsSdk.textractMod.Warning]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-06-27`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.textractMod._apiVersion | java.lang.String
}
