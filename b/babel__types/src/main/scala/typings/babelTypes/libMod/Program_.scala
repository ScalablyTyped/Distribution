package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Program_
  extends StObject
     with BaseNode {
  
  var body: js.Array[Statement]
  
  var directives: js.Array[Directive_]
  
  var interpreter: js.UndefOr[InterpreterDirective_ | Null] = js.undefined
  
  var sourceFile: String
  
  var sourceType: "script" | "module"
  
  @JSName("type")
  var type_Program_ : "Program"
}
object Program_ {
  
  inline def apply(
    body: js.Array[Statement],
    directives: js.Array[Directive_],
    sourceFile: String,
    sourceType: "script" | "module"
  ): Program_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Program")
    __obj.asInstanceOf[Program_]
  }
  
  extension [Self <: Program_](x: Self) {
    
    inline def setBody(value: js.Array[Statement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: Statement*): Self = StObject.set(x, "body", js.Array(value*))
    
    inline def setDirectives(value: js.Array[Directive_]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    
    inline def setDirectivesVarargs(value: Directive_ *): Self = StObject.set(x, "directives", js.Array(value*))
    
    inline def setInterpreter(value: InterpreterDirective_): Self = StObject.set(x, "interpreter", value.asInstanceOf[js.Any])
    
    inline def setInterpreterNull: Self = StObject.set(x, "interpreter", null)
    
    inline def setInterpreterUndefined: Self = StObject.set(x, "interpreter", js.undefined)
    
    inline def setSourceFile(value: String): Self = StObject.set(x, "sourceFile", value.asInstanceOf[js.Any])
    
    inline def setSourceType(value: "script" | "module"): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    inline def setType(value: "Program"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
