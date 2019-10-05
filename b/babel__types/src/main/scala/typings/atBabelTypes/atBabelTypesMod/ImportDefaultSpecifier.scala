package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait ImportDefaultSpecifier
  extends ModuleSpecifier
     with BaseNode {
  var local: Identifier
  @JSName("type")
  var type_ImportDefaultSpecifier: typings.atBabelTypes.atBabelTypesStrings.ImportDefaultSpecifier
}

object ImportDefaultSpecifier {
  @scala.inline
  def apply(
    local: Identifier,
    `type`: typings.atBabelTypes.atBabelTypesStrings.ImportDefaultSpecifier,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): ImportDefaultSpecifier = {
    val __obj = js.Dynamic.literal(local = local)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ImportDefaultSpecifier]
  }
}

@JSImport("@babel/types", "importDefaultSpecifier")
@js.native
object importDefaultSpecifier extends js.Object {
  def apply(local: Identifier): ImportDefaultSpecifier = js.native
}

