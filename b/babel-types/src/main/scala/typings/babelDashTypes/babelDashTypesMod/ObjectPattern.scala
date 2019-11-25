package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectPattern
  extends Node
     with LVal
     with Pattern {
  var properties: js.Array[AssignmentProperty | RestProperty]
  var typeAnnotation: js.UndefOr[TypeAnnotation] = js.undefined
  @JSName("type")
  var type_ObjectPattern: typings.babelDashTypes.babelDashTypesStrings.ObjectPattern
}

object ObjectPattern {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    properties: js.Array[AssignmentProperty | RestProperty],
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.ObjectPattern,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TypeAnnotation = null
  ): ObjectPattern = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectPattern]
  }
}

@JSImport("babel-types", "objectPattern")
@js.native
object objectPattern extends js.Object {
  def apply(): ObjectPattern = js.native
  def apply(properties: js.Array[AssignmentProperty | RestProperty]): ObjectPattern = js.native
  def apply(properties: js.Array[AssignmentProperty | RestProperty], typeAnnotation: TypeAnnotation): ObjectPattern = js.native
}

