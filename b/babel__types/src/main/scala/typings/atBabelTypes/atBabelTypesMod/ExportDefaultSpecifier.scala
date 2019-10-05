package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait ExportDefaultSpecifier
  extends ModuleSpecifier
     with BaseNode {
  var exported: Identifier
  @JSName("type")
  var type_ExportDefaultSpecifier: typings.atBabelTypes.atBabelTypesStrings.ExportDefaultSpecifier
}

object ExportDefaultSpecifier {
  @scala.inline
  def apply(
    exported: Identifier,
    `type`: typings.atBabelTypes.atBabelTypesStrings.ExportDefaultSpecifier,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): ExportDefaultSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ExportDefaultSpecifier]
  }
}

@JSImport("@babel/types", "exportDefaultSpecifier")
@js.native
object exportDefaultSpecifier extends js.Object {
  def apply(exported: Identifier): ExportDefaultSpecifier = js.native
}

