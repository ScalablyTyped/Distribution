package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait DeclareModule
  extends Declaration
     with BaseNode
     with Flow
     with FlowDeclaration
     with Statement {
  var body: BlockStatement
  var id: Identifier | StringLiteral
  var kind: atBabelTypesLib.atBabelTypesLibStrings.CommonJS | atBabelTypesLib.atBabelTypesLibStrings.ES | scala.Null
  @JSName("type")
  var type_DeclareModule: atBabelTypesLib.atBabelTypesLibStrings.DeclareModule
}

object DeclareModule {
  @scala.inline
  def apply(
    body: BlockStatement,
    id: Identifier | StringLiteral,
    `type`: atBabelTypesLib.atBabelTypesLibStrings.DeclareModule,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    kind: atBabelTypesLib.atBabelTypesLibStrings.CommonJS | atBabelTypesLib.atBabelTypesLibStrings.ES = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null
  ): DeclareModule = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[DeclareModule]
  }
}

