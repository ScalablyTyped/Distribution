package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rdsdataserviceMod {
  type Arn = java.lang.String
  type ArrayOfArray = js.Array[typings.awsSdk.rdsdataserviceMod.ArrayValue]
  type ArrayValueList = js.Array[typings.awsSdk.rdsdataserviceMod.Value]
  type Boolean = scala.Boolean
  type BooleanArray = js.Array[typings.awsSdk.rdsdataserviceMod.BoxedBoolean]
  type BoxedBoolean = scala.Boolean
  type BoxedDouble = scala.Double
  type BoxedFloat = scala.Double
  type BoxedInteger = scala.Double
  type BoxedLong = scala.Double
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.rdsdataserviceMod.ClientApiVersions
  type DbName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DOUBLE_OR_LONG
    - typings.awsSdk.awsSdkStrings.STRING
    - java.lang.String
  */
  type DecimalReturnType = typings.awsSdk.rdsdataserviceMod._DecimalReturnType | java.lang.String
  type DoubleArray = js.Array[typings.awsSdk.rdsdataserviceMod.BoxedDouble]
  type FieldList = js.Array[typings.awsSdk.rdsdataserviceMod.Field]
  type Id = java.lang.String
  type Integer = scala.Double
  type Long = scala.Double
  type LongArray = js.Array[typings.awsSdk.rdsdataserviceMod.BoxedLong]
  type Metadata = js.Array[typings.awsSdk.rdsdataserviceMod.ColumnMetadata]
  type ParameterName = java.lang.String
  type Records = js.Array[typings.awsSdk.rdsdataserviceMod.Record]
  type RecordsUpdated = scala.Double
  type Row = js.Array[typings.awsSdk.rdsdataserviceMod.Value]
  type SqlParameterSets = js.Array[typings.awsSdk.rdsdataserviceMod.SqlParametersList]
  type SqlParametersList = js.Array[typings.awsSdk.rdsdataserviceMod.SqlParameter]
  type SqlRecords = js.Array[typings.awsSdk.rdsdataserviceMod.FieldList]
  type SqlStatement = java.lang.String
  type SqlStatementResults = js.Array[typings.awsSdk.rdsdataserviceMod.SqlStatementResult]
  type String = java.lang.String
  type StringArray = js.Array[typings.awsSdk.rdsdataserviceMod.String]
  type TransactionStatus = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DATE
    - typings.awsSdk.awsSdkStrings.DECIMAL
    - typings.awsSdk.awsSdkStrings.TIME
    - typings.awsSdk.awsSdkStrings.TIMESTAMP
    - java.lang.String
  */
  type TypeHint = typings.awsSdk.rdsdataserviceMod._TypeHint | java.lang.String
  type UpdateResults = js.Array[typings.awsSdk.rdsdataserviceMod.UpdateResult]
  type _Blob = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.rdsdataserviceMod.Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-08-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.rdsdataserviceMod._apiVersion | java.lang.String
}
