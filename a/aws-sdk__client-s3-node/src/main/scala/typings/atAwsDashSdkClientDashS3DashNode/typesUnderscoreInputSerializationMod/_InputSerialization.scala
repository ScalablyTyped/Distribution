package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreInputSerializationMod

import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.BZIP2
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.GZIP
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.NONE
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreCSVInputMod._CSVInput
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreJSONInputMod._JSONInput
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreParquetInputMod._ParquetInput
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
    if (CSV != null) __obj.updateDynamic("CSV")(CSV.asInstanceOf[js.Any])
    if (CompressionType != null) __obj.updateDynamic("CompressionType")(CompressionType.asInstanceOf[js.Any])
    if (JSON != null) __obj.updateDynamic("JSON")(JSON.asInstanceOf[js.Any])
    if (Parquet != null) __obj.updateDynamic("Parquet")(Parquet.asInstanceOf[js.Any])
    __obj.asInstanceOf[_InputSerialization]
  }
}

