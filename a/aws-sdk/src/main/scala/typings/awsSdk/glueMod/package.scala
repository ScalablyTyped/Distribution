package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.EQUALS
import typings.awsSdk.awsSdkStrings.FIND_MATCHES
import typings.awsSdk.awsSdkStrings.SYNTAX_DIFF
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountId = String

type ActionList = js.Array[Action]

type AdditionalOptions = StringDictionary[EnclosedInStringProperty]

type AdditionalPlanOptionsMap = StringDictionary[GenericString]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.avg_
  - typings.awsSdk.awsSdkStrings.countDistinct
  - typings.awsSdk.awsSdkStrings.count__
  - typings.awsSdk.awsSdkStrings.first_
  - typings.awsSdk.awsSdkStrings.last_
  - typings.awsSdk.awsSdkStrings.kurtosis
  - typings.awsSdk.awsSdkStrings.max_
  - typings.awsSdk.awsSdkStrings.min
  - typings.awsSdk.awsSdkStrings.skewness
  - typings.awsSdk.awsSdkStrings.stddev_samp
  - typings.awsSdk.awsSdkStrings.stddev_pop
  - typings.awsSdk.awsSdkStrings.sum__
  - typings.awsSdk.awsSdkStrings.sumDistinct
  - typings.awsSdk.awsSdkStrings.var_samp
  - typings.awsSdk.awsSdkStrings.var_pop
  - java.lang.String
*/
type AggFunction = _AggFunction | String

type AggregateOperations = js.Array[AggregateOperation]

type AttemptCount = scala.Double

type AuditColumnNamesList = js.Array[ColumnNameString]

type AuditContextString = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENCRYPTED_PARTITION_ERROR
  - typings.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - typings.awsSdk.awsSdkStrings.INVALID_PARTITION_TYPE_DATA_ERROR
  - typings.awsSdk.awsSdkStrings.MISSING_PARTITION_VALUE_ERROR
  - typings.awsSdk.awsSdkStrings.UNSUPPORTED_PARTITION_CHARACTER_ERROR
  - java.lang.String
*/
type BackfillErrorCode = _BackfillErrorCode | String

type BackfillErroredPartitionsList = js.Array[PartitionValueList]

type BackfillErrors = js.Array[BackfillError]

type BatchDeletePartitionValueList = js.Array[PartitionValueList]

type BatchDeleteTableNameList = js.Array[NameString]

type BatchDeleteTableVersionList = js.Array[VersionString]

type BatchGetBlueprintNames = js.Array[OrchestrationNameString]

type BatchGetPartitionValueList = js.Array[PartitionValueList]

type BatchSize = scala.Double

type BatchStopJobRunErrorList = js.Array[BatchStopJobRunError]

type BatchStopJobRunJobRunIdList = js.Array[IdString]

type BatchStopJobRunSuccessfulSubmissionList = js.Array[BatchStopJobRunSuccessfulSubmission]

type BatchUpdatePartitionFailureList = js.Array[BatchUpdatePartitionFailureEntry]

type BatchUpdatePartitionRequestEntryList = js.Array[BatchUpdatePartitionRequestEntry]

type BatchWindow = scala.Double

type BlueprintNames = js.Array[OrchestrationNameString]

type BlueprintParameterSpec = String

type BlueprintParameters = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.ROLLING_BACK
  - java.lang.String
*/
type BlueprintRunState = _BlueprintRunState | String

type BlueprintRuns = js.Array[BlueprintRun]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type BlueprintStatus = _BlueprintStatus | String

type Blueprints = js.Array[Blueprint]

type Boolean = scala.Boolean

type BooleanNullable = scala.Boolean

type BooleanValue = scala.Boolean

type BoundedPartitionValueList = js.Array[ValueString]

type BoxedBoolean = scala.Boolean

type BoxedDoubleFraction = scala.Double

type BoxedLong = scala.Double

type BoxedNonNegativeInt = scala.Double

type BoxedNonNegativeLong = scala.Double

type BoxedPositiveInt = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DISABLED
  - typings.awsSdk.awsSdkStrings.`SSE-KMS`
  - java.lang.String
*/
type CatalogEncryptionMode = _CatalogEncryptionMode | String

type CatalogEntries = js.Array[CatalogEntry]

type CatalogGetterPageSize = scala.Double

type CatalogIdString = String

type CatalogTablesList = js.Array[NameString]

type CatalogTargetList = js.Array[CatalogTarget]

type Classification = String

type ClassifierList = js.Array[Classifier]

type ClassifierNameList = js.Array[NameString]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DISABLED
  - typings.awsSdk.awsSdkStrings.`SSE-KMS`
  - java.lang.String
