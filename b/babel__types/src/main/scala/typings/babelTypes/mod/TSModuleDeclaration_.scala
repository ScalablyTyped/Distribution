package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSModuleDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSModuleDeclaration_
  extends Declaration
     with BaseNode
     with Statement {
  var body: TSModuleBlock_ | TSModuleDeclaration_
  var declare: Boolean | Null
  var global: Boolean | Null
  var id: Identifier_ | StringLiteral_
  @JSName("type")
  var type_TSModuleDeclaration_ : TSModuleDeclaration
}

object TSModuleDeclaration_ {
  @scala.inline
  def apply(
    body: TSModuleBlock_ | TSModuleDeclaration_,
    id: Identifier_ | StringLiteral_,
    `type`: TSModuleDeclaration,
    declare: Boolean = null.asInstanceOf[Boolean],
    end: Double = null.asInstanceOf[Double],
    global: Boolean = null.asInstanceOf[Boolean],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): TSModuleDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], declare = declare.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSModuleDeclaration_]
  }
}

