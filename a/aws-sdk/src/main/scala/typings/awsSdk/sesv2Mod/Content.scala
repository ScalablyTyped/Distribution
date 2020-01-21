package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Content extends js.Object {
  /**
    * The character set for the content. Because of the constraints of the SMTP protocol, Amazon SES uses 7-bit ASCII by default. If the text includes characters outside of the ASCII range, you have to specify a character set. For example, you could specify UTF-8, ISO-8859-1, or Shift_JIS.
    */
  var Charset: js.UndefOr[typings.awsSdk.sesv2Mod.Charset] = js.native
  /**
    * The content of the message itself.
    */
  var Data: MessageData = js.native
}

object Content {
  @scala.inline
  def apply(Data: MessageData, Charset: Charset = null): Content = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any])
    if (Charset != null) __obj.updateDynamic("Charset")(Charset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
}

