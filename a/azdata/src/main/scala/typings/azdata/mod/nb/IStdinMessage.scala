package typings.azdata.mod.nb

import typings.azdata.anon.Password
import typings.azdata.azdataStrings.stdin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStdinMessage
  extends StObject
     with IMessage {
  
  var channel: stdin
  
  @JSName("content")
  var content_IStdinMessage: Password
}
object IStdinMessage {
  
  inline def apply(content: Password, header: IHeader, parent_header: IHeader | js.Object, `type`: Channel): IStdinMessage = {
    val __obj = js.Dynamic.literal(channel = "stdin", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStdinMessage]
  }
  
  extension [Self <: IStdinMessage](x: Self) {
    
    inline def setChannel(value: stdin): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setContent(value: Password): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
