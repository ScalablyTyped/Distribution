package typings.cypress

import typings.cypress.Cypress.CookieDefaults
import typings.cypress.Cypress.DebugOptions
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Debug extends js.Object {
  def debug(enabled: Boolean): Unit = js.native
  def debug(enabled: Boolean, options: Partial[DebugOptions]): Unit = js.native
  def defaults(options: Partial[CookieDefaults]): Unit = js.native
  def preserveOnce(names: String*): Unit = js.native
}

