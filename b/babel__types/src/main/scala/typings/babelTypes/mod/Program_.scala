package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.Program
import typings.babelTypes.babelTypesStrings.module
import typings.babelTypes.babelTypesStrings.script
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait Program_
  extends Block
     with BaseNode
     with BlockParent
     with Scopable {
  
  var body: js.Array[Statement] = js.native
  
  var directives: js.Array[Directive_] = js.native
  
  var interpreter: InterpreterDirective_ | Null = js.native
  
  var sourceFile: String = js.native
  
  var sourceType: script | module = js.native
  
  @JSName("type")
  var type_Program_ : Program = js.native
}
object Program_ {
  
  @scala.inline
  def apply(
    body: js.Array[Statement],
    directives: js.Array[Directive_],
    sourceFile: String,
    sourceType: script | module,
    `type`: Program
  ): Program_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
