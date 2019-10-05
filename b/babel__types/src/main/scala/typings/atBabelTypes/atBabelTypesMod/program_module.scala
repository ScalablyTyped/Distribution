package typings.atBabelTypes.atBabelTypesMod

import typings.atBabelTypes.atBabelTypesStrings.module
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "program")
@js.native
object program_module extends js.Object {
  def apply(body: js.Array[Statement], directives: js.Array[Directive], sourceType: module): Program = js.native
  def apply(
    body: js.Array[Statement],
    directives: js.Array[Directive],
    sourceType: module,
    interpreter: Null,
    sourceFile: String
  ): Program = js.native
  def apply(
    body: js.Array[Statement],
    directives: js.Array[Directive],
    sourceType: module,
    interpreter: InterpreterDirective
  ): Program = js.native
  def apply(
    body: js.Array[Statement],
    directives: js.Array[Directive],
    sourceType: module,
    interpreter: InterpreterDirective,
    sourceFile: String
  ): Program = js.native
}

