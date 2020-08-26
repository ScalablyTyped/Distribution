package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputSerialization extends js.Object {
  /**
    * Describes the serialization of CSV-encoded query results.
    */
  var csv: js.UndefOr[CSVOutput] = js.native
}

object OutputSerialization {
  @scala.inline
  def apply(): OutputSerialization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputSerialization]
  }
  @scala.inline
  implicit class OutputSerializationOps[Self <: OutputSerialization] (val x: Self) extends AnyVal {
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
    def setCsv(value: CSVOutput): Self = this.set("csv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCsv: Self = this.set("csv", js.undefined)
  }
  
}

