package typings.typescriptNn5FuAjk.mod

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagnosticMessageChain extends StObject {
  
  var category: DiagnosticCategory
  
  var code: Double
  
  var messageText: java.lang.String
  
  var next: js.UndefOr[Array[DiagnosticMessageChain]] = js.undefined
}
object DiagnosticMessageChain {
  
  inline def apply(category: DiagnosticCategory, code: Double, messageText: java.lang.String): DiagnosticMessageChain = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], messageText = messageText.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticMessageChain]
  }
  
  extension [Self <: DiagnosticMessageChain](x: Self) {
    
    inline def setCategory(value: DiagnosticCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessageText(value: java.lang.String): Self = StObject.set(x, "messageText", value.asInstanceOf[js.Any])
    
    inline def setNext(value: Array[DiagnosticMessageChain]): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
  }
}
