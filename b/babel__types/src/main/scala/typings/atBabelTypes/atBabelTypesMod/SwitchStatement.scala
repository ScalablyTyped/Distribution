package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait SwitchStatement
  extends BlockParent
     with BaseNode
     with Scopable
     with Statement {
  var cases: js.Array[SwitchCase]
  var discriminant: Expression
  @JSName("type")
  var type_SwitchStatement: typings.atBabelTypes.atBabelTypesStrings.SwitchStatement
}

object SwitchStatement {
  @scala.inline
  def apply(
    cases: js.Array[SwitchCase],
    discriminant: Expression,
    `type`: typings.atBabelTypes.atBabelTypesStrings.SwitchStatement,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): SwitchStatement = {
    val __obj = js.Dynamic.literal(cases = cases, discriminant = discriminant)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[SwitchStatement]
  }
}

