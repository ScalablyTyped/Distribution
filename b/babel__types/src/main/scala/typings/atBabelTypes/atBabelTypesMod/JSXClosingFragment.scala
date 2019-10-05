package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait JSXClosingFragment
  extends Immutable
     with BaseNode
     with JSX {
  @JSName("type")
  var type_JSXClosingFragment: typings.atBabelTypes.atBabelTypesStrings.JSXClosingFragment
}

object JSXClosingFragment {
  @scala.inline
  def apply(
    `type`: typings.atBabelTypes.atBabelTypesStrings.JSXClosingFragment,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): JSXClosingFragment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[JSXClosingFragment]
  }
}

@JSImport("@babel/types", "jsxClosingFragment")
@js.native
object jsxClosingFragment extends js.Object {
  def apply(): JSXClosingFragment = js.native
}

