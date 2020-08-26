package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageDsn extends js.Object {
  /**
    * When the message was received by the reporting mail transfer agent (MTA), in RFC 822 date-time format.
    */
  var ArrivalDate: js.UndefOr[typings.awsSdk.sesMod.ArrivalDate] = js.native
  /**
    * Additional X-headers to include in the DSN.
    */
  var ExtensionFields: js.UndefOr[ExtensionFieldList] = js.native
  /**
    * The reporting MTA that attempted to deliver the message, formatted as specified in RFC 3464 (mta-name-type; mta-name). The default value is dns; inbound-smtp.[region].amazonaws.com.
    */
  var ReportingMta: typings.awsSdk.sesMod.ReportingMta = js.native
}

object MessageDsn {
  @scala.inline
  def apply(ReportingMta: ReportingMta): MessageDsn = {
    val __obj = js.Dynamic.literal(ReportingMta = ReportingMta.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageDsn]
  }
  @scala.inline
  implicit class MessageDsnOps[Self <: MessageDsn] (val x: Self) extends AnyVal {
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
    def setReportingMta(value: ReportingMta): Self = this.set("ReportingMta", value.asInstanceOf[js.Any])
    @scala.inline
    def setArrivalDate(value: ArrivalDate): Self = this.set("ArrivalDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrivalDate: Self = this.set("ArrivalDate", js.undefined)
    @scala.inline
    def setExtensionFieldsVarargs(value: ExtensionField*): Self = this.set("ExtensionFields", js.Array(value :_*))
    @scala.inline
    def setExtensionFields(value: ExtensionFieldList): Self = this.set("ExtensionFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensionFields: Self = this.set("ExtensionFields", js.undefined)
  }
  
}

