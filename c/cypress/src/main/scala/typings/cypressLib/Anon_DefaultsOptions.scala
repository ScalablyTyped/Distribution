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
  def apply(defaults: js.Function1[stdLib.Partial[cypressLib.CypressNs.ScreenshotDefaultsOptions], scala.Unit]): Anon_DefaultsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaults")(defaults)
    __obj.asInstanceOf[Anon_DefaultsOptions]
  }
}

