package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogicalExpression extends Node {
  var left: Expression
  var operator: babelDashTypesLib.babelDashTypesLibStrings.`||` | babelDashTypesLib.babelDashTypesLibStrings.`&&`
  var right: Expression
  @JSName("type")
  var type_LogicalExpression: babelDashTypesLib.babelDashTypesLibStrings.LogicalExpression
}

