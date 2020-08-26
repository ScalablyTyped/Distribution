package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.Program
import typings.babelTypes.babelTypesStrings.module
import typings.babelTypes.babelTypesStrings.script
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class Program_Ops[Self <: Program_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBodyVarargs(value: Statement*): Self = this.set("body", js.Array(value :_*))
    @scala.inline
    def setBody(value: js.Array[Statement]): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectivesVarargs(value: Directive_ *): Self = this.set("directives", js.Array(value :_*))
    @scala.inline
    def setDirectives(value: js.Array[Directive_]): Self = this.set("directives", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceFile(value: String): Self = this.set("sourceFile", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceType(value: script | module): Self = this.set("sourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Program): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterpreter(value: InterpreterDirective_): Self = this.set("interpreter", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterpreterNull: Self = this.set("interpreter", null)
  }
  
}

