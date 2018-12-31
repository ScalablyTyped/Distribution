package typings
package atBabelTypesLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForStatement extends BaseNode {
  var body: Statement
  var init: VariableDeclaration | Expression | scala.Null
  var test: Expression | scala.Null
  @JSName("type")
  var type_ForStatement: atBabelTypesLib.atBabelTypesLibStrings.ForStatement
  var update: Expression | scala.Null
}

