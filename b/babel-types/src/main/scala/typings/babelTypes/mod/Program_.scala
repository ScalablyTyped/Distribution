package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.Program
import typings.babelTypes.babelTypesStrings.module
import typings.babelTypes.babelTypesStrings.script
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Program_
  extends Node
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
  @scala.inline
  def apply(
    body: js.Array[Statement | ModuleDeclaration],
    end: Double,
    loc: SourceLocation,
    sourceType: script | module,
    start: Double,
    `type`: Program,
    directives: js.Array[Directive_] = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): Program_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Program_]
  }
}

