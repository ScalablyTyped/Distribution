package typings.chevrotainTypes.anon

import typings.chevrotainTypes.mod.TokenType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Label extends StObject {
  
  var idx: js.UndefOr[Double] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var terminalType: TokenType
}
object Label {
  
  inline def apply(terminalType: TokenType): Label = {
    val __obj = js.Dynamic.literal(terminalType = terminalType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
    
    inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
    
    inline def setIdxUndefined: Self = StObject.set(x, "idx", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setTerminalType(value: TokenType): Self = StObject.set(x, "terminalType", value.asInstanceOf[js.Any])
  }
}
