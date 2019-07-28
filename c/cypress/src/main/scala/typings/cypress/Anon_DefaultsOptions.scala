package typings.cypress

import typings.cypress.CypressNs.ScreenshotDefaultsOptions
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultsOptions extends js.Object {
  def defaults(options: Partial[ScreenshotDefaultsOptions]): Unit
}

object Anon_DefaultsOptions {
  @scala.inline
  def apply(defaults: Partial[ScreenshotDefaultsOptions] => Unit): Anon_DefaultsOptions = {
    val __obj = js.Dynamic.literal(defaults = js.Any.fromFunction1(defaults))
  
    __obj.asInstanceOf[Anon_DefaultsOptions]
  }
}

