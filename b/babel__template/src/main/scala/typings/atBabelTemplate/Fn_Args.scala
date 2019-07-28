package typings.atBabelTemplate

import typings.atBabelTemplate.atBabelTemplateMod.TemplateBuilderOptions
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Args[T] extends js.Object {
  def apply(tpl: String): T = js.native
  def apply(tpl: String, opts: TemplateBuilderOptions): T = js.native
  def apply(tpl: TemplateStringsArray, args: js.Any*): T = js.native
}

