package typings.awsSdkClientS3Browser.typesInputSerializationMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.BZIP2
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.GZIP
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.NONE
import typings.awsSdkClientS3Browser.typesCsvinputMod.CSVInput
import typings.awsSdkClientS3Browser.typesJsoninputMod.JSONInput
import typings.awsSdkClientS3Browser.typesParquetInputMod.ParquetInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputSerialization extends js.Object {
  /**
    * <p>Describes the serialization of a CSV-encoded object.</p>
    */
  var CSV: js.UndefOr[CSVInput] = js.native
  /**
    * <p>Specifies object's compression format. Valid values: NONE, GZIP, BZIP2. Default Value: NONE.</p>
    */
  var CompressionType: js.UndefOr[NONE | GZIP | BZIP2 | String] = js.native
  /**
    * <p>Specifies JSON as object's input serialization format.</p>
    */
  var JSON: js.UndefOr[JSONInput] = js.native
  /**
    * <p>Specifies Parquet as object's input serialization format.</p>
    */
  var Parquet: js.UndefOr[ParquetInput] = js.native
}

object InputSerialization {
  @scala.inline
  def apply(): InputSerialization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputSerialization]
  }
  @scala.inline
  implicit class InputSerializationOps[Self <: InputSerialization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCSV(value: CSVInput): Self = this.set("CSV", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCSV: Self = this.set("CSV", js.undefined)
    @scala.inline
    def setCompressionType(value: NONE | GZIP | BZIP2 | String): Self = this.set("CompressionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompressionType: Self = this.set("CompressionType", js.undefined)
    @scala.inline
    def setJSON(value: JSONInput): Self = this.set("JSON", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJSON: Self = this.set("JSON", js.undefined)
    @scala.inline
    def setParquet(value: ParquetInput): Self = this.set("Parquet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParquet: Self = this.set("Parquet", js.undefined)
  }
  
}

