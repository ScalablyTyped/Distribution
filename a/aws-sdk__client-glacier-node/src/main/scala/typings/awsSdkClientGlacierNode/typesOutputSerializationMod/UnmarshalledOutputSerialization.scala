package typings.awsSdkClientGlacierNode.typesOutputSerializationMod

import typings.awsSdkClientGlacierNode.typesCsvoutputMod.UnmarshalledCSVOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledOutputSerialization extends OutputSerialization {
  /**
    * <p>Describes the serialization of CSV-encoded query results.</p>
    */
  @JSName("csv")
  var csv_UnmarshalledOutputSerialization: js.UndefOr[UnmarshalledCSVOutput] = js.native
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
    def setCsv(value: UnmarshalledCSVOutput): Self = this.set("csv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCsv: Self = this.set("csv", js.undefined)
  }
  
}

