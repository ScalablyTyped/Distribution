package typings
package babelDashTypesLib.babelDashTypesMod

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
  var type_DeclareModule: babelDashTypesLib.babelDashTypesLibStrings.DeclareModule
}

object DeclareModule {
  @scala.inline
  def apply(
    body: BlockStatement,
    end: scala.Double,
    id: StringLiteral | Identifier,
    loc: SourceLocation,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.DeclareModule,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): DeclareModule = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("start")(start)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[DeclareModule]
  }
}

