package typings.azdata.mod.nb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IExecuteReplyMsg
  extends StObject
     with IShellMessage {
  
  @JSName("content")
  var content_IExecuteReplyMsg: IExecuteReply
}
object IExecuteReplyMsg {
  
  inline def apply(content: IExecuteReply, header: IHeader, parent_header: IHeader | js.Object, `type`: Channel): IExecuteReplyMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteReplyMsg]
  }
  
  extension [Self <: IExecuteReplyMsg](x: Self) {
    
    inline def setContent(value: IExecuteReply): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
