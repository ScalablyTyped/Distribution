package typings.awsSdkClientS3Node.typesInputSerializationMod

import typings.awsSdkClientS3Node.typesCsvinputMod.UnmarshalledCSVInput
import typings.awsSdkClientS3Node.typesJsoninputMod.UnmarshalledJSONInput
import typings.awsSdkClientS3Node.typesParquetInputMod.UnmarshalledParquetInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledInputSerialization extends InputSerialization {
  /**
    * <p>Describes the serialization of a CSV-encoded object.</p>
    */
  @JSName("CSV")
  var CSV_UnmarshalledInputSerialization: js.UndefOr[UnmarshalledCSVInput] = js.native
  /**
    * <p>Specifies JSON as object's input serialization format.</p>
    */
  @JSName("JSON")
  var JSON_UnmarshalledInputSerialization: js.UndefOr[UnmarshalledJSONInput] = js.native
  /**
    * <p>Specifies Parquet as object's input serialization format.</p>
    */
  @JSName("Parquet")
  var Parquet_UnmarshalledInputSerialization: js.UndefOr[UnmarshalledParquetInput] = js.native
}

object UnmarshalledInputSerialization {
  @scala.inline
  def apply(): UnmarshalledInputSerialization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledInputSerialization]
  }
  @scala.inline
  implicit class UnmarshalledInputSerializationOps[Self <: UnmarshalledInputSerialization] (val x: Self) extends AnyVal {
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
    def setCSV(value: UnmarshalledCSVInput): Self = this.set("CSV", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCSV: Self = this.set("CSV", js.undefined)
    @scala.inline
    def setJSON(value: UnmarshalledJSONInput): Self = this.set("JSON", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJSON: Self = this.set("JSON", js.undefined)
    @scala.inline
    def setParquet(value: UnmarshalledParquetInput): Self = this.set("Parquet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParquet: Self = this.set("Parquet", js.undefined)
  }
  
}

