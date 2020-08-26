package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputSerialization extends js.Object {
  /**
    * Describes the serialization of a CSV-encoded object.
    */
  var CSV: js.UndefOr[CSVInput] = js.native
  /**
    * Specifies object's compression format. Valid values: NONE, GZIP, BZIP2. Default Value: NONE.
    */
  var CompressionType: js.UndefOr[typings.awsSdk.s3Mod.CompressionType] = js.native
  /**
    * Specifies JSON as object's input serialization format.
    */
  var JSON: js.UndefOr[JSONInput] = js.native
  /**
    * Specifies Parquet as object's input serialization format.
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
    def setCompressionType(value: CompressionType): Self = this.set("CompressionType", value.asInstanceOf[js.Any])
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

