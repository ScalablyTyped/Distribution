package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.bufbuildProtobufStrings.message_
import typings.bufbuildProtobuf.distTypesMessageMod.AnyMessage
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KindT extends StObject {
  
  val T: MessageType[AnyMessage]
  
  val kind: message_
}
object KindT {
  
  inline def apply(T: MessageType[AnyMessage]): KindT = {
    val __obj = js.Dynamic.literal(T = T.asInstanceOf[js.Any], kind = "message")
    __obj.asInstanceOf[KindT]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KindT] (val x: Self) extends AnyVal {
    
    inline def setKind(value: message_): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setT(value: MessageType[AnyMessage]): Self = StObject.set(x, "T", value.asInstanceOf[js.Any])
  }
}
