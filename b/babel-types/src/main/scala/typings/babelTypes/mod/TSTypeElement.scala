package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.TSCallSignatureDeclaration
  - typings.babelTypes.mod.TSConstructSignatureDeclaration
  - typings.babelTypes.mod.TSIndexSignature
  - typings.babelTypes.mod.TSMethodSignature
  - typings.babelTypes.mod.TSPropertySignature
*/
trait TSTypeElement extends js.Object

object TSTypeElement {
  @scala.inline
  def TSIndexSignature(
    end: Double,
    loc: SourceLocation,
    parameters: js.Array[Identifier_],
    start: Double,
    `type`: typings.babelTypes.babelTypesStrings.TSIndexSignature
  ): TSTypeElement = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeElement]
  }
  @scala.inline
  def TSConstructSignatureDeclaration(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelTypes.babelTypesStrings.TSConstructSignatureDeclaration
  ): TSTypeElement = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeElement]
  }
  @scala.inline
  def TSPropertySignature(
    end: Double,
    key: Expression,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelTypes.babelTypesStrings.TSPropertySignature
  ): TSTypeElement = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeElement]
  }
  @scala.inline
  def TSCallSignatureDeclaration(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelTypes.babelTypesStrings.TSCallSignatureDeclaration
  ): TSTypeElement = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeElement]
  }
  @scala.inline
  def TSMethodSignature(
    end: Double,
    key: Expression,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelTypes.babelTypesStrings.TSMethodSignature
  ): TSTypeElement = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeElement]
  }
}

