package typings.chainsafeLibp2pGossipsub.distSrcTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageId extends StObject {
  
  var msgId: js.typedarray.Uint8Array
  
  var msgIdStr: MsgIdStr
}
object MessageId {
  
  inline def apply(msgId: js.typedarray.Uint8Array, msgIdStr: MsgIdStr): MessageId = {
    val __obj = js.Dynamic.literal(msgId = msgId.asInstanceOf[js.Any], msgIdStr = msgIdStr.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageId]
  }
  
  extension [Self <: MessageId](x: Self) {
    
    inline def setMsgId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "msgId", value.asInstanceOf[js.Any])
    
    inline def setMsgIdStr(value: MsgIdStr): Self = StObject.set(x, "msgIdStr", value.asInstanceOf[js.Any])
  }
}
