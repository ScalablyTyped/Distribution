package typings
package cypressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Defaults extends js.Object {
  def defaults(options: stdLib.Partial[cypressLib.CypressNs.ServerOptions]): scala.Unit
}

object Anon_Defaults {
  @scala.inline
  def apply(defaults: stdLib.Partial[cypressLib.CypressNs.ServerOptions] => scala.Unit): Anon_Defaults = {
    val __obj = js.Dynamic.literal(defaults = js.Any.fromFunction1(defaults))
  
    __obj.asInstanceOf[Anon_Defaults]
  }
}

