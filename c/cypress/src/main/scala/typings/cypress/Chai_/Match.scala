package typings.cypress.Chai_

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Match extends js.Object {
  def apply(regexp: RegExp): Assertion = js.native
  def apply(regexp: RegExp, message: String): Assertion = js.native
  def apply(selector: String): Assertion = js.native
}

