package typings.atBabelTemplate

import typings.atBabelTemplate.atBabelTemplateMod.TemplateBuilderOptions
import typings.atBabelTypes.atBabelTypesMod.Statement
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Args extends js.Object {
  def apply(tpl: String): Statement | js.Array[Statement] = js.native
  def apply(tpl: String, opts: TemplateBuilderOptions): Statement | js.Array[Statement] = js.native
  def apply(tpl: TemplateStringsArray, args: js.Any*): Statement | js.Array[Statement] = js.native
}

