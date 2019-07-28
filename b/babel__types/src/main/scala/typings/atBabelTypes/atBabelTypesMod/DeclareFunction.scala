package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait DeclareFunction
  extends Declaration
     with BaseNode
     with Flow
     with FlowDeclaration
     with Statement {
  var id: Identifier
  var predicate: DeclaredPredicate | Null
  @JSName("type")
  var type_DeclareFunction: typings.atBabelTypes.atBabelTypesStrings.DeclareFunction
}

object DeclareFunction {
  @scala.inline
  def apply(
    id: Identifier,
    `type`: typings.atBabelTypes.atBabelTypesStrings.DeclareFunction,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    predicate: DeclaredPredicate = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): DeclareFunction = {
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (predicate != null) __obj.updateDynamic("predicate")(predicate)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[DeclareFunction]
  }
}