*/
type CloudWatchEncryptionMode = _CloudWatchEncryptionMode | String

type CodeGenArgName = String

type CodeGenArgValue = String

type CodeGenConfigurationNodes = StringDictionary[CodeGenConfigurationNode]

type CodeGenIdentifier = String

type CodeGenNodeArgs = js.Array[CodeGenNodeArg]

type CodeGenNodeType = String

type ColumnErrors = js.Array[ColumnError]

type ColumnImportanceList = js.Array[ColumnImportance]

type ColumnList = js.Array[Column]

type ColumnNameString = String

type ColumnRowFilterList = js.Array[ColumnRowFilter]

type ColumnStatisticsErrors = js.Array[ColumnStatisticsError]

type ColumnStatisticsList = js.Array[ColumnStatistics]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BOOLEAN
  - typings.awsSdk.awsSdkStrings.DATE
  - typings.awsSdk.awsSdkStrings.DECIMAL
  - typings.awsSdk.awsSdkStrings.DOUBLE
  - typings.awsSdk.awsSdkStrings.LONG
  - typings.awsSdk.awsSdkStrings.STRING
  - typings.awsSdk.awsSdkStrings.BINARY
  - java.lang.String
*/
type ColumnStatisticsType = _ColumnStatisticsType | String

type ColumnTypeString = String

type ColumnValueStringList = js.Array[ColumnValuesString]

type ColumnValuesString = String

type CommentString = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EQUALS
  - typings.awsSdk.awsSdkStrings.GREATER_THAN
  - typings.awsSdk.awsSdkStrings.LESS_THAN
  - typings.awsSdk.awsSdkStrings.GREATER_THAN_EQUALS
  - typings.awsSdk.awsSdkStrings.LESS_THAN_EQUALS
  - java.lang.String
*/
type Comparator = _Comparator | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.DISABLED
  - typings.awsSdk.awsSdkStrings.BACKWARD
  - typings.awsSdk.awsSdkStrings.BACKWARD_ALL
  - typings.awsSdk.awsSdkStrings.FORWARD
  - typings.awsSdk.awsSdkStrings.FORWARD_ALL
  - typings.awsSdk.awsSdkStrings.FULL
  - typings.awsSdk.awsSdkStrings.FULL_ALL
  - java.lang.String
*/
type Compatibility = _Compatibility | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.gzip__
  - typings.awsSdk.awsSdkStrings.bzip2_
  - java.lang.String
*/
type CompressionType = _CompressionType | String

type ConditionList = js.Array[Condition]

type ConnectionList = js.Array[Connection]

type ConnectionName = String

type ConnectionProperties = StringDictionary[ValueString]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HOST
  - typings.awsSdk.awsSdkStrings.PORT
  - typings.awsSdk.awsSdkStrings.USERNAME
  - typings.awsSdk.awsSdkStrings.PASSWORD
  - typings.awsSdk.awsSdkStrings.ENCRYPTED_PASSWORD
  - typings.awsSdk.awsSdkStrings.JDBC_DRIVER_JAR_URI
  - typings.awsSdk.awsSdkStrings.JDBC_DRIVER_CLASS_NAME
  - typings.awsSdk.awsSdkStrings.JDBC_ENGINE
  - typings.awsSdk.awsSdkStrings.JDBC_ENGINE_VERSION
  - typings.awsSdk.awsSdkStrings.CONFIG_FILES
  - typings.awsSdk.awsSdkStrings.INSTANCE_ID
  - typings.awsSdk.awsSdkStrings.JDBC_CONNECTION_URL
  - typings.awsSdk.awsSdkStrings.JDBC_ENFORCE_SSL
  - typings.awsSdk.awsSdkStrings.CUSTOM_JDBC_CERT
  - typings.awsSdk.awsSdkStrings.SKIP_CUSTOM_JDBC_CERT_VALIDATION
  - typings.awsSdk.awsSdkStrings.CUSTOM_JDBC_CERT_STRING
  - typings.awsSdk.awsSdkStrings.CONNECTION_URL
  - typings.awsSdk.awsSdkStrings.KAFKA_BOOTSTRAP_SERVERS
  - typings.awsSdk.awsSdkStrings.KAFKA_SSL_ENABLED
  - typings.awsSdk.awsSdkStrings.KAFKA_CUSTOM_CERT
  - typings.awsSdk.awsSdkStrings.KAFKA_SKIP_CUSTOM_CERT_VALIDATION
  - typings.awsSdk.awsSdkStrings.KAFKA_CLIENT_KEYSTORE
  - typings.awsSdk.awsSdkStrings.KAFKA_CLIENT_KEYSTORE_PASSWORD
  - typings.awsSdk.awsSdkStrings.KAFKA_CLIENT_KEY_PASSWORD
  - typings.awsSdk.awsSdkStrings.ENCRYPTED_KAFKA_CLIENT_KEYSTORE_PASSWORD
  - typings.awsSdk.awsSdkStrings.ENCRYPTED_KAFKA_CLIENT_KEY_PASSWORD
  - typings.awsSdk.awsSdkStrings.SECRET_ID
  - typings.awsSdk.awsSdkStrings.CONNECTOR_URL
  - typings.awsSdk.awsSdkStrings.CONNECTOR_TYPE
  - typings.awsSdk.awsSdkStrings.CONNECTOR_CLASS_NAME
  - java.lang.String
