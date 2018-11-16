package typings
package atBabelTypesLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait VariableDeclaration extends BaseNode {
  var declarations: js.Array[VariableDeclarator]
  var declare: scala.Boolean | scala.Null
  var kind: atBabelTypesLib.atBabelTypesLibStrings.`var` | atBabelTypesLib.atBabelTypesLibStrings.let | atBabelTypesLib.atBabelTypesLibStrings.const
  @JSName("type")
  var type_VariableDeclaration: atBabelTypesLib.atBabelTypesLibStrings.VariableDeclaration
}

