package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.BreakStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BreakStatement_
  extends StObject
     with BaseNode
     with CompletionStatement
     with Node
     with Standardized
     with Statement
     with Terminatorless {
  
  var label: js.UndefOr[Identifier_ | Null] = js.undefined
  
  @JSName("type")
  var type_BreakStatement_ : BreakStatement
}
object BreakStatement_ {
  
  inline def apply(): BreakStatement_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("BreakStatement")
    __obj.asInstanceOf[BreakStatement_]
  }
  
  extension [Self <: BreakStatement_](x: Self) {
    
    inline def setLabel(value: Identifier_): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setType(value: BreakStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
