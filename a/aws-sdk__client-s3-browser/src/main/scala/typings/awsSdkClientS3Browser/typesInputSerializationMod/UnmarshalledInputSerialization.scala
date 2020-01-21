package typings.awsSdkClientS3Browser.typesInputSerializationMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.BZIP2
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.GZIP
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.NONE
import typings.awsSdkClientS3Browser.typesCsvinputMod.UnmarshalledCSVInput
import typings.awsSdkClientS3Browser.typesJsoninputMod.UnmarshalledJSONInput
import typings.awsSdkClientS3Browser.typesParquetInputMod.UnmarshalledParquetInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledInputSerialization extends InputSerialization {
  /**
    * <p>Describes the serialization of a CSV-encoded object.</p>
    */
  @JSName("CSV")
  var CSV_UnmarshalledInputSerialization: js.UndefOr[UnmarshalledCSVInput] = js.undefined
  /**
    * <p>Specifies JSON as object's input serialization format.</p>
    */
  @JSName("JSON")
  var JSON_UnmarshalledInputSerialization: js.UndefOr[UnmarshalledJSONInput] = js.undefined
  /**
    * <p>Specifies Parquet as object's input serialization format.</p>
    */
  @JSName("Parquet")
  var Parquet_UnmarshalledInputSerialization: js.UndefOr[UnmarshalledParquetInput] = js.undefined
}

object UnmarshalledInputSerialization {
  @scala.inline
  def apply(
    CSV: UnmarshalledCSVInput = null,
    CompressionType: NONE | GZIP | BZIP2 | String = null,
    JSON: UnmarshalledJSONInput = null,
    Parquet: UnmarshalledParquetInput = null
  ): UnmarshalledInputSerialization = {
    val __obj = js.Dynamic.literal()
    if (CSV != null) __obj.updateDynamic("CSV")(CSV.asInstanceOf[js.Any])
    if (CompressionType != null) __obj.updateDynamic("CompressionType")(CompressionType.asInstanceOf[js.Any])
    if (JSON != null) __obj.updateDynamic("JSON")(JSON.asInstanceOf[js.Any])
    if (Parquet != null) __obj.updateDynamic("Parquet")(Parquet.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledInputSerialization]
  }
}