*/
type ConnectionPropertyKey = _ConnectionPropertyKey | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.JDBC
  - typings.awsSdk.awsSdkStrings.SFTP
  - typings.awsSdk.awsSdkStrings.MONGODB
  - typings.awsSdk.awsSdkStrings.KAFKA
  - typings.awsSdk.awsSdkStrings.NETWORK
  - typings.awsSdk.awsSdkStrings.MARKETPLACE
  - typings.awsSdk.awsSdkStrings.CUSTOM
  - java.lang.String
*/
type ConnectionType = _ConnectionType | String

type ContextWords = js.Array[NameString]

type CrawlId = String

type CrawlList = js.Array[Crawl]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.CANCELLING
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type CrawlState = _CrawlState | String

type CrawlerConfiguration = String

type CrawlerHistoryList = js.Array[CrawlerHistory]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
type CrawlerHistoryState = _CrawlerHistoryState | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLE
  - typings.awsSdk.awsSdkStrings.DISABLE
  - java.lang.String
*/
type CrawlerLineageSettings = _CrawlerLineageSettings | String

type CrawlerList = js.Array[Crawler]

type CrawlerMetricsList = js.Array[CrawlerMetrics]

type CrawlerNameList = js.Array[NameString]

type CrawlerSecurityConfiguration = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.READY
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.STOPPING
  - java.lang.String
*/
type CrawlerState = _CrawlerState | String

type CrawlsFilterList = js.Array[CrawlsFilter]

type CreatedTimestamp = String

type CronExpression = String

type CsvColumnDelimiter = String

type CsvHeader = js.Array[NameString]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - typings.awsSdk.awsSdkStrings.PRESENT
  - typings.awsSdk.awsSdkStrings.ABSENT
  - java.lang.String
*/
type CsvHeaderOption = _CsvHeaderOption | String

type CsvQuoteSymbol = String

type CustomEntityTypeNames = js.Array[NameString]

type CustomEntityTypes = js.Array[CustomEntityType]

type CustomPatterns = String

type DagEdges = js.Array[CodeGenEdge]

type DagNodes = js.Array[CodeGenNode]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AVRO
  - typings.awsSdk.awsSdkStrings.JSON
  - typings.awsSdk.awsSdkStrings.PROTOBUF
  - java.lang.String
*/
type DataFormat = _DataFormat | String

type DataLakePrincipalString = String

type DatabaseList = js.Array[Database]

type DatabaseName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LOG
  - typings.awsSdk.awsSdkStrings.DELETE_FROM_DATABASE
  - typings.awsSdk.awsSdkStrings.DEPRECATE_IN_DATABASE
  - java.lang.String
*/
type DeleteBehavior = _DeleteBehavior | String

type DeleteConnectionNameList = js.Array[NameString]

type DeltaTargetList = js.Array[DeltaTarget]

type DescriptionString = String

type DescriptionStringRemovable = String

type DevEndpointList = js.Array[DevEndpoint]

type DevEndpointNameList = js.Array[NameString]

type DevEndpointNames = js.Array[GenericString]

type Double = scala.Double

type DoubleValue = scala.Double

type DynamoDBTargetList = js.Array[DynamoDBTarget]

type EdgeList = js.Array[Edge]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TRUE
  - typings.awsSdk.awsSdkStrings.FALSE
  - java.lang.String
*/
type EnableHybridValues = _EnableHybridValues | String

type EnclosedInStringProperties = js.Array[EnclosedInStringProperty]

type EnclosedInStringPropertiesMinOne = js.Array[EnclosedInStringProperty]

type EnclosedInStringProperty = String

type EnclosedInStringPropertyWithQuote = String

type ErrorByName = StringDictionary[ErrorDetail]

type ErrorCodeString = String

