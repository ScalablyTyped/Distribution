package typings.awsSdk.finspacedataMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccessKeyId = String

type AliasString = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type ApiAccess = _ApiAccess | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CreateDataset
  - typings.awsSdk.awsSdkStrings.ManageClusters
  - typings.awsSdk.awsSdkStrings.ManageUsersAndGroups
  - typings.awsSdk.awsSdkStrings.ManageAttributeSets
  - typings.awsSdk.awsSdkStrings.ViewAuditData
  - typings.awsSdk.awsSdkStrings.AccessNotebooks
  - typings.awsSdk.awsSdkStrings.GetTemporaryCredentials
  - java.lang.String
*/
type ApplicationPermission = _ApplicationPermission | String

type ApplicationPermissionList = js.Array[ApplicationPermission]

type Boolean = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.REPLACE
  - typings.awsSdk.awsSdkStrings.APPEND
  - typings.awsSdk.awsSdkStrings.MODIFY
  - java.lang.String
*/
type ChangeType = _ChangeType | String

type ChangesetArn = String

type ChangesetId = String

type ChangesetList = js.Array[ChangesetSummary]

type ClientToken = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STRING
  - typings.awsSdk.awsSdkStrings.CHAR
  - typings.awsSdk.awsSdkStrings.INTEGER
  - typings.awsSdk.awsSdkStrings.TINYINT
  - typings.awsSdk.awsSdkStrings.SMALLINT
  - typings.awsSdk.awsSdkStrings.BIGINT
  - typings.awsSdk.awsSdkStrings.FLOAT
  - typings.awsSdk.awsSdkStrings.DOUBLE
  - typings.awsSdk.awsSdkStrings.DATE
  - typings.awsSdk.awsSdkStrings.DATETIME
  - typings.awsSdk.awsSdkStrings.BOOLEAN
  - typings.awsSdk.awsSdkStrings.BINARY
  - java.lang.String
*/
type ColumnDataType = _ColumnDataType | String

type ColumnDescription = String

type ColumnList = js.Array[ColumnDefinition]

type ColumnName = String

type ColumnNameList = js.Array[ColumnName]

type DataViewArn = String

type DataViewDestinationType = String

type DataViewId = String

type DataViewList = js.Array[DataViewSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.STARTING
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - typings.awsSdk.awsSdkStrings.TIMEOUT
  - typings.awsSdk.awsSdkStrings.SUCCESS
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.FAILED_CLEANUP_FAILED
  - java.lang.String
*/
type DataViewStatus = _DataViewStatus | String

type DatasetArn = String

type DatasetDescription = String

type DatasetId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TABULAR
  - typings.awsSdk.awsSdkStrings.NON_TABULAR
  - java.lang.String
*/
type DatasetKind = _DatasetKind | String

type DatasetList = js.Array[Dataset]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.SUCCESS
  - typings.awsSdk.awsSdkStrings.RUNNING
  - java.lang.String
*/
type DatasetStatus = _DatasetStatus | String

type DatasetTitle = String

type Email = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.VALIDATION
  - typings.awsSdk.awsSdkStrings.SERVICE_QUOTA_EXCEEDED
  - typings.awsSdk.awsSdkStrings.ACCESS_DENIED
  - typings.awsSdk.awsSdkStrings.RESOURCE_NOT_FOUND
  - typings.awsSdk.awsSdkStrings.THROTTLING
  - typings.awsSdk.awsSdkStrings.INTERNAL_SERVICE_EXCEPTION
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - typings.awsSdk.awsSdkStrings.USER_RECOVERABLE
  - java.lang.String
*/
type ErrorCategory = _ErrorCategory | String

type ErrorMessage = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PARQUET
  - typings.awsSdk.awsSdkStrings.DELIMITED_TEXT
  - java.lang.String
*/
type ExportFileFormat = _ExportFileFormat | String

type FirstName = String

type FormatParams = StringDictionary[StringMapValue]

type IdType = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.SUCCESS
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.STOP_REQUESTED
  - java.lang.String
*/
type IngestionStatus = _IngestionStatus | String

type LastName = String

type OwnerName = String

type PaginationToken = String

type PartitionColumnList = js.Array[StringValueLength1to255_]

type Password = String

type PermissionGroupByUserList = js.Array[PermissionGroupByUser]

type PermissionGroupDescription = String

type PermissionGroupId = String

type PermissionGroupList = js.Array[PermissionGroup]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ADDITION_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.ADDITION_SUCCESS
  - typings.awsSdk.awsSdkStrings.REMOVAL_IN_PROGRESS
  - java.lang.String
*/
type PermissionGroupMembershipStatus = _PermissionGroupMembershipStatus | String

type PermissionGroupName = String

type PhoneNumber = String

type ResourcePermissionsList = js.Array[ResourcePermission]

type ResultLimit = Double

type RoleArn = String

type S3BucketName = String

type S3DestinationFormatOptions = StringDictionary[StringMapValue]

type S3Key = String

type SecretAccessKey = String

type SessionDuration = Double

type SessionToken = String

type SortColumnList = js.Array[StringValueLength1to255_]

type SourceParams = StringDictionary[StringMapValue]

type StatusCode = Double

type StringMapKey = String

type StringMapValue = String

type StringValueLength1to250 = String

type StringValueLength1to255_ = String

type TimestampEpoch = Double

type UserByPermissionGroupList = js.Array[UserByPermissionGroup]

type UserId = String

type UserList = js.Array[User]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type UserStatus = _UserStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUPER_USER
  - typings.awsSdk.awsSdkStrings.APP_USER
  - java.lang.String
*/
type UserType = _UserType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2020-07-13`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INGESTION
  - typings.awsSdk.awsSdkStrings.SAGEMAKER
  - java.lang.String
*/
type locationType = _locationType | String

type stringValueLength1to1024 = String

type stringValueLength1to255 = String

type stringValueLength1to63 = String

type stringValueMaxLength1000 = String
