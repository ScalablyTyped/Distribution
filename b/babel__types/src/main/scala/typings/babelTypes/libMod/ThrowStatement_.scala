package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.ThrowStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThrowStatement_
  extends StObject
     with BaseNode
     with CompletionStatement
     with Node
     with Standardized
     with Statement
     with Terminatorless {
  
  var argument: Expression
  
  @JSName("type")
  var type_ThrowStatement_ : ThrowStatement
}
object ThrowStatement_ {
  
  inline def apply(argument: Expression): ThrowStatement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ThrowStatement")
    __obj.asInstanceOf[ThrowStatement_]
  }
  
  extension [Self <: ThrowStatement_](x: Self) {
    
    inline def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setType(value: ThrowStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
