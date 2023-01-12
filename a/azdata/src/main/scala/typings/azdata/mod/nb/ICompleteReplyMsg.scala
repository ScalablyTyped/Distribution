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
  
  inline def apply(content: ICompletionContent, `type`: Channel): ICompleteReplyMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompleteReplyMsg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICompleteReplyMsg] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ICompletionContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
