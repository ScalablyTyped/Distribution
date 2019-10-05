package typings.atBabelTypes.atBabelTypesMod

import typings.atBabelTypes.atBabelTypesStrings.script
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "program")
@js.native
object program_script extends js.Object {
  def apply(body: js.Array[Statement], directives: js.Array[Directive], sourceType: script): Program = js.native
  def apply(
    body: js.Array[Statement],
    directives: js.Array[Directive],
    sourceType: script,
    interpreter: Null,
    sourceFile: String
  ): Program = js.native
  def apply(
    body: js.Array[Statement],
    directives: js.Array[Directive],
    sourceType: script,
    interpreter: InterpreterDirective
  ): Program = js.native
  def apply(
    body: js.Array[Statement],
    directives: js.Array[Directive],
    sourceType: script,
    interpreter: InterpreterDirective,
    sourceFile: String
  ): Program = js.native
}

