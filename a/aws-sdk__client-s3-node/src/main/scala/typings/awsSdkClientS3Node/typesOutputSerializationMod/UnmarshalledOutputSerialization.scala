package typings.awsSdkClientS3Node.typesOutputSerializationMod

import typings.awsSdkClientS3Node.typesCsvoutputMod.UnmarshalledCSVOutput
import typings.awsSdkClientS3Node.typesJsonoutputMod.UnmarshalledJSONOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledOutputSerialization extends OutputSerialization {
  /**
    * <p>Describes the serialization of CSV-encoded Select results.</p>
    */
  @JSName("CSV")
  var CSV_UnmarshalledOutputSerialization: js.UndefOr[UnmarshalledCSVOutput] = js.native
  /**
    * <p>Specifies JSON as request's output serialization format.</p>
    */
  @JSName("JSON")
  var JSON_UnmarshalledOutputSerialization: js.UndefOr[UnmarshalledJSONOutput] = js.native
}

object UnmarshalledOutputSerialization {
  @scala.inline
  def apply(): UnmarshalledOutputSerialization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledOutputSerialization]
  }
  @scala.inline
  implicit class UnmarshalledOutputSerializationOps[Self <: UnmarshalledOutputSerialization] (val x: Self) extends AnyVal {
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
    def setCSV(value: UnmarshalledCSVOutput): Self = this.set("CSV", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCSV: Self = this.set("CSV", js.undefined)
    @scala.inline
    def setJSON(value: UnmarshalledJSONOutput): Self = this.set("JSON", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJSON: Self = this.set("JSON", js.undefined)
  }
  
}

