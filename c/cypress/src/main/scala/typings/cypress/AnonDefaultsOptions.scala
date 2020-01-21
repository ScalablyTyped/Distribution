package typings.cypress

import typings.cypress.cypressMod.Cypress.ScreenshotDefaultsOptions
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultsOptions extends js.Object {
  def defaults(options: Partial[ScreenshotDefaultsOptions]): Unit
}

object AnonDefaultsOptions {
  @scala.inline
  def apply(defaults: Partial[ScreenshotDefaultsOptions] => Unit): AnonDefaultsOptions = {
    val __obj = js.Dynamic.literal(defaults = js.Any.fromFunction1(defaults))
  
    __obj.asInstanceOf[AnonDefaultsOptions]
  }
}

