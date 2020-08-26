package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HiveJsonSerDe extends js.Object {
  /**
    * Indicates how you want Kinesis Data Firehose to parse the date and timestamps that may be present in your input data JSON. To specify these format strings, follow the pattern syntax of JodaTime's DateTimeFormat format strings. For more information, see Class DateTimeFormat. You can also use the special value millis to parse timestamps in epoch milliseconds. If you don't specify a format, Kinesis Data Firehose uses java.sql.Timestamp::valueOf by default.
    */
  var TimestampFormats: js.UndefOr[ListOfNonEmptyStrings] = js.native
}

object HiveJsonSerDe {
  @scala.inline
  def apply(): HiveJsonSerDe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HiveJsonSerDe]
  }
  @scala.inline
  implicit class HiveJsonSerDeOps[Self <: HiveJsonSerDe] (val x: Self) extends AnyVal {
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
    def setTimestampFormatsVarargs(value: NonEmptyString*): Self = this.set("TimestampFormats", js.Array(value :_*))
    @scala.inline
    def setTimestampFormats(value: ListOfNonEmptyStrings): Self = this.set("TimestampFormats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestampFormats: Self = this.set("TimestampFormats", js.undefined)
  }
  
}

