package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ContinueStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinueStatement_
  extends StObject
     with Node
     with CompletionStatement
     with Statement
     with Terminatorless {
  
  var label: Identifier_
  
  @JSName("type")
  var type_ContinueStatement_ : ContinueStatement
}
object ContinueStatement_ {
  
  inline def apply(end: Double, label: Identifier_, loc: SourceLocation, start: Double): ContinueStatement_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ContinueStatement")
    __obj.asInstanceOf[ContinueStatement_]
  }
  
  extension [Self <: ContinueStatement_](x: Self) {
    
    inline def setLabel(value: Identifier_): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setType(value: ContinueStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
