package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForStatement extends Node {
  var body: Statement
  var init: VariableDeclaration | Expression
  var test: Expression
  @JSName("type")
  var type_ForStatement: babelDashTypesLib.babelDashTypesLibStrings.ForStatement
  var update: Expression
}

