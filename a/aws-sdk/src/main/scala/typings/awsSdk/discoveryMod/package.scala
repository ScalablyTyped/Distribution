package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AgentConfigurationStatusList = js.Array[typings.awsSdk.discoveryMod.AgentConfigurationStatus]

type AgentId = java.lang.String

type AgentIds = js.Array[typings.awsSdk.discoveryMod.AgentId]

type AgentNetworkInfoList = js.Array[typings.awsSdk.discoveryMod.AgentNetworkInfo]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HEALTHY
  - typings.awsSdk.awsSdkStrings.UNHEALTHY
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - typings.awsSdk.awsSdkStrings.BLACKLISTED
  - typings.awsSdk.awsSdkStrings.SHUTDOWN
  - java.lang.String
*/
type AgentStatus = typings.awsSdk.discoveryMod._AgentStatus | java.lang.String

type AgentsInfo = js.Array[typings.awsSdk.discoveryMod.AgentInfo]

type ApplicationId = java.lang.String

type ApplicationIdsList = js.Array[typings.awsSdk.discoveryMod.ApplicationId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NOT_FOUND
  - typings.awsSdk.awsSdkStrings.INTERNAL_SERVER_ERROR
  - typings.awsSdk.awsSdkStrings.OVER_LIMIT
  - java.lang.String
*/
type BatchDeleteImportDataErrorCode = typings.awsSdk.discoveryMod._BatchDeleteImportDataErrorCode | java.lang.String

type BatchDeleteImportDataErrorDescription = java.lang.String

type BatchDeleteImportDataErrorList = js.Array[typings.awsSdk.discoveryMod.BatchDeleteImportDataError]

type Boolean = scala.Boolean

type BoxedInteger = scala.Double

type ClientRequestToken = java.lang.String

type Condition = java.lang.String

type Configuration = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.discoveryMod.String]

type ConfigurationId = java.lang.String

type ConfigurationIdList = js.Array[typings.awsSdk.discoveryMod.ConfigurationId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SERVER
  - typings.awsSdk.awsSdkStrings.PROCESS
  - typings.awsSdk.awsSdkStrings.CONNECTION
  - typings.awsSdk.awsSdkStrings.APPLICATION
  - java.lang.String
*/
type ConfigurationItemType = typings.awsSdk.discoveryMod._ConfigurationItemType | java.lang.String

type ConfigurationTagSet = js.Array[typings.awsSdk.discoveryMod.ConfigurationTag]

type Configurations = js.Array[typings.awsSdk.discoveryMod.Configuration]

type ConfigurationsDownloadUrl = java.lang.String

type ConfigurationsExportId = java.lang.String

type ContinuousExportDescriptions = js.Array[typings.awsSdk.discoveryMod.ContinuousExportDescription]

type ContinuousExportIds = js.Array[typings.awsSdk.discoveryMod.ConfigurationsExportId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.START_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.START_FAILED
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.ERROR
  - typings.awsSdk.awsSdkStrings.STOP_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.STOP_FAILED
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - java.lang.String
*/
type ContinuousExportStatus = typings.awsSdk.discoveryMod._ContinuousExportStatus | java.lang.String

type DataSource = typings.awsSdk.awsSdkStrings.AGENT | java.lang.String

type DatabaseName = java.lang.String

type DescribeConfigurationsAttribute = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.discoveryMod.String]

type DescribeConfigurationsAttributes = js.Array[typings.awsSdk.discoveryMod.DescribeConfigurationsAttribute]

type DescribeContinuousExportsMaxResults = scala.Double

type DescribeImportTasksFilterList = js.Array[typings.awsSdk.discoveryMod.ImportTaskFilter]

type DescribeImportTasksMaxResults = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CSV
  - typings.awsSdk.awsSdkStrings.GRAPHML
  - java.lang.String
*/
type ExportDataFormat = typings.awsSdk.discoveryMod._ExportDataFormat | java.lang.String

type ExportDataFormats = js.Array[typings.awsSdk.discoveryMod.ExportDataFormat]

type ExportFilters = js.Array[typings.awsSdk.discoveryMod.ExportFilter]

type ExportIds = js.Array[typings.awsSdk.discoveryMod.ConfigurationsExportId]

type ExportRequestTime = typings.std.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - java.lang.String
*/
type ExportStatus = typings.awsSdk.discoveryMod._ExportStatus | java.lang.String

type ExportStatusMessage = java.lang.String

type ExportsInfo = js.Array[typings.awsSdk.discoveryMod.ExportInfo]

type FilterName = java.lang.String

type FilterValue = java.lang.String

type FilterValues = js.Array[typings.awsSdk.discoveryMod.FilterValue]

type Filters = js.Array[typings.awsSdk.discoveryMod.Filter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IMPORT_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.IMPORT_COMPLETE
  - typings.awsSdk.awsSdkStrings.IMPORT_COMPLETE_WITH_ERRORS
  - typings.awsSdk.awsSdkStrings.IMPORT_FAILED
  - typings.awsSdk.awsSdkStrings.IMPORT_FAILED_SERVER_LIMIT_EXCEEDED
  - typings.awsSdk.awsSdkStrings.IMPORT_FAILED_RECORD_LIMIT_EXCEEDED
  - typings.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.DELETE_COMPLETE
  - typings.awsSdk.awsSdkStrings.DELETE_FAILED
  - typings.awsSdk.awsSdkStrings.DELETE_FAILED_LIMIT_EXCEEDED
  - typings.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - java.lang.String
*/
type ImportStatus = typings.awsSdk.discoveryMod._ImportStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IMPORT_TASK_ID
  - typings.awsSdk.awsSdkStrings.STATUS
  - typings.awsSdk.awsSdkStrings.NAME
  - java.lang.String
*/
type ImportTaskFilterName = typings.awsSdk.discoveryMod._ImportTaskFilterName | java.lang.String

type ImportTaskFilterValue = java.lang.String

type ImportTaskFilterValueList = js.Array[typings.awsSdk.discoveryMod.ImportTaskFilterValue]

type ImportTaskIdentifier = java.lang.String

type ImportTaskList = js.Array[typings.awsSdk.discoveryMod.ImportTask]

type ImportTaskName = java.lang.String

type ImportURL = java.lang.String

type Integer = scala.Double

type Long = scala.Double

type NeighborDetailsList = js.Array[typings.awsSdk.discoveryMod.NeighborConnectionDetail]

type NextToken = java.lang.String

type OrderByList = js.Array[typings.awsSdk.discoveryMod.OrderByElement]

type S3Bucket = java.lang.String

type S3PresignedUrl = java.lang.String

type SchemaStorageConfig = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.discoveryMod.String]

type String = java.lang.String

type StringMax255 = java.lang.String

type TagFilters = js.Array[typings.awsSdk.discoveryMod.TagFilter]

type TagKey = java.lang.String

type TagSet = js.Array[typings.awsSdk.discoveryMod.Tag]

type TagValue = java.lang.String

type TimeStamp = typings.std.Date

type ToDeleteIdentifierList = js.Array[typings.awsSdk.discoveryMod.ImportTaskIdentifier]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2015-11-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = typings.awsSdk.discoveryMod._apiVersion | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASC
  - typings.awsSdk.awsSdkStrings.DESC
  - java.lang.String
*/
type orderString = typings.awsSdk.discoveryMod._orderString | java.lang.String
