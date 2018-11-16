package typings
package atBabelTypesLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UnaryExpression extends BaseNode {
  var argument: Expression
  var operator: atBabelTypesLib.atBabelTypesLibStrings.void | atBabelTypesLib.atBabelTypesLibStrings.`throw` | atBabelTypesLib.atBabelTypesLibStrings.delete | atBabelTypesLib.atBabelTypesLibStrings.`!` | atBabelTypesLib.atBabelTypesLibStrings.`+` | atBabelTypesLib.atBabelTypesLibStrings.`-` | atBabelTypesLib.atBabelTypesLibStrings.`~` | atBabelTypesLib.atBabelTypesLibStrings.typeof
  var prefix: scala.Boolean
  @JSName("type")
  var type_UnaryExpression: atBabelTypesLib.atBabelTypesLibStrings.UnaryExpression
}

