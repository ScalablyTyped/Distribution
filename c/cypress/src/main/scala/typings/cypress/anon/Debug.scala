package typings.cypress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Debug extends js.Object {
  def debug(enabled: Boolean): Unit = js.native
  def debug(enabled: Boolean, options: PartialDebugOptions): Unit = js.native
  def defaults(options: PartialCookieDefaults): Unit = js.native
  def preserveOnce(names: String*): Unit = js.native
}

