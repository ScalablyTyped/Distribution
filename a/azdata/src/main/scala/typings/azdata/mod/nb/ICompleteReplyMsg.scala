package typings.azdata.mod.nb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICompleteReplyMsg
  extends StObject
     with IShellMessage {
  
  @JSName("content")
  var content_ICompleteReplyMsg: ICompletionContent
}
object ICompleteReplyMsg {
  
  inline def apply(content: ICompletionContent, header: IHeader, parent_header: IHeader | js.Object, `type`: Channel): ICompleteReplyMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompleteReplyMsg]
  }
  
  extension [Self <: ICompleteReplyMsg](x: Self) {
    
    inline def setContent(value: ICompletionContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
