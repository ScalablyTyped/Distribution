package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QualifiedTypeIdentifier
  extends Node
     with Flow {
  var id: Identifier
  var qualification: Identifier | QualifiedTypeIdentifier
  @JSName("type")
  var type_QualifiedTypeIdentifier: babelDashTypesLib.babelDashTypesLibStrings.QualifiedTypeIdentifier
}

object QualifiedTypeIdentifier {
  @scala.inline
  def apply(
    end: scala.Double,
    id: Identifier,
    loc: SourceLocation,
    qualification: Identifier | QualifiedTypeIdentifier,
    start: scala.Double,
    `type`: babelDashTypesLib.babelDashTypesLibStrings.QualifiedTypeIdentifier,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): QualifiedTypeIdentifier = {
    val __obj = js.Dynamic.literal(end = end, id = id, loc = loc, qualification = qualification.asInstanceOf[js.Any], start = start)
    __obj.updateDynamic("type")(`type`)
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[QualifiedTypeIdentifier]
  }
}

