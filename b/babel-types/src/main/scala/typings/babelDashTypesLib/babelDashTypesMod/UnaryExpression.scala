package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnaryExpression extends Node {
  var argument: Expression
  var operator: babelDashTypesLib.babelDashTypesLibStrings.`-` | babelDashTypesLib.babelDashTypesLibStrings.`+` | babelDashTypesLib.babelDashTypesLibStrings.`!` | babelDashTypesLib.babelDashTypesLibStrings.`~` | babelDashTypesLib.babelDashTypesLibStrings.typeof | babelDashTypesLib.babelDashTypesLibStrings.void | babelDashTypesLib.babelDashTypesLibStrings.delete
  var prefix: scala.Boolean
  @JSName("type")
  var type_UnaryExpression: babelDashTypesLib.babelDashTypesLibStrings.UnaryExpression
}

