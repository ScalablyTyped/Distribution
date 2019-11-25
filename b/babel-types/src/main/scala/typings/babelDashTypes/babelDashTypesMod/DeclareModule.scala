package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclareModule
  extends Node
     with Declaration
     with Flow
     with FlowDeclaration
     with Statement {
  var body: BlockStatement
  var id: StringLiteral | Identifier
  @JSName("type")
  var type_DeclareModule: typings.babelDashTypes.babelDashTypesStrings.DeclareModule
}

object DeclareModule {
  @scala.inline
  def apply(
    body: BlockStatement,
    end: Double,
    id: StringLiteral | Identifier,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.DeclareModule,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): DeclareModule = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareModule]
  }
}

@JSImport("babel-types", "declareModule")
@js.native
object declareModule extends js.Object {
  def apply(): DeclareModule = js.native
  def apply(id: Identifier): DeclareModule = js.native
  def apply(id: Identifier, body: BlockStatement): DeclareModule = js.native
  def apply(id: StringLiteral): DeclareModule = js.native
  def apply(id: StringLiteral, body: BlockStatement): DeclareModule = js.native
}

