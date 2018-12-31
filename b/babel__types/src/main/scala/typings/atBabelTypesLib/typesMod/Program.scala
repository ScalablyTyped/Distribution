package typings
package atBabelTypesLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Program extends BaseNode {
  var body: js.Array[Statement]
  var directives: js.Array[Directive]
  var interpreter: InterpreterDirective | scala.Null
  var sourceFile: java.lang.String | scala.Null
  var sourceType: atBabelTypesLib.atBabelTypesLibStrings.script | atBabelTypesLib.atBabelTypesLibStrings.module
  @JSName("type")
  var type_Program: atBabelTypesLib.atBabelTypesLibStrings.Program
}

