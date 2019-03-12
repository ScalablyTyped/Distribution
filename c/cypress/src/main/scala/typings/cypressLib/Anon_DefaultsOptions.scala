package typings
package cypressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultsOptions extends js.Object {
  def defaults(options: stdLib.Partial[cypressLib.CypressNs.ScreenshotDefaultsOptions]): scala.Unit
}

object Anon_DefaultsOptions {
  @scala.inline
  def apply(defaults: stdLib.Partial[cypressLib.CypressNs.ScreenshotDefaultsOptions] => scala.Unit): Anon_DefaultsOptions = {
    val __obj = js.Dynamic.literal(defaults = js.Any.fromFunction1(defaults))
  
    __obj.asInstanceOf[Anon_DefaultsOptions]
  }
}

