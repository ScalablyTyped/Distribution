package typings.awsSdk.wisdomMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.AGENT
import typings.awsSdk.awsSdkStrings.EQUALS
import typings.awsSdk.awsSdkStrings.KNOWLEDGE_BASE
import typings.awsSdk.awsSdkStrings.KNOWLEDGE_CONTENT
import typings.awsSdk.awsSdkStrings.NAME
import typings.awsSdk.awsSdkStrings.QUERY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Arn = java.lang.String

type AssistantAssociationSummaryList = js.Array[AssistantAssociationSummary]

type AssistantList = js.Array[AssistantSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.CREATE_FAILED
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.DELETE_FAILED
  - typings.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type AssistantStatus = _AssistantStatus | java.lang.String

type AssistantType = AGENT | java.lang.String

type AssociationType = KNOWLEDGE_BASE | java.lang.String

type Boolean = scala.Boolean

type ClientToken = java.lang.String

type ContentMetadata = StringDictionary[NonEmptyString]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.CREATE_FAILED
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.DELETE_FAILED
  - typings.awsSdk.awsSdkStrings.DELETED
  - typings.awsSdk.awsSdkStrings.UPDATE_FAILED
  - java.lang.String
*/
type ContentStatus = _ContentStatus | java.lang.String

type ContentSummaryList = js.Array[ContentSummary]

type ContentTitle = java.lang.String

type ContentType = java.lang.String

type Description = java.lang.String

type FilterField = NAME | java.lang.String

type FilterList = js.Array[Filter]

type FilterOperator = EQUALS | java.lang.String

type GenericArn = java.lang.String

type Headers = StringDictionary[NonEmptyString]

type HighlightOffset = Double

type Highlights = js.Array[Highlight]

type KnowledgeBaseList = js.Array[KnowledgeBaseSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.CREATE_FAILED
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.DELETE_FAILED
  - typings.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type KnowledgeBaseStatus = _KnowledgeBaseStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EXTERNAL
  - typings.awsSdk.awsSdkStrings.CUSTOM
  - java.lang.String
*/
type KnowledgeBaseType = _KnowledgeBaseType | java.lang.String

type MaxResults = Double

type Name = java.lang.String

type NextToken = java.lang.String

type NonEmptyString = java.lang.String

type NotifyRecommendationsReceivedErrorList = js.Array[NotifyRecommendationsReceivedError]

type NotifyRecommendationsReceivedErrorMessage = java.lang.String

type ObjectFieldsList = js.Array[NonEmptyString]

type QueryResultsList = js.Array[ResultData]

type QueryText = java.lang.String

type RecommendationIdList = js.Array[String]

type RecommendationList = js.Array[RecommendationData]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ISSUE_DETECTION
  - typings.awsSdk.awsSdkStrings.RULE_EVALUATION
  - typings.awsSdk.awsSdkStrings.OTHER
  - java.lang.String
*/
type RecommendationSourceType = _RecommendationSourceType | java.lang.String

type RecommendationTriggerList = js.Array[RecommendationTrigger]

type RecommendationTriggerType = QUERY | java.lang.String

type RecommendationType = KNOWLEDGE_CONTENT | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HELPFUL
  - typings.awsSdk.awsSdkStrings.NOT_HELPFUL
  - java.lang.String
*/
type Relevance = _Relevance | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HIGH
  - typings.awsSdk.awsSdkStrings.MEDIUM
  - typings.awsSdk.awsSdkStrings.LOW
  - java.lang.String
*/
type RelevanceLevel = _RelevanceLevel | java.lang.String

type RelevanceScore = Double

type SensitiveString = java.lang.String

type SessionSummaries = js.Array[SessionSummary]

type String = java.lang.String

type SyntheticTimestampEpochSeconds = js.Date

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagValue = java.lang.String

type Tags = StringDictionary[TagValue]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RECOMMENDATION
  - typings.awsSdk.awsSdkStrings.RESULT
  - java.lang.String
*/
type TargetType = _TargetType | java.lang.String

type Uri = java.lang.String

type Url = java.lang.String

type Uuid = java.lang.String

type UuidOrArn = java.lang.String

type WaitTimeSeconds = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2020-10-19`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
