package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.GROUP_NAME
import typings.awsSdk.awsSdkStrings.INTERNAL_FAILURE
import typings.awsSdk.awsSdkStrings.PARENT_FOLDER_ARN
import typings.awsSdk.awsSdkStrings.QUICKSIGHT
import typings.awsSdk.awsSdkStrings.QUICKSIGHT_USER
import typings.awsSdk.awsSdkStrings.SHARED
import typings.awsSdk.awsSdkStrings.StartsWith
import typings.awsSdk.awsSdkStrings.StringEquals_
import typings.awsSdk.awsSdkStrings.US
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ActionList = js.Array[String]

type ActiveIAMPolicyAssignmentList = js.Array[ActiveIAMPolicyAssignment]

type AdditionalDashboardIdList = js.Array[RestrictiveResourceId]

type AliasName = java.lang.String

type AnalysisErrorList = js.Array[AnalysisError]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACCESS_DENIED
  - typings.awsSdk.awsSdkStrings.SOURCE_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.DATA_SET_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.INTERNAL_FAILURE
  - typings.awsSdk.awsSdkStrings.PARAMETER_VALUE_INCOMPATIBLE
  - typings.awsSdk.awsSdkStrings.PARAMETER_TYPE_INVALID
  - typings.awsSdk.awsSdkStrings.PARAMETER_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.COLUMN_TYPE_MISMATCH
  - typings.awsSdk.awsSdkStrings.COLUMN_GEOGRAPHIC_ROLE_MISMATCH
  - typings.awsSdk.awsSdkStrings.COLUMN_REPLACEMENT_MISSING
  - java.lang.String
*/
type AnalysisErrorType = _AnalysisErrorType | java.lang.String

type AnalysisFilterAttribute = QUICKSIGHT_USER | java.lang.String

type AnalysisName = java.lang.String

type AnalysisSearchFilterList = js.Array[AnalysisSearchFilter]

type AnalysisSummaryList = js.Array[AnalysisSummary]

type Arn = java.lang.String

type ArnList = js.Array[Arn]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DRAFT
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type AssignmentStatus = _AssignmentStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IAM_AND_QUICKSIGHT
  - typings.awsSdk.awsSdkStrings.IAM_ONLY
  - typings.awsSdk.awsSdkStrings.ACTIVE_DIRECTORY
  - java.lang.String
*/
type AuthenticationMethodOption = _AuthenticationMethodOption | java.lang.String

type AwsAccountId = java.lang.String

type AwsAndAccountId = java.lang.String

type Boolean = scala.Boolean

type CIDR = java.lang.String

type CalculatedColumnList = js.Array[CalculatedColumn]

type Catalog = java.lang.String

type ClusterId = java.lang.String

type ColorList = js.Array[HexColor]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STRING
  - typings.awsSdk.awsSdkStrings.INTEGER
  - typings.awsSdk.awsSdkStrings.DECIMAL
  - typings.awsSdk.awsSdkStrings.DATETIME
  - java.lang.String
*/
type ColumnDataType = _ColumnDataType | java.lang.String

type ColumnDescriptiveText = java.lang.String

type ColumnGroupColumnSchemaList = js.Array[ColumnGroupColumnSchema]

type ColumnGroupList = js.Array[ColumnGroup]

type ColumnGroupName = java.lang.String

type ColumnGroupSchemaList = js.Array[ColumnGroupSchema]

type ColumnId = java.lang.String

type ColumnLevelPermissionRuleList = js.Array[ColumnLevelPermissionRule]

type ColumnList = js.Array[ColumnName]

type ColumnName = java.lang.String

type ColumnNameList = js.Array[String]

type ColumnSchemaList = js.Array[ColumnSchema]

type ColumnTagList = js.Array[ColumnTag]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COLUMN_GEOGRAPHIC_ROLE
  - typings.awsSdk.awsSdkStrings.COLUMN_DESCRIPTION
  - java.lang.String
*/
type ColumnTagName = _ColumnTagName | java.lang.String

