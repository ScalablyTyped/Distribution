package typings.awsSdk.honeycodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.DELIMITED_TEXT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AwsUserArn = String

type BatchErrorMessage = String

type BatchItemId = String

type Cells = js.Array[Cell]

type ClientRequestToken = String

type CreateRowDataList = js.Array[CreateRowData]

type CreatedRowsMap = StringDictionary[RowId]

type DataItems = js.Array[DataItem]

type DelimitedTextDelimiter = String

type Email = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACCESS_DENIED
  - typings.awsSdk.awsSdkStrings.INVALID_URL_ERROR
  - typings.awsSdk.awsSdkStrings.INVALID_IMPORT_OPTIONS_ERROR
  - typings.awsSdk.awsSdkStrings.INVALID_TABLE_ID_ERROR
  - typings.awsSdk.awsSdkStrings.INVALID_TABLE_COLUMN_ID_ERROR
  - typings.awsSdk.awsSdkStrings.TABLE_NOT_FOUND_ERROR
  - typings.awsSdk.awsSdkStrings.FILE_EMPTY_ERROR
  - typings.awsSdk.awsSdkStrings.INVALID_FILE_TYPE_ERROR
  - typings.awsSdk.awsSdkStrings.FILE_PARSING_ERROR
  - typings.awsSdk.awsSdkStrings.FILE_SIZE_LIMIT_ERROR
  - typings.awsSdk.awsSdkStrings.FILE_NOT_FOUND_ERROR
  - typings.awsSdk.awsSdkStrings.UNKNOWN_ERROR
  - typings.awsSdk.awsSdkStrings.RESOURCE_NOT_FOUND_ERROR
  - typings.awsSdk.awsSdkStrings.SYSTEM_LIMIT_ERROR
  - java.lang.String
*/
type ErrorCode = _ErrorCode | String

type Fact = String

type FactList = js.Array[Fact]

type FailedBatchItems = js.Array[FailedBatchItem]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AUTO
  - typings.awsSdk.awsSdkStrings.NUMBER
  - typings.awsSdk.awsSdkStrings.CURRENCY
  - typings.awsSdk.awsSdkStrings.DATE
  - typings.awsSdk.awsSdkStrings.TIME
  - typings.awsSdk.awsSdkStrings.DATE_TIME
  - typings.awsSdk.awsSdkStrings.PERCENTAGE
  - typings.awsSdk.awsSdkStrings.TEXT
  - typings.awsSdk.awsSdkStrings.ACCOUNTING
  - typings.awsSdk.awsSdkStrings.CONTACT
  - typings.awsSdk.awsSdkStrings.ROWLINK
  - typings.awsSdk.awsSdkStrings.ROWSET
  - java.lang.String
*/
type Format = _Format | String

type FormattedValue = String

type FormattedValuesList = js.Array[FormattedValue]

type Formula = String

type HasHeaderRow = Boolean

type IgnoreEmptyRows = Boolean

type ImportColumnMap = StringDictionary[SourceDataColumnProperties]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`UTF-8`
  - typings.awsSdk.awsSdkStrings.`US-ASCII`
  - typings.awsSdk.awsSdkStrings.`ISO-8859-1`
  - typings.awsSdk.awsSdkStrings.`UTF-16BE`
  - typings.awsSdk.awsSdkStrings.`UTF-16LE`
  - typings.awsSdk.awsSdkStrings.`UTF-16`
  - java.lang.String
*/
type ImportDataCharacterEncoding = _ImportDataCharacterEncoding | String

type ImportSourceDataFormat = DELIMITED_TEXT | String

type JobId = String

type MaxResults = Double

type Name = String

type PaginationToken = String

type RawValue = String

type ResourceArn = String

type ResourceId = String

type ResourceIds = js.Array[ResourceId]

type ResultHeader = js.Array[ColumnMetadata]

type ResultRows = js.Array[ResultRow]

type ResultSetMap = StringDictionary[ResultSet]

type RowDataInput = StringDictionary[CellInput]

type RowId = String

type RowIdList = js.Array[RowId]

type SecureURL = String

type SourceDataColumnIndex = Double

type TableColumnName = String

type TableColumns = js.Array[TableColumn]

type TableDataImportJobMessage = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUBMITTED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type TableDataImportJobStatus = _TableDataImportJobStatus | String

type TableName = String

type TableRows = js.Array[TableRow]

type Tables = js.Array[Table]

type TagKey = String

type TagKeysList = js.Array[TagKey]

type TagValue = String

type TagsMap = StringDictionary[TagValue]

type TimestampInMillis = js.Date

type UpdateRowDataList = js.Array[UpdateRowData]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UPDATED
  - typings.awsSdk.awsSdkStrings.APPENDED
  - java.lang.String
*/
type UpsertAction = _UpsertAction | String

type UpsertRowDataList = js.Array[UpsertRowData]

type UpsertRowsResultMap = StringDictionary[UpsertRowsResult]

type VariableName = String

type VariableValueMap = StringDictionary[VariableValue]

type WorkbookCursor = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2020-03-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