type ErrorMessageString = String

type ErrorString = String

type EventQueueArn = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FLEX
  - typings.awsSdk.awsSdkStrings.STANDARD
  - java.lang.String
*/
type ExecutionClass = _ExecutionClass | String

type ExecutionTime = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MUST_EXIST
  - typings.awsSdk.awsSdkStrings.NOT_EXIST
  - typings.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type ExistCondition = _ExistCondition | String

type ExtendedString = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CRAWL_ID
  - typings.awsSdk.awsSdkStrings.STATE
  - typings.awsSdk.awsSdkStrings.START_TIME
  - typings.awsSdk.awsSdkStrings.END_TIME
  - typings.awsSdk.awsSdkStrings.DPU_HOUR
  - java.lang.String
*/
type FieldName = _FieldName | String

type FieldType = String

type FilterExpressions = js.Array[FilterExpression]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AND
  - typings.awsSdk.awsSdkStrings.OR
  - java.lang.String
*/
type FilterLogicalOperator = _FilterLogicalOperator | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EQ
  - typings.awsSdk.awsSdkStrings.LT
  - typings.awsSdk.awsSdkStrings.GT
  - typings.awsSdk.awsSdkStrings.LTE
  - typings.awsSdk.awsSdkStrings.GTE
  - typings.awsSdk.awsSdkStrings.REGEX
  - typings.awsSdk.awsSdkStrings.ISNULL
  - java.lang.String
*/
type FilterOperation = _FilterOperation | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GT
  - typings.awsSdk.awsSdkStrings.GE
  - typings.awsSdk.awsSdkStrings.LT
  - typings.awsSdk.awsSdkStrings.LE
  - typings.awsSdk.awsSdkStrings.EQ
  - typings.awsSdk.awsSdkStrings.NE
  - java.lang.String
*/
type FilterOperator = _FilterOperator | String

type FilterString = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COLUMNEXTRACTED
  - typings.awsSdk.awsSdkStrings.CONSTANT
  - java.lang.String
*/
type FilterValueType = _FilterValueType | String

type FilterValues = js.Array[FilterValue]

type FormatString = String

type Generic512CharString = String

type GenericBoundedDouble = scala.Double

type GenericLimitedString = String

type GenericMap = StringDictionary[GenericString]

type GenericString = String

type GetColumnNamesList = js.Array[NameString]

type GetResourcePoliciesResponseList = js.Array[GluePolicy]

type GetTableVersionsList = js.Array[TableVersion]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DATE
  - typings.awsSdk.awsSdkStrings.STRING
  - typings.awsSdk.awsSdkStrings.TIMESTAMP
  - typings.awsSdk.awsSdkStrings.INT
  - typings.awsSdk.awsSdkStrings.FLOAT
  - typings.awsSdk.awsSdkStrings.LONG
  - typings.awsSdk.awsSdkStrings.BIGDECIMAL
  - typings.awsSdk.awsSdkStrings.BYTE
  - typings.awsSdk.awsSdkStrings.SHORT
  - typings.awsSdk.awsSdkStrings.DOUBLE
  - java.lang.String
*/
type GlueRecordType = _GlueRecordType | String

type GlueResourceArn = String

type GlueSchemas = js.Array[GlueSchema]

type GlueStudioColumnNameString = String

type GlueStudioPathList = js.Array[EnclosedInStringProperties]

type GlueStudioSchemaColumnList = js.Array[GlueStudioSchemaColumn]

type GlueTables = js.Array[GlueTable]

type GlueVersionString = String

type GrokPattern = String

type HashString = String

type IdString = String

type Integer = scala.Double

type IntegerFlag = scala.Double

type IntegerValue = scala.Double

