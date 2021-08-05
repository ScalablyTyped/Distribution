package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.Program
import typings.babelTypes.babelTypesStrings.module
import typings.babelTypes.babelTypesStrings.script
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Program_
  extends StObject
     with Node
     with Block
     with BlockParent
     with FunctionParent
     with Scopable {
  
  var body: js.Array[Statement | ModuleDeclaration]
  
  var directives: js.UndefOr[js.Array[Directive_]] = js.undefined
  
  var sourceType: script | module
  
  @JSName("type")
  var type_Program_ : Program
}
object Program_ {
  
  inline def apply(
    body: js.Array[Statement | ModuleDeclaration],
    end: Double,
    loc: SourceLocation,
    sourceType: script | module,
    start: Double
  ): Program_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Program")
    __obj.asInstanceOf[Program_]
  }
  
  extension [Self <: Program_](x: Self) {
    
    inline def setBody(value: js.Array[Statement | ModuleDeclaration]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: (Statement | ModuleDeclaration)*): Self = StObject.set(x, "body", js.Array(value :_*))
    
    inline def setDirectives(value: js.Array[Directive_]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    
    inline def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
    
    inline def setDirectivesVarargs(value: Directive_ *): Self = StObject.set(x, "directives", js.Array(value :_*))
    
    inline def setSourceType(value: script | module): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    inline def setType(value: Program): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
