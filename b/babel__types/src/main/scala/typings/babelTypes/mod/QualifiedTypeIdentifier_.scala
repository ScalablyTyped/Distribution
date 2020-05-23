package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.QualifiedTypeIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait QualifiedTypeIdentifier_
  extends Flow
     with BaseNode {
  var id: Identifier_
  var qualification: Identifier_ | QualifiedTypeIdentifier_
  @JSName("type")
  var type_QualifiedTypeIdentifier_ : QualifiedTypeIdentifier
}

object QualifiedTypeIdentifier_ {
  @scala.inline
  def apply(
    id: Identifier_,
    qualification: Identifier_ | QualifiedTypeIdentifier_,
    `type`: QualifiedTypeIdentifier,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): QualifiedTypeIdentifier_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], qualification = qualification.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QualifiedTypeIdentifier_]
  }
}

