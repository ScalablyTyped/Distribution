package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogicalExpression extends BaseNode {
  var left: Expression
  var operator: atBabelTypesLib.atBabelTypesLibStrings.`||` | atBabelTypesLib.atBabelTypesLibStrings.`&&` | atBabelTypesLib.atBabelTypesLibStrings.`??`
  var right: Expression
  @JSName("type")
  var type_LogicalExpression: atBabelTypesLib.atBabelTypesLibStrings.LogicalExpression
}

