package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Program
  extends Node
     with Block
     with BlockParent
     with FunctionParent
     with Scopable {
  var body: js.Array[Statement | ModuleDeclaration]
  var directives: js.UndefOr[js.Array[Directive]] = js.undefined
  var sourceType: babelDashTypesLib.babelDashTypesLibStrings.script | babelDashTypesLib.babelDashTypesLibStrings.module
  @JSName("type")
  var type_Program: babelDashTypesLib.babelDashTypesLibStrings.Program
}

object Program {
  @scala.inline
  def apply(
    body: js.Array[Statement | ModuleDeclaration],
    end: scala.Double,
    loc: SourceLocation,
    sourceType: babelDashTypesLib.babelDashTypesLibStrings.script | babelDashTypesLib.babelDashTypesLibStrings.module,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.Program,
    directives: js.Array[Directive] = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): Program = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("sourceType")(sourceType.asInstanceOf[js.Any])
    __obj.updateDynamic("start")(start)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[Program]
  }
}

