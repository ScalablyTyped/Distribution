package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait TSQualifiedName
  extends TSEntityName
     with BaseNode {
  var left: TSEntityName
  var right: Identifier
  @JSName("type")
  var type_TSQualifiedName: typings.atBabelTypes.atBabelTypesStrings.TSQualifiedName
}

object TSQualifiedName {
  @scala.inline
  def apply(
    left: TSEntityName,
    right: Identifier,
    `type`: typings.atBabelTypes.atBabelTypesStrings.TSQualifiedName,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): TSQualifiedName = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSQualifiedName]
  }
}

@JSImport("@babel/types", "tsQualifiedName")
@js.native
object tsQualifiedName extends js.Object {
  def apply(left: TSEntityName, right: Identifier): TSQualifiedName = js.native
}