type IsVersionValid = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ARRAY
  - typings.awsSdk.awsSdkStrings.BIGINT
  - typings.awsSdk.awsSdkStrings.BINARY
  - typings.awsSdk.awsSdkStrings.BIT
  - typings.awsSdk.awsSdkStrings.BLOB
  - typings.awsSdk.awsSdkStrings.BOOLEAN
  - typings.awsSdk.awsSdkStrings.CHAR
  - typings.awsSdk.awsSdkStrings.CLOB
  - typings.awsSdk.awsSdkStrings.DATALINK
  - typings.awsSdk.awsSdkStrings.DATE
  - typings.awsSdk.awsSdkStrings.DECIMAL
  - typings.awsSdk.awsSdkStrings.DISTINCT
  - typings.awsSdk.awsSdkStrings.DOUBLE
  - typings.awsSdk.awsSdkStrings.FLOAT
  - typings.awsSdk.awsSdkStrings.INTEGER
  - typings.awsSdk.awsSdkStrings.JAVA_OBJECT
  - typings.awsSdk.awsSdkStrings.LONGNVARCHAR
  - typings.awsSdk.awsSdkStrings.LONGVARBINARY
  - typings.awsSdk.awsSdkStrings.LONGVARCHAR
  - typings.awsSdk.awsSdkStrings.NCHAR
  - typings.awsSdk.awsSdkStrings.NCLOB
  - typings.awsSdk.awsSdkStrings.NULL
  - typings.awsSdk.awsSdkStrings.NUMERIC
  - typings.awsSdk.awsSdkStrings.NVARCHAR
  - typings.awsSdk.awsSdkStrings.OTHER
  - typings.awsSdk.awsSdkStrings.REAL
  - typings.awsSdk.awsSdkStrings.REF
  - typings.awsSdk.awsSdkStrings.REF_CURSOR
  - typings.awsSdk.awsSdkStrings.ROWID
  - typings.awsSdk.awsSdkStrings.SMALLINT
  - typings.awsSdk.awsSdkStrings.SQLXML
  - typings.awsSdk.awsSdkStrings.STRUCT
  - typings.awsSdk.awsSdkStrings.TIME
  - typings.awsSdk.awsSdkStrings.TIME_WITH_TIMEZONE
  - typings.awsSdk.awsSdkStrings.TIMESTAMP
  - typings.awsSdk.awsSdkStrings.TIMESTAMP_WITH_TIMEZONE
  - typings.awsSdk.awsSdkStrings.TINYINT
  - typings.awsSdk.awsSdkStrings.VARBINARY
  - typings.awsSdk.awsSdkStrings.VARCHAR
  - java.lang.String
*/
type JDBCDataType = _JDBCDataType | String

type JDBCDataTypeMapping = StringDictionary[GlueRecordType]

type JdbcTargetList = js.Array[JdbcTarget]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DISABLED
  - typings.awsSdk.awsSdkStrings.`CSE-KMS`
  - java.lang.String
*/
type JobBookmarksEncryptionMode = _JobBookmarksEncryptionMode | String

type JobList = js.Array[Job]

type JobName = String

type JobNameList = js.Array[NameString]

type JobRunList = js.Array[JobRun]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STARTING
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.STOPPING
  - typings.awsSdk.awsSdkStrings.STOPPED
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.TIMEOUT
  - typings.awsSdk.awsSdkStrings.ERROR
  - typings.awsSdk.awsSdkStrings.WAITING
  - java.lang.String
*/
type JobRunState = _JobRunState | String

type JoinColumns = js.Array[JoinColumn]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.equijoin
  - typings.awsSdk.awsSdkStrings.left_
  - typings.awsSdk.awsSdkStrings.right_
  - typings.awsSdk.awsSdkStrings.outer_
  - typings.awsSdk.awsSdkStrings.leftsemi
  - typings.awsSdk.awsSdkStrings.leftanti
  - java.lang.String
*/
type JoinType = _JoinType | String

type JsonPath = String

type JsonValue = String

type KeyList = js.Array[NameString]

type KeySchemaElementList = js.Array[KeySchemaElement]

type KeyString = String

type KmsKeyArn = String

type LabelCount = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PYTHON
  - typings.awsSdk.awsSdkStrings.SCALA
  - java.lang.String
*/
type Language = _Language | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type LastCrawlStatus = _LastCrawlStatus | String

type LatestSchemaVersionBoolean = scala.Boolean

type LimitedPathList = js.Array[LimitedStringList]

type LimitedStringList = js.Array[GenericLimitedString]

type LocationMap = StringDictionary[ColumnValuesString]

type LocationString = String

type LocationStringList = js.Array[LocationString]

type LogGroup = String

type LogStream = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AND
  - typings.awsSdk.awsSdkStrings.ANY
  - java.lang.String
*/
type Logical = _Logical | String

type LogicalOperator = EQUALS | String

type Long = scala.Double

type LongValue = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DISABLED
  - typings.awsSdk.awsSdkStrings.`SSE-KMS`
  - java.lang.String
*/
type MLUserDataEncryptionModeString = _MLUserDataEncryptionModeString | String

type ManyInputs = js.Array[NodeId]

type MapValue = StringDictionary[GenericString]

type MappingList = js.Array[MappingEntry]

type Mappings = js.Array[Mapping]

type MaskValue = String

type MatchCriteria = js.Array[NameString]

type MaxConcurrentRuns = scala.Double

type MaxResultsNumber = scala.Double

type MaxRetries = scala.Double

