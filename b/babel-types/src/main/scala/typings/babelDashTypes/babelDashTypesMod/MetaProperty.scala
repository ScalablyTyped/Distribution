package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaProperty
  extends Node
     with Expression {
  var meta: Identifier
  var property: Identifier
  @JSName("type")
  var type_MetaProperty: typings.babelDashTypes.babelDashTypesStrings.MetaProperty
}

object MetaProperty {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    meta: Identifier,
    property: Identifier,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.MetaProperty,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): MetaProperty = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, meta = meta, property = property, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[MetaProperty]
  }
}

@JSImport("babel-types", "metaProperty")
@js.native
object metaProperty extends js.Object {
  def apply(): MetaProperty = js.native
  def apply(meta: String): MetaProperty = js.native
  def apply(meta: String, property: String): MetaProperty = js.native
}

