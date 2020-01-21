package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.QualifiedTypeIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QualifiedTypeIdentifier_
  extends Node
     with Flow {
  var id: Identifier_
  var qualification: Identifier_ | QualifiedTypeIdentifier_
  @JSName("type")
  var type_QualifiedTypeIdentifier_ : QualifiedTypeIdentifier
}

object QualifiedTypeIdentifier_ {
  @scala.inline
  def apply(
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    qualification: Identifier_ | QualifiedTypeIdentifier_,
    start: Double,
    `type`: QualifiedTypeIdentifier,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): QualifiedTypeIdentifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], qualification = qualification.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[QualifiedTypeIdentifier_]
  }
}

