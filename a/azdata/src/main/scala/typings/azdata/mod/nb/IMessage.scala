package typings.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessage extends js.Object {
  var content: js.Any
  var header: IHeader
  var parent_header: IHeader | js.Object
  var `type`: Channel
}

object IMessage {
  @scala.inline
  def apply(content: js.Any, header: IHeader, parent_header: IHeader | js.Object, `type`: Channel): IMessage = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessage]
  }
}

