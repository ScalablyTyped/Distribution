package typings.atBabelTypes.atBabelTypesMod

import typings.atBabelTypes.atBabelTypesStrings.module
import typings.atBabelTypes.atBabelTypesStrings.script
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait Program
  extends Block
     with BaseNode
     with BlockParent
     with Scopable {
  var body: js.Array[Statement]
  var directives: js.Array[Directive]
  var interpreter: InterpreterDirective | Null
  var sourceFile: String | Null
  var sourceType: script | module
  @JSName("type")
  var type_Program: typings.atBabelTypes.atBabelTypesStrings.Program
}

object Program {
  @scala.inline
  def apply(
    body: js.Array[Statement],
    directives: js.Array[Directive],
    sourceType: script | module,
    `type`: typings.atBabelTypes.atBabelTypesStrings.Program,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    interpreter: InterpreterDirective = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    sourceFile: String = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): Program = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (interpreter != null) __obj.updateDynamic("interpreter")(interpreter.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (sourceFile != null) __obj.updateDynamic("sourceFile")(sourceFile.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Program]
  }
}

@JSImport("@babel/types", "program")
@js.native
object program extends js.Object {
  def apply(body: js.Array[Statement]): Program = js.native
  def apply(body: js.Array[Statement], directives: js.Array[Directive]): Program = js.native
}

