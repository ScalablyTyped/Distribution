package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-types", "program")
@js.native
object program extends js.Object {
  def apply(): Program_ = js.native
  def apply(body: js.Array[Statement | ModuleDeclaration]): Program_ = js.native
  def apply(body: js.Array[Statement | ModuleDeclaration], directives: js.Array[Directive_]): Program_ = js.native
}

