package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportDeclaration extends BaseNode {
  var importKind: atBabelTypesLib.atBabelTypesLibStrings.`type` | atBabelTypesLib.atBabelTypesLibStrings.typeof | atBabelTypesLib.atBabelTypesLibStrings.value | scala.Null
  var source: StringLiteral
  var specifiers: js.Array[ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier]
  @JSName("type")
  var type_ImportDeclaration: atBabelTypesLib.atBabelTypesLibStrings.ImportDeclaration
}

