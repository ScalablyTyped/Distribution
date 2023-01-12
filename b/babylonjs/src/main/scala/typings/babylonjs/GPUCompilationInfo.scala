package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUCompilationInfo extends StObject {
  
  val messages: js.Array[GPUCompilationMessage]
}
object GPUCompilationInfo {
  
  inline def apply(messages: js.Array[GPUCompilationMessage]): GPUCompilationInfo = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUCompilationInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUCompilationInfo] (val x: Self) extends AnyVal {
    
    inline def setMessages(value: js.Array[GPUCompilationMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesVarargs(value: GPUCompilationMessage*): Self = StObject.set(x, "messages", js.Array(value*))
  }
}
