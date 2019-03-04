package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait Program
  extends Block
     with BaseNode
     with BlockParent
     with Scopable {
  var body: js.Array[Statement]
  var directives: js.Array[Directive]
  var interpreter: InterpreterDirective | scala.Null
  var sourceFile: java.lang.String | scala.Null
  var sourceType: atBabelTypesLib.atBabelTypesLibStrings.script | atBabelTypesLib.atBabelTypesLibStrings.module
  @JSName("type")
  var type_Program: atBabelTypesLib.atBabelTypesLibStrings.Program
}

object Program {
  @scala.inline
  def apply(
    body: js.Array[Statement],
    directives: js.Array[Directive],
    sourceType: atBabelTypesLib.atBabelTypesLibStrings.script | atBabelTypesLib.atBabelTypesLibStrings.module,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.Program,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    interpreter: InterpreterDirective = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    sourceFile: java.lang.String = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null
  ): Program = {
    val __obj = js.Dynamic.literal(body = body, directives = directives, sourceType = sourceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (interpreter != null) __obj.updateDynamic("interpreter")(interpreter)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (sourceFile != null) __obj.updateDynamic("sourceFile")(sourceFile)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[Program]
  }
}

