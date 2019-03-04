package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atBabelTypesLib.atBabelTypesMod._Node because Already inherited */ trait BlockStatement
  extends Block
     with BaseNode
     with BlockParent
     with Scopable
     with Statement {
  var body: js.Array[Statement]
  var directives: js.Array[Directive]
  @JSName("type")
  var type_BlockStatement: atBabelTypesLib.atBabelTypesLibStrings.BlockStatement
}

object BlockStatement {
  @scala.inline
  def apply(
    body: js.Array[Statement],
    directives: js.Array[Directive],
    `type`: atBabelTypesLib.atBabelTypesLibStrings.BlockStatement,
    end: scala.Int | scala.Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: scala.Int | scala.Double = null,
    trailingComments: js.Array[Comment] = null
  ): BlockStatement = {
    val __obj = js.Dynamic.literal(body = body, directives = directives)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[BlockStatement]
  }
}

