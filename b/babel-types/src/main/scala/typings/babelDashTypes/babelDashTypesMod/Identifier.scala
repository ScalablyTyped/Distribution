package typings.babelDashTypes.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identifier
  extends Node
     with Expression
     with LVal
     with TSEntityName {
  var name: String
  var typeAnnotation: js.UndefOr[TypeAnnotation] = js.undefined
  @JSName("type")
  var type_Identifier: typings.babelDashTypes.babelDashTypesStrings.Identifier
}

object Identifier {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    name: String,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.Identifier,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TypeAnnotation = null
  ): Identifier = {
    val __obj = js.Dynamic.literal(end = end, loc = loc, name = name, start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    __obj.asInstanceOf[Identifier]
  }
}

@JSImport("babel-types", "identifier")
@js.native
object identifier extends js.Object {
  def apply(): Identifier = js.native
  def apply(name: String): Identifier = js.native
}

