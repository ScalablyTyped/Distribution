package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Content extends js.Object {
  /**
    * The character set of the content.
    */
  var Charset: js.UndefOr[typings.awsSdk.sesMod.Charset] = js.native
  /**
    * The textual data of the content.
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

