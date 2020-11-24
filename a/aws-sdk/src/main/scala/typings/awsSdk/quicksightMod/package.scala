package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object quicksightMod {
  
  type ActionList = js.Array[typings.awsSdk.quicksightMod.String]
  
  type ActiveIAMPolicyAssignmentList = js.Array[typings.awsSdk.quicksightMod.ActiveIAMPolicyAssignment]
  
  type AliasName = java.lang.String
  
  type AnalysisErrorList = js.Array[typings.awsSdk.quicksightMod.AnalysisError]
  
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
  type AnalysisErrorType = typings.awsSdk.quicksightMod._AnalysisErrorType | java.lang.String
  
  type AnalysisFilterAttribute = typings.awsSdk.awsSdkStrings.QUICKSIGHT_USER | java.lang.String
  
  type AnalysisName = java.lang.String
  
  type AnalysisSearchFilterList = js.Array[typings.awsSdk.quicksightMod.AnalysisSearchFilter]
  
  type AnalysisSummaryList = js.Array[typings.awsSdk.quicksightMod.AnalysisSummary]
  
  type Arn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DRAFT
    - typings.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type AssignmentStatus = typings.awsSdk.quicksightMod._AssignmentStatus | java.lang.String
  
  type AwsAccountId = java.lang.String
  
  type AwsAndAccountId = java.lang.String
  
  type Boolean = scala.Boolean
  
  type CalculatedColumnList = js.Array[typings.awsSdk.quicksightMod.CalculatedColumn]
  
  type Catalog = java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.quicksightMod.ClientApiVersions
  
  type ClusterId = java.lang.String
  
  type ColorList = js.Array[typings.awsSdk.quicksightMod.HexColor]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.STRING
    - typings.awsSdk.awsSdkStrings.INTEGER
    - typings.awsSdk.awsSdkStrings.DECIMAL
    - typings.awsSdk.awsSdkStrings.DATETIME
    - java.lang.String
  */
  type ColumnDataType = typings.awsSdk.quicksightMod._ColumnDataType | java.lang.String
  
  type ColumnDescriptiveText = java.lang.String
  
  type ColumnGroupColumnSchemaList = js.Array[typings.awsSdk.quicksightMod.ColumnGroupColumnSchema]
  
  type ColumnGroupList = js.Array[typings.awsSdk.quicksightMod.ColumnGroup]
  
  type ColumnGroupName = java.lang.String
  
  type ColumnGroupSchemaList = js.Array[typings.awsSdk.quicksightMod.ColumnGroupSchema]
  
  type ColumnId = java.lang.String
  
  type ColumnLevelPermissionRuleList = js.Array[typings.awsSdk.quicksightMod.ColumnLevelPermissionRule]
  
  type ColumnList = js.Array[typings.awsSdk.quicksightMod.ColumnName]
  
  type ColumnName = java.lang.String
  
  type ColumnNameList = js.Array[typings.awsSdk.quicksightMod.String]
  
  type ColumnSchemaList = js.Array[typings.awsSdk.quicksightMod.ColumnSchema]
  
  type ColumnTagList = js.Array[typings.awsSdk.quicksightMod.ColumnTag]
  
  type CopySourceArn = java.lang.String
  
  type CustomSqlName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type DashboardBehavior = typings.awsSdk.quicksightMod._DashboardBehavior | java.lang.String
  
  type DashboardErrorList = js.Array[typings.awsSdk.quicksightMod.DashboardError]
  
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
  type DashboardErrorType = typings.awsSdk.quicksightMod._DashboardErrorType | java.lang.String
  
  type DashboardFilterAttribute = typings.awsSdk.awsSdkStrings.QUICKSIGHT_USER | java.lang.String
  
  type DashboardName = java.lang.String
  
  type DashboardSearchFilterList = js.Array[typings.awsSdk.quicksightMod.DashboardSearchFilter]
  
  type DashboardSummaryList = js.Array[typings.awsSdk.quicksightMod.DashboardSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.EXPANDED
    - typings.awsSdk.awsSdkStrings.COLLAPSED
    - java.lang.String
  */
  type DashboardUIState = typings.awsSdk.quicksightMod._DashboardUIState | java.lang.String
  
  type DashboardVersionSummaryList = js.Array[typings.awsSdk.quicksightMod.DashboardVersionSummary]
  
  type DataSetArnsList = js.Array[typings.awsSdk.quicksightMod.Arn]
  
  type DataSetConfigurationList = js.Array[typings.awsSdk.quicksightMod.DataSetConfiguration]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SPICE
    - typings.awsSdk.awsSdkStrings.DIRECT_QUERY
    - java.lang.String
  */
  type DataSetImportMode = typings.awsSdk.quicksightMod._DataSetImportMode | java.lang.String
  
  type DataSetName = java.lang.String
  
  type DataSetReferenceList = js.Array[typings.awsSdk.quicksightMod.DataSetReference]
  
  type DataSetSummaryList = js.Array[typings.awsSdk.quicksightMod.DataSetSummary]
  
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
  type DataSourceErrorInfoType = typings.awsSdk.quicksightMod._DataSourceErrorInfoType | java.lang.String
  
  type DataSourceList = js.Array[typings.awsSdk.quicksightMod.DataSource]
  
  type DataSourceParametersList = js.Array[typings.awsSdk.quicksightMod.DataSourceParameters]
  
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
    - java.lang.String
  */
  type DataSourceType = typings.awsSdk.quicksightMod._DataSourceType | java.lang.String
  
  type Database = java.lang.String
  
  type DateTimeParameterList = js.Array[typings.awsSdk.quicksightMod.DateTimeParameter]
  
  type DecimalParameterList = js.Array[typings.awsSdk.quicksightMod.DecimalParameter]
  
  type Delimiter = java.lang.String
  
  type Domain = java.lang.String
  
  type Double = scala.Double
  
  type DoubleList = js.Array[typings.awsSdk.quicksightMod.Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.STANDARD
    - typings.awsSdk.awsSdkStrings.ENTERPRISE
    - java.lang.String
  */
  type Edition = typings.awsSdk.quicksightMod._Edition | java.lang.String
  
  type EmbeddingUrl = java.lang.String
  
  type EntryPoint = java.lang.String
  
  type Expression = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CSV
    - typings.awsSdk.awsSdkStrings.TSV
    - typings.awsSdk.awsSdkStrings.CLF
    - typings.awsSdk.awsSdkStrings.ELF
    - typings.awsSdk.awsSdkStrings.XLSX
    - typings.awsSdk.awsSdkStrings.JSON
    - java.lang.String
  */
  type FileFormat = typings.awsSdk.quicksightMod._FileFormat | java.lang.String
  
  type FilterOperator = typings.awsSdk.awsSdkStrings.StringEquals_ | java.lang.String
  
  type GeoSpatialCountryCode = typings.awsSdk.awsSdkStrings.US | java.lang.String
  
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
  type GeoSpatialDataRole = typings.awsSdk.quicksightMod._GeoSpatialDataRole | java.lang.String
  
  type GroupDescription = java.lang.String
  
  type GroupList = js.Array[typings.awsSdk.quicksightMod.Group]
  
  type GroupMemberList = js.Array[typings.awsSdk.quicksightMod.GroupMember]
  
  type GroupMemberName = java.lang.String
  
  type GroupName = java.lang.String
  
  type HexColor = java.lang.String
  
  type Host = java.lang.String
  
  type IAMPolicyAssignmentName = java.lang.String
  
  type IAMPolicyAssignmentSummaryList = js.Array[typings.awsSdk.quicksightMod.IAMPolicyAssignmentSummary]
  
  type IdentityMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.quicksightMod.IdentityNameList]
  
  type IdentityName = java.lang.String
  
  type IdentityNameList = js.Array[typings.awsSdk.quicksightMod.IdentityName]
  
  type IdentityStore = typings.awsSdk.awsSdkStrings.QUICKSIGHT | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IAM
    - typings.awsSdk.awsSdkStrings.QUICKSIGHT
    - java.lang.String
  */
  type IdentityType = typings.awsSdk.quicksightMod._IdentityType | java.lang.String
  
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
    - java.lang.String
  */
  type IngestionErrorType = typings.awsSdk.quicksightMod._IngestionErrorType | java.lang.String
  
  type IngestionId = java.lang.String
  
  type IngestionMaxResults = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.MANUAL
    - typings.awsSdk.awsSdkStrings.SCHEDULED
    - java.lang.String
  */
  type IngestionRequestSource = typings.awsSdk.quicksightMod._IngestionRequestSource | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INITIAL_INGESTION
    - typings.awsSdk.awsSdkStrings.EDIT
    - typings.awsSdk.awsSdkStrings.INCREMENTAL_REFRESH
    - typings.awsSdk.awsSdkStrings.FULL_REFRESH
    - java.lang.String
  */
  type IngestionRequestType = typings.awsSdk.quicksightMod._IngestionRequestType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INITIALIZED
    - typings.awsSdk.awsSdkStrings.QUEUED
    - typings.awsSdk.awsSdkStrings.RUNNING
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.COMPLETED
    - typings.awsSdk.awsSdkStrings.CANCELLED
    - java.lang.String
  */
  type IngestionStatus = typings.awsSdk.quicksightMod._IngestionStatus | java.lang.String
  
  type Ingestions = js.Array[typings.awsSdk.quicksightMod.Ingestion]
  
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
  type InputColumnDataType = typings.awsSdk.quicksightMod._InputColumnDataType | java.lang.String
  
  type InputColumnList = js.Array[typings.awsSdk.quicksightMod.InputColumn]
  
  type InstanceId = java.lang.String
  
  type IntegerParameterList = js.Array[typings.awsSdk.quicksightMod.IntegerParameter]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INNER
    - typings.awsSdk.awsSdkStrings.OUTER
    - typings.awsSdk.awsSdkStrings.LEFT
    - typings.awsSdk.awsSdkStrings.RIGHT
    - java.lang.String
  */
  type JoinType = typings.awsSdk.quicksightMod._JoinType | java.lang.String
  
  type LogicalTableAlias = java.lang.String
  
  type LogicalTableId = java.lang.String
  
  type LogicalTableMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.quicksightMod.LogicalTable]
  
  type LongList = js.Array[typings.awsSdk.quicksightMod.Long_]
  
  type Long_ = scala.Double
  
  type MaxResults = scala.Double
  
  type Namespace = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PERMISSION_DENIED
    - typings.awsSdk.awsSdkStrings.INTERNAL_SERVICE_ERROR
    - java.lang.String
  */
  type NamespaceErrorType = typings.awsSdk.quicksightMod._NamespaceErrorType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATED
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.RETRYABLE_FAILURE
    - typings.awsSdk.awsSdkStrings.NON_RETRYABLE_FAILURE
    - java.lang.String
  */
  type NamespaceStatus = typings.awsSdk.quicksightMod._NamespaceStatus | java.lang.String
  
  type Namespaces = js.Array[typings.awsSdk.quicksightMod.NamespaceInfoV2]
  
  type NonEmptyString = java.lang.String
  
  type OnClause = java.lang.String
  
  type OptionalPort = scala.Double
  
  type OutputColumnList = js.Array[typings.awsSdk.quicksightMod.OutputColumn]
  
  type Password = java.lang.String
  
  type PhysicalTableId = java.lang.String
  
  type PhysicalTableMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.quicksightMod.PhysicalTable]
  
  type Port = scala.Double
  
  type PositiveInteger = scala.Double
  
  type Principal = java.lang.String
  
  type PrincipalList = js.Array[typings.awsSdk.quicksightMod.String]
  
  type ProjectedColumnList = js.Array[typings.awsSdk.quicksightMod.String]
  
  type Query = java.lang.String
  
  type RecoveryWindowInDays = scala.Double
  
  type RelationalTableName = java.lang.String
  
  type RelationalTableSchema = java.lang.String
  
  type ResourceId = java.lang.String
  
  type ResourceName = java.lang.String
  
  type ResourcePermissionList = js.Array[typings.awsSdk.quicksightMod.ResourcePermission]
  
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
  type ResourceStatus = typings.awsSdk.quicksightMod._ResourceStatus | java.lang.String
  
  type RestrictiveResourceId = java.lang.String
  
  type RoleName = java.lang.String
  
  type RoleSessionName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.GRANT_ACCESS
    - typings.awsSdk.awsSdkStrings.DENY_ACCESS
    - java.lang.String
  */
  type RowLevelPermissionPolicy = typings.awsSdk.quicksightMod._RowLevelPermissionPolicy | java.lang.String
  
  type S3Bucket = java.lang.String
  
  type S3Key = java.lang.String
  
  type SessionLifetimeInMinutes = scala.Double
  
  type SheetList = js.Array[typings.awsSdk.quicksightMod.Sheet]
  
  type SiteBaseUrl = java.lang.String
  
  type SqlQuery = java.lang.String
  
  type StatusCode = scala.Double
  
  type String = java.lang.String
  
  type StringList = js.Array[typings.awsSdk.quicksightMod.String]
  
  type StringParameterList = js.Array[typings.awsSdk.quicksightMod.StringParameter]
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typings.awsSdk.quicksightMod.TagKey]
  
  type TagList = js.Array[typings.awsSdk.quicksightMod.Tag]
  
  type TagValue = java.lang.String
  
  type TemplateAliasList = js.Array[typings.awsSdk.quicksightMod.TemplateAlias]
  
  type TemplateErrorList = js.Array[typings.awsSdk.quicksightMod.TemplateError]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SOURCE_NOT_FOUND
    - typings.awsSdk.awsSdkStrings.DATA_SET_NOT_FOUND
    - typings.awsSdk.awsSdkStrings.INTERNAL_FAILURE
    - typings.awsSdk.awsSdkStrings.ACCESS_DENIED
    - java.lang.String
  */
  type TemplateErrorType = typings.awsSdk.quicksightMod._TemplateErrorType | java.lang.String
  
  type TemplateName = java.lang.String
  
  type TemplateSummaryList = js.Array[typings.awsSdk.quicksightMod.TemplateSummary]
  
  type TemplateVersionSummaryList = js.Array[typings.awsSdk.quicksightMod.TemplateVersionSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DOUBLE_QUOTE
    - typings.awsSdk.awsSdkStrings.SINGLE_QUOTE
    - java.lang.String
  */
  type TextQualifier = typings.awsSdk.quicksightMod._TextQualifier | java.lang.String
  
  type ThemeAliasList = js.Array[typings.awsSdk.quicksightMod.ThemeAlias]
  
  type ThemeErrorList = js.Array[typings.awsSdk.quicksightMod.ThemeError]
  
  type ThemeErrorType = typings.awsSdk.awsSdkStrings.INTERNAL_FAILURE | java.lang.String
  
  type ThemeName = java.lang.String
  
  type ThemeSummaryList = js.Array[typings.awsSdk.quicksightMod.ThemeSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.QUICKSIGHT
    - typings.awsSdk.awsSdkStrings.CUSTOM
    - typings.awsSdk.awsSdkStrings.ALL
    - java.lang.String
  */
  type ThemeType = typings.awsSdk.quicksightMod._ThemeType | java.lang.String
  
  type ThemeVersionSummaryList = js.Array[typings.awsSdk.quicksightMod.ThemeVersionSummary]
  
  type TimestampList = js.Array[typings.awsSdk.quicksightMod.Timestamp_]
  
  type Timestamp_ = typings.std.Date
  
  type TransformOperationList = js.Array[typings.awsSdk.quicksightMod.TransformOperation]
  
  type TypeCastFormat = java.lang.String
  
  type UpdateResourcePermissionList = js.Array[typings.awsSdk.quicksightMod.ResourcePermission]
  
  type UserList = js.Array[typings.awsSdk.quicksightMod.User]
  
  type UserName_ = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ADMIN
    - typings.awsSdk.awsSdkStrings.AUTHOR
    - typings.awsSdk.awsSdkStrings.READER
    - typings.awsSdk.awsSdkStrings.RESTRICTED_AUTHOR
    - typings.awsSdk.awsSdkStrings.RESTRICTED_READER
    - java.lang.String
  */
  type UserRole = typings.awsSdk.quicksightMod._UserRole | java.lang.String
  
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
  type apiVersion = typings.awsSdk.quicksightMod._apiVersion | java.lang.String
  
  type long = scala.Double
  
  type timestamp = typings.std.Date
}
