package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.script
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "program")
@js.native
object program_script extends js.Object {
  def apply(body: js.Array[Statement], directives: js.UndefOr[scala.Nothing], sourceType: script): Program_ = js.native
  def apply(
    body: js.Array[Statement],
    directives: js.UndefOr[scala.Nothing],
    sourceType: script,
    interpreter: InterpreterDirective_
  ): Program_ = js.native
  def apply(body: js.Array[Statement], directives: js.Array[Directive_], sourceType: script): Program_ = js.native
  def apply(
    body: js.Array[Statement],
    directives: js.Array[Directive_],
    sourceType: script,
    interpreter: InterpreterDirective_
  ): Program_ = js.native
}

