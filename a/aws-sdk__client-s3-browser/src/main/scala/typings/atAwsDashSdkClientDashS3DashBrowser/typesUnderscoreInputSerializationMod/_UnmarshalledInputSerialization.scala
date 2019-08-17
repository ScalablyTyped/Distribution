package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreInputSerializationMod

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.BZIP2
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.GZIP
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.NONE
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreCSVInputMod._UnmarshalledCSVInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreJSONInputMod._UnmarshalledJSONInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreParquetInputMod._UnmarshalledParquetInput
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
    if (CSV != null) __obj.updateDynamic("CSV")(CSV)
    if (CompressionType != null) __obj.updateDynamic("CompressionType")(CompressionType.asInstanceOf[js.Any])
    if (JSON != null) __obj.updateDynamic("JSON")(JSON)
    if (Parquet != null) __obj.updateDynamic("Parquet")(Parquet)
    __obj.asInstanceOf[_UnmarshalledInputSerialization]
  }
}