type MessagePrefix = String

type MessageString = String

type MetadataInfoMap = StringDictionary[MetadataInfo]

type MetadataKeyString = String

type MetadataList = js.Array[MetadataKeyValuePair]

type MetadataValueString = String

type MillisecondsCount = scala.Double

type MongoDBTargetList = js.Array[MongoDBTarget]

type NameString = String

type NameStringList = js.Array[NameString]

type NodeId = String

type NodeIdList = js.Array[NameString]

type NodeList = js.Array[Node]

type NodeName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CRAWLER
  - typings.awsSdk.awsSdkStrings.JOB
  - typings.awsSdk.awsSdkStrings.TRIGGER
  - java.lang.String
*/
type NodeType = _NodeType | String

type NonNegativeDouble = scala.Double

type NonNegativeInt = scala.Double

type NonNegativeInteger = scala.Double

type NonNegativeLong = scala.Double

type NotifyDelayAfter = scala.Double

type NullValueFields = js.Array[NullValueField]

type NullableBoolean = scala.Boolean

type NullableDouble = scala.Double

type NullableInteger = scala.Double

type OneInput = js.Array[NodeId]

type OrchestrationArgumentsMap = StringDictionary[OrchestrationArgumentsValue]

type OrchestrationArgumentsValue = String

type OrchestrationIAMRoleArn = String

type OrchestrationNameString = String

type OrchestrationRoleArn = String

type OrchestrationS3Location = String

type OrchestrationStatementCodeString = String

type OrchestrationStringList = js.Array[GenericString]

type OrchestrationToken = String

type OrderList = js.Array[Order]

type OtherMetadataValueList = js.Array[OtherMetadataValueListItem]

type PageSize = scala.Double

type PaginationToken = String

type ParametersMap = StringDictionary[ParametersMapValue]

type ParametersMapValue = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.snappy__
  - typings.awsSdk.awsSdkStrings.lzo_
  - typings.awsSdk.awsSdkStrings.gzip__
  - typings.awsSdk.awsSdkStrings.uncompressed_
  - typings.awsSdk.awsSdkStrings.none__
  - java.lang.String
*/
type ParquetCompressionType = _ParquetCompressionType | String

type PartitionErrors = js.Array[PartitionError]

type PartitionIndexDescriptorList = js.Array[PartitionIndexDescriptor]

type PartitionIndexList = js.Array[PartitionIndex]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type PartitionIndexStatus = _PartitionIndexStatus | String

type PartitionInputList = js.Array[PartitionInput]

type PartitionList = js.Array[Partition]

type Path = String

type PathList = js.Array[Path]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALL
  - typings.awsSdk.awsSdkStrings.SELECT
  - typings.awsSdk.awsSdkStrings.ALTER
  - typings.awsSdk.awsSdkStrings.DROP
  - typings.awsSdk.awsSdkStrings.DELETE
  - typings.awsSdk.awsSdkStrings.INSERT
  - typings.awsSdk.awsSdkStrings.CREATE_DATABASE
  - typings.awsSdk.awsSdkStrings.CREATE_TABLE
  - typings.awsSdk.awsSdkStrings.DATA_LOCATION_ACCESS
  - java.lang.String
*/
type Permission = _Permission | String

type PermissionList = js.Array[Permission]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COLUMN_PERMISSION
  - typings.awsSdk.awsSdkStrings.CELL_FILTER_PERMISSION
  - java.lang.String
*/
type PermissionType = _PermissionType | String

