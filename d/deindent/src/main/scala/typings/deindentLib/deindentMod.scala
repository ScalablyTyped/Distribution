package typings
package deindentLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("deindent", JSImport.Namespace)
@js.native
object deindentMod extends js.Object {
  def apply(input: java.lang.String): java.lang.String = js.native
  def apply(
    tagFn: js.Function2[/* template */ stdLib.TemplateStringsArray, /* repeated */ js.Any, java.lang.String]
  ): js.Function2[/* template */ stdLib.TemplateStringsArray, /* repeated */ js.Any, java.lang.String] = js.native
  def apply(template: stdLib.TemplateStringsArray, substitutions: js.Any*): java.lang.String = js.native
}

