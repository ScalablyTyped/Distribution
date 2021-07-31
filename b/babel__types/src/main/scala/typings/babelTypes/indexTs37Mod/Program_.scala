package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.Program
import typings.babelTypes.babelTypesStrings.module
import typings.babelTypes.babelTypesStrings.script
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait Program_
  extends StObject
     with BaseNode
     with Block
     with BlockParent
     with Scopable {
  
  var body: js.Array[Statement]
  
  var directives: js.Array[Directive_]
  
  var interpreter: InterpreterDirective_ | Null
  
  var sourceFile: String
  
  var sourceType: script | module
  
  @JSName("type")
  var type_Program_ : Program
}
object Program_ {
  
  @scala.inline
  def apply(
    body: js.Array[Statement],
    directives: js.Array[Directive_],
    sourceFile: String,
    sourceType: script | module
  ): Program_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any], end = null, innerComments = null, interpreter = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("Program")
    __obj.asInstanceOf[Program_]
  }
  
  @scala.inline
  implicit class Program_MutableBuilder[Self <: Program_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: js.Array[Statement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyVarargs(value: Statement*): Self = StObject.set(x, "body", js.Array(value :_*))
    
    @scala.inline
    def setDirectives(value: js.Array[Directive_]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectivesVarargs(value: Directive_ *): Self = StObject.set(x, "directives", js.Array(value :_*))
    
    @scala.inline
    def setInterpreter(value: InterpreterDirective_): Self = StObject.set(x, "interpreter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpreterNull: Self = StObject.set(x, "interpreter", null)
    
    @scala.inline
    def setSourceFile(value: String): Self = StObject.set(x, "sourceFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceType(value: script | module): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Program): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
