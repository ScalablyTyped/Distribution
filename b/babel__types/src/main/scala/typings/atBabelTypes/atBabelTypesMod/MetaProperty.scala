package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait MetaProperty
  extends Expression
     with BaseNode {
  var meta: Identifier
  var property: Identifier
  @JSName("type")
  var type_MetaProperty: typings.atBabelTypes.atBabelTypesStrings.MetaProperty
}

object MetaProperty {
  @scala.inline
  def apply(
    meta: Identifier,
    property: Identifier,
    `type`: typings.atBabelTypes.atBabelTypesStrings.MetaProperty,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): MetaProperty = {
    val __obj = js.Dynamic.literal(meta = meta, property = property)
    __obj.updateDynamic("type")(`type`)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[MetaProperty]
  }
}

@JSImport("@babel/types", "metaProperty")
@js.native
object metaProperty extends js.Object {
  def apply(meta: Identifier, property: Identifier): MetaProperty = js.native
}

