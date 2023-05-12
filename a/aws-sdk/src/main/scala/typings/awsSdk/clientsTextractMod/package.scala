package typings.awsSdk.clientsTextractMod

import typings.awsSdk.awsSdkStrings.DATE
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BlockList = js.Array[Block]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.KEY_VALUE_SET
  - typings.awsSdk.awsSdkStrings.PAGE
  - typings.awsSdk.awsSdkStrings.LINE
  - typings.awsSdk.awsSdkStrings.WORD
  - typings.awsSdk.awsSdkStrings.TABLE
  - typings.awsSdk.awsSdkStrings.CELL
  - typings.awsSdk.awsSdkStrings.SELECTION_ELEMENT
  - typings.awsSdk.awsSdkStrings.MERGED_CELL
  - typings.awsSdk.awsSdkStrings.TITLE
  - typings.awsSdk.awsSdkStrings.QUERY
  - typings.awsSdk.awsSdkStrings.QUERY_RESULT
  - typings.awsSdk.awsSdkStrings.SIGNATURE
  - typings.awsSdk.awsSdkStrings.TABLE_TITLE
  - typings.awsSdk.awsSdkStrings.TABLE_FOOTER
  - java.lang.String
*/
type BlockType = _BlockType | java.lang.String

type ClientRequestToken = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FreeOfPersonallyIdentifiableInformation
  - typings.awsSdk.awsSdkStrings.FreeOfAdultContent
  - java.lang.String
*/
type ContentClassifier = _ContentClassifier | java.lang.String

type ContentClassifiers = js.Array[ContentClassifier]

type DetectedSignatureList = js.Array[DetectedSignature]

type DocumentGroupList = js.Array[DocumentGroup]

type DocumentPages = js.Array[Document]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.KEY
  - typings.awsSdk.awsSdkStrings.VALUE
  - typings.awsSdk.awsSdkStrings.COLUMN_HEADER
  - typings.awsSdk.awsSdkStrings.TABLE_TITLE
  - typings.awsSdk.awsSdkStrings.TABLE_FOOTER
  - typings.awsSdk.awsSdkStrings.TABLE_SECTION_TITLE
  - typings.awsSdk.awsSdkStrings.TABLE_SUMMARY
  - typings.awsSdk.awsSdkStrings.STRUCTURED_TABLE
  - typings.awsSdk.awsSdkStrings.SEMI_STRUCTURED_TABLE
  - java.lang.String
*/
type EntityType = _EntityType | java.lang.String

type EntityTypes = js.Array[EntityType]

type ErrorCode = java.lang.String

type ExpenseDocumentList = js.Array[ExpenseDocument]

type ExpenseFieldList = js.Array[ExpenseField]

type ExpenseGroupPropertyList = js.Array[ExpenseGroupProperty]

type ExtractionList = js.Array[Extraction]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TABLES
  - typings.awsSdk.awsSdkStrings.FORMS
  - typings.awsSdk.awsSdkStrings.QUERIES
  - typings.awsSdk.awsSdkStrings.SIGNATURES
  - java.lang.String
*/
type FeatureType = _FeatureType | java.lang.String

type FeatureTypes = js.Array[FeatureType]

type Float = Double

type FlowDefinitionArn = java.lang.String

type HumanLoopActivationConditionsEvaluationResults = java.lang.String

type HumanLoopActivationReason = java.lang.String

type HumanLoopActivationReasons = js.Array[HumanLoopActivationReason]

type HumanLoopArn = java.lang.String

type HumanLoopName = java.lang.String

type IdList = js.Array[NonEmptyString]

type IdentityDocumentFieldList = js.Array[IdentityDocumentField]

type IdentityDocumentList = js.Array[IdentityDocument]

type ImageBlob = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

type JobId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.PARTIAL_SUCCESS
  - java.lang.String
*/
type JobStatus = _JobStatus | java.lang.String

type JobTag = java.lang.String

type KMSKeyId = java.lang.String

type LendingDetectionList = js.Array[LendingDetection]

type LendingFieldList = js.Array[LendingField]

type LendingResultList = js.Array[LendingResult]

type LineItemGroupList = js.Array[LineItemGroup]

type LineItemList = js.Array[LineItemFields]

type MaxResults = Double

type NonEmptyString = java.lang.String

type PageList = js.Array[UInteger]

type Pages = js.Array[UInteger]

type PaginationToken = java.lang.String

type Percent = Double

type Polygon = js.Array[Point]

type PredictionList = js.Array[Prediction]

type Queries = js.Array[Query]

type QueryInput = java.lang.String

type QueryPage = java.lang.String

type QueryPages = js.Array[QueryPage]

type RelationshipList = js.Array[Relationship]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.VALUE
  - typings.awsSdk.awsSdkStrings.CHILD
  - typings.awsSdk.awsSdkStrings.COMPLEX_FEATURES
  - typings.awsSdk.awsSdkStrings.MERGED_CELL
  - typings.awsSdk.awsSdkStrings.TITLE
  - typings.awsSdk.awsSdkStrings.ANSWER
  - typings.awsSdk.awsSdkStrings.TABLE
  - typings.awsSdk.awsSdkStrings.TABLE_TITLE
  - typings.awsSdk.awsSdkStrings.TABLE_FOOTER
  - java.lang.String
*/
type RelationshipType = _RelationshipType | java.lang.String

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
type SelectionStatus = _SelectionStatus | java.lang.String

type SignatureDetectionList = js.Array[SignatureDetection]

type SplitDocumentList = js.Array[SplitDocument]

type StatusMessage = java.lang.String

type String = java.lang.String

type StringList = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HANDWRITING
  - typings.awsSdk.awsSdkStrings.PRINTED
  - java.lang.String
*/
type TextType = _TextType | java.lang.String

type UInteger = Double

type UndetectedDocumentTypeList = js.Array[NonEmptyString]

type UndetectedSignatureList = js.Array[UndetectedSignature]

type ValueType = DATE | java.lang.String

type Warnings = js.Array[Warning]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2018-06-27`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
