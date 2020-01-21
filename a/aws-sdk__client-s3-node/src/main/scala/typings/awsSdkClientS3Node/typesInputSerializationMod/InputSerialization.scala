package typings.awsSdkClientS3Node.typesInputSerializationMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.BZIP2
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.GZIP
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.NONE
import typings.awsSdkClientS3Node.typesCsvinputMod.CSVInput
import typings.awsSdkClientS3Node.typesJsoninputMod.JSONInput
import typings.awsSdkClientS3Node.typesParquetInputMod.ParquetInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputSerialization extends js.Object {
  /**
    * <p>Describes the serialization of a CSV-encoded object.</p>
    */
  var CSV: js.UndefOr[CSVInput] = js.undefined
  /**
    * <p>Specifies object's compression format. Valid values: NONE, GZIP, BZIP2. Default Value: NONE.</p>
    */
  var CompressionType: js.UndefOr[NONE | GZIP | BZIP2 | String] = js.undefined
  /**
    * <p>Specifies JSON as object's input serialization format.</p>
    */
  var JSON: js.UndefOr[JSONInput] = js.undefined
  /**
    * <p>Specifies Parquet as object's input serialization format.</p>
    */
  var Parquet: js.UndefOr[ParquetInput] = js.undefined
}

object InputSerialization {
  @scala.inline
  def apply(
    CSV: CSVInput = null,
    CompressionType: NONE | GZIP | BZIP2 | String = null,
    JSON: JSONInput = null,
    Parquet: ParquetInput = null
  ): InputSerialization = {
    val __obj = js.Dynamic.literal()
    if (CSV != null) __obj.updateDynamic("CSV")(CSV.asInstanceOf[js.Any])
    if (CompressionType != null) __obj.updateDynamic("CompressionType")(CompressionType.asInstanceOf[js.Any])
    if (JSON != null) __obj.updateDynamic("JSON")(JSON.asInstanceOf[js.Any])
    if (Parquet != null) __obj.updateDynamic("Parquet")(Parquet.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputSerialization]
  }
}

