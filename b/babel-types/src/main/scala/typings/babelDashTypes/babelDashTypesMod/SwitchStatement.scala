package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchStatement
  extends Node
     with BlockParent
     with Scopable
     with Statement {
  var cases: js.Array[SwitchCase]
  var discriminant: Expression
  @JSName("type")
  var type_SwitchStatement: typings.babelDashTypes.babelDashTypesStrings.SwitchStatement
}

object SwitchStatement {
  @scala.inline
  def apply(
    cases: js.Array[SwitchCase],
    discriminant: Expression,
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.SwitchStatement,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): SwitchStatement = {
    val __obj = js.Dynamic.literal(cases = cases, discriminant = discriminant, end = end, loc = loc, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[SwitchStatement]
  }
}