type ColumnTagNames = js.Array[ColumnTagName]

type CopySourceArn = java.lang.String

type CustomSqlName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type DashboardBehavior = _DashboardBehavior | java.lang.String

type DashboardErrorList = js.Array[DashboardError]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACCESS_DENIED
  - typings.awsSdk.awsSdkStrings.SOURCE_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.DATA_SET_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.INTERNAL_FAILURE
  - typings.awsSdk.awsSdkStrings.PARAMETER_VALUE_INCOMPATIBLE
  - typings.awsSdk.awsSdkStrings.PARAMETER_TYPE_INVALID
  - typings.awsSdk.awsSdkStrings.PARAMETER_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.COLUMN_TYPE_MISMATCH
  - typings.awsSdk.awsSdkStrings.COLUMN_GEOGRAPHIC_ROLE_MISMATCH
  - typings.awsSdk.awsSdkStrings.COLUMN_REPLACEMENT_MISSING
  - java.lang.String
*/
type DashboardErrorType = _DashboardErrorType | java.lang.String

type DashboardFilterAttribute = QUICKSIGHT_USER | java.lang.String

type DashboardName = java.lang.String

type DashboardSearchFilterList = js.Array[DashboardSearchFilter]

type DashboardSummaryList = js.Array[DashboardSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EXPANDED
  - typings.awsSdk.awsSdkStrings.COLLAPSED
  - java.lang.String
*/
type DashboardUIState = _DashboardUIState | java.lang.String

type DashboardVersionSummaryList = js.Array[DashboardVersionSummary]

type DataSetArnsList = js.Array[Arn]

type DataSetConfigurationList = js.Array[DataSetConfiguration]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SPICE
  - typings.awsSdk.awsSdkStrings.DIRECT_QUERY
  - java.lang.String
*/
type DataSetImportMode = _DataSetImportMode | java.lang.String

type DataSetName = java.lang.String

type DataSetReferenceList = js.Array[DataSetReference]

type DataSetSummaryList = js.Array[DataSetSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACCESS_DENIED
  - typings.awsSdk.awsSdkStrings.COPY_SOURCE_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.TIMEOUT
  - typings.awsSdk.awsSdkStrings.ENGINE_VERSION_NOT_SUPPORTED
  - typings.awsSdk.awsSdkStrings.UNKNOWN_HOST
  - typings.awsSdk.awsSdkStrings.GENERIC_SQL_FAILURE
  - typings.awsSdk.awsSdkStrings.CONFLICT
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type DataSourceErrorInfoType = _DataSourceErrorInfoType | java.lang.String

type DataSourceList = js.Array[DataSource]

type DataSourceParametersList = js.Array[DataSourceParameters]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ADOBE_ANALYTICS
  - typings.awsSdk.awsSdkStrings.AMAZON_ELASTICSEARCH
  - typings.awsSdk.awsSdkStrings.ATHENA
  - typings.awsSdk.awsSdkStrings.AURORA
  - typings.awsSdk.awsSdkStrings.AURORA_POSTGRESQL
  - typings.awsSdk.awsSdkStrings.AWS_IOT_ANALYTICS
  - typings.awsSdk.awsSdkStrings.GITHUB
  - typings.awsSdk.awsSdkStrings.JIRA
  - typings.awsSdk.awsSdkStrings.MARIADB
  - typings.awsSdk.awsSdkStrings.MYSQL
  - typings.awsSdk.awsSdkStrings.ORACLE
  - typings.awsSdk.awsSdkStrings.POSTGRESQL
  - typings.awsSdk.awsSdkStrings.PRESTO
  - typings.awsSdk.awsSdkStrings.REDSHIFT
  - typings.awsSdk.awsSdkStrings.S3
  - typings.awsSdk.awsSdkStrings.SALESFORCE
  - typings.awsSdk.awsSdkStrings.SERVICENOW
  - typings.awsSdk.awsSdkStrings.SNOWFLAKE
  - typings.awsSdk.awsSdkStrings.SPARK
  - typings.awsSdk.awsSdkStrings.SQLSERVER
  - typings.awsSdk.awsSdkStrings.TERADATA
  - typings.awsSdk.awsSdkStrings.TWITTER
  - typings.awsSdk.awsSdkStrings.TIMESTREAM
  - typings.awsSdk.awsSdkStrings.AMAZON_OPENSEARCH
  - typings.awsSdk.awsSdkStrings.EXASOL
  - java.lang.String
*/
type DataSourceType = _DataSourceType | java.lang.String

type Database = java.lang.String

type DateTimeParameterList = js.Array[DateTimeParameter]

type DecimalParameterList = js.Array[DecimalParameter]

type Delimiter = java.lang.String

type Domain = java.lang.String

type Double = scala.Double

type DoubleList = js.Array[Double]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STANDARD
  - typings.awsSdk.awsSdkStrings.ENTERPRISE
  - typings.awsSdk.awsSdkStrings.ENTERPRISE_AND_Q
  - java.lang.String
*/
type Edition = _Edition | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IAM
  - typings.awsSdk.awsSdkStrings.QUICKSIGHT
  - typings.awsSdk.awsSdkStrings.ANONYMOUS
  - java.lang.String
*/
type EmbeddingIdentityType = _EmbeddingIdentityType | java.lang.String

type EmbeddingUrl = java.lang.String

type EntryPath = java.lang.String

type EntryPoint = java.lang.String

type Expression = java.lang.String

type FieldFolderDescription = java.lang.String

type FieldFolderMap = StringDictionary[FieldFolder]

type FieldFolderPath = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CSV
  - typings.awsSdk.awsSdkStrings.TSV
  - typings.awsSdk.awsSdkStrings.CLF
  - typings.awsSdk.awsSdkStrings.ELF
  - typings.awsSdk.awsSdkStrings.XLSX
  - typings.awsSdk.awsSdkStrings.JSON
  - java.lang.String
*/
type FileFormat = _FileFormat | java.lang.String

type FilterOperator = StringEquals_ | java.lang.String

type FolderColumnList = js.Array[String]

type FolderFilterAttribute = PARENT_FOLDER_ARN | java.lang.String

type FolderMemberList = js.Array[MemberIdArnPair]

type FolderName = java.lang.String

type FolderSearchFilterList = js.Array[FolderSearchFilter]

type FolderSummaryList = js.Array[FolderSummary]

type FolderType = SHARED | java.lang.String

type GeoSpatialCountryCode = US | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COUNTRY
  - typings.awsSdk.awsSdkStrings.STATE
  - typings.awsSdk.awsSdkStrings.COUNTY
  - typings.awsSdk.awsSdkStrings.CITY
  - typings.awsSdk.awsSdkStrings.POSTCODE
  - typings.awsSdk.awsSdkStrings.LONGITUDE
  - typings.awsSdk.awsSdkStrings.LATITUDE
  - java.lang.String
*/
type GeoSpatialDataRole = _GeoSpatialDataRole | java.lang.String

type GroupDescription = java.lang.String

type GroupFilterAttribute = GROUP_NAME | java.lang.String

type GroupFilterOperator = StartsWith | java.lang.String

type GroupList = js.Array[Group]

type GroupMemberList = js.Array[GroupMember]

type GroupMemberName = java.lang.String

type GroupName = java.lang.String

type GroupSearchFilterList = js.Array[GroupSearchFilter]

type GroupsList = js.Array[String]

type HexColor = java.lang.String

type Host = java.lang.String

type IAMPolicyAssignmentName = java.lang.String

type IAMPolicyAssignmentSummaryList = js.Array[IAMPolicyAssignmentSummary]

type IdentityMap = StringDictionary[IdentityNameList]

type IdentityName = java.lang.String

type IdentityNameList = js.Array[IdentityName]

type IdentityStore = QUICKSIGHT | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IAM
  - typings.awsSdk.awsSdkStrings.QUICKSIGHT
  - java.lang.String
*/
type IdentityType = _IdentityType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FAILURE_TO_ASSUME_ROLE
  - typings.awsSdk.awsSdkStrings.INGESTION_SUPERSEDED
  - typings.awsSdk.awsSdkStrings.INGESTION_CANCELED
  - typings.awsSdk.awsSdkStrings.DATA_SET_DELETED
  - typings.awsSdk.awsSdkStrings.DATA_SET_NOT_SPICE
  - typings.awsSdk.awsSdkStrings.S3_UPLOADED_FILE_DELETED
  - typings.awsSdk.awsSdkStrings.S3_MANIFEST_ERROR
  - typings.awsSdk.awsSdkStrings.DATA_TOLERANCE_EXCEPTION
  - typings.awsSdk.awsSdkStrings.SPICE_TABLE_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.DATA_SET_SIZE_LIMIT_EXCEEDED
  - typings.awsSdk.awsSdkStrings.ROW_SIZE_LIMIT_EXCEEDED
  - typings.awsSdk.awsSdkStrings.ACCOUNT_CAPACITY_LIMIT_EXCEEDED
  - typings.awsSdk.awsSdkStrings.CUSTOMER_ERROR
  - typings.awsSdk.awsSdkStrings.DATA_SOURCE_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.IAM_ROLE_NOT_AVAILABLE
  - typings.awsSdk.awsSdkStrings.CONNECTION_FAILURE
  - typings.awsSdk.awsSdkStrings.SQL_TABLE_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.PERMISSION_DENIED
  - typings.awsSdk.awsSdkStrings.SSL_CERTIFICATE_VALIDATION_FAILURE
  - typings.awsSdk.awsSdkStrings.OAUTH_TOKEN_FAILURE
  - typings.awsSdk.awsSdkStrings.SOURCE_API_LIMIT_EXCEEDED_FAILURE
  - typings.awsSdk.awsSdkStrings.PASSWORD_AUTHENTICATION_FAILURE
  - typings.awsSdk.awsSdkStrings.SQL_SCHEMA_MISMATCH_ERROR
  - typings.awsSdk.awsSdkStrings.INVALID_DATE_FORMAT
  - typings.awsSdk.awsSdkStrings.INVALID_DATAPREP_SYNTAX
  - typings.awsSdk.awsSdkStrings.SOURCE_RESOURCE_LIMIT_EXCEEDED
  - typings.awsSdk.awsSdkStrings.SQL_INVALID_PARAMETER_VALUE
  - typings.awsSdk.awsSdkStrings.QUERY_TIMEOUT
  - typings.awsSdk.awsSdkStrings.SQL_NUMERIC_OVERFLOW
  - typings.awsSdk.awsSdkStrings.UNRESOLVABLE_HOST
  - typings.awsSdk.awsSdkStrings.UNROUTABLE_HOST
  - typings.awsSdk.awsSdkStrings.SQL_EXCEPTION
  - typings.awsSdk.awsSdkStrings.S3_FILE_INACCESSIBLE
  - typings.awsSdk.awsSdkStrings.IOT_FILE_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.IOT_DATA_SET_FILE_EMPTY
  - typings.awsSdk.awsSdkStrings.INVALID_DATA_SOURCE_CONFIG
  - typings.awsSdk.awsSdkStrings.DATA_SOURCE_AUTH_FAILED
  - typings.awsSdk.awsSdkStrings.DATA_SOURCE_CONNECTION_FAILED
  - typings.awsSdk.awsSdkStrings.FAILURE_TO_PROCESS_JSON_FILE
  - typings.awsSdk.awsSdkStrings.INTERNAL_SERVICE_ERROR
  - typings.awsSdk.awsSdkStrings.REFRESH_SUPPRESSED_BY_EDIT
  - typings.awsSdk.awsSdkStrings.PERMISSION_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.ELASTICSEARCH_CURSOR_NOT_ENABLED
  - typings.awsSdk.awsSdkStrings.CURSOR_NOT_ENABLED
  - java.lang.String
*/
type IngestionErrorType = _IngestionErrorType | java.lang.String

type IngestionId = java.lang.String

type IngestionMaxResults = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MANUAL
  - typings.awsSdk.awsSdkStrings.SCHEDULED
  - java.lang.String
*/
type IngestionRequestSource = _IngestionRequestSource | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INITIAL_INGESTION
  - typings.awsSdk.awsSdkStrings.EDIT
  - typings.awsSdk.awsSdkStrings.INCREMENTAL_REFRESH
  - typings.awsSdk.awsSdkStrings.FULL_REFRESH
  - java.lang.String
*/
type IngestionRequestType = _IngestionRequestType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INITIALIZED
  - typings.awsSdk.awsSdkStrings.QUEUED
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - java.lang.String
*/
type IngestionStatus = _IngestionStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INCREMENTAL_REFRESH
  - typings.awsSdk.awsSdkStrings.FULL_REFRESH
  - java.lang.String
*/
type IngestionType = _IngestionType | java.lang.String

type Ingestions = js.Array[Ingestion]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STRING
  - typings.awsSdk.awsSdkStrings.INTEGER
  - typings.awsSdk.awsSdkStrings.DECIMAL
  - typings.awsSdk.awsSdkStrings.DATETIME
  - typings.awsSdk.awsSdkStrings.BIT
  - typings.awsSdk.awsSdkStrings.BOOLEAN
  - typings.awsSdk.awsSdkStrings.JSON
  - java.lang.String
*/
type InputColumnDataType = _InputColumnDataType | java.lang.String

type InputColumnList = js.Array[InputColumn]

type InstanceId = java.lang.String

type IntegerParameterList = js.Array[IntegerParameter]

type IpRestrictionRuleDescription = java.lang.String

type IpRestrictionRuleMap = StringDictionary[IpRestrictionRuleDescription]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INNER
  - typings.awsSdk.awsSdkStrings.OUTER
  - typings.awsSdk.awsSdkStrings.LEFT
  - typings.awsSdk.awsSdkStrings.RIGHT
  - java.lang.String
*/
type JoinType = _JoinType | java.lang.String

type LogicalTableAlias = java.lang.String

type LogicalTableId = java.lang.String

type LogicalTableMap = StringDictionary[LogicalTable]

type Long = scala.Double

type LongList = js.Array[Long]

type MaxResults = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DASHBOARD
  - typings.awsSdk.awsSdkStrings.ANALYSIS
  - typings.awsSdk.awsSdkStrings.DATASET
  - java.lang.String
*/
type MemberType = _MemberType | java.lang.String

type Namespace = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PERMISSION_DENIED
  - typings.awsSdk.awsSdkStrings.INTERNAL_SERVICE_ERROR
  - java.lang.String
*/
type NamespaceErrorType = _NamespaceErrorType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATED
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.RETRYABLE_FAILURE
  - typings.awsSdk.awsSdkStrings.NON_RETRYABLE_FAILURE
  - java.lang.String
*/
type NamespaceStatus = _NamespaceStatus | java.lang.String

type Namespaces = js.Array[NamespaceInfoV2]

type NonEmptyString = java.lang.String

type NullableBoolean = scala.Boolean

type OnClause = java.lang.String

type OptionalPort = scala.Double

type OutputColumnList = js.Array[OutputColumn]

type Password = java.lang.String

type Path = js.Array[Arn]

type PhysicalTableId = java.lang.String

type PhysicalTableMap = StringDictionary[PhysicalTable]

type Port = scala.Double

type PositiveInteger = scala.Double

type Principal = java.lang.String

type PrincipalList = js.Array[String]

type ProjectedColumnList = js.Array[String]

type Query = java.lang.String

type RecoveryWindowInDays = scala.Double

type RelationalTableCatalog = java.lang.String

type RelationalTableName = java.lang.String

type RelationalTableSchema = java.lang.String

type ResourceId = java.lang.String

type ResourceName = java.lang.String

type ResourcePermissionList = js.Array[ResourcePermission]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATION_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.CREATION_SUCCESSFUL
  - typings.awsSdk.awsSdkStrings.CREATION_FAILED
  - typings.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.UPDATE_SUCCESSFUL
  - typings.awsSdk.awsSdkStrings.UPDATE_FAILED
  - typings.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type ResourceStatus = _ResourceStatus | java.lang.String

type RestrictiveResourceId = java.lang.String

type RoleName = java.lang.String

type RoleSessionName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.VERSION_1
  - typings.awsSdk.awsSdkStrings.VERSION_2
  - java.lang.String
*/
type RowLevelPermissionFormatVersion = _RowLevelPermissionFormatVersion | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GRANT_ACCESS
  - typings.awsSdk.awsSdkStrings.DENY_ACCESS
  - java.lang.String
*/
type RowLevelPermissionPolicy = _RowLevelPermissionPolicy | java.lang.String

type RowLevelPermissionTagDelimiter = java.lang.String

type RowLevelPermissionTagRuleList = js.Array[RowLevelPermissionTagRule]

type S3Bucket = java.lang.String

type S3Key = java.lang.String

type SessionLifetimeInMinutes = scala.Double

type SessionTagKey = java.lang.String

type SessionTagList = js.Array[SessionTag]

type SessionTagValue = java.lang.String

type SheetList = js.Array[Sheet]

type SiteBaseUrl = java.lang.String

type SqlQuery = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type Status = _Status | java.lang.String

type StatusCode = scala.Double

type String = java.lang.String

type StringList = js.Array[String]

type StringParameterList = js.Array[StringParameter]

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type TemplateAliasList = js.Array[TemplateAlias]

type TemplateErrorList = js.Array[TemplateError]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SOURCE_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.DATA_SET_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.INTERNAL_FAILURE
  - typings.awsSdk.awsSdkStrings.ACCESS_DENIED
  - java.lang.String
*/
type TemplateErrorType = _TemplateErrorType | java.lang.String

type TemplateName = java.lang.String

type TemplateSummaryList = js.Array[TemplateSummary]

type TemplateVersionSummaryList = js.Array[TemplateVersionSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DOUBLE_QUOTE
  - typings.awsSdk.awsSdkStrings.SINGLE_QUOTE
  - java.lang.String
*/
type TextQualifier = _TextQualifier | java.lang.String

type ThemeAliasList = js.Array[ThemeAlias]

type ThemeErrorList = js.Array[ThemeError]

type ThemeErrorType = INTERNAL_FAILURE | java.lang.String

type ThemeName = java.lang.String

type ThemeSummaryList = js.Array[ThemeSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.QUICKSIGHT
  - typings.awsSdk.awsSdkStrings.CUSTOM
  - typings.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type ThemeType = _ThemeType | java.lang.String

type ThemeVersionSummaryList = js.Array[ThemeVersionSummary]

type Timestamp = js.Date

type TimestampList = js.Array[js.Date]

type TransformOperationList = js.Array[TransformOperation]

type TypeCastFormat = java.lang.String

type UpdateLinkPermissionList = js.Array[ResourcePermission]

type UpdateResourcePermissionList = js.Array[ResourcePermission]

type UserList = js.Array[User]

type UserName_ = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ADMIN
  - typings.awsSdk.awsSdkStrings.AUTHOR
  - typings.awsSdk.awsSdkStrings.READER
  - typings.awsSdk.awsSdkStrings.RESTRICTED_AUTHOR
  - typings.awsSdk.awsSdkStrings.RESTRICTED_READER
  - java.lang.String
*/
type UserRole = _UserRole | java.lang.String

type Username = java.lang.String

type VersionDescription = java.lang.String

type VersionNumber = scala.Double

type Warehouse = java.lang.String

type WorkGroup = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2018-04-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
