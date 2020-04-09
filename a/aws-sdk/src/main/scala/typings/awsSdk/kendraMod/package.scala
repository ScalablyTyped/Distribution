package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kendraMod {
  type AdditionalResultAttributeList = js.Array[typings.awsSdk.kendraMod.AdditionalResultAttribute]
  type AdditionalResultAttributeValueType = typings.awsSdk.awsSdkStrings.TEXT_WITH_HIGHLIGHTS_VALUE | java.lang.String
  type AttributeFilterList = js.Array[typings.awsSdk.kendraMod.AttributeFilter]
  type BatchDeleteDocumentResponseFailedDocuments = js.Array[typings.awsSdk.kendraMod.BatchDeleteDocumentResponseFailedDocument]
  type BatchPutDocumentResponseFailedDocuments = js.Array[typings.awsSdk.kendraMod.BatchPutDocumentResponseFailedDocument]
  type Boolean = scala.Boolean
  type ChangeDetectingColumns = js.Array[typings.awsSdk.kendraMod.ColumnName]
  type ClickFeedbackList = js.Array[typings.awsSdk.kendraMod.ClickFeedback]
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.kendraMod.ClientApiVersions
  type ClientTokenName = java.lang.String
  type ColumnName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PDF
    - typings.awsSdk.awsSdkStrings.HTML
    - typings.awsSdk.awsSdkStrings.MS_WORD
    - typings.awsSdk.awsSdkStrings.PLAIN_TEXT
    - typings.awsSdk.awsSdkStrings.PPT
    - java.lang.String
  */
  type ContentType = typings.awsSdk.kendraMod._ContentType | java.lang.String
  type DataSourceDateFieldFormat = java.lang.String
  type DataSourceFieldName = java.lang.String
  type DataSourceId = java.lang.String
  type DataSourceInclusionsExclusionsStrings = js.Array[typings.awsSdk.kendraMod.DataSourceInclusionsExclusionsStringsMember]
  type DataSourceInclusionsExclusionsStringsMember = java.lang.String
  type DataSourceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.UPDATING
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - java.lang.String
  */
  type DataSourceStatus = typings.awsSdk.kendraMod._DataSourceStatus | java.lang.String
  type DataSourceSummaryList = js.Array[typings.awsSdk.kendraMod.DataSourceSummary]
  type DataSourceSyncJobHistoryList = js.Array[typings.awsSdk.kendraMod.DataSourceSyncJob]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.SUCCEEDED
    - typings.awsSdk.awsSdkStrings.SYNCING
    - typings.awsSdk.awsSdkStrings.INCOMPLETE
    - typings.awsSdk.awsSdkStrings.STOPPING
    - typings.awsSdk.awsSdkStrings.ABORTED
    - java.lang.String
  */
  type DataSourceSyncJobStatus = typings.awsSdk.kendraMod._DataSourceSyncJobStatus | java.lang.String
  type DataSourceToIndexFieldMappingList = js.Array[typings.awsSdk.kendraMod.DataSourceToIndexFieldMapping]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.S3
    - typings.awsSdk.awsSdkStrings.SHAREPOINT
    - typings.awsSdk.awsSdkStrings.DATABASE
    - java.lang.String
  */
  type DataSourceType = typings.awsSdk.kendraMod._DataSourceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.RDS_AURORA_MYSQL
    - typings.awsSdk.awsSdkStrings.RDS_AURORA_POSTGRESQL
    - typings.awsSdk.awsSdkStrings.RDS_MYSQL
    - typings.awsSdk.awsSdkStrings.RDS_POSTGRESQL
    - java.lang.String
  */
  type DatabaseEngineType = typings.awsSdk.kendraMod._DatabaseEngineType | java.lang.String
  type DatabaseHost = java.lang.String
  type DatabaseName = java.lang.String
  type DatabasePort = scala.Double
  type Description = java.lang.String
  type DocumentAttributeKey = java.lang.String
  type DocumentAttributeKeyList = js.Array[typings.awsSdk.kendraMod.DocumentAttributeKey]
  type DocumentAttributeList = js.Array[typings.awsSdk.kendraMod.DocumentAttribute]
  type DocumentAttributeStringListValue = js.Array[typings.awsSdk.kendraMod.String]
  type DocumentAttributeStringValue = java.lang.String
  type DocumentAttributeValueCountPairList = js.Array[typings.awsSdk.kendraMod.DocumentAttributeValueCountPair]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.STRING_VALUE
    - typings.awsSdk.awsSdkStrings.STRING_LIST_VALUE
    - typings.awsSdk.awsSdkStrings.LONG_VALUE
    - typings.awsSdk.awsSdkStrings.DATE_VALUE
    - java.lang.String
  */
  type DocumentAttributeValueType = typings.awsSdk.kendraMod._DocumentAttributeValueType | java.lang.String
  type DocumentId = java.lang.String
  type DocumentIdList = js.Array[typings.awsSdk.kendraMod.DocumentId]
  type DocumentList = js.Array[typings.awsSdk.kendraMod.Document]
  type DocumentMetadataBoolean = scala.Boolean
  type DocumentMetadataConfigurationList = js.Array[typings.awsSdk.kendraMod.DocumentMetadataConfiguration]
  type DocumentMetadataConfigurationName = java.lang.String
  type Duration = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.InternalError
    - typings.awsSdk.awsSdkStrings.InvalidRequest
    - java.lang.String
  */
  type ErrorCode = typings.awsSdk.kendraMod._ErrorCode | java.lang.String
  type ErrorMessage = java.lang.String
  type FacetList = js.Array[typings.awsSdk.kendraMod.Facet]
  type FacetResultList = js.Array[typings.awsSdk.kendraMod.FacetResult]
  type FaqId = java.lang.String
  type FaqName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.UPDATING
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type FaqStatus = typings.awsSdk.kendraMod._FaqStatus | java.lang.String
  type FaqSummaryItems = js.Array[typings.awsSdk.kendraMod.FaqSummary]
  type HighlightList = js.Array[typings.awsSdk.kendraMod.Highlight]
  type Importance = scala.Double
  type IndexConfigurationSummaryList = js.Array[typings.awsSdk.kendraMod.IndexConfigurationSummary]
  type IndexFieldName = java.lang.String
  type IndexId = java.lang.String
  type IndexName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.SYSTEM_UPDATING
    - java.lang.String
  */
  type IndexStatus = typings.awsSdk.kendraMod._IndexStatus | java.lang.String
  type IndexedQuestionAnswersCount = scala.Double
  type IndexedTextDocumentsCount = scala.Double
  type Integer = scala.Double
  type KmsKeyId = java.lang.String
  type Long = scala.Double
  type MaxResultsIntegerForListDataSourceSyncJobsRequest = scala.Double
  type MaxResultsIntegerForListDataSourcesRequest = scala.Double
  type MaxResultsIntegerForListFaqsRequest = scala.Double
  type MaxResultsIntegerForListIndicesRequest = scala.Double
  type NextToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ASCENDING
    - typings.awsSdk.awsSdkStrings.DESCENDING
    - java.lang.String
  */
  type Order = typings.awsSdk.kendraMod._Order | java.lang.String
  type PrincipalList = js.Array[typings.awsSdk.kendraMod.Principal]
  type PrincipalName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.USER
    - typings.awsSdk.awsSdkStrings.GROUP
    - java.lang.String
  */
  type PrincipalType = typings.awsSdk.kendraMod._PrincipalType | java.lang.String
  type QueryId = java.lang.String
  type QueryResultItemList = js.Array[typings.awsSdk.kendraMod.QueryResultItem]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DOCUMENT
    - typings.awsSdk.awsSdkStrings.QUESTION_ANSWER
    - typings.awsSdk.awsSdkStrings.ANSWER
    - java.lang.String
  */
  type QueryResultType = typings.awsSdk.kendraMod._QueryResultType | java.lang.String
  type QueryText = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ALLOW
    - typings.awsSdk.awsSdkStrings.DENY
    - java.lang.String
  */
  type ReadAccessType = typings.awsSdk.kendraMod._ReadAccessType | java.lang.String
  type RelevanceFeedbackList = js.Array[typings.awsSdk.kendraMod.RelevanceFeedback]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.RELEVANT
    - typings.awsSdk.awsSdkStrings.NOT_RELEVANT
    - java.lang.String
  */
  type RelevanceType = typings.awsSdk.kendraMod._RelevanceType | java.lang.String
  type ResultId = java.lang.String
  type RoleArn = java.lang.String
  type S3BucketName = java.lang.String
  type S3ObjectKey = java.lang.String
  type ScanSchedule = java.lang.String
  type SecretArn = java.lang.String
  type SecurityGroupIdList = js.Array[typings.awsSdk.kendraMod.VpcSecurityGroupId]
  type SharePointUrlList = js.Array[typings.awsSdk.kendraMod.Url]
  type SharePointVersion = typings.awsSdk.awsSdkStrings.SHAREPOINT_ONLINE | java.lang.String
  type String = java.lang.String
  type SubnetId = java.lang.String
  type SubnetIdList = js.Array[typings.awsSdk.kendraMod.SubnetId]
  type TableName = java.lang.String
  type Timestamp = typings.std.Date
  type Title = java.lang.String
  type Url = java.lang.String
  type ValueImportanceMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.kendraMod.Importance]
  type ValueImportanceMapKey = java.lang.String
  type VpcSecurityGroupId = java.lang.String
  type _Blob = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.kendraMod.Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2019-02-03`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.kendraMod._apiVersion | java.lang.String
}
