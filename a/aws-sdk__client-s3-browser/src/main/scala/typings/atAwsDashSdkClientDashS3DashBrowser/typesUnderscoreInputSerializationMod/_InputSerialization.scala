package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreInputSerializationMod

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.BZIP2
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.GZIP
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.NONE
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreCSVInputMod._CSVInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreJSONInputMod._JSONInput
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreParquetInputMod._ParquetInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _InputSerialization extends js.Object {
  /**
    * <p>Describes the serialization of a CSV-encoded object.</p>
    */
  var CSV: js.UndefOr[_CSVInput] = js.undefined
  /**
    * <p>Specifies object's compression format. Valid values: NONE, GZIP, BZIP2. Default Value: NONE.</p>
    */
  var CompressionType: js.UndefOr[NONE | GZIP | BZIP2 | String] = js.undefined
  /**
    * <p>Specifies JSON as object's input serialization format.</p>
    */
  var JSON: js.UndefOr[_JSONInput] = js.undefined
  /**
    * <p>Specifies Parquet as object's input serialization format.</p>
    */
  var Parquet: js.UndefOr[_ParquetInput] = js.undefined
}

object _InputSerialization {
  @scala.inline
  def apply(
    CSV: _CSVInput = null,
    CompressionType: NONE | GZIP | BZIP2 | String = null,
    JSON: _JSONInput = null,
    Parquet: _ParquetInput = null
  ): _InputSerialization = {
    val __obj = js.Dynamic.literal()
    if (CSV != null) __obj.updateDynamic("CSV")(CSV)
    if (CompressionType != null) __obj.updateDynamic("CompressionType")(CompressionType.asInstanceOf[js.Any])
    if (JSON != null) __obj.updateDynamic("JSON")(JSON)
    if (Parquet != null) __obj.updateDynamic("Parquet")(Parquet)
    __obj.asInstanceOf[_InputSerialization]
  }
}

