package typings.awsSdk2Types.clientsRdsdataserviceMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Arn = java.lang.String

type ArrayOfArray = js.Array[ArrayValue]

type ArrayValueList = js.Array[Value]

type Boolean = scala.Boolean

type BooleanArray = js.Array[BoxedBoolean]

type BoxedBoolean = scala.Boolean

type BoxedDouble = Double

type BoxedFloat = Double

type BoxedInteger = Double

type BoxedLong = Double

type DbName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.STRING
  - typings.awsSdk2Types.awsSdk2TypesStrings.DOUBLE_OR_LONG
  - java.lang.String
*/
type DecimalReturnType = _DecimalReturnType | java.lang.String

type DoubleArray = js.Array[BoxedDouble]

type FieldList = js.Array[Field]

type FormattedSqlRecords = java.lang.String

type Id = java.lang.String

type Integer = Double

type Long = Double

type LongArray = js.Array[BoxedLong]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.STRING
  - typings.awsSdk2Types.awsSdk2TypesStrings.LONG
  - java.lang.String
*/
type LongReturnType = _LongReturnType | java.lang.String

type Metadata = js.Array[ColumnMetadata]

type ParameterName = java.lang.String

type Records = js.Array[Record]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.NONE
  - typings.awsSdk2Types.awsSdk2TypesStrings.JSON
  - java.lang.String
*/
type RecordsFormatType = _RecordsFormatType | java.lang.String

type RecordsUpdated = Double

type Row = js.Array[Value]

type SqlParameterSets = js.Array[SqlParametersList]

type SqlParametersList = js.Array[SqlParameter]

type SqlRecords = js.Array[FieldList]

type SqlStatement = java.lang.String

type SqlStatementResults = js.Array[SqlStatementResult]

type String = java.lang.String

type StringArray = js.Array[String]

type TransactionStatus = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.JSON
  - typings.awsSdk2Types.awsSdk2TypesStrings.UUID
  - typings.awsSdk2Types.awsSdk2TypesStrings.TIMESTAMP
  - typings.awsSdk2Types.awsSdk2TypesStrings.DATE
  - typings.awsSdk2Types.awsSdk2TypesStrings.TIME
  - typings.awsSdk2Types.awsSdk2TypesStrings.DECIMAL
  - java.lang.String
*/
type TypeHint = _TypeHint | java.lang.String

type UpdateResults = js.Array[UpdateResult]

type _Blob = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.`2018-08-01`
  - typings.awsSdk2Types.awsSdk2TypesStrings.latest
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
