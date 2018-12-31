package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableDeclaration extends Node {
  var declarations: js.Array[VariableDeclarator]
  var kind: babelDashTypesLib.babelDashTypesLibStrings.`var` | babelDashTypesLib.babelDashTypesLibStrings.let | babelDashTypesLib.babelDashTypesLibStrings.const
  @JSName("type")
  var type_VariableDeclaration: babelDashTypesLib.babelDashTypesLibStrings.VariableDeclaration
}

