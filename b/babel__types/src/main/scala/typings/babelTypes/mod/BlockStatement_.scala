package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.BlockStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait BlockStatement_
  extends Block
     with BaseNode
     with BlockParent
     with Scopable
     with Statement {
  var body: js.Array[Statement]
  var directives: js.Array[Directive_]
  @JSName("type")
  var type_BlockStatement_ : BlockStatement
}

object BlockStatement_ {
  @scala.inline
  def apply(
    body: js.Array[Statement],
    directives: js.Array[Directive_],
    `type`: BlockStatement,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): BlockStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockStatement_]
  }
}

