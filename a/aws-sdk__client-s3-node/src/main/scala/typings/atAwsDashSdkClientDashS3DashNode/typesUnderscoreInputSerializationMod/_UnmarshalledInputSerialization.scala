package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreInputSerializationMod

import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.BZIP2
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.GZIP
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.NONE
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreCSVInputMod._UnmarshalledCSVInput
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreJSONInputMod._UnmarshalledJSONInput
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreParquetInputMod._UnmarshalledParquetInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledInputSerialization extends _InputSerialization {
  /**
    * <p>Describes the serialization of a CSV-encoded object.</p>
    */
  @JSName("CSV")
  var CSV__UnmarshalledInputSerialization: js.UndefOr[_UnmarshalledCSVInput] = js.undefined
  /**
    * <p>Specifies JSON as object's input serialization format.</p>
    */
  @JSName("JSON")
  var JSON__UnmarshalledInputSerialization: js.UndefOr[_UnmarshalledJSONInput] = js.undefined
  /**
    * <p>Specifies Parquet as object's input serialization format.</p>
    */
  @JSName("Parquet")
  var Parquet__UnmarshalledInputSerialization: js.UndefOr[_UnmarshalledParquetInput] = js.undefined
}

object _UnmarshalledInputSerialization {
  @scala.inline
  def apply(
    CSV: _UnmarshalledCSVInput = null,
    CompressionType: NONE | GZIP | BZIP2 | String = null,
    JSON: _UnmarshalledJSONInput = null,
    Parquet: _UnmarshalledParquetInput = null
  ): _UnmarshalledInputSerialization = {
    val __obj = js.Dynamic.literal()
    if (CSV != null) __obj.updateDynamic("CSV")(CSV.asInstanceOf[js.Any])
    if (CompressionType != null) __obj.updateDynamic("CompressionType")(CompressionType.asInstanceOf[js.Any])
    if (JSON != null) __obj.updateDynamic("JSON")(JSON.asInstanceOf[js.Any])
    if (Parquet != null) __obj.updateDynamic("Parquet")(Parquet.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledInputSerialization]
  }
}

