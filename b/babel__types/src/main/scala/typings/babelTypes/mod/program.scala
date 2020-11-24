package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@babel/types", "program")
@js.native
object program extends js.Object {
  
  def apply(body: js.Array[Statement]): Program_ = js.native
  def apply(
    body: js.Array[Statement],
    directives: js.UndefOr[scala.Nothing],
    sourceType: js.UndefOr[scala.Nothing],
    interpreter: InterpreterDirective_
  ): Program_ = js.native
  def apply(body: js.Array[Statement], directives: js.Array[Directive_]): Program_ = js.native
  def apply(
    body: js.Array[Statement],
    directives: js.Array[Directive_],
    sourceType: js.UndefOr[scala.Nothing],
    interpreter: InterpreterDirective_
  ): Program_ = js.native
}
