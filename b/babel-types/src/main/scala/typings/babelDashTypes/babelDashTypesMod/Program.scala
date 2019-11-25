package typings.babelDashTypes.babelDashTypesMod

import typings.babelDashTypes.babelDashTypesStrings.module
import typings.babelDashTypes.babelDashTypesStrings.script
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
  var sourceType: script | module
  @JSName("type")
  var type_Program: typings.babelDashTypes.babelDashTypesStrings.Program
}

object Program {
  @scala.inline
  def apply(
    body: js.Array[Statement | ModuleDeclaration],
    end: Double,
    loc: SourceLocation,
    sourceType: script | module,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.Program,
    directives: js.Array[Directive] = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): Program = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Program]
  }
}

@JSImport("babel-types", "program")
@js.native
object program extends js.Object {
  def apply(): Program = js.native
  def apply(body: js.Array[Statement | ModuleDeclaration]): Program = js.native
  def apply(body: js.Array[Statement | ModuleDeclaration], directives: js.Array[Directive]): Program = js.native
}

