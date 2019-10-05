package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait TSModuleBlock
  extends Block
     with BaseNode
     with BlockParent
     with Scopable {
  var body: js.Array[Statement]
  @JSName("type")
  var type_TSModuleBlock: typings.atBabelTypes.atBabelTypesStrings.TSModuleBlock
}

object TSModuleBlock {
  @scala.inline
  def apply(
    body: js.Array[Statement],
    `type`: typings.atBabelTypes.atBabelTypesStrings.TSModuleBlock,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): TSModuleBlock = {
    val __obj = js.Dynamic.literal(body = body)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TSModuleBlock]
  }
}

@JSImport("@babel/types", "tsModuleBlock")
@js.native
object tsModuleBlock extends js.Object {
  def apply(body: js.Array[Statement]): TSModuleBlock = js.native
}

