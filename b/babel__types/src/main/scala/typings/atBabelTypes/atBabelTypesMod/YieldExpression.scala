package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait YieldExpression
  extends Expression
     with BaseNode
     with Terminatorless {
  var argument: Expression | Null
  var delegate: Boolean
  @JSName("type")
  var type_YieldExpression: typings.atBabelTypes.atBabelTypesStrings.YieldExpression
}

object YieldExpression {
  @scala.inline
  def apply(
    delegate: Boolean,
    `type`: typings.atBabelTypes.atBabelTypesStrings.YieldExpression,
    argument: Expression = null,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): YieldExpression = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (argument != null) __obj.updateDynamic("argument")(argument.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[YieldExpression]
  }
}

@JSImport("@babel/types", "yieldExpression")
@js.native
object yieldExpression extends js.Object {
  def apply(): YieldExpression = js.native
  def apply(argument: Null, delegate: Boolean): YieldExpression = js.native
  def apply(argument: Expression): YieldExpression = js.native
  def apply(argument: Expression, delegate: Boolean): YieldExpression = js.native
}

