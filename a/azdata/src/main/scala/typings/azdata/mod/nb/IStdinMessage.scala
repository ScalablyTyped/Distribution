package typings.azdata.mod.nb

import typings.azdata.anon.Password
import typings.azdata.azdataStrings.stdin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStdinMessage extends IMessage {
  
  var channel: stdin = js.native
  
  @JSName("content")
  var content_IStdinMessage: Password = js.native
}
object IStdinMessage {
  
  @scala.inline
  def apply(
    channel: stdin,
    content: Password,
    header: IHeader,
    parent_header: IHeader | js.Object,
    `type`: Channel
  ): IStdinMessage = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStdinMessage]
  }
  
  @scala.inline
  implicit class IStdinMessageMutableBuilder[Self <: IStdinMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: stdin): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: Password): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
