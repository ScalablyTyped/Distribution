package typings.atBabelTypes.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait QualifiedTypeIdentifier
  extends Flow
     with BaseNode {
  var id: Identifier
  var qualification: Identifier | QualifiedTypeIdentifier
  @JSName("type")
  var type_QualifiedTypeIdentifier: typings.atBabelTypes.atBabelTypesStrings.QualifiedTypeIdentifier
}

object QualifiedTypeIdentifier {
  @scala.inline
  def apply(
    id: Identifier,
    qualification: Identifier | QualifiedTypeIdentifier,
    `type`: typings.atBabelTypes.atBabelTypesStrings.QualifiedTypeIdentifier,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): QualifiedTypeIdentifier = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], qualification = qualification.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[QualifiedTypeIdentifier]
  }
}

@JSImport("@babel/types", "qualifiedTypeIdentifier")
@js.native
object qualifiedTypeIdentifier extends js.Object {
  def apply(id: Identifier, qualification: Identifier): QualifiedTypeIdentifier = js.native
  def apply(id: Identifier, qualification: QualifiedTypeIdentifier): QualifiedTypeIdentifier = js.native
}

