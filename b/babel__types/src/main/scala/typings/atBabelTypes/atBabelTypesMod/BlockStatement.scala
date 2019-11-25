package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait BlockStatement
  extends Block
     with BaseNode
     with BlockParent
     with Scopable
     with Statement {
  var body: js.Array[Statement]
  var directives: js.Array[Directive]
  @JSName("type")
  var type_BlockStatement: typings.atBabelTypes.atBabelTypesStrings.BlockStatement
}

object BlockStatement {
  @scala.inline
  def apply(
    body: js.Array[Statement],
    directives: js.Array[Directive],
    `type`: typings.atBabelTypes.atBabelTypesStrings.BlockStatement,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): BlockStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockStatement]
  }
}

@JSImport("@babel/types", "blockStatement")
@js.native
object blockStatement extends js.Object {
  def apply(body: js.Array[Statement]): BlockStatement = js.native
  def apply(body: js.Array[Statement], directives: js.Array[Directive]): BlockStatement = js.native
}

