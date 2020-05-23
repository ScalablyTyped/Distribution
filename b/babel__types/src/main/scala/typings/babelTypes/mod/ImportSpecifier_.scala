package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ImportSpecifier
import typings.babelTypes.babelTypesStrings.`type`
import typings.babelTypes.babelTypesStrings.typeof
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait ImportSpecifier_
  extends ModuleSpecifier
     with BaseNode {
  var importKind: `type` | typeof | Null
  var imported: Identifier_
  var local: Identifier_
  @JSName("type")
  var type_ImportSpecifier_ : ImportSpecifier
}

object ImportSpecifier_ {
  @scala.inline
  def apply(
    imported: Identifier_,
    local: Identifier_,
    `type`: ImportSpecifier,
    end: Double = null.asInstanceOf[Double],
    importKind: `type` | typeof = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): ImportSpecifier_ = {
    val __obj = js.Dynamic.literal(imported = imported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], importKind = importKind.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportSpecifier_]
  }
}

