package typings.deindent

import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("deindent", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(input: String): String = js.native
  def apply(tagFn: js.Function2[/* template */ TemplateStringsArray, /* repeated */ js.Any, String]): js.Function2[/* template */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
  def apply(template: TemplateStringsArray, substitutions: js.Any*): String = js.native
}

