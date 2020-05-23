package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ExportDefaultSpecifier
import typings.babelTypes.babelTypesStrings.ExportNamespaceSpecifier
import typings.babelTypes.babelTypesStrings.ExportSpecifier
import typings.babelTypes.babelTypesStrings.ImportDefaultSpecifier
import typings.babelTypes.babelTypesStrings.ImportNamespaceSpecifier
import typings.babelTypes.babelTypesStrings.ImportSpecifier
import typings.babelTypes.babelTypesStrings.`type`
import typings.babelTypes.babelTypesStrings.typeof
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.ExportSpecifier_
  - typings.babelTypes.mod.ImportDefaultSpecifier_
  - typings.babelTypes.mod.ImportNamespaceSpecifier_
  - typings.babelTypes.mod.ImportSpecifier_
  - typings.babelTypes.mod.ExportDefaultSpecifier_
  - typings.babelTypes.mod.ExportNamespaceSpecifier_
*/
trait ModuleSpecifier extends _Node

object ModuleSpecifier {
  @scala.inline
  def ExportNamespaceSpecifier_(
    exported: Identifier_,
    `type`: ExportNamespaceSpecifier,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): ModuleSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSpecifier]
  }
  @scala.inline
  def ImportSpecifier_(
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
  ): ModuleSpecifier = {
    val __obj = js.Dynamic.literal(imported = imported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], importKind = importKind.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSpecifier]
  }
  @scala.inline
  def ImportDefaultSpecifier_(
    local: Identifier_,
    `type`: ImportDefaultSpecifier,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): ModuleSpecifier = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSpecifier]
  }
  @scala.inline
  def ImportNamespaceSpecifier_(
    local: Identifier_,
    `type`: ImportNamespaceSpecifier,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): ModuleSpecifier = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSpecifier]
  }
  @scala.inline
  def ExportSpecifier_(
    exported: Identifier_,
    local: Identifier_,
    `type`: ExportSpecifier,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): ModuleSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSpecifier]
  }
  @scala.inline
  def ExportDefaultSpecifier_(
    exported: Identifier_,
    `type`: ExportDefaultSpecifier,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): ModuleSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSpecifier]
  }
}

