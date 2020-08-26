package typings.awsSdkClientPinpointBrowser.typesSmsmessageMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.PROMOTIONAL
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.TRANSACTIONAL
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SMSMessage extends js.Object {
  /**
    * The body of the SMS message.
    */
  var Body: js.UndefOr[String] = js.native
  /**
    * The SMS program name that you provided to AWS Support when you requested your dedicated number.
    */
  var Keyword: js.UndefOr[String] = js.native
  /**
    * Is this a transaction priority message or lower priority.
    */
  var MessageType: js.UndefOr[TRANSACTIONAL | PROMOTIONAL | String] = js.native
  /**
    * The phone number that the SMS message originates from. Specify one of the dedicated long codes or short codes that you requested from AWS Support and that is assigned to your account. If this attribute is not specified, Amazon Pinpoint randomly assigns a long code.
    */
  var OriginationNumber: js.UndefOr[String] = js.native
  /**
    * The sender ID that is shown as the message sender on the recipient's device. Support for sender IDs varies by country or region.
    */
  var SenderId: js.UndefOr[String] = js.native
  /**
    * Default message substitutions. Can be overridden by individual address substitutions.
    */
  var Substitutions: js.UndefOr[
    (StringDictionary[js.Array[String] | Iterable[String]]) | (Iterable[js.Tuple2[String, js.Array[String] | Iterable[String]]])
  ] = js.native
}

object SMSMessage {
  @scala.inline
  def apply(): SMSMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SMSMessage]
  }
  @scala.inline
  implicit class SMSMessageOps[Self <: SMSMessage] (val x: Self) extends AnyVal {
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
    def setBody(value: String): Self = this.set("Body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("Body", js.undefined)
    @scala.inline
    def setKeyword(value: String): Self = this.set("Keyword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyword: Self = this.set("Keyword", js.undefined)
    @scala.inline
    def setMessageType(value: TRANSACTIONAL | PROMOTIONAL | String): Self = this.set("MessageType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageType: Self = this.set("MessageType", js.undefined)
    @scala.inline
    def setOriginationNumber(value: String): Self = this.set("OriginationNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginationNumber: Self = this.set("OriginationNumber", js.undefined)
    @scala.inline
    def setSenderId(value: String): Self = this.set("SenderId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSenderId: Self = this.set("SenderId", js.undefined)
    @scala.inline
    def setSubstitutions(
      value: (StringDictionary[js.Array[String] | Iterable[String]]) | (Iterable[js.Tuple2[String, js.Array[String] | Iterable[String]]])
    ): Self = this.set("Substitutions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubstitutions: Self = this.set("Substitutions", js.undefined)
  }
  
}

