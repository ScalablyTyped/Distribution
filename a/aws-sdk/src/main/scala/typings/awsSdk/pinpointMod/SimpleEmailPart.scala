package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleEmailPart extends js.Object {
  /**
    * The applicable character set for the message content.
    */
  var Charset: js.UndefOr[string] = js.native
  /**
    * The textual data of the message content.
    */
  var Data: js.UndefOr[string] = js.native
}

object SimpleEmailPart {
  @scala.inline
  def apply(Charset: string = null, Data: string = null): SimpleEmailPart = {
    val __obj = js.Dynamic.literal()
    if (Charset != null) __obj.updateDynamic("Charset")(Charset.asInstanceOf[js.Any])
    if (Data != null) __obj.updateDynamic("Data")(Data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleEmailPart]
  }
}

