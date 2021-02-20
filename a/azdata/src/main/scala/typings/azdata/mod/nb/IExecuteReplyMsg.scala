package typings.azdata.mod.nb

import typings.azdata.azdataStrings.shell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IExecuteReplyMsg extends IShellMessage {
  
  @JSName("content")
  var content_IExecuteReplyMsg: IExecuteReply = js.native
}
object IExecuteReplyMsg {
  
  @scala.inline
  def apply(
    channel: shell,
    content: IExecuteReply,
    header: IHeader,
    parent_header: IHeader | js.Object,
    `type`: Channel
  ): IExecuteReplyMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteReplyMsg]
  }
  
  @scala.inline
  implicit class IExecuteReplyMsgMutableBuilder[Self <: IExecuteReplyMsg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: IExecuteReply): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
