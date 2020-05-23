package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ForStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait ForStatement_
  extends BlockParent
     with BaseNode
     with For
     with Loop
     with Scopable
     with Statement {
  var body: Statement
  var init: VariableDeclaration_ | Expression | Null
  var test: Expression | Null
  @JSName("type")
  var type_ForStatement_ : ForStatement
  var update: Expression | Null
}

object ForStatement_ {
  @scala.inline
  def apply(
    body: Statement,
    `type`: ForStatement,
    end: Double = null.asInstanceOf[Double],
    init: VariableDeclaration_ | Expression = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    test: Expression = null,
    trailingComments: js.Array[Comment] = null,
    update: Expression = null
  ): ForStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForStatement_]
  }
}

