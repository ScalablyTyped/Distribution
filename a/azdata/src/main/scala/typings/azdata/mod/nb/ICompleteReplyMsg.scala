package typings.azdata.mod.nb

import typings.azdata.azdataStrings.shell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICompleteReplyMsg extends IShellMessage {
  
  @JSName("content")
  var content_ICompleteReplyMsg: ICompletionContent = js.native
}
object ICompleteReplyMsg {
  
  @scala.inline
  def apply(
    channel: shell,
    content: ICompletionContent,
    header: IHeader,
    parent_header: IHeader | js.Object,
    `type`: Channel
  ): ICompleteReplyMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompleteReplyMsg]
  }
  
  @scala.inline
  implicit class ICompleteReplyMsgMutableBuilder[Self <: ICompleteReplyMsg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: ICompletionContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