type PermissionTypeList = js.Array[PermissionType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RowAudit
  - typings.awsSdk.awsSdkStrings.RowMasking
  - typings.awsSdk.awsSdkStrings.ColumnAudit
  - typings.awsSdk.awsSdkStrings.ColumnMasking
  - java.lang.String
*/
type PiiType = _PiiType | String

type PolicyJsonString = String

type PollingTime = scala.Double

type PositiveLong = scala.Double

type PredecessorList = js.Array[Predecessor]

type PredicateString = String

type PrincipalPermissionsList = js.Array[PrincipalPermissions]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.USER
  - typings.awsSdk.awsSdkStrings.ROLE
  - typings.awsSdk.awsSdkStrings.GROUP
  - java.lang.String
*/
type PrincipalType = _PrincipalType | String

type Prob = scala.Double

type PublicKeysList = js.Array[GenericString]

type PythonScript = String

type PythonVersionString = String

type QuerySchemaVersionMetadataMaxResults = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.quote
  - typings.awsSdk.awsSdkStrings.quillemet
  - typings.awsSdk.awsSdkStrings.single_quote_
  - typings.awsSdk.awsSdkStrings.disabled__
  - java.lang.String
*/
type QuoteChar = _QuoteChar | String

type RecordsCount = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CRAWL_EVERYTHING
  - typings.awsSdk.awsSdkStrings.CRAWL_NEW_FOLDERS_ONLY
  - typings.awsSdk.awsSdkStrings.CRAWL_EVENT_MODE
  - java.lang.String
*/
type RecrawlBehavior = _RecrawlBehavior | String

type RegistryListDefinition = js.Array[RegistryListItem]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type RegistryStatus = _RegistryStatus | String

type ReplaceBoolean = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FOREIGN
  - typings.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type ResourceShareType = _ResourceShareType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.JAR
  - typings.awsSdk.awsSdkStrings.FILE
  - typings.awsSdk.awsSdkStrings.ARCHIVE
  - java.lang.String
*/
type ResourceType = _ResourceType | String

type ResourceUriList = js.Array[ResourceUri]

type Role = String

type RoleArn = String

type RoleString = String

type RowTag = String

type RunId = String

type S3EncryptionList = js.Array[S3Encryption]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DISABLED
  - typings.awsSdk.awsSdkStrings.`SSE-KMS`
  - typings.awsSdk.awsSdkStrings.`SSE-S3`
  - java.lang.String
*/
type S3EncryptionMode = _S3EncryptionMode | String

type S3TargetList = js.Array[S3Target]

type ScalaCode = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SCHEDULED
  - typings.awsSdk.awsSdkStrings.NOT_SCHEDULED
  - typings.awsSdk.awsSdkStrings.TRANSITIONING
  - java.lang.String
*/
type ScheduleState = _ScheduleState | String

type SchemaCheckpointNumber = scala.Double

type SchemaDefinitionDiff = String

type SchemaDefinitionString = String

type SchemaDiffType = SYNTAX_DIFF | String

type SchemaListDefinition = js.Array[SchemaListItem]

type SchemaPathString = String

type SchemaRegistryNameString = String

type SchemaRegistryTokenString = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type SchemaStatus = _SchemaStatus | String

type SchemaValidationError = String

type SchemaVersionErrorList = js.Array[SchemaVersionErrorItem]

type SchemaVersionIdString = String

type SchemaVersionList = js.Array[SchemaVersionListItem]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.FAILURE
  - typings.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type SchemaVersionStatus = _SchemaVersionStatus | String

type ScriptLocationString = String

type SearchPropertyPredicates = js.Array[PropertyPredicate]

type SecurityConfigurationList = js.Array[SecurityConfiguration]

type SecurityGroupIdList = js.Array[NameString]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.comma
  - typings.awsSdk.awsSdkStrings.ctrla
  - typings.awsSdk.awsSdkStrings.pipe_
  - typings.awsSdk.awsSdkStrings.semicolon
  - typings.awsSdk.awsSdkStrings.tab
  - java.lang.String
*/
type Separator = _Separator | String

type SessionIdList = js.Array[NameString]

type SessionList = js.Array[Session]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PROVISIONING
  - typings.awsSdk.awsSdkStrings.READY
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.TIMEOUT
  - typings.awsSdk.awsSdkStrings.STOPPING
  - typings.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
type SessionStatus = _SessionStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASC
  - typings.awsSdk.awsSdkStrings.DESC
  - java.lang.String
*/
type Sort = _Sort | String

type SortCriteria = js.Array[SortCriterion]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DESCENDING
  - typings.awsSdk.awsSdkStrings.ASCENDING
  - java.lang.String
*/
type SortDirectionType = _SortDirectionType | String

type SqlAliases = js.Array[SqlAlias]

type SqlQuery = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.latest_
  - typings.awsSdk.awsSdkStrings.trim_horizon_
  - typings.awsSdk.awsSdkStrings.earliest_
  - java.lang.String
*/
type StartingPosition = _StartingPosition | String

type StatementList = js.Array[Statement]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.WAITING
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.CANCELLING
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - typings.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type StatementState = _StatementState | String

type StringList = js.Array[GenericString]

type TableErrors = js.Array[TableError]

type TableList = js.Array[Table]

type TableName = String

type TablePrefix = String

type TableTypeString = String

type TableVersionErrors = js.Array[TableVersionError]

type TagKey = String

type TagKeysList = js.Array[TagKey]

type TagValue = String

type TagsMap = StringDictionary[TagValue]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.json__
  - typings.awsSdk.awsSdkStrings.csv__
  - typings.awsSdk.awsSdkStrings.avro_
  - typings.awsSdk.awsSdkStrings.orc_
  - typings.awsSdk.awsSdkStrings.parquet__
  - java.lang.String
*/
type TargetFormat = _TargetFormat | String

type TaskRunList = js.Array[TaskRun]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TASK_RUN_TYPE
  - typings.awsSdk.awsSdkStrings.STATUS
  - typings.awsSdk.awsSdkStrings.STARTED
  - java.lang.String
*/
type TaskRunSortColumnType = _TaskRunSortColumnType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STARTING
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.STOPPING
  - typings.awsSdk.awsSdkStrings.STOPPED
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.TIMEOUT
  - java.lang.String
*/
type TaskStatusType = _TaskStatusType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EVALUATION
  - typings.awsSdk.awsSdkStrings.LABELING_SET_GENERATION
  - typings.awsSdk.awsSdkStrings.IMPORT_LABELS
  - typings.awsSdk.awsSdkStrings.EXPORT_LABELS
  - typings.awsSdk.awsSdkStrings.FIND_MATCHES
  - java.lang.String
*/
type TaskType = _TaskType | String

type Timeout = scala.Double

type Timestamp = js.Date

type TimestampValue = js.Date

type Token = String

type Topk = scala.Double

type TotalSegmentsInteger = scala.Double

type TransactionIdString = String

type TransformIdList = js.Array[HashString]

type TransformList = js.Array[MLTransform]

type TransformSchema = js.Array[SchemaColumn]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NAME
  - typings.awsSdk.awsSdkStrings.TRANSFORM_TYPE
  - typings.awsSdk.awsSdkStrings.STATUS
  - typings.awsSdk.awsSdkStrings.CREATED
  - typings.awsSdk.awsSdkStrings.LAST_MODIFIED
  - java.lang.String
*/
type TransformSortColumnType = _TransformSortColumnType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NOT_READY
  - typings.awsSdk.awsSdkStrings.READY
  - typings.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type TransformStatusType = _TransformStatusType | String

type TransformType = FIND_MATCHES | String

type TriggerList = js.Array[Trigger]

type TriggerNameList = js.Array[NameString]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.CREATED
  - typings.awsSdk.awsSdkStrings.ACTIVATING
  - typings.awsSdk.awsSdkStrings.ACTIVATED
  - typings.awsSdk.awsSdkStrings.DEACTIVATING
  - typings.awsSdk.awsSdkStrings.DEACTIVATED
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.UPDATING
  - java.lang.String
*/
type TriggerState = _TriggerState | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SCHEDULED
  - typings.awsSdk.awsSdkStrings.CONDITIONAL
  - typings.awsSdk.awsSdkStrings.ON_DEMAND
  - typings.awsSdk.awsSdkStrings.EVENT
  - java.lang.String
*/
type TriggerType = _TriggerType | String

type TwoInputs = js.Array[NodeId]

type TypeString = String

type URI = String

type UnfilteredPartitionList = js.Array[UnfilteredPartition]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALL
  - typings.awsSdk.awsSdkStrings.DISTINCT
  - java.lang.String
*/
type UnionType = _UnionType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LOG
  - typings.awsSdk.awsSdkStrings.UPDATE_IN_DATABASE
  - java.lang.String
*/
type UpdateBehavior = _UpdateBehavior | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UPDATE_IN_DATABASE
  - typings.awsSdk.awsSdkStrings.LOG
  - java.lang.String
*/
type UpdateCatalogBehavior = _UpdateCatalogBehavior | String

type UpdateColumnStatisticsList = js.Array[ColumnStatistics]

type UpdatedTimestamp = String

type UriString = String

type UserDefinedFunctionList = js.Array[UserDefinedFunction]

type ValueString = String

type ValueStringList = js.Array[ValueString]

type VersionId = scala.Double

type VersionLongNumber = scala.Double

type VersionString = String

type VersionsString = String

type ViewTextString = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Standard_
  - typings.awsSdk.awsSdkStrings.GDot1X
  - typings.awsSdk.awsSdkStrings.GDot2X
  - typings.awsSdk.awsSdkStrings.GDot025X
  - java.lang.String
*/
type WorkerType = _WorkerType | String

type WorkflowNames = js.Array[NameString]

type WorkflowRunProperties = StringDictionary[GenericString]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.STOPPING
  - typings.awsSdk.awsSdkStrings.STOPPED
  - typings.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type WorkflowRunStatus = _WorkflowRunStatus | String

type WorkflowRuns = js.Array[WorkflowRun]

type Workflows = js.Array[Workflow]

type _Blob = Buffer | js.typedarray.Uint8Array | Blob | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-03-31`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
