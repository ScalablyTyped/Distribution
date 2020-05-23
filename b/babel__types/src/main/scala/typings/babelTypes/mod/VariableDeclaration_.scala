package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.VariableDeclaration
import typings.babelTypes.babelTypesStrings.`var`
import typings.babelTypes.babelTypesStrings.const
import typings.babelTypes.babelTypesStrings.let
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait VariableDeclaration_
  extends Declaration
     with BaseNode
     with Statement {
  var declarations: js.Array[VariableDeclarator_]
  var declare: Boolean | Null
  var kind: `var` | let | const
  @JSName("type")
  var type_VariableDeclaration_ : VariableDeclaration
}

object VariableDeclaration_ {
  @scala.inline
  def apply(
    declarations: js.Array[VariableDeclarator_],
    kind: `var` | let | const,
    `type`: VariableDeclaration,
    declare: Boolean = null.asInstanceOf[Boolean],
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): VariableDeclaration_ = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], declare = declare.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableDeclaration_]
  }
}

